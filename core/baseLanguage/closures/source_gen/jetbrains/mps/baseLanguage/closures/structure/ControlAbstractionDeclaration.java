package jetbrains.mps.baseLanguage.closures.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.GenericDeclaration;
import jetbrains.mps.baseLanguage.structure.ClassifierMember;
import jetbrains.mps.lang.core.structure.IResolveInfo;
import jetbrains.mps.baseLanguage.structure.HasAnnotation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.baseLanguage.structure.Visibility;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.ParameterDeclaration;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.baseLanguage.structure.AnnotationInstance;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ControlAbstractionDeclaration extends GenericDeclaration implements ClassifierMember, IResolveInfo, HasAnnotation {
  public static final String concept = "jetbrains.mps.baseLanguage.closures.structure.ControlAbstractionDeclaration";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RESOLVE_INFO = "resolveInfo";
  public static final String BODY = "body";
  public static final String VISIBILITY = "visibility";
  public static final String PARAMETER = "parameter";
  public static final String _$ATTRIBUTE = "_$attribute";
  public static final String ANNOTATION = "annotation";

  public ControlAbstractionDeclaration(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ControlAbstractionDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ControlAbstractionDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ControlAbstractionDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ControlAbstractionDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ControlAbstractionDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ControlAbstractionDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getResolveInfo() {
    return this.getProperty(ControlAbstractionDeclaration.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(ControlAbstractionDeclaration.RESOLVE_INFO, value);
  }

  public StatementList getBody() {
    return (StatementList) this.getChild(StatementList.class, ControlAbstractionDeclaration.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(ControlAbstractionDeclaration.BODY, node);
  }

  public Visibility getVisibility() {
    return (Visibility) this.getChild(Visibility.class, ControlAbstractionDeclaration.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(ControlAbstractionDeclaration.VISIBILITY, node);
  }

  public int getParametersCount() {
    return this.getChildCount(ControlAbstractionDeclaration.PARAMETER);
  }

  public Iterator<ParameterDeclaration> parameters() {
    return this.children(ParameterDeclaration.class, ControlAbstractionDeclaration.PARAMETER);
  }

  public List<ParameterDeclaration> getParameters() {
    return this.getChildren(ParameterDeclaration.class, ControlAbstractionDeclaration.PARAMETER);
  }

  public void addParameter(ParameterDeclaration node) {
    this.addChild(ControlAbstractionDeclaration.PARAMETER, node);
  }

  public void insertParameter(ParameterDeclaration prev, ParameterDeclaration node) {
    this.insertChild(prev, ControlAbstractionDeclaration.PARAMETER, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(ControlAbstractionDeclaration._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, ControlAbstractionDeclaration._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, ControlAbstractionDeclaration._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(ControlAbstractionDeclaration._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ControlAbstractionDeclaration._$ATTRIBUTE, node);
  }

  public int getAnnotationsCount() {
    return this.getChildCount(ControlAbstractionDeclaration.ANNOTATION);
  }

  public Iterator<AnnotationInstance> annotations() {
    return this.children(AnnotationInstance.class, ControlAbstractionDeclaration.ANNOTATION);
  }

  public List<AnnotationInstance> getAnnotations() {
    return this.getChildren(AnnotationInstance.class, ControlAbstractionDeclaration.ANNOTATION);
  }

  public void addAnnotation(AnnotationInstance node) {
    this.addChild(ControlAbstractionDeclaration.ANNOTATION, node);
  }

  public void insertAnnotation(AnnotationInstance prev, AnnotationInstance node) {
    this.insertChild(prev, ControlAbstractionDeclaration.ANNOTATION, node);
  }

  public static ControlAbstractionDeclaration newInstance(SModel sm, boolean init) {
    return (ControlAbstractionDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ControlAbstractionDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ControlAbstractionDeclaration newInstance(SModel sm) {
    return ControlAbstractionDeclaration.newInstance(sm, false);
  }
}
