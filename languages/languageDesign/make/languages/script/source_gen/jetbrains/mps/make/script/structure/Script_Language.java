package jetbrains.mps.make.script.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Script_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("95f8a3e6-f994-4ca0-a65e-763c9bae2d3b(jetbrains.mps.make.script)");

  public static Language get() {
    return (Language) MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
