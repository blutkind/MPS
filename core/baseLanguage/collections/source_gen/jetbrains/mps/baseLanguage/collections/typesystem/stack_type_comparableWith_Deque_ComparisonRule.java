package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.ComparisonRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class stack_type_comparableWith_Deque_ComparisonRule extends ComparisonRule_Runtime {
  private static SNodePointer SNODE_POINTER_2rsa22_a0a1a0a1a2a0a0a0a0a0a3 = new SNodePointer("f:java_stub#jetbrains.mps.internal.collections.runtime.backports(jetbrains.mps.internal.collections.runtime.backports@java_stub)", "~Deque");

  /*package*/ GeneratedMatchingPattern myMatchingPattern2;

  public stack_type_comparableWith_Deque_ComparisonRule() {
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
    this.myMatchingPattern2 = new stack_type_comparableWith_Deque_ComparisonRule.Pattern_2rsa22_a0a0a0a3();
    return this.myMatchingPattern2.match(node);
  }

  public String getApplicableConceptFQName1() {
    return "jetbrains.mps.baseLanguage.collections.structure.StackType";
  }

  public String getApplicableConceptFQName2() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public static class Pattern_2rsa22_a0a0a0a3 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_ELEMENT_TYPE;

    public Pattern_2rsa22_a0a0a0a3() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_h34l93_a0a;
        nodeToMatch_h34l93_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_h34l93_a0a.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = SNODE_POINTER_2rsa22_a0a1a0a1a2a0a0a0a0a0a3.getNode();
          if (nodeToMatch_h34l93_a0a.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole_h34l93_ = "parameter";
          if (nodeToMatch_h34l93_a0a.getChildCount(childRole_h34l93_) != 1) {
            return false;
          }
          {
            this.PatternVar_ELEMENT_TYPE = null;
            SNode childVar_h34l93_a0a0 = nodeToMatch_h34l93_a0a.getChildren(childRole_h34l93_).get(0);
            this.PatternVar_ELEMENT_TYPE = childVar_h34l93_a0a0;
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
        this.PatternVar_ELEMENT_TYPE = (SNode) pattern.getFieldValue("PatternVar_ELEMENT_TYPE");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_ELEMENT_TYPE".equals(fieldName)) {
        return this.PatternVar_ELEMENT_TYPE;
      }
      return null;
    }

    public void performActions() {
      throw new RuntimeException("NOT IMPLEMENTED");
    }
  }
}
