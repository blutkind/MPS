package jetbrains.mps.matrixLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MatrixIndexVariableRefirence_InferenceRule implements InferenceRule_Runtime {

  public typeof_MatrixIndexVariableRefirence_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210246928078", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "variableDeclaration", false), "jetbrains.mps.matrixLanguage.helgins", "1210248952116", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins", "1210246928076");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.matrixLanguage.structure.MatrixIndexVariableRefirence";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
