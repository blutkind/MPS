package jetbrains.mps.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PredefinedSymbolClassRegexp extends Regexp {
  public static final String concept = "jetbrains.mps.regexp.structure.PredefinedSymbolClassRegexp";
  public static String SYMBOL_CLASS = "symbolClass";

  public  PredefinedSymbolClassRegexp(SNode node) {
    super(node);
  }

  public static PredefinedSymbolClassRegexp newInstance(SModel sm, boolean init) {
    return (PredefinedSymbolClassRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.structure.PredefinedSymbolClassRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PredefinedSymbolClassRegexp newInstance(SModel sm) {
    return PredefinedSymbolClassRegexp.newInstance(sm, false);
  }


  public PredefinedSymbolClassDeclaration getSymbolClass() {
    return (PredefinedSymbolClassDeclaration)this.getReferent(PredefinedSymbolClassRegexp.SYMBOL_CLASS);
  }

  public void setSymbolClass(PredefinedSymbolClassDeclaration node) {
    super.setReferent(PredefinedSymbolClassRegexp.SYMBOL_CLASS, node);
  }

}
