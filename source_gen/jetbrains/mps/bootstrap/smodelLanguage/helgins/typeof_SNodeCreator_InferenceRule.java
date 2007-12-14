package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SNodeCreator_InferenceRule implements InferenceRule_Runtime {

  public  typeof_SNodeCreator_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    SNode createdType = SLinkOperations.getTarget(argument, "createdType", true);
    if(createdType != null) {
      if(SLinkOperations.getTarget(createdType, "concept", false) == null) {
        TypeChecker.getInstance().reportTypeError(createdType, "concrete node type is expected", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1181944909006");
        return;
      }
      if(SLinkOperations.getTarget(argument, "prototypeNode", true) != null) {
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "prototypeNode", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186061742845", true), new QuotationClass_66().createNode(), SLinkOperations.getTarget(argument, "prototypeNode", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1181945011354");
      }
      TypeChecker.getInstance().getRuntimeSupport().givetype(createdType, argument, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1181945088726");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
