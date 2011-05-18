package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.pattern.runtime.PatternUtil;

public class supertypesOf_ClassifierType_Iterator_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  private static SNodePointer SNODE_POINTER_36aa7y_a0a0a0a0b0c0a0a0a0a0a0c = new SNodePointer("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~Iterator");

  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public supertypesOf_ClassifierType_Iterator_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode iterator, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return new supertypesOf_ClassifierType_Iterator_SubtypingRule.QuotationClass_36aa7y_a0a0a().createNode(((SNode) status.getPattern().getFieldValue("patternVar_p")), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      GeneratedMatchingPattern pattern = new supertypesOf_ClassifierType_Iterator_SubtypingRule.Pattern_36aa7y_a0a0a0a2();
      this.myMatchingPattern = pattern;
      boolean b = pattern.match(argument);
      return new IsApplicableStatus(b, pattern);
    }
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_36aa7y_a0a0a {
    public QuotationClass_36aa7y_a0a0a() {
    }

    public SNode createNode(Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ContainerIteratorType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2, typeCheckingContext);
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
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ContainerIteratorType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2);
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

  public static class Pattern_36aa7y_a0a0a0a2 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_p;

    public Pattern_36aa7y_a0a0a0a2() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_supertypesOf_ClassifierType_Iterator_2lqiec_a0a;
        nodeToMatch_supertypesOf_ClassifierType_Iterator_2lqiec_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_supertypesOf_ClassifierType_Iterator_2lqiec_a0a.getConceptFqName()))) {
          return false;
        }
        {
          SNodePointer pointer = SNODE_POINTER_36aa7y_a0a0a0a0b0c0a0a0a0a0a0c;
          if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_supertypesOf_ClassifierType_Iterator_2lqiec_a0a.getReferent("classifier")))) {
            return false;
          }
        }
        {
          String childRole_supertypesOf_ClassifierType_Iterator_2lqiec_ = "parameter";
          if (nodeToMatch_supertypesOf_ClassifierType_Iterator_2lqiec_a0a.getChildCount(childRole_supertypesOf_ClassifierType_Iterator_2lqiec_) != 1) {
            return false;
          }
          {
            SNode childVar_supertypesOf_ClassifierType_Iterator_2lqiec_a0a0 = nodeToMatch_supertypesOf_ClassifierType_Iterator_2lqiec_a0a.getChildren(childRole_supertypesOf_ClassifierType_Iterator_2lqiec_).get(0);
            this.patternVar_p = childVar_supertypesOf_ClassifierType_Iterator_2lqiec_a0a0;
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
        patternVar_p = (SNode) pattern.getFieldValue("patternVar_p");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_p".equals(fieldName)) {
        return patternVar_p;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
