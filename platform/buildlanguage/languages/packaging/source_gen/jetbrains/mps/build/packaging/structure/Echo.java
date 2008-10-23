package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Echo extends File {
  public static final String concept = "jetbrains.mps.build.packaging.structure.Echo";
  public static final String MESSAGE = "message";

  public Echo(SNode node) {
    super(node);
  }

  public IStringExpression getMessage() {
    return (IStringExpression)this.getChild(Echo.MESSAGE);
  }

  public void setMessage(IStringExpression node) {
    super.setChild(Echo.MESSAGE, node);
  }


  public static Echo newInstance(SModel sm, boolean init) {
    return (Echo)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.Echo", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Echo newInstance(SModel sm) {
    return Echo.newInstance(sm, false);
  }

}
