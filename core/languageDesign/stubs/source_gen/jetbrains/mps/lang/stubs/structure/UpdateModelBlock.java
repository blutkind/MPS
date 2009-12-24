package jetbrains.mps.lang.stubs.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UpdateModelBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.stubs.structure.UpdateModelBlock";

  public UpdateModelBlock(SNode node) {
    super(node);
  }

  public static UpdateModelBlock newInstance(SModel sm, boolean init) {
    return (UpdateModelBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.stubs.structure.UpdateModelBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UpdateModelBlock newInstance(SModel sm) {
    return UpdateModelBlock.newInstance(sm, false);
  }
}
