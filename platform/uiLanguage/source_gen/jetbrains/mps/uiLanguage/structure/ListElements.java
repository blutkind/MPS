package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

public class ListElements extends BaseConcept implements IComponentPart {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.ListElements";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String VALUE = "value";

  public ListElements(SNode node) {
    super(node);
  }

  public static ListElements newInstance(SModel sm, boolean init) {
    return (ListElements) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.ListElements", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ListElements newInstance(SModel sm) {
    return ListElements.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(ListElements.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ListElements.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ListElements.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ListElements.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ListElements.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ListElements.VIRTUAL_PACKAGE, value);
  }

  public Expression getValue() {
    return (Expression) this.getChild(ListElements.VALUE);
  }

  public void setValue(Expression node) {
    super.setChild(ListElements.VALUE, node);
  }

}
