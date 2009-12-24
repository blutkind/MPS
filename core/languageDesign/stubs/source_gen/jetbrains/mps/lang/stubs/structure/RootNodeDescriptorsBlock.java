package jetbrains.mps.lang.stubs.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RootNodeDescriptorsBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.stubs.structure.RootNodeDescriptorsBlock";

  public RootNodeDescriptorsBlock(SNode node) {
    super(node);
  }

  public static RootNodeDescriptorsBlock newInstance(SModel sm, boolean init) {
    return (RootNodeDescriptorsBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.stubs.structure.RootNodeDescriptorsBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RootNodeDescriptorsBlock newInstance(SModel sm) {
    return RootNodeDescriptorsBlock.newInstance(sm, false);
  }
}
