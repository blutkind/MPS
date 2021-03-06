package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ContextUIObjectParam extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.ContextUIObjectParam";

  public ContextUIObjectParam(SNode node) {
    super(node);
  }

  public static ContextUIObjectParam newInstance(SModel sm, boolean init) {
    return (ContextUIObjectParam) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.ContextUIObjectParam", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ContextUIObjectParam newInstance(SModel sm) {
    return ContextUIObjectParam.newInstance(sm, false);
  }
}
