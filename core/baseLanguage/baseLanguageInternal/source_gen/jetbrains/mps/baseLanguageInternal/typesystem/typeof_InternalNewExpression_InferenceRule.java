package jetbrains.mps.baseLanguageInternal.typesystem;

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

public class typeof_InternalNewExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_InternalNewExpression_InferenceRule() {
  }

  public void applyRule(final SNode internalNewExpression, final TypeCheckingContext typeCheckingContext) {
    SNode type;
    if ((SLinkOperations.getTarget(internalNewExpression, "type", true) != null)) {
      type = SLinkOperations.getTarget(internalNewExpression, "type", true);
    } else {
      type = new typeof_InternalNewExpression_InferenceRule.QuotationClass_4515_0().createNode(typeCheckingContext);
    }
    {
      SNode _nodeToCheck_1029348928467 = internalNewExpression;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903ab(jetbrains.mps.baseLanguageInternal.typesystem)", "1196525371896", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895903ab(jetbrains.mps.baseLanguageInternal.typesystem)", "1196525371898", true), (SNode) type, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguageInternal.structure.InternalNewExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_4515_0 {
    public QuotationClass_4515_0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0 = null;
      {
        quotedNode_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0 = quotedNode_0;
        quotedNode1_0.addReference(SReference.create("classifier", quotedNode1_0, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_0;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0 = null;
      {
        quotedNode_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0 = quotedNode_0;
        quotedNode1_0.addReference(SReference.create("classifier", quotedNode1_0, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_0;
      }
      return result;
    }
  }
}
