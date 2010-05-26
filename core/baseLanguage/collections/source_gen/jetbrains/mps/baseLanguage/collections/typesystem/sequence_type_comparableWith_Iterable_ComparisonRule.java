package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.ComparisonRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class sequence_type_comparableWith_Iterable_ComparisonRule extends ComparisonRule_Runtime {
  private static SNodePointer SNODE_POINTER_sh3asd_a0a1a0a1a2a0a0a0a0a0a3 = new SNodePointer("f:java_stub#java.lang(java.lang@java_stub)", "~Iterable");

  /*package*/ GeneratedMatchingPattern myMatchingPattern2;

  public sequence_type_comparableWith_Iterable_ComparisonRule() {
  }

  public boolean areComparable(SNode node1, SNode node2) {
    return true;
  }

  public boolean isWeak() {
    return true;
  }

  public boolean isApplicable1(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableConceptFQName1());
  }

  public boolean isApplicable2(SNode node) {
    this.myMatchingPattern2 = new sequence_type_comparableWith_Iterable_ComparisonRule.Pattern_sh3asd_a0a0a0a3();
    return this.myMatchingPattern2.match(node);
  }

  public String getApplicableConceptFQName1() {
    return "jetbrains.mps.baseLanguage.collections.structure.SequenceType";
  }

  public String getApplicableConceptFQName2() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public static class Pattern_sh3asd_a0a0a0a3 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_ELEMENT;

    public Pattern_sh3asd_a0a0a0a3() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_wnlwmt_a0a;
        nodeToMatch_wnlwmt_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_wnlwmt_a0a.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = SNODE_POINTER_sh3asd_a0a1a0a1a2a0a0a0a0a0a3.getNode();
          if (nodeToMatch_wnlwmt_a0a.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole_wnlwmt_ = "parameter";
          if (nodeToMatch_wnlwmt_a0a.getChildCount(childRole_wnlwmt_) != 1) {
            return false;
          }
          {
            this.PatternVar_ELEMENT = null;
            SNode childVar_wnlwmt_a0a0 = nodeToMatch_wnlwmt_a0a.getChildren(childRole_wnlwmt_).get(0);
            this.PatternVar_ELEMENT = childVar_wnlwmt_a0a0;
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        this.PatternVar_ELEMENT = (SNode) pattern.getFieldValue("PatternVar_ELEMENT");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_ELEMENT".equals(fieldName)) {
        return this.PatternVar_ELEMENT;
      }
      return null;
    }

    public void performActions(Object o) {

    }
  }
}
