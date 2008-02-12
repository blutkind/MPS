package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class ComponentInstance extends BaseConcept implements IComponentPart, INamedConcept {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.ComponentInstance";
  public static String CONTENT = "content";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String NAME = "name";
  public static String COMPONENT_DECLARATION = "componentDeclaration";

  public  ComponentInstance(SNode node) {
    super(node);
  }

  public static ComponentInstance newInstance(SModel sm, boolean init) {
    return (ComponentInstance)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.ComponentInstance", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ComponentInstance newInstance(SModel sm) {
    return ComponentInstance.newInstance(sm, false);
  }


  public int getContentsCount() {
    return this.getChildCount(ComponentInstance.CONTENT);
  }

  public Iterator<IComponentPart> contents() {
    return this.children(ComponentInstance.CONTENT);
  }

  public List<IComponentPart> getContents() {
    return this.getChildren(ComponentInstance.CONTENT);
  }

  public void addContent(IComponentPart node) {
    this.addChild(ComponentInstance.CONTENT, node);
  }

  public void insertContent(IComponentPart prev, IComponentPart node) {
    this.insertChild(prev, ComponentInstance.CONTENT, node);
  }

  public String getShortDescription() {
    return this.getProperty(ComponentInstance.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ComponentInstance.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ComponentInstance.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ComponentInstance.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ComponentInstance.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ComponentInstance.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(ComponentInstance.NAME);
  }

  public void setName(String value) {
    this.setProperty(ComponentInstance.NAME, value);
  }

  public ComponentDeclaration getComponentDeclaration() {
    return (ComponentDeclaration)this.getReferent(ComponentInstance.COMPONENT_DECLARATION);
  }

  public void setComponentDeclaration(ComponentDeclaration node) {
    super.setReferent(ComponentInstance.COMPONENT_DECLARATION, node);
  }

}
