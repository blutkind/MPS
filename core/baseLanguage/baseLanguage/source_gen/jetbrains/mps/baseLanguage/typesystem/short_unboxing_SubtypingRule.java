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

public class short_unboxing_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  private static SNodePointer SNODE_POINTER7 = new SNodePointer("f:java_stub#java.lang(java.lang@java_stub)", "~Short");

  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public short_unboxing_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode shortType, TypeCheckingContext typeCheckingContext) {
    return new short_unboxing_SubtypingRule.QuotationClass_5879_0().createNode(typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new short_unboxing_SubtypingRule.Pattern_7();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class Pattern_7 extends GeneratedMatchingPattern implements IMatchingPattern {
    public Pattern_7() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_2669_0;
        nodeToMatch_2669_0 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_2669_0.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = SNODE_POINTER7.getNode();
          if (nodeToMatch_2669_0.getReferent("classifier") != referent) {
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

  public static class QuotationClass_5879_0 {
    public QuotationClass_5879_0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5879_0 = null;
      {
        quotedNode_5879_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ShortType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5879_0 = quotedNode_5879_0;
        result = quotedNode1_5879_0;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5879_0 = null;
      {
        quotedNode_5879_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ShortType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5879_0 = quotedNode_5879_0;
        result = quotedNode1_5879_0;
      }
      return result;
    }
  }
}
