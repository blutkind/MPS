package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ArrayCreatorWithInitializer_InferenceRule implements InferenceRule_Runtime {

  public typeOf_ArrayCreatorWithInitializer_InferenceRule() {
  }

  public void applyRule(final SNode arrayCreator) {
    for(SNode value : SLinkOperations.getTargets(arrayCreator, "initValue", true)) {
      {
        SNode _nodeToCheck_1029348928467 = value;
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617401337", true), SLinkOperations.getTarget(arrayCreator, "componentType", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617401335", false, 0);
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = arrayCreator;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617401344", true), new QuotationClass_8().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(arrayCreator, "componentType", true))), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617401342");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
