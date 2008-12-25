package jetbrains.mps.gtext.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class GItemList_Behavior {

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isComplex_1213877298853(SNode thisNode) {
    boolean complex = false;
    for(SNode item : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "item", true))) {
      if (SNodeOperations.isInstanceOf(item, "jetbrains.mps.gtext.structure.GItem") && GItem_Behavior.call_isComplex_1213877298853(item)) {
        complex = true;
        break;
      }
    }
    return complex;
  }

}
