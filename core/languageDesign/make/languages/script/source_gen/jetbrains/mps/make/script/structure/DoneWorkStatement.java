package jetbrains.mps.make.script.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DoneWorkStatement extends ProgressStatement {
  public static final String concept = "jetbrains.mps.make.script.structure.DoneWorkStatement";
  public static final String AMOUNT = "amount";

  public DoneWorkStatement(SNode node) {
    super(node);
  }

  public Expression getAmount() {
    return (Expression) this.getChild(Expression.class, DoneWorkStatement.AMOUNT);
  }

  public void setAmount(Expression node) {
    super.setChild(DoneWorkStatement.AMOUNT, node);
  }

  public static DoneWorkStatement newInstance(SModel sm, boolean init) {
    return (DoneWorkStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.script.structure.DoneWorkStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DoneWorkStatement newInstance(SModel sm) {
    return DoneWorkStatement.newInstance(sm, false);
  }
}
