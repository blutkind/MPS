package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.closures.runtime.Wrappers;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class TestMethodTreeNode extends MPSTreeNode {

  protected SNode testMethod;
  private TestState state = TestState.NOT_RAN;

  public TestMethodTreeNode(IOperationContext operationContext, SNode testMethod) {
    super(operationContext);
    this.testMethod = testMethod;
    this.updatePresentation();
  }

  public void updatePresentation() {
    this.setIcon(this.state.getIcon());
    this.setNodeIdentifier(this.testMethod.getId());
    this.setText(ITestMethod_Behavior.call_getTestName_1216136419751(this.testMethod));
  }

  public TestState getState() {
    return this.state;
  }

  public void setState(TestState state) {
    this.state = state;
    ModelAccess.instance().runReadInEDT(new Runnable() {

      public void run() {
        TestMethodTreeNode.this.updatePresentation();
        TestMethodTreeNode.this.updateNodePresentationInTree();
      }

    });
  }

  public String getClassName() {
    final Wrappers._T<String> className = new Wrappers._T<String>(null);
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        SNode testCase = ITestMethod_Behavior.call_getTestCase_1216134500045(TestMethodTreeNode.this.testMethod);
        if (testCase != null) {
          className.value = ITestCase_Behavior.call_getClassName_1216136193905(testCase);
        }
      }

    });
    return className.value;
  }

  public String getMethodName() {
    final Wrappers._T<String> methodName = new Wrappers._T<String>(null);
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        methodName.value = ITestMethod_Behavior.call_getTestName_1216136419751(TestMethodTreeNode.this.testMethod);
      }

    });
    return methodName.value;
  }

  public boolean isLeaf() {
    return true;
  }

  public void doubleClick() {
    this.getOperationContext().getComponent(MPSEditorOpener.class).openNode(this.testMethod);
  }

}
