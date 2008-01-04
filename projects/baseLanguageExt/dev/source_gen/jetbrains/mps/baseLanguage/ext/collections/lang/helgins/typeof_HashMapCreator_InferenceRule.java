package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_HashMapCreator_InferenceRule implements InferenceRule_Runtime {

  public  typeof_HashMapCreator_InferenceRule() {
  }

  public void applyRule(final SNode hashMapCreator) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(hashMapCreator, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1198082325421", true), new QuotationClass_53().createNode(SLinkOperations.getTarget(hashMapCreator, "keyType", true), SLinkOperations.getTarget(hashMapCreator, "valueType", true)), hashMapCreator, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1198082330971");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.HashMapCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
