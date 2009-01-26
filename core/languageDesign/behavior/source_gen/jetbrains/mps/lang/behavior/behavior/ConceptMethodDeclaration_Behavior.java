package jetbrains.mps.lang.behavior.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class ConceptMethodDeclaration_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode call_findBehaviour_1225196403947(SNode thisNode) {
    return SNodeOperations.getContainingRoot(thisNode);
  }

  public static SNode call_getOverridenMethod_1225196403956(SNode thisNode) {
    if (SLinkOperations.getTarget(thisNode, "overriddenMethod", false) != null) {
      return SLinkOperations.getTarget(thisNode, "overriddenMethod", false);
    }
    if (SPropertyOperations.getBoolean(thisNode, "isVirtual")) {
      return thisNode;
    }
    return null;
  }

  public static boolean call_isCorrectlyOverriden_1227262347923(SNode thisNode) {
    if ((SLinkOperations.getTarget(thisNode, "overriddenMethod", false) == null)) {
      return true;
    }
    if (!(MatchingUtil.matchNodes(SLinkOperations.getTarget(thisNode, "returnType", true), SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "overriddenMethod", false), "returnType", true)))) {
      return false;
    }
    int parameterCount = SLinkOperations.getCount(thisNode, "parameter");
    if (parameterCount != SLinkOperations.getCount(SLinkOperations.getTarget(thisNode, "overriddenMethod", false), "parameter")) {
      return false;
    }
    for(int i = 0 ; i < parameterCount ; i++ ) {
      if (!(MatchingUtil.matchNodes(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).getElement(i), ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "overriddenMethod", false), "parameter", true)).getElement(i)))) {
        return false;
      }
    }
    return true;
  }

  public static String call_getOverridenMethodConceptName_1225196403980(SNode thisNode) {
    SNode conceptDeclaration = SLinkOperations.getTarget(SNodeOperations.getAncestor(ConceptMethodDeclaration_Behavior.call_getOverridenMethod_1225196403956(thisNode), "jetbrains.mps.lang.behavior.structure.ConceptBehavior", false, false), "concept", false);
    return SPropertyOperations.getString(conceptDeclaration, "name");
  }

  public static String call_getGeneratedName_1225196404000(SNode thisNode) {
    SNode baseMethod = ConceptMethodDeclaration_Behavior.call_getOverridenMethod_1225196403956(thisNode);
    if (baseMethod == null) {
      return ConceptMethodDeclaration_Behavior.call_getCallerMethodName_1225196404032(thisNode);
    }
    return "virtual_" + SPropertyOperations.getString(baseMethod, "name") + "_" + baseMethod.getId();
  }

  public static String call_getCallerMethodName_1225196404032(SNode thisNode) {
    return "call_" + SPropertyOperations.getString(thisNode, "name") + "_" + thisNode.getId();
  }

  public static String call_getSuperCallerMethodName_1225196404049(SNode thisNode) {
    return "callSuper_" + SPropertyOperations.getString(thisNode, "name") + "_" + thisNode.getId();
  }

  public static boolean virtual_isAbstract_1232982539764(SNode thisNode) {
    return SPropertyOperations.getBoolean(thisNode, "isAbstract");
  }

}
