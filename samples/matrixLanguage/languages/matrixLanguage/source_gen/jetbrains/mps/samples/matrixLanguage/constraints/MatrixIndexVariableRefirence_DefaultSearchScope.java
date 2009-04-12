package jetbrains.mps.samples.matrixLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class MatrixIndexVariableRefirence_DefaultSearchScope implements INodeReferentSearchScopeProvider {

  public MatrixIndexVariableRefirence_DefaultSearchScope() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeDefaultSearchScopeProvider("jetbrains.mps.samples.matrixLanguage.structure.MatrixIndexVariableRefirence", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeDefaultSearchScopeProvider("jetbrains.mps.samples.matrixLanguage.structure.MatrixIndexVariableRefirence");
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getEnclosingNode(), null, false);
    List<SNode> vars = ListOperations.<SNode>createList();
    for(SNode node : nodes) {
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.samples.matrixLanguage.structure.ForEachMatrixElement")) {
        ListSequence.fromList(vars).addElement(SLinkOperations.getTarget(((SNode)node), "column", true));
        ListSequence.fromList(vars).addElement(SLinkOperations.getTarget(((SNode)node), "row", true));
      }
    }
    SimpleSearchScope result = new SimpleSearchScope(vars);
    return result;
  }

}
