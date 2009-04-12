package smodelLanguage.samples;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;

public class TypeCast {

  public void cast_node_to_SNode(SNode ifStatement) {
    SNode nodeObject1 = ifStatement;
    SNode nodeObject2 = (SNode)SLinkOperations.getTarget(ifStatement, "condition", true);
    SNode nodeObject3 = SLinkOperations.getTarget(ifStatement, "condition", true);
    SNode expression = SNodeOperations.cast(nodeObject3, "jetbrains.mps.baseLanguage.structure.Expression");
  }

  public void cast_SNode_to_node(SNode node) {
    SNode node1 = node;
    SNode node2 = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.IfStatement");
  }

  public void upcast_snode(SNode snode) {
    SNode ifStatement = SNodeOperations.cast(snode, "jetbrains.mps.baseLanguage.structure.IfStatement");
    SNode ifStatement1 = SNodeOperations.cast(snode, "jetbrains.mps.baseLanguage.structure.IfStatement");
  }

  public void cast_children_to_nlist(SNode statementList) {
    List<SNode> statements = SLinkOperations.getTargets(statementList, "statement", true);
  }

  public void cast_nlist_to_List(List<SNode> statements) {
    List list1 = statements;
    List<SNode> list2 = statements;
  }

  public void cast_children_to_List(SNode statements) {
    List list1 = SLinkOperations.getTargets(statements, "statement", true);
    List<SNode> list2 = SLinkOperations.getTargets(statements, "statement", true);
    List<SNode> list3 = (List<SNode>)SLinkOperations.getTargets(statements, "statement", true);
  }

}
