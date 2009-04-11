package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.typesystem._Quotations;
import jetbrains.mps.smodel.SModelUtil_new;

public class int_extends_long_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public int_extends_long_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode intType) {
    return new _Quotations.QuotationClass_45().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.IntegerType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
