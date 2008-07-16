package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.ComparisonRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class any_type_comparable_with_nulltype_ComparisonRule extends ComparisonRule_Runtime {

  public any_type_comparable_with_nulltype_ComparisonRule() {
  }

  public boolean areComparable(SNode node1, SNode node2) {
    if (SNodeOperations.isInstanceOf(node1, "jetbrains.mps.baseLanguage.structure.PrimitiveType")) {
      return false;
    }
    return true;
  }

  public boolean isWeak() {
    return true;
  }

  public boolean isApplicable1(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableConceptFQName1());
  }

  public boolean isApplicable2(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableConceptFQName2());
  }

  public String getApplicableConceptFQName1() {
    return "jetbrains.mps.core.structure.BaseConcept";
  }

  public String getApplicableConceptFQName2() {
    return "jetbrains.mps.baseLanguage.structure.NullType";
  }

}
