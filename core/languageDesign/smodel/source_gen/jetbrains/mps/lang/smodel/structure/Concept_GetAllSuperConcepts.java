package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Concept_GetAllSuperConcepts extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Concept_GetAllSuperConcepts";

  public Concept_GetAllSuperConcepts(SNode node) {
    super(node);
  }

  public static Concept_GetAllSuperConcepts newInstance(SModel sm, boolean init) {
    return (Concept_GetAllSuperConcepts)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Concept_GetAllSuperConcepts", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Concept_GetAllSuperConcepts newInstance(SModel sm) {
    return Concept_GetAllSuperConcepts.newInstance(sm, false);
  }

}
