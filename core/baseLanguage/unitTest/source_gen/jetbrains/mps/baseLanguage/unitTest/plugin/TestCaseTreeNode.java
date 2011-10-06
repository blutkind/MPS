package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.actionSystem.ActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class TestCaseTreeNode extends BaseTestTreeNode {
  @NotNull
  protected final ITestNodeWrapper myTestCase;

  public TestCaseTreeNode(@NotNull IOperationContext operationContext, @NotNull ITestNodeWrapper testCase) {
    super(operationContext);
    this.myTestCase = testCase;
    this.setNodeIdentifier(this.myTestCase.getNodePointer().getNodeId().toString());
    this.setText(SPropertyOperations.getString(this.myTestCase.getNode(), "name"));
    this.setAdditionalText(this.myTestCase.getNodePointer().getModelReference().getLongName());
  }

  public String getClassName() {
    final Wrappers._T<String> className = new Wrappers._T<String>(null);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        className.value = TestCaseTreeNode.this.myTestCase.getFqName();
      }
    });
    return className.value;
  }

  @Override
  public ActionGroup getActionGroup() {
    return ActionUtils.getGroup("jetbrains.mps.ide.actions.JUnitTestCaseActions_ActionGroup");
  }

  public void doubleClick() {
    this.getOperationContext().getComponent(MPSEditorOpener.class).openNode(this.myTestCase.getNode(), getOperationContext(), true, false);
  }

  public int getToggleClickCount() {
    return -1;
  }

  @Override
  public Object getUserObject() {
    return this.myTestCase;
  }
}
