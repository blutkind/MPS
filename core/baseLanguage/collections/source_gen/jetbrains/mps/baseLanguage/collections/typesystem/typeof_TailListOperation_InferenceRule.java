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

public class typeof_TailListOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_TailListOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    final SNode ELEMENT_TYPE_typevar_5232196642625575121 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(op);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5232196642625575122", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5232196642625575130", true), (SNode) new typeof_TailListOperation_InferenceRule.QuotationClass_2559_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(ELEMENT_TYPE_typevar_5232196642625575121), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(op, "fromIndex", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5232196642625575134", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5232196642625575139", true), (SNode) new typeof_TailListOperation_InferenceRule.QuotationClass_2559_1().createNode(typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5232196642625575152", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5232196642625575160", true), (SNode) new typeof_TailListOperation_InferenceRule.QuotationClass_2559_2().createNode(typeCheckingContext.getEquationManager().getRepresentator(ELEMENT_TYPE_typevar_5232196642625575121), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.TailListOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_2559_0 {
    public QuotationClass_2559_0() {
    }

    public SNode createNode(Object parameter_2559_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_349 = null;
      SNode quotedNode_350 = null;
      {
        quotedNode_349 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_349 = quotedNode_349;
        {
          quotedNode_350 = (SNode) parameter_2559_0;
          SNode quotedNode1_350;
          if (_parameterValues_129834374.contains(quotedNode_350)) {
            quotedNode1_350 = CopyUtil.copy(quotedNode_350);
          } else {
            _parameterValues_129834374.add(quotedNode_350);
            quotedNode1_350 = quotedNode_350;
          }
          if (quotedNode1_350 != null) {
            quotedNode_349.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_350, typeCheckingContext));
          }
        }
        result = quotedNode1_349;
      }
      return result;
    }

    public SNode createNode(Object parameter_2559_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_349 = null;
      SNode quotedNode_350 = null;
      {
        quotedNode_349 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_349 = quotedNode_349;
        {
          quotedNode_350 = (SNode) parameter_2559_0;
          SNode quotedNode1_350;
          if (_parameterValues_129834374.contains(quotedNode_350)) {
            quotedNode1_350 = CopyUtil.copy(quotedNode_350);
          } else {
            _parameterValues_129834374.add(quotedNode_350);
            quotedNode1_350 = quotedNode_350;
          }
          if (quotedNode1_350 != null) {
            quotedNode_349.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_350));
          }
        }
        result = quotedNode1_349;
      }
      return result;
    }
  }

  public static class QuotationClass_2559_1 {
    public QuotationClass_2559_1() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_351 = null;
      {
        quotedNode_351 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_351 = quotedNode_351;
        result = quotedNode1_351;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_351 = null;
      {
        quotedNode_351 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_351 = quotedNode_351;
        result = quotedNode1_351;
      }
      return result;
    }
  }

  public static class QuotationClass_2559_2 {
    public QuotationClass_2559_2() {
    }

    public SNode createNode(Object parameter_2559_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_352 = null;
      SNode quotedNode_353 = null;
      {
        quotedNode_352 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_352 = quotedNode_352;
        {
          quotedNode_353 = (SNode) parameter_2559_1;
          SNode quotedNode1_353;
          if (_parameterValues_129834374.contains(quotedNode_353)) {
            quotedNode1_353 = CopyUtil.copy(quotedNode_353);
          } else {
            _parameterValues_129834374.add(quotedNode_353);
            quotedNode1_353 = quotedNode_353;
          }
          if (quotedNode1_353 != null) {
            quotedNode_352.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_353, typeCheckingContext));
          }
        }
        result = quotedNode1_352;
      }
      return result;
    }

    public SNode createNode(Object parameter_2559_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_352 = null;
      SNode quotedNode_353 = null;
      {
        quotedNode_352 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_352 = quotedNode_352;
        {
          quotedNode_353 = (SNode) parameter_2559_1;
          SNode quotedNode1_353;
          if (_parameterValues_129834374.contains(quotedNode_353)) {
            quotedNode1_353 = CopyUtil.copy(quotedNode_353);
          } else {
            _parameterValues_129834374.add(quotedNode_353);
            quotedNode1_353 = quotedNode_353;
          }
          if (quotedNode1_353 != null) {
            quotedNode_352.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_353));
          }
        }
        result = quotedNode1_352;
      }
      return result;
    }
  }
}
