package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class BooleanConstant extends Expression {
  public static String VALUE = "value";

  public  BooleanConstant(SNode node) {
    super(node);
  }

  public static BooleanConstant newInstance(SModel sm) {
    return (BooleanConstant)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.BooleanConstant", sm, GlobalScope.getInstance()).getAdapter();
  }

  public boolean getValue() {
    return this.getBooleanProperty(BooleanConstant.VALUE);
  }
  public void setValue(boolean value) {
    this.setBooleanProperty(BooleanConstant.VALUE, value);
  }
}
