package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.baseLanguage.regexp.structure.RegexpExpression;

public interface RegexpUsingConstruction extends INodeAdapter {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction";
  public static final String REGEXP = "regexp";

  public RegexpExpression getRegexp();

  public void setRegexp(RegexpExpression node);

}
