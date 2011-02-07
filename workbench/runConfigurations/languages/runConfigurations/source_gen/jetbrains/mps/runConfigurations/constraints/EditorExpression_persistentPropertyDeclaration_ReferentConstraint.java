package jetbrains.mps.runConfigurations.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.runConfigurations.behavior.PersistentConfiguration_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EditorExpression_persistentPropertyDeclaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public EditorExpression_persistentPropertyDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.runConfigurations.structure.EditorExpression", "persistentPropertyDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.runConfigurations.structure.EditorExpression", "persistentPropertyDeclaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return ListSequence.fromList(PersistentConfiguration_Behavior.getContextPersistentProperties_223733852661818507(_context.getEnclosingNode())).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(it, "type", true), new EditorExpression_persistentPropertyDeclaration_ReferentConstraint.QuotationClass_wdxcx5_a1a0a0a0a0a2().createNode());
      }
    });
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:d6e5159c-3299-41f5-8a8a-81b5b79d5073(jetbrains.mps.runConfigurations.constraints)", "1252300412034435593");
  }

  public static class QuotationClass_wdxcx5_a1a0a0a0a0a2 {
    public QuotationClass_wdxcx5_a1a0a0a0a0a2() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.runConfigurations.structure.TemplatePersistentPropertyType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
