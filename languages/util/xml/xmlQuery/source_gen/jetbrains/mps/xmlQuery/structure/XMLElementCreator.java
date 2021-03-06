package jetbrains.mps.xmlQuery.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.AbstractCreator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class XMLElementCreator extends AbstractCreator {
  public static final String concept = "jetbrains.mps.xmlQuery.structure.XMLElementCreator";
  public static final String TYPE = "type";

  public XMLElementCreator(SNode node) {
    super(node);
  }

  public XMLElementType getType() {
    return (XMLElementType) this.getChild(XMLElementType.class, XMLElementCreator.TYPE);
  }

  public void setType(XMLElementType node) {
    super.setChild(XMLElementCreator.TYPE, node);
  }

  public static XMLElementCreator newInstance(SModel sm, boolean init) {
    return (XMLElementCreator) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlQuery.structure.XMLElementCreator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static XMLElementCreator newInstance(SModel sm) {
    return XMLElementCreator.newInstance(sm, false);
  }
}
