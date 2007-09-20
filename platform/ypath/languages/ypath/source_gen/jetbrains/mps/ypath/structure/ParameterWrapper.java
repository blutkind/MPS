package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParameterWrapper extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.ypath.structure.ParameterWrapper";
  public static String PARAM_VALUE = "paramValue";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String PARAM_REF = "paramRef";

  public  ParameterWrapper(SNode node) {
    super(node);
  }

  public static ParameterWrapper newInstance(SModel sm, boolean init) {
    return (ParameterWrapper)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.ParameterWrapper", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParameterWrapper newInstance(SModel sm) {
    return ParameterWrapper.newInstance(sm, false);
  }


  public String getParamValue() {
    return this.getProperty(ParameterWrapper.PARAM_VALUE);
  }

  public void setParamValue(String value) {
    this.setProperty(ParameterWrapper.PARAM_VALUE, value);
  }

  public String getName() {
    return this.getProperty(ParameterWrapper.NAME);
  }

  public void setName(String value) {
    this.setProperty(ParameterWrapper.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ParameterWrapper.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ParameterWrapper.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ParameterWrapper.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ParameterWrapper.ALIAS, value);
  }

  public BaseConcept getParamRef() {
    return (BaseConcept)this.getReferent(ParameterWrapper.PARAM_REF);
  }

  public void setParamRef(BaseConcept node) {
    super.setReferent(ParameterWrapper.PARAM_REF, node);
  }

}
