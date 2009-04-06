package jetbrains.mps.lang.structure.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.lang.structure.constraints.EnumerationDataTypeDeclaration_hasNoDefaultMember_PropertyConstraint;
import jetbrains.mps.lang.structure.constraints.AnnotationLinkDeclaration_name_PropertyConstraint;
import jetbrains.mps.lang.structure.constraints.ConceptDeclaration_extends_ReferentConstraint;
import jetbrains.mps.lang.structure.constraints.LinkDeclaration_specializedLink_ReferentConstraint;
import jetbrains.mps.lang.structure.constraints.EnumerationDataTypeDeclaration_defaultMember_ReferentConstraint;
import jetbrains.mps.lang.structure.constraints.ReferenceConceptLink_target_ReferentConstraint;
import jetbrains.mps.lang.structure.constraints.ConceptLink_conceptLinkDeclaration_ReferentConstraint;
import jetbrains.mps.lang.structure.constraints.ConceptProperty_conceptPropertyDeclaration_ReferentConstraint;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = ListOperations.<IModelConstraints>createList();

  public ConstraintsDescriptor() {
    ListOperations.addElement(this.myConstraints, new EnumerationDataTypeDeclaration_hasNoDefaultMember_PropertyConstraint());
    ListOperations.addElement(this.myConstraints, new AnnotationLinkDeclaration_name_PropertyConstraint());
    ListOperations.addElement(this.myConstraints, new ConceptDeclaration_extends_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new LinkDeclaration_specializedLink_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new EnumerationDataTypeDeclaration_defaultMember_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new ReferenceConceptLink_target_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new ConceptLink_conceptLinkDeclaration_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new ConceptProperty_conceptPropertyDeclaration_ReferentConstraint());
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
