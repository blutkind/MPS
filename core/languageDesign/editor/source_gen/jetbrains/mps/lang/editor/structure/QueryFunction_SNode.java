package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_SNode extends QueryFunction_StyleParameter {
  public static final String concept = "jetbrains.mps.lang.editor.structure.QueryFunction_SNode";

  public QueryFunction_SNode(SNode node) {
    super(node);
  }

  public static QueryFunction_SNode newInstance(SModel sm, boolean init) {
    return (QueryFunction_SNode)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.QueryFunction_SNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_SNode newInstance(SModel sm) {
    return QueryFunction_SNode.newInstance(sm, false);
  }
}
