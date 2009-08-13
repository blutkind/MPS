package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class sequence_supertypeOf_stack_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public sequence_supertypeOf_stack_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode stackType, TypeCheckingContext typeCheckingContext) {
    return new _Quotations.QuotationClass_176().createNode(SLinkOperations.getTarget(stackType, "elementType", true), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.StackType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
