package jetbrains.mps.baseLanguageInternal.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.runtime.impl.ProviderGeneratedSearchScope;

public class WeakConstantReference_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_d5zdlf_a0a2a0a0a1a0b0a1a1 = new SNodePointer("r:1ce54900-c35b-4aa5-b24f-b47c871a6d6f(jetbrains.mps.baseLanguageInternal.constraints)", "1585405235656398265");

  public WeakConstantReference_Constraints() {
    super("jetbrains.mps.baseLanguageInternal.structure.WeakConstantReference");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("className", new BasePropertyConstraintsDescriptor("className", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "className";
        return SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getContainingRoot(SLinkOperations.getTarget(node, "constant", false)), "jetbrains.mps.lang.core.structure.INamedConcept"), "name");
      }
    });
    return properties;
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("constant", new BaseReferenceConstraintsDescriptor("constant", this) {
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
            return SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration");
          }

          @Override
          public ISearchScope createSearchScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            return new ProviderGeneratedSearchScope(this, operationContext, _context) {
              public boolean isInScope(SNode checkedNode) {
                return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getReferenceNode(), "constant", false), "initializer", true) != null);
              }
            };
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_d5zdlf_a0a2a0a0a1a0b0a1a1;
          }
        };
      }
    });
    return references;
  }
}
