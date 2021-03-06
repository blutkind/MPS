package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QuickFixFieldReference extends Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.QuickFixFieldReference";
  public static final String QUICK_FIX_FIELD = "quickFixField";

  public QuickFixFieldReference(SNode node) {
    super(node);
  }

  public QuickFixField getQuickFixField() {
    return (QuickFixField) this.getReferent(QuickFixField.class, QuickFixFieldReference.QUICK_FIX_FIELD);
  }

  public void setQuickFixField(QuickFixField node) {
    super.setReferent(QuickFixFieldReference.QUICK_FIX_FIELD, node);
  }

  public static QuickFixFieldReference newInstance(SModel sm, boolean init) {
    return (QuickFixFieldReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.QuickFixFieldReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QuickFixFieldReference newInstance(SModel sm) {
    return QuickFixFieldReference.newInstance(sm, false);
  }
}
