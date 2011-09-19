/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.smodel;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.generator.ModelDigestUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.refactoring.StructureModificationLog;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.descriptor.source.ModelDataSource;
import jetbrains.mps.smodel.descriptor.source.RegularModelDataSource;
import jetbrains.mps.smodel.event.*;
import jetbrains.mps.smodel.persistence.def.DescriptorLoadResult;
import jetbrains.mps.vcs.VcsMigrationUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class DefaultSModelDescriptor extends BaseSModelDescriptorWithSource implements EditableSModelDescriptor {
  private static final Logger LOG = Logger.getLogger(DefaultSModelDescriptor.class);

  private Map<String, String> myMetadata;
  private SModelHeader myHeader;

  private final Object myRefactoringHistoryLock = new Object();
  private StructureModificationLog myStructureModificationLog;

  private long myLastChange;

  private boolean myChanged = false;

  private final Object myFullLoadSync = new Object();
  private IModule myModule;

  {
    this.addModelCommandListener(new SModelCommandListener() {
      public void eventsHappenedInCommand(List<SModelEvent> events) {
        if (EventUtil.isChange(events)) {
          myLastChange = System.currentTimeMillis();
        }
      }
    });
  }

  @Deprecated //todo remove
  public DefaultSModelDescriptor(IModule module, IFile modelFile, SModelReference modelReference) {
    this(module,new RegularModelDataSource(modelFile), modelReference, new DescriptorLoadResult(), true);
  }

  public DefaultSModelDescriptor(IModule module, ModelDataSource source, SModelReference modelReference, DescriptorLoadResult d) {
    this(module,source, modelReference, d, true);
  }

  protected DefaultSModelDescriptor(IModule module, ModelDataSource source, SModelReference modelReference, DescriptorLoadResult d, boolean checkDup) {
    super(modelReference, source, checkDup);
    myModule = module;
    myHeader = d.getHeader();
    myMetadata = d.getMetadata();
  }

  protected ModelLoadResult initialLoad() {
    ModelLoadResult result = load(ModelLoadingState.ROOTS_LOADED);
    tryFixingVersion(result.getModel().getSModelHeader());
    updateDiskTimestamp();
    return result;
  }

  //updates model with loading state == ROOTS_LOADED
  public void enforceFullLoad() {
    synchronized (myFullLoadSync) {
      if (mySModel.isLoading()) return;
      if (getLoadingState() == ModelLoadingState.FULLY_LOADED) return;

      runModelLoading(
        new Computable<ModelLoadResult>() {
          public ModelLoadResult compute() {
            SModel fullModel = load(ModelLoadingState.FULLY_LOADED).getModel();
            updateDiskTimestamp();
            fullModel.setLoading(true);

            try {
              mySModel.setLoading(true);
              new ModelLoader(mySModel, fullModel).update();
              setLoadingState(ModelLoadingState.FULLY_LOADED);
              fireModelStateChanged(ModelLoadingState.ROOTS_LOADED, ModelLoadingState.FULLY_LOADED);
            } finally {
              mySModel.setLoading(false);
            }

            return null;
          }
        }
      );
    }
  }

  public boolean isReadOnly() {
    return getSource().isReadOnly();
  }

  //just loads model, w/o changing state of SModelDescriptor
  private ModelLoadResult load(ModelLoadingState loadingState) {
    return getSource().loadSModel(myModule, this, loadingState);
  }

  public boolean isChanged() {
    return myChanged;
  }

  public void setChanged(boolean changed) {
    myChanged = changed;
  }

  public int getPersistenceVersion() {
    return getSModelHeader().getPersistenceVersion();
  }

  @NotNull
  public RegularModelDataSource getSource() {
    return ((RegularModelDataSource) super.getSource());
  }

  @NotNull
  public StructureModificationLog getStructureModificationLog() {
    synchronized (myRefactoringHistoryLock) {
      if (myStructureModificationLog == null) {
        myStructureModificationLog = getSource().loadModelRefactorings(this);
      }
      if (myStructureModificationLog == null) {
        myStructureModificationLog = new StructureModificationLog();
      }
    }
    return myStructureModificationLog;
  }

  public void saveStructureModificationLog(@NotNull StructureModificationLog log) {
    myStructureModificationLog = log;
    getSource().saveModelRefactorings(this, log);
  }

  public void save() {
    ModelAccess.assertLegalWrite();

    if (getLoadingState() == ModelLoadingState.NOT_LOADED) return;

    //we must be in command since model save might change model by adding model/language imports
    //if (!mySModel.isLoading()) LOG.assertInCommand();

    LOG.info("Saving model " + mySModel.getSModelFqName());

    if (!checkAndResolveConflictOnSave()) return;

    setChanged(false);
    boolean reload = getSource().saveModel(this);
    if (reload) {
      ModelLoadResult res = getSource().loadSModel(myModule, this, getLoadingState());
      updateDiskTimestamp();
      replaceModel(res.getModel(), res.getState());
    }

    updateDiskTimestamp();

    fireModelSaved();
  }

  public boolean isGeneratable() {
    return !isDoNotGenerate() && !isReadOnly() && SModelStereotype.isUserModel(this);
  }

  @Override
  public void replaceModel(SModel newModel, ModelLoadingState state) {
    if (newModel == mySModel) return;
    myStructureModificationLog = null;
    setChanged(false);
    super.replaceModel(newModel, state);
  }

  public String getModelHash() {
    return getSource().getModelHash();
  }

  public void dispose() {
    UnregisteredNodes.instance().clear(getSModelReference());
    super.dispose();
  }

  public void setDoNotGenerate(boolean value) {
    ModelAccess.assertLegalWrite();

    getSModelHeader().setDoNotGenerate(value);
  }

  public long lastChangeTime() {
    return Math.max(myLastChange, getSourceTimestamp());
  }

  public boolean isDoNotGenerate() {
    return getSModelHeader().isDoNotGenerate();
  }

  public int getVersion() {
    return getSModelHeader().getVersion();
  }

  public void setVersion(int newVersion) {
    ModelAccess.assertLegalWrite();

    getSModelHeader().setVersion(newVersion);
  }

  public String getAttribute(String key) {
    return myMetadata.get(key);
  }

  public void setAttribute(String key, String value) {
    ModelAccess.assertLegalWrite();

    if (value == null) {
      myMetadata.remove(key);
    } else {
      myMetadata.put(key, value);
    }
  }

  public SModelHeader getDescriptorSModelHeader() {
    return myHeader;
  }

  public SModelHeader getSModelHeader() {
    SModel model = mySModel;
    if (model != null) {
      return model.getSModelHeader();
    }
    return myHeader;
  }

  public Map<String, String> getMetaData() {
    return Collections.unmodifiableMap(myMetadata);
  }

  protected void checkModelDuplication() {
    SModelDescriptor anotherModel = SModelRepository.getInstance().getModelDescriptor(myModelReference);
    if (anotherModel != null) {
      String message = "Model already registered: " + myModelReference + "\n";
      message += "source = " + getSource() + "\n";

      if (anotherModel instanceof BaseSModelDescriptorWithSource) {
        message += "another model's source = " + ((BaseSModelDescriptorWithSource) anotherModel).getSource();
      } else {
        message += "another model is non-editable";
      }
      LOG.error(message);
    }
  }

  public IFile getModelFile() {
    return getSource().getFile();
  }

  public void changeModelFile(IFile newModelFile) {
    ModelAccess.assertLegalWrite();
    if (getModelFile().getPath().equals(newModelFile.getPath())) return;

    IFile oldFile = getSource().getFile();
    SModel model = getSModel();
    fireBeforeModelFileChanged(new SModelFileChangedEvent(model, oldFile, newModelFile));
    getSource().setFile(newModelFile);
    updateDiskTimestamp();
    fireModelFileChanged(new SModelFileChangedEvent(model, oldFile, newModelFile));
  }

  private long fileTimestamp() {
    IFile file = getModelFile();
    if (file == null || !file.exists()) return -1;
    return file.lastModified();
  }

  private void tryFixingVersion(SModelHeader header) {
    if (getVersion() != -1) return;

    int latestVersion = getStructureModificationLog().getLatestVersion(getSModelReference());
    myStructureModificationLog = null;  // we don't need to keep log in memory
    if (latestVersion != -1) {
      header.setVersion(latestVersion);
      LOG.error("Version for model " + getSModelReference().getSModelFqName() + " was not set.");
    }
  }

  public void reloadFromDisk() {
    ModelAccess.assertLegalWrite();

    if (getSource().hasModel(this)) {
      SModelRepository.getInstance().deleteModel(this);
      return;
    }

    reload();
    LOG.assertLog(!needsReloading());
  }
  
  protected void reload() {
    DescriptorLoadResult dr = getSource().loadDescriptor(getModule(), getSModelReference().getSModelFqName());
    myHeader = dr.getHeader();
    myMetadata = dr.getMetadata();

    if (getLoadingState() == ModelLoadingState.NOT_LOADED) return;

    ModelLoadResult result = load(getLoadingState());
    updateDiskTimestamp();
    replaceModel(result.getModel(), getLoadingState());
  }
  
  public boolean checkAndResolveConflictOnSave() {
    if (needsReloading()) {
      LOG.warning("Model file " + getSModel().getSModelFqName() + " was modified externally!\n" +
        "You might want to turn \"Synchronize files on frame activation/deactivation\" option on to avoid conflicts.");
      resolveDiskConflict();
      return false;
    }

    // Paranoid check to avoid saving model during update (hack for MPS-6772)
    if (needsReloading()) return false;
    return true;
  }
  
  public void resolveDiskConflict() {
    ApplicationManager.getApplication().invokeLater(new Runnable() {
      public void run() {
        final boolean needSave = VcsMigrationUtil.getHandler().resolveDiskMemoryConflict(getModelFile(), getSModel());
        if (needSave) {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              updateDiskTimestamp();
              save();
            }
          });
        } else {
          ModelAccess.instance().runWriteAction(new Runnable() {
            public void run() {
              reloadFromDisk();
            }
          });
        }
      }
    }, ModalityState.NON_MODAL);
  }
  
  public String toString() {
    return getSModelReference().toString();
  }

  public void rename(SModelFqName newModelFqName, boolean changeFile) {
    ModelAccess.assertLegalWrite();

    SModelFqName oldFqName = getSModelReference().getSModelFqName();
    SModel model = getSModel();
    fireBeforeModelRenamed(new SModelRenamedEvent(model, oldFqName, newModelFqName));

    SModelReference newModelReference = new SModelReference(newModelFqName, myModelReference.getSModelId());
    model.changeModelReference(newModelReference);
    getSource().rename(this, newModelFqName, changeFile);
    myModelReference = newModelReference;

    fireModelRenamed(new SModelRenamedEvent(model, oldFqName, newModelFqName));
  }
}
