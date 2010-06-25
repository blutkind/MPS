package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SortOperation extends InternalSequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.SortOperation";
  public static final String ASCENDING = "ascending";

  public SortOperation(SNode node) {
    super(node);
  }

  public Expression getToComparable() {
    return this.ensureAdapter(Expression.class, "closure", this.getClosure());
  }

  public void setToComparable(Expression node) {
    this.setClosure(node);
  }

  public Expression getAscending() {
    return (Expression) this.getChild(Expression.class, SortOperation.ASCENDING);
  }

  public void setAscending(Expression node) {
    super.setChild(SortOperation.ASCENDING, node);
  }

  public static SortOperation newInstance(SModel sm, boolean init) {
    return (SortOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SortOperation newInstance(SModel sm) {
    return SortOperation.newInstance(sm, false);
  }
}
