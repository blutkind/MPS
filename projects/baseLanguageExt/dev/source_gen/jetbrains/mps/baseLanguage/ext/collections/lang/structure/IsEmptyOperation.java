package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IsEmptyOperation extends SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsEmptyOperation";

  public  IsEmptyOperation(SNode node) {
    super(node);
  }

  public static IsEmptyOperation newInstance(SModel sm, boolean init) {
    return (IsEmptyOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsEmptyOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IsEmptyOperation newInstance(SModel sm) {
    return IsEmptyOperation.newInstance(sm, false);
  }

}
