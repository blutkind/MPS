package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;

public class Folder_BehaviorDescriptor extends AbstractProjectComponent_BehaviorDescriptor implements ICompositeComponent_BehaviorDescriptor {
  public Folder_BehaviorDescriptor() {
  }

  public String virtual_getExcludes_1213877279373(SNode thisNode) {
    return ICompositeComponent_Behavior.virtual_getExcludes_1213877279373(thisNode);
  }

  public String virtual_getIncludes_1213877279430(SNode thisNode) {
    return ICompositeComponent_Behavior.virtual_getIncludes_1213877279430(thisNode);
  }

  public String virtual_getChildrenTargetDir_1237389224202(SNode thisNode) {
    return Folder_Behavior.virtual_getChildrenTargetDir_1237389224202(thisNode);
  }
}
