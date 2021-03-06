package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QuickFixExecuteBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.QuickFixExecuteBlock";

  public QuickFixExecuteBlock(SNode node) {
    super(node);
  }

  public static QuickFixExecuteBlock newInstance(SModel sm, boolean init) {
    return (QuickFixExecuteBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.QuickFixExecuteBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QuickFixExecuteBlock newInstance(SModel sm) {
    return QuickFixExecuteBlock.newInstance(sm, false);
  }
}
