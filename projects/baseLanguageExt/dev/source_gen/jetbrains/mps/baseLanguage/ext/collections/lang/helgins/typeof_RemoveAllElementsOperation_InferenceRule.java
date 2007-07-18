package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_RemoveAllElementsOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_RemoveAllElementsOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode expectedElementType = RulesFunctions_Collections.get_inputListType_elementType(argument);
    if(!(expectedElementType != null)) {
      TypeChecker.getInstance().reportTypeError(argument, "couldn't define input list element type");
    }
    // ==========
    SNode arg = SLinkOperations.getTarget(argument, "argument", true);
    if(arg != null) {
      SNode expectedArgumentType = new QuotationClass_22().createNode(expectedElementType);
      SNode actualArgumentType = TypeChecker.getInstance().getRuntimeSupport().checkedTypeOf(arg);
      if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(actualArgumentType, expectedArgumentType))) {
        TypeChecker.getInstance().reportTypeError(arg, "" + expectedArgumentType + " is expected");
      }
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.RemoveAllElementsOperation";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
