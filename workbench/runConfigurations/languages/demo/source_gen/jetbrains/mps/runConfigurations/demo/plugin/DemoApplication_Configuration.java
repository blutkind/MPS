package jetbrains.mps.runConfigurations.demo.plugin;

/*Generated by MPS */

import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.util.JDOMExternalizable;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.configurations.ConfigurationInfoProvider;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RunProfileState;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.Executor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.smodel.SNode;

public class DemoApplication_Configuration extends RunConfigurationBase {
  private DemoApplication_Configuration.MyState myState;

  public DemoApplication_Configuration(Project project, DemoApplication_Configuration_Factory factory, String name) {
    super(project, factory, name);
  }

  @Nullable
  public SettingsEditor<JDOMExternalizable> getRunnerSettingsEditor(ProgramRunner runner) {
    return null;
  }

  public JDOMExternalizable createRunnerSettings(ConfigurationInfoProvider provider) {
    return null;
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
  }

  public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
    return new DemoApplication_Configuration_Editor_Swing();
  }

  @Nullable
  public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {
    return new DemoApplication_Configuration_RunProfileState(this, executor, environment);
  }

  /*package*/ class MyState {
    private SNode node;

    public MyState() {
    }
  }
}
