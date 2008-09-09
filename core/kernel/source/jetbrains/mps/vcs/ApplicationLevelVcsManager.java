package jetbrains.mps.vcs;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.vcs.*;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.VFileSystem;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.persistence.ConflictModelException;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.ThreadUtils;

import java.util.*;

public class ApplicationLevelVcsManager implements ApplicationComponent {
  public static final Logger LOG = Logger.getLogger(ApplicationLevelVcsManager.class);

  public static ApplicationLevelVcsManager instance() {
    return ApplicationManager.getApplication().getComponent(ApplicationLevelVcsManager.class);
  }

  private final ProjectManager myProjectManager;

  public ApplicationLevelVcsManager(ProjectManager projectManager) {
    myProjectManager = projectManager;
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Application Level Vcs Manager";
  }

  public void initComponent() {
  }

  public void disposeComponent() {

  }

  @Nullable
  public Project getProjectForFile(VirtualFile f) {
    Project[] projects = myProjectManager.getOpenProjects();
    for (Project project : projects) {
      AbstractVcs vcs = getVcsForFile(f, project);
      if (vcs != null) {
        return project;
      }
    }
    return null;
  }

  private AbstractVcs getVcsForFile(VirtualFile f, Project project) {
    return ProjectLevelVcsManager.getInstance(project).getVcsFor(f);
  }

  @Nullable
  public AbstractVcs getVcsForFile(VirtualFile f) {
    Project[] projects = myProjectManager.getOpenProjects();
    for (Project project : projects) {
      AbstractVcs vcs = getVcsForFile(f, project);
      if (vcs != null) {
        return vcs;
      }
    }
    return null;
  }

  public boolean isInConflict(IFile ifile, boolean synchronously) {
    return StatusUtil.isInConflict(ifile, synchronously, myProjectManager.getOpenProjects());
  }

  public void mergeModels(Set<SModelDescriptor> models) {
    Map<Project, List<VirtualFile>> toMerge = new HashMap<Project, List<VirtualFile>>();
    for (SModelDescriptor modelDescriptor : models) {
      IFile ifile = modelDescriptor.getModelFile();
      if (isInConflict(ifile, true)) {
        VirtualFile vfile = VFileSystem.getFile(ifile);
        Project project = getProjectForFile(vfile);
        List<VirtualFile> files = toMerge.get(project);
        if (files == null) {
          files = new LinkedList<VirtualFile>();
          toMerge.put(project, files);
        }
        files.add(vfile);
      }
    }

    for (Project project : toMerge.keySet()) {
      AbstractVcsHelper.getInstance(project).showMergeDialog(toMerge.get(project));
    }
  }
}