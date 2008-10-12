package jetbrains.mps.lang.pattern.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PropertyPatternVariableDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_PropertyPatternVariableDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.helgins)", "1202488170860", true), new QuotationClass_2().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.helgins)", "1202488174301", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
