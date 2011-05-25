package jetbrains.mps.lang.script;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.lang.script.typesystem.TypesystemDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import jetbrains.mps.lang.script.structure.StructureAspectDescriptor;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.lang.script.behavior.BehaviorAspectDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("0eddeefa-c2d6-4437-bc2c-de50fd4ce470(jetbrains.mps.lang.script)");

  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "0e7e6e38-fc52-4859-a8a9-7c262a5ee452(jetbrains.mps.lang.script#1172274134493)"));
  }

  public String getNamespace() {
    return "jetbrains.mps.lang.script";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return new TypesystemDescriptor();
  }

  @Override
  public BaseFindUsagesDescriptor getFindUsages() {
    return null;
  }

  public Collection<TemplateModule> getGenerators() {
    return generators;
  }

  @Override
  public DescriptorProvider<StructureDescriptor> getStructureAspect() {
    return new StructureAspectDescriptor();
  }

  @Override
  public DescriptorProvider<BehaviorDescriptor> getBehaviorAspect() {
    return new BehaviorAspectDescriptor();
  }
}
