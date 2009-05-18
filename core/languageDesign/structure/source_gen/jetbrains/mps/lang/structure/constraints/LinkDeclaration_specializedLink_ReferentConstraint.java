package jetbrains.mps.lang.structure.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class LinkDeclaration_specializedLink_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {

  public LinkDeclaration_specializedLink_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.structure.structure.LinkDeclaration", "specializedLink", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.structure.structure.LinkDeclaration", "specializedLink");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    // links declared in hierarchy of enclosing concept.
    if (_context.getReferenceNode() == null) {
      return null;
    }
    final boolean aggregation = SPropertyOperations.hasValue(_context.getReferenceNode(), "metaClass", "aggregation", "reference");
    List<SNode> result = new ArrayList<SNode>();
    SNode enclosingConcept = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", true, false);
    List<SNode> directSupers = SConceptOperations.getDirectSuperConcepts(enclosingConcept, false);
    for(SNode concept : ListSequence.fromList(directSupers)) {
      List<SNode> links = AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(concept);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(links).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          if (aggregation) {
            return SPropertyOperations.hasValue(it, "metaClass", "aggregation", "reference");
          }
          return SPropertyOperations.hasValue(it, "metaClass", "reference", "reference");
        }
      }));
    }
    return result;
  }

}
