package jetbrains.mps.baseLanguage.typesystem;

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
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeOf_ForeachStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_ForeachStatement_InferenceRule() {
  }

  public void applyRule(final SNode foreachStatement, final TypeCheckingContext typeCheckingContext) {
    final SNode T_typevar_1176561507041 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(foreachStatement, "iterable", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1207147198311", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(foreachStatement, "iterable", true), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1207147193776", true), (SNode) new typeOf_ForeachStatement_InferenceRule.QuotationClass_1977_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(T_typevar_1176561507041), typeCheckingContext.getEquationManager().getRepresentator(T_typevar_1176561507041), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(foreachStatement, "variable", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1183457358399", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createGreaterThanInequation((SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(foreachStatement, "variable", true), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1183457358397", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(T_typevar_1176561507041), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ForeachStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_1977_0 {
    public QuotationClass_1977_0() {
    }

    public SNode createNode(Object parameter_1977_0, Object parameter_1977_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_38 = null;
      SNode quotedNode_39 = null;
      SNode quotedNode_40 = null;
      SNode quotedNode_41 = null;
      SNode quotedNode_42 = null;
      {
        quotedNode_38 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_37 = quotedNode_38;
        {
          quotedNode_39 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_38 = quotedNode_39;
          quotedNode1_38.addReference(SReference.create("classifier", quotedNode1_38, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Iterable")));
          {
            quotedNode_41 = (SNode) parameter_1977_0;
            SNode quotedNode1_39;
            if (_parameterValues_129834374.contains(quotedNode_41)) {
              quotedNode1_39 = CopyUtil.copy(quotedNode_41);
            } else {
              _parameterValues_129834374.add(quotedNode_41);
              quotedNode1_39 = quotedNode_41;
            }
            if (quotedNode1_39 != null) {
              quotedNode_39.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_39, typeCheckingContext));
            }
          }
          quotedNode_38.addChild("argument", quotedNode1_38);
        }
        {
          quotedNode_40 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_40 = quotedNode_40;
          {
            quotedNode_42 = (SNode) parameter_1977_1;
            SNode quotedNode1_41;
            if (_parameterValues_129834374.contains(quotedNode_42)) {
              quotedNode1_41 = CopyUtil.copy(quotedNode_42);
            } else {
              _parameterValues_129834374.add(quotedNode_42);
              quotedNode1_41 = quotedNode_42;
            }
            if (quotedNode1_41 != null) {
              quotedNode_40.addChild("componentType", HUtil.copyIfNecessary(quotedNode1_41, typeCheckingContext));
            }
          }
          quotedNode_38.addChild("argument", quotedNode1_40);
        }
        result = quotedNode1_37;
      }
      return result;
    }

    public SNode createNode(Object parameter_1977_0, Object parameter_1977_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_38 = null;
      SNode quotedNode_39 = null;
      SNode quotedNode_40 = null;
      SNode quotedNode_41 = null;
      SNode quotedNode_42 = null;
      {
        quotedNode_38 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_37 = quotedNode_38;
        {
          quotedNode_39 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_38 = quotedNode_39;
          quotedNode1_38.addReference(SReference.create("classifier", quotedNode1_38, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Iterable")));
          {
            quotedNode_41 = (SNode) parameter_1977_0;
            SNode quotedNode1_39;
            if (_parameterValues_129834374.contains(quotedNode_41)) {
              quotedNode1_39 = CopyUtil.copy(quotedNode_41);
            } else {
              _parameterValues_129834374.add(quotedNode_41);
              quotedNode1_39 = quotedNode_41;
            }
            if (quotedNode1_39 != null) {
              quotedNode_39.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_39));
            }
          }
          quotedNode_38.addChild("argument", quotedNode1_38);
        }
        {
          quotedNode_40 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_40 = quotedNode_40;
          {
            quotedNode_42 = (SNode) parameter_1977_1;
            SNode quotedNode1_41;
            if (_parameterValues_129834374.contains(quotedNode_42)) {
              quotedNode1_41 = CopyUtil.copy(quotedNode_42);
            } else {
              _parameterValues_129834374.add(quotedNode_42);
              quotedNode1_41 = quotedNode_42;
            }
            if (quotedNode1_41 != null) {
              quotedNode_40.addChild("componentType", HUtil.copyIfNecessary(quotedNode1_41));
            }
          }
          quotedNode_38.addChild("argument", quotedNode1_40);
        }
        result = quotedNode1_37;
      }
      return result;
    }
  }
}
