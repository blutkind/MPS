package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class GetIndexOfOperation extends AbstractListOperation {
  public static String ARGUMENT = "argument";

  public  GetIndexOfOperation(SNode node) {
    super(node);
  }

  public static GetIndexOfOperation newInstance(SModel sm) {
    return (GetIndexOfOperation)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.GetIndexOfOperation", sm, GlobalScope.getInstance()).getAdapter();
  }

  public Expression getArgument() {
    return (Expression)this.getChild(GetIndexOfOperation.ARGUMENT);
  }
  public void setArgument(Expression node) {
    super.setChild(GetIndexOfOperation.ARGUMENT, node);
  }
}
