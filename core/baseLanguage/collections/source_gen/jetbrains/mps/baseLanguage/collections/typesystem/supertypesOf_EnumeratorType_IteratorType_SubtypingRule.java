package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class supertypesOf_EnumeratorType_IteratorType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_EnumeratorType_IteratorType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode enumeratorType, TypeCheckingContext typeCheckingContext) {
    return new supertypesOf_EnumeratorType_IteratorType_SubtypingRule.QuotationClass_8563_0().createNode(SLinkOperations.getTarget(enumeratorType, "elementType", true), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.EnumeratorType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_8563_0 {
    public QuotationClass_8563_0() {
    }

    public SNode createNode(Object parameter_8563_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_212 = null;
      SNode quotedNode_213 = null;
      {
        quotedNode_212 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.IteratorType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_212 = quotedNode_212;
        {
          quotedNode_213 = (SNode) parameter_8563_0;
          SNode quotedNode1_213;
          if (_parameterValues_129834374.contains(quotedNode_213)) {
            quotedNode1_213 = CopyUtil.copy(quotedNode_213);
          } else {
            _parameterValues_129834374.add(quotedNode_213);
            quotedNode1_213 = quotedNode_213;
          }
          if (quotedNode1_213 != null) {
            quotedNode_212.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_213, typeCheckingContext));
          }
        }
        result = quotedNode1_212;
      }
      return result;
    }

    public SNode createNode(Object parameter_8563_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_212 = null;
      SNode quotedNode_213 = null;
      {
        quotedNode_212 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.IteratorType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_212 = quotedNode_212;
        {
          quotedNode_213 = (SNode) parameter_8563_0;
          SNode quotedNode1_213;
          if (_parameterValues_129834374.contains(quotedNode_213)) {
            quotedNode1_213 = CopyUtil.copy(quotedNode_213);
          } else {
            _parameterValues_129834374.add(quotedNode_213);
            quotedNode1_213 = quotedNode_213;
          }
          if (quotedNode1_213 != null) {
            quotedNode_212.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_213));
          }
        }
        result = quotedNode1_212;
      }
      return result;
    }
  }
}
