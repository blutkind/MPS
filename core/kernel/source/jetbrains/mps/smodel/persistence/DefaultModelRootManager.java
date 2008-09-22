package jetbrains.mps.smodel.persistence;

import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.SModelRoot;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.smodel.persistence.def.ModelFileReadException;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.vcs.ApplicationLevelVcsManager;
import jetbrains.mps.vcs.SuspiciousModelIndex;
import jetbrains.mps.vcs.MPSVCSManager;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.MPSExtentions;
import jetbrains.mps.watching.ModelChangesWatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

import com.intellij.openapi.project.ex.ProjectManagerEx;
import com.intellij.openapi.project.Project;

/**
 * @author Kostik
 */
public class DefaultModelRootManager extends AbstractModelRootManager {
  private static final Logger LOG = Logger.getLogger(DefaultModelRootManager.class);

  @NotNull
  public Set<SModelDescriptor> read(@NotNull SModelRoot root, @NotNull IModule owner) {
    Set<SModelDescriptor> result = new HashSet<SModelDescriptor>();
    readModelDescriptors(result, FileSystem.getFile(root.getPath()), root, owner);
    return result;
  }

  @NotNull
  public SModel loadModel(final @NotNull SModelDescriptor modelDescriptor) {

    if (!modelDescriptor.getModelFile().isReadOnly()) {
      final File file = FileSystem.toFile(modelDescriptor.getModelFile());

      if (!file.exists()) {
        return new SModel(modelDescriptor.getModelUID());
      }
    }

    if (ApplicationLevelVcsManager.instance().isInConflict(modelDescriptor, modelDescriptor.needsReloading())) {
      return handleExceptionDuringModelRead(modelDescriptor, new ConflictModelException(modelDescriptor));
    }

    SModel model;
    try {
      model = ModelPersistence.readModel(modelDescriptor.getModelFile());
    } catch (ModelFileReadException t) {
      return handleExceptionDuringModelRead(modelDescriptor, t);
    }

    if (model.getUID().getSModelId() == null) {
      model.changeModelUID(modelDescriptor.getModelUID());
      ModelPersistence.saveModel(model, modelDescriptor.getModelFile());
    }

    LOG.assertLog(model.getUID().equals(modelDescriptor.getModelUID()),
      "\nError loading model from file: \"" + modelDescriptor.getModelFile() + "\"\n" +
        "expected model UID     : \"" + modelDescriptor.getModelUID() + "\"\n" +
        "but was UID            : \"" + model.getUID() + "\"\n" +
        "the model will not be available.\n" +
        "Make sure that all project's roots and/or the model namespace is correct");
    return model;
  }

  private SModel handleExceptionDuringModelRead(SModelDescriptor modelDescriptor, RuntimeException exception) {
    SuspiciousModelIndex.instance().addModel(modelDescriptor);
    if (modelDescriptor.isInitialized()) {
      SModel newModel = new SModel(modelDescriptor.getModelUID());
      LOG.error(exception.getMessage(), newModel);
      return newModel;
    }
    throw exception;
  }

  public boolean containsSomeString(@NotNull SModelDescriptor modelDescriptor, @NotNull Set<String> strings) {
    if (SModelRepository.getInstance().isChanged(modelDescriptor)) return true;
    if (modelDescriptor.getModelFile() == null || !modelDescriptor.getModelFile().exists()) return true;
    BufferedReader r = null;
    try {
      r = new BufferedReader(modelDescriptor.getModelFile().openReader());
      String line;
      boolean result = false;
      while ((line = r.readLine()) != null) {
        for (String s : strings) {
          if (line.contains(s)) {
            result = true;
            break;
          }
        }
      }
      return result;
    } catch (IOException e) {
      LOG.error(e);
    } finally {
      if (r != null) {
        try {
          r.close();
        } catch (IOException e) {
          LOG.error(e);
        }
      }
    }
    return true;
  }

  public boolean isEmpty(SModelDescriptor modelDescriptor) {
    if (modelDescriptor.isInitialized()) {
      return modelDescriptor.getSModel().getRoots().isEmpty();
    }
    IFile modelFile = modelDescriptor.getModelFile();
    if (!modelFile.exists()) {
      return true;
    }
    Reader reader = null;
    try {
      reader = modelFile.openReader();
      BufferedReader r = new BufferedReader(reader);
      String line;
      while ((line = r.readLine()) != null) {
        if (line.contains("<node")) {
          return false;
        }
      }
    } catch (IOException e) {
      LOG.error(e);
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          LOG.error(e);
        }
      }
    }
    return true;
  }

  public boolean containsString(@NotNull SModelDescriptor modelDescriptor, @NotNull String string) {
    return containsSomeString(modelDescriptor, CollectionUtil.asSet(string));
  }


  public void saveModel(@NotNull SModelDescriptor modelDescriptor) {
    ModelPersistence.saveModel(modelDescriptor.getSModel(), modelDescriptor.getModelFile());
  }

  private void readModelDescriptors(Set<SModelDescriptor> modelDescriptors, IFile dir, SModelRoot modelRoot, ModelOwner owner) {
    if (dir.getName().endsWith(".svn")) return;
    if (!dir.isDirectory()) return;

    List<IFile> files = dir.list();
    for (IFile file : files) {
      String fileName = file.getName();
      boolean isMPSModel = fileName.endsWith(MPSExtentions.DOT_MODEL);
      boolean isMPSStub = fileName.endsWith(MPSExtentions.DOT_STUB);
      if (!(isMPSModel || isMPSStub)) continue;
      SModelReference modelReference = PathManager.getModelUID(file, FileSystem.getFile(modelRoot.getPath()), modelRoot.getPrefix());

      if (modelReference.getSModelId() == null) {
        modelReference = new SModelReference(modelReference.getSModelFqName(), SModelId.generate());
      }

      SModelDescriptor modelDescriptor;
      if (ModelPersistence.needsRecreating(file)) {
        modelDescriptor = recreateFileAndGetInstance(this, isMPSStub, file.getAbsolutePath(), modelReference, owner, modelRoot);
        LOG.debug("I've recreated file and read model descriptor" + modelDescriptor.getModelUID() + "\n" + "Model root is " + modelRoot.getPath() + " " + modelRoot.getPrefix());
      } else {
        modelDescriptor = getInstance(this, isMPSStub, file.getAbsolutePath(), modelReference, owner, false);
        LOG.debug("I've read model descriptor " + modelDescriptor.getModelUID() + "\n" + "Model root is " + modelRoot.getPath() + " " + modelRoot.getPrefix());
      }
      modelDescriptors.add(modelDescriptor);
    }
    for (IFile childDir : files) {
      if (childDir.isDirectory()) {
        readModelDescriptors(modelDescriptors, childDir, modelRoot, owner);
      }
    }
  }

  public boolean isNewModelsSupported() {
    return true;
  }

  @NotNull
  public SModelDescriptor createNewModel(@NotNull SModelRoot root, @NotNull SModelFqName fqName, @NotNull ModelOwner owner) {
    if (root.getPrefix().length() > 0 && !fqName.getLongName().startsWith(root.getPrefix())) {
      throw new IllegalArgumentException();
    }

    IFile modelFile = createFileForModelUID(root, fqName);
    SModelDescriptor result = DefaultModelRootManager.createModel(this, modelFile.getCanonicalPath(), fqName, owner);

    return result;
  }

  private IFile createFileForModelUID(SModelRoot root, SModelFqName fqName) {
    String pathPrefix = root.getPrefix();
    String path = root.getPath();

    if (pathPrefix == null) pathPrefix = "";
    if (pathPrefix.length() > 0 && !fqName.getLongName().startsWith(pathPrefix)) {
      LOG.error("Model fqName \"" + fqName + "\" doesn't match name prefix \"" + pathPrefix + "\"");
    }

    String filenameSuffix = fqName.getLongName().substring(pathPrefix.length());
    if (fqName.hasStereotype()) {
      filenameSuffix = filenameSuffix + '@' + fqName.getStereotype();
    }

    IFile modelFile = FileSystem.getFile(path + File.separator + filenameSuffix.replace('.', File.separatorChar) + MPSExtentions.DOT_MODEL);
    return modelFile;
  }

  private SModelDescriptor recreateFileAndGetInstance(IModelRootManager manager, boolean createStub, String fileName, SModelReference modelReference, ModelOwner owner, SModelRoot root) {
    SModelRepository modelRepository = SModelRepository.getInstance();
    if (createStub) {
      return getInstance(manager, createStub, fileName, modelReference, owner, false);
    }
    SModelDescriptor modelDescriptor = modelRepository.getModelDescriptor(modelReference);
    if (modelDescriptor != null) {
      LOG.error("can't recreate file for already loaded descriptor " + modelReference);
      return getInstance(manager, createStub, fileName, modelReference, owner, false);
    }
    IFile modelFile = FileSystem.getFile(fileName);
    SModelReference newModelReference = ModelPersistence.upgradeModelUID(modelReference);
    IFile newFile = createFileForModelUID(root, newModelReference.getSModelFqName());//ModelPersistence.upgradeFile(modelFile);
    newFile.createNewFile();
    FileUtil.copyFile(modelFile.toFile(), newFile.toFile());
    modelFile.delete();
    SModelDescriptor result = getInstance(manager, createStub, newFile.getAbsolutePath(), newModelReference, owner, true);
    Project[] projects = ProjectManagerEx.getInstance().getOpenProjects();

    if (projects.length == 0)  {
      MPSVCSManager.addFileLater(newFile.toFile());
      MPSVCSManager.removeFileLater(modelFile.toFile());
    } else {
      for (Project project : projects) {
        MPSVCSManager mpsvcsManager = MPSVCSManager.getInstance(project);
        if (mpsvcsManager != null) {
          mpsvcsManager.deleteFilesAndRemoveFromVcs(Collections.singletonList(modelFile.toFile()));
          mpsvcsManager.addFilesToVcs(Collections.singletonList(newFile.toFile()));
        }
      }
    }
    return result;
  }

  private static SModelDescriptor getInstance(IModelRootManager manager, boolean createStub, String fileName, SModelReference modelReference, ModelOwner owner, boolean fireModelCreated) {
    LOG.debug("Getting model " + modelReference + " from " + fileName + " with owner " + owner);

    SModelRepository modelRepository = SModelRepository.getInstance();
    SModelDescriptor modelDescriptor = modelRepository.getModelDescriptor(modelReference);
    if (modelDescriptor != null) {
      modelRepository.addOwnerForDescriptor(modelDescriptor, owner);
      return modelDescriptor;
    } else {
      IFile modelFile = FileSystem.getFile(fileName);
      if (createStub) {
        StubModelDescriptor stubModelDescriptor = new StubModelDescriptor(manager, modelFile, modelReference);
        stubModelDescriptor.readStub(modelFile);//todo what if no file exists?
        modelDescriptor = stubModelDescriptor;
      } else {
        modelDescriptor = new DefaultSModelDescriptor(manager, modelFile, modelReference);
      }
      if (fireModelCreated) {
        modelRepository.createNewModel(modelDescriptor, owner);
      } else {
        modelRepository.registerModelDescriptor(modelDescriptor, owner);
      }
      return modelDescriptor;
    }
  }

  private static SModelDescriptor createModel(IModelRootManager manager, String fileName, SModelFqName modelUID, ModelOwner owner) {
    LOG.debug("create model uid=\"" + modelUID + "\" file=\"" + fileName + "\" owner: " + owner);

    SModelRepository modelRepository = SModelRepository.getInstance();
    if (modelRepository.getModelDescriptor(modelUID) != null) {
      LOG.error("Couldn't create new model \"" + modelUID + "\" because such model exists");
    }

    SModelDescriptor modelDescriptor = new DefaultSModelDescriptor(manager, FileSystem.getFile(fileName), new SModelReference(modelUID, SModelId.generate()));
    SModelRepository.getInstance().createNewModel(modelDescriptor, owner);
    modelDescriptor.getSModel();
    return modelDescriptor;
  }

  public boolean renameModelDescriptor(SModelDescriptor modelDescriptor, String newLongName, MPSProject project) {
    assert modelDescriptor instanceof DefaultSModelDescriptor;
    // 1. rename file
    Set<SModelRoot> modelRoots = modelDescriptor.collectSModelRoots();
    if (modelRoots.size() == 0) {
      LOG.error("can't rename model " + modelDescriptor + " : no model root exists");
      return false;
    }
    if (modelRoots.size() > 1) {
      LOG.error("can't rename model " + modelDescriptor + " : more than one model root exists");
      return false;
    }

    SModelRoot root = modelRoots.iterator().next();
    return renameModelDescriptor(modelDescriptor, newLongName, root, project);
  }

  public boolean renameModelDescriptor(SModelDescriptor modelDescriptor, String newLongName, SModelRoot root, MPSProject project) {
/*    assert modelDescriptor instanceof DefaultSModelDescriptor;
    SModelUID newModelUID = new SModelUID(newLongName, modelDescriptor.getStereotype());
    SModelUID oldModelUID = modelDescriptor.getModelUID();
    ModelOwner owner = SModelRepository.getInstance().getOwners(modelDescriptor).iterator().next();
    IFile oldModelFile = modelDescriptor.getModelFile();
    String oldFileName = oldModelFile.getAbsolutePath();

    //create a file for a new model
    IFile dest = createFileForModelUID(root, newModelUID);

    // if imports itself: rename import here
    if (modelDescriptor.getSModel().hasImportedModel(oldModelUID)) {
      modelDescriptor.getSModel().changeImportedModelUID(oldModelUID, newModelUID);
    }

    // update model repository and rename descriptor itself
    SModelRepository.getInstance().renameUID(modelDescriptor, newModelUID);

    // update node pointers
    SNodePointer.changeModelUID(oldModelUID, newModelUID);

    //set model file
    SModelRepository.getInstance().setModelFile((DefaultSModelDescriptor) modelDescriptor, dest);

    //create stub for an old UID
    String stubFileName = oldFileName.substring(0, oldFileName.lastIndexOf(MPSExtentions.DOT_MODEL)) + MPSExtentions.DOT_STUB;
    SModelDescriptor stubDescriptor = new StubModelDescriptor(this, FileSystem.getFile(stubFileName), oldModelUID, newModelUID);
    stubDescriptor.save();
    SModelRepository.getInstance().registerModelDescriptor(stubDescriptor, owner);
//    IFile stubDescriptorModelFile = stubDescriptor.getModelFile();

    MPSModuleRepository.getInstance().invalidateCaches();
    return true;*/
    throw new RuntimeException();
  }

  public void saveMetadata(@NotNull SModelDescriptor modelDescriptor) {
    Map<String, String> metadata = modelDescriptor.getMetaData();
    if (metadata.isEmpty()) return;

    IFile metadataFile = getMetadataFile(modelDescriptor.getModelFile());
    if (!metadataFile.exists()) {
      metadataFile.createNewFile();
      ModelChangesWatcher.instance().fireMetadataFileCreated(metadataFile);
    }

    System.err.println("saving metadata");
    DefaultMetadataPersistence.save(metadataFile, metadata);
  }

  @Nullable
  public Map<String, String> loadMetadata(@NotNull SModelDescriptor modelDescriptor) {
    IFile metadataFile = getMetadataFile(modelDescriptor.getModelFile());
    if (!metadataFile.exists()) {
      return new HashMap<String, String>();
    }
    return DefaultMetadataPersistence.load(metadataFile);
  }

  private static IFile getMetadataFile(IFile modelFile) {
    String modelPath = modelFile.getAbsolutePath();
    String versionPath = modelPath.substring(0, modelPath.length() - MPSExtentions.DOT_MODEL.length()) + ".metadata";
    return FileSystem.getFile(versionPath);
  }
}
