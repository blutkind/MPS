package jetbrains.mps.stubs.util;

/*Generated by MPS */

import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.IModule;
import java.util.Set;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModelId;
import jetbrains.mps.project.StubModelsResolver;
import jetbrains.mps.smodel.LanguageID;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelStereotype;

public class StubModelDescriptors {
  private String stubStereotype;
  private ModelRoot modelRoot;
  private IModule module;
  private boolean gwt;

  public StubModelDescriptors(String stereotype, ModelRoot mr, IModule module, boolean gwt) {
    this.stubStereotype = stereotype;
    this.modelRoot = mr;
    this.module = module;
    this.gwt = gwt;
  }

  public Set<BaseStubModelDescriptor> getDescriptors(_FunctionTypes._return_P1_E0<? extends PathItem, ? super String> getPathItem) {
    Set<BaseStubModelDescriptor> result = SetSequence.fromSet(new HashSet<BaseStubModelDescriptor>());
    collectDescriptors(modelRoot, getPathItem, result);
    return result;
  }

  private void collectDescriptors(ModelRoot loc, _FunctionTypes._return_P1_E0<? extends PathItem, ? super String> getPathItem, Set<BaseStubModelDescriptor> result) {
    String pkg = loc.getPrefix();
    if (pkg == null) {
      pkg = "";
    }
    PathItem pi = getPathItem.invoke(loc.getPath());
    for (String subpkg : ListSequence.fromList(pi.subpackages(pkg))) {
      if (ListSequence.fromList(pi.resources(subpkg)).isNotEmpty()) {
        SModelReference smref = smodelRefWithId(subpkg);
        SModelDescriptor descById = SModelRepository.getInstance().getModelDescriptor(smref);
        if (descById != null) {
          assert descById.getModule() == module;
          SetSequence.fromSet(result).addElement(((BaseStubModelDescriptor) descById));
        } else {
          BaseStubModelDescriptor desc = new BaseStubModelDescriptor(smref, (gwt ?
            new GWTStubsSource(loc) :
            new ConfStubSource(loc)
          ), module);
          SModelRepository.getInstance().registerModelDescriptor(desc, module);
          SetSequence.fromSet(result).addElement(desc);
        }
      }
      ModelRoot mr = new ModelRoot();
      mr.setPath(modelRoot.getPath());
      mr.setPrefix(subpkg);
      collectDescriptors(mr, getPathItem, result);
    }
  }

  public SModelReference smodelRefWithId(String pkg) {
    SModelFqName fqname = new SModelFqName(module.getModuleFqName(), pkg, stubStereotype);
    SModelId modelId = SModelId.foreign(stubStereotype, module.getModuleReference().getModuleId().toString(), pkg);
    return new SModelReference(fqname, modelId);
  }

  public SModelReference smodelRefWithFqName(String pkg) {
    return SModelReference.fromString(pkg + "@" + stubStereotype);
  }

  public SModelReference javaStubRef(String pkg) {
    Set<SModelReference> models = StubModelsResolver.getInstance().resolveModel(module, new SModelFqName(pkg, LanguageID.JAVA), null);
    SModelReference mr = (models.isEmpty() ?
      null :
      models.iterator().next()
    );
    ModuleReference moduleRef = (mr == null ?
      null :
      SModelRepository.getInstance().getModelDescriptor(mr).getModule().getModuleReference()
    );

    String mfq = "MPS.Classpath";
    String muid = "37a3367b-1fb2-44d8-aa6b-18075e74e003";


    if (moduleRef != null) {
      mfq = moduleRef.getModuleFqName();
      muid = moduleRef.getModuleId().toString();
    }
    String stereo = SModelStereotype.getStubStereotypeForId(LanguageID.JAVA);
    SModelFqName fqname = new SModelFqName(mfq, pkg, stereo);
    SModelId modelId = SModelId.foreign(stereo, muid, pkg);
    return new SModelReference(fqname, modelId);
  }
}
