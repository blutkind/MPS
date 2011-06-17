package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;

public class BuildLanguageProject_Configuration_Factory extends ConfigurationFactory {
  public BuildLanguageProject_Configuration_Factory(Ant_Kind type) {
    super(type);
  }

  public RunConfiguration createTemplateConfiguration(Project project) {
    return new BuildLanguageProject_Configuration(project, this, "Template Configuration");
  }

  @Override
  public String getName() {
    return "Build Language Project";
  }
}
