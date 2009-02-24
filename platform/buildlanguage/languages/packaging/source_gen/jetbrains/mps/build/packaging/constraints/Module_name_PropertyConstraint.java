package jetbrains.mps.build.packaging.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.build.packaging.behavior.Module_Behavior;

public class Module_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {

  public Module_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.build.packaging.structure.Module", "name", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.build.packaging.structure.Module", "name");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    IModule module = MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString(SPropertyOperations.getString(node, "id")));
    if (module == null) {
      return null;
    }
    return Module_Behavior.extractModuleProperName_1235487584035(module);
  }

}
