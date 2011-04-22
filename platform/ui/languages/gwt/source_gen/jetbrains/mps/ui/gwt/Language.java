package jetbrains.mps.ui.gwt;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("e5c2a44a-6085-4aeb-a5b6-851cecd2d926(jetbrains.mps.ui.gwt)");

  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(new Generator());
  }

  public String getNamespace() {
    return "jetbrains.mps.ui.gwt";
  }

  public Collection<TemplateModule> getGenerators() {
    return generators;
  }
}
