package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ArrayLiteral_InferenceRule implements InferenceRule_Runtime {

  public typeof_ArrayLiteral_InferenceRule() {
  }

  public void applyRule(final SNode arrayLiteral) {
    final SNode elementType_typevar_1188221443596 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    for(SNode item : SLinkOperations.getTargets(arrayLiteral, "item", true)) {
      {
        SNode _nodeToCheck_1029348928467 = arrayLiteral;
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1188221443596), TypeChecker.getInstance().getRuntimeSupport().typeOf(item, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1188221461717", true), _nodeToCheck_1029348928467, null, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1188221461712", false, 0, intentionProvider);
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = arrayLiteral;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(arrayLiteral, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1188221454647", true), new QuotationClass_63().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1188221443596)), _nodeToCheck_1029348928467, null, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1188221467376", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayLiteral";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
