package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.structure.AbstractInequationStatement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CreateStrongLessThanInequationStatement extends AbstractInequationStatement {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.CreateStrongLessThanInequationStatement";

  public CreateStrongLessThanInequationStatement(SNode node) {
    super(node);
  }

  public static CreateStrongLessThanInequationStatement newInstance(SModel sm, boolean init) {
    return (CreateStrongLessThanInequationStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.CreateStrongLessThanInequationStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CreateStrongLessThanInequationStatement newInstance(SModel sm) {
    return CreateStrongLessThanInequationStatement.newInstance(sm, false);
  }

}
