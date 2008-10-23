package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MultipleForeachLoopVariable extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.MultipleForeachLoopVariable";
  public static final String VARIABLE = "variable";
  public static final String ITERABLE = "iterable";

  public MultipleForeachLoopVariable(SNode node) {
    super(node);
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


  public static MultipleForeachLoopVariable newInstance(SModel sm, boolean init) {
    return (MultipleForeachLoopVariable)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.MultipleForeachLoopVariable", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MultipleForeachLoopVariable newInstance(SModel sm) {
    return MultipleForeachLoopVariable.newInstance(sm, false);
  }

}
