package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellActionMapDeclaration extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellActionMapDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String APPLICABLE_CONCEPT = "applicableConcept";
  public static final String ITEM = "item";

  public CellActionMapDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(CellActionMapDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(CellActionMapDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(CellActionMapDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CellActionMapDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CellActionMapDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CellActionMapDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CellActionMapDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CellActionMapDeclaration.VIRTUAL_PACKAGE, value);
  }

  public AbstractConceptDeclaration getApplicableConcept() {
    return (AbstractConceptDeclaration)this.getReferent(CellActionMapDeclaration.APPLICABLE_CONCEPT);
  }

  public void setApplicableConcept(AbstractConceptDeclaration node) {
    super.setReferent(CellActionMapDeclaration.APPLICABLE_CONCEPT, node);
  }

  public int getItemsCount() {
    return this.getChildCount(CellActionMapDeclaration.ITEM);
  }

  public Iterator<CellActionMapItem> items() {
    return this.children(CellActionMapDeclaration.ITEM);
  }

  public List<CellActionMapItem> getItems() {
    return this.getChildren(CellActionMapDeclaration.ITEM);
  }

  public void addItem(CellActionMapItem node) {
    this.addChild(CellActionMapDeclaration.ITEM, node);
  }

  public void insertItem(CellActionMapItem prev, CellActionMapItem node) {
    this.insertChild(prev, CellActionMapDeclaration.ITEM, node);
  }


  public static CellActionMapDeclaration newInstance(SModel sm, boolean init) {
    return (CellActionMapDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellActionMapDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellActionMapDeclaration newInstance(SModel sm) {
    return CellActionMapDeclaration.newInstance(sm, false);
  }

}
