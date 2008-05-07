package jetbrains.mps.uiLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

import java.util.ArrayList;
import java.util.List;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = new ArrayList<IModelConstraints>();

  public ConstraintsDescriptor() {
    this.myConstraints.add(new ComponentController_name_PropertyConstraint());
    this.myConstraints.add(new AttributeValue_attribute_ReferentConstraint());
    this.myConstraints.add(new ComponentInstance_componentDeclaration_ReferentConstraint());
    this.myConstraints.add(new ComponentReference_component_ReferentConstraint());
    this.myConstraints.add(new StubCellRendererInfo_cellRendererSetter_ReferentConstraint());
  }

  public void unRegisterSelf(ModelConstraintsManager p0) {
    for (IModelConstraints c : this.myConstraints) {
      c.unRegisterSelf(p0);
    }
  }

  public void registerSelf(ModelConstraintsManager p0) {
    for (IModelConstraints c : this.myConstraints) {
      c.registerSelf(p0);
    }
  }

}
