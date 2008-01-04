package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_GetIndexOfOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_GetIndexOfOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    SNode input = RulesFunctions_Collections.getInput(op);
    final SNode elementType_typevar_1184856779488 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(input, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1184856761975", true), new QuotationClass_27().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1184856779488)), input, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1184856768419");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(op, "argument", true), "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1184856800100", true), TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1184856779488), SLinkOperations.getTarget(op, "argument", true), null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1184856809408");
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1184856710777", true), new QuotationClass_28().createNode(), op, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1184856713865");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetIndexOfOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
