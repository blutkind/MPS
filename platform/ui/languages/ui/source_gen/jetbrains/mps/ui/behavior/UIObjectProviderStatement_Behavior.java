package jetbrains.mps.ui.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.IStatementListContainer_Behavior;
import jetbrains.mps.baseLanguage.behavior.IMethodLike_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class UIObjectProviderStatement_Behavior {
  private static Class[] PARAMETERS_5197527271413739393 = {SNode.class};
  private static Class[] PARAMETERS_5197527271413739447 = {SNode.class};
  private static Class[] PARAMETERS_5197527271413739455 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_shouldReturnValue_8923564134259848103(SNode thisNode) {
    SNode anc = SNodeOperations.getAncestorWhereConceptInList(thisNode, new String[]{"jetbrains.mps.baseLanguage.structure.IStatementListContainer", "jetbrains.mps.ui.structure.UIObjectStatement"}, false, false);
    if (!(SNodeOperations.isInstanceOf(anc, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"))) {
      return false;
    }
    if (IStatementListContainer_Behavior.call_isExecuteSynchronous_1230212745736(SNodeOperations.as(anc, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"))) {
      return false;
    }
    SNode expRT = IMethodLike_Behavior.call_getExpectedRetType_1239354342632(SNodeOperations.as(anc, "jetbrains.mps.baseLanguage.structure.IMethodLike"));
    return (expRT != null) && IMethodLike_Behavior.call_getLastStatement_1239354409446(SNodeOperations.as(anc, "jetbrains.mps.baseLanguage.structure.IMethodLike")) == thisNode && !(SNodeOperations.isInstanceOf(expRT, "jetbrains.mps.baseLanguage.structure.VoidType"));
  }

  public static SNode virtual_getContextExpression_8923564134258345446(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "context", true);
  }

  public static SNode virtual_getContainer_8923564134258257521(SNode thisNode) {
    return null;
  }

  public static boolean call_shouldReturnValue_5197527271413739393(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.UIObjectProviderStatement"), "virtual_shouldReturnValue_8923564134259848103", PARAMETERS_5197527271413739393);
  }

  public static SNode call_getContextExpression_5197527271413739447(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.UIObjectProviderStatement"), "virtual_getContextExpression_8923564134258345446", PARAMETERS_5197527271413739447);
  }

  public static SNode call_getContainer_5197527271413739455(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.UIObjectProviderStatement"), "virtual_getContainer_8923564134258257521", PARAMETERS_5197527271413739455);
  }

  public static boolean callSuper_shouldReturnValue_5197527271413739393(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.UIObjectProviderStatement"), callerConceptFqName, "virtual_shouldReturnValue_8923564134259848103", PARAMETERS_5197527271413739393);
  }

  public static SNode callSuper_getContextExpression_5197527271413739447(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.UIObjectProviderStatement"), callerConceptFqName, "virtual_getContextExpression_8923564134258345446", PARAMETERS_5197527271413739447);
  }

  public static SNode callSuper_getContainer_5197527271413739455(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.UIObjectProviderStatement"), callerConceptFqName, "virtual_getContainer_8923564134258257521", PARAMETERS_5197527271413739455);
  }
}
