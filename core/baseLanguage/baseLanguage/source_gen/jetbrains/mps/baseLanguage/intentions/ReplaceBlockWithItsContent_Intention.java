package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;

public class ReplaceBlockWithItsContent_Intention extends BaseIntention implements Intention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BlockStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Replace block with its content";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    boolean applicable = false;
    if ((SNodeOperations.getParent(node, null, false, false) != null)) {
      String role = node.getRole_();
      SNode linkDeclaration = ((SNode)BaseAdapter.fromAdapter(SNodeOperations.getParent(node, null, false, false).getLinkDeclaration(role)));
      if (SConceptOperations.isSuperConceptOf(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Statement"), NameUtil.nodeFQName(SLinkOperations.getTarget(linkDeclaration, "target", false)))) {
        int statementsCount = SequenceOperations.getSize(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "statements", true), "statement", true));
        if (SPropertyOperations.hasValue(linkDeclaration, "sourceCardinality", "0..1", "0..1")) {
          applicable = statementsCount <= 1;
        } else
        if (SPropertyOperations.hasValue(linkDeclaration, "sourceCardinality", "0..n", "0..1")) {
          applicable = true;
        } else
        if (SPropertyOperations.hasValue(linkDeclaration, "sourceCardinality", "1", "0..1")) {
          applicable = statementsCount == 1;
        } else
        if (SPropertyOperations.hasValue(linkDeclaration, "sourceCardinality", "1..n", "0..1")) {
          applicable = statementsCount >= 1;
        }
      }
    }
    return applicable;
  }

  public void execute(SNode node, EditorContext editorContext) {
    List<SNode> statements = SLinkOperations.getTargets(SLinkOperations.getTarget(node, "statements", true), "statement", true);
    {
      ICursor<SNode> _zCursor = CursorFactory.createCursor(statements);
      try {
        while(_zCursor.moveToNext()) {
          SNode statement = _zCursor.getCurrent();
          SNodeOperations.insertPrevSiblingChild(node, statement);
        }
      } finally {
        _zCursor.release();
      }
    }
    SNodeOperations.deleteNode(node);
  }

}
