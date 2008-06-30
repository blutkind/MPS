package jetbrains.mps.logging.refactoring.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class RequiredAdditionalArgumentReference_argument_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public RequiredAdditionalArgumentReference_argument_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference", "argument", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference", "argument");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> nodes = ListSequence.<SNode>fromArray();
    SNode refactoring = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.logging.refactoring.structure.Refactoring", false, false);
    ListSequence.fromList(nodes).addSequence(ListSequence.fromList(SLinkOperations.getTargets(refactoring, "arguments", true)));
    ListSequence.fromList(nodes).addSequence(ListSequence.fromList(SLinkOperations.getTargets(refactoring, "internalArguments", true)));
    return new SimpleSearchScope(nodes);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
