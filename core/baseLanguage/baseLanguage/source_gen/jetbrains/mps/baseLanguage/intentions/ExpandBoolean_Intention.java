package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;

public class ExpandBoolean_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.VariableReference";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Expand boolean";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "variableDeclaration", false), "type", true), "jetbrains.mps.baseLanguage.structure.BooleanType"))) {
      return false;
    }
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.StatementList", false, false) == null) {
      return false;
    }
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode statementNode = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
    // 
    SNode ifNode = SNodeOperations.insertNewPrevSiblingChild(statementNode, "jetbrains.mps.baseLanguage.structure.IfStatement");
    SNode ifTrue = SLinkOperations.setNewChild(ifNode, "ifTrue", "jetbrains.mps.baseLanguage.structure.StatementList");
    SNode ifFalse = SLinkOperations.setNewChild(SLinkOperations.setNewChild(ifNode, "ifFalseStatement", "jetbrains.mps.baseLanguage.structure.BlockStatement"), "statements", "jetbrains.mps.baseLanguage.structure.StatementList");
    // 
    SLinkOperations.setTarget(ifNode, "condition", SNodeOperations.copyNode(node), true);
    // 
    SLinkOperations.insertChildFirst(ifTrue, "statement", SNodeOperations.copyNode(statementNode));
    SLinkOperations.insertChildFirst(ifFalse, "statement", SNodeOperations.copyNode(statementNode));
    // 
    final SNode fake_node = node;
    Iterable<SNode> refs;
    refs = ListSequence.fromList(SNodeOperations.getDescendants(ListSequence.fromList(SLinkOperations.getTargets(ifTrue, "statement", true)).first(), null, false)).where(new IWhereFilter<SNode>() {

      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.VariableReference") && SLinkOperations.getTarget(it, "variableDeclaration", false) == SLinkOperations.getTarget(fake_node, "variableDeclaration", false);
      }

    });
    Sequence.fromIterable(refs).visitAll(new IVisitor<SNode>() {

      public void visit(SNode it) {
        SNode booleanConstant = SNodeOperations.replaceWithNewChild(it, "jetbrains.mps.baseLanguage.structure.BooleanConstant");
        SPropertyOperations.set(booleanConstant, "value", "" + (true));
      }

    });
    refs = ListSequence.fromList(SNodeOperations.getDescendants(ListSequence.fromList(SLinkOperations.getTargets(ifFalse, "statement", true)).first(), null, false)).where(new IWhereFilter<SNode>() {

      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.VariableReference") && SLinkOperations.getTarget(it, "variableDeclaration", false) == SLinkOperations.getTarget(fake_node, "variableDeclaration", false);
      }

    });
    Sequence.fromIterable(refs).visitAll(new IVisitor<SNode>() {

      public void visit(SNode it) {
        SNode booleanConstant = SNodeOperations.replaceWithNewChild(it, "jetbrains.mps.baseLanguage.structure.BooleanConstant");
        SPropertyOperations.set(booleanConstant, "value", "" + (false));
      }

    });
    // 
    SNodeOperations.deleteNode(statementNode);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
