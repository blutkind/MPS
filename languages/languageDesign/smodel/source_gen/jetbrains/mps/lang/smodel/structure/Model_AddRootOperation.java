package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Model_AddRootOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Model_AddRootOperation";
  public static final String NODE_ARGUMENT = "nodeArgument";

  public Model_AddRootOperation(SNode node) {
    super(node);
  }

  public Expression getNodeArgument() {
    return (Expression) this.getChild(Expression.class, Model_AddRootOperation.NODE_ARGUMENT);
  }

  public void setNodeArgument(Expression node) {
    super.setChild(Model_AddRootOperation.NODE_ARGUMENT, node);
  }

  public static Model_AddRootOperation newInstance(SModel sm, boolean init) {
    return (Model_AddRootOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Model_AddRootOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Model_AddRootOperation newInstance(SModel sm) {
    return Model_AddRootOperation.newInstance(sm, false);
  }
}
