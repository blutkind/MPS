package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.structure.IMember;
import jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation;
import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

public class AttributeReferenceOperation extends BaseConcept implements IMemberOperation {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String MEMBER = "member";

  public AttributeReferenceOperation(SNode node) {
    super(node);
  }

  public static AttributeReferenceOperation newInstance(SModel sm, boolean init) {
    return (AttributeReferenceOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AttributeReferenceOperation newInstance(SModel sm) {
    return AttributeReferenceOperation.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(AttributeReferenceOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AttributeReferenceOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AttributeReferenceOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AttributeReferenceOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AttributeReferenceOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AttributeReferenceOperation.VIRTUAL_PACKAGE, value);
  }

  public IMember getMember() {
    return (IMember) this.getReferent(AttributeReferenceOperation.MEMBER);
  }

  public void setMember(IMember node) {
    super.setReferent(AttributeReferenceOperation.MEMBER, node);
  }

  public AttributeDeclaration getAttributeDeclaration() {
    return (AttributeDeclaration) this.getMember();
  }

  public void setAttributeDeclaration(AttributeDeclaration node) {
    this.setMember(node);
  }

}
