package jetbrains.mps.build.distrib.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;

public class WindowsConfig_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getStartupFileName_1230208021944(SNode thisNode) {
    return DistribConfiguration_Behavior.call_getProjectName_1230292821821(SystemSpecificConfig_Behavior.call_getDistribConfiguration_1230207861621(thisNode));
  }

  public static String call_getStartupFileExtension_1230208056584(SNode thisNode) {
    return "bat";
  }

}
