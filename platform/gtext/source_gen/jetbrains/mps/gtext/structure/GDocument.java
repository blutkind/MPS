package jetbrains.mps.gtext.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.gtext.structure.GItem;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GDocument extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.gtext.structure.GDocument";
  public static final String DOCUMENT_NAME = "documentName";
  public static final String EXTENSION = "extension";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String ITEM = "item";

  public GDocument(SNode node) {
    super(node);
  }

  public String getDocumentName() {
    return this.getProperty(GDocument.DOCUMENT_NAME);
  }

  public void setDocumentName(String value) {
    this.setProperty(GDocument.DOCUMENT_NAME, value);
  }

  public String getExtension() {
    return this.getProperty(GDocument.EXTENSION);
  }

  public void setExtension(String value) {
    this.setProperty(GDocument.EXTENSION, value);
  }

  public String getShortDescription() {
    return this.getProperty(GDocument.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GDocument.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GDocument.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GDocument.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GDocument.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GDocument.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(GDocument.NAME);
  }

  public void setName(String value) {
    this.setProperty(GDocument.NAME, value);
  }

  public int getItemsCount() {
    return this.getChildCount(GDocument.ITEM);
  }

  public Iterator<GItem> items() {
    return this.children(GItem.class, GDocument.ITEM);
  }

  public List<GItem> getItems() {
    return this.getChildren(GItem.class, GDocument.ITEM);
  }

  public void addItem(GItem node) {
    this.addChild(GDocument.ITEM, node);
  }

  public void insertItem(GItem prev, GItem node) {
    this.insertChild(prev, GDocument.ITEM, node);
  }


  public static GDocument newInstance(SModel sm, boolean init) {
    return (GDocument)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.gtext.structure.GDocument", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GDocument newInstance(SModel sm) {
    return GDocument.newInstance(sm, false);
  }

}
