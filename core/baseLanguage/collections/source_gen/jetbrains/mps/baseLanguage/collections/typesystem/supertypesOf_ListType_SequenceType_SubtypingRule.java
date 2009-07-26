package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_ListType_SequenceType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public supertypesOf_ListType_SequenceType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode type, TypeCheckingContext typeCheckingContext) {
    return new _Quotations.QuotationClass_27().createNode(SLinkOperations.getTarget(type, "elementType", true), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ListType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
