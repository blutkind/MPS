package jetbrains.mps.project.newpl;

public class ModuleGeneratorConfiguration extends BaseGeneratorConfiguration{
  private String myModuleUID;

  public String getModuleUID() {
    return myModuleUID;
  }

  public void setModuleUID(String moduleUID) {
    myModuleUID = moduleUID;
  }
}
