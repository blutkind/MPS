package jetbrains.mps.debug.evaluation.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class EvaluatorConcept_Behavior {
  private static Class[] PARAMETERS_5211667636169798157 = {SNode.class};
  private static Class[] PARAMETERS_5211667636169798161 = {SNode.class};
  private static Class[] PARAMETERS_5211667636169798165 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getThrowableTypes_6204026822016975623(SNode thisNode) {
    return new ArrayList<SNode>();
  }

  public static SNode virtual_getBody_1239354440022(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "evaluatedStatements", true);
  }

  public static SNode virtual_getExpectedRetType_1239354342632(SNode thisNode) {
    return new EvaluatorConcept_Behavior.QuotationClass_29c8r0_a0a0d().createNode();
  }

  public static List<SNode> call_getThrowableTypes_5211667636169798157(SNode thisNode) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.debug.evaluation.structure.EvaluatorConcept"), "virtual_getThrowableTypes_6204026822016975623", PARAMETERS_5211667636169798157);
  }

  public static SNode call_getBody_5211667636169798161(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.debug.evaluation.structure.EvaluatorConcept"), "virtual_getBody_1239354440022", PARAMETERS_5211667636169798161);
  }

  public static SNode call_getExpectedRetType_5211667636169798165(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.debug.evaluation.structure.EvaluatorConcept"), "virtual_getExpectedRetType_1239354342632", PARAMETERS_5211667636169798165);
  }

  public static List<SNode> callSuper_getThrowableTypes_5211667636169798157(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.debug.evaluation.structure.EvaluatorConcept"), callerConceptFqName, "virtual_getThrowableTypes_6204026822016975623", PARAMETERS_5211667636169798157);
  }

  public static SNode callSuper_getBody_5211667636169798161(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.debug.evaluation.structure.EvaluatorConcept"), callerConceptFqName, "virtual_getBody_1239354440022", PARAMETERS_5211667636169798161);
  }

  public static SNode callSuper_getExpectedRetType_5211667636169798165(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.debug.evaluation.structure.EvaluatorConcept"), callerConceptFqName, "virtual_getExpectedRetType_1239354342632", PARAMETERS_5211667636169798165);
  }

  public static class QuotationClass_29c8r0_a0a0d {
    public QuotationClass_29c8r0_a0a0d() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
