package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.StringLiteral_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_StringLiteral_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public check_StringLiteral_NonTypesystemRule() {
  }

  public void applyRule(final SNode stringLiteral) {
    if (!(StringLiteral_Behavior.call_isCorrect_1221565233201(stringLiteral))) {
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(stringLiteral, "Incorrect string literal", "r:1222094342530(jetbrains.mps.baseLanguage.helgins@21_0)", "1222095231741", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.StringLiteral";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
