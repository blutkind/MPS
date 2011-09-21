package jetbrains.mps.baseLanguage.stubs;

/*Generated by MPS */

import jetbrains.mps.smodel.descriptor.source.StubModelDataSource;
import java.util.Set;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.BaseSModelDescriptor;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.ModelLoadingState;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.nodeidmap.ForeignNodeIdMap;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.baseLanguage.javastub.ASMModelLoader;
import java.util.Collection;
import jetbrains.mps.smodel.descriptor.NodeDescriptor;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.reloading.ClassPathFactory;
import java.io.File;
import java.io.IOException;

public class JavaStubModelDataSource extends StubModelDataSource {
  private boolean skipPrivate;
  private String langId;

  public JavaStubModelDataSource(String langId, boolean skipPrivate) {
    this.skipPrivate = skipPrivate;
    this.langId = langId;
  }

  protected Set<Language> getLanguagesToImport() {
    Set<String> moduleIds = SetSequence.fromSet(new HashSet());
    SetSequence.fromSet(moduleIds).addElement(MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString("f3061a53-9226-4cc5-a443-f952ceaf5816")).getModuleReference().getModuleId().toString());
    Iterable<Language> languages = SetSequence.fromSet(moduleIds).select(new ISelector<String, Language>() {
      public Language select(String it) {
        return ((Language) MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString(it)));
      }
    });
    return SetSequence.fromSetWithValues(new HashSet<Language>(), languages);
  }

  @Override
  public BaseSModelDescriptor.ModelLoadResult loadSModel(IModule module, SModelDescriptor descriptor, ModelLoadingState targetState) {
    SModel model = new SModel(descriptor.getSModelReference(), new ForeignNodeIdMap());
    model.setLoading(true);
    try {
      for (Language l : getLanguagesToImport()) {
        model.addLanguage(l.getModuleReference());
        module.addUsedLanguage(l.getModuleReference());
      }
      CompositeClassPathItem cp = this.createClassPath(descriptor);
      new ASMModelLoader(module, cp, model, langId, skipPrivate).updateModel();
    } finally {
      model.setLoading(false);
    }
    return new BaseSModelDescriptor.ModelLoadResult(model, ModelLoadingState.FULLY_LOADED);
  }

  public Collection<NodeDescriptor> getNodeDescriptors(SModelDescriptor model) {
    IClassPathItem item = createClassPath(model);
    if (item == null) {
      return new HashSet<NodeDescriptor>();
    }
    HashSet res = new HashSet();
    JavaStubsUtil.iterateClassPath(model.getModule().getModuleReference(), item, res, model.getLongName());
    return res;
  }

  private CompositeClassPathItem createClassPath(SModelDescriptor descriptor) {
    CompositeClassPathItem cp = new CompositeClassPathItem();
    for (String dir : getStubPaths()) {
      try {
        if (dir.indexOf("!") != -1) {
          cp.add(ClassPathFactory.getInstance().createFromPath(dir.substring(0, dir.indexOf("!")), this.getClass().getName()));
        } else {
          String name = descriptor.getSModelReference().getLongName().replaceAll("\\.", File.separator);
          dir = dir.substring(0, dir.indexOf(name));
          cp.add(ClassPathFactory.getInstance().createFromPath(dir, this.getClass().getName()));
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return cp;
  }
}
