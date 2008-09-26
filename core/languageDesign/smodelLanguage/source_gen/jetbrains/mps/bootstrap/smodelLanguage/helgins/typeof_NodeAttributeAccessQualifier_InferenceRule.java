package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_NodeAttributeAccessQualifier_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_NodeAttributeAccessQualifier_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    SNode annotationLink = SLinkOperations.getTarget(nodeToCheck, "annotationLink", false);
    if (annotationLink == null) {
      return;
    }
    // assign type
    SNode T = SConceptOperations.createNewNode("jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT", null);
    SLinkOperations.setTarget(T, "targetConcept", SLinkOperations.getTarget(annotationLink, "target", false), false);
    SPropertyOperations.set(T, "singularCradinality", "" + (SPropertyOperations.hasValue(annotationLink, "sourceCardinality", "0..1", "0..1")));
    SPropertyOperations.set(T, "aggregation", "" + (true));
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1205266078203", true), T, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1205266078201", intentionProvider);
    }
    // ---
    if (!(SPropertyOperations.hasValue(annotationLink, "stereotype", "node", "node"))) {
      TypeChecker.getInstance().reportTypeError(nodeToCheck, "node annotation link is expected", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1204764593904");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.NodeAttributeAccessQualifier";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
