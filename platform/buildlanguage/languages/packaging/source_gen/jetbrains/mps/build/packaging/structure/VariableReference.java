package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VariableReference extends BaseConcept implements IStringExpression {
  public static final String concept = "jetbrains.mps.build.packaging.structure.VariableReference";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String VARIABLE = "variable";

  public VariableReference(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(VariableReference.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(VariableReference.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(VariableReference.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(VariableReference.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(VariableReference.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(VariableReference.VIRTUAL_PACKAGE, value);
  }

  public Variable getVariable() {
    return (Variable)this.getReferent(Variable.class, VariableReference.VARIABLE);
  }

  public void setVariable(Variable node) {
    super.setReferent(VariableReference.VARIABLE, node);
  }

  public static VariableReference newInstance(SModel sm, boolean init) {
    return (VariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.VariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static VariableReference newInstance(SModel sm) {
    return VariableReference.newInstance(sm, false);
  }
}
