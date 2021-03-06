package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LanguageReferenceExpression extends ModuleReferenceExpression {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.LanguageReferenceExpression";

  public LanguageReferenceExpression(SNode node) {
    super(node);
  }

  public static LanguageReferenceExpression newInstance(SModel sm, boolean init) {
    return (LanguageReferenceExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.LanguageReferenceExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LanguageReferenceExpression newInstance(SModel sm) {
    return LanguageReferenceExpression.newInstance(sm, false);
  }
}
