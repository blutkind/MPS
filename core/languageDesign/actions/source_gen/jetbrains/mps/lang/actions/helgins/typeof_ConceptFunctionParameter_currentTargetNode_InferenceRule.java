package jetbrains.mps.lang.actions.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConceptFunctionParameter_currentTargetNode_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ConceptFunctionParameter_currentTargetNode_InferenceRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext) {
    SNode builder = SNodeOperations.getAncestor(node, "jetbrains.mps.lang.actions.structure.NodeSubstituteActionsBuilder", false, false);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_2().createNode(SLinkOperations.getTarget(builder, "applicableConcept", false)), node, "r:00000000-0000-4000-0000-011c895902a6(jetbrains.mps.lang.actions.helgins)", "1180046146718");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_currentTargetNode";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
