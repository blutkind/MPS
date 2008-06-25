package jetbrains.mps.ide;

import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.nodeEditor.UIEditorComponent;
import jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.JSplitPaneWithoutBorders;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.cleanup.CleanupManager;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import java.awt.HeadlessException;

import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task.Modal;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.application.ApplicationManager;
import org.jetbrains.annotations.NotNull;

public abstract class BaseNodeDialog extends BaseDialog {
  private static Logger LOG = Logger.getLogger(BaseNodeDialog.class);

  private IOperationContext myOperationContext;
  private UIEditorComponent myEditorComponent;
  private JSplitPane mySplitter;

  protected BaseNodeDialog(String text, IOperationContext operationContext) throws HeadlessException {
    super(operationContext.getMainFrame(), text);
    myOperationContext = operationContext;
    InspectorEditorComponent inspector = new InspectorEditorComponent();
    myEditorComponent = new UIEditorComponent(getOperationContext(), inspector);

    mySplitter = new JSplitPaneWithoutBorders(JSplitPane.VERTICAL_SPLIT, myEditorComponent.getExternalComponent(), inspector.getExternalComponent());
    mySplitter.setDividerSize(6);
    mySplitter.setResizeWeight(0.8);
  }

  public MyPreferencesPage createPreferencesPage() {
    myEditorComponent.editNode(getNode());
    return new MyPreferencesPage();
  }

  protected Icon getIcon() {
    return Icons.DEFAULT_ICON;
  }

  protected IOperationContext getOperationContext() {
    return myOperationContext;
  }

  protected IScope getScope() {
    return myOperationContext.getScope();
  }

  protected abstract void saveChanges();

  protected abstract SNode getNode();

  public void showDialog() {
    myEditorComponent.editNode(getNode());
    super.showDialog();
  }

  protected JComponent getMainComponent() {
    return mySplitter;
  }

  protected String getErrorString() {
    return null;
  }

  private boolean validateNode() {
    return ModelAccess.instance().runReadAction(new Computable<Boolean>() {
      public Boolean compute() {
        String errorString = getErrorString();
        if (errorString != null) {
          setErrorText(errorString);
          String optionsText = errorString + "\n\n" +
            "Apply changes anyway?";
          int option = JOptionPane.showConfirmDialog(
            BaseNodeDialog.this,
            optionsText,
            "Errors in " + BaseNodeDialog.this.getTitle(),
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
          if (option != JOptionPane.OK_OPTION) {
            return false;
          }
        }
        return true;
      }
    });
  }

  @BaseDialog.Button(position = 0, name = "OK", defaultButton = true)
  public void buttonOK() {
    if (doSaveChanges()) return;
    BaseNodeDialog.this.dispose();
  }

  private boolean doSaveChanges() {
    if (!validateNode()) return true;
    ProgressManager.getInstance().run(new Modal(getOperationContext().getComponent(Project.class), "Applying changes", false) {
      public void run(@NotNull ProgressIndicator indicator) {
        indicator.setIndeterminate(true);
        try {
          ModelAccess.instance().runWriteAction(new Runnable() {
            public void run() {
              saveChanges();

              CleanupManager.getInstance().cleanup();
            }
          });
        } catch (Throwable t) {
          LOG.error(t);
        }
      }
    });

    ApplicationManager.getApplication().saveAll();

    return false;
  }

  protected void afterSave() {
  }

  @BaseDialog.Button(position = 1, name = "Cancel")
  public void buttonCancel() {
    BaseNodeDialog.this.dispose();
  }

  @BaseDialog.Button(position = 2, name = "Apply")
  public void buttonApply() {
    doSaveChanges();
  }

  public class MyPreferencesPage {
    public String getName() {
      return getTitle();
    }

    public Icon getIcon() {
      return BaseNodeDialog.this.getIcon();
    }

    public JComponent getComponent() {
      return getMainComponent();
    }

    public boolean validate() {
      return validateNode();
    }

    public void commit() {
      buttonOK();
    }
  }
}
