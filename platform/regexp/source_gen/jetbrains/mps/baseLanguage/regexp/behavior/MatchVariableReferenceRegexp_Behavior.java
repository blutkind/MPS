package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class MatchVariableReferenceRegexp_Behavior {
  private static Class[] PARAMETERS_1222610343965 = {SNode.class ,List.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    return "\\" + (ListSequence.fromList(vars).indexOf(SLinkOperations.getTarget(thisNode, "match", false)) + 1);
  }

  public static String call_getString_1222610343965(SNode thisNode, List<SNode> vars) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceRegexp"), "virtual_getString_1222432436326", PARAMETERS_1222610343965, vars);
  }

  public static String callSuper_getString_1222610343965(SNode thisNode, String callerConceptFqName, List<SNode> vars) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceRegexp"), callerConceptFqName, "virtual_getString_1222432436326", PARAMETERS_1222610343965, vars);
  }
}
