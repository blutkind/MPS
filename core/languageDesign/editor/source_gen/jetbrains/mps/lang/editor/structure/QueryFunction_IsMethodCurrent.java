package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_IsMethodCurrent extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.editor.structure.QueryFunction_IsMethodCurrent";

  public QueryFunction_IsMethodCurrent(SNode node) {
    super(node);
  }

  public static QueryFunction_IsMethodCurrent newInstance(SModel sm, boolean init) {
    return (QueryFunction_IsMethodCurrent)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.QueryFunction_IsMethodCurrent", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_IsMethodCurrent newInstance(SModel sm) {
    return QueryFunction_IsMethodCurrent.newInstance(sm, false);
  }
}
