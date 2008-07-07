package jetbrains.mps.matrixLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MatrixType_InferenceRule implements InferenceRule_Runtime {

  public typeof_MatrixType_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(SLinkOperations.getTarget(nodeToCheck, "scalarType", true), SLinkOperations.getTarget(new QuotationClass_4().createNode(), "descriptor", false), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins", "1210166478532", false, 0);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.matrixLanguage.structure.MatrixType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
