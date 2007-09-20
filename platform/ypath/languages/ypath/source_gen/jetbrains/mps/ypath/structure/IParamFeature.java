package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.baseLanguage.structure.Type;

public interface IParamFeature extends INodeAdapter {
  public static final String concept = "jetbrains.mps.ypath.structure.IParamFeature";
  public static String PARAMETER_TYPE = "parameterType";
  public static String PARAMETER_QUERY_FUNCTION = "parameterQueryFunction";
  public static String TARGET_TYPE_FUNCTION = "targetTypeFunction";
  public static String TO_STRING_FUNCTION = "toStringFunction";
  public static String FROM_STRING_FUNCTION = "fromStringFunction";

  public Type getParameterType();

  public void setParameterType(Type node);

  public ParameterQueryFunction getParameterQueryFunction();

  public void setParameterQueryFunction(ParameterQueryFunction node);

  public TargetTypeFunction getTargetTypeFunction();

  public void setTargetTypeFunction(TargetTypeFunction node);

  public NameFunction getToStringFunction();

  public void setToStringFunction(NameFunction node);

  public StringToParamFun getFromStringFunction();

  public void setFromStringFunction(StringToParamFun node);

}
