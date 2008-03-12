package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_LinkAttributeAccessQualifier_InferenceRule implements InferenceRule_Runtime {

  public  typeof_LinkAttributeAccessQualifier_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    SNode annotationLink = SLinkOperations.getTarget(nodeToCheck, "annotationLink", false);
    if(annotationLink == null) {
      return;
    }
    // assign type
    SNode T = SConceptOperations.createNewNode("jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT", null);
    SLinkOperations.setTarget(T, "targetConcept", SLinkOperations.getTarget(annotationLink, "target", false), false);
    SPropertyOperations.set(T, "singularCradinality", "" + (SPropertyOperations.hasValue(annotationLink, "sourceCardinality", "0..1", "0..1")));
    SPropertyOperations.set(T, "aggregation", "" + (true));
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1204926978425", true), T, nodeToCheck, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1204926978423");
    // ---
    if(!(SPropertyOperations.hasValue(annotationLink, "stereotype", "link", "node"))) {
      TypeChecker.getInstance().reportTypeError(nodeToCheck, "link annotation link is expected", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1204849792143");
    }
    SNode linkQualifier = SLinkOperations.getTarget(nodeToCheck, "linkQualifier", true);
    if(SNodeOperations.isInstanceOf(linkQualifier, "jetbrains.mps.bootstrap.smodelLanguage.structure.ExpressionQualifier")) {
      // link role expected
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(linkQualifier, "expression", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1204849792163", false), new QuotationClass_79().createNode(), SLinkOperations.getTarget(linkQualifier, "expression", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1204849792161");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkAttributeAccessQualifier";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
