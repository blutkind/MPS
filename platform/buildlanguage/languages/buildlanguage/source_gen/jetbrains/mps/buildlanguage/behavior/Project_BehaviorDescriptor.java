package jetbrains.mps.buildlanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class Project_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor, IPropertyHolder_BehaviorDescriptor, IAntScript_BehaviorDescriptor {
  public Project_BehaviorDescriptor() {
  }

  public List<SNode> virtual_getProperties_1213877375726(SNode thisNode) {
    return Project_Behavior.virtual_getProperties_1213877375726(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }
}
