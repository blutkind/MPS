package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ArrayCreator_InferenceRule implements InferenceRule_Runtime {

  public typeof_ArrayCreator_InferenceRule() {
  }

  public void applyRule(final SNode arrayCreator) {
    SNode type = SLinkOperations.getTarget(arrayCreator, "componentType", true);
    for(int i = 0 ; i < ListSequence.fromList(SLinkOperations.getTargets(arrayCreator, "dimensionExpression", true)).count() ; i = i + 1) {
      type = new QuotationClass_88().createNode(type);
    }
    {
      SNode _nodeToCheck_1029348928467 = arrayCreator;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins", "1209402739197", true), type, _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins", "1209402744151");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
