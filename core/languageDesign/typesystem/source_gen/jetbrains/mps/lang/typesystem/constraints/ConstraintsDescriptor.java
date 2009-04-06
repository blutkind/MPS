package jetbrains.mps.lang.typesystem.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.lang.typesystem.constraints.ChildTypeRestrictionReference_typeRestriction_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.WhenConcreteVariableReference_whenConcreteVar_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.ListVarReference_listVarDeclaration_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.PropertyPatternVariableReference_patternVarDecl_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.LinkPatternVariableReference_patternVarDecl_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.PatternVariableReference_patternVarDecl_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.TypeVarReference_typeVarDeclaration_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.ChildTypeRestriction_childLinkDeclaration_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.ConceptReference_concept_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.ApplicableNodeReference_applicableNode_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.HelginsIntentionArgument_quickFixArgument_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.QuickFixArgumentReference_quickFixArgument_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.SimpleRule_VarRef_link_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.SimpleRule_ProcedureCall_actualArgumentsLink_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.SimpleRule_ProcedureCall_procedureDeclaration_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.SimpleRule_ProcedureCall_parametersLink_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.PropertyMessageTarget_propertyDeclaration_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.ReferenceMessageTarget_linkDeclaration_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.LinkAssociation_subtypeLink_ReferentConstraint;
import jetbrains.mps.lang.typesystem.constraints.LinkAssociation_supertypeLink_ReferentConstraint;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = ListOperations.<IModelConstraints>createList();

  public ConstraintsDescriptor() {
    ListOperations.addElement(this.myConstraints, new ChildTypeRestrictionReference_typeRestriction_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new WhenConcreteVariableReference_whenConcreteVar_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new ListVarReference_listVarDeclaration_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new PropertyPatternVariableReference_patternVarDecl_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new LinkPatternVariableReference_patternVarDecl_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new PatternVariableReference_patternVarDecl_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new TypeVarReference_typeVarDeclaration_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new ChildTypeRestriction_childLinkDeclaration_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new ConceptReference_concept_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new ApplicableNodeReference_applicableNode_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new HelginsIntentionArgument_quickFixArgument_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new QuickFixArgumentReference_quickFixArgument_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new SimpleRule_VarRef_link_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new SimpleRule_ProcedureCall_actualArgumentsLink_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new SimpleRule_ProcedureCall_procedureDeclaration_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new SimpleRule_ProcedureCall_parametersLink_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new PropertyMessageTarget_propertyDeclaration_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new ReferenceMessageTarget_linkDeclaration_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new LinkAssociation_subtypeLink_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new LinkAssociation_supertypeLink_ReferentConstraint());
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
