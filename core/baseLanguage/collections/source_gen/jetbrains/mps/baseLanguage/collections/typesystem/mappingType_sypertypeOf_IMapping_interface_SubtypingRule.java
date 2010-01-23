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

public class mappingType_sypertypeOf_IMapping_interface_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  private static SNodePointer SNODE_POINTER8 = new SNodePointer("f:java_stub#jetbrains.mps.internal.collections.runtime(jetbrains.mps.internal.collections.runtime@java_stub)", "~IMapping");

  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public mappingType_sypertypeOf_IMapping_interface_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode ignore, TypeCheckingContext typeCheckingContext) {
    return new mappingType_sypertypeOf_IMapping_interface_SubtypingRule.QuotationClass_1359_0().createNode(((SNode) this.myMatchingPattern.getFieldValue("PatternVar_KEY")), ((SNode) this.myMatchingPattern.getFieldValue("PatternVar_VALUE")), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new mappingType_sypertypeOf_IMapping_interface_SubtypingRule.Pattern_10();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class Pattern_10 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_KEY;
    /*package*/ SNode PatternVar_VALUE;

    public Pattern_10() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_0717_0;
        nodeToMatch_0717_0 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_0717_0.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = SNODE_POINTER8.getNode();
          if (nodeToMatch_0717_0.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole0717_0 = "parameter";
          if (nodeToMatch_0717_0.getChildCount(childRole0717_0) != 2) {
            return false;
          }
          {
            this.PatternVar_KEY = null;
            SNode childVar_0717_0 = nodeToMatch_0717_0.getChildren(childRole0717_0).get(0);
            this.PatternVar_KEY = childVar_0717_0;
          }
          {
            this.PatternVar_VALUE = null;
            SNode childVar_0717_1 = nodeToMatch_0717_0.getChildren(childRole0717_0).get(1);
            this.PatternVar_VALUE = childVar_0717_1;
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
        this.PatternVar_KEY = (SNode) pattern.getFieldValue("PatternVar_KEY");
        this.PatternVar_VALUE = (SNode) pattern.getFieldValue("PatternVar_VALUE");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_KEY".equals(fieldName)) {
        return this.PatternVar_KEY;
      }
      if ("PatternVar_VALUE".equals(fieldName)) {
        return this.PatternVar_VALUE;
      }
      return null;
    }
  }

  public static class QuotationClass_1359_0 {
    public QuotationClass_1359_0() {
    }

    public SNode createNode(Object parameter_1359_0, Object parameter_1359_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1359_0 = null;
      SNode quotedNode_1359_1 = null;
      SNode quotedNode_1359_2 = null;
      {
        quotedNode_1359_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MappingType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1359_0 = quotedNode_1359_0;
        {
          quotedNode_1359_1 = (SNode) parameter_1359_0;
          SNode quotedNode1_138;
          if (_parameterValues_129834374.contains(quotedNode_1359_1)) {
            quotedNode1_138 = CopyUtil.copy(quotedNode_1359_1);
          } else {
            _parameterValues_129834374.add(quotedNode_1359_1);
            quotedNode1_138 = quotedNode_1359_1;
          }
          if (quotedNode1_138 != null) {
            quotedNode_1359_0.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_138, typeCheckingContext));
          }
        }
        {
          quotedNode_1359_2 = (SNode) parameter_1359_1;
          SNode quotedNode1_139;
          if (_parameterValues_129834374.contains(quotedNode_1359_2)) {
            quotedNode1_139 = CopyUtil.copy(quotedNode_1359_2);
          } else {
            _parameterValues_129834374.add(quotedNode_1359_2);
            quotedNode1_139 = quotedNode_1359_2;
          }
          if (quotedNode1_139 != null) {
            quotedNode_1359_0.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_139, typeCheckingContext));
          }
        }
        result = quotedNode1_1359_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_1359_0, Object parameter_1359_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1359_0 = null;
      SNode quotedNode_1359_1 = null;
      SNode quotedNode_1359_2 = null;
      {
        quotedNode_1359_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MappingType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1359_0 = quotedNode_1359_0;
        {
          quotedNode_1359_1 = (SNode) parameter_1359_0;
          SNode quotedNode1_138;
          if (_parameterValues_129834374.contains(quotedNode_1359_1)) {
            quotedNode1_138 = CopyUtil.copy(quotedNode_1359_1);
          } else {
            _parameterValues_129834374.add(quotedNode_1359_1);
            quotedNode1_138 = quotedNode_1359_1;
          }
          if (quotedNode1_138 != null) {
            quotedNode_1359_0.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_138));
          }
        }
        {
          quotedNode_1359_2 = (SNode) parameter_1359_1;
          SNode quotedNode1_139;
          if (_parameterValues_129834374.contains(quotedNode_1359_2)) {
            quotedNode1_139 = CopyUtil.copy(quotedNode_1359_2);
          } else {
            _parameterValues_129834374.add(quotedNode_1359_2);
            quotedNode1_139 = quotedNode_1359_2;
          }
          if (quotedNode1_139 != null) {
            quotedNode_1359_0.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_139));
          }
        }
        result = quotedNode1_1359_0;
      }
      return result;
    }
  }
}
