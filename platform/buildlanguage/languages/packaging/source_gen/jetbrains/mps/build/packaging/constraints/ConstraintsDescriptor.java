package jetbrains.mps.build.packaging.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = ListSequence.fromList(new ArrayList<IModelConstraints>());

  public ConstraintsDescriptor() {
    ListSequence.fromList(this.myConstraints).addElement(new Folder_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new Module_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new Echo_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new File_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new Configuration_fullName_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new MacroReference_path_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new AbstractProjectComponent_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new Antcall_targetDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new Antcall_project_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new Variable_DefaultSearchScope());
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
