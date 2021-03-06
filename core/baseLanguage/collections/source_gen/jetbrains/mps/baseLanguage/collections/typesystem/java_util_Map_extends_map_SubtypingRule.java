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

public class java_util_Map_extends_map_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  private static SNodePointer SNODE_POINTER_cwf9bn_a0a0a0a0b0c0a0a0a0a0a0c = new SNodePointer("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~Map");

  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public java_util_Map_extends_map_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode mapType, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return new java_util_Map_extends_map_SubtypingRule.QuotationClass_cwf9bn_a0a0a().createNode(((SNode) status.getPattern().getFieldValue("patternVar_keyType")), ((SNode) status.getPattern().getFieldValue("patternVar_valueType")), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      GeneratedMatchingPattern pattern = new java_util_Map_extends_map_SubtypingRule.Pattern_cwf9bn_a0a0a0a2();
      this.myMatchingPattern = pattern;
      boolean b = pattern.match(argument);
      return new IsApplicableStatus(b, pattern);
    }
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_cwf9bn_a0a0a {
    public QuotationClass_cwf9bn_a0a0a() {
    }

    public SNode createNode(Object parameter_7, Object parameter_8, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_7;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_5 = HUtil.copyIfNecessary(quotedNode_2, typeCheckingContext);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_5 = quotedNode_2;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_5, typeCheckingContext));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_8;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_6 = HUtil.copyIfNecessary(quotedNode_3, typeCheckingContext);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_6 = quotedNode_3;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_6, typeCheckingContext));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }

    public SNode createNode(Object parameter_7, Object parameter_8) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_7;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_5 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_5 = quotedNode_2;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_5));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_8;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_6 = HUtil.copyIfNecessary(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_6 = quotedNode_3;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_6));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class Pattern_cwf9bn_a0a0a0a2 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_keyType;
    /*package*/ SNode patternVar_valueType;

    public Pattern_cwf9bn_a0a0a0a2() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_java_util_Map_extends_map_4xhv5l_a0a;
        nodeToMatch_java_util_Map_extends_map_4xhv5l_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_java_util_Map_extends_map_4xhv5l_a0a.getConceptFqName()))) {
          return false;
        }
        {
          SNodePointer pointer = SNODE_POINTER_cwf9bn_a0a0a0a0b0c0a0a0a0a0a0c;
          if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_java_util_Map_extends_map_4xhv5l_a0a.getReferent("classifier")))) {
            return false;
          }
        }
        {
          String childRole_java_util_Map_extends_map_4xhv5l_ = "parameter";
          if (nodeToMatch_java_util_Map_extends_map_4xhv5l_a0a.getChildCount(childRole_java_util_Map_extends_map_4xhv5l_) != 2) {
            return false;
          }
          {
            SNode childVar_java_util_Map_extends_map_4xhv5l_a0a0 = nodeToMatch_java_util_Map_extends_map_4xhv5l_a0a.getChildren(childRole_java_util_Map_extends_map_4xhv5l_).get(0);
            this.patternVar_keyType = childVar_java_util_Map_extends_map_4xhv5l_a0a0;
          }
          {
            SNode childVar_java_util_Map_extends_map_4xhv5l_b0a0 = nodeToMatch_java_util_Map_extends_map_4xhv5l_a0a.getChildren(childRole_java_util_Map_extends_map_4xhv5l_).get(1);
            this.patternVar_valueType = childVar_java_util_Map_extends_map_4xhv5l_b0a0;
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
        patternVar_keyType = (SNode) pattern.getFieldValue("patternVar_keyType");
        patternVar_valueType = (SNode) pattern.getFieldValue("patternVar_valueType");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_keyType".equals(fieldName)) {
        return patternVar_keyType;
      }
      if ("patternVar_valueType".equals(fieldName)) {
        return patternVar_valueType;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
