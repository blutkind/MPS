package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.lang.refactoring.structure.AbstractUIArgumentExpression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModuleExpression extends AbstractUIArgumentExpression {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.ModuleExpression";

  public ModuleExpression(SNode node) {
    super(node);
  }

  public static ModuleExpression newInstance(SModel sm, boolean init) {
    return (ModuleExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ModuleExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModuleExpression newInstance(SModel sm) {
    return ModuleExpression.newInstance(sm, false);
  }

}
