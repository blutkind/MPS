package jetbrains.mps.vcs;

import jetbrains.mps.vfs.VFileSystem;
import jetbrains.mps.plugin.IProjectHandler;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.util.Pair;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.generator.GenerationListener;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.rmi.RemoteException;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import com.intellij.openapi.vcs.AbstractVcs;
import com.intellij.openapi.vcs.FilePath;
import com.intellij.openapi.vcs.VcsException;
import com.intellij.openapi.vcs.changes.VcsDirtyScopeManager;
import com.intellij.openapi.vcs.checkin.CheckinEnvironment;
import com.intellij.openapi.vcs.actions.VcsContextFactory;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.application.ApplicationManager;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MPSVCSManager implements ProjectComponent {
  public static final Logger LOG = Logger.getLogger(MPSVCSManager.class);
  private final Project myProject;
  private GenerationListener myGenerationListener;
  private volatile boolean isGenerationRunning;
  private final Set<Runnable> myTasks = new HashSet<Runnable>();

  public MPSVCSManager(Project project) {
    myProject = project;
    myGenerationListener = new GenerationListener() {
      public void beforeGeneration(List<Pair<SModelDescriptor, IOperationContext>> inputModels) {
        isGenerationRunning = true;
      }

      public void modelsGenerated(List<Pair<SModelDescriptor, IOperationContext>> models, boolean success) {

      }

      public void afterGeneration(List<Pair<SModelDescriptor, IOperationContext>> inputModels) {
        isGenerationRunning = false;

        for (Runnable task : myTasks) {
          ApplicationManager.getApplication().invokeLater(task);
        }

        myTasks.clear();
      }
    };
  }

  private void invokeLater(Runnable task) {
    if (isGenerationRunning) {
      myTasks.add(task);
      LOG.debug("shedule task");
      return;
    }

    LOG.debug("invoke task");
    ApplicationManager.getApplication().invokeLater(task);
  }

  public boolean deleteFilesAndRemoveFromVCS(List<File> files) {
    final List<File> inVCS = new LinkedList<File>();
    List<File> notInVCS = new LinkedList<File>();

    ProjectLevelVcsManager manager = myProject.getComponent(ProjectLevelVcsManager.class);
    for (File f : files) {
      VirtualFile virtualFile = VFileSystem.getFile(f);
      if (virtualFile != null) {
        AbstractVcs vcs = manager.getVcsFor(virtualFile);
        if (vcs != null) {
          inVCS.add(f);
        } else {
          notInVCS.add(f);
        }
      }
    }

    boolean result = true;

    invokeLater(new Runnable() {
      public void run() {
        ApplicationManager.getApplication().runWriteAction(new Runnable() {
          public void run() {
            LocalFileSystem lfs = LocalFileSystem.getInstance();
            for (File file : inVCS) {
              VirtualFile vfile = lfs.refreshAndFindFileByIoFile(file);
              if (vfile != null) {
                try {
                  vfile.delete(this);
                } catch (IOException ex) {
                  ex.printStackTrace();
                }
              }
            }
          }
        });
      }
    });

    IProjectHandler projectHandler = myProject.getComponent(MPSProjectHolder.class).getMPSProject().getProjectHandler();
    if (projectHandler != null) {
      try {
        projectHandler.deleteFilesAndRemoveFromVCS(notInVCS);
      } catch (RemoteException e) {
        LOG.error(e);
        return false;
      }
    } else {
      for (File f : files) {
        f.delete();
      }
    }

    return result;
  }

  public boolean addFilesToVCS(final List<File> files) {
    final List<File> inVCS = new LinkedList<File>();
    List<File> notInVCS = new LinkedList<File>();

    final ProjectLevelVcsManager manager = myProject.getComponent(ProjectLevelVcsManager.class);
    for (File f : files) {
      VirtualFile virtualFile = VFileSystem.getFile(f);
      if (virtualFile != null) {
        AbstractVcs vcs = manager.getVcsFor(virtualFile);
        if (vcs != null) {
          inVCS.add(f);
        } else {
          notInVCS.add(f);
        }
      }
    }

    boolean result = true;
    invokeLater(new Runnable() {
      public void run() {
        ApplicationManager.getApplication().runWriteAction(new Runnable() {
          public void run() {
            LocalFileSystem lfs = LocalFileSystem.getInstance();
            for (File f : inVCS) {
              VirtualFile vf = lfs.refreshAndFindFileByIoFile(f);
              if (vf == null) {
                continue;
              }
              AbstractVcs vcs = manager.getVcsFor(vf);
              if (vcs != null) {
                CheckinEnvironment ci = vcs.getCheckinEnvironment();
                if (ci != null && !isUnderVCS(myProject, vf)) {
                  List<VirtualFile> vfs = new ArrayList<VirtualFile>();
                  vfs.add(vf);
                  List<VcsException> result = ci.scheduleUnversionedFilesForAddition(vfs);
                  VcsDirtyScopeManager.getInstance(myProject).fileDirty(vf);
                }
              }
            }
          }
        });
      }
    });

    IProjectHandler projectHandler = myProject.getComponent(MPSProjectHolder.class).getMPSProject().getProjectHandler();
    if (projectHandler != null) {
      try {
        projectHandler.addFilesToVCS(notInVCS);
      } catch (RemoteException e) {
        LOG.error(e);
        return false;
      }
    }

    return result;
  }

  public static boolean isUnderVCS(Project project, VirtualFile f) {
    ProjectLevelVcsManager manager = project.getComponent(ProjectLevelVcsManager.class);
    AbstractVcs vcs = manager.getVcsFor(f);
    if (vcs == null) {
      return false;
    }
    FilePath path = VcsContextFactory.SERVICE.getInstance().createFilePathOn(f);
    return vcs.fileIsUnderVcs(path);
  }

  public void projectOpened() {
  }

  public void projectClosed() {

  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "VCS Manager";
  }

  public void initComponent() {
    myProject.getComponent(GeneratorManager.class).addGenerationListener(myGenerationListener);
  }

  public void disposeComponent() {
    myProject.getComponent(GeneratorManager.class).removeGenerationListener(myGenerationListener);
  }
}
