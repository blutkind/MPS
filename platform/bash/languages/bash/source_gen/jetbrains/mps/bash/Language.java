package jetbrains.mps.bash;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import jetbrains.mps.bash.constraints.ConstraintsAspectDescriptor;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import jetbrains.mps.bash.structure.StructureAspectDescriptor;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.bash.behavior.BehaviorAspectDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("4a1e4a24-105b-44ed-959c-6586fc957db3(jetbrains.mps.bash)");

  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "a9772ef0-5f51-48a7-8cb0-e217639912db(jetbrains.mps.bash#6382090206697067824)"));
  }

  public String getNamespace() {
    return "jetbrains.mps.bash";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return null;
  }

  @Override
  public BaseFindUsagesDescriptor getFindUsages() {
    return null;
  }

  public Collection<TemplateModule> getGenerators() {
    return generators;
  }

  @Override
  public DescriptorProvider<ConstraintsDescriptor> getConstraintsAspect() {
    return new ConstraintsAspectDescriptor();
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
