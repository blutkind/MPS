package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class BaseDirPath_Behavior {

  public static void init(SNode thisNode) {
    SPropertyOperations.set(SLinkOperations.getTarget(thisNode, "macro", true), "name", MPSLayout_Behavior.getMPSHomeName_1226508944077());
  }

  public static String virtual_getName_1221141245424(SNode thisNode) {
    String name = Path_Behavior.callSuper_getName_1221141245424(thisNode, "jetbrains.mps.build.packaging.structure.BaseDirPath");
    if (name.equals("")) {
      return SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "macro", true), "path");
    }
    return name;
  }

}
