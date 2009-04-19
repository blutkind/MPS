package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.lang.smodel.typesystem._Patterns;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.typesystem._Quotations;

public class supertypesOf_SNodeType_SConceptType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */_Patterns.Pattern_4 myMatchingPattern;

  public supertypesOf_SNodeType_SConceptType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode node) {
    return new _Quotations.QuotationClass_70().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SNodeType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_4();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return false;
  }

}
