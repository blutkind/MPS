package jetbrains.mps.build.ant;

/*Generated by MPS */

import jetbrains.mps.MPSCore;
import jetbrains.mps.typesystem.MPSTypesystem;
import jetbrains.mps.generator.MPSGenerator;
import jetbrains.mps.baseLanguage.search.MPSBaseLanguage;

public class MpsPlatform {
  private MpsPlatform() {
  }

  public static void init() {
    MPSCore.getInstance().init();
    MPSTypesystem.getInstance().init();
    MPSGenerator.getInstance().init();
    MPSBaseLanguage.getInstance().init();
  }

  public static void dispose() {
    MPSBaseLanguage.getInstance().dispose();
    MPSGenerator.getInstance().dispose();
    MPSTypesystem.getInstance().dispose();
    MPSCore.getInstance().dispose();
  }
}
