package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.Pattern_1;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_56;

public class supertypesOf_ClassifierTypeSModel_SModelType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */Pattern_1 myMatchingPattern;

  public  supertypesOf_ClassifierTypeSModel_SModelType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode type) {
    return new QuotationClass_56().createNode();
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }
  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new Pattern_1();
    return this.myMatchingPattern.match(argument);
  }
  public boolean isSupertyping() {
    return false;
  }
  public boolean isWeak() {
    return true;
  }
}
