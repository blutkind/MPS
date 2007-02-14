package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS  */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.BaseLanguageSearchUtil_new;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import java.util.List;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class SuperMethodCall_instanceMethodDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  SuperMethodCall_instanceMethodDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.SuperMethodCall", "baseMethodDeclaration", this);
  }
  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.SuperMethodCall", "baseMethodDeclaration");
  }
  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return SNodeOperations.getAncestor(enclosingNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", true, false) != null;
  }
  public ISearchScope createNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    SNode enclosingClass = SNodeOperations.getAncestor(enclosingNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", true, false);
    ISearchScope hierarchyScope = BaseLanguageSearchUtil_new.createSuperClassesScope((ClassConcept)enclosingClass.getAdapter(), IClassifiersSearchScope.INSTANCE_METHOD);
    List methods = BaseAdapter.toNodes(BaseLanguageSearchUtil_new.getMethodsExcludingOverridden(hierarchyScope));
    return new SimpleSearchScope((List<SNode>)methods);
  }
  public String getNodeReferentSearchScopeDescription() {
    return "methods from hierarchy of super-class of enclosing class";
  }
}
