package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;

public class supertypesOf_ClassifierTypeSNode_SNodeType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */Pattern_ myMatchingPattern;

  public  supertypesOf_ClassifierTypeSNode_SNodeType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode type) {
    return new QuotationClass_59().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new Pattern_();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isSupertyping() {
    return false;
  }

  public boolean isWeak() {
    return true;
  }

}
