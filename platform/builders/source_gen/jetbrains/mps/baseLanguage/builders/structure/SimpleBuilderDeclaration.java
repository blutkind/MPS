package jetbrains.mps.baseLanguage.builders.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SimpleBuilderDeclaration extends BaseSimpleBuilderDeclaration implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ROOT = "root";
  public static final String LEAF = "leaf";
  public static final String IS_ABSTRACT = "isAbstract";
  public static final String EXTENDS = "extends";
  public static final String TYPE = "type";
  public static final String CREATOR = "creator";
  public static final String PARAMETER = "parameter";
  public static final String CHILD = "child";
  public static final String PROPERTY = "property";

  public SimpleBuilderDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(SimpleBuilderDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(SimpleBuilderDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(SimpleBuilderDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SimpleBuilderDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SimpleBuilderDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SimpleBuilderDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SimpleBuilderDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SimpleBuilderDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getRoot() {
    return this.getBooleanProperty(SimpleBuilderDeclaration.ROOT);
  }

  public void setRoot(boolean value) {
    this.setBooleanProperty(SimpleBuilderDeclaration.ROOT, value);
  }

  public boolean getLeaf() {
    return this.getBooleanProperty(SimpleBuilderDeclaration.LEAF);
  }

  public void setLeaf(boolean value) {
    this.setBooleanProperty(SimpleBuilderDeclaration.LEAF, value);
  }

  public boolean getIsAbstract() {
    return this.getBooleanProperty(SimpleBuilderDeclaration.IS_ABSTRACT);
  }

  public void setIsAbstract(boolean value) {
    this.setBooleanProperty(SimpleBuilderDeclaration.IS_ABSTRACT, value);
  }

  public SimpleBuilderDeclaration getExtends() {
    return (SimpleBuilderDeclaration) this.getReferent(SimpleBuilderDeclaration.class, SimpleBuilderDeclaration.EXTENDS);
  }

  public void setExtends(SimpleBuilderDeclaration node) {
    super.setReferent(SimpleBuilderDeclaration.EXTENDS, node);
  }

  public Type getType() {
    return (Type) this.getChild(Type.class, SimpleBuilderDeclaration.TYPE);
  }

  public void setType(Type node) {
    super.setChild(SimpleBuilderDeclaration.TYPE, node);
  }

  public Expression getCreator() {
    return (Expression) this.getChild(Expression.class, SimpleBuilderDeclaration.CREATOR);
  }

  public void setCreator(Expression node) {
    super.setChild(SimpleBuilderDeclaration.CREATOR, node);
  }

  public int getParametersCount() {
    return this.getChildCount(SimpleBuilderDeclaration.PARAMETER);
  }

  public Iterator<SimpleBuilderParameter> parameters() {
    return this.children(SimpleBuilderParameter.class, SimpleBuilderDeclaration.PARAMETER);
  }

  public List<SimpleBuilderParameter> getParameters() {
    return this.getChildren(SimpleBuilderParameter.class, SimpleBuilderDeclaration.PARAMETER);
  }

  public void addParameter(SimpleBuilderParameter node) {
    this.addChild(SimpleBuilderDeclaration.PARAMETER, node);
  }

  public void insertParameter(SimpleBuilderParameter prev, SimpleBuilderParameter node) {
    this.insertChild(prev, SimpleBuilderDeclaration.PARAMETER, node);
  }

  public int getChildsCount() {
    return this.getChildCount(SimpleBuilderDeclaration.CHILD);
  }

  public Iterator<SimpleBuilderChild> childs() {
    return this.children(SimpleBuilderChild.class, SimpleBuilderDeclaration.CHILD);
  }

  public List<SimpleBuilderChild> getChilds() {
    return this.getChildren(SimpleBuilderChild.class, SimpleBuilderDeclaration.CHILD);
  }

  public void addChild(SimpleBuilderChild node) {
    this.addChild(SimpleBuilderDeclaration.CHILD, node);
  }

  public void insertChild(SimpleBuilderChild prev, SimpleBuilderChild node) {
    this.insertChild(prev, SimpleBuilderDeclaration.CHILD, node);
  }

  public int getPropertiesCount() {
    return this.getChildCount(SimpleBuilderDeclaration.PROPERTY);
  }

  public Iterator<SimpleBuilderProperty> properties() {
    return this.children(SimpleBuilderProperty.class, SimpleBuilderDeclaration.PROPERTY);
  }

  public List<SimpleBuilderProperty> getProperties() {
    return this.getChildren(SimpleBuilderProperty.class, SimpleBuilderDeclaration.PROPERTY);
  }

  public void addProperty(SimpleBuilderProperty node) {
    this.addChild(SimpleBuilderDeclaration.PROPERTY, node);
  }

  public void insertProperty(SimpleBuilderProperty prev, SimpleBuilderProperty node) {
    this.insertChild(prev, SimpleBuilderDeclaration.PROPERTY, node);
  }

  public static SimpleBuilderDeclaration newInstance(SModel sm, boolean init) {
    return (SimpleBuilderDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SimpleBuilderDeclaration newInstance(SModel sm) {
    return SimpleBuilderDeclaration.newInstance(sm, false);
  }
}
