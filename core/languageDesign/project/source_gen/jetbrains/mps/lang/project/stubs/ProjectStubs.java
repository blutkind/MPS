package jetbrains.mps.lang.project.stubs;

/*Generated by MPS */

import jetbrains.mps.smodel.persistence.AbstractModelRootManager;
import java.util.Collection;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.library.ModulesMiner;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.stubs.util.FileStubSource;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModelId;

public class ProjectStubs extends AbstractModelRootManager {
  public ProjectStubs() {
  }

  public Collection<SModelDescriptor> load(@NotNull ModelRoot root, IModule module) {
    List<SModelDescriptor> models = ListSequence.fromList(new ArrayList<SModelDescriptor>());
    ListSequence.fromList(models).addSequence(Sequence.fromIterable(ProjectStubs.this.findModules(root.getPath(), module)));
    return models;
  }

  /*package*/ Iterable<BaseStubModelDescriptor> findModules(String path, final IModule module) {
    IFile folder = FileSystem.getInstance().getFileByPath(path);
    Iterable<ModulesMiner.ModuleHandle> descriptors = ModulesMiner.getInstance().collectModules(folder, false);
    final String stereotype = SModelStereotype.getStubStereotypeForId("project");
    return Sequence.fromIterable(descriptors).select(new ISelector<ModulesMiner.ModuleHandle, BaseStubModelDescriptor>() {
      public BaseStubModelDescriptor select(ModulesMiner.ModuleHandle it) {
        SModelReference modelRef = ProjectStubs.this.createModelReference(it, module, stereotype);
        BaseStubModelDescriptor descriptor = new BaseStubModelDescriptor(modelRef, false, new FileStubSource(it.getFile(), modelRef), module);
        return descriptor;
      }
    });
  }

  /*package*/ SModelReference createModelReference(ModulesMiner.ModuleHandle module, IModule moduleWithModel, String stereotype) {
    String longName = module.getDescriptor().getModuleReference().getModuleFqName();
    SModelFqName fqname = new SModelFqName(moduleWithModel.getModuleFqName(), longName, stereotype);
    SModelId modelId = SModelId.foreign(stereotype, moduleWithModel.getModuleReference().getModuleId().toString(), longName);
    return new SModelReference(fqname, modelId);
  }
}
