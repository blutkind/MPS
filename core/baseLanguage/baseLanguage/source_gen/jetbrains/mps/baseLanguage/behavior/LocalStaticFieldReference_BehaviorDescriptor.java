package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.IModule;

public class LocalStaticFieldReference_BehaviorDescriptor extends VariableReference_BehaviorDescriptor {
  public LocalStaticFieldReference_BehaviorDescriptor() {
  }

  public Object virtual_getCompileTimeConstantValue_1238860310638(SNode thisNode, IModule module) {
    return LocalStaticFieldReference_Behavior.virtual_getCompileTimeConstantValue_1238860310638(thisNode, module);
  }

  public boolean virtual_isCompileTimeConstant_1238860258777(SNode thisNode) {
    return LocalStaticFieldReference_Behavior.virtual_isCompileTimeConstant_1238860258777(thisNode);
  }

  public Object virtual_eval_1213877519769(SNode thisNode, IModule module) {
    return LocalStaticFieldReference_Behavior.virtual_eval_1213877519769(thisNode, module);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference";
  }
}
