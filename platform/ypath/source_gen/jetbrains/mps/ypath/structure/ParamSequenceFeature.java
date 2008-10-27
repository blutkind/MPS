package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParamSequenceFeature extends SequenceFeature implements IFeature, IParamFeature {
public    static final String concept = "jetbrains.mps.ypath.structure.ParamSequenceFeature";
public    static final String NAME = "name";
public    static final String SHORT_DESCRIPTION = "shortDescription";
public    static final String ALIAS = "alias";
public    static final String VIRTUAL_PACKAGE = "virtualPackage";
public    static final String WRITABLE = "writable";
public    static final String DEFAULT = "default";
public    static final String ASCENDING = "ascending";
public    static final String OPPOSITE = "opposite";
public    static final String PARAMETER_TYPE = "parameterType";
public    static final String PARAMETER_QUERY_FUNCTION = "parameterQueryFunction";
public    static final String TARGET_TYPE_FUNCTION = "targetTypeFunction";
public    static final String TO_STRING_FUNCTION = "toStringFunction";
public    static final String CARDINAL = "cardinal";

  public ParamSequenceFeature(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ParamSequenceFeature.NAME);
  }

  public void setName(String value) {
    this.setProperty(ParamSequenceFeature.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ParamSequenceFeature.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ParamSequenceFeature.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ParamSequenceFeature.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ParamSequenceFeature.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ParamSequenceFeature.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ParamSequenceFeature.VIRTUAL_PACKAGE, value);
  }

  public boolean getWritable() {
    return this.getBooleanProperty(ParamSequenceFeature.WRITABLE);
  }

  public void setWritable(boolean value) {
    this.setBooleanProperty(ParamSequenceFeature.WRITABLE, value);
  }

  public boolean getDefault() {
    return this.getBooleanProperty(ParamSequenceFeature.DEFAULT);
  }

  public void setDefault(boolean value) {
    this.setBooleanProperty(ParamSequenceFeature.DEFAULT, value);
  }

  public boolean getAscending() {
    return this.getBooleanProperty(ParamSequenceFeature.ASCENDING);
  }

  public void setAscending(boolean value) {
    this.setBooleanProperty(ParamSequenceFeature.ASCENDING, value);
  }

  public IFeature getOpposite() {
    return (IFeature)this.getReferent(ParamSequenceFeature.OPPOSITE);
  }

  public void setOpposite(IFeature node) {
    super.setReferent(ParamSequenceFeature.OPPOSITE, node);
  }

  public Type getParameterType() {
    return (Type)this.getChild(ParamSequenceFeature.PARAMETER_TYPE);
  }

  public void setParameterType(Type node) {
    super.setChild(ParamSequenceFeature.PARAMETER_TYPE, node);
  }

  public ParameterQueryFun getParameterQueryFunction() {
    return (ParameterQueryFun)this.getChild(ParamSequenceFeature.PARAMETER_QUERY_FUNCTION);
  }

  public void setParameterQueryFunction(ParameterQueryFun node) {
    super.setChild(ParamSequenceFeature.PARAMETER_QUERY_FUNCTION, node);
  }

  public TargetTypeFun getTargetTypeFunction() {
    return (TargetTypeFun)this.getChild(ParamSequenceFeature.TARGET_TYPE_FUNCTION);
  }

  public void setTargetTypeFunction(TargetTypeFun node) {
    super.setChild(ParamSequenceFeature.TARGET_TYPE_FUNCTION, node);
  }

  public ToStringFun getToStringFunction() {
    return (ToStringFun)this.getChild(ParamSequenceFeature.TO_STRING_FUNCTION);
  }

  public void setToStringFunction(ToStringFun node) {
    super.setChild(ParamSequenceFeature.TO_STRING_FUNCTION, node);
  }

  public GFCardinalParamFun getCardinal() {
    return (GFCardinalParamFun)this.getChild(ParamSequenceFeature.CARDINAL);
  }

  public void setCardinal(GFCardinalParamFun node) {
    super.setChild(ParamSequenceFeature.CARDINAL, node);
  }

  public ParamFeatureSequenceFun getParamSequenceFunction() {
    return (ParamFeatureSequenceFun)this.getSequenceFunction();
  }

  public void setParamSequenceFunction(ParamFeatureSequenceFun node) {
    this.setSequenceFunction(node);
  }

  public ParamFeatureSizeFun getParamSizeFunction() {
    return (ParamFeatureSizeFun)this.getSizeFunction();
  }

  public void setParamSizeFunction(ParamFeatureSizeFun node) {
    this.setSizeFunction(node);
  }

  public ParamFeatureAddFun getParamAddFunction() {
    return (ParamFeatureAddFun)this.getAddFunction();
  }

  public void setParamAddFunction(ParamFeatureAddFun node) {
    this.setAddFunction(node);
  }

  public ParamFeatureRemoveFun getParamRemoveFunction() {
    return (ParamFeatureRemoveFun)this.getRemoveFunction();
  }

  public void setParamRemoveFunction(ParamFeatureRemoveFun node) {
    this.setRemoveFunction(node);
  }


  public static ParamSequenceFeature newInstance(SModel sm, boolean init) {
    return (ParamSequenceFeature)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.ParamSequenceFeature", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParamSequenceFeature newInstance(SModel sm) {
    return ParamSequenceFeature.newInstance(sm, false);
  }

}
