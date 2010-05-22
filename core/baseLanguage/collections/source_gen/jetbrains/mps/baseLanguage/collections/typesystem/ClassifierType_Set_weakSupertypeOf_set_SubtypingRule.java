package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class ClassifierType_Set_weakSupertypeOf_set_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public ClassifierType_Set_weakSupertypeOf_set_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode set, TypeCheckingContext typeCheckingContext) {
    return new ClassifierType_Set_weakSupertypeOf_set_SubtypingRule.QuotationClass_jipg91_a0a0a().createNode(((SNode) this.myMatchingPattern.getFieldValue("PatternVar_elementType")), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SetType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new ClassifierType_Set_weakSupertypeOf_set_SubtypingRule.Pattern_jipg91_a0a0a0a2();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_jipg91_a0a0a {
    public QuotationClass_jipg91_a0a0a() {
    }

    public SNode createNode(Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.addReference(SReference.create("classifier", quotedNode1_3, SModelReference.fromString("f:java_stub#java.util(java.util@java_stub)"), SNodeId.fromString("~Set")));
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
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_4, typeCheckingContext));
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
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.addReference(SReference.create("classifier", quotedNode1_3, SModelReference.fromString("f:java_stub#java.util(java.util@java_stub)"), SNodeId.fromString("~Set")));
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
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class Pattern_jipg91_a0a0a0a2 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_elementType;

    public Pattern_jipg91_a0a0a0a2() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_nbr2nf_a0a;
        nodeToMatch_nbr2nf_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.collections.structure.SetType".equals(nodeToMatch_nbr2nf_a0a.getConceptFqName()))) {
          return false;
        }
        {
          String childRole_nbr2nf_ = "elementType";
          if (nodeToMatch_nbr2nf_a0a.getChildCount(childRole_nbr2nf_) != 1) {
            return false;
          }
          {
            this.PatternVar_elementType = null;
            SNode childVar_nbr2nf_a0a0 = nodeToMatch_nbr2nf_a0a.getChildren(childRole_nbr2nf_).get(0);
            this.PatternVar_elementType = childVar_nbr2nf_a0a0;
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

    public void performActions() {
      throw new RuntimeException("NOT IMPLEMENTED");
    }
  }
}
