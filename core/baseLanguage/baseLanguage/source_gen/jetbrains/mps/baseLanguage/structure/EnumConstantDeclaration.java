package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.IResolveInfo;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EnumConstantDeclaration extends BaseConcept implements IValidIdentifier, IResolveInfo, ClassifierMember {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RESOLVE_INFO = "resolveInfo";
  public static final String VISIBILITY = "visibility";
  public static final String ACTUAL_ARGUMENT = "actualArgument";

  public EnumConstantDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(EnumConstantDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(EnumConstantDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(EnumConstantDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EnumConstantDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EnumConstantDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EnumConstantDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EnumConstantDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EnumConstantDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getResolveInfo() {
    return this.getProperty(EnumConstantDeclaration.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(EnumConstantDeclaration.RESOLVE_INFO, value);
  }

  public Visibility getVisibility() {
    return (Visibility)this.getChild(Visibility.class, EnumConstantDeclaration.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(EnumConstantDeclaration.VISIBILITY, node);
  }

  public int getActualArgumentsCount() {
    return this.getChildCount(EnumConstantDeclaration.ACTUAL_ARGUMENT);
  }

  public Iterator<Expression> actualArguments() {
    return this.children(Expression.class, EnumConstantDeclaration.ACTUAL_ARGUMENT);
  }

  public List<Expression> getActualArguments() {
    return this.getChildren(Expression.class, EnumConstantDeclaration.ACTUAL_ARGUMENT);
  }

  public void addActualArgument(Expression node) {
    this.addChild(EnumConstantDeclaration.ACTUAL_ARGUMENT, node);
  }

  public void insertActualArgument(Expression prev, Expression node) {
    this.insertChild(prev, EnumConstantDeclaration.ACTUAL_ARGUMENT, node);
  }


  public static EnumConstantDeclaration newInstance(SModel sm, boolean init) {
    return (EnumConstantDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EnumConstantDeclaration newInstance(SModel sm) {
    return EnumConstantDeclaration.newInstance(sm, false);
  }

}
