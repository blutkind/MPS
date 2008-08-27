package jetbrains.mps.watching;

import jetbrains.mps.smodel.*;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.library.LibraryManager;
import jetbrains.mps.vfs.VFileSystem;
import jetbrains.mps.watching.ModelChangesWatcher;
import jetbrains.mps.projectLanguage.structure.ModuleDescriptor;
import jetbrains.mps.projectLanguage.DescriptorsPersistence;

import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.io.File;

import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task.Modal;
import org.jetbrains.annotations.NotNull;

public class ReloadSession {
  private final Set<SModelDescriptor> myChangedModels = new LinkedHashSet<SModelDescriptor>();
  private final Set<VirtualFile> myNewModelVFiles = new LinkedHashSet<VirtualFile>();
  private final Set<IModule> myChangedModules = new LinkedHashSet<IModule>();
  private final Set<VirtualFile> myNewModuleVFiles = new LinkedHashSet<VirtualFile>();
  private final Set<Project> myChangedProjects = new LinkedHashSet<Project>();

  public void doReload() {
    if (hasSomethingToDo()) {
      // TODO what to do with projects?

      ProgressManager.getInstance().run(new Modal(null, "Reloading", false) {

        public void run(@NotNull final ProgressIndicator progressIndicator) {
          if (!myNewModuleVFiles.isEmpty()) {
//            System.out.println("reloading libraries");
            progressIndicator.setText("Updating Modules");
            LibraryManager.getInstance().update();
            return;
          }

          preprocess();

          updateModules(progressIndicator);
          updateModels(progressIndicator);
        }
      });
    }
  }

  private void updateModels(final ProgressIndicator progressIndicator) {
//    System.out.println("models to update " + myChangedModels);
    for (final SModelDescriptor model : myChangedModels) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          progressIndicator.setText("Reloading " + model.getModelUID());
          ModelChangesWatcher.instance().addDirtyFile(VFileSystem.getFile(model.getModelFile()));
          model.reloadFromDisk();
        }
      });
    }
  }

  private void updateModules(final ProgressIndicator progressIndicator) {
//    System.out.println("modules to update " + myChangedModules);
    for (final IModule module : myChangedModules) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          progressIndicator.setText("Reloading " + module.getModuleUID());
          SModel sModel = module.getModuleDescriptor().getModel();
          ModuleDescriptor descriptor = null;
          if (module instanceof Language) {
            descriptor = DescriptorsPersistence.loadLanguageDescriptor(module.getDescriptorFile(), sModel);
          } else if (module instanceof Solution) {
            descriptor = DescriptorsPersistence.loadSolutionDescriptor(module.getDescriptorFile(), sModel);
          } else if (module instanceof DevKit) {
            descriptor = DescriptorsPersistence.loadDevKitDescriptor(module.getDescriptorFile(), sModel);
          }
          assert descriptor != null;
          module.setModuleDescriptor(descriptor);
        }
      });
    }
  }

  private void preprocess() {
    for (VirtualFile virtualFile : myNewModelVFiles) {
      File file = VFileSystem.toFile(virtualFile);
      if (!file.exists()) continue;
      IModule module = MPSModuleRepository.getInstance().getModuleForModelFile(file);
      if (module != null) {
        myChangedModules.add(module);
      }
    }

    Set<SModelDescriptor> skip = new HashSet<SModelDescriptor>();
    for (SModelDescriptor modelDescriptor : myChangedModels) {
      Set<IModule> modules = modelDescriptor.getModules();
      for (IModule module : modules) {
        if (myChangedModules.contains(module)) {
          skip.add(modelDescriptor);
          break;
        }
      }
    }

    myChangedModels.removeAll(skip);
  }

  private boolean hasSomethingToDo() {
    return !(myChangedModels.isEmpty() && myChangedModules.isEmpty() && myChangedProjects.isEmpty()
      && myNewModelVFiles.isEmpty() && myNewModuleVFiles.isEmpty());
  }

  public void addChangedModel(SModelDescriptor model) {
    myChangedModels.add(model);
//    System.out.println("changed model " + model);
  }

  public void addNewModelFile(VirtualFile vfile) {
    myNewModelVFiles.add(vfile);
//    System.out.println("created model " + vfile);
  }

  public void addChangedModule(IModule module) {
    myChangedModules.add(module);
//    System.out.println("changed module " + module);
  }

  public void addNewModuleFile(VirtualFile vfile) {
    myNewModuleVFiles.add(vfile);
//    System.out.println("added module " + vfile);
  }

  public void addChangedProject(Project project) {
    myChangedProjects.add(project);
//    System.out.println("changed project " + project);
  }
}
