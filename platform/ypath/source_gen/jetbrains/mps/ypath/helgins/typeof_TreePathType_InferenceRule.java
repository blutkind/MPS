package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TreePathType_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_TreePathType_InferenceRule() {
  }

  public void applyRule(final SNode tptype, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = tptype;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(tptype, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.helgins)", "1223208128037", true), tptype, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.helgins)", "1223208128035", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
