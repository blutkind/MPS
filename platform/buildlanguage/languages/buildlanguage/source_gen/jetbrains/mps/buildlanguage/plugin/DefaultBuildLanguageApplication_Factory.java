package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;

public class DefaultBuildLanguageApplication_Factory extends ConfigurationFactory {
  public DefaultBuildLanguageApplication_Factory(ConfigurationType type) {
    super(type);
  }

  public RunConfiguration createTemplateConfiguration(Project p) {
    return new DefaultBuildLanguageApplication_Configuration(p, this, "TemplateName");
  }

  public String getName() {
    return "Build Language Project";
  }
}
