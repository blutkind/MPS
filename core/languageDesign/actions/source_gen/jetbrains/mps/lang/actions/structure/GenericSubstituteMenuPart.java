package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GenericSubstituteMenuPart extends SubstituteMenuPart {
  public static final String concept = "jetbrains.mps.lang.actions.structure.GenericSubstituteMenuPart";
  public static final String QUERY = "query";

  public GenericSubstituteMenuPart(SNode node) {
    super(node);
  }

  public QueryFunction_GenericSubstituteMenuPart getQuery() {
    return (QueryFunction_GenericSubstituteMenuPart)this.getChild(QueryFunction_GenericSubstituteMenuPart.class, GenericSubstituteMenuPart.QUERY);
  }

  public void setQuery(QueryFunction_GenericSubstituteMenuPart node) {
    super.setChild(GenericSubstituteMenuPart.QUERY, node);
  }


  public static GenericSubstituteMenuPart newInstance(SModel sm, boolean init) {
    return (GenericSubstituteMenuPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.GenericSubstituteMenuPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GenericSubstituteMenuPart newInstance(SModel sm) {
    return GenericSubstituteMenuPart.newInstance(sm, false);
  }

}
