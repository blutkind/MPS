package jetbrains.mps.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PredefinedSymbolClassSymbolClassPart extends SymbolClassPart {
  public static final String concept = "jetbrains.mps.regexp.structure.PredefinedSymbolClassSymbolClassPart";
  public static String DECLARATION = "declaration";

  public  PredefinedSymbolClassSymbolClassPart(SNode node) {
    super(node);
  }

  public static PredefinedSymbolClassSymbolClassPart newInstance(SModel sm, boolean init) {
    return (PredefinedSymbolClassSymbolClassPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.structure.PredefinedSymbolClassSymbolClassPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PredefinedSymbolClassSymbolClassPart newInstance(SModel sm) {
    return PredefinedSymbolClassSymbolClassPart.newInstance(sm, false);
  }


  public PredefinedSymbolClassDeclaration getDeclaration() {
    return (PredefinedSymbolClassDeclaration)this.getReferent(PredefinedSymbolClassSymbolClassPart.DECLARATION);
  }

  public void setDeclaration(PredefinedSymbolClassDeclaration node) {
    super.setReferent(PredefinedSymbolClassSymbolClassPart.DECLARATION, node);
  }

}
