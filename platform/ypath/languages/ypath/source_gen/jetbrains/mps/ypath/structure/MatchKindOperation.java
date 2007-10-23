package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatchKindOperation extends TreePathOperation {
  public static final String concept = "jetbrains.mps.ypath.structure.MatchKindOperation";
  public static String NODE_KIND_OCCURRENCE = "nodeKindOccurrence";
  public static String NODE_KIND = "nodeKind";

  public  MatchKindOperation(SNode node) {
    super(node);
  }

  public static MatchKindOperation newInstance(SModel sm, boolean init) {
    return (MatchKindOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.MatchKindOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MatchKindOperation newInstance(SModel sm) {
    return MatchKindOperation.newInstance(sm, false);
  }


  public TreeNodeKindOccurrence getNodeKindOccurrence() {
    return (TreeNodeKindOccurrence)this.getChild(MatchKindOperation.NODE_KIND_OCCURRENCE);
  }

  public void setNodeKindOccurrence(TreeNodeKindOccurrence node) {
    super.setChild(MatchKindOperation.NODE_KIND_OCCURRENCE, node);
  }

  public TreeNodeKind getNodeKind() {
    return (TreeNodeKind)this.getReferent(MatchKindOperation.NODE_KIND);
  }

  public void setNodeKind(TreeNodeKind node) {
    super.setReferent(MatchKindOperation.NODE_KIND, node);
  }

}
