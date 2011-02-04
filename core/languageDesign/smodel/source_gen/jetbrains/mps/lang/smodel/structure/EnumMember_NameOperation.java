package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EnumMember_NameOperation extends BaseConcept implements SEnumMemberOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.EnumMember_NameOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public EnumMember_NameOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(EnumMember_NameOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EnumMember_NameOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EnumMember_NameOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EnumMember_NameOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EnumMember_NameOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EnumMember_NameOperation.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(EnumMember_NameOperation._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, EnumMember_NameOperation._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, EnumMember_NameOperation._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(EnumMember_NameOperation._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, EnumMember_NameOperation._$ATTRIBUTE, node);
  }

  public static EnumMember_NameOperation newInstance(SModel sm, boolean init) {
    return (EnumMember_NameOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.EnumMember_NameOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EnumMember_NameOperation newInstance(SModel sm) {
    return EnumMember_NameOperation.newInstance(sm, false);
  }
}
