package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_ContainsAllOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ContainsAllOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    final SNode ELEMENT_TYPE_typevar_6126991172893688513 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode ARG_ELEMENT_TYPE_typevar_6126991172893688543 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(op);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "6126991172893688514", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "6126991172893688522", true), (SNode) new typeof_ContainsAllOperation_InferenceRule.QuotationClass_3865_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(ELEMENT_TYPE_typevar_6126991172893688513), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(op, "argument", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "6126991172893688526", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "6126991172893688530", true), (SNode) new typeof_ContainsAllOperation_InferenceRule.QuotationClass_3865_1().createNode(typeCheckingContext.getEquationManager().getRepresentator(ARG_ELEMENT_TYPE_typevar_6126991172893688543), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "6126991172893880598", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.getEquationManager().getRepresentator(ARG_ELEMENT_TYPE_typevar_6126991172893688543), (SNode) typeCheckingContext.getEquationManager().getRepresentator(ELEMENT_TYPE_typevar_6126991172893688513), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "6126991172893688534", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "6126991172893688536", true), (SNode) new typeof_ContainsAllOperation_InferenceRule.QuotationClass_3865_2().createNode(typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ContainsAllOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_3865_0 {
    public QuotationClass_3865_0() {
    }

    public SNode createNode(Object parameter_3865_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_360 = null;
      SNode quotedNode_361 = null;
      {
        quotedNode_360 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_360 = quotedNode_360;
        {
          quotedNode_361 = (SNode) parameter_3865_0;
          SNode quotedNode1_361;
          if (_parameterValues_129834374.contains(quotedNode_361)) {
            quotedNode1_361 = CopyUtil.copy(quotedNode_361);
          } else {
            _parameterValues_129834374.add(quotedNode_361);
            quotedNode1_361 = quotedNode_361;
          }
          if (quotedNode1_361 != null) {
            quotedNode_360.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_361, typeCheckingContext));
          }
        }
        result = quotedNode1_360;
      }
      return result;
    }

    public SNode createNode(Object parameter_3865_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_360 = null;
      SNode quotedNode_361 = null;
      {
        quotedNode_360 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_360 = quotedNode_360;
        {
          quotedNode_361 = (SNode) parameter_3865_0;
          SNode quotedNode1_361;
          if (_parameterValues_129834374.contains(quotedNode_361)) {
            quotedNode1_361 = CopyUtil.copy(quotedNode_361);
          } else {
            _parameterValues_129834374.add(quotedNode_361);
            quotedNode1_361 = quotedNode_361;
          }
          if (quotedNode1_361 != null) {
            quotedNode_360.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_361));
          }
        }
        result = quotedNode1_360;
      }
      return result;
    }
  }

  public static class QuotationClass_3865_1 {
    public QuotationClass_3865_1() {
    }

    public SNode createNode(Object parameter_3865_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_362 = null;
      SNode quotedNode_363 = null;
      {
        quotedNode_362 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_362 = quotedNode_362;
        {
          quotedNode_363 = (SNode) parameter_3865_1;
          SNode quotedNode1_363;
          if (_parameterValues_129834374.contains(quotedNode_363)) {
            quotedNode1_363 = CopyUtil.copy(quotedNode_363);
          } else {
            _parameterValues_129834374.add(quotedNode_363);
            quotedNode1_363 = quotedNode_363;
          }
          if (quotedNode1_363 != null) {
            quotedNode_362.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_363, typeCheckingContext));
          }
        }
        result = quotedNode1_362;
      }
      return result;
    }

    public SNode createNode(Object parameter_3865_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_362 = null;
      SNode quotedNode_363 = null;
      {
        quotedNode_362 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_362 = quotedNode_362;
        {
          quotedNode_363 = (SNode) parameter_3865_1;
          SNode quotedNode1_363;
          if (_parameterValues_129834374.contains(quotedNode_363)) {
            quotedNode1_363 = CopyUtil.copy(quotedNode_363);
          } else {
            _parameterValues_129834374.add(quotedNode_363);
            quotedNode1_363 = quotedNode_363;
          }
          if (quotedNode1_363 != null) {
            quotedNode_362.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_363));
          }
        }
        result = quotedNode1_362;
      }
      return result;
    }
  }

  public static class QuotationClass_3865_2 {
    public QuotationClass_3865_2() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_364 = null;
      {
        quotedNode_364 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_364 = quotedNode_364;
        result = quotedNode1_364;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_364 = null;
      {
        quotedNode_364 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_364 = quotedNode_364;
        result = quotedNode1_364;
      }
      return result;
    }
  }
}
