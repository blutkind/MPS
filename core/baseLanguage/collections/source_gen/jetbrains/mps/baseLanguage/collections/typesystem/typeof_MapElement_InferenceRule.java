package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_MapElement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_MapElement_InferenceRule() {
  }

  public void applyRule(final SNode mapElement, final TypeCheckingContext typeCheckingContext) {
    final SNode keyType_typevar_1198083488673 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode valueType_typevar_1198083495346 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(mapElement, "map", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1198083568591", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1198083507709", true), (SNode) new typeof_MapElement_InferenceRule.QuotationClass_y91lxu_a0a2a0().createNode(typeCheckingContext.getEquationManager().getRepresentator(keyType_typevar_1198083488673), typeCheckingContext.getEquationManager().getRepresentator(valueType_typevar_1198083495346), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = mapElement;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1198083621785", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1198083609561", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(valueType_typevar_1198083495346), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(mapElement, "key", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1198084142390", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1198084142392", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(keyType_typevar_1198083488673), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.MapElement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_y91lxu_a0a2a0 {
    public QuotationClass_y91lxu_a0a2a0() {
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
            quotedNode1_5 = CopyUtil.copy(quotedNode_2);
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
            quotedNode1_6 = CopyUtil.copy(quotedNode_3);
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
            quotedNode1_5 = CopyUtil.copy(quotedNode_2);
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
            quotedNode1_6 = CopyUtil.copy(quotedNode_3);
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
}
