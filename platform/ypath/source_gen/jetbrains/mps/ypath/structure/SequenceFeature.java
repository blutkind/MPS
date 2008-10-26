package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SequenceFeature extends BaseConcept implements INamedConcept, IFeature {
public    static final String concept = "jetbrains.mps.ypath.structure.SequenceFeature";
public    static final String NAME = "name";
public    static final String SHORT_DESCRIPTION = "shortDescription";
public    static final String ALIAS = "alias";
public    static final String VIRTUAL_PACKAGE = "virtualPackage";
public    static final String WRITABLE = "writable";
public    static final String DEFAULT = "default";
public    static final String ASCENDING = "ascending";
public    static final String OPPOSITE = "opposite";
public    static final String SEQUENCE_FUNCTION = "sequenceFunction";
public    static final String SIZE_FUNCTION = "sizeFunction";
public    static final String ADD_FUNCTION = "addFunction";
public    static final String REMOVE_FUNCTION = "removeFunction";

  public SequenceFeature(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(SequenceFeature.NAME);
  }

  public void setName(String value) {
    this.setProperty(SequenceFeature.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(SequenceFeature.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SequenceFeature.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SequenceFeature.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SequenceFeature.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SequenceFeature.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SequenceFeature.VIRTUAL_PACKAGE, value);
  }

  public boolean getWritable() {
    return this.getBooleanProperty(SequenceFeature.WRITABLE);
  }

  public void setWritable(boolean value) {
    this.setBooleanProperty(SequenceFeature.WRITABLE, value);
  }

  public boolean getDefault() {
    return this.getBooleanProperty(SequenceFeature.DEFAULT);
  }

  public void setDefault(boolean value) {
    this.setBooleanProperty(SequenceFeature.DEFAULT, value);
  }

  public boolean getAscending() {
    return this.getBooleanProperty(SequenceFeature.ASCENDING);
  }

  public void setAscending(boolean value) {
    this.setBooleanProperty(SequenceFeature.ASCENDING, value);
  }

  public IFeature getOpposite() {
    return (IFeature)this.getReferent(SequenceFeature.OPPOSITE);
  }

  public void setOpposite(IFeature node) {
    super.setReferent(SequenceFeature.OPPOSITE, node);
  }

  public FeatureSequenceFun getSequenceFunction() {
    return (FeatureSequenceFun)this.getChild(SequenceFeature.SEQUENCE_FUNCTION);
  }

  public void setSequenceFunction(FeatureSequenceFun node) {
    super.setChild(SequenceFeature.SEQUENCE_FUNCTION, node);
  }

  public FeatureSizeFun getSizeFunction() {
    return (FeatureSizeFun)this.getChild(SequenceFeature.SIZE_FUNCTION);
  }

  public void setSizeFunction(FeatureSizeFun node) {
    super.setChild(SequenceFeature.SIZE_FUNCTION, node);
  }

  public FeatureAddFun getAddFunction() {
    return (FeatureAddFun)this.getChild(SequenceFeature.ADD_FUNCTION);
  }

  public void setAddFunction(FeatureAddFun node) {
    super.setChild(SequenceFeature.ADD_FUNCTION, node);
  }

  public FeatureRemoveFun getRemoveFunction() {
    return (FeatureRemoveFun)this.getChild(SequenceFeature.REMOVE_FUNCTION);
  }

  public void setRemoveFunction(FeatureRemoveFun node) {
    super.setChild(SequenceFeature.REMOVE_FUNCTION, node);
  }


  public static SequenceFeature newInstance(SModel sm, boolean init) {
    return (SequenceFeature)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.SequenceFeature", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SequenceFeature newInstance(SModel sm) {
    return SequenceFeature.newInstance(sm, false);
  }

}
