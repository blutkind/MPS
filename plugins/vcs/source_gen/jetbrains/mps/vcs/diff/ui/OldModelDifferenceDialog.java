package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import com.intellij.ui.FocusTrackback;
import com.intellij.openapi.wm.FocusWatcher;
import jetbrains.mps.smodel.IOperationContext;
import java.awt.Frame;
import jetbrains.mps.smodel.SModel;
import java.awt.HeadlessException;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Computable;
import jetbrains.mps.ide.project.ProjectHelper;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.FocusEvent;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import javax.swing.JComponent;

public class OldModelDifferenceDialog extends BaseDialog {
  private OldModelDifferenceComponent myDifferenceComponent;
  private FocusTrackback myFocusTrackback;
  private FocusWatcher myFocusWatcher;

  public OldModelDifferenceDialog(final IOperationContext context, final Frame parent, final SModel oldModel, final SModel newModel, String windowTitle, final boolean modal, final String[] contentTitles) throws HeadlessException {
    super(parent, windowTitle);
    setModal(modal);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myDifferenceComponent = new OldModelDifferenceComponent(context) {
          @Override
          protected void doubleClickOnNode(final SNode node) {
            final SNode rootNode = ModelAccess.instance().runReadAction(new Computable<SNode>() {
              public SNode compute() {
                return node.getContainingRoot();
              }
            });
            final OldRootDifferenceDialog dialog = new OldRootDifferenceDialog(ProjectHelper.toMainFrame(context.getProject()), newModel, oldModel, false, modal);
            ModelAccess.instance().runReadAction(new Runnable() {
              public void run() {
                dialog.init(context, rootNode, contentTitles[1], contentTitles[0]);
              }
            });
            dialog.showDialog();
            updateDiff(oldModel, newModel);
          }
        };
        myDifferenceComponent.showDifference(oldModel, newModel);
      }
    });
    myFocusTrackback = new FocusTrackback(this, parent, false);
    WindowAdapter focusListener = new WindowAdapter() {
      public void windowOpened(WindowEvent e) {
        if (myDifferenceComponent != null) {
          myDifferenceComponent.requestFocusInWindow();
          myFocusTrackback.registerFocusComponent(myDifferenceComponent);
        }
      }
    };
    addWindowListener(focusListener);
    myFocusWatcher = new FocusWatcher() {
      protected void focusLostImpl(final FocusEvent e) {
        myFocusTrackback.consume();
      }
    };
    myFocusWatcher.install(myDifferenceComponent);
  }

  private void updateDiff(final SModel oldModel, final SModel newModel) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myDifferenceComponent.showDifference(oldModel, newModel);
      }
    });
  }

  public void addAction(AnAction action) {
    myDifferenceComponent.addAction(action);
  }

  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(200, 200, 800, 600);
  }

  protected JComponent getMainComponent() {
    return myDifferenceComponent;
  }

  @BaseDialog.Button(name = "Close", mnemonic = 'C', position = 0, defaultButton = true)
  public void onClose() {
    dispose();
  }

  @Override
  public void dispose() {
    myFocusTrackback.restoreFocus();
    myFocusWatcher.deinstall(myDifferenceComponent);
    super.dispose();
  }
}
