package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleStaticMembersScope;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class StaticFieldReference_staticFieldDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public StaticFieldReference_staticFieldDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "variableDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "variableDeclaration");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return new ClassifierVisibleStaticMembersScope(((Classifier)SNodeOperations.getAdapter(SLinkOperations.getTarget(_context.getReferenceNode(), "classifier", false))), _context.getReferenceNode(), IClassifiersSearchScope.STATIC_FIELD);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "static fields from hierarchy of specified class";
  }

}
