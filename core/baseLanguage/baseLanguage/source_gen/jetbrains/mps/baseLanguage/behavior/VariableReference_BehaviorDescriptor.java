package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;

public abstract class VariableReference_BehaviorDescriptor extends Expression_BehaviorDescriptor implements TypeAnnotable_BehaviorDescriptor, IVariableReference_BehaviorDescriptor {
  public VariableReference_BehaviorDescriptor() {
  }

  public SNode virtual_getTypeAnnotation_1233920952262(SNode thisNode) {
    return VariableReference_Behavior.virtual_getTypeAnnotation_1233920952262(thisNode);
  }

  public SNode virtual_getVariable_1023687332192481693(SNode thisNode) {
    return VariableReference_Behavior.virtual_getVariable_1023687332192481693(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.VariableReference";
  }
}
