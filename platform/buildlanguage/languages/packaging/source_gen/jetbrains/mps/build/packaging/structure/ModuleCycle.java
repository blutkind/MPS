package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModuleCycle extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.build.packaging.structure.ModuleCycle";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String MODULE_REFERENCE = "moduleReference";
  public static final String DEPENDENCY = "dependency";

  public ModuleCycle(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ModuleCycle.NAME);
  }

  public void setName(String value) {
    this.setProperty(ModuleCycle.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ModuleCycle.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ModuleCycle.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ModuleCycle.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ModuleCycle.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ModuleCycle.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ModuleCycle.VIRTUAL_PACKAGE, value);
  }

  public int getModuleReferencesCount() {
    return this.getChildCount(ModuleCycle.MODULE_REFERENCE);
  }

  public Iterator<NewModuleReference> moduleReferences() {
    return this.children(NewModuleReference.class, ModuleCycle.MODULE_REFERENCE);
  }

  public List<NewModuleReference> getModuleReferences() {
    return this.getChildren(NewModuleReference.class, ModuleCycle.MODULE_REFERENCE);
  }

  public void addModuleReference(NewModuleReference node) {
    this.addChild(ModuleCycle.MODULE_REFERENCE, node);
  }

  public void insertModuleReference(NewModuleReference prev, NewModuleReference node) {
    this.insertChild(prev, ModuleCycle.MODULE_REFERENCE, node);
  }

  public int getDependenciesCount() {
    return this.getChildCount(ModuleCycle.DEPENDENCY);
  }

  public Iterator<ModuleCycleReference> dependencies() {
    return this.children(ModuleCycleReference.class, ModuleCycle.DEPENDENCY);
  }

  public List<ModuleCycleReference> getDependencies() {
    return this.getChildren(ModuleCycleReference.class, ModuleCycle.DEPENDENCY);
  }

  public void addDependency(ModuleCycleReference node) {
    this.addChild(ModuleCycle.DEPENDENCY, node);
  }

  public void insertDependency(ModuleCycleReference prev, ModuleCycleReference node) {
    this.insertChild(prev, ModuleCycle.DEPENDENCY, node);
  }

  public static ModuleCycle newInstance(SModel sm, boolean init) {
    return (ModuleCycle) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.ModuleCycle", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModuleCycle newInstance(SModel sm) {
    return ModuleCycle.newInstance(sm, false);
  }
}
