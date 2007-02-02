package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class FloatingPointConstant extends Expression {
  public static String VALUE = "value";

  public  FloatingPointConstant(SNode node) {
    super(node);
  }

  public static FloatingPointConstant newInstance(SModel sm) {
    return (FloatingPointConstant)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.FloatingPointConstant", sm, GlobalScope.getInstance()).getAdapter();
  }

  public String getValue() {
    return this.getProperty(FloatingPointConstant.VALUE);
  }
  public void setValue(String value) {
    this.setProperty(FloatingPointConstant.VALUE, value);
  }
}
