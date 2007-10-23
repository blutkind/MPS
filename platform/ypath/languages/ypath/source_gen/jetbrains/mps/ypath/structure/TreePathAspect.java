package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.structure.Visible;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Visibility;
import java.util.Iterator;
import java.util.List;

public class TreePathAspect extends BaseConcept implements INamedConcept, Visible, TreePath {
  public static final String concept = "jetbrains.mps.ypath.structure.TreePathAspect";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VISIBILITY = "visibility";
  public static String TREE_PATH_TYPE = "treePathType";
  public static String PARENT_BLOCK = "parentBlock";
  public static String CHILDREN_BLOCK = "childrenBlock";
  public static String NODE_KINDS = "nodeKinds";
  public static String FEATURES = "features";
  public static String DEFAULT_FEATURE = "defaultFeature";

  public  TreePathAspect(SNode node) {
    super(node);
  }

  public static TreePathAspect newInstance(SModel sm, boolean init) {
    return (TreePathAspect)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.TreePathAspect", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TreePathAspect newInstance(SModel sm) {
    return TreePathAspect.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(TreePathAspect.NAME);
  }

  public void setName(String value) {
    this.setProperty(TreePathAspect.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TreePathAspect.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TreePathAspect.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TreePathAspect.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TreePathAspect.ALIAS, value);
  }

  public Visibility getVisibility() {
    return (Visibility)this.getChild(TreePathAspect.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(TreePathAspect.VISIBILITY, node);
  }

  public TreePathType getTreePathType() {
    return (TreePathType)this.getChild(TreePathAspect.TREE_PATH_TYPE);
  }

  public void setTreePathType(TreePathType node) {
    super.setChild(TreePathAspect.TREE_PATH_TYPE, node);
  }

  public ParentBlock getParentBlock() {
    return (ParentBlock)this.getChild(TreePathAspect.PARENT_BLOCK);
  }

  public void setParentBlock(ParentBlock node) {
    super.setChild(TreePathAspect.PARENT_BLOCK, node);
  }

  public ChildrenBlock getChildrenBlock() {
    return (ChildrenBlock)this.getChild(TreePathAspect.CHILDREN_BLOCK);
  }

  public void setChildrenBlock(ChildrenBlock node) {
    super.setChild(TreePathAspect.CHILDREN_BLOCK, node);
  }

  public int getNodeKindsesCount() {
    return this.getChildCount(TreePathAspect.NODE_KINDS);
  }

  public Iterator<TreeNodeKind> nodeKindses() {
    return this.children(TreePathAspect.NODE_KINDS);
  }

  public List<TreeNodeKind> getNodeKindses() {
    return this.getChildren(TreePathAspect.NODE_KINDS);
  }

  public void addNodeKinds(TreeNodeKind node) {
    this.addChild(TreePathAspect.NODE_KINDS, node);
  }

  public void insertNodeKinds(TreeNodeKind prev, TreeNodeKind node) {
    this.insertChild(prev, TreePathAspect.NODE_KINDS, node);
  }

  public int getFeaturesesCount() {
    return this.getChildCount(TreePathAspect.FEATURES);
  }

  public Iterator<IFeature> featureses() {
    return this.children(TreePathAspect.FEATURES);
  }

  public List<IFeature> getFeatureses() {
    return this.getChildren(TreePathAspect.FEATURES);
  }

  public void addFeatures(IFeature node) {
    this.addChild(TreePathAspect.FEATURES, node);
  }

  public void insertFeatures(IFeature prev, IFeature node) {
    this.insertChild(prev, TreePathAspect.FEATURES, node);
  }

  public IFeature getDefaultFeature() {
    return (IFeature)this.getReferent(TreePathAspect.DEFAULT_FEATURE);
  }

  public void setDefaultFeature(IFeature node) {
    super.setReferent(TreePathAspect.DEFAULT_FEATURE, node);
  }

}
