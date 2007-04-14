package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration;
import jetbrains.mps.baseLanguage.structure.Expression;

public class MultipleForeachLoopVariable extends BaseConcept {
  public static String VARIABLE = "variable";
  public static String ITERABLE = "iterable";

  public  MultipleForeachLoopVariable(SNode node) {
    super(node);
  }

  public static MultipleForeachLoopVariable newInstance(SModel sm, boolean init) {
    return (MultipleForeachLoopVariable)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.MultipleForeachLoopVariable", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static MultipleForeachLoopVariable newInstance(SModel sm) {
    return MultipleForeachLoopVariable.newInstance(sm, false);
  }

  public LocalVariableDeclaration getVariable() {
    return (LocalVariableDeclaration)this.getChild(MultipleForeachLoopVariable.VARIABLE);
  }
  public void setVariable(LocalVariableDeclaration node) {
    super.setChild(MultipleForeachLoopVariable.VARIABLE, node);
  }
  public Expression getIterable() {
    return (Expression)this.getChild(MultipleForeachLoopVariable.ITERABLE);
  }
  public void setIterable(Expression node) {
    super.setChild(MultipleForeachLoopVariable.ITERABLE, node);
  }
}
