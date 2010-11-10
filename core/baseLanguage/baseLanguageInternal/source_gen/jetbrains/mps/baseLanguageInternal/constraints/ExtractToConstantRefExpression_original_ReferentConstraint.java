package jetbrains.mps.baseLanguageInternal.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.constraints.PresentationReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ExtractToConstantRefExpression_original_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public ExtractToConstantRefExpression_original_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguageInternal.structure.ExtractToConstantRefExpression", "original", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguageInternal.structure.ExtractToConstantRefExpression", "original");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return SNodeOperations.getDescendants(SNodeOperations.getContainingRoot(_context.getEnclosingNode()), "jetbrains.mps.baseLanguageInternal.structure.ExtractToConstantExpression", false, new String[]{});
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:1ce54900-c35b-4aa5-b24f-b47c871a6d6f(jetbrains.mps.baseLanguageInternal.constraints)", "99767819676013261");
  }

  public boolean hasPresentation() {
    return true;
  }

  public String getPresentation(final IOperationContext operationContext, final PresentationReferentConstraintContext _context) {
    return SPropertyOperations.getString(_context.getParameterNode(), "fieldName");
  }
}
