package jetbrains.mps.watching;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.descriptor.source.ReloadableSources;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Set;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.LinkedHashSet;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.project.IModule;
import com.intellij.openapi.project.Project;
import java.util.HashSet;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.library.LibraryInitializer;
import jetbrains.mps.reloading.ClassLoaderManager;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.project.ProjectManager;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;

/*package*/ class ReloadSession {
  private static final Logger LOG = Logger.getLogger(ReloadSession.class);
  protected static Log log = LogFactory.getLog(ReloadSession.class);

  private final Set<VirtualFile> myNewModelVFiles = SetSequence.fromSet(new LinkedHashSet<VirtualFile>());
  private final Set<IModule> myChangedModules = SetSequence.fromSet(new LinkedHashSet<IModule>());
  private final Set<VirtualFile> myNewModuleVFiles = SetSequence.fromSet(new LinkedHashSet<VirtualFile>());
  private final Set<Project> myChangedProjects = SetSequence.fromSet(new LinkedHashSet<Project>());
  private final Set<IModule> myDeletedModules = SetSequence.fromSet(new HashSet<IModule>());
  private final Set<ModelChangesWatcher.IReloadListener> myReloadListeners;

  public ReloadSession(Set<ModelChangesWatcher.IReloadListener> reloadListeners) {
    myReloadListeners = reloadListeners;
  }

  public void doReload() {
    if (hasAnythingToDo()) {
      ProgressManager.getInstance().run(new Task.Modal(null, "Reloading", false) {
        public void run(@NotNull final ProgressIndicator progressIndicator) {
          fireReloadStarted();
          ReloadSession.LOG.debug("Starting reload for:\n" +
               ((SetSequence.fromSet(myChangedModules).isEmpty() ?
            "" :
            "Changed modules : " + myChangedModules + "\n"
          )) + ((SetSequence.fromSet(myChangedProjects).isEmpty() ?
            "" :
            "Changed projects : " + myChangedProjects + "\n"
          )) + ((SetSequence.fromSet(myNewModelVFiles).isEmpty() ?
            "" :
            "New models : " + myNewModelVFiles + "\n"
          )) + ((SetSequence.fromSet(myNewModuleVFiles).isEmpty() ?
            "" :
            "New modules : " + myNewModuleVFiles + "\n"
          )) + ((SetSequence.fromSet(myDeletedModules).isEmpty() ?
            "" :
            "Deleted modules : " + myDeletedModules + "\n"
          )));
          try {
            if (!(SetSequence.fromSet(myNewModuleVFiles).isEmpty())) {
              if (log.isInfoEnabled()) {
                log.info("Reloading libraries.");
              }
              progressIndicator.setText("Reloading libraries... Please wait.");
              ModelAccess.instance().runWriteAction(new Runnable() {
                public void run() {
                  LibraryInitializer.getInstance().update();
                }
              });
            }
            preprocess();
            boolean areModulesUpdated = updateModules(progressIndicator);
            updateModels(progressIndicator);
            if (areModulesUpdated || !(SetSequence.fromSet(myNewModuleVFiles).isEmpty())) {
              progressIndicator.setText("Reloading classes... Please wait.");
              if (log.isInfoEnabled()) {
                log.info("Reloading classes.");
              }
              ModelAccess.instance().runWriteAction(new Runnable() {
                public void run() {
                  ClassLoaderManager.getInstance().reloadAll(new EmptyProgressIndicator());
                }
              });
            }
          } finally {
            if (log.isInfoEnabled()) {
              log.info("Reload finished.");
            }
            fireReloadFinished();
            for (Project project : ProjectManager.getInstance().getOpenProjects()) {
              ProjectPane.getInstance(project).rebuild();
            }
          }
        }
      });
    }
  }

  private void fireReloadStarted() {
    for (ModelChangesWatcher.IReloadListener l : myReloadListeners) {
      l.reloadStarted();
    }
  }

  private void fireReloadFinished() {
    for (ModelChangesWatcher.IReloadListener l : myReloadListeners) {
      l.reloadFinished();
    }
  }

  private void updateModels(final ProgressIndicator progressIndicator) {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        progressIndicator.setText("Reloading updated models... Please wait.");
        ReloadableSources.getInstance().reload(progressIndicator);
      }
    });
  }

  private boolean updateModules(final ProgressIndicator progressIndicator) {
    boolean isUpdated = false;
    progressIndicator.setText("Reloading updated modules... Please wait.");
    for (final IModule module : myChangedModules) {
      ModelAccess.instance().runWriteInEDT(new Runnable() {
        public void run() {
          String text = "Reloading " + module.getModuleFqName();
          if (log.isInfoEnabled()) {
            log.info(text);
          }
          progressIndicator.setText2(text);
          module.reloadFromDisk(false);
        }
      });
      isUpdated = true;
    }
    for (final IModule module : myDeletedModules) {
      ModelAccess.instance().runWriteAction(new Runnable() {
        public void run() {
          module.dispose();
          String text = "Unloading removed module " + module.getModuleFqName();
          if (log.isInfoEnabled()) {
            log.info(text);
          }
          MPSModuleRepository.getInstance().removeModule(module);
          progressIndicator.setText2(text);
        }
      });
      isUpdated = true;
    }
    return isUpdated;
  }

  private void preprocess() {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (VirtualFile virtualFile : myNewModelVFiles) {
          if (!(virtualFile.exists())) {
            continue;
          }
          IModule module = MPSModuleRepository.getInstance().getModuleForModelFile(FileUtil.getCanonicalPath(virtualFile.getPath()));
          if (module != null) {
            SetSequence.fromSet(myChangedModules).addElement(module);
          }
        }
        Iterable<Generator> generators = SetSequence.fromSet(myChangedModules).where(new IWhereFilter<IModule>() {
          public boolean accept(IModule m) {
            return m instanceof Generator;
          }
        }).select(new ISelector<IModule, Generator>() {
          public Generator select(IModule m) {
            return (Generator) m;
          }
        });
        for (Generator gen : generators) {
          if (log.isDebugEnabled()) {
            log.debug("Skip generator " + gen + " since we want to reload " + gen.getSourceLanguage());
          }
          SetSequence.fromSet(myChangedModules).removeElement(gen);
          SetSequence.fromSet(myChangedModules).addElement(gen.getSourceLanguage());
        }
        SetSequence.fromSet(myChangedModules).removeSequence(SetSequence.fromSet(myDeletedModules));
      }
    });
  }

  public boolean hasAnythingToDo() {
    return !(ReloadableSources.getInstance().hasInvalidated() && SetSequence.fromSet(myChangedModules).isEmpty() && SetSequence.fromSet(myChangedProjects).isEmpty() && SetSequence.fromSet(myNewModelVFiles).isEmpty() && SetSequence.fromSet(myNewModuleVFiles).isEmpty() && SetSequence.fromSet(myDeletedModules).isEmpty());
  }

  public void addNewModelFile(VirtualFile vfile) {
    SetSequence.fromSet(myNewModelVFiles).addElement(vfile);
  }

  public void addChangedModule(IModule module) {
    SetSequence.fromSet(myChangedModules).addElement(module);
  }

  public void addNewModuleFile(VirtualFile vfile) {
    SetSequence.fromSet(myNewModuleVFiles).addElement(vfile);
  }

  public void addChangedProject(Project project) {
    SetSequence.fromSet(myChangedProjects).addElement(project);
  }

  public void addDeletedModule(IModule module) {
    SetSequence.fromSet(myDeletedModules).addElement(module);
  }
}
