package jetbrains.mps.baseLanguage.unitTest.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ITestCase_Behavior {
  private static Class[] PARAMETERS_1216130724401 = {SNode.class};
  private static Class[] PARAMETERS_1216136193905 = {SNode.class};
  private static Class[] PARAMETERS_1229278847513 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getClassName_1216136193905(SNode thisNode) {
    return thisNode.getModel().getLongName() + "." + ITestCase_Behavior.call_getSimpleClassName_1229278847513(thisNode);
  }

  public static String virtual_getSimpleClassName_1229278847513(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "name") + "_Test";
  }

  public static List<String> virtual_getParametersPart_1215620460293(SNode thisNode) {
    List<String> list = new ArrayList<String>();
    ListSequence.fromList(list).addElement("-c");
    ListSequence.fromList(list).addElement(ITestCase_Behavior.call_getClassName_1216136193905(thisNode));
    return list;
  }

  public static List<SNode> call_getTestSet_1216130724401(SNode thisNode) {
    return (List<SNode>)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getTestSet_1216130724401", PARAMETERS_1216130724401);
  }

  public static String call_getClassName_1216136193905(SNode thisNode) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getClassName_1216136193905", PARAMETERS_1216136193905);
  }

  public static String call_getSimpleClassName_1229278847513(SNode thisNode) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getSimpleClassName_1229278847513", PARAMETERS_1229278847513);
  }

  public static List<SNode> callSuper_getTestSet_1216130724401(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getTestSet_1216130724401", PARAMETERS_1216130724401);
  }

  public static String callSuper_getClassName_1216136193905(SNode thisNode, String callerConceptFqName) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getClassName_1216136193905", PARAMETERS_1216136193905);
  }

  public static String callSuper_getSimpleClassName_1229278847513(SNode thisNode, String callerConceptFqName) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getSimpleClassName_1229278847513", PARAMETERS_1229278847513);
  }

}
