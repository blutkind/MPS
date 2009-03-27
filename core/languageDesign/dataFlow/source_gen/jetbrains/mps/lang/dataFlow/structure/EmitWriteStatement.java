package jetbrains.mps.lang.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EmitWriteStatement extends jetbrains.mps.lang.dataFlow.structure.BaseEmitVariableStatement {
  public static final String concept = "jetbrains.mps.lang.dataFlow.structure.EmitWriteStatement";
  public static final String VALUE = "value";

  public EmitWriteStatement(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getValue() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, EmitWriteStatement.VALUE);
  }

  public void setValue(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(EmitWriteStatement.VALUE, node);
  }


  public static EmitWriteStatement newInstance(SModel sm, boolean init) {
    return (EmitWriteStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.dataFlow.structure.EmitWriteStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EmitWriteStatement newInstance(SModel sm) {
    return EmitWriteStatement.newInstance(sm, false);
  }

}
