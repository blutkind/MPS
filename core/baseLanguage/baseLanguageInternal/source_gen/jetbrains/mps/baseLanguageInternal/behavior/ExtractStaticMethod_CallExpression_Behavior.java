package jetbrains.mps.baseLanguageInternal.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ExtractStaticMethod_CallExpression_Behavior {
  private static Class[] PARAMETERS_3585982959253821899 = {SNode.class, String.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode bmd : ExtractStaticMethod_CallExpression_Behavior.getMethods_5857910569715993654(thisNode)) {
      if (SPropertyOperations.getString(SNodeOperations.cast(bmd, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), "name").equals(methodName)) {
        ListSequence.fromList(result).addElement(SNodeOperations.cast(bmd, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"));
      }
    }
    return result;
  }

  public static SNode call_getContainingExtractExpr_8881995820265485533(SNode thisNode) {
    for (SNode es : SNodeOperations.getAncestors(thisNode, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethodExpression", false)) {
      if (SLinkOperations.getTarget(es, "method", true) == SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false)) {
        return es;
      }
    }
    return null;
  }

  public static List<SNode> call_getAvailableMethodDeclarations_3585982959253821899(SNode thisNode, String methodName) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (List<SNode>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethod_CallExpression"), "virtual_getAvailableMethodDeclarations_5776618742611315379", PARAMETERS_3585982959253821899, methodName);
  }

  public static List<SNode> callSuper_getAvailableMethodDeclarations_3585982959253821899(SNode thisNode, String callerConceptFqName, String methodName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethod_CallExpression"), callerConceptFqName, "virtual_getAvailableMethodDeclarations_5776618742611315379", PARAMETERS_3585982959253821899, methodName);
  }

  public static List<SNode> getMethods_5857910569715993654(SNode context) {
    List<SNode> smd = new ArrayList<SNode>();
    for (SNode es : SNodeOperations.getAncestors(context, "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethodExpression", true)) {
      ListSequence.fromList(smd).addElement(SLinkOperations.getTarget(es, "method", true));
    }
    return smd;
  }
}
