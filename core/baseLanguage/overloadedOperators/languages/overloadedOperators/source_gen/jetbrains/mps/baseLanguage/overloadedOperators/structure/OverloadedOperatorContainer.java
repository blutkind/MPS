package jetbrains.mps.baseLanguage.overloadedOperators.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OverloadedOperatorContainer extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.overloadedOperators.structure.OverloadedOperatorContainer";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String OPERATORS = "operators";
  public static final String CUSTOM_OPERATORS = "customOperators";
  public static final String _$ATTRIBUTE = "_$attribute";

  public OverloadedOperatorContainer(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(OverloadedOperatorContainer.NAME);
  }

  public void setName(String value) {
    this.setProperty(OverloadedOperatorContainer.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(OverloadedOperatorContainer.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(OverloadedOperatorContainer.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(OverloadedOperatorContainer.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(OverloadedOperatorContainer.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(OverloadedOperatorContainer.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(OverloadedOperatorContainer.VIRTUAL_PACKAGE, value);
  }

  public int getOperatorsesCount() {
    return this.getChildCount(OverloadedOperatorContainer.OPERATORS);
  }

  public Iterator<OverloadedBinaryOperator> operatorses() {
    return this.children(OverloadedBinaryOperator.class, OverloadedOperatorContainer.OPERATORS);
  }

  public List<OverloadedBinaryOperator> getOperatorses() {
    return this.getChildren(OverloadedBinaryOperator.class, OverloadedOperatorContainer.OPERATORS);
  }

  public void addOperators(OverloadedBinaryOperator node) {
    this.addChild(OverloadedOperatorContainer.OPERATORS, node);
  }

  public void insertOperators(OverloadedBinaryOperator prev, OverloadedBinaryOperator node) {
    this.insertChild(prev, OverloadedOperatorContainer.OPERATORS, node);
  }

  public int getCustomOperatorsesCount() {
    return this.getChildCount(OverloadedOperatorContainer.CUSTOM_OPERATORS);
  }

  public Iterator<CustomOperatorDeclaration> customOperatorses() {
    return this.children(CustomOperatorDeclaration.class, OverloadedOperatorContainer.CUSTOM_OPERATORS);
  }

  public List<CustomOperatorDeclaration> getCustomOperatorses() {
    return this.getChildren(CustomOperatorDeclaration.class, OverloadedOperatorContainer.CUSTOM_OPERATORS);
  }

  public void addCustomOperators(CustomOperatorDeclaration node) {
    this.addChild(OverloadedOperatorContainer.CUSTOM_OPERATORS, node);
  }

  public void insertCustomOperators(CustomOperatorDeclaration prev, CustomOperatorDeclaration node) {
    this.insertChild(prev, OverloadedOperatorContainer.CUSTOM_OPERATORS, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(OverloadedOperatorContainer._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, OverloadedOperatorContainer._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, OverloadedOperatorContainer._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(OverloadedOperatorContainer._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, OverloadedOperatorContainer._$ATTRIBUTE, node);
  }

  public static OverloadedOperatorContainer newInstance(SModel sm, boolean init) {
    return (OverloadedOperatorContainer) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.overloadedOperators.structure.OverloadedOperatorContainer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OverloadedOperatorContainer newInstance(SModel sm) {
    return OverloadedOperatorContainer.newInstance(sm, false);
  }
}
