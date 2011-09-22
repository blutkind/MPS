package jetbrains.mps.ui.constraints;

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
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ui.modeling.behavior.UIObject_Behavior;
import jetbrains.mps.internal.collections.runtime.ITranslator2;

public class AccessUIPropertyOperation_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_vhbj14_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:383ba4d2-f4ec-41a6-8e7f-108e84a7c9f9(jetbrains.mps.ui.constraints)", "1870423755832759853");

  public AccessUIPropertyOperation_Constraints() {
    super("jetbrains.mps.ui.structure.AccessUIPropertyOperation");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("property", new BaseReferenceConstraintsDescriptor("property", this) {
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
            SNode ot = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.as(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true));
            {
              IMatchingPattern pattern_vhbj14_b0a0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.ui.structure.UIObjectType");
              SNode coercedNode_vhbj14_b0a0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(ot, pattern_vhbj14_b0a0);
              if (coercedNode_vhbj14_b0a0 != null) {
                return Sequence.fromIterable(UIObject_Behavior.call_allExtends_8115675450774407592(SLinkOperations.getTarget(coercedNode_vhbj14_b0a0, "uiObject", false))).translate(new ITranslator2<SNode, SNode>() {
                  public Iterable<SNode> translate(SNode uio) {
                    return SLinkOperations.getTargets(uio, "property", true);
                  }
                });
              } else {
                return (Iterable<SNode>) null;
              }
            }
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_vhbj14_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
