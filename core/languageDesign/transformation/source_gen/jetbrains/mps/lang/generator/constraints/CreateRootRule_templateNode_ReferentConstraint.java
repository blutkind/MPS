package jetbrains.mps.lang.generator.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.EmptySearchScope;
import java.util.List;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.util.CollectionUtil;

public class CreateRootRule_templateNode_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public CreateRootRule_templateNode_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.generator.structure.CreateRootRule", "templateNode", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.generator.structure.CreateRootRule", "templateNode");
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    Object searchScopeOrListOfNodes = this.createSearchScopeOrListOfNodes(operationContext, _context);
    if (searchScopeOrListOfNodes == null) {
      return new EmptySearchScope();
    }
    if (searchScopeOrListOfNodes instanceof ISearchScope) {
      return (ISearchScope)searchScopeOrListOfNodes;
    }
    if (searchScopeOrListOfNodes instanceof List) {
      return new SimpleSearchScope((List)searchScopeOrListOfNodes);
    }
    if (searchScopeOrListOfNodes instanceof Iterable) {
      return new SimpleSearchScope(CollectionUtil.iterableAsList((Iterable)searchScopeOrListOfNodes));
    }
    throw new RuntimeException("unexpected type in search-scope provider " + searchScopeOrListOfNodes.getClass());
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return new MappingRuleTemplateNodeSearchScope(_context.getModel(), operationContext.getScope());
  }

}
