package jetbrains.mps.baseLanguage.dates.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.constraints.PresentationReferentConstraintContext;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class PeriodPropertyFormatToken_property_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public PeriodPropertyFormatToken_property_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.dates.structure.PeriodPropertyFormatToken", "property", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.dates.structure.PeriodPropertyFormatToken", "property");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return DateFormatReferenceUtil.buildPeriodPropertySearchScope(_context.getEnclosingNode(), operationContext.getScope());
  }

  public boolean hasPresentation() {
    return true;
  }

  public String getPresentation(final IOperationContext operationContext, final PresentationReferentConstraintContext _context) {
    String name = (StringUtils.isNotEmpty(SPropertyOperations.getString(_context.getParameterNode(), "pluralForm")) ?
      SPropertyOperations.getString(_context.getParameterNode(), "pluralForm") :
      SPropertyOperations.getString(_context.getParameterNode(), "name")
    );
    return (_context.getSmartReference() ?
      "{" + name + "}" :
      name
    );
  }
}
