package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import java.util.List;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InstanceMethodCall_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_InstanceMethodCall_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    if (ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "parameter", true)).count() != ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeToCheck, "method", false), "parameter", true)).count()) {
      {
        BaseQuickFixProvider intentionProvider = null;
        typeCheckingContext.reportTypeError(nodeToCheck, "Wrong parameters number", "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406572", intentionProvider, new NodeMessageTarget());
      }
      return;
    }
    List<SNode> params = SLinkOperations.getTargets(SLinkOperations.getTarget(nodeToCheck, "method", false), "parameter", true);
    List<SNode> arguments = SLinkOperations.getTargets(nodeToCheck, "parameter", true);
    for(int i = 0 ; i < ListSequence.fromList(params).count() ; i = i + 1) {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseQuickFixProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(ListSequence.fromList(arguments).getElement(i), "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406622", true), SLinkOperations.getTarget(ListSequence.fromList(params).getElement(i), "type", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406620", false, 0, intentionProvider);
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseQuickFixProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406635", true), SLinkOperations.getTarget(SLinkOperations.getTarget(nodeToCheck, "method", false), "type", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406634", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.InstanceMethodCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
