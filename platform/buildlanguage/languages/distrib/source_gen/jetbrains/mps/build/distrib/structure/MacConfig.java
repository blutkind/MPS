package jetbrains.mps.build.distrib.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.build.packaging.structure.IPath;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MacConfig extends SystemSpecificConfig {
  public static final String concept = "jetbrains.mps.build.distrib.structure.MacConfig";
  public static final String ICON_PATH = "iconPath";
  public static final String JAVA_APPLICATION_STUB_PATH = "javaApplicationStubPath";
  public static final String ASSOCIATION = "association";

  public MacConfig(SNode node) {
    super(node);
  }

  public IPath getIconPath() {
    return (IPath)this.getChild(IPath.class, MacConfig.ICON_PATH);
  }

  public void setIconPath(IPath node) {
    super.setChild(MacConfig.ICON_PATH, node);
  }

  public IPath getJavaApplicationStubPath() {
    return (IPath)this.getChild(IPath.class, MacConfig.JAVA_APPLICATION_STUB_PATH);
  }

  public void setJavaApplicationStubPath(IPath node) {
    super.setChild(MacConfig.JAVA_APPLICATION_STUB_PATH, node);
  }

  public int getAssociationsCount() {
    return this.getChildCount(MacConfig.ASSOCIATION);
  }

  public Iterator<MacOsFileAssociation> associations() {
    return this.children(MacOsFileAssociation.class, MacConfig.ASSOCIATION);
  }

  public List<MacOsFileAssociation> getAssociations() {
    return this.getChildren(MacOsFileAssociation.class, MacConfig.ASSOCIATION);
  }

  public void addAssociation(MacOsFileAssociation node) {
    this.addChild(MacConfig.ASSOCIATION, node);
  }

  public void insertAssociation(MacOsFileAssociation prev, MacOsFileAssociation node) {
    this.insertChild(prev, MacConfig.ASSOCIATION, node);
  }


  public static MacConfig newInstance(SModel sm, boolean init) {
    return (MacConfig)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.distrib.structure.MacConfig", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MacConfig newInstance(SModel sm) {
    return MacConfig.newInstance(sm, false);
  }

}
