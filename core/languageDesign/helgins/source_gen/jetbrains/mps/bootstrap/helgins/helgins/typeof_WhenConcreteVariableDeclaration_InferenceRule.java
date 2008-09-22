package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_WhenConcreteVariableDeclaration_InferenceRule implements InferenceRule_Runtime {

  public typeof_WhenConcreteVariableDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "r:1222075024049(jetbrains.mps.bootstrap.helgins.helgins)", "1205768025013", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(SNodeOperations.getParent(nodeToCheck), "argument", true), "r:1222075024049(jetbrains.mps.bootstrap.helgins.helgins)", "1205768025018", false), _nodeToCheck_1029348928467, null, "r:1222075024049(jetbrains.mps.bootstrap.helgins.helgins)", "1205768025011", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.WhenConcreteVariableDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
