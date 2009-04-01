package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.core.structure.IResolveInfo;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ClosureParameter extends BaseConcept implements INamedConcept, IResolveInfo {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ClosureParameter";
  public static final String NAME = "name";
  public static final String RESOLVE_INFO = "resolveInfo";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public ClosureParameter(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ClosureParameter.NAME);
  }

  public void setName(String value) {
    this.setProperty(ClosureParameter.NAME, value);
  }

  public String getResolveInfo() {
    return this.getProperty(ClosureParameter.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(ClosureParameter.RESOLVE_INFO, value);
  }

  public String getShortDescription() {
    return this.getProperty(ClosureParameter.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ClosureParameter.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ClosureParameter.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ClosureParameter.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ClosureParameter.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ClosureParameter.VIRTUAL_PACKAGE, value);
  }


  public static ClosureParameter newInstance(SModel sm, boolean init) {
    return (ClosureParameter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClosureParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClosureParameter newInstance(SModel sm) {
    return ClosureParameter.newInstance(sm, false);
  }

}
