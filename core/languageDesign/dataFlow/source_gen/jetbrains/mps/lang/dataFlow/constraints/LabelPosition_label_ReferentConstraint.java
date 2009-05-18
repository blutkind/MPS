package jetbrains.mps.lang.dataFlow.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class LabelPosition_label_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {

  public LabelPosition_label_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.dataFlow.structure.LabelPosition", "label", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.dataFlow.structure.LabelPosition", "label");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> labels = new ArrayList<SNode>();
    SNode builder = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration", true, false);
    ListSequence.fromList(labels).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(builder, "jetbrains.mps.lang.dataFlow.structure.EmitLabelStatement", true)));
    return labels;
  }

}
