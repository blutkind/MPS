package jetbrains.mps.baseLanguageInternal.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InternalStaticMethodCall_InferenceRule implements InferenceRule_Runtime {

  public typeof_InternalStaticMethodCall_InferenceRule() {
  }

  public void applyRule(final SNode call) {
    {
      SNode _nodeToCheck_1029348928467 = call;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(call, "jetbrains.mps.baseLanguageInternal.helgins", "1196525371930", true), SLinkOperations.getTarget(call, "returnType", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguageInternal.helgins", "1196525371928", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguageInternal.structure.InternalStaticMethodCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
