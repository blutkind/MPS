package jetbrains.mps.lang.textGen.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class UtilityMethodDeclaration_DefaultSearchScope extends BaseNodeReferenceSearchScopeProvider {

  public UtilityMethodDeclaration_DefaultSearchScope() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeDefaultSearchScopeProvider("jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeDefaultSearchScopeProvider("jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> methods = new ArrayList<SNode>();
    SNode textGen = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.textGen.structure.LanguageTextGenDeclaration", false, false);
    if (textGen != null) {
      ListSequence.fromList(methods).addSequence(ListSequence.fromList(SLinkOperations.getTargets(textGen, "function", true)));
    }
    return methods;
  }

}
