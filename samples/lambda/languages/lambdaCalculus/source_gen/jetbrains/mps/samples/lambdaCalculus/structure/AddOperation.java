package jetbrains.mps.samples.lambdaCalculus.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AddOperation extends BinaryNumericOperation {
  public static final String concept = "jetbrains.mps.samples.lambdaCalculus.structure.AddOperation";

  public AddOperation(SNode node) {
    super(node);
  }

  public static AddOperation newInstance(SModel sm, boolean init) {
    return (AddOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.lambdaCalculus.structure.AddOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AddOperation newInstance(SModel sm) {
    return AddOperation.newInstance(sm, false);
  }
}
