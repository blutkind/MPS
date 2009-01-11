package jetbrains.mps.samples.agreementLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.samples.formulaLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ValueReference extends Expression {
  public static final String concept = "jetbrains.mps.samples.agreementLanguage.structure.ValueReference";
  public static final String VALUE = "value";

  public ValueReference(SNode node) {
    super(node);
  }

  public Value getValue() {
    return (Value)this.getReferent(Value.class, ValueReference.VALUE);
  }

  public void setValue(Value node) {
    super.setReferent(ValueReference.VALUE, node);
  }


  public static ValueReference newInstance(SModel sm, boolean init) {
    return (ValueReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.agreementLanguage.structure.ValueReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ValueReference newInstance(SModel sm) {
    return ValueReference.newInstance(sm, false);
  }

}
