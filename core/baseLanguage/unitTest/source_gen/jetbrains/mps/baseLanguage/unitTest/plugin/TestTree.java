package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTree;
import com.intellij.openapi.Disposable;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.util.Disposer;
import java.util.List;
import java.util.Arrays;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestEvent;
import javax.swing.SwingUtilities;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import jetbrains.mps.smodel.ModelAccess;
import java.util.ArrayList;

public class TestTree extends MPSTree implements TestView, Disposable {
  private IOperationContext operationContext;
  private TestNameMap<TestCaseTreeNode, TestMethodTreeNode> map;
  private boolean isAllTree = true;
  private TestRunState state;
  private TestTreeIconAnimator animator;
  private MPSProject myProject;

  public TestTree(MPSProject project, TestRunState state, IOperationContext context, Disposable disposable) {
    Disposer.register(disposable, this);
    this.myProject = project;
    this.state = state;
    this.operationContext = context;
    this.map = new TestNameMap<TestCaseTreeNode, TestMethodTreeNode>();
    this.isAllTree = !(this.getPreferences().getStateObject().isHidePassed);
    this.animator = new TestTreeIconAnimator(this);
    this.animator.init(state);
  }

  private void updateState(TestMethodTreeNode methodNode, TestCaseTreeNode testCaseNode, TestState testState) {
    methodNode.setState(testState);
    List<TestState> priorityList = Arrays.asList(TestState.IN_PROGRESS, TestState.PASSED, TestState.FAILED, TestState.ERROR, TestState.TERMINATED);
    TestState oldState = testCaseNode.getState();
    if (ListSequence.fromList(priorityList).indexOf(oldState) < ListSequence.fromList(priorityList).indexOf(testState)) {
      if (TestState.PASSED.equals(testState)) {
        for (MPSTreeNode method : testCaseNode) {
          if (!(TestState.PASSED.equals(((TestMethodTreeNode) method).getState()))) {
            return;
          }
        }
      }
      testCaseNode.setState(testState);
    }
  }

  public void update() {
    if (this.state.getAvailableText() != null) {
      return;
    }
    String loseTest = this.state.getLoseClass();
    String loseMethod = this.state.getLoseMethod();
    String test = this.state.getCurrentClass();
    String method = this.state.getCurrentMethod();
    final Wrappers._T<TestMethodTreeNode> methodNode = new Wrappers._T<TestMethodTreeNode>();
    if (loseTest != null && loseMethod != null) {
      methodNode.value = this.get(loseTest, loseMethod);
      TestCaseTreeNode testCaseNode = this.get(loseTest);
      if (methodNode.value != null && testCaseNode != null) {
        this.updateState(methodNode.value, testCaseNode, TestState.ERROR);
      }
    } else {
      TestCaseTreeNode testCaseNode = this.get(test);
      methodNode.value = this.get(test, method);
      if (methodNode.value != null && testCaseNode != null) {
        if (this.state.isTerminated()) {
          this.updateState(methodNode.value, testCaseNode, TestState.TERMINATED);
          this.animator.stopMovie();
        } else if (TestEvent.START_TEST_PREFIX.equals(this.state.getToken())) {
          this.updateState(methodNode.value, testCaseNode, TestState.IN_PROGRESS);
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              TestTree.this.animator.scheduleRepaint();
            }
          });
          if (this.getPreferences().getStateObject().isTrackRunning) {
            SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                TestTree.this.setCurrentNode(methodNode.value);
              }
            });
          }
        } else if (TestEvent.END_TEST_PREFIX.equals(this.state.getToken())) {
          if (TestState.IN_PROGRESS.equals(methodNode.value.getState())) {
            this.updateState(methodNode.value, testCaseNode, TestState.PASSED);
            TestMethodRow row = this.state.getTestMethodRow(test, method);
            if (row != null) {
              row.setSucceed();
            }
          }
        } else if (TestEvent.FAILURE_TEST_PREFIX.equals(this.state.getToken())) {
          this.updateState(methodNode.value, testCaseNode, TestState.FAILED);
        } else if (TestEvent.ERROR_TEST_PREFIX.equals(this.state.getToken())) {
          methodNode.value.setState(TestState.ERROR);
          this.updateState(methodNode.value, testCaseNode, TestState.ERROR);
        }
      }
    }
    if (isFailed(methodNode.value) && this.getPreferences().getStateObject().isSelectFirstFailed) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          TestTree.this.selectFirstDefectNode();
        }
      });
    }
    if (this.getPreferences().getStateObject().isHidePassed) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          TestTree.this.hidePassed(true);
        }
      });
    }
  }

  @Override
  public void dispose() {
    if (!(this.isDisposed())) {
      super.dispose();
    }
    this.animator.dispose();
  }

  public void init() {
    this.rebuildNow();
    this.expandAll();
  }

  public MPSTreeNode rebuild() {
    MPSTreeNode root = new TextTreeNode("Tests");
    this.setRootVisible(false);
    TestNameMap<TestCaseTreeNode, TestMethodTreeNode> temp = new TestNameMap<TestCaseTreeNode, TestMethodTreeNode>();
    for (SNode testCase : SetSequence.fromSet(MapSequence.fromMap(this.state.getTestsMap()).keySet())) {
      if ((testCase == null)) {
        continue;
      }
      TestCaseTreeNode testCaseTreeNode = this.map.get(ITestCase_Behavior.call_getClassName_1216136193905(testCase));
      if (testCaseTreeNode == null) {
        testCaseTreeNode = new TestCaseTreeNode(this.operationContext, testCase);
      }
      testCaseTreeNode.removeAllChildren();
      boolean hasFailedTest = false;
      for (SNode method : ListSequence.fromList(MapSequence.fromMap(this.state.getTestsMap()).get(testCase))) {
        TestMethodTreeNode oldMethodTreeNode = this.map.get(ITestCase_Behavior.call_getClassName_1216136193905(testCase), ITestMethod_Behavior.call_getTestName_1216136419751(method));
        TestMethodTreeNode newMethodTreeNode = new TestMethodTreeNode(this.operationContext, method);
        TestMethodTreeNode methodTreeNode = (oldMethodTreeNode == null ?
          newMethodTreeNode :
          oldMethodTreeNode
        );
        boolean isFailedMethod = isFailed(methodTreeNode);
        hasFailedTest = hasFailedTest || isFailedMethod;
        if (this.isAllTree || isFailedMethod) {
          if (methodTreeNode == null) {
            continue;
          }
          testCaseTreeNode.add(methodTreeNode);
          temp.put(testCase, method, methodTreeNode);
        } else {
          temp.put(testCase, method, methodTreeNode);
        }
      }
      if (this.isAllTree || hasFailedTest) {
        root.add(testCaseTreeNode);
        temp.put(testCase, testCaseTreeNode);
      } else {
        temp.put(testCase, testCaseTreeNode);
      }
    }
    this.map = temp;
    return root;
  }

  public boolean hasFailedTests() {
    for (final SNode testCase : SetSequence.fromSet(MapSequence.fromMap(this.state.getTestsMap()).keySet())) {
      if ((testCase == null)) {
        continue;
      }
      for (final SNode method : ListSequence.fromList(MapSequence.fromMap(this.state.getTestsMap()).get(testCase))) {
        final Wrappers._T<String> className = new Wrappers._T<String>();
        final Wrappers._T<String> methodName = new Wrappers._T<String>();
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            className.value = ITestCase_Behavior.call_getClassName_1216136193905(testCase);
            methodName.value = ITestMethod_Behavior.call_getTestName_1216136419751(method);
          }
        });
        TestMethodTreeNode treeNode = this.map.get(className.value, methodName.value);
        if ((method == null)) {
          continue;
        }
        if (!(isPassed(treeNode))) {
          return true;
        }
      }
    }
    return false;
  }

  public void hidePassed(boolean hide) {
    this.isAllTree = !(hide);
    this.rebuildNow();
    this.expandAll();
  }

  public void buildFailedTestTree() {
    this.isAllTree = false;
    this.rebuildNow();
  }

  public List<String> getMethodName() {
    List<String> result = ListSequence.fromList(new ArrayList<String>());
    for (List<SNode> values : MapSequence.fromMap(this.state.getTestsMap()).values()) {
      for (SNode value : values) {
        ListSequence.fromList(result).addElement(ITestMethod_Behavior.call_getTestName_1216136419751(value));
      }
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
    for (final SNode testCase : SetSequence.fromSet(MapSequence.fromMap(this.state.getTestsMap()).keySet())) {
      for (final SNode method : ListSequence.fromList(MapSequence.fromMap(this.state.getTestsMap()).get(testCase))) {
        final Wrappers._T<String> className = new Wrappers._T<String>();
        final Wrappers._T<String> methodName = new Wrappers._T<String>();
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            className.value = ITestCase_Behavior.call_getClassName_1216136193905(testCase);
            methodName.value = ITestMethod_Behavior.call_getTestName_1216136419751(method);
          }
        });
        TestMethodTreeNode testMethodTreeNode = this.map.get(className.value, methodName.value);
        if (isFailed(testMethodTreeNode)) {
          this.setCurrentNode(testMethodTreeNode);
          return;
        }
      }
    }
  }

  public JUnitTestActionOptions_PreferencesComponent getPreferences() {
    return this.myProject.getPluginManager().getPrefsComponent(JUnitTestActionOptions_PreferencesComponent.class);
  }

  public static boolean isFailed(MPSTreeNode node) {
    if (node == null || !(node.isLeaf())) {
      return false;
    }
    TestMethodTreeNode leaf = (TestMethodTreeNode) node;
    TestState state = leaf.getState();
    return state.equals(TestState.ERROR) || state.equals(TestState.FAILED);
  }

  public static boolean isPassed(TestMethodTreeNode method) {
    if (method == null) {
      return true;
    }
    return method.getState() != null && method.getState().equals(TestState.PASSED);
  }
}
