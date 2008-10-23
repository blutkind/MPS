package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellRendererAttribute extends BaseConcept implements IComponentPart {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.CellRendererAttribute";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RENDERER = "renderer";

  public CellRendererAttribute(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(CellRendererAttribute.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CellRendererAttribute.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CellRendererAttribute.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CellRendererAttribute.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CellRendererAttribute.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CellRendererAttribute.VIRTUAL_PACKAGE, value);
  }

  public Expression getRenderer() {
    return (Expression)this.getChild(CellRendererAttribute.RENDERER);
  }

  public void setRenderer(Expression node) {
    super.setChild(CellRendererAttribute.RENDERER, node);
  }


  public static CellRendererAttribute newInstance(SModel sm, boolean init) {
    return (CellRendererAttribute)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.CellRendererAttribute", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellRendererAttribute newInstance(SModel sm) {
    return CellRendererAttribute.newInstance(sm, false);
  }

}
