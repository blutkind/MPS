package jetbrains.mps.baseLanguage.stubs;

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
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.stubs.javastub.ASMModelLoader;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.stubs.javastub.classpath.StubHelper;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.workbench.actions.goTo.index.SNodeDescriptor;
import jetbrains.mps.baseLanguage.structure.BaseLanguage_Language;
import jetbrains.mps.project.structure.model.ModelRootManager;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.LanguageID;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.stubs.javastub.classpath.ClassifierKind;
import jetbrains.mps.baseLanguage.structure.Interface;
import jetbrains.mps.baseLanguage.structure.Annotation;
import jetbrains.mps.baseLanguage.structure.EnumClass;

public class JavaStubs extends BaseStubModelRootManager {
  public JavaStubs() {
  }

  protected Set<Language> getLanguagesToImport() {
    Set<String> moduleIds = SetSequence.fromSet(new HashSet<String>());

    moduleIds.add("f3061a53-9226-4cc5-a443-f952ceaf5816");

    Iterable<Language> languages = SetSequence.fromSet(moduleIds).select(new ISelector<String, Language>() {
      public Language select(String it) {
        return (Language) MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString(it));
      }
    });

    Set<Language> result = new HashSet<Language>();
    result.addAll(Sequence.fromIterable(languages).toListSequence());
    return result;
  }

  protected void updateModel(final StubLocation location, final SModel model) {
    IClassPathItem cpItem = JavaStubs.this.createClassPathItem(location);
    if (cpItem == null) {
      return;
    }
    new ASMModelLoader(cpItem, model) {
      public SModelReference getModelReferenceFor(String packageName) {
        return StubHelper.uidForPackageInStubs(packageName);
      }
    }.updateModel();
  }

  protected Set<BaseStubModelDescriptor> getModelDescriptors(final StubLocation location) {
    return JavaStubs.this.getModelDescriptorsInternal(location);
  }

  public Set<SNodeDescriptor> getRootNodeDescriptors(final StubLocation location) {
    Set<SNodeDescriptor> result = new jetbrains.mps.util.misc.hash.HashSet<SNodeDescriptor>();
    IClassPathItem item = JavaStubs.this.createClassPathItem(location);
    if (item != null) {
      JavaStubs.this.iterateClasspath(item, result, "");
    }
    return result;
  }

  private IClassPathItem createClassPathItem(StubLocation location) {
    return StubClassPathCache.getInstance().get(location);
  }

  private Set<BaseStubModelDescriptor> getModelDescriptorsInternal(StubLocation location) {
    String pack = location.getPrefix();
    IClassPathItem cpItem = JavaStubs.this.createClassPathItem(location);
    if (cpItem == null) {
      return new jetbrains.mps.util.misc.hash.HashSet<BaseStubModelDescriptor>();
    }

    Set<BaseStubModelDescriptor> result = new jetbrains.mps.util.misc.hash.HashSet<BaseStubModelDescriptor>();
    for (String subpackage : cpItem.getSubpackages(pack)) {
      if (!(cpItem.getAvailableClasses(subpackage).isEmpty())) {
        SModelReference modelReference = StubHelper.uidForPackageInStubs(subpackage);
        String moduleId = BaseLanguage_Language.MODULE_REFERENCE.getModuleId().toString();
        ModelRootManager manager = new ModelRootManager(moduleId, JavaStubs.this.getClass().getName());
        AbstractModule.StubPath sp = new AbstractModule.StubPath(location.getPath(), manager);
        if (SModelRepository.getInstance().getModelDescriptor(modelReference) != null) {
          SModelReference ref = SModelReference.fromString(subpackage + "@" + SModelStereotype.getStubStereotypeForId(LanguageID.JAVA));
          SModelDescriptor descriptor = SModelRepository.getInstance().getModelDescriptor(ref);
          assert descriptor instanceof BaseStubModelDescriptor;
          BaseStubModelDescriptor baseDescriptor = (BaseStubModelDescriptor) descriptor;
          baseDescriptor.addStubPath(sp);
          SModelRepository.getInstance().addOwnerForDescriptor(descriptor, location.getModule());
          result.add(baseDescriptor);
        } else {
          BaseStubModelDescriptor modelDescriptor = new BaseStubModelDescriptor(JavaStubs.this, null, modelReference);
          modelDescriptor.addStubPath(sp);
          result.add(modelDescriptor);
        }
      }
      result.addAll(JavaStubs.this.getModelDescriptorsInternal(new StubLocation(location.getPath(), subpackage, location.getModule())));
    }
    return result;
  }

  private void iterateClasspath(IClassPathItem item, Set<SNodeDescriptor> result, final String pack) {
    List<String> availableClasses = new ArrayList<String>();
    availableClasses.addAll(item.getAvailableClasses(pack));
    for (String cls : availableClasses) {
      if (cls.contains("$")) {
        continue;
      }
      byte[] content = item.getClass(("".equals(pack) ?
        cls :
        pack + "." + cls
      ));
      String conceptFqName = ClassConcept.concept;
      ClassifierKind kind = ClassifierKind.getClassifierKind(content);
      if (kind == ClassifierKind.CLASS) {
        conceptFqName = ClassConcept.concept;
      } else if (kind == ClassifierKind.INTERFACE) {
        conceptFqName = Interface.concept;
      } else if (kind == ClassifierKind.ANNOTATIONS) {
        conceptFqName = Annotation.concept;
      } else if (kind == ClassifierKind.ENUM) {
        conceptFqName = EnumClass.concept;
      } else if (kind == ClassifierKind.UNKNOWN) {
        continue;
      }
      result.add(new SNodeDescriptor(cls, conceptFqName, 0, 0, -1) {
        @Override
        protected SModelReference calculateModelReference() {
          return StubHelper.uidForPackageInStubs(pack);
        }
      });
    }
    for (String subpack : item.getSubpackages(pack)) {
      JavaStubs.this.iterateClasspath(item, result, subpack);
    }
  }
}
