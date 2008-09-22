package jetbrains.mps.bootstrap.constraintsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.constraintsLanguage.behavior.NodeReferentConstraint_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConstraintFunctionParameter_referenceNode_InferenceRule implements InferenceRule_Runtime {

  public typeof_ConstraintFunctionParameter_referenceNode_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    SNode applicableConcept = NodeReferentConstraint_Behavior.call_getApplicableConcept_1213877399322(SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint", false, false));
    if ((applicableConcept == null)) {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(node, "r:1222075024137(jetbrains.mps.bootstrap.constraintsLanguage.helgins)", "1212097655292", true), new QuotationClass_2().createNode(), _nodeToCheck_1029348928467, null, "r:1222075024137(jetbrains.mps.bootstrap.constraintsLanguage.helgins)", "1212097655290", intentionProvider);
      }
    } else
    {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(node, "r:1222075024137(jetbrains.mps.bootstrap.constraintsLanguage.helgins)", "1212097660327", true), new QuotationClass_3().createNode(applicableConcept), _nodeToCheck_1029348928467, null, "r:1222075024137(jetbrains.mps.bootstrap.constraintsLanguage.helgins)", "1212097660325", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
