package jetbrains.mps.make.facet.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExtendsFacetReference extends FacetReference {
  public static final String concept = "jetbrains.mps.make.facet.structure.ExtendsFacetReference";

  public ExtendsFacetReference(SNode node) {
    super(node);
  }

  public static ExtendsFacetReference newInstance(SModel sm, boolean init) {
    return (ExtendsFacetReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.facet.structure.ExtendsFacetReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExtendsFacetReference newInstance(SModel sm) {
    return ExtendsFacetReference.newInstance(sm, false);
  }
}
