package jetbrains.accounting.money.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MoneyCreator_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_MoneyCreator_InferenceRule() {
  }

  public void applyRule(final SNode moneyCreator, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = moneyCreator;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(moneyCreator, "r:00000000-0000-4000-0000-011c895903f6(jetbrains.accounting.money.helgins)", "1187621956855", true), new QuotationClass_8().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903f6(jetbrains.accounting.money.helgins)", "1187621962983", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.accounting.money.structure.MoneyCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
