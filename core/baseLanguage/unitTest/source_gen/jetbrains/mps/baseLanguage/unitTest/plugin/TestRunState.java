package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.IOperationContext;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestEvent;

public class TestRunState {
  private static final Object lock = new Object();

  private TestStatisticsModel statisticsModel;
  private List<String> testMethods = ListSequence.fromList(new ArrayList<String>());
  private String curClass;
  private String curMethod;
  private String curToken;
  private String loseTest;
  private String loseMethod;
  private int totalTests = 0;
  private int completedTests = 0;
  private int defectTests = 0;
  private Set<TestView> viewList = SetSequence.fromSet(new HashSet<TestView>());

  public TestRunState(TestStatisticsModel statisticsModel) {
    this.statisticsModel = statisticsModel;
  }

  private void updateView() {
    for (TestView view : this.viewList) {
      view.update();
    }
  }

  public void addView(TestView testView) {
    SetSequence.fromSet(this.viewList).addElement(testView);
  }

  public void startTest(String className, String methodName) {
    if (className.equals(this.curClass) && methodName.equals(this.curMethod)) {
      return;
    }
    synchronized (lock) {
      this.curClass = className;
      this.curMethod = methodName;
      this.completedTests++;
      this.updateView();
    }
  }

  public void endTest() {
    synchronized (lock) {
      this.updateView();
      this.curClass = null;
      this.curMethod = null;
    }
  }

  public void defectTest() {
    synchronized (lock) {
      this.defectTests++;
      this.updateView();
    }
  }

  public void loseTest(String test, String method) {
    synchronized (lock) {
      this.loseTest = test;
      this.loseMethod = method;
      this.updateView();
    }
  }

  public void setTests(IOperationContext operationContext, Map<SNode, List<SNode>> tests) {
    this.statisticsModel.setTests(tests);
    for (SNode testCase : MapSequence.fromMap(tests).keySet()) {
      for (SNode testMethod : MapSequence.fromMap(tests).get(testCase)) {
        ListSequence.fromList(this.testMethods).addElement(ITestCase_Behavior.call_getClassName_1216136193905(testCase) + '.' + ITestMethod_Behavior.call_getTestName_1216136419751(testMethod));
      }
    }
    this.totalTests = ListSequence.fromList(this.testMethods).count();
  }

  public boolean isLastTestCase() {
    if (ListSequence.fromList(this.testMethods).count() <= 1) {
      return true;
    }
    String testCaseName = null;
    synchronized (this.testMethods) {
      for (String testMethod : this.testMethods) {
        String nextTestCaseName = testMethod.substring(0, testMethod.lastIndexOf("."));
        if (EqualUtil.equals(testCaseName, nextTestCaseName) || testCaseName == null) {
          testCaseName = nextTestCaseName;
        } else {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isCompletedTest(String testCase, String testMethod) {
    return !(ListSequence.fromList(this.testMethods).contains(testCase + '.' + testMethod));
  }

  public List<String> getCurrentLostTests(TestEvent event) {
    return this.getCurrentLostTests(event.getTestCaseName(), event.getTestMethodName(), event.getToken());
  }

  public void completeTestEvent(TestEvent event) {
    String token = event.getToken();
    if (token.equals(TestEvent.END_TEST_PREFIX) || token.equals(TestEvent.ERROR_TEST_SUFFIX) || token.equals(TestEvent.FAILURE_TEST_SUFFIX)) {
      String testClassName = event.getTestCaseName();
      String testMethodName = event.getTestMethodName();
      String key = testClassName + '.' + testMethodName;
      synchronized (this.testMethods) {
        if (ListSequence.fromList(this.testMethods).contains(key)) {
          ListSequence.fromList(this.testMethods).removeElement(key);
        }
      }
    }
  }

  public List<String> getCurrentLostTests(String testClassName, String testMethodName, String token) {
    List<String> list = ListSequence.fromList(new ArrayList<String>());
    String key = testClassName + '.' + testMethodName;
    if (!(token.equals(TestEvent.END_TEST_PREFIX) || token.equals(TestEvent.ERROR_TEST_SUFFIX) || token.equals(TestEvent.FAILURE_TEST_SUFFIX))) {
      int indexOfMethod = ListSequence.fromList(this.testMethods).indexOf(key);
      if (indexOfMethod > 0) {
        for (int i = 0; i < indexOfMethod; i++) {
          String currentTestMethod = ListSequence.fromList(this.testMethods).getElement(i);
          if (ListSequence.fromList(list).contains(currentTestMethod)) {
            continue;
          }
          String currentClassName = currentTestMethod.substring(0, currentTestMethod.lastIndexOf("."));
          if (currentClassName.equals(testClassName) && !(this.isLastTestCase())) {
            continue;
          }
          ListSequence.fromList(list).addElement(currentTestMethod);
        }
      }
    }
    return list;
  }

  public int getTotalTests() {
    return this.totalTests;
  }

  public int getDefectTests() {
    return this.defectTests;
  }

  public int getCompletedTests() {
    return this.completedTests;
  }

  public String getCurrentClass() {
    return this.curClass;
  }

  public String getCurrentMethod() {
    return this.curMethod;
  }

  public void setToken(String token) {
    this.curToken = token;
  }

  public String getToken() {
    return this.curToken;
  }

  public String getLoseMethod() {
    return this.loseMethod;
  }

  public String getLoseClass() {
    return this.loseTest;
  }

  public TestMethodRow getTestMethodRow(String className, String methodName) {
    return this.statisticsModel.getRow(className, methodName);
  }

  public void updateTestMethodRow(TestMethodRow row) {
    this.statisticsModel.updateRow(row);
  }
}
