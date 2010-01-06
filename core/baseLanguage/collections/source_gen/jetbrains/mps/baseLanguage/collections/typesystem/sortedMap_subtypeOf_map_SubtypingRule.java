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

public class sortedMap_subtypeOf_map_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public sortedMap_subtypeOf_map_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode sortedMapType, TypeCheckingContext typeCheckingContext) {
    return new sortedMap_subtypeOf_map_SubtypingRule.QuotationClass_5310_0().createNode(SLinkOperations.getTarget(sortedMapType, "keyType", true), SLinkOperations.getTarget(sortedMapType, "valueType", true), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SortedMapType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_5310_0 {
    public QuotationClass_5310_0() {
    }

    public SNode createNode(Object parameter_5310_0, Object parameter_5310_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_240 = null;
      SNode quotedNode_241 = null;
      SNode quotedNode_242 = null;
      {
        quotedNode_240 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_240 = quotedNode_240;
        {
          quotedNode_241 = (SNode) parameter_5310_0;
          SNode quotedNode1_241;
          if (_parameterValues_129834374.contains(quotedNode_241)) {
            quotedNode1_241 = CopyUtil.copy(quotedNode_241);
          } else {
            _parameterValues_129834374.add(quotedNode_241);
            quotedNode1_241 = quotedNode_241;
          }
          if (quotedNode1_241 != null) {
            quotedNode_240.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_241, typeCheckingContext));
          }
        }
        {
          quotedNode_242 = (SNode) parameter_5310_1;
          SNode quotedNode1_242;
          if (_parameterValues_129834374.contains(quotedNode_242)) {
            quotedNode1_242 = CopyUtil.copy(quotedNode_242);
          } else {
            _parameterValues_129834374.add(quotedNode_242);
            quotedNode1_242 = quotedNode_242;
          }
          if (quotedNode1_242 != null) {
            quotedNode_240.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_242, typeCheckingContext));
          }
        }
        result = quotedNode1_240;
      }
      return result;
    }

    public SNode createNode(Object parameter_5310_0, Object parameter_5310_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_240 = null;
      SNode quotedNode_241 = null;
      SNode quotedNode_242 = null;
      {
        quotedNode_240 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_240 = quotedNode_240;
        {
          quotedNode_241 = (SNode) parameter_5310_0;
          SNode quotedNode1_241;
          if (_parameterValues_129834374.contains(quotedNode_241)) {
            quotedNode1_241 = CopyUtil.copy(quotedNode_241);
          } else {
            _parameterValues_129834374.add(quotedNode_241);
            quotedNode1_241 = quotedNode_241;
          }
          if (quotedNode1_241 != null) {
            quotedNode_240.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_241));
          }
        }
        {
          quotedNode_242 = (SNode) parameter_5310_1;
          SNode quotedNode1_242;
          if (_parameterValues_129834374.contains(quotedNode_242)) {
            quotedNode1_242 = CopyUtil.copy(quotedNode_242);
          } else {
            _parameterValues_129834374.add(quotedNode_242);
            quotedNode1_242 = quotedNode_242;
          }
          if (quotedNode1_242 != null) {
            quotedNode_240.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_242));
          }
        }
        result = quotedNode1_240;
      }
      return result;
    }
  }
}
