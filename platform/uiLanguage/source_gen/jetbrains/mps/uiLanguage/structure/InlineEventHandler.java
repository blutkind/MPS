package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Statement;

public class InlineEventHandler extends BaseConcept implements IComponentPart {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.InlineEventHandler";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String EVENT = "event";
  public static String HANDLER = "handler";

  public InlineEventHandler(SNode node) {
    super(node);
  }

  public static InlineEventHandler newInstance(SModel sm, boolean init) {
    return (InlineEventHandler) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.InlineEventHandler", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InlineEventHandler newInstance(SModel sm) {
    return InlineEventHandler.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(InlineEventHandler.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InlineEventHandler.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InlineEventHandler.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InlineEventHandler.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InlineEventHandler.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InlineEventHandler.VIRTUAL_PACKAGE, value);
  }

  public EventDeclaration getEvent() {
    return (EventDeclaration) this.getReferent(InlineEventHandler.EVENT);
  }

  public void setEvent(EventDeclaration node) {
    super.setReferent(InlineEventHandler.EVENT, node);
  }

  public Statement getHandler() {
    return (Statement) this.getChild(InlineEventHandler.HANDLER);
  }

  public void setHandler(Statement node) {
    super.setChild(InlineEventHandler.HANDLER, node);
  }

}
