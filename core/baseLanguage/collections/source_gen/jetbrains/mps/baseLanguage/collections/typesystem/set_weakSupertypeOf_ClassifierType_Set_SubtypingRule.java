package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class set_weakSupertypeOf_ClassifierType_Set_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  private static SNodePointer SNODE_POINTER3 = new SNodePointer("f:java_stub#java.util(java.util@java_stub)", "~Set");

  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public set_weakSupertypeOf_ClassifierType_Set_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode set, TypeCheckingContext typeCheckingContext) {
    return new set_weakSupertypeOf_ClassifierType_Set_SubtypingRule.QuotationClass_7926_0().createNode(((SNode) this.myMatchingPattern.getFieldValue("PatternVar_elementType")), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new set_weakSupertypeOf_ClassifierType_Set_SubtypingRule.Pattern_3();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class Pattern_3 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_elementType;

    public Pattern_3() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_5722_0;
        nodeToMatch_5722_0 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_5722_0.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = SNODE_POINTER3.getNode();
          if (nodeToMatch_5722_0.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole5722_0 = "parameter";
          if (nodeToMatch_5722_0.getChildCount(childRole5722_0) != 1) {
            return false;
          }
          {
            this.PatternVar_elementType = null;
            SNode childVar_5722_0 = nodeToMatch_5722_0.getChildren(childRole5722_0).get(0);
            this.PatternVar_elementType = childVar_5722_0;
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
        this.PatternVar_elementType = (SNode) pattern.getFieldValue("PatternVar_elementType");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_elementType".equals(fieldName)) {
        return this.PatternVar_elementType;
      }
      return null;
    }
  }

  public static class QuotationClass_7926_0 {
    public QuotationClass_7926_0() {
    }

    public SNode createNode(Object parameter_7926_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7926_0 = null;
      SNode quotedNode_7926_1 = null;
      {
        quotedNode_7926_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SetType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7926_0 = quotedNode_7926_0;
        {
          quotedNode_7926_1 = (SNode) parameter_7926_0;
          SNode quotedNode1_7926_1;
          if (_parameterValues_129834374.contains(quotedNode_7926_1)) {
            quotedNode1_7926_1 = CopyUtil.copy(quotedNode_7926_1);
          } else {
            _parameterValues_129834374.add(quotedNode_7926_1);
            quotedNode1_7926_1 = quotedNode_7926_1;
          }
          if (quotedNode1_7926_1 != null) {
            quotedNode_7926_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_7926_1, typeCheckingContext));
          }
        }
        result = quotedNode1_7926_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_7926_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7926_0 = null;
      SNode quotedNode_7926_1 = null;
      {
        quotedNode_7926_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SetType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7926_0 = quotedNode_7926_0;
        {
          quotedNode_7926_1 = (SNode) parameter_7926_0;
          SNode quotedNode1_7926_1;
          if (_parameterValues_129834374.contains(quotedNode_7926_1)) {
            quotedNode1_7926_1 = CopyUtil.copy(quotedNode_7926_1);
          } else {
            _parameterValues_129834374.add(quotedNode_7926_1);
            quotedNode1_7926_1 = quotedNode_7926_1;
          }
          if (quotedNode1_7926_1 != null) {
            quotedNode_7926_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_7926_1));
          }
        }
        result = quotedNode1_7926_0;
      }
      return result;
    }
  }
}
