package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class MapSrcListMacro_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getInputNodeTypeInsideOfMacro_1213877290799(SNode thisNode) {
    {
      Pattern_1 pattern_1 = new Pattern_1();
      SNode coercedNode_1 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(thisNode, "sourceNodesQuery", true)), pattern_1);
      if (coercedNode_1 != null) {
        return pattern_1.PatternVar1;
      } else
      {
      }
    }
    return null;
  }

}
