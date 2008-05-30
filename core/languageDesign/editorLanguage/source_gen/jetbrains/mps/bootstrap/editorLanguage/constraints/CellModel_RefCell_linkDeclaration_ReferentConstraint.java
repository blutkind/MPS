package jetbrains.mps.bootstrap.editorLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.constraints.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.bootstrap.structureLanguage.constraints.LinkDeclaration_Behavior;

public class CellModel_RefCell_linkDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSetEventHandler, INodeReferentSearchScopeProvider {

  public CellModel_RefCell_linkDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSetEventHandler("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell", "relationDeclaration", this);
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell", "relationDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSetEventHandler("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell", "relationDeclaration");
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell", "relationDeclaration");
  }

  public void processReferentSetEvent(SNode referenceNode, SNode oldReferentNode, SNode newReferentNode, IScope scope) {
    SLinkOperations.setTarget(SLinkOperations.getTarget(referenceNode, "editorComponent", true), "conceptDeclaration", SLinkOperations.getTarget(newReferentNode, "target", false), false);
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode editorComponent = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.bootstrap.editorLanguage.structure.BaseEditorComponent", true, false);
    SNode editedConcept = SLinkOperations.getTarget(editorComponent, "conceptDeclaration", false);
    List<SNode> links = AbstractConceptDeclaration_Behavior.call_getReferenceLinkDeclarations_1212184183122(editedConcept);
    return new SimpleSearchScope(ListSequence.fromList(links).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return LinkDeclaration_Behavior.call_isSingular_1205275061212(it);
      }

    }).toListSequence());
  }

  public String getNodeReferentSearchScopeDescription() {
    return "reference links declared in concept hierarchy and not overridden";
  }

}
