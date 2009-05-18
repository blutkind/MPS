package jetbrains.mps.lang.smodel.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;

public class SEnum_MemberOperation_member_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {

  public SEnum_MemberOperation_member_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.SEnum_MemberOperation", "member", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.SEnum_MemberOperation", "member");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode enumNode = SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.lang.smodel.structure.SEnumOperationInvocation"), "enumDeclaration", false);
    if (enumNode != null) {
      return SLinkOperations.getTargets(enumNode, "member", true);
    }
    return new ArrayList<SNode>();
  }

}
