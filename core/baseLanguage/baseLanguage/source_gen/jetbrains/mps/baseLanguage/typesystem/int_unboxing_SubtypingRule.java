package jetbrains.mps.baseLanguage.typesystem;

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

public class int_unboxing_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  private static SNodePointer SNODE_POINTER__4 = new SNodePointer("f:java_stub#java.lang(java.lang@java_stub)", "~Integer");

  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public int_unboxing_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode integerType, TypeCheckingContext typeCheckingContext) {
    return new int_unboxing_SubtypingRule.QuotationClass_nhleq2_a0a0a().createNode(typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new int_unboxing_SubtypingRule.Pattern_nhleq2_a0a0a0a2();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class Pattern_nhleq2_a0a0a0a2 extends GeneratedMatchingPattern implements IMatchingPattern {
    public Pattern_nhleq2_a0a0a0a2() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_pyyrzk_a0a;
        nodeToMatch_pyyrzk_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_pyyrzk_a0a.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = SNODE_POINTER__4.getNode();
          if (nodeToMatch_pyyrzk_a0a.getReferent("classifier") != referent) {
            return false;
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
    }

    public Object getFieldValue(String fieldName) {
      return null;
    }
  }

  public static class QuotationClass_nhleq2_a0a0a {
    public QuotationClass_nhleq2_a0a0a() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_nhleq2_a0a0a = null;
      {
        quotedNode_nhleq2_a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_nhleq2_a0a0a = quotedNode_nhleq2_a0a0a;
        result = quotedNode1_nhleq2_a0a0a;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_nhleq2_a0a0a = null;
      {
        quotedNode_nhleq2_a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_nhleq2_a0a0a = quotedNode_nhleq2_a0a0a;
        result = quotedNode1_nhleq2_a0a0a;
      }
      return result;
    }
  }
}
