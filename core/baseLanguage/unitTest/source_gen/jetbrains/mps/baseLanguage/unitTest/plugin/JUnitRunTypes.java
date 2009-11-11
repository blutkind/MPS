package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */


public enum JUnitRunTypes {
  METHOD(),
  NODE(),
  MODEL(),
  MODULE(),
  PROJECT();

  JUnitRunTypes() {
  }

  public static JUnitRunTypes getType(boolean isModule, boolean isModel, boolean isTest, boolean isMethod) {
    if (isModule) {
      return JUnitRunTypes.MODULE;
    } else if (isModel) {
      return JUnitRunTypes.MODEL;
    } else if (isTest) {
      return JUnitRunTypes.NODE;
    } else if (isMethod) {
      return JUnitRunTypes.METHOD;
    }
    return null;
  }
}
