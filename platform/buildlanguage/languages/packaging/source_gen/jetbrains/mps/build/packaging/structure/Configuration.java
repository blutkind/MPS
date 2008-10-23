package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Configuration extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.build.packaging.structure.Configuration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public Configuration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(Configuration.NAME);
  }

  public void setName(String value) {
    this.setProperty(Configuration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Configuration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Configuration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Configuration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Configuration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Configuration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Configuration.VIRTUAL_PACKAGE, value);
  }


  public static Configuration newInstance(SModel sm, boolean init) {
    return (Configuration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.Configuration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Configuration newInstance(SModel sm) {
    return Configuration.newInstance(sm, false);
  }

}
