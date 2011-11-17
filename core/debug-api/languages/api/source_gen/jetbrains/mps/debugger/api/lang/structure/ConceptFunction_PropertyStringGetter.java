package jetbrains.mps.debugger.api.lang.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunction_PropertyStringGetter extends ConceptFunction {
  public static final String concept = "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_PropertyStringGetter";

  public ConceptFunction_PropertyStringGetter(SNode node) {
    super(node);
  }

  public static ConceptFunction_PropertyStringGetter newInstance(SModel sm, boolean init) {
    return (ConceptFunction_PropertyStringGetter) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debugger.api.lang.structure.ConceptFunction_PropertyStringGetter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunction_PropertyStringGetter newInstance(SModel sm) {
    return ConceptFunction_PropertyStringGetter.newInstance(sm, false);
  }
}
