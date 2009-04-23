package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.IContainer;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseMethodDeclaration extends GenericDeclaration implements IValidIdentifier, HasAnnotation, IBLDeprecatable, IStatementListContainer, IContainer, IMethodLike, TypeAnnotable {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String IS_FINAL = "isFinal";
  public static final String IS_DEPRECATED = "isDeprecated";
  public static final String RETURN_TYPE = "returnType";
  public static final String BODY = "body";
  public static final String PARAMETER = "parameter";
  public static final String THROWS_ITEM = "throwsItem";
  public static final String ANNOTATION = "annotation";

  public BaseMethodDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(BaseMethodDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(BaseMethodDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(BaseMethodDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BaseMethodDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BaseMethodDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BaseMethodDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BaseMethodDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BaseMethodDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsFinal() {
    return this.getBooleanProperty(BaseMethodDeclaration.IS_FINAL);
  }

  public void setIsFinal(boolean value) {
    this.setBooleanProperty(BaseMethodDeclaration.IS_FINAL, value);
  }

  public boolean getIsDeprecated() {
    return this.getBooleanProperty(BaseMethodDeclaration.IS_DEPRECATED);
  }

  public void setIsDeprecated(boolean value) {
    this.setBooleanProperty(BaseMethodDeclaration.IS_DEPRECATED, value);
  }

  public Type getReturnType() {
    return (Type)this.getChild(Type.class, BaseMethodDeclaration.RETURN_TYPE);
  }

  public void setReturnType(Type node) {
    super.setChild(BaseMethodDeclaration.RETURN_TYPE, node);
  }

  public StatementList getBody() {
    return (StatementList)this.getChild(StatementList.class, BaseMethodDeclaration.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(BaseMethodDeclaration.BODY, node);
  }

  public int getParametersCount() {
    return this.getChildCount(BaseMethodDeclaration.PARAMETER);
  }

  public Iterator<ParameterDeclaration> parameters() {
    return this.children(ParameterDeclaration.class, BaseMethodDeclaration.PARAMETER);
  }

  public List<ParameterDeclaration> getParameters() {
    return this.getChildren(ParameterDeclaration.class, BaseMethodDeclaration.PARAMETER);
  }

  public void addParameter(ParameterDeclaration node) {
    this.addChild(BaseMethodDeclaration.PARAMETER, node);
  }

  public void insertParameter(ParameterDeclaration prev, ParameterDeclaration node) {
    this.insertChild(prev, BaseMethodDeclaration.PARAMETER, node);
  }

  public int getThrowsItemsCount() {
    return this.getChildCount(BaseMethodDeclaration.THROWS_ITEM);
  }

  public Iterator<Type> throwsItems() {
    return this.children(Type.class, BaseMethodDeclaration.THROWS_ITEM);
  }

  public List<Type> getThrowsItems() {
    return this.getChildren(Type.class, BaseMethodDeclaration.THROWS_ITEM);
  }

  public void addThrowsItem(Type node) {
    this.addChild(BaseMethodDeclaration.THROWS_ITEM, node);
  }

  public void insertThrowsItem(Type prev, Type node) {
    this.insertChild(prev, BaseMethodDeclaration.THROWS_ITEM, node);
  }

  public int getAnnotationsCount() {
    return this.getChildCount(BaseMethodDeclaration.ANNOTATION);
  }

  public Iterator<AnnotationInstance> annotations() {
    return this.children(AnnotationInstance.class, BaseMethodDeclaration.ANNOTATION);
  }

  public List<AnnotationInstance> getAnnotations() {
    return this.getChildren(AnnotationInstance.class, BaseMethodDeclaration.ANNOTATION);
  }

  public void addAnnotation(AnnotationInstance node) {
    this.addChild(BaseMethodDeclaration.ANNOTATION, node);
  }

  public void insertAnnotation(AnnotationInstance prev, AnnotationInstance node) {
    this.insertChild(prev, BaseMethodDeclaration.ANNOTATION, node);
  }


  public static BaseMethodDeclaration newInstance(SModel sm, boolean init) {
    return (BaseMethodDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseMethodDeclaration newInstance(SModel sm) {
    return BaseMethodDeclaration.newInstance(sm, false);
  }

}
