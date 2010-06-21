package jetbrains.mps.lang.structure.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {
  private List<IModelConstraints> myConstraints = ListSequence.fromList(new ArrayList<IModelConstraints>());

  public ConstraintsDescriptor() {
    ListSequence.fromList(this.myConstraints).addElement(new EnumerationDataTypeDeclaration_hasNoDefaultMember_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new AnnotationLinkDeclaration_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new LinkDeclaration_role_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new ConceptLinkDeclaration_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new ConceptDeclaration_extends_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new LinkDeclaration_specializedLink_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new EnumerationDataTypeDeclaration_defaultMember_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new ReferenceConceptLink_target_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new ConceptLink_conceptLinkDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new ConceptProperty_conceptPropertyDeclaration_ReferentConstraint());
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
