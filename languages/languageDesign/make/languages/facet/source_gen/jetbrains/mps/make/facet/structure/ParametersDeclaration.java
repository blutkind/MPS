package jetbrains.mps.make.facet.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParametersDeclaration extends NamedTupleDeclaration {
  public static final String concept = "jetbrains.mps.make.facet.structure.ParametersDeclaration";

  public ParametersDeclaration(SNode node) {
    super(node);
  }

  public static ParametersDeclaration newInstance(SModel sm, boolean init) {
    return (ParametersDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.facet.structure.ParametersDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParametersDeclaration newInstance(SModel sm) {
    return ParametersDeclaration.newInstance(sm, false);
  }
}
