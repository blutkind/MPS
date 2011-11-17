package jetbrains.mps.debugger.api.lang.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunction_GetVariables extends ConceptFunction {
  public static final String concept = "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_GetVariables";

  public ConceptFunction_GetVariables(SNode node) {
    super(node);
  }

  public static ConceptFunction_GetVariables newInstance(SModel sm, boolean init) {
    return (ConceptFunction_GetVariables) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debugger.api.lang.structure.ConceptFunction_GetVariables", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunction_GetVariables newInstance(SModel sm) {
    return ConceptFunction_GetVariables.newInstance(sm, false);
  }
}
