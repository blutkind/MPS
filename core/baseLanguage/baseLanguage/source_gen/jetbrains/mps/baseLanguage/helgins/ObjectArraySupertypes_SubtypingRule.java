package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.CollectionUtil;

public class ObjectArraySupertypes_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */Pattern_9 myMatchingPattern;

  public ObjectArraySupertypes_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode objectArrayType) {
    // see JLS 3.0
    return CollectionUtil.asList(new QuotationClass_75().createNode(), new QuotationClass_76().createNode(), new QuotationClass_77().createNode());
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new Pattern_9();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return false;
  }

}
