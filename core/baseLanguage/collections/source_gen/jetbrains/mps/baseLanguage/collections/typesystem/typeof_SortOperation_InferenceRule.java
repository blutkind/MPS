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
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class typeof_SortOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SortOperation_InferenceRule() {
  }

  public void applyRule(final SNode so, final TypeCheckingContext typeCheckingContext) {
    final SNode paramType_typevar_1205680579640 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(so);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225885283623", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225885283625", true), (SNode) new typeof_SortOperation_InferenceRule.QuotationClass_4177_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(paramType_typevar_1205680579640), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(so, "closure", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1205680505277", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1205680514461", true), (SNode) new typeof_SortOperation_InferenceRule.QuotationClass_4177_1().createNode(typeCheckingContext.getEquationManager().getRepresentator(paramType_typevar_1205680579640), typeCheckingContext), false, _info_12389875345);
    }
    // todo: unmeet closure 
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(so, "ascending", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1205680788992", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1205680791173", true), (SNode) new typeof_SortOperation_InferenceRule.QuotationClass_4177_2().createNode(typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = so;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1205737509129", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1205737511200", true), (SNode) new typeof_SortOperation_InferenceRule.QuotationClass_4177_3().createNode(typeCheckingContext.getEquationManager().getRepresentator(paramType_typevar_1205680579640), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SortOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_4177_0 {
    public QuotationClass_4177_0() {
    }

    public SNode createNode(Object parameter_4177_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4177_0 = null;
      SNode quotedNode_4177_1 = null;
      {
        quotedNode_4177_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4177_0 = quotedNode_4177_0;
        {
          quotedNode_4177_1 = (SNode) parameter_4177_0;
          SNode quotedNode1_4177_1;
          if (_parameterValues_129834374.contains(quotedNode_4177_1)) {
            quotedNode1_4177_1 = CopyUtil.copy(quotedNode_4177_1);
          } else {
            _parameterValues_129834374.add(quotedNode_4177_1);
            quotedNode1_4177_1 = quotedNode_4177_1;
          }
          if (quotedNode1_4177_1 != null) {
            quotedNode_4177_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4177_1, typeCheckingContext));
          }
        }
        result = quotedNode1_4177_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_4177_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4177_0 = null;
      SNode quotedNode_4177_1 = null;
      {
        quotedNode_4177_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4177_0 = quotedNode_4177_0;
        {
          quotedNode_4177_1 = (SNode) parameter_4177_0;
          SNode quotedNode1_4177_1;
          if (_parameterValues_129834374.contains(quotedNode_4177_1)) {
            quotedNode1_4177_1 = CopyUtil.copy(quotedNode_4177_1);
          } else {
            _parameterValues_129834374.add(quotedNode_4177_1);
            quotedNode1_4177_1 = quotedNode_4177_1;
          }
          if (quotedNode1_4177_1 != null) {
            quotedNode_4177_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4177_1));
          }
        }
        result = quotedNode1_4177_0;
      }
      return result;
    }
  }

  public static class QuotationClass_4177_1 {
    public QuotationClass_4177_1() {
    }

    public SNode createNode(Object parameter_4177_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4177_2 = null;
      SNode quotedNode_4177_3 = null;
      SNode quotedNode_4177_4 = null;
      {
        quotedNode_4177_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4177_2 = quotedNode_4177_2;
        {
          quotedNode_4177_3 = (SNode) parameter_4177_1;
          SNode quotedNode1_4177_3;
          if (_parameterValues_129834374.contains(quotedNode_4177_3)) {
            quotedNode1_4177_3 = CopyUtil.copy(quotedNode_4177_3);
          } else {
            _parameterValues_129834374.add(quotedNode_4177_3);
            quotedNode1_4177_3 = quotedNode_4177_3;
          }
          if (quotedNode1_4177_3 != null) {
            quotedNode_4177_2.addChild("parameterType", HUtil.copyIfNecessary(quotedNode1_4177_3, typeCheckingContext));
          }
        }
        {
          quotedNode_4177_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_4177_4 = quotedNode_4177_4;
          quotedNode1_4177_4.addReference(SReference.create("classifier", quotedNode1_4177_4, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Comparable")));
          quotedNode_4177_2.addChild("resultType", quotedNode1_4177_4);
        }
        result = quotedNode1_4177_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_4177_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4177_2 = null;
      SNode quotedNode_4177_3 = null;
      SNode quotedNode_4177_4 = null;
      {
        quotedNode_4177_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4177_2 = quotedNode_4177_2;
        {
          quotedNode_4177_3 = (SNode) parameter_4177_1;
          SNode quotedNode1_4177_3;
          if (_parameterValues_129834374.contains(quotedNode_4177_3)) {
            quotedNode1_4177_3 = CopyUtil.copy(quotedNode_4177_3);
          } else {
            _parameterValues_129834374.add(quotedNode_4177_3);
            quotedNode1_4177_3 = quotedNode_4177_3;
          }
          if (quotedNode1_4177_3 != null) {
            quotedNode_4177_2.addChild("parameterType", HUtil.copyIfNecessary(quotedNode1_4177_3));
          }
        }
        {
          quotedNode_4177_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_4177_4 = quotedNode_4177_4;
          quotedNode1_4177_4.addReference(SReference.create("classifier", quotedNode1_4177_4, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Comparable")));
          quotedNode_4177_2.addChild("resultType", quotedNode1_4177_4);
        }
        result = quotedNode1_4177_2;
      }
      return result;
    }
  }

  public static class QuotationClass_4177_2 {
    public QuotationClass_4177_2() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4177_5 = null;
      {
        quotedNode_4177_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4177_5 = quotedNode_4177_5;
        result = quotedNode1_4177_5;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4177_5 = null;
      {
        quotedNode_4177_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4177_5 = quotedNode_4177_5;
        result = quotedNode1_4177_5;
      }
      return result;
    }
  }

  public static class QuotationClass_4177_3 {
    public QuotationClass_4177_3() {
    }

    public SNode createNode(Object parameter_4177_2, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4177_6 = null;
      SNode quotedNode_4177_7 = null;
      {
        quotedNode_4177_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4177_6 = quotedNode_4177_6;
        {
          quotedNode_4177_7 = (SNode) parameter_4177_2;
          SNode quotedNode1_4177_7;
          if (_parameterValues_129834374.contains(quotedNode_4177_7)) {
            quotedNode1_4177_7 = CopyUtil.copy(quotedNode_4177_7);
          } else {
            _parameterValues_129834374.add(quotedNode_4177_7);
            quotedNode1_4177_7 = quotedNode_4177_7;
          }
          if (quotedNode1_4177_7 != null) {
            quotedNode_4177_6.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4177_7, typeCheckingContext));
          }
        }
        result = quotedNode1_4177_6;
      }
      return result;
    }

    public SNode createNode(Object parameter_4177_2) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4177_6 = null;
      SNode quotedNode_4177_7 = null;
      {
        quotedNode_4177_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4177_6 = quotedNode_4177_6;
        {
          quotedNode_4177_7 = (SNode) parameter_4177_2;
          SNode quotedNode1_4177_7;
          if (_parameterValues_129834374.contains(quotedNode_4177_7)) {
            quotedNode1_4177_7 = CopyUtil.copy(quotedNode_4177_7);
          } else {
            _parameterValues_129834374.add(quotedNode_4177_7);
            quotedNode1_4177_7 = quotedNode_4177_7;
          }
          if (quotedNode1_4177_7 != null) {
            quotedNode_4177_6.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4177_7));
          }
        }
        result = quotedNode1_4177_6;
      }
      return result;
    }
  }
}
