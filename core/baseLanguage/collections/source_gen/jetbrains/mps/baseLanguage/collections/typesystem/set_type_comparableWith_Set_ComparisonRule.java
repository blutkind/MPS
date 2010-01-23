package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.ComparisonRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class set_type_comparableWith_Set_ComparisonRule extends ComparisonRule_Runtime {
  private static SNodePointer SNODE_POINTER10 = new SNodePointer("f:java_stub#java.util(java.util@java_stub)", "~Set");

  /*package*/ GeneratedMatchingPattern myMatchingPattern2;

  public set_type_comparableWith_Set_ComparisonRule() {
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
    this.myMatchingPattern2 = new set_type_comparableWith_Set_ComparisonRule.Pattern_12();
    return this.myMatchingPattern2.match(node);
  }

  public String getApplicableConceptFQName1() {
    return "jetbrains.mps.baseLanguage.collections.structure.SetType";
  }

  public String getApplicableConceptFQName2() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public static class Pattern_12 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_ELEMENT;

    public Pattern_12() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_9717_0;
        nodeToMatch_9717_0 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_9717_0.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = SNODE_POINTER10.getNode();
          if (nodeToMatch_9717_0.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole9717_0 = "parameter";
          if (nodeToMatch_9717_0.getChildCount(childRole9717_0) != 1) {
            return false;
          }
          {
            this.PatternVar_ELEMENT = null;
            SNode childVar_9717_0 = nodeToMatch_9717_0.getChildren(childRole9717_0).get(0);
            this.PatternVar_ELEMENT = childVar_9717_0;
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
  }
}
