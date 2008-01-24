package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.search.ISearchScope;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class ParameterReference_parameterDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  ParameterReference_parameterDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.ParameterReference", "variableDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.ParameterReference", "variableDeclaration");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final SModel model, final SNode enclosingNode, final SNode referenceNode, final IScope scope) {
    List<SNode> methods = SNodeOperations.getAncestors(enclosingNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", true);
    List<SNode> params = ListOperations.<SNode>createList();
    for(SNode bmd : methods) {
      ListOperations.addAllElements(params, SLinkOperations.getTargets(bmd, "parameter", true));
    }
    return new SimpleSearchScope(params);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "parameters declared in enclosing method";
  }

}
