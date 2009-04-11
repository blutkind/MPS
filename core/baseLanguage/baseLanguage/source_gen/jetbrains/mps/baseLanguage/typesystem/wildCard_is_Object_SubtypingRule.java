package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.typesystem._Quotations;
import jetbrains.mps.smodel.SModelUtil_new;

public class wildCard_is_Object_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public wildCard_is_Object_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode wildCardType) {
    return new _Quotations.QuotationClass_91().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.WildCardType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
