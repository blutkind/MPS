package jetbrains.mps.lang.typesystem.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SimpleRule_Annotated_Parameter_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_SimpleRule_Annotated_Parameter_InferenceRule() {
  }

  public void applyRule(final SNode parameter, final TypeCheckingContext typeCheckingContext) {
    SNode conceptDeclaration = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getAncestor(parameter, "jetbrains.mps.lang.typesystem.structure.SimpleRule_Annotated", false, false), "conceptReference", true), "concept", false);
    if ((conceptDeclaration == null)) {
      {
        SNode _nodeToCheck_1029348928467 = parameter;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation(typeCheckingContext.typeOf(parameter, "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1223036518148", true), new QuotationClass_28().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1223036522704", intentionProvider);
      }
    } else
    {
      {
        SNode _nodeToCheck_1029348928467 = parameter;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation(typeCheckingContext.typeOf(parameter, "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1223036446544", true), new QuotationClass_29().createNode(conceptDeclaration), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1223036547395", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.typesystem.structure.SimpleRule_Annotated_Parameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
