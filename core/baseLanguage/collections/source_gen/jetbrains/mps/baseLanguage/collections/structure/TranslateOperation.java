package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TranslateOperation extends InternalSequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.TranslateOperation";

  public TranslateOperation(SNode node) {
    super(node);
  }

  public Expression getMapper() {
    return this.ensureAdapter(Expression.class, "closure", this.getClosure());
  }

  public void setMapper(Expression node) {
    this.setClosure(node);
  }


  public static TranslateOperation newInstance(SModel sm, boolean init) {
    return (TranslateOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.TranslateOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TranslateOperation newInstance(SModel sm) {
    return TranslateOperation.newInstance(sm, false);
  }

}
