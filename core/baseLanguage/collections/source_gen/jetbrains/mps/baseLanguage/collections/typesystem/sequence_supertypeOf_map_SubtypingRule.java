package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class sequence_supertypeOf_map_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public sequence_supertypeOf_map_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode mapType, TypeCheckingContext typeCheckingContext) {
    SNode mappingType = new _Quotations.QuotationClass_171().createNode(SLinkOperations.getTarget(mapType, "keyType", true), SLinkOperations.getTarget(mapType, "valueType", true), typeCheckingContext);
    return new _Quotations.QuotationClass_172().createNode(mappingType, typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.MapType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
