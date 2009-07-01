package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class WhereOperation extends InternalSequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.WhereOperation";

  public WhereOperation(SNode node) {
    super(node);
  }

  public Expression getFilter() {
    return this.ensureAdapter(Expression.class, "closure", this.getClosure());
  }

  public void setFilter(Expression node) {
    this.setClosure(node);
  }


  public static WhereOperation newInstance(SModel sm, boolean init) {
    return (WhereOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.WhereOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static WhereOperation newInstance(SModel sm) {
    return WhereOperation.newInstance(sm, false);
  }

}
