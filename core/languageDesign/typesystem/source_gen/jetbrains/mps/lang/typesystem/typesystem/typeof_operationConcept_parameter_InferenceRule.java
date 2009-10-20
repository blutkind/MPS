package jetbrains.mps.lang.typesystem.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_operationConcept_parameter_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_operationConcept_parameter_InferenceRule() {
  }

  public void applyRule(final SNode concept_parameter, final TypeCheckingContext typeCheckingContext) {
    SNode typeRule = SNodeOperations.getAncestor(concept_parameter, "jetbrains.mps.lang.typesystem.structure.AbstractOverloadedOpsTypeRule", false, false);
    if ((typeRule != null)) {
      {
        SNode _nodeToCheck_1029348928467 = concept_parameter;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.typesystem)", "1236083449677", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.typesystem)", "1236083449688", true), (SNode)new _Quotations.QuotationClass_34().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(typeRule, "operationConcept", true), "concept", false), typeCheckingContext), info);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.typesystem.structure.Operation_parameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
