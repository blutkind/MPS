package jetbrains.mps.vcs;

/*Generated by MPS */

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.vcs.AbstractVcsHelper;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import jetbrains.mps.MPSCore;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.vcs.conflictable.Conflictable;
import jetbrains.mps.vcs.conflictable.ConflictableModelAdapter;
import jetbrains.mps.vcs.conflictable.ConflictableModuleAdapter;
import jetbrains.mps.vcs.queue.TaskQueue;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.watching.ModelChangesWatcher;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SuspiciousModelIndex implements ApplicationComponent {
  private final ProjectManager myProjectManager;
  private final ModelChangesWatcher myWatcher;
  private final VirtualFileManager myVirtualFileManager;
  private TaskQueue<Conflictable> myTaskQueue;

  public SuspiciousModelIndex(ProjectManager manager, ModelChangesWatcher watcher, VirtualFileManager vfManager) {
    myProjectManager = manager;
    myWatcher = watcher;
    myVirtualFileManager = vfManager;
  }

  public void addModel(EditableSModelDescriptor model, boolean isInConflict) {
    myTaskQueue.addTask(new ConflictableModelAdapter(model, isInConflict));
  }

  public void addModule(AbstractModule abstractModule, boolean inConflict) {
    myTaskQueue.addTask(new ConflictableModuleAdapter(abstractModule, inConflict));
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Suspicious Model Index";
  }

  public void initComponent() {
    if (MPSCore.getInstance().isTestMode()) {
      return;
    }
    myTaskQueue = new SuspiciousModelIndex.MyTaskQueue(myProjectManager, myWatcher, myVirtualFileManager);
  }

  public void disposeComponent() {
    if (MPSCore.getInstance().isTestMode()) {
      return;
    }
    myTaskQueue.dispose();
  }

  public void mergeModels(List<Conflictable> models) {
    final Collection<Conflictable> merged = showMergeDialog(models);
    if (merged.isEmpty()) {
      ModelChangesWatcher.instance().tryToResumeTasksProcessing();
      return;
    }
    ApplicationManager.getApplication().invokeLater(new Runnable() {
      public void run() {
        try {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              for (Conflictable conflictable : merged) {
                conflictable.reloadFromDisk();
              }
            }
          });
        } finally {
          ModelChangesWatcher.instance().tryToResumeTasksProcessing();
        }
      }
    }, ModalityState.NON_MODAL);
  }

  private Collection<Conflictable> showMergeDialog(List<Conflictable> conflictableList) {
    final Map<Project, List<VirtualFile>> toMerge = new HashMap<Project, List<VirtualFile>>();
    Map<VirtualFile, Conflictable> fileToConflictable = new LinkedHashMap<VirtualFile, Conflictable>();
    Set<Conflictable> toReload = new HashSet<Conflictable>();
    for (Conflictable conflictable : conflictableList) {
      IFile ifile = conflictable.getFile();
      if (VcsUtil.isInConflict(ifile, true)) {
        VirtualFile vfile = VirtualFileUtils.getVirtualFile(ifile);
        Conflictable prev = fileToConflictable.put(vfile, conflictable);
        if (prev == null) {
          Project project = VcsUtil.getProjectForFile(vfile);
          List<VirtualFile> files = toMerge.get(project);
          if (files == null) {
            files = new LinkedList<VirtualFile>();
            toMerge.put(project, files);
          }
          files.add(vfile);
        }
      } else if (conflictable.isConflictDetected() || conflictable.needReloading()) {
        toReload.add(conflictable);
      }
    }
    ModelChangesWatcher.instance().suspendTasksProcessing();
    for (final Project project : toMerge.keySet()) {
      final List<VirtualFile> virtualFileList = new ArrayList<VirtualFile>();
      ApplicationManager.getApplication().invokeAndWait(new Runnable() {
        public void run() {
          virtualFileList.addAll(AbstractVcsHelper.getInstance(project).showMergeDialog(toMerge.get(project)));
        }
      }, ModalityState.defaultModalityState());
      for (VirtualFile vfile : virtualFileList) {
        Conflictable conflictable = fileToConflictable.get(vfile);
        if (conflictable != null) {
          toReload.add(conflictable);
        }
      }
    }
    return toReload;
  }

  public static SuspiciousModelIndex instance() {
    return ApplicationManager.getApplication().getComponent(SuspiciousModelIndex.class);
  }

  private class MyTaskQueue extends TaskQueue<Conflictable> {
    public MyTaskQueue(ProjectManager manager, ModelChangesWatcher watcher, VirtualFileManager virtualFileManager) {
      super(manager, watcher, virtualFileManager);
    }

    @Override
    protected boolean isProcessingAllowed() {
      return super.isProcessingAllowed() && !(ModelAccess.instance().canRead());
    }

    protected void processTask(final List<Conflictable> tasks) {
      mergeModels(tasks);
    }
  }
}
