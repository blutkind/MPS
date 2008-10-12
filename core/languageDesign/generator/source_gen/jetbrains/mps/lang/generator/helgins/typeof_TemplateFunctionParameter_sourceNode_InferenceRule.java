package jetbrains.mps.lang.generator.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TemplateFunctionParameter_sourceNode_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_TemplateFunctionParameter_sourceNode_InferenceRule() {
  }

  public void applyRule(final SNode sourceNode, final TypeCheckingContext typeCheckingContext) {
    QueriesUtil.equate_templateFunction_inputNodeType(typeCheckingContext, sourceNode, typeCheckingContext.typeOf(sourceNode, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.helgins)", "1206286439885", true));
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
