package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.FieldDeclaration;
import jetbrains.mps.baseLanguage.classifiers.structure.IMember;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ActionParameterDeclaration extends FieldDeclaration implements IMember, ActionParameter {
public    static final String concept = "jetbrains.mps.lang.plugin.structure.ActionParameterDeclaration";
public    static final String NAME = "name";
public    static final String SHORT_DESCRIPTION = "shortDescription";
public    static final String ALIAS = "alias";
public    static final String VIRTUAL_PACKAGE = "virtualPackage";
public    static final String IS_OPTIONAL = "isOptional";

  public ActionParameterDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ActionParameterDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(ActionParameterDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ActionParameterDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ActionParameterDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ActionParameterDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ActionParameterDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ActionParameterDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ActionParameterDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsOptional() {
    return this.getBooleanProperty(ActionParameterDeclaration.IS_OPTIONAL);
  }

  public void setIsOptional(boolean value) {
    this.setBooleanProperty(ActionParameterDeclaration.IS_OPTIONAL, value);
  }


  public static ActionParameterDeclaration newInstance(SModel sm, boolean init) {
    return (ActionParameterDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionParameterDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ActionParameterDeclaration newInstance(SModel sm) {
    return ActionParameterDeclaration.newInstance(sm, false);
  }

}
