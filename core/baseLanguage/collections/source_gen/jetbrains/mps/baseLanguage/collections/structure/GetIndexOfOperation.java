package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetIndexOfOperation extends SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.GetIndexOfOperation";
  public static final String ARGUMENT = "argument";

  public GetIndexOfOperation(SNode node) {
    super(node);
  }

  public Expression getArgument() {
    return (Expression)this.getChild(GetIndexOfOperation.ARGUMENT);
  }

  public void setArgument(Expression node) {
    super.setChild(GetIndexOfOperation.ARGUMENT, node);
  }


  public static GetIndexOfOperation newInstance(SModel sm, boolean init) {
    return (GetIndexOfOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.GetIndexOfOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetIndexOfOperation newInstance(SModel sm) {
    return GetIndexOfOperation.newInstance(sm, false);
  }

}
