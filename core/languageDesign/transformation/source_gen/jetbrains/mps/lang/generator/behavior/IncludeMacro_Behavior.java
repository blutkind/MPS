package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class IncludeMacro_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getInputNodeTypeInsideOfMacro_1213877290799(SNode thisNode) {
    {
      Pattern_3 pattern_3 = new Pattern_3();
      SNode coercedNode_3 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(thisNode, "sourceNodeQuery", true)), pattern_3);
      if (coercedNode_3 != null) {
        return pattern_3.PatternVar3;
      } else
      {
      }
    }
    return NodeMacro_Behavior.callSuper_getInputNodeTypeInsideOfMacro_1213877290799(thisNode, "jetbrains.mps.lang.generator.structure.IncludeMacro");
  }

}
