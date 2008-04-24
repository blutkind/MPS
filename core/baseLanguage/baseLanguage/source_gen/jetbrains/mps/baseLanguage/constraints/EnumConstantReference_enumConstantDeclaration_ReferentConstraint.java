package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class EnumConstantReference_enumConstantDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public EnumConstantReference_enumConstantDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.EnumConstantReference", "enumConstantDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.EnumConstantReference", "enumConstantDeclaration");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return SLinkOperations.getTarget(_context.getReferenceNode(), "enumClass", false) != null;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return Classifier_Behavior.call_getVisibleMembersSearchScope_1189552517057(SLinkOperations.getTarget(_context.getReferenceNode(), "enumClass", false), _context.getReferenceNode(), IClassifiersSearchScope.ENUM_CONSTANT);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "constants declared in the specified class";
  }

}
