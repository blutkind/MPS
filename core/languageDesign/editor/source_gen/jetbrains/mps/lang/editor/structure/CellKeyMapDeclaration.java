package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.structure.structure.IConceptAspect;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellKeyMapDeclaration extends BaseConcept implements INamedConcept, IConceptAspect {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellKeyMapDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EVERY_MODEL = "everyModel";
  public static final String APPLICABLE_CONCEPT = "applicableConcept";
  public static final String ITEM = "item";

  public CellKeyMapDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(CellKeyMapDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(CellKeyMapDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(CellKeyMapDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CellKeyMapDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CellKeyMapDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CellKeyMapDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CellKeyMapDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CellKeyMapDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getEveryModel() {
    return this.getBooleanProperty(CellKeyMapDeclaration.EVERY_MODEL);
  }

  public void setEveryModel(boolean value) {
    this.setBooleanProperty(CellKeyMapDeclaration.EVERY_MODEL, value);
  }

  public AbstractConceptDeclaration getApplicableConcept() {
    return (AbstractConceptDeclaration)this.getReferent(AbstractConceptDeclaration.class, CellKeyMapDeclaration.APPLICABLE_CONCEPT);
  }

  public void setApplicableConcept(AbstractConceptDeclaration node) {
    super.setReferent(CellKeyMapDeclaration.APPLICABLE_CONCEPT, node);
  }

  public int getItemsCount() {
    return this.getChildCount(CellKeyMapDeclaration.ITEM);
  }

  public Iterator<CellKeyMapItem> items() {
    return this.children(CellKeyMapItem.class, CellKeyMapDeclaration.ITEM);
  }

  public List<CellKeyMapItem> getItems() {
    return this.getChildren(CellKeyMapItem.class, CellKeyMapDeclaration.ITEM);
  }

  public void addItem(CellKeyMapItem node) {
    this.addChild(CellKeyMapDeclaration.ITEM, node);
  }

  public void insertItem(CellKeyMapItem prev, CellKeyMapItem node) {
    this.insertChild(prev, CellKeyMapDeclaration.ITEM, node);
  }

  public static CellKeyMapDeclaration newInstance(SModel sm, boolean init) {
    return (CellKeyMapDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellKeyMapDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellKeyMapDeclaration newInstance(SModel sm) {
    return CellKeyMapDeclaration.newInstance(sm, false);
  }
}
