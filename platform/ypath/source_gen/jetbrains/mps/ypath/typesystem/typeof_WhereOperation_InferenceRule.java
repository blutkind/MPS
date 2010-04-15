package jetbrains.mps.ypath.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;

public class typeof_WhereOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_WhereOperation_InferenceRule() {
  }

  public void applyRule(final SNode wop, final TypeCheckingContext typeCheckingContext) {
    SNode parent = SNodeOperations.getParent(wop);
    do {
      SNode matchedNode_55k1k7_b0 = parent;
      {
        boolean matches_55k1k7_a1a = false;
        {
          SNode matchingNode_55k1k7_a1a = parent;
          if (matchingNode_55k1k7_a1a != null) {
            matches_55k1k7_a1a = SModelUtil_new.isAssignableConcept(matchingNode_55k1k7_a1a.getConceptFqName(), "jetbrains.mps.ypath.structure.TreePathOperationExpression");
          }
        }
        if (matches_55k1k7_a1a) {
          if ((SLinkOperations.getTarget(wop, "filter", true) != null)) {
            typeCheckingContext.typeOf(wop, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "4234084459083991231", true);
          }
          break;
        }
      }
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(wop, "Error in model structure: wrong parent type", "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "4234084459083990132", intentionProvider, errorTarget);
      }
    } while (false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.WhereOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
