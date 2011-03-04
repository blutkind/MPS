package jetbrains.mps.platform.conf.constraints;

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
import jetbrains.mps.smodel.constraints.PresentationReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class BeanExtension_beanExtensionPoint_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public BeanExtension_beanExtensionPoint_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.platform.conf.structure.BeanExtension", "extensionPoint", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.platform.conf.structure.BeanExtension", "extensionPoint");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return Sequence.fromIterable(((Iterable<IModule>) operationContext.getScope().getVisibleModules())).<SModelDescriptor>translate(new ITranslator2<IModule, SModelDescriptor>() {
      public Iterable<SModelDescriptor> translate(IModule m) {
        return m.getOwnModelDescriptors();
      }
    }).where(new IWhereFilter<SModelDescriptor>() {
      public boolean accept(SModelDescriptor smd) {
        return !("java_stub".equals(smd.getStereotype()));
      }
    }).<SNode>translate(new ITranslator2<SModelDescriptor, SNode>() {
      public Iterable<SNode> translate(SModelDescriptor smd) {
        return SModelOperations.getNodes(((SModel) smd.getSModel()), "jetbrains.mps.platform.conf.structure.BeanExtensionPoint");
      }
    });
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:2fe958f4-f755-4faa-af2a-c5125dc0cfc1(jetbrains.mps.platform.conf.constraints)", "8515964913726225384");
  }

  public boolean hasPresentation() {
    return true;
  }

  public String getPresentation(final IOperationContext operationContext, final PresentationReferentConstraintContext _context) {
    return SPropertyOperations.getString(_context.getLinkTarget(), "name");
  }
}
