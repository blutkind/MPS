package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class sequence_supertypeOf_set_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ _Patterns.Pattern_4 myMatchingPattern;

  public sequence_supertypeOf_set_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode set, TypeCheckingContext typeCheckingContext) {
    return new sequence_supertypeOf_set_SubtypingRule.QuotationClass_2757_0().createNode(this.myMatchingPattern.PatternVar5, typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SetType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_4();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_2757_0 {
    public QuotationClass_2757_0() {
    }

    public SNode createNode(Object parameter_2757_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_165 = null;
      SNode quotedNode_166 = null;
      {
        quotedNode_165 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_165 = quotedNode_165;
        {
          quotedNode_166 = (SNode) parameter_2757_0;
          SNode quotedNode1_166;
          if (_parameterValues_129834374.contains(quotedNode_166)) {
            quotedNode1_166 = CopyUtil.copy(quotedNode_166);
          } else {
            _parameterValues_129834374.add(quotedNode_166);
            quotedNode1_166 = quotedNode_166;
          }
          if (quotedNode1_166 != null) {
            quotedNode_165.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_166, typeCheckingContext));
          }
        }
        result = quotedNode1_165;
      }
      return result;
    }

    public SNode createNode(Object parameter_2757_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_165 = null;
      SNode quotedNode_166 = null;
      {
        quotedNode_165 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_165 = quotedNode_165;
        {
          quotedNode_166 = (SNode) parameter_2757_0;
          SNode quotedNode1_166;
          if (_parameterValues_129834374.contains(quotedNode_166)) {
            quotedNode1_166 = CopyUtil.copy(quotedNode_166);
          } else {
            _parameterValues_129834374.add(quotedNode_166);
            quotedNode1_166 = quotedNode_166;
          }
          if (quotedNode1_166 != null) {
            quotedNode_165.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_166));
          }
        }
        result = quotedNode1_165;
      }
      return result;
    }
  }
}
