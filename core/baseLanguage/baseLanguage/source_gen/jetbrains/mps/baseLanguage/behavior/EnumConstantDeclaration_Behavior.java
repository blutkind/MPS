package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class EnumConstantDeclaration_Behavior {
  private static Class[] PARAMETERS_8986964027630472402 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    SNode enumClass = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.EnumClass", false, false);
    return SLinkOperations.getTargets(enumClass, "constructor", true);
  }

  public static boolean virtual_isStatic_8986964027630462944(SNode thisNode) {
    return true;
  }

  public static boolean call_isStatic_8986964027630472402(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration"), "virtual_isStatic_8986964027630462944", PARAMETERS_8986964027630472402);
  }

  public static boolean callSuper_isStatic_8986964027630472402(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration"), callerConceptFqName, "virtual_isStatic_8986964027630462944", PARAMETERS_8986964027630472402);
  }
}
