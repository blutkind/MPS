package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class typeof_UnaryMinus_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_UnaryMinus_InferenceRule() {
  }

  public void applyRule(final SNode minus, final TypeCheckingContext typeCheckingContext) {
    final SNode expressionType_typevar_7602524515424797598 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(minus, "expression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7602524515424797603", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.getEquationManager().getRepresentator(expressionType_typevar_7602524515424797598), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7602524515424797608", true), _info_12389875345);
    }
    {
      final SNode exType = typeCheckingContext.getEquationManager().getRepresentator(expressionType_typevar_7602524515424797598);
      typeCheckingContext.whenConcrete(exType, new Runnable() {
        public void run() {
          SNode type = typeCheckingContext.getOverloadedOperationType(minus, typeCheckingContext.getEquationManager().getRepresentator(exType), new typeof_UnaryMinus_InferenceRule.QuotationClass_2vfzm_a2a0a0a2a0().createNode(typeCheckingContext));
          if (type != null) {
            {
              SNode _nodeToCheck_1029348928467 = minus;
              BaseIntentionProvider intentionProvider = null;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3860149536565525538", 0, intentionProvider);
              typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3860149536565525541", true), (SNode) type, _info_12389875345);
            }
          } else {
            {
              BaseIntentionProvider intentionProvider = null;
              IErrorTarget errorTarget = new NodeErrorTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(minus, "- can't be applied to these operands.", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3860149536565525553", intentionProvider, errorTarget);
            }
          }
        }
      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3860149536565525509", false, false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.UnaryMinus";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_2vfzm_a2a0a0a2a0 {
    public QuotationClass_2vfzm_a2a0a0a2a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2vfzm_a2a0a0a2a0 = null;
      {
        quotedNode_2vfzm_a2a0a0a2a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2vfzm_a2a0a0a2a0 = quotedNode_2vfzm_a2a0a0a2a0;
        quotedNode1_2vfzm_a2a0a0a2a0.addReference(SReference.create("classifier", quotedNode1_2vfzm_a2a0a0a2a0, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2vfzm_a2a0a0a2a0;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2vfzm_a2a0a0a2a0 = null;
      {
        quotedNode_2vfzm_a2a0a0a2a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2vfzm_a2a0a0a2a0 = quotedNode_2vfzm_a2a0a0a2a0;
        quotedNode1_2vfzm_a2a0a0a2a0.addReference(SReference.create("classifier", quotedNode1_2vfzm_a2a0a0a2a0, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2vfzm_a2a0a0a2a0;
      }
      return result;
    }
  }
}
