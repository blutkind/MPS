package jetbrains.mps.samples.theSimplestLanguage;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("f8fecd49-3abe-4733-9741-0c637123d219(jetbrains.mps.samples.theSimplestLanguage)");

  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(new Generator());
  }

  public String getNamespace() {
    return "jetbrains.mps.samples.theSimplestLanguage";
  }

  public Collection<TemplateModule> getGenerators() {
    return generators;
  }
}
