package jetbrains.mps.baseLanguage.unitTest.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunParameters;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ITestable_Behavior {
  public static Class[] PARAMETERS_1215620460293 = {SNode.class};
  public static Class[] PARAMETERS_1216045139515 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static TestRunParameters virtual_getTestRunParameters_1216045139515(SNode thisNode) {
    return new TestRunParameters();
  }

  public static List<String> call_getParametersPart_1215620460293(SNode thisNode) {
    return (List<String>)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getParametersPart_1215620460293", PARAMETERS_1215620460293);
  }

  public static TestRunParameters call_getTestRunParameters_1216045139515(SNode thisNode) {
    return (TestRunParameters)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getTestRunParameters_1216045139515", PARAMETERS_1216045139515);
  }

  public static List<String> callSuper_getParametersPart_1215620460293(SNode thisNode, String callerConceptFqName) {
    return (List<String>)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getParametersPart_1215620460293", PARAMETERS_1215620460293);
  }

  public static TestRunParameters callSuper_getTestRunParameters_1216045139515(SNode thisNode, String callerConceptFqName) {
    return (TestRunParameters)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getTestRunParameters_1216045139515", PARAMETERS_1216045139515);
  }

}
