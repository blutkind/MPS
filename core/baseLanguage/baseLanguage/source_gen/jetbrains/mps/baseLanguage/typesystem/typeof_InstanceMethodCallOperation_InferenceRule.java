package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.ClassifierType_Behavior;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class typeof_InstanceMethodCallOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_InstanceMethodCallOperation_InferenceRule() {
  }

  public void applyRule(final SNode imco, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SLinkOperations.getTarget(imco, "baseMethodDeclaration", false) == null) {
      return;
    }
    final SNode methodClassifier = SNodeOperations.getAncestor(SLinkOperations.getTarget(imco, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    // --- 
    final SNode instanceType_typevar_1204064731338 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(imco);
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1204064763142", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.getRepresentative(instanceType_typevar_1204064731338), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1204064784351", false), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = imco;
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1204065906120", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequationStrong((SNode) typeCheckingContext.getRepresentative(instanceType_typevar_1204064731338), (SNode) new typeof_InstanceMethodCallOperation_InferenceRule.QuotationClass_ecn83h_a0a5a0().createNode(methodClassifier, typeCheckingContext), true, _info_12389875345);
    }
    // --- following piece of cake is identical for any method call --- 
    //  no more when_concrete 
    final SNode returnType = SLinkOperations.getTarget(SLinkOperations.getTarget(imco, "baseMethodDeclaration", false), "returnType", true);
    if (SNodeOperations.isInstanceOf(returnType, "jetbrains.mps.baseLanguage.structure.ClassifierType") && ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(returnType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true)).isNotEmpty() || SNodeOperations.isInstanceOf(returnType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
      {
        final SNode IT = typeCheckingContext.getRepresentative(instanceType_typevar_1204064731338);
        typeCheckingContext.whenConcrete(IT, new Runnable() {
          public void run() {
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getRepresentative(IT), "jetbrains.mps.baseLanguage.structure.ClassifierType") && ClassifierType_Behavior.call_isRawType_702942408396828337(SNodeOperations.cast(typeCheckingContext.getRepresentative(IT), "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
              RulesFunctions_BaseLanguage.inference_InstanceMethodCallOperation(typeCheckingContext, imco, Type_Behavior.call_getErasure_702942408396803226(returnType), typeCheckingContext.getRepresentative(instanceType_typevar_1204064731338), methodClassifier);
            } else {
              RulesFunctions_BaseLanguage.inference_InstanceMethodCallOperation(typeCheckingContext, imco, returnType, typeCheckingContext.getRepresentative(instanceType_typevar_1204064731338), methodClassifier);
            }
          }
        }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "702942408396860198", true, false);
      }
    } else {
      RulesFunctions_BaseLanguage.inference_InstanceMethodCallOperation(typeCheckingContext, imco, returnType, typeCheckingContext.getRepresentative(instanceType_typevar_1204064731338), methodClassifier);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_ecn83h_a0a5a0 {
    public QuotationClass_ecn83h_a0a5a0() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
