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

public class typeof_SubListOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SubListOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    final SNode ELEMENT_TYPE_typevar_5633809102336891166 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(op);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5633809102336891156", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5633809102336891148", true), (SNode) new typeof_SubListOperation_InferenceRule.QuotationClass_9235_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(ELEMENT_TYPE_typevar_5633809102336891166), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(op, "fromIndex", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5633809102336891180", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5633809102336891172", true), (SNode) new typeof_SubListOperation_InferenceRule.QuotationClass_9235_1().createNode(typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(op, "upToIndex", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5633809102336891189", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5633809102336891194", true), (SNode) new typeof_SubListOperation_InferenceRule.QuotationClass_9235_2().createNode(typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5633809102336891205", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5633809102336891202", true), (SNode) new typeof_SubListOperation_InferenceRule.QuotationClass_9235_3().createNode(typeCheckingContext.getEquationManager().getRepresentator(ELEMENT_TYPE_typevar_5633809102336891166), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SubListOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_9235_0 {
    public QuotationClass_9235_0() {
    }

    public SNode createNode(Object parameter_9235_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9235_0 = null;
      SNode quotedNode_9235_1 = null;
      {
        quotedNode_9235_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9235_0 = quotedNode_9235_0;
        {
          quotedNode_9235_1 = (SNode) parameter_9235_0;
          SNode quotedNode1_9235_1;
          if (_parameterValues_129834374.contains(quotedNode_9235_1)) {
            quotedNode1_9235_1 = CopyUtil.copy(quotedNode_9235_1);
          } else {
            _parameterValues_129834374.add(quotedNode_9235_1);
            quotedNode1_9235_1 = quotedNode_9235_1;
          }
          if (quotedNode1_9235_1 != null) {
            quotedNode_9235_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_9235_1, typeCheckingContext));
          }
        }
        result = quotedNode1_9235_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_9235_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9235_0 = null;
      SNode quotedNode_9235_1 = null;
      {
        quotedNode_9235_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9235_0 = quotedNode_9235_0;
        {
          quotedNode_9235_1 = (SNode) parameter_9235_0;
          SNode quotedNode1_9235_1;
          if (_parameterValues_129834374.contains(quotedNode_9235_1)) {
            quotedNode1_9235_1 = CopyUtil.copy(quotedNode_9235_1);
          } else {
            _parameterValues_129834374.add(quotedNode_9235_1);
            quotedNode1_9235_1 = quotedNode_9235_1;
          }
          if (quotedNode1_9235_1 != null) {
            quotedNode_9235_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_9235_1));
          }
        }
        result = quotedNode1_9235_0;
      }
      return result;
    }
  }

  public static class QuotationClass_9235_1 {
    public QuotationClass_9235_1() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9235_2 = null;
      {
        quotedNode_9235_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9235_2 = quotedNode_9235_2;
        result = quotedNode1_9235_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9235_2 = null;
      {
        quotedNode_9235_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9235_2 = quotedNode_9235_2;
        result = quotedNode1_9235_2;
      }
      return result;
    }
  }

  public static class QuotationClass_9235_2 {
    public QuotationClass_9235_2() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9235_3 = null;
      {
        quotedNode_9235_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9235_3 = quotedNode_9235_3;
        result = quotedNode1_9235_3;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9235_3 = null;
      {
        quotedNode_9235_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9235_3 = quotedNode_9235_3;
        result = quotedNode1_9235_3;
      }
      return result;
    }
  }

  public static class QuotationClass_9235_3 {
    public QuotationClass_9235_3() {
    }

    public SNode createNode(Object parameter_9235_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9235_4 = null;
      SNode quotedNode_9235_5 = null;
      {
        quotedNode_9235_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9235_4 = quotedNode_9235_4;
        {
          quotedNode_9235_5 = (SNode) parameter_9235_1;
          SNode quotedNode1_9235_5;
          if (_parameterValues_129834374.contains(quotedNode_9235_5)) {
            quotedNode1_9235_5 = CopyUtil.copy(quotedNode_9235_5);
          } else {
            _parameterValues_129834374.add(quotedNode_9235_5);
            quotedNode1_9235_5 = quotedNode_9235_5;
          }
          if (quotedNode1_9235_5 != null) {
            quotedNode_9235_4.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_9235_5, typeCheckingContext));
          }
        }
        result = quotedNode1_9235_4;
      }
      return result;
    }

    public SNode createNode(Object parameter_9235_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9235_4 = null;
      SNode quotedNode_9235_5 = null;
      {
        quotedNode_9235_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9235_4 = quotedNode_9235_4;
        {
          quotedNode_9235_5 = (SNode) parameter_9235_1;
          SNode quotedNode1_9235_5;
          if (_parameterValues_129834374.contains(quotedNode_9235_5)) {
            quotedNode1_9235_5 = CopyUtil.copy(quotedNode_9235_5);
          } else {
            _parameterValues_129834374.add(quotedNode_9235_5);
            quotedNode1_9235_5 = quotedNode_9235_5;
          }
          if (quotedNode1_9235_5 != null) {
            quotedNode_9235_4.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_9235_5));
          }
        }
        result = quotedNode1_9235_4;
      }
      return result;
    }
  }
}
