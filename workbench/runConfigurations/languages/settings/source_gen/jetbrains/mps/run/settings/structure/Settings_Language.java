package jetbrains.mps.run.settings.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Settings_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("756e911c-3f1f-4a48-bdf5-a2ceb91b723c(jetbrains.mps.run.settings)");

  public static Language get() {
    return (Language) MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
