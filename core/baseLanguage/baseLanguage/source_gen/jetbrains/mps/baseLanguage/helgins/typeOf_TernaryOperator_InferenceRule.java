package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_TernaryOperator_InferenceRule implements InferenceRule_Runtime {

  public typeOf_TernaryOperator_InferenceRule() {
  }

  public void applyRule(final SNode toe) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(toe, "condition", true);
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617400839", true), new QuotationClass_3().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617400837", false, 0);
    }
    {
      SNode _nodeToCheck_1029348928467 = toe;
      TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617400845", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(toe, "ifTrue", true), "jetbrains.mps.baseLanguage.helgins@5_0", "1215617400847", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617400843", false, 0);
    }
    {
      SNode _nodeToCheck_1029348928467 = toe;
      TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617400852", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(toe, "ifFalse", true), "jetbrains.mps.baseLanguage.helgins@5_0", "1215617400854", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617400850", false, 0);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
