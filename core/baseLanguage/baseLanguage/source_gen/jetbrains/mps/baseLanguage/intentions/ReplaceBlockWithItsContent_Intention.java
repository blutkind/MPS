package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.List;

public class ReplaceBlockWithItsContent_Intention extends BaseIntention implements Intention {

  private Map<String, Object[]> myMap = new HashMap<String, Object[]>();

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
    if ((SNodeOperations.getParent(node) != null)) {
      String role = node.getRole_();
      SNode linkDeclaration = ((SNode)BaseAdapter.fromAdapter(SNodeOperations.getParent(node).getLinkDeclaration(role)));
      if (SConceptOperations.isSuperConceptOf(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Statement"), NameUtil.nodeFQName(SLinkOperations.getTarget(linkDeclaration, "target", false)))) {
        int statementsCount = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "statements", true), "statement", true)).count();
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
    for(SNode statement : statements) {
      SNodeOperations.insertPrevSiblingChild(node, statement);
    }
    SNodeOperations.deleteNode(node);
  }

  public Object[] getField(String key) {
    Object[] value = this.myMap.get(key);
    if (value == null) {
      value = new Object[1];
      this.myMap.put(key, value);
    }
    return value;
  }

  public void putArgument(String key, Object argument) {
    this.getField(key)[0] = argument;
  }

  public String getSourceModelUID() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
