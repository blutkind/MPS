package jetbrains.mps.baseLanguage.unitTest.execution.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.smodel.IOperationContext;
import javax.swing.Icon;
import jetbrains.mps.smodel.ModelAccess;

public abstract class BaseTestTreeNode extends MPSTreeNode {
  private TestState state = TestState.NOT_RAN;

  public BaseTestTreeNode(IOperationContext context) {
    super(context);
  }

  @Override
  protected void doUpdatePresentation() {
    Icon icon = this.state.getIcon();
    if (icon != null) {
      this.setIcon(icon);
    }
  }

  public void setState(TestState state) {
    this.state = state;
    ModelAccess.instance().runReadInEDT(new Runnable() {
      public void run() {
        renewPresentation();
      }
    });
  }

  public TestState getState() {
    return this.state;
  }
}
