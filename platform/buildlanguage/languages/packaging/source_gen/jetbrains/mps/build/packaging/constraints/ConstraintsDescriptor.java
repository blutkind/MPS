package jetbrains.mps.build.packaging.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = new ArrayList<IModelConstraints>();

  public ConstraintsDescriptor() {
    this.myConstraints.add(new Folder_name_PropertyConstraint());
    this.myConstraints.add(new Jar_name_PropertyConstraint());
    this.myConstraints.add(new Module_name_PropertyConstraint());
    this.myConstraints.add(new Echo_name_PropertyConstraint());
    this.myConstraints.add(new File_name_PropertyConstraint());
    this.myConstraints.add(new Variable_name_PropertyConstraint());
    this.myConstraints.add(new Configuration_fullName_PropertyConstraint());
    this.myConstraints.add(new MacroReference_path_PropertyConstraint());
    this.myConstraints.add(new Antcall_targetDeclaration_ReferentConstraint());
    this.myConstraints.add(new Antcall_project_ReferentConstraint());
    this.myConstraints.add(new Variable_DefaultSearchScope());
  }

  public void unRegisterSelf(ModelConstraintsManager p0) {
    for(IModelConstraints c : this.myConstraints) {
      c.unRegisterSelf(p0);
    }
  }

  public void registerSelf(ModelConstraintsManager p0) {
    for(IModelConstraints c : this.myConstraints) {
      c.registerSelf(p0);
    }
  }

}
