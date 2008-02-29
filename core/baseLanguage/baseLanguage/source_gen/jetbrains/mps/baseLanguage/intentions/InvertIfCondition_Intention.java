package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class InvertIfCondition_Intention extends BaseIntention implements Intention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.IfStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Invert If condition";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    return (SLinkOperations.getTarget(node, "ifFalseStatement", true) != null);
  }

  public void execute(SNode node, EditorContext editorContext) {
    // Invert condition
    SNode condition = SLinkOperations.getTarget(node, "condition", true);
    if((condition != null)) {
      if(SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.NotExpression")) {
        condition = SLinkOperations.getTarget(condition, "expression", true);
      } else
      {
        SNode newCondition = null;
        if(SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.EqualsExpression")) {
          newCondition = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.NotEqualsExpression", null);
        } else
        if(SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.NotEqualsExpression")) {
          newCondition = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.EqualsExpression", null);
        } else
        if(SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.GreaterThanExpression")) {
          newCondition = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression", null);
        } else
        if(SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression")) {
          newCondition = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LessThanExpression", null);
        } else
        if(SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.LessThanExpression")) {
          newCondition = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression", null);
        } else
        if(SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression")) {
          newCondition = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.GreaterThanExpression", null);
        }
        if(newCondition != null) {
          SLinkOperations.setTarget(newCondition, "leftExpression", SLinkOperations.getTarget(condition, "leftExpression", true), true);
          SLinkOperations.setTarget(newCondition, "rightExpression", SLinkOperations.getTarget(condition, "rightExpression", true), true);
          condition = newCondition;
        } else
        {
          SNode notExpression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.NotExpression", null);
          SLinkOperations.setTarget(notExpression, "expression", condition, true);
          condition = notExpression;
        }
      }
      SLinkOperations.setTarget(node, "condition", condition, true);
    }
    // Flip ifTrue and ifFalse
    SNode ifTrue = SLinkOperations.getTarget(node, "ifTrue", true);
    SNode ifFalse = SLinkOperations.getTarget(node, "ifFalseStatement", true);
    // Set new ifFalseStatement
    if(SLinkOperations.getCount(ifTrue, "statement") == 0) {
      SLinkOperations.setTarget(node, "ifFalseStatement", null, true);
    } else
    if(SLinkOperations.getCount(ifTrue, "statement") == 1 && SNodeOperations.isInstanceOf(SequenceOperations.getFirst(SLinkOperations.getTargets(ifTrue, "statement", true)), "jetbrains.mps.baseLanguage.structure.IfStatement")) {
      SLinkOperations.setTarget(node, "ifFalseStatement", SequenceOperations.getFirst(SLinkOperations.getTargets(ifTrue, "statement", true)), true);
    } else
    {
      SLinkOperations.addAll(SLinkOperations.getTarget(SLinkOperations.setNewChild(node, "ifFalseStatement", "jetbrains.mps.baseLanguage.structure.BlockStatement"), "statements", true), "statement", SLinkOperations.getTargets(ifTrue, "statement", true));
    }
    // Set new ifTrue
    if(SNodeOperations.isInstanceOf(ifFalse, "jetbrains.mps.baseLanguage.structure.BlockStatement")) {
      SLinkOperations.setTarget(node, "ifTrue", SLinkOperations.getTarget(ifFalse, "statements", true), true);
    } else
    {
      SLinkOperations.addChild(SLinkOperations.setNewChild(node, "ifTrue", "jetbrains.mps.baseLanguage.structure.StatementList"), "statement", ifFalse);
    }
  }

}
