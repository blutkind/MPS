package jetbrains.mps.build.generictasks.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.build.generictasks.behavior.ITaskDeclaration_Behavior;
import jetbrains.mps.build.generictasks.behavior.AttributeDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class TaskCall_declaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints, INodeReferentSetEventHandler {
  public TaskCall_declaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSetEventHandler("jetbrains.mps.build.generictasks.structure.TaskCall", "declaration", this);
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.build.generictasks.structure.TaskCall", "declaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSetEventHandler("jetbrains.mps.build.generictasks.structure.TaskCall", "declaration");
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.build.generictasks.structure.TaskCall", "declaration");
  }

  public void processReferentSetEvent(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode, IScope scope) {
    for (SNode attrDecl : ITaskDeclaration_Behavior.call_getAttributesDeclarations_1190349257898147625(newReferentNode)) {
      if (AttributeDeclaration_Behavior.call_isRequired_353793545802643811(attrDecl)) {
        SNode attr = SConceptOperations.createNewNode("jetbrains.mps.build.generictasks.structure.Attribute", null);
        SLinkOperations.setTarget(attr, "attributeDeclaration", attrDecl, false);
        ListSequence.fromList(SLinkOperations.getTargets(referenceNode, "atributes", true)).addElement(attr);
      }
    }
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> declarations = SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.build.generictasks.structure.ITaskDeclaration");
    if (!(SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall"))) {
      return new DefaultSearchScope(ListSequence.fromList(declarations).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return ITaskDeclaration_Behavior.call_canBeRootTask_1449762848926780427(it);
        }
      })) {
        @Override
        public boolean isInScope(SNode node) {
          return SNodeOperations.isInstanceOf(node, "jetbrains.mps.build.generictasks.structure.ITaskDeclaration") && ITaskDeclaration_Behavior.call_canBeRootTask_1449762848926780427(SNodeOperations.cast(node, "jetbrains.mps.build.generictasks.structure.ITaskDeclaration"));
        }
      };
    }
    final List<SNode> nesteds = ITaskDeclaration_Behavior.call_getNestedTasks_4241383766070831847(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall"), "declaration", false));
    return new DefaultSearchScope(ITaskDeclaration_Behavior.call_getPossibleNesteds_1449762848926780436(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall"), "declaration", false), declarations)) {
      @Override
      public boolean isInScope(SNode node) {
        return SNodeOperations.isInstanceOf(node, "jetbrains.mps.build.generictasks.structure.ITaskDeclaration") && ITaskDeclaration_Behavior.call_isPossibleNested_1648602681640249389(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall"), "declaration", false), SNodeOperations.cast(node, "jetbrains.mps.build.generictasks.structure.ITaskDeclaration"), nesteds);
      }
    };
  }
}
