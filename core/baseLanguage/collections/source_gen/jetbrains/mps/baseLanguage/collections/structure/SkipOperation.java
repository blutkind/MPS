package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SkipOperation extends SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.SkipOperation";
  public static final String ELEMENTS_TO_SKIP = "elementsToSkip";

  public SkipOperation(SNode node) {
    super(node);
  }

  public Expression getElementsToSkip() {
    return (Expression)this.getChild(SkipOperation.ELEMENTS_TO_SKIP);
  }

  public void setElementsToSkip(Expression node) {
    super.setChild(SkipOperation.ELEMENTS_TO_SKIP, node);
  }


  public static SkipOperation newInstance(SModel sm, boolean init) {
    return (SkipOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SkipOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SkipOperation newInstance(SModel sm) {
    return SkipOperation.newInstance(sm, false);
  }

}
