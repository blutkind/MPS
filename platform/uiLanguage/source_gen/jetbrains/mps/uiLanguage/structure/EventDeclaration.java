package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.structure.IMember;
import jetbrains.mps.baseLanguage.structure.ParameterDeclaration;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

public class EventDeclaration extends BaseConcept implements IMember {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.EventDeclaration";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String PARAMETER = "parameter";
  public static String INITIALIZER = "initializer";

  public EventDeclaration(SNode node) {
    super(node);
  }

  public static EventDeclaration newInstance(SModel sm, boolean init) {
    return (EventDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.EventDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EventDeclaration newInstance(SModel sm) {
    return EventDeclaration.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(EventDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(EventDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(EventDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EventDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EventDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EventDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EventDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EventDeclaration.VIRTUAL_PACKAGE, value);
  }

  public ParameterDeclaration getParameter() {
    return (ParameterDeclaration) this.getChild(EventDeclaration.PARAMETER);
  }

  public void setParameter(ParameterDeclaration node) {
    super.setChild(EventDeclaration.PARAMETER, node);
  }

  public StatementList getInitializer() {
    return (StatementList) this.getChild(EventDeclaration.INITIALIZER);
  }

  public void setInitializer(StatementList node) {
    super.setChild(EventDeclaration.INITIALIZER, node);
  }

}
