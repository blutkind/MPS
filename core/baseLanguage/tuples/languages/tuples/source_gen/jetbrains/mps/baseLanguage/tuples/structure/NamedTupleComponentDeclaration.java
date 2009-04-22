package jetbrains.mps.baseLanguage.tuples.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IValidIdentifier;
import jetbrains.mps.baseLanguage.structure.HasAnnotation;
import jetbrains.mps.baseLanguage.structure.TypeDerivable;
import jetbrains.mps.baseLanguage.structure.TypeAnnotable;
import jetbrains.mps.lang.core.structure.IResolveInfo;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.AnnotationInstance;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NamedTupleComponentDeclaration extends BaseConcept implements IValidIdentifier, HasAnnotation, TypeDerivable, TypeAnnotable, IResolveInfo {
  public static final String concept = "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RESOLVE_INFO = "resolveInfo";
  public static final String FINAL = "final";
  public static final String TYPE = "type";
  public static final String ANNOTATION = "annotation";

  public NamedTupleComponentDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(NamedTupleComponentDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(NamedTupleComponentDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(NamedTupleComponentDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(NamedTupleComponentDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(NamedTupleComponentDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(NamedTupleComponentDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(NamedTupleComponentDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(NamedTupleComponentDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getResolveInfo() {
    return this.getProperty(NamedTupleComponentDeclaration.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(NamedTupleComponentDeclaration.RESOLVE_INFO, value);
  }

  public boolean getFinal() {
    return this.getBooleanProperty(NamedTupleComponentDeclaration.FINAL);
  }

  public void setFinal(boolean value) {
    this.setBooleanProperty(NamedTupleComponentDeclaration.FINAL, value);
  }

  public Type getType() {
    return (Type)this.getChild(Type.class, NamedTupleComponentDeclaration.TYPE);
  }

  public void setType(Type node) {
    super.setChild(NamedTupleComponentDeclaration.TYPE, node);
  }

  public int getAnnotationsCount() {
    return this.getChildCount(NamedTupleComponentDeclaration.ANNOTATION);
  }

  public Iterator<AnnotationInstance> annotations() {
    return this.children(AnnotationInstance.class, NamedTupleComponentDeclaration.ANNOTATION);
  }

  public List<AnnotationInstance> getAnnotations() {
    return this.getChildren(AnnotationInstance.class, NamedTupleComponentDeclaration.ANNOTATION);
  }

  public void addAnnotation(AnnotationInstance node) {
    this.addChild(NamedTupleComponentDeclaration.ANNOTATION, node);
  }

  public void insertAnnotation(AnnotationInstance prev, AnnotationInstance node) {
    this.insertChild(prev, NamedTupleComponentDeclaration.ANNOTATION, node);
  }


  public static NamedTupleComponentDeclaration newInstance(SModel sm, boolean init) {
    return (NamedTupleComponentDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NamedTupleComponentDeclaration newInstance(SModel sm) {
    return NamedTupleComponentDeclaration.newInstance(sm, false);
  }

}
