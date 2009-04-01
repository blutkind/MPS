package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FindSourceBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.FindSourceBlock";

  public FindSourceBlock(SNode node) {
    super(node);
  }

  public static FindSourceBlock newInstance(SModel sm, boolean init) {
    return (FindSourceBlock)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.FindSourceBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FindSourceBlock newInstance(SModel sm) {
    return FindSourceBlock.newInstance(sm, false);
  }

}
