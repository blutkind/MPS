package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class TreeNodeKindOccurrence_nodeKind_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  TreeNodeKindOccurrence_nodeKind_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.ypath.structure.TreeNodeKindOccurrence", "nodeKind", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.ypath.structure.TreeNodeKindOccurrence", "nodeKind");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final SModel model, final SNode enclosingNode, final SNode referenceNode, final IScope scope) {
    SNode tpoe = SNodeOperations.getAncestor(enclosingNode, "jetbrains.mps.ypath.structure.TreePathOperationExpression", false, false);
    SNode tpa = (SNode)ITreePathExpression_Behavior.call_getTreePath_1194366873089(tpoe);
    return new SimpleSearchScope(SequenceOperations.toList(SequenceOperations.where(SNodeOperations.getDescendants(tpa, null, false), new zPredicate23(null, null))));
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
