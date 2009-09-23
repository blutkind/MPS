package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DoWhenDoneClause extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.DoWhenDoneClause";

  public DoWhenDoneClause(SNode node) {
    super(node);
  }

  public static DoWhenDoneClause newInstance(SModel sm, boolean init) {
    return (DoWhenDoneClause)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.DoWhenDoneClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DoWhenDoneClause newInstance(SModel sm) {
    return DoWhenDoneClause.newInstance(sm, false);
  }
}
