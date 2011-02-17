package jetbrains.mps.baseLanguage.math.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VectorType extends MathPrimitiveType implements MatrixOrVectorType {
  public static final String concept = "jetbrains.mps.baseLanguage.math.structure.VectorType";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String HEIGHT = "height";
  public static final String ELEMENT_TYPE = "elementType";
  public static final String _$ATTRIBUTE = "_$attribute";

  public VectorType(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(VectorType.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(VectorType.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(VectorType.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(VectorType.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(VectorType.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(VectorType.VIRTUAL_PACKAGE, value);
  }

  public int getHeight() {
    return this.getIntegerProperty(VectorType.HEIGHT);
  }

  public void setHeight(int value) {
    this.setIntegerProperty(VectorType.HEIGHT, value);
  }

  public Type getElementType() {
    return (Type) this.getChild(Type.class, VectorType.ELEMENT_TYPE);
  }

  public void setElementType(Type node) {
    super.setChild(VectorType.ELEMENT_TYPE, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(VectorType._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, VectorType._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, VectorType._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(VectorType._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, VectorType._$ATTRIBUTE, node);
  }

  public static VectorType newInstance(SModel sm, boolean init) {
    return (VectorType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.VectorType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static VectorType newInstance(SModel sm) {
    return VectorType.newInstance(sm, false);
  }
}
