package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ClassifierType_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public  check_ClassifierType_NonTypesystemRule() {
  }

  public void applyRule(final SNode argument) {
    if(!(SLinkOperations.getCount(argument, "parameter") == 0 || SLinkOperations.getCount(argument, "parameter") == SLinkOperations.getCount(SLinkOperations.getTarget(argument, "classifier", false), "typeVariableDeclaration"))) {
      TypeChecker.getInstance().reportTypeError(argument, "wrong number of type parameters", "jetbrains.mps.baseLanguage.helgins", "1195494591081");
    }
    for(SNode typeParameter : SLinkOperations.getTargets(argument, "parameter", true)) {
      if(!(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(typeParameter, SLinkOperations.getTarget(new QuotationClass_79().createNode(), "descriptor", false), false, false)))) {
        TypeChecker.getInstance().reportTypeError(typeParameter, "primitive types not allowed", "jetbrains.mps.baseLanguage.helgins", "1195494591112");
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
