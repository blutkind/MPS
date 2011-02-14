package jetbrains.mps.runConfigurations.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Debug_Parameter extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.runConfigurations.structure.Debug_Parameter";

  public Debug_Parameter(SNode node) {
    super(node);
  }

  public static Debug_Parameter newInstance(SModel sm, boolean init) {
    return (Debug_Parameter) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.runConfigurations.structure.Debug_Parameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Debug_Parameter newInstance(SModel sm) {
    return Debug_Parameter.newInstance(sm, false);
  }
}
