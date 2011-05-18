package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class supertypesOf_ListType_SNodeListType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public supertypesOf_ListType_SNodeListType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode subtype, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return new supertypesOf_ListType_SNodeListType_SubtypingRule.QuotationClass_l03ebm_a0a0a().createNode(((SNode) status.getPattern().getFieldValue("patternVar_elem")), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ListType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      GeneratedMatchingPattern pattern = new supertypesOf_ListType_SNodeListType_SubtypingRule.Pattern_l03ebm_a0a0a0a2();
      this.myMatchingPattern = pattern;
      boolean b = pattern.match(argument);
      return new IsApplicableStatus(b, pattern);
    }
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_l03ebm_a0a0a {
    public QuotationClass_l03ebm_a0a0a() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("elementConcept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("elementConcept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class Pattern_l03ebm_a0a0a0a2 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_elem;

    public Pattern_l03ebm_a0a0a0a2() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_supertypesOf_ListType_SNodeListType_iav8o_a0a;
        nodeToMatch_supertypesOf_ListType_SNodeListType_iav8o_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.collections.structure.ListType".equals(nodeToMatch_supertypesOf_ListType_SNodeListType_iav8o_a0a.getConceptFqName()))) {
          return false;
        }
        {
          String childRole_supertypesOf_ListType_SNodeListType_iav8o_ = "elementType";
          if (nodeToMatch_supertypesOf_ListType_SNodeListType_iav8o_a0a.getChildCount(childRole_supertypesOf_ListType_SNodeListType_iav8o_) != 1) {
            return false;
          }
          {
            SNode childVar_supertypesOf_ListType_SNodeListType_iav8o_a0a0 = nodeToMatch_supertypesOf_ListType_SNodeListType_iav8o_a0a.getChildren(childRole_supertypesOf_ListType_SNodeListType_iav8o_).get(0);
            {
              SNode nodeToMatch_supertypesOf_ListType_SNodeListType_iav8o_a0a0;
              nodeToMatch_supertypesOf_ListType_SNodeListType_iav8o_a0a0 = childVar_supertypesOf_ListType_SNodeListType_iav8o_a0a0;
              if (!("jetbrains.mps.lang.smodel.structure.SNodeType".equals(nodeToMatch_supertypesOf_ListType_SNodeListType_iav8o_a0a0.getConceptFqName()))) {
                return false;
              }
              patternVar_elem = nodeToMatch_supertypesOf_ListType_SNodeListType_iav8o_a0a0.getReferent("concept");
            }
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
        patternVar_elem = (SNode) pattern.getFieldValue("patternVar_elem");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_elem".equals(fieldName)) {
        return patternVar_elem;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
