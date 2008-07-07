package jetbrains.mps.matrixLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MatrixDivExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_MatrixDivExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    final SNode v_typevar_1210172745581 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210172745586", true), TypeChecker.getInstance().getEquationManager().getRepresentator(v_typevar_1210172745581), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins", "1210172745582");
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(nodeToCheck, "leftExpression", true);
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210172745592", true), TypeChecker.getInstance().getEquationManager().getRepresentator(v_typevar_1210172745581), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins", "1210172745588");
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(nodeToCheck, "rightExpression", true);
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210152315158", true), new QuotationClass_3().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins", "1210152315156", false, 0);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.matrixLanguage.structure.MatrixDivExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
