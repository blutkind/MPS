package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Interface extends Classifier implements IDeprecatable {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.Interface";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String IS_DEPRECATED = "isDeprecated";
  public static final String EXTENDED_INTERFACE = "extendedInterface";

  public Interface(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(Interface.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Interface.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Interface.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Interface.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Interface.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Interface.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsDeprecated() {
    return this.getBooleanProperty(Interface.IS_DEPRECATED);
  }

  public void setIsDeprecated(boolean value) {
    this.setBooleanProperty(Interface.IS_DEPRECATED, value);
  }

  public int getExtendedInterfacesCount() {
    return this.getChildCount(Interface.EXTENDED_INTERFACE);
  }

  public Iterator<ClassifierType> extendedInterfaces() {
    return this.children(Interface.EXTENDED_INTERFACE);
  }

  public List<ClassifierType> getExtendedInterfaces() {
    return this.getChildren(Interface.EXTENDED_INTERFACE);
  }

  public void addExtendedInterface(ClassifierType node) {
    this.addChild(Interface.EXTENDED_INTERFACE, node);
  }

  public void insertExtendedInterface(ClassifierType prev, ClassifierType node) {
    this.insertChild(prev, Interface.EXTENDED_INTERFACE, node);
  }


  public static Interface newInstance(SModel sm, boolean init) {
    return (Interface)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Interface", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Interface newInstance(SModel sm) {
    return Interface.newInstance(sm, false);
  }

}
