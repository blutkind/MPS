package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ConceptFunction_Behavior {
  private static Class[] PARAMETERS_1213877374432 = {SNode.class ,SNode.class};
  private static Class[] PARAMETERS_1213877374441 = {SNode.class};
  private static Class[] PARAMETERS_1213877374450 = {SNode.class};
  private static Class[] PARAMETERS_1216468837268 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    return SConceptPropertyOperations.getBoolean(thisNode, "usesParameterObject");
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    return ListSequence.fromList(SLinkOperations.getConceptLinkTargets(thisNode, "conceptFunctionReturnType")).first();
  }

  public static SNode virtual_getExpectedRetType_1239354342632(SNode thisNode) {
    return ConceptFunction_Behavior.call_getExpectedReturnType_1213877374441(thisNode);
  }

  public static SNode virtual_getBody_1239354440022(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "body", true);
  }

  public static List<SNode> virtual_getParameters_1213877374450(SNode thisNode) {
    if (thisNode == null) {
      return ListSequence.<SNode>fromArray();
    }
    List<SNode> result = ListOperations.<SNode>createList();
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getConceptLinkTargets(thisNode, "conceptFunctionParameter")));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getConceptLinkTargets(thisNode, "applicableConceptFunctionParameter")));
    return (List<SNode>)result;
  }

  public static String virtual_getName_1216468837268(SNode thisNode) {
    return SConceptPropertyOperations.getString(thisNode, "alias");
  }

  public static boolean call_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, thisNode, "virtual_usesParameterObjectFor_1213877374432", PARAMETERS_1213877374432, parameter);
  }

  public static SNode call_getExpectedReturnType_1213877374441(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getExpectedReturnType_1213877374441", PARAMETERS_1213877374441);
  }

  public static List<SNode> call_getParameters_1213877374450(SNode thisNode) {
    return (List<SNode>)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getParameters_1213877374450", PARAMETERS_1213877374450);
  }

  public static String call_getName_1216468837268(SNode thisNode) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getName_1216468837268", PARAMETERS_1216468837268);
  }

  public static boolean callSuper_usesParameterObjectFor_1213877374432(SNode thisNode, String callerConceptFqName, SNode parameter) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, thisNode, callerConceptFqName, "virtual_usesParameterObjectFor_1213877374432", PARAMETERS_1213877374432, parameter);
  }

  public static SNode callSuper_getExpectedReturnType_1213877374441(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getExpectedReturnType_1213877374441", PARAMETERS_1213877374441);
  }

  public static List<SNode> callSuper_getParameters_1213877374450(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getParameters_1213877374450", PARAMETERS_1213877374450);
  }

  public static String callSuper_getName_1216468837268(SNode thisNode, String callerConceptFqName) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getName_1216468837268", PARAMETERS_1216468837268);
  }

}
