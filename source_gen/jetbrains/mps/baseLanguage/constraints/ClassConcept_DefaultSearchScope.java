package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.search.VisibleClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class ClassConcept_DefaultSearchScope implements INodeReferentSearchScopeProvider {

  public  ClassConcept_DefaultSearchScope() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeDefaultSearchScopeProvider("jetbrains.mps.baseLanguage.structure.ClassConcept", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeDefaultSearchScopeProvider("jetbrains.mps.baseLanguage.structure.ClassConcept");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final SModel model, final SNode enclosingNode, final SNode referenceNode, final IScope scope) {
    return new VisibleClassifiersScope(model, IClassifiersSearchScope.CLASS, scope);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "visible classes from model and imported models";
  }

}
