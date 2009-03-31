package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.regexp.structure.Regexp;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PredefinedSymbolClassRegexp extends Regexp {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp";
  public static final String SYMBOL_CLASS = "symbolClass";

  public PredefinedSymbolClassRegexp(SNode node) {
    super(node);
  }

  public PredefinedSymbolClassDeclaration getSymbolClass() {
    return (PredefinedSymbolClassDeclaration)this.getReferent(PredefinedSymbolClassDeclaration.class, PredefinedSymbolClassRegexp.SYMBOL_CLASS);
  }

  public void setSymbolClass(PredefinedSymbolClassDeclaration node) {
    super.setReferent(PredefinedSymbolClassRegexp.SYMBOL_CLASS, node);
  }


  public static PredefinedSymbolClassRegexp newInstance(SModel sm, boolean init) {
    return (PredefinedSymbolClassRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PredefinedSymbolClassRegexp newInstance(SModel sm) {
    return PredefinedSymbolClassRegexp.newInstance(sm, false);
  }

}
