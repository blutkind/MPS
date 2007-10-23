package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Type;

public class ParamSequenceFeature extends SequenceFeature implements IParamFeature {
  public static final String concept = "jetbrains.mps.ypath.structure.ParamSequenceFeature";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String PARAMETER_TYPE = "parameterType";
  public static String PARAMETER_QUERY_FUNCTION = "parameterQueryFunction";
  public static String TARGET_TYPE_FUNCTION = "targetTypeFunction";
  public static String TO_STRING_FUNCTION = "toStringFunction";

  public  ParamSequenceFeature(SNode node) {
    super(node);
  }

  public static ParamSequenceFeature newInstance(SModel sm, boolean init) {
    return (ParamSequenceFeature)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.ParamSequenceFeature", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParamSequenceFeature newInstance(SModel sm) {
    return ParamSequenceFeature.newInstance(sm, false);
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

}
