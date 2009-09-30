package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.smodel.IOperationContext;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import java.util.HashMap;

public class TestTree extends MPSTree {
  private IOperationContext operationContext;
  private Map<SNode, List<SNode>> tests;
  private TestNameMap<TestCaseTreeNode, TestMethodTreeNode> map;
  private boolean isAllTree = true;
  private boolean isRebuilded = true;

  public TestTree() {
    this.tests = MapSequence.fromMap(new LinkedHashMap<SNode, List<SNode>>(16, (float)0.75, false));
    this.map = new TestNameMap<TestCaseTreeNode, TestMethodTreeNode>();
    this.rebuildLater();
  }

  public MPSTreeNode rebuild() {
    MPSTreeNode root = new TextTreeNode("Tests");
    TestNameMap<TestCaseTreeNode, TestMethodTreeNode> temp = new TestNameMap<TestCaseTreeNode, TestMethodTreeNode>();
    for (SNode testCase : SetSequence.fromSet(MapSequence.fromMap(this.tests).keySet())) {
      TestCaseTreeNode testCaseTreeNode = new TestCaseTreeNode(this.operationContext, testCase);
      root.add(testCaseTreeNode);
      temp.put(testCase, testCaseTreeNode);
      for (SNode method : ListSequence.fromList(MapSequence.fromMap(this.tests).get(testCase))) {
        TestMethodTreeNode oldMethodTreeNode = this.map.get(ITestCase_Behavior.call_getClassName_1216136193905(testCase), ITestMethod_Behavior.call_getTestName_1216136419751(method));
        TestMethodTreeNode newMethodTreeNode = new TestMethodTreeNode(this.operationContext, method);
        TestMethodTreeNode methodTreeNode = (this.isRebuilded ?
          newMethodTreeNode :
          oldMethodTreeNode
        );
        if (oldMethodTreeNode == null && !(this.isAllTree)) {
          continue;
        }
        if (this.isAllTree || !(isPassed(oldMethodTreeNode))) {
          if (methodTreeNode == null) {
            continue;
          }
          testCaseTreeNode.add(methodTreeNode);
          temp.put(testCase, method, methodTreeNode);
        } else if (!(this.isRebuilded)) {
          temp.put(testCase, method, oldMethodTreeNode);
        }
      }
    }
    this.map = temp;
    this.isRebuilded = true;
    return root;
  }

  public IOperationContext getContext() {
    return this.operationContext;
  }

  public void hidePassed(boolean hide) {
    this.isAllTree = !(hide);
    this.isRebuilded = false;
    this.rebuildNow();
  }

  public void buildFailedTestTree() {
    this.isAllTree = false;
    this.isRebuilded = true;
    this.rebuildNow();
  }

  public void setTests(IOperationContext operationContext, Map<SNode, List<SNode>> tests) {
    this.operationContext = operationContext;
    this.tests = tests;
    this.isRebuilded = true;
    this.rebuildNow();
  }

  public Map<SNode, List<SNode>> getFailedTests() {
    Map<SNode, List<SNode>> temp = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    MapSequence.fromMap(temp).putAll(this.tests);
    for (SNode testCase : SetSequence.fromSet(MapSequence.fromMap(this.tests).keySet())) {
      for (SNode method : ListSequence.fromList(MapSequence.fromMap(this.tests).get(testCase))) {
        TestMethodTreeNode methodTreeNode = this.map.get(ITestCase_Behavior.call_getClassName_1216136193905(testCase), ITestMethod_Behavior.call_getTestName_1216136419751(method));
        if (isPassed(methodTreeNode)) {
          ListSequence.fromList(MapSequence.fromMap(temp).get(testCase)).removeElement(method);
        }
      }
      if (ListSequence.fromList(MapSequence.fromMap(temp).get(testCase)).isEmpty()) {
        MapSequence.fromMap(temp).remove(testCase);
      }
    }
    return temp;
  }

  public int getMethodCount() {
    int result = 0;
    for (List<SNode> values : MapSequence.fromMap(this.tests).values()) {
      result = result + ListSequence.fromList(values).count();
    }
    return result;
  }

  public TestCaseTreeNode get(String className) {
    return this.map.get(className);
  }

  public TestMethodTreeNode get(String className, String methodName) {
    return this.map.get(className, methodName);
  }

  public void selectFirstDefectNode() {
    for (SNode testCase : SetSequence.fromSet(MapSequence.fromMap(this.tests).keySet())) {
      for (SNode method : ListSequence.fromList(MapSequence.fromMap(this.tests).get(testCase))) {
        TestMethodTreeNode testMethodTreeNode = this.map.get(ITestCase_Behavior.call_getClassName_1216136193905(testCase), ITestMethod_Behavior.call_getTestName_1216136419751(method));
        if (isFailed(testMethodTreeNode)) {
          this.setCurrentNode(testMethodTreeNode);
          return;
        }
      }
    }
  }

  public static boolean isFailed(MPSTreeNode node) {
    if (!(node.isLeaf())) {
      return false;
    }
    TestMethodTreeNode leaf = (TestMethodTreeNode)node;
    TestState state = leaf.getState();
    return state.equals(TestState.ERROR) || state.equals(TestState.FAILED);
  }

  public static boolean isPassed(TestMethodTreeNode method) {
    if (method == null) {
      return false;
    }
    return method.getState() != null && method.getState().equals(TestState.PASSED);
  }
}
