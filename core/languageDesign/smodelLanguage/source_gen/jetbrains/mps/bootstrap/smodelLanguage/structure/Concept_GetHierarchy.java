package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Concept_GetHierarchy extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_GetHierarchy";

  public  Concept_GetHierarchy(SNode node) {
    super(node);
  }

  public static Concept_GetHierarchy newInstance(SModel sm, boolean init) {
    return ((Concept_GetHierarchy)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_GetHierarchy", sm, GlobalScope.getInstance(), init).getAdapter());
  }

  public static Concept_GetHierarchy newInstance(SModel sm) {
    return Concept_GetHierarchy.newInstance(sm, false);
  }

}
