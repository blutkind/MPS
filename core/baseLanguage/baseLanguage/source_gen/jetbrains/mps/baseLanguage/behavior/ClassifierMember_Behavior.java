package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ClassifierMember_Behavior {
  private static Class[] PARAMETERS_8986964027630462944 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isStatic_8986964027630462944(SNode thisNode) {
    return false;
  }

  public static boolean call_isStatic_8986964027630462944(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ClassifierMember"), "virtual_isStatic_8986964027630462944", PARAMETERS_8986964027630462944);
  }

  public static boolean callSuper_isStatic_8986964027630462944(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ClassifierMember"), callerConceptFqName, "virtual_isStatic_8986964027630462944", PARAMETERS_8986964027630462944);
  }
}
