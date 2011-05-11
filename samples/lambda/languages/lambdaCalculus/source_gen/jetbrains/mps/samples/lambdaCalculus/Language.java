package jetbrains.mps.samples.lambdaCalculus;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.samples.lambdaCalculus.typesystem.TypesystemDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("7c9e2807-94ad-4afc-adf0-aaee45eb2895(jetbrains.mps.samples.lambdaCalculus)");

  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "c390df68-d947-4830-b90c-05e33eb03b94(jetbrains.mps.samples.lambdaCalculus#391739495267435110)"));
  }

  public String getNamespace() {
    return "jetbrains.mps.samples.lambdaCalculus";
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
}
