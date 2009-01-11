package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ExpressionStatement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AddElementStatement extends ExpressionStatement {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.AddElementStatement";

  public AddElementStatement(SNode node) {
    super(node);
  }

  public Expression getElement() {
    return this.ensureAdapter(Expression.class, "expression", this.getExpression());
  }

  public void setElement(Expression node) {
    this.setExpression(node);
  }


  public static AddElementStatement newInstance(SModel sm, boolean init) {
    return (AddElementStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.AddElementStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AddElementStatement newInstance(SModel sm) {
    return AddElementStatement.newInstance(sm, false);
  }

}
