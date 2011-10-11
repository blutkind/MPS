package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class ConvertToClosure_Intention extends BaseIntention implements Intention {
  public ConvertToClosure_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.AnonymousClass";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Replace Anonymous Class with Closure Literal";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    SNode newExpression = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.GenericNewExpression", false, false);
    if ((newExpression == null)) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(SNodeOperations.getParent(newExpression), "jetbrains.mps.baseLanguage.structure.BaseMethodCall"))) {
      return false;
    }
    if (!(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(newExpression), "jetbrains.mps.baseLanguage.structure.BaseMethodCall"), "actualArgument", true)).contains(newExpression))) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface")) {
      SNode parentInterface = SNodeOperations.cast(SLinkOperations.getTarget(node, "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface");
      return (int) ListSequence.fromList(SLinkOperations.getTargets(parentInterface, "method", true)).count() == 1;
    }
    return false;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode closureLiteral = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", null);
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "method", true)).isNotEmpty()) {
      SLinkOperations.setTarget(closureLiteral, "body", SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(node, "method", true)).first(), "body", true), true);
    }
    SNode method = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SLinkOperations.getTarget(node, "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface"), "method", true)).first();
    ListSequence.fromList(SLinkOperations.getTargets(closureLiteral, "parameter", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)));
    SNodeOperations.replaceWithAnother(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.GenericNewExpression", false, false), closureLiteral);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
