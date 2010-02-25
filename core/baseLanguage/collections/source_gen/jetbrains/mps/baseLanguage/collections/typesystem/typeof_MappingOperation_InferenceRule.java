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

public class typeof_MappingOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_MappingOperation_InferenceRule() {
  }

  public void applyRule(final SNode to, final TypeCheckingContext typeCheckingContext) {
    final SNode paramType_typevar_1203508136831 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(to);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225885291572", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225885291574", true), (SNode) new typeof_MappingOperation_InferenceRule.QuotationClass_3773_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(paramType_typevar_1203508136831), typeCheckingContext), false, _info_12389875345);
    }
    final SNode elType_typevar_1203507994173 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(to, "closure", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225883546583", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225883546585", true), (SNode) new typeof_MappingOperation_InferenceRule.QuotationClass_3773_1().createNode(typeCheckingContext.getEquationManager().getRepresentator(paramType_typevar_1203508136831), typeCheckingContext.getEquationManager().getRepresentator(elType_typevar_1203507994173), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = to;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1203507994185", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1203507994189", true), (SNode) new typeof_MappingOperation_InferenceRule.QuotationClass_3773_2().createNode(typeCheckingContext.getEquationManager().getRepresentator(elType_typevar_1203507994173), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.TranslateOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_3773_0 {
    public QuotationClass_3773_0() {
    }

    public SNode createNode(Object parameter_3773_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3773_0 = null;
      SNode quotedNode_3773_1 = null;
      {
        quotedNode_3773_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3773_0 = quotedNode_3773_0;
        {
          quotedNode_3773_1 = (SNode) parameter_3773_0;
          SNode quotedNode1_3773_1;
          if (_parameterValues_129834374.contains(quotedNode_3773_1)) {
            quotedNode1_3773_1 = CopyUtil.copy(quotedNode_3773_1);
          } else {
            _parameterValues_129834374.add(quotedNode_3773_1);
            quotedNode1_3773_1 = quotedNode_3773_1;
          }
          if (quotedNode1_3773_1 != null) {
            quotedNode_3773_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_3773_1, typeCheckingContext));
          }
        }
        result = quotedNode1_3773_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_3773_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3773_0 = null;
      SNode quotedNode_3773_1 = null;
      {
        quotedNode_3773_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3773_0 = quotedNode_3773_0;
        {
          quotedNode_3773_1 = (SNode) parameter_3773_0;
          SNode quotedNode1_3773_1;
          if (_parameterValues_129834374.contains(quotedNode_3773_1)) {
            quotedNode1_3773_1 = CopyUtil.copy(quotedNode_3773_1);
          } else {
            _parameterValues_129834374.add(quotedNode_3773_1);
            quotedNode1_3773_1 = quotedNode_3773_1;
          }
          if (quotedNode1_3773_1 != null) {
            quotedNode_3773_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_3773_1));
          }
        }
        result = quotedNode1_3773_0;
      }
      return result;
    }
  }

  public static class QuotationClass_3773_1 {
    public QuotationClass_3773_1() {
    }

    public SNode createNode(Object parameter_3773_1, Object parameter_3773_2, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3773_2 = null;
      SNode quotedNode_3773_3 = null;
      SNode quotedNode_3773_4 = null;
      SNode quotedNode_3773_5 = null;
      {
        quotedNode_3773_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3773_2 = quotedNode_3773_2;
        {
          quotedNode_3773_3 = (SNode) parameter_3773_1;
          SNode quotedNode1_3773_3;
          if (_parameterValues_129834374.contains(quotedNode_3773_3)) {
            quotedNode1_3773_3 = CopyUtil.copy(quotedNode_3773_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3773_3);
            quotedNode1_3773_3 = quotedNode_3773_3;
          }
          if (quotedNode1_3773_3 != null) {
            quotedNode_3773_2.addChild("parameterType", HUtil.copyIfNecessary(quotedNode1_3773_3, typeCheckingContext));
          }
        }
        {
          quotedNode_3773_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_3773_4 = quotedNode_3773_4;
          {
            quotedNode_3773_5 = (SNode) parameter_3773_2;
            SNode quotedNode1_3773_5;
            if (_parameterValues_129834374.contains(quotedNode_3773_5)) {
              quotedNode1_3773_5 = CopyUtil.copy(quotedNode_3773_5);
            } else {
              _parameterValues_129834374.add(quotedNode_3773_5);
              quotedNode1_3773_5 = quotedNode_3773_5;
            }
            if (quotedNode1_3773_5 != null) {
              quotedNode_3773_4.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_3773_5, typeCheckingContext));
            }
          }
          quotedNode_3773_2.addChild("resultType", quotedNode1_3773_4);
        }
        result = quotedNode1_3773_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3773_1, Object parameter_3773_2) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3773_2 = null;
      SNode quotedNode_3773_3 = null;
      SNode quotedNode_3773_4 = null;
      SNode quotedNode_3773_5 = null;
      {
        quotedNode_3773_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3773_2 = quotedNode_3773_2;
        {
          quotedNode_3773_3 = (SNode) parameter_3773_1;
          SNode quotedNode1_3773_3;
          if (_parameterValues_129834374.contains(quotedNode_3773_3)) {
            quotedNode1_3773_3 = CopyUtil.copy(quotedNode_3773_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3773_3);
            quotedNode1_3773_3 = quotedNode_3773_3;
          }
          if (quotedNode1_3773_3 != null) {
            quotedNode_3773_2.addChild("parameterType", HUtil.copyIfNecessary(quotedNode1_3773_3));
          }
        }
        {
          quotedNode_3773_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_3773_4 = quotedNode_3773_4;
          {
            quotedNode_3773_5 = (SNode) parameter_3773_2;
            SNode quotedNode1_3773_5;
            if (_parameterValues_129834374.contains(quotedNode_3773_5)) {
              quotedNode1_3773_5 = CopyUtil.copy(quotedNode_3773_5);
            } else {
              _parameterValues_129834374.add(quotedNode_3773_5);
              quotedNode1_3773_5 = quotedNode_3773_5;
            }
            if (quotedNode1_3773_5 != null) {
              quotedNode_3773_4.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_3773_5));
            }
          }
          quotedNode_3773_2.addChild("resultType", quotedNode1_3773_4);
        }
        result = quotedNode1_3773_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3773_2 {
    public QuotationClass_3773_2() {
    }

    public SNode createNode(Object parameter_3773_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3773_6 = null;
      SNode quotedNode_3773_7 = null;
      {
        quotedNode_3773_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3773_6 = quotedNode_3773_6;
        {
          quotedNode_3773_7 = (SNode) parameter_3773_3;
          SNode quotedNode1_3773_7;
          if (_parameterValues_129834374.contains(quotedNode_3773_7)) {
            quotedNode1_3773_7 = CopyUtil.copy(quotedNode_3773_7);
          } else {
            _parameterValues_129834374.add(quotedNode_3773_7);
            quotedNode1_3773_7 = quotedNode_3773_7;
          }
          if (quotedNode1_3773_7 != null) {
            quotedNode_3773_6.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_3773_7, typeCheckingContext));
          }
        }
        result = quotedNode1_3773_6;
      }
      return result;
    }

    public SNode createNode(Object parameter_3773_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3773_6 = null;
      SNode quotedNode_3773_7 = null;
      {
        quotedNode_3773_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3773_6 = quotedNode_3773_6;
        {
          quotedNode_3773_7 = (SNode) parameter_3773_3;
          SNode quotedNode1_3773_7;
          if (_parameterValues_129834374.contains(quotedNode_3773_7)) {
            quotedNode1_3773_7 = CopyUtil.copy(quotedNode_3773_7);
          } else {
            _parameterValues_129834374.add(quotedNode_3773_7);
            quotedNode1_3773_7 = quotedNode_3773_7;
          }
          if (quotedNode1_3773_7 != null) {
            quotedNode_3773_6.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_3773_7));
          }
        }
        result = quotedNode1_3773_6;
      }
      return result;
    }
  }
}
