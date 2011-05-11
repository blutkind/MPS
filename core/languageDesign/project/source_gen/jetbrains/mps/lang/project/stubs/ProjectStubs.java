package jetbrains.mps.lang.project.stubs;

/*Generated by MPS */

import jetbrains.mps.stubs.BaseStubModelRootManager;
import java.util.Set;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.stubs.StubLocation;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.stubs.StubSource;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import jetbrains.mps.library.ModulesMiner;
import jetbrains.mps.project.structure.stub.ProjectStructureBuilder;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModelId;
import jetbrains.mps.project.SModelRoot;
import java.util.Collections;

public class ProjectStubs extends BaseStubModelRootManager {
  public ProjectStubs() {
  }

  protected Set<Language> getLanguagesToImport() {
    Set<String> moduleIds = SetSequence.fromSet(new HashSet<String>());

    moduleIds.add("86ef8290-12bb-4ca7-947f-093788f263a9");

    Iterable<Language> languages = SetSequence.fromSet(moduleIds).<Language>select(new ISelector<String, Language>() {
      public Language select(String it) {
        return (Language) MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString(it));
      }
    });

    Set<Language> result = new HashSet<Language>();
    result.addAll(Sequence.fromIterable(languages).toListSequence());
    return result;
  }

  protected void updateModel(final StubLocation location, final SModel model, final ModelDataSource source) {
  }

  protected Set<BaseStubModelDescriptor> getModelDescriptors(final StubLocation location) {
    Set<BaseStubModelDescriptor> models = SetSequence.fromSet(new HashSet<BaseStubModelDescriptor>());
    SetSequence.fromSet(models).addSequence(Sequence.fromIterable(ProjectStubs.this.findModules(location)));
    return models;
  }

  protected String getSelfModuleId() {
    return "86ef8290-12bb-4ca7-947f-093788f263a9";
  }

  /*package*/ Iterable<BaseStubModelDescriptor> findModules(final StubLocation location) {
    IFile folder = FileSystem.getInstance().getFileByPath(location.getPath());
    Iterable<ModulesMiner.ModuleHandle> descriptors = ModulesMiner.getInstance().collectModules(folder, false);
    final String stereotype = SModelStereotype.getStubStereotypeForId("project");
    return Sequence.fromIterable(descriptors).<BaseStubModelDescriptor>select(new ISelector<ModulesMiner.ModuleHandle, BaseStubModelDescriptor>() {
      public BaseStubModelDescriptor select(ModulesMiner.ModuleHandle it) {
        SModelReference modelRef = ProjectStubs.this.createModelReference(it, location, stereotype);
        BaseStubModelDescriptor descriptor = new BaseStubModelDescriptor(ProjectStubs.this, modelRef, new BaseStubModelDescriptor.FileStubSource(it.getFile()));
        return descriptor;
      }
    });
  }

  /*package*/ SModelReference createModelReference(ModulesMiner.ModuleHandle module, StubLocation location, String stereotype) {
    String longName = module.getDescriptor().getModuleReference().getModuleFqName();
    SModelFqName fqname = new SModelFqName(location.getModuleRef().getModuleFqName(), longName, stereotype);
    SModelId modelId = SModelId.foreign(stereotype, location.getModuleRef().getModuleId().toString(), longName);
    return new SModelReference(fqname, modelId);
  }

  private Iterable<SModelReference> loadModels(ModelRoot root) {
    try {
      SModelRoot sroot = new SModelRoot(root);
      return sroot.getManager().collectModels(sroot);
    } catch (Exception e) {
      return Collections.emptySet();
    }
  }
}
