package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.NamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class NodeSubstituteActions extends NamedConcept {
  public static String ACTIONS_BUILDER = "actionsBuilder";

  public  NodeSubstituteActions(SNode node) {
    super(node);
  }

  public static NodeSubstituteActions newInstance(SModel sm) {
    return (NodeSubstituteActions)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActions", sm, GlobalScope.getInstance()).getAdapter();
  }

  public int getActionsBuildersCount() {
    return this.getChildCount(NodeSubstituteActions.ACTIONS_BUILDER);
  }
  public Iterator<NodeSubstituteActionsBuilder> actionsBuilders() {
    return this.children(NodeSubstituteActions.ACTIONS_BUILDER);
  }
  public List<NodeSubstituteActionsBuilder> getActionsBuilders() {
    return this.getChildren(NodeSubstituteActions.ACTIONS_BUILDER);
  }
  public void addActionsBuilder(NodeSubstituteActionsBuilder node) {
    this.addChild(NodeSubstituteActions.ACTIONS_BUILDER, node);
  }
  public void insertActionsBuilder(NodeSubstituteActionsBuilder prev, NodeSubstituteActionsBuilder node) {
    this.insertChild(prev, NodeSubstituteActions.ACTIONS_BUILDER, node);
  }
}
