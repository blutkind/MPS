package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class Project extends BaseConcept implements INamedConcept, IPropertyHolder {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.Project";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String DEFAULT = "default";
  public static String TARGETLIST = "targetlist";
  public static String IMPORTS = "imports";
  public static String PROPERTY_LIST = "propertyList";

  public  Project(SNode node) {
    super(node);
  }

  public static Project newInstance(SModel sm, boolean init) {
    return (Project)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.Project", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Project newInstance(SModel sm) {
    return Project.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(Project.NAME);
  }

  public void setName(String value) {
    this.setProperty(Project.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Project.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Project.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Project.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Project.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Project.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Project.VIRTUAL_PACKAGE, value);
  }

  public TargetReference getDefault() {
    return (TargetReference)this.getChild(Project.DEFAULT);
  }

  public void setDefault(TargetReference node) {
    super.setChild(Project.DEFAULT, node);
  }

  public int getTargetlistsCount() {
    return this.getChildCount(Project.TARGETLIST);
  }

  public Iterator<TargetDeclaration> targetlists() {
    return this.children(Project.TARGETLIST);
  }

  public List<TargetDeclaration> getTargetlists() {
    return this.getChildren(Project.TARGETLIST);
  }

  public void addTargetlist(TargetDeclaration node) {
    this.addChild(Project.TARGETLIST, node);
  }

  public void insertTargetlist(TargetDeclaration prev, TargetDeclaration node) {
    this.insertChild(prev, Project.TARGETLIST, node);
  }

  public int getImportsesCount() {
    return this.getChildCount(Project.IMPORTS);
  }

  public Iterator<ImportDeclatation> importses() {
    return this.children(Project.IMPORTS);
  }

  public List<ImportDeclatation> getImportses() {
    return this.getChildren(Project.IMPORTS);
  }

  public void addImports(ImportDeclatation node) {
    this.addChild(Project.IMPORTS, node);
  }

  public void insertImports(ImportDeclatation prev, ImportDeclatation node) {
    this.insertChild(prev, Project.IMPORTS, node);
  }

  public int getPropertyListsCount() {
    return this.getChildCount(Project.PROPERTY_LIST);
  }

  public Iterator<PropertyDeclaration> propertyLists() {
    return this.children(Project.PROPERTY_LIST);
  }

  public List<PropertyDeclaration> getPropertyLists() {
    return this.getChildren(Project.PROPERTY_LIST);
  }

  public void addPropertyList(PropertyDeclaration node) {
    this.addChild(Project.PROPERTY_LIST, node);
  }

  public void insertPropertyList(PropertyDeclaration prev, PropertyDeclaration node) {
    this.insertChild(prev, Project.PROPERTY_LIST, node);
  }

}
