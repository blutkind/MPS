package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Expression_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.IVariableReference_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class ForEachVariableReference_BehaviorDescriptor extends Expression_BehaviorDescriptor implements IVariableReference_BehaviorDescriptor {
  public ForEachVariableReference_BehaviorDescriptor() {
  }

  public SNode virtual_getVariable_1023687332192481693(SNode thisNode) {
    return ForEachVariableReference_Behavior.virtual_getVariable_1023687332192481693(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference";
  }
}
