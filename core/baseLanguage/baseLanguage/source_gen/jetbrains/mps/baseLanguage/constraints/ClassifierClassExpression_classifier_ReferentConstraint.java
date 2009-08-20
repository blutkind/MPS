package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.baseLanguage.search.VisibleClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.smodel.constraints.PresentationReferentConstraintContext;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;

public class ClassifierClassExpression_classifier_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public ClassifierClassExpression_classifier_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", "classifier", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", "classifier");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return new VisibleClassifiersScope(_context.getModel(), IClassifiersSearchScope.CLASSIFFIER, operationContext.getScope());
  }

  public boolean hasPresentation() {
    return true;
  }

  public String getPresentation(final IOperationContext operationContext, final PresentationReferentConstraintContext _context) {
    String nameInContext = Classifier_Behavior.call_getNestedNameInContext_8540045600162183880(_context.getParameterNode(), _context.getEnclosingNode());
    if (_context.getSmartReference()) {
      return nameInContext + ".class";
    }
    return nameInContext;
  }
}
