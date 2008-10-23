package jetbrains.mps.baseLanguage.classifiers.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DefaultClassifierFieldAccessOperation extends BaseConcept implements IMemberOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String MEMBER = "member";

  public DefaultClassifierFieldAccessOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(DefaultClassifierFieldAccessOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DefaultClassifierFieldAccessOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DefaultClassifierFieldAccessOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DefaultClassifierFieldAccessOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DefaultClassifierFieldAccessOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DefaultClassifierFieldAccessOperation.VIRTUAL_PACKAGE, value);
  }

  public IMember getMember() {
    return (IMember)this.getReferent(DefaultClassifierFieldAccessOperation.MEMBER);
  }

  public void setMember(IMember node) {
    super.setReferent(DefaultClassifierFieldAccessOperation.MEMBER, node);
  }

  public DefaultClassifierFieldDeclaration getField() {
    return (DefaultClassifierFieldDeclaration)this.getMember();
  }

  public void setField(DefaultClassifierFieldDeclaration node) {
    this.setMember(node);
  }


  public static DefaultClassifierFieldAccessOperation newInstance(SModel sm, boolean init) {
    return (DefaultClassifierFieldAccessOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DefaultClassifierFieldAccessOperation newInstance(SModel sm) {
    return DefaultClassifierFieldAccessOperation.newInstance(sm, false);
  }

}
