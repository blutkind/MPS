package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.openapi.ui.InputValidator;
import jetbrains.mps.smodel.ModelAccess;
import java.io.IOException;
import com.intellij.openapi.ui.Messages;
import com.intellij.ide.IdeBundle;
import com.intellij.ide.projectView.ProjectView;
import javax.swing.SwingUtilities;
import jetbrains.mps.ide.projectPane.fileSystem.BaseDirectoryProjectView;

public class NewFile_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(NewFile_Action.class);

  private VirtualFile selectedFile;
  private Project project;

  public NewFile_Action() {
    super("File", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      event.getPresentation().setIcon(Icons.TEXT_ICON);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "NewFile", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.selectedFile = event.getData(MPSDataKeys.VIRTUAL_FILE);
    if (this.selectedFile == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final VirtualFile dir = (NewFile_Action.this.selectedFile.isDirectory() ?
        NewFile_Action.this.selectedFile :
        NewFile_Action.this.selectedFile.getParent()
      );
      final VirtualFile[] result = new VirtualFile[1];
      InputValidator validator = new InputValidator() {
        public boolean checkInput(String p) {
          return true;
        }

        public boolean canClose(final String p) {
          if (p.length() == 0) {
            return false;
          }
          if (p.contains(System.getProperty("file.separator"))) {
            return false;
          }
          ModelAccess.instance().runWriteAction(new Runnable() {
            public void run() {
              try {
                result[0] = dir.createChildData(null, p);
              } catch (IOException e) {
              }
            }
          });
          return true;
        }
      };
      Messages.showInputDialog(NewFile_Action.this.project, IdeBundle.message("prompt.enter.new.file.name"), IdeBundle.message("title.new.file"), Messages.getQuestionIcon(), "", validator);
      if (result[0] != null) {
        ProjectView.getInstance(NewFile_Action.this.project).refresh();
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            ProjectView.getInstance(NewFile_Action.this.project).getProjectViewPaneById(BaseDirectoryProjectView.ID).select(null, result[0], true);
          }
        });
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "NewFile", t);
      }
    }
  }
}
