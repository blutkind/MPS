package jetbrains.mps.ide.ui.smodel;

import jetbrains.mps.ide.action.AbstractActionWithEmptyIcon;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.ide.ui.MPSTreeNodeEx;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

import javax.swing.JPopupMenu;
import java.awt.event.ActionEvent;

public class ReferencesTreeNode extends MPSTreeNodeEx {
  private SNode myNode;

  private boolean myInitialized;

  public ReferencesTreeNode(IOperationContext operationContext, SNode node) {
    super(operationContext);
    myNode = node;

    setIcon(Icons.REFERENCE_ICON);
    setNodeIdentifier("references");
  }


  public boolean isInitialized() {
    return myInitialized;
  }


  protected void doInit() {
    super.doInit();

    for (final SReference ref : myNode.getReferences()) {
      add(new TextTreeNode(ref.getRole() + ": " + ref.getTargetNode(), getOperationContext()) {
        {
          setIcon(Icons.DEFAULT_ICON);
        }

        public void doubleClick() {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              SNode target = ref.getTargetNode();
              if (target == null) return;

              getOperationContext().getComponent(MPSEditorOpener.class).openNode(target);
            }
          });
        }

        @Override
        public JPopupMenu getPopupMenu() {
          JPopupMenu result = new JPopupMenu();

          result.add(new AbstractActionWithEmptyIcon("Delete") {
            public void actionPerformed(ActionEvent e) {
              ModelAccess.instance().runWriteActionInCommand(new Runnable() {
                public void run() {
                  myNode.removeReference(ref);
                }
              });
            }
          });

          return result;
        }

        public boolean isLeaf() {
          return true;
        }
      });
    }


    myInitialized = true;
  }

  protected void doUpdate() {
    super.doUpdate();
    this.removeAllChildren();
    myInitialized = false;
  }
}
