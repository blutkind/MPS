package jetbrains.mps.gtext.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GSeparatorItemList extends GItem {
  public static final String concept = "jetbrains.mps.gtext.structure.GSeparatorItemList";
  public static final String SEPARATOR = "separator";
  public static final String ITEM = "item";

  public GSeparatorItemList(SNode node) {
    super(node);
  }

  public GItem getSeparator() {
    return (GItem)this.getChild(GItem.class, GSeparatorItemList.SEPARATOR);
  }

  public void setSeparator(GItem node) {
    super.setChild(GSeparatorItemList.SEPARATOR, node);
  }

  public int getItemsCount() {
    return this.getChildCount(GSeparatorItemList.ITEM);
  }

  public Iterator<GItem> items() {
    return this.children(GItem.class, GSeparatorItemList.ITEM);
  }

  public List<GItem> getItems() {
    return this.getChildren(GItem.class, GSeparatorItemList.ITEM);
  }

  public void addItem(GItem node) {
    this.addChild(GSeparatorItemList.ITEM, node);
  }

  public void insertItem(GItem prev, GItem node) {
    this.insertChild(prev, GSeparatorItemList.ITEM, node);
  }


  public static GSeparatorItemList newInstance(SModel sm, boolean init) {
    return (GSeparatorItemList)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.gtext.structure.GSeparatorItemList", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GSeparatorItemList newInstance(SModel sm) {
    return GSeparatorItemList.newInstance(sm, false);
  }

}
