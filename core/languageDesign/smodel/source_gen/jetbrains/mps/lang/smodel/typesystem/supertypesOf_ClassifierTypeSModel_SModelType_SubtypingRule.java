package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;

public class supertypesOf_ClassifierTypeSModel_SModelType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */_Patterns.Pattern_1 myMatchingPattern;

  public supertypesOf_ClassifierTypeSModel_SModelType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode type) {
    return new _Quotations.QuotationClass_64().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_1();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

}
