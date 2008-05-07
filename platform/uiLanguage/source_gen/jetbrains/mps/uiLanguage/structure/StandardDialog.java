package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

import java.util.Iterator;
import java.util.List;

public class StandardDialog extends BaseConcept implements IComponentInstance {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.StandardDialog";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String ROOT_COMPONENT = "rootComponent";
  public static String BUTTON = "button";
  public static String CONTENT = "content";

  public StandardDialog(SNode node) {
    super(node);
  }

  public static StandardDialog newInstance(SModel sm, boolean init) {
    return (StandardDialog) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.StandardDialog", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StandardDialog newInstance(SModel sm) {
    return StandardDialog.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(StandardDialog.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(StandardDialog.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(StandardDialog.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(StandardDialog.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(StandardDialog.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(StandardDialog.VIRTUAL_PACKAGE, value);
  }

  public IComponentInstance getRootComponent() {
    return (IComponentInstance) this.getChild(StandardDialog.ROOT_COMPONENT);
  }

  public void setRootComponent(IComponentInstance node) {
    super.setChild(StandardDialog.ROOT_COMPONENT, node);
  }

  public int getButtonsCount() {
    return this.getChildCount(StandardDialog.BUTTON);
  }

  public Iterator<StandardDialogButton> buttons() {
    return this.children(StandardDialog.BUTTON);
  }

  public List<StandardDialogButton> getButtons() {
    return this.getChildren(StandardDialog.BUTTON);
  }

  public void addButton(StandardDialogButton node) {
    this.addChild(StandardDialog.BUTTON, node);
  }

  public void insertButton(StandardDialogButton prev, StandardDialogButton node) {
    this.insertChild(prev, StandardDialog.BUTTON, node);
  }

  public int getContentsCount() {
    return this.getChildCount(StandardDialog.CONTENT);
  }

  public Iterator<IComponentPart> contents() {
    return this.children(StandardDialog.CONTENT);
  }

  public List<IComponentPart> getContents() {
    return this.getChildren(StandardDialog.CONTENT);
  }

  public void addContent(IComponentPart node) {
    this.addChild(StandardDialog.CONTENT, node);
  }

  public void insertContent(IComponentPart prev, IComponentPart node) {
    this.insertChild(prev, StandardDialog.CONTENT, node);
  }

}
