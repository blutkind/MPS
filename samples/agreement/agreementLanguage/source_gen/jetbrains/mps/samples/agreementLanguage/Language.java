package jetbrains.mps.samples.agreementLanguage;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("144f7012-c2d5-43be-be2b-4bfb7dff6503(jetbrains.mps.samples.agreementLanguage)");

  public Language() {

  }

  public String getNamespace() {
    return "jetbrains.mps.samples.agreementLanguage";
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
    return TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "99486a30-6681-4388-952b-49b8af1fef48(agreementLanguage#1130266708218)"));
  }
}
