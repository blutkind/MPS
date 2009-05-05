package jetbrains.mps.lang.constraints.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.lang.constraints.constraints.ConceptConstraints_name_PropertyConstraint;
import jetbrains.mps.lang.constraints.constraints.NodePropertyConstraint_applicableProperty_ReferentConstraint;
import jetbrains.mps.lang.constraints.constraints.NodeReferentConstraint_applicableLink_ReferentConstraint;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = ListOperations.<IModelConstraints>createList();

  public ConstraintsDescriptor() {
    ListOperations.addElement(this.myConstraints, new ConceptConstraints_name_PropertyConstraint());
    ListOperations.addElement(this.myConstraints, new NodePropertyConstraint_applicableProperty_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new NodeReferentConstraint_applicableLink_ReferentConstraint());
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
