package jetbrains.mps.samples.lambdaCalculus.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LetExpression extends LambdaExpression implements VariableOwner {
  public static final String concept = "jetbrains.mps.samples.lambdaCalculus.structure.LetExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String VALUE = "value";
  public static final String EXPRESSION = "expression";
  public static final String VARIABLE = "variable";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public LetExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(LetExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(LetExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(LetExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(LetExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(LetExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(LetExpression.VIRTUAL_PACKAGE, value);
  }

  public LambdaExpression getValue() {
    return (LambdaExpression) this.getChild(LambdaExpression.class, LetExpression.VALUE);
  }

  public void setValue(LambdaExpression node) {
    super.setChild(LetExpression.VALUE, node);
  }

  public LambdaExpression getExpression() {
    return (LambdaExpression) this.getChild(LambdaExpression.class, LetExpression.EXPRESSION);
  }

  public void setExpression(LambdaExpression node) {
    super.setChild(LetExpression.EXPRESSION, node);
  }

  public LetVariable getVariable() {
    return (LetVariable) this.getChild(LetVariable.class, LetExpression.VARIABLE);
  }

  public void setVariable(LetVariable node) {
    super.setChild(LetExpression.VARIABLE, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(LetExpression.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, LetExpression.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, LetExpression.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(LetExpression.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, LetExpression.SMODEL_ATTRIBUTE, node);
  }

  public static LetExpression newInstance(SModel sm, boolean init) {
    return (LetExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.lambdaCalculus.structure.LetExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LetExpression newInstance(SModel sm) {
    return LetExpression.newInstance(sm, false);
  }
}
