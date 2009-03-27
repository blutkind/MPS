package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RegexpDeclarationReferenceRegexp extends jetbrains.mps.baseLanguage.regexp.structure.Regexp {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp";
  public static final String REGEXP = "regexp";

  public RegexpDeclarationReferenceRegexp(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration getRegexp() {
    return (jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration)this.getReferent(RegexpDeclaration.class, RegexpDeclarationReferenceRegexp.REGEXP);
  }

  public void setRegexp(jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration node) {
    super.setReferent(RegexpDeclarationReferenceRegexp.REGEXP, node);
  }


  public static RegexpDeclarationReferenceRegexp newInstance(SModel sm, boolean init) {
    return (RegexpDeclarationReferenceRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RegexpDeclarationReferenceRegexp newInstance(SModel sm) {
    return RegexpDeclarationReferenceRegexp.newInstance(sm, false);
  }

}
