package jetbrains.mps.lang.smodel.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {
  private List<IModelConstraints> myConstraints = ListSequence.fromList(new ArrayList<IModelConstraints>());

  public ConstraintsDescriptor() {
    ListSequence.fromList(this.myConstraints).addElement(new CheckedModuleReference_moduleId_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new SPropertyAccess_property_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new PropertyAttributeAccessQualifier_annotationLink_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new Node_ConceptMethodCall_conceptMethodDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new NodeAttributeAccessQualifier_annotationLink_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new SConceptLinkAccess_conceptLinkDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new SLinkAccess_link_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new Node_IsRoleOperation_linkInParent_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new StaticConceptMethodCall_concept_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new SLinkListAccess_link_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new LinkAttributeAccessQualifier_annotationLink_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new EnumMemberReference_enumMember_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new LinkRefQualifier_link_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new SConceptPropertyAccess_conceptProperty_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new PropertyRefQualifier_property_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new NodeRefExpression_referentNode_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new Node_GetReferentSearchScopeOperation_referenceLink_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new LinkRefExpression_linkDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new SEnum_MemberOperation_member_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new SEnumOperationInvocation_enumDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new SLinkImplicitSelect_link_ReferentConstraint());
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
