package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.structure.structure.IConceptAspect;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuComponent extends AbstractComponent implements INamedConcept, IConceptAspect {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuComponent";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String APPLICABLE_FEATURE = "applicableFeature";
  public static final String MENU_DESCRIPTOR = "menuDescriptor";

  public CellMenuComponent(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(CellMenuComponent.NAME);
  }

  public void setName(String value) {
    this.setProperty(CellMenuComponent.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(CellMenuComponent.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CellMenuComponent.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CellMenuComponent.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CellMenuComponent.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CellMenuComponent.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CellMenuComponent.VIRTUAL_PACKAGE, value);
  }

  public CellMenuComponentFeature getApplicableFeature() {
    return (CellMenuComponentFeature)this.getChild(CellMenuComponentFeature.class, CellMenuComponent.APPLICABLE_FEATURE);
  }

  public void setApplicableFeature(CellMenuComponentFeature node) {
    super.setChild(CellMenuComponent.APPLICABLE_FEATURE, node);
  }

  public CellMenuDescriptor getMenuDescriptor() {
    return (CellMenuDescriptor)this.getChild(CellMenuDescriptor.class, CellMenuComponent.MENU_DESCRIPTOR);
  }

  public void setMenuDescriptor(CellMenuDescriptor node) {
    super.setChild(CellMenuComponent.MENU_DESCRIPTOR, node);
  }

  public static CellMenuComponent newInstance(SModel sm, boolean init) {
    return (CellMenuComponent)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuComponent", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuComponent newInstance(SModel sm) {
    return CellMenuComponent.newInstance(sm, false);
  }
}
