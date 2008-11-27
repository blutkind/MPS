package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.CollectionUtil;

public class ObjectArraySupertypes_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */_Patterns.Pattern_9 myMatchingPattern;

  public ObjectArraySupertypes_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode objectArrayType) {
    // see JLS 3.0
    return CollectionUtil.list(new _Quotations.QuotationClass_80().createNode(), new _Quotations.QuotationClass_81().createNode(), new _Quotations.QuotationClass_82().createNode());
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_9();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return false;
  }

}
