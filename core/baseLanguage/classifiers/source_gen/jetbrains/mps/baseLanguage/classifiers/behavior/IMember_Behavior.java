package jetbrains.mps.baseLanguage.classifiers.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IMember_Behavior {
  private static Class[] PARAMETERS_1213877352965 = {SNode.class};
  private static Class[] PARAMETERS_1213877352972 = {SNode.class};
  private static Class[] PARAMETERS_1213877353000 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getVisiblity_1213877352965(SNode thisNode) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.PublicVisibility", null);
  }

  public static SNode virtual_getOperationConcept_1213877352972(SNode thisNode) {
    SNode memberOperationConcept = ListSequence.fromList(SLinkOperations.getConceptLinkTargets(thisNode, "operationConcept")).first();
    if (memberOperationConcept == null) {
      throw new RuntimeException("Please set operationConcept in " + SNodeOperations.getConceptDeclaration(thisNode) + " concept");
    }
    return memberOperationConcept;
  }

  public static SNode virtual_createOperation_1213877353000(SNode thisNode) {
    SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(IMember_Behavior.call_getOperationConcept_1213877352972(thisNode)), null);
    SLinkOperations.setTarget(result, "member", thisNode, false);
    return result;
  }

  public static SNode call_getContainer_1213877353020(SNode thisNode) {
    return IClassifier_Behavior.getContextClassifier_1213877527940(thisNode);
  }

  public static SNode call_getVisiblity_1213877352965(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getVisiblity_1213877352965", PARAMETERS_1213877352965);
  }

  public static SNode call_getOperationConcept_1213877352972(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getOperationConcept_1213877352972", PARAMETERS_1213877352972);
  }

  public static SNode call_createOperation_1213877353000(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_createOperation_1213877353000", PARAMETERS_1213877353000);
  }

  public static SNode callSuper_getVisiblity_1213877352965(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getVisiblity_1213877352965", PARAMETERS_1213877352965);
  }

  public static SNode callSuper_getOperationConcept_1213877352972(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getOperationConcept_1213877352972", PARAMETERS_1213877352972);
  }

  public static SNode callSuper_createOperation_1213877353000(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_createOperation_1213877353000", PARAMETERS_1213877353000);
  }

}
