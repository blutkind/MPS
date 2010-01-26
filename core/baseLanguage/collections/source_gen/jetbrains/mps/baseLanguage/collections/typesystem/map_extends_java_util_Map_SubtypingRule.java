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
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class map_extends_java_util_Map_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public map_extends_java_util_Map_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode mapType, TypeCheckingContext typeCheckingContext) {
    return new map_extends_java_util_Map_SubtypingRule.QuotationClass_1431_0().createNode(SLinkOperations.getTarget(mapType, "keyType", true), SLinkOperations.getTarget(mapType, "valueType", true), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.MapType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_1431_0 {
    public QuotationClass_1431_0() {
    }

    public SNode createNode(Object parameter_1431_0, Object parameter_1431_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1431_0 = null;
      SNode quotedNode_1431_1 = null;
      SNode quotedNode_1431_2 = null;
      {
        quotedNode_1431_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1431_0 = quotedNode_1431_0;
        quotedNode1_1431_0.addReference(SReference.create("classifier", quotedNode1_1431_0, SModelReference.fromString("f:java_stub#java.util(java.util@java_stub)"), SNodeId.fromString("~Map")));
        {
          quotedNode_1431_1 = (SNode) parameter_1431_0;
          SNode quotedNode1_1431_1;
          if (_parameterValues_129834374.contains(quotedNode_1431_1)) {
            quotedNode1_1431_1 = CopyUtil.copy(quotedNode_1431_1);
          } else {
            _parameterValues_129834374.add(quotedNode_1431_1);
            quotedNode1_1431_1 = quotedNode_1431_1;
          }
          if (quotedNode1_1431_1 != null) {
            quotedNode_1431_0.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_1431_1, typeCheckingContext));
          }
        }
        {
          quotedNode_1431_2 = (SNode) parameter_1431_1;
          SNode quotedNode1_1431_2;
          if (_parameterValues_129834374.contains(quotedNode_1431_2)) {
            quotedNode1_1431_2 = CopyUtil.copy(quotedNode_1431_2);
          } else {
            _parameterValues_129834374.add(quotedNode_1431_2);
            quotedNode1_1431_2 = quotedNode_1431_2;
          }
          if (quotedNode1_1431_2 != null) {
            quotedNode_1431_0.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_1431_2, typeCheckingContext));
          }
        }
        result = quotedNode1_1431_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_1431_0, Object parameter_1431_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1431_0 = null;
      SNode quotedNode_1431_1 = null;
      SNode quotedNode_1431_2 = null;
      {
        quotedNode_1431_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1431_0 = quotedNode_1431_0;
        quotedNode1_1431_0.addReference(SReference.create("classifier", quotedNode1_1431_0, SModelReference.fromString("f:java_stub#java.util(java.util@java_stub)"), SNodeId.fromString("~Map")));
        {
          quotedNode_1431_1 = (SNode) parameter_1431_0;
          SNode quotedNode1_1431_1;
          if (_parameterValues_129834374.contains(quotedNode_1431_1)) {
            quotedNode1_1431_1 = CopyUtil.copy(quotedNode_1431_1);
          } else {
            _parameterValues_129834374.add(quotedNode_1431_1);
            quotedNode1_1431_1 = quotedNode_1431_1;
          }
          if (quotedNode1_1431_1 != null) {
            quotedNode_1431_0.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_1431_1));
          }
        }
        {
          quotedNode_1431_2 = (SNode) parameter_1431_1;
          SNode quotedNode1_1431_2;
          if (_parameterValues_129834374.contains(quotedNode_1431_2)) {
            quotedNode1_1431_2 = CopyUtil.copy(quotedNode_1431_2);
          } else {
            _parameterValues_129834374.add(quotedNode_1431_2);
            quotedNode1_1431_2 = quotedNode_1431_2;
          }
          if (quotedNode1_1431_2 != null) {
            quotedNode_1431_0.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_1431_2));
          }
        }
        result = quotedNode1_1431_0;
      }
      return result;
    }
  }
}
