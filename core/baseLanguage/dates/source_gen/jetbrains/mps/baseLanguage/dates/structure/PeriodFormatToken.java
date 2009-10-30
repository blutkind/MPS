package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PeriodFormatToken extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.PeriodFormatToken";

  public PeriodFormatToken(SNode node) {
    super(node);
  }

  public static PeriodFormatToken newInstance(SModel sm, boolean init) {
    return (PeriodFormatToken)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodFormatToken", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PeriodFormatToken newInstance(SModel sm) {
    return PeriodFormatToken.newInstance(sm, false);
  }
}
