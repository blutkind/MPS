package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SelectParameter extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.editor.structure.SelectParameter";

  public SelectParameter(SNode node) {
    super(node);
  }

  public static SelectParameter newInstance(SModel sm, boolean init) {
    return (SelectParameter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.SelectParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SelectParameter newInstance(SModel sm) {
    return SelectParameter.newInstance(sm, false);
  }

}
