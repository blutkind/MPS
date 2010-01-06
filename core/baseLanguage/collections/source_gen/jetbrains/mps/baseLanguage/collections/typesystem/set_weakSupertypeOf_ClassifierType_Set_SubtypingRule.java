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

public class set_weakSupertypeOf_ClassifierType_Set_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ _Patterns.Pattern_3 myMatchingPattern;

  public set_weakSupertypeOf_ClassifierType_Set_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode set, TypeCheckingContext typeCheckingContext) {
    return new set_weakSupertypeOf_ClassifierType_Set_SubtypingRule.QuotationClass_7926_0().createNode(this.myMatchingPattern.PatternVar4, typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_3();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_7926_0 {
    public QuotationClass_7926_0() {
    }

    public SNode createNode(Object parameter_7926_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_163 = null;
      SNode quotedNode_164 = null;
      {
        quotedNode_163 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SetType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_163 = quotedNode_163;
        {
          quotedNode_164 = (SNode) parameter_7926_0;
          SNode quotedNode1_164;
          if (_parameterValues_129834374.contains(quotedNode_164)) {
            quotedNode1_164 = CopyUtil.copy(quotedNode_164);
          } else {
            _parameterValues_129834374.add(quotedNode_164);
            quotedNode1_164 = quotedNode_164;
          }
          if (quotedNode1_164 != null) {
            quotedNode_163.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_164, typeCheckingContext));
          }
        }
        result = quotedNode1_163;
      }
      return result;
    }

    public SNode createNode(Object parameter_7926_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_163 = null;
      SNode quotedNode_164 = null;
      {
        quotedNode_163 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SetType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_163 = quotedNode_163;
        {
          quotedNode_164 = (SNode) parameter_7926_0;
          SNode quotedNode1_164;
          if (_parameterValues_129834374.contains(quotedNode_164)) {
            quotedNode1_164 = CopyUtil.copy(quotedNode_164);
          } else {
            _parameterValues_129834374.add(quotedNode_164);
            quotedNode1_164 = quotedNode_164;
          }
          if (quotedNode1_164 != null) {
            quotedNode_163.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_164));
          }
        }
        result = quotedNode1_163;
      }
      return result;
    }
  }
}
