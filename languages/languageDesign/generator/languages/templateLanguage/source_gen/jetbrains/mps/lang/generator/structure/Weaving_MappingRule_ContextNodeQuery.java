package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Weaving_MappingRule_ContextNodeQuery extends TemplateQueryBase {
  public static final String concept = "jetbrains.mps.lang.generator.structure.Weaving_MappingRule_ContextNodeQuery";

  public Weaving_MappingRule_ContextNodeQuery(SNode node) {
    super(node);
  }

  public static Weaving_MappingRule_ContextNodeQuery newInstance(SModel sm, boolean init) {
    return (Weaving_MappingRule_ContextNodeQuery) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.Weaving_MappingRule_ContextNodeQuery", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Weaving_MappingRule_ContextNodeQuery newInstance(SModel sm) {
    return Weaving_MappingRule_ContextNodeQuery.newInstance(sm, false);
  }
}
