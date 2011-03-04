package jetbrains.mps.gwt.client.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNodePointer;

public class Inherits_module_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public Inherits_module_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.gwt.client.structure.Inherits", "module", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.gwt.client.structure.Inherits", "module");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return Sequence.fromIterable(((Iterable<IModule>) operationContext.getScope().getVisibleModules())).<SModelDescriptor>translate(new ITranslator2<IModule, SModelDescriptor>() {
      public Iterable<SModelDescriptor> translate(IModule m) {
        return m.getOwnModelDescriptors();
      }
    }).where(new IWhereFilter<SModelDescriptor>() {
      public boolean accept(SModelDescriptor smd) {
        return "gwt_stub".equals(smd.getStereotype());
      }
    }).<SNode>translate(new ITranslator2<SModelDescriptor, SNode>() {
      public Iterable<SNode> translate(SModelDescriptor smd) {
        return SModelOperations.getNodes(((SModel) smd.getSModel()), "jetbrains.mps.gwt.client.structure.GWTModule");
      }
    });
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:89cc78ad-43cd-4987-b5dd-bcde38d4fbd9(jetbrains.mps.gwt.client.constraints)", "2309001323587048082");
  }
}
