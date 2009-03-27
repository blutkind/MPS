package jetbrains.mps.baseLanguage.dates.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.baseLanguage.dates.typesystem._Patterns;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.dates.typesystem._Quotations;

public class DateTimeType_boxing_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */_Patterns.Pattern_0 myMatchingPattern;

  public DateTimeType_boxing_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode longClassifier) {
    return new _Quotations.QuotationClass_11().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_0();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

}
