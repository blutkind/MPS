package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ArithmeticExpansion extends BaseConcept implements IGeneralizedWordUnit, IConcreteWordUnit, IArithmeticHolder {
  public static final String concept = "jetbrains.mps.bash.structure.ArithmeticExpansion";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXPRESSION = "expression";
  public static final String _$ATTRIBUTE = "_$attribute";

  public ArithmeticExpansion(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ArithmeticExpansion.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ArithmeticExpansion.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ArithmeticExpansion.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ArithmeticExpansion.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ArithmeticExpansion.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ArithmeticExpansion.VIRTUAL_PACKAGE, value);
  }

  public ArithmeticExpression getExpression() {
    return (ArithmeticExpression) this.getChild(ArithmeticExpression.class, ArithmeticExpansion.EXPRESSION);
  }

  public void setExpression(ArithmeticExpression node) {
    super.setChild(ArithmeticExpansion.EXPRESSION, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(ArithmeticExpansion._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, ArithmeticExpansion._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, ArithmeticExpansion._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(ArithmeticExpansion._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ArithmeticExpansion._$ATTRIBUTE, node);
  }

  public static ArithmeticExpansion newInstance(SModel sm, boolean init) {
    return (ArithmeticExpansion) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.ArithmeticExpansion", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ArithmeticExpansion newInstance(SModel sm) {
    return ArithmeticExpansion.newInstance(sm, false);
  }
}
