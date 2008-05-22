package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class TypeVariableReference_typeVariableDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public TypeVariableReference_typeVariableDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.TypeVariableReference", "typeVariableDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.TypeVariableReference", "typeVariableDeclaration");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> declarations = new ArrayList<SNode>();
    for(SNode genericDeclaration : SNodeOperations.getAncestors(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.GenericDeclaration", true)) {
      ListSequence.fromList(declarations).addSequence(ListSequence.fromList(SLinkOperations.getTargets(genericDeclaration, "typeVariableDeclaration", true)));
    }
    return new SimpleSearchScope(declarations);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "type-variables declared in enclosing classifier";
  }

}
