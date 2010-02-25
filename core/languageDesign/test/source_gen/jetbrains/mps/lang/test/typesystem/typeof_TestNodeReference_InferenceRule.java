package jetbrains.mps.lang.test.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeof_TestNodeReference_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_TestNodeReference_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    SNode concept = SNodeOperations.getConceptDeclaration(SNodeOperations.getParent(SLinkOperations.getTarget(nodeToCheck, "declaration", false)));
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1210676536754", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1210676530830", true), (SNode) new typeof_TestNodeReference_InferenceRule.QuotationClass_2415_l523emnf9vue().createNode(concept, typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.test.structure.TestNodeReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_2415_l523emnf9vue {
    public QuotationClass_2415_l523emnf9vue() {
    }

    public SNode createNode(Object parameter_2415_l523emnf9vi3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2415_l523emnf9vi1 = null;
      {
        quotedNode_2415_l523emnf9vi1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2415_l523emnf9vi1 = quotedNode_2415_l523emnf9vi1;
        quotedNode1_2415_l523emnf9vi1.setReferent("concept", (SNode) parameter_2415_l523emnf9vi3);
        result = quotedNode1_2415_l523emnf9vi1;
      }
      return result;
    }

    public SNode createNode(Object parameter_2415_l523emnf9vi3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2415_l523emnf9vi1 = null;
      {
        quotedNode_2415_l523emnf9vi1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2415_l523emnf9vi1 = quotedNode_2415_l523emnf9vi1;
        quotedNode1_2415_l523emnf9vi1.setReferent("concept", (SNode) parameter_2415_l523emnf9vi3);
        result = quotedNode1_2415_l523emnf9vi1;
      }
      return result;
    }
  }
}
