package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_TypeVarReference_InferenceRule implements InferenceRule_Runtime {

  public typeOf_TypeVarReference_InferenceRule() {
  }

  public void applyRule(final SNode typeVarReference) {
    {
      SNode _nodeToCheck_1029348928467 = typeVarReference;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(typeVarReference, "r:1222075024049(jetbrains.mps.bootstrap.helgins.helgins)", "1185878055040", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(typeVarReference, "typeVarDeclaration", false), "r:1222075024049(jetbrains.mps.bootstrap.helgins.helgins)", "1185878063692", true), _nodeToCheck_1029348928467, null, "r:1222075024049(jetbrains.mps.bootstrap.helgins.helgins)", "1185878061141", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.TypeVarReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
