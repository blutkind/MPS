package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BlockBodyPart extends ChildPart {
  public static final String concept = "jetbrains.mpslite.structure.BlockBodyPart";

  public BlockBodyPart(SNode node) {
    super(node);
  }

  public static BlockBodyPart newInstance(SModel sm, boolean init) {
    return (BlockBodyPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.BlockBodyPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BlockBodyPart newInstance(SModel sm) {
    return BlockBodyPart.newInstance(sm, false);
  }

}
