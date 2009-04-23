package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.classifiers.structure.IMember;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ActionConstructorParameterReferenceOperation extends BaseConcept implements IMemberOperation {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ActionConstructorParameterReferenceOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String MEMBER = "member";

  public ActionConstructorParameterReferenceOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ActionConstructorParameterReferenceOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ActionConstructorParameterReferenceOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ActionConstructorParameterReferenceOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ActionConstructorParameterReferenceOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ActionConstructorParameterReferenceOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ActionConstructorParameterReferenceOperation.VIRTUAL_PACKAGE, value);
  }

  public IMember getMember() {
    return (IMember)this.getReferent(IMember.class, ActionConstructorParameterReferenceOperation.MEMBER);
  }

  public void setMember(IMember node) {
    super.setReferent(ActionConstructorParameterReferenceOperation.MEMBER, node);
  }

  public ActionConstructionParameterDeclaration getDeclaration() {
    return this.ensureAdapter(ActionConstructionParameterDeclaration.class, "member", this.getMember());
  }

  public void setDeclaration(ActionConstructionParameterDeclaration node) {
    this.setMember(node);
  }


  public static ActionConstructorParameterReferenceOperation newInstance(SModel sm, boolean init) {
    return (ActionConstructorParameterReferenceOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionConstructorParameterReferenceOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ActionConstructorParameterReferenceOperation newInstance(SModel sm) {
    return ActionConstructorParameterReferenceOperation.newInstance(sm, false);
  }

}
