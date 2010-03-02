package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import java.util.Map;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeOf_EnumConstantDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_EnumConstantDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode enumConstantDeclaration, final TypeCheckingContext typeCheckingContext) {
    final SNode methodClassifier = SNodeOperations.getAncestor(enumConstantDeclaration, "jetbrains.mps.baseLanguage.structure.EnumClass", false, false);
    SNode constructedType = new typeOf_EnumConstantDeclaration_InferenceRule.QuotationClass_4rqj66_a0a1a0().createNode(methodClassifier, typeCheckingContext);
    // --- 
    {
      SNode _nodeToCheck_1029348928467 = enumConstantDeclaration;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1241009438604", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1241009438608", true), (SNode) constructedType, _info_12389875345);
    }
    final SNode instanceType_typevar_1241009438611 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = enumConstantDeclaration;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1241009438612", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_1241009438611), (SNode) constructedType, _info_12389875345);
    }
    // --- following piece of cake is identical for any method call --- 
    Map<SNode, List<SNode>> mmap = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(typeCheckingContext, enumConstantDeclaration, null, mmap);
    RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(typeCheckingContext, methodClassifier, typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_1241009438611), mmap);
    RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(typeCheckingContext, mmap);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_4rqj66_a0a1a0 {
    public QuotationClass_4rqj66_a0a1a0() {
    }

    public SNode createNode(Object parameter_4rqj66_a0a0a1a0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_4rqj66_a0a0a1a0);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_4rqj66_a0a0a1a0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_4rqj66_a0a0a1a0);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
