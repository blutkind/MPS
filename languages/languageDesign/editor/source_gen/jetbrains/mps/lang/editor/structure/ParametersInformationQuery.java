package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifier;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParametersInformationQuery extends BaseConcept implements INamedConcept, IClassifier {
  public static final String concept = "jetbrains.mps.lang.editor.structure.ParametersInformationQuery";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String APPLICABLE_CONCEPT = "applicableConcept";
  public static final String TYPE = "type";
  public static final String METHODS = "methods";
  public static final String PRESENTATION = "presentation";
  public static final String IS_METHOD_CURRENT = "isMethodCurrent";
  public static final String METHOD_DECLARATION = "methodDeclaration";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ParametersInformationQuery(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ParametersInformationQuery.NAME);
  }

  public void setName(String value) {
    this.setProperty(ParametersInformationQuery.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ParametersInformationQuery.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ParametersInformationQuery.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ParametersInformationQuery.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ParametersInformationQuery.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ParametersInformationQuery.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ParametersInformationQuery.VIRTUAL_PACKAGE, value);
  }

  public AbstractConceptDeclaration getApplicableConcept() {
    return (AbstractConceptDeclaration) this.getReferent(AbstractConceptDeclaration.class, ParametersInformationQuery.APPLICABLE_CONCEPT);
  }

  public void setApplicableConcept(AbstractConceptDeclaration node) {
    super.setReferent(ParametersInformationQuery.APPLICABLE_CONCEPT, node);
  }

  public Type getType() {
    return (Type) this.getChild(Type.class, ParametersInformationQuery.TYPE);
  }

  public void setType(Type node) {
    super.setChild(ParametersInformationQuery.TYPE, node);
  }

  public QueryFunction_ParametersList getMethods() {
    return (QueryFunction_ParametersList) this.getChild(QueryFunction_ParametersList.class, ParametersInformationQuery.METHODS);
  }

  public void setMethods(QueryFunction_ParametersList node) {
    super.setChild(ParametersInformationQuery.METHODS, node);
  }

  public QueryFunction_MethodPresentation getPresentation() {
    return (QueryFunction_MethodPresentation) this.getChild(QueryFunction_MethodPresentation.class, ParametersInformationQuery.PRESENTATION);
  }

  public void setPresentation(QueryFunction_MethodPresentation node) {
    super.setChild(ParametersInformationQuery.PRESENTATION, node);
  }

  public QueryFunction_IsMethodCurrent getIsMethodCurrent() {
    return (QueryFunction_IsMethodCurrent) this.getChild(QueryFunction_IsMethodCurrent.class, ParametersInformationQuery.IS_METHOD_CURRENT);
  }

  public void setIsMethodCurrent(QueryFunction_IsMethodCurrent node) {
    super.setChild(ParametersInformationQuery.IS_METHOD_CURRENT, node);
  }

  public int getMethodDeclarationsCount() {
    return this.getChildCount(ParametersInformationQuery.METHOD_DECLARATION);
  }

  public Iterator<DefaultClassifierMethodDeclaration> methodDeclarations() {
    return this.children(DefaultClassifierMethodDeclaration.class, ParametersInformationQuery.METHOD_DECLARATION);
  }

  public List<DefaultClassifierMethodDeclaration> getMethodDeclarations() {
    return this.getChildren(DefaultClassifierMethodDeclaration.class, ParametersInformationQuery.METHOD_DECLARATION);
  }

  public void addMethodDeclaration(DefaultClassifierMethodDeclaration node) {
    this.addChild(ParametersInformationQuery.METHOD_DECLARATION, node);
  }

  public void insertMethodDeclaration(DefaultClassifierMethodDeclaration prev, DefaultClassifierMethodDeclaration node) {
    this.insertChild(prev, ParametersInformationQuery.METHOD_DECLARATION, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ParametersInformationQuery.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ParametersInformationQuery.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ParametersInformationQuery.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ParametersInformationQuery.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ParametersInformationQuery.SMODEL_ATTRIBUTE, node);
  }

  public static ParametersInformationQuery newInstance(SModel sm, boolean init) {
    return (ParametersInformationQuery) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.ParametersInformationQuery", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParametersInformationQuery newInstance(SModel sm) {
    return ParametersInformationQuery.newInstance(sm, false);
  }
}
