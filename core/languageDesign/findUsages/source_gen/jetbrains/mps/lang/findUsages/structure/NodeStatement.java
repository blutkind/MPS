package jetbrains.mps.lang.findUsages.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeStatement extends Statement {
  public static final String concept = "jetbrains.mps.lang.findUsages.structure.NodeStatement";
  public static final String FOUND_NODE = "foundNode";

  public NodeStatement(SNode node) {
    super(node);
  }

  public Expression getFoundNode() {
    return (Expression)this.getChild(NodeStatement.FOUND_NODE);
  }

  public void setFoundNode(Expression node) {
    super.setChild(NodeStatement.FOUND_NODE, node);
  }


  public static NodeStatement newInstance(SModel sm, boolean init) {
    return (NodeStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.findUsages.structure.NodeStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeStatement newInstance(SModel sm) {
    return NodeStatement.newInstance(sm, false);
  }

}
