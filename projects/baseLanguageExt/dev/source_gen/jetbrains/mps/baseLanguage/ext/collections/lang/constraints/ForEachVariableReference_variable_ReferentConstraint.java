package jetbrains.mps.baseLanguage.ext.collections.lang.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import java.util.List;
import jetbrains.mps.smodel.search.SubnodesSearchScope;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class ForEachVariableReference_variable_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  ForEachVariableReference_variable_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference", "variable", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference", "variable");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return SNodeOperations.getAncestor(enclosingNode, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement", true, false) != null;
  }

  public ISearchScope createNodeReferentSearchScope(final SModel model, final SNode enclosingNode, final SNode referenceNode, final IScope scope) {
    List<SNode> forEachStatements = SNodeOperations.getAncestors(enclosingNode, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement", false);
    return new SubnodesSearchScope(SequenceOperations.getLast(forEachStatements));
  }

  public String getNodeReferentSearchScopeDescription() {
    return "cycle-variable of enclosing 'foreach' cycle";
  }

}
