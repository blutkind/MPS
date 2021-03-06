package jetbrains.mps.lang.dataFlow.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class LabelPosition_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_t9qyyi_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590377(jetbrains.mps.lang.dataFlow.constraints)", "1213104855809");

  public LabelPosition_Constraints() {
    super("jetbrains.mps.lang.dataFlow.structure.LabelPosition");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("label", new BaseReferenceConstraintsDescriptor("label", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider() {
          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            List<SNode> labels = new ArrayList<SNode>();
            SNode builder = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration", true, false);
            ListSequence.fromList(labels).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(builder, "jetbrains.mps.lang.dataFlow.structure.EmitLabelStatement", true, new String[]{})));
            return labels;
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_t9qyyi_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
