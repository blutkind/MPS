package jetbrains.mps.baseLanguage.blTypes.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FooConcept extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.blTypes.structure.FooConcept";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String BAR = "bar";

  public FooConcept(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(FooConcept.NAME);
  }

  public void setName(String value) {
    this.setProperty(FooConcept.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(FooConcept.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FooConcept.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FooConcept.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FooConcept.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FooConcept.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FooConcept.VIRTUAL_PACKAGE, value);
  }

  public BarConcept getBar() {
    return (BarConcept)this.getReferent(BarConcept.class, FooConcept.BAR);
  }

  public void setBar(BarConcept node) {
    super.setReferent(FooConcept.BAR, node);
  }


  public static FooConcept newInstance(SModel sm, boolean init) {
    return (FooConcept)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.structure.FooConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FooConcept newInstance(SModel sm) {
    return FooConcept.newInstance(sm, false);
  }

}
