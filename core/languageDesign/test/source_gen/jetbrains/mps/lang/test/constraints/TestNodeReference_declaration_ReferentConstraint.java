package jetbrains.mps.lang.test.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNodePointer;

public class TestNodeReference_declaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public TestNodeReference_declaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.test.structure.TestNodeReference", "declaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.test.structure.TestNodeReference", "declaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    if (SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.test.structure.TestNode", false, false) != null) {
      return new ArrayList<SNode>();
    }
    SNode test = SNodeOperations.getAncestorWhereConceptInList(_context.getEnclosingNode(), new String[]{"jetbrains.mps.lang.test.structure.NodesTestCase", "jetbrains.mps.lang.test.structure.EditorTestCase"}, true, false);
    List<SNode> result = new ArrayList<SNode>();
    if (test != null) {
      for (SNode node : ListSequence.fromList(SNodeOperations.getDescendants(test, "jetbrains.mps.lang.test.structure.TestNodeAnnotation", true, new String[]{}))) {
        ListSequence.fromList(result).addElement(node);
      }
    }
    return result;
  }

  public SNodePointer getSearchScopeFactoryNodePointer() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c89590382(jetbrains.mps.lang.test.constraints)", "1213104844718");
  }
}
