package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class FileExistsCondition_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_canCalculateWhileGenerating_1233161185181(SNode thisNode) {
    return true;
  }

  public static boolean virtual_isTrueWhileGeneration_1233161599461(SNode thisNode) {
    return IPath_Behavior.call_getFile_1233322718999(SLinkOperations.getTarget(thisNode, "pathToCheck", true)).exists();
  }
}
