package jetbrains.mps.lang.intentions.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ChildFilterFunction extends ConceptFunction implements ChildFilterBlock {
  public static final String concept = "jetbrains.mps.lang.intentions.structure.ChildFilterFunction";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public ChildFilterFunction(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ChildFilterFunction.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ChildFilterFunction.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ChildFilterFunction.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ChildFilterFunction.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ChildFilterFunction.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ChildFilterFunction.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(ChildFilterFunction._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, ChildFilterFunction._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, ChildFilterFunction._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(ChildFilterFunction._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ChildFilterFunction._$ATTRIBUTE, node);
  }

  public static ChildFilterFunction newInstance(SModel sm, boolean init) {
    return (ChildFilterFunction) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.intentions.structure.ChildFilterFunction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ChildFilterFunction newInstance(SModel sm) {
    return ChildFilterFunction.newInstance(sm, false);
  }
}
