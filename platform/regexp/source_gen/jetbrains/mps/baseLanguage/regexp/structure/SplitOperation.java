package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.regexp.structure.RegexpExpression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SplitOperation extends BaseConcept implements IOperation, RegexpUsingConstruction {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.SplitOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String REGEXP = "regexp";

  public SplitOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(SplitOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SplitOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SplitOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SplitOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SplitOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SplitOperation.VIRTUAL_PACKAGE, value);
  }

  public RegexpExpression getRegexp() {
    return (RegexpExpression)this.getChild(RegexpExpression.class, SplitOperation.REGEXP);
  }

  public void setRegexp(RegexpExpression node) {
    super.setChild(SplitOperation.REGEXP, node);
  }


  public static SplitOperation newInstance(SModel sm, boolean init) {
    return (SplitOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.SplitOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SplitOperation newInstance(SModel sm) {
    return SplitOperation.newInstance(sm, false);
  }

}
