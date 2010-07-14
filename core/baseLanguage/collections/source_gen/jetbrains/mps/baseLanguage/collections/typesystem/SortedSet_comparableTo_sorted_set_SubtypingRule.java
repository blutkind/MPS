package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class SortedSet_comparableTo_sorted_set_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  private static SNodePointer SNODE_POINTER_9omwya_a0a1a0a1a2a0a0a0a0a0a2 = new SNodePointer("f:java_stub#java.util(java.util@java_stub)", "~SortedSet");

  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public SortedSet_comparableTo_sorted_set_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode sortedSet, TypeCheckingContext typeCheckingContext) {
    return new SortedSet_comparableTo_sorted_set_SubtypingRule.QuotationClass_9omwya_a0a0a().createNode(((SNode) this.myMatchingPattern.getFieldValue("PatternVar_ELEMENT")), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new SortedSet_comparableTo_sorted_set_SubtypingRule.Pattern_9omwya_a0a0a0a2();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_9omwya_a0a0a {
    public QuotationClass_9omwya_a0a0a() {
    }

    public SNode createNode(Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedSetType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4, typeCheckingContext));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedSetType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class Pattern_9omwya_a0a0a0a2 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_ELEMENT;

    public Pattern_9omwya_a0a0a0a2() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_h9rz5k_a0a;
        nodeToMatch_h9rz5k_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_h9rz5k_a0a.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = SNODE_POINTER_9omwya_a0a1a0a1a2a0a0a0a0a0a2.getNode();
          if (nodeToMatch_h9rz5k_a0a.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole_h9rz5k_ = "parameter";
          if (nodeToMatch_h9rz5k_a0a.getChildCount(childRole_h9rz5k_) != 1) {
            return false;
          }
          {
            SNode childVar_h9rz5k_a0a0 = nodeToMatch_h9rz5k_a0a.getChildren(childRole_h9rz5k_).get(0);
            this.PatternVar_ELEMENT = childVar_h9rz5k_a0a0;
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
