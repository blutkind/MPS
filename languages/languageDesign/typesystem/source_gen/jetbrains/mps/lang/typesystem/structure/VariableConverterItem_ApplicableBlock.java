package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VariableConverterItem_ApplicableBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.VariableConverterItem_ApplicableBlock";

  public VariableConverterItem_ApplicableBlock(SNode node) {
    super(node);
  }

  public static VariableConverterItem_ApplicableBlock newInstance(SModel sm, boolean init) {
    return (VariableConverterItem_ApplicableBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.VariableConverterItem_ApplicableBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static VariableConverterItem_ApplicableBlock newInstance(SModel sm) {
    return VariableConverterItem_ApplicableBlock.newInstance(sm, false);
  }
}
