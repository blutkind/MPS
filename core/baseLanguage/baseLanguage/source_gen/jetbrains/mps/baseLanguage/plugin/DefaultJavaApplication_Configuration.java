package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.util.xmlb.annotations.Tag;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;
import com.intellij.execution.configurations.RunProfileState;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.Executor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ExecutionException;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.runners.ProgramRunner;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import javax.swing.JComponent;
import java.util.List;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.execution.process.ProcessHandler;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.execution.process.DefaultJavaProcessHandler;
import java.nio.charset.Charset;
import com.intellij.execution.ui.ExecutionConsole;
import com.intellij.execution.configurations.RunnerSettings;
import com.intellij.execution.configurations.ConfigurationPerRunnerSettings;
import com.intellij.openapi.util.JDOMExternalizable;
import com.intellij.execution.configurations.ConfigurationInfoProvider;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.execution.configurations.RunConfiguration;
import org.jdom.Element;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.util.xmlb.XmlSerializer;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.ide.DataManager;

public class DefaultJavaApplication_Configuration extends RunConfigurationBase {

  @Tag(value = "state")
  private DefaultJavaApplication_Configuration.MyState myState = new DefaultJavaApplication_Configuration.MyState();

  public DefaultJavaApplication_Configuration(Project p, ConfigurationFactory f, String name) {
    super(p, f, name);
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
    StringBuilder error = new StringBuilder();
    {
      SNode node = new SNodePointer(DefaultJavaApplication_Configuration.this.getStateObject().myModelId, DefaultJavaApplication_Configuration.this.getStateObject().myNodeId).getNode();
      if (node == null) {
        error.append("node does not exist anymore").append("\n");
      }
    }
    if (error.length() != 0) {
      throw new RuntimeConfigurationException(error.toString());
    }
  }

  public RunProfileState getState(@NotNull() final Executor executor, @NotNull() final ExecutionEnvironment environment) throws ExecutionException {
    return new RunProfileState() {

      @Nullable()
      public ExecutionResult execute(Executor executor, @NotNull() ProgramRunner runner) throws ExecutionException {
        final Wrappers._T<JComponent> consoleComponent = new Wrappers._T<JComponent>();
        final Wrappers._T<Runnable> consoleDispose = new Wrappers._T<Runnable>(null);
        final List<AnAction> actions = ListSequence.fromList(new ArrayList<AnAction>());
        final Wrappers._T<ProcessHandler> handler = new Wrappers._T<ProcessHandler>(null);
        ModelAccess.instance().runReadAction(new Runnable() {

          public void run() {
            Project project = MPSDataKeys.PROJECT.getData(environment.getDataContext());
            final RunComponent runComponent = new RunComponent(project);

            consoleComponent.value = runComponent;
            consoleDispose.value = new Runnable() {

              public void run() {
                runComponent.dispose();
              }
            };

            ClassRunner classRunner = new ClassRunner(runComponent);
            SNode node = new SNodePointer(DefaultJavaApplication_Configuration.this.getStateObject().myModelId, DefaultJavaApplication_Configuration.this.getStateObject().myNodeId).getNode();

            assert node != null : "configuration is executed for null node";
            Process process = classRunner.run(node);
            handler.value = new DefaultJavaProcessHandler(process, "", Charset.defaultCharset());
          }
        });
        final JComponent finalConsoleComponent = consoleComponent.value;
        final Runnable finalConsoleDispose = consoleDispose.value;
        final ProcessHandler finalHandler = handler.value;
        return new ExecutionResult() {

          public ExecutionConsole getExecutionConsole() {
            return new ExecutionConsole() {

              public void dispose() {
                if (finalConsoleDispose == null) {
                  return;
                }
                finalConsoleDispose.run();
              }

              public JComponent getComponent() {
                return finalConsoleComponent;
              }

              public JComponent getPreferredFocusableComponent() {
                return finalConsoleComponent;
              }
            };
          }

          public AnAction[] getActions() {
            return ListSequence.fromList(actions).toGenericArray(AnAction.class);
          }

          public ProcessHandler getProcessHandler() {
            return finalHandler;
          }
        };
      }

      public RunnerSettings getRunnerSettings() {
        return null;
      }

      public ConfigurationPerRunnerSettings getConfigurationSettings() {
        return null;
      }
    };
  }

  public JDOMExternalizable createRunnerSettings(ConfigurationInfoProvider p0) {
    return null;
  }

  public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
    return new DefaultJavaApplication_Configuration.MySettingsEditor();
  }

  @Nullable()
  public SettingsEditor<JDOMExternalizable> getRunnerSettingsEditor(ProgramRunner p0) {
    return null;
  }

  public void writeExternal(Element e) throws WriteExternalException {
    e.addContent(XmlSerializer.serialize(this.myState));
  }

  public void readExternal(Element e) throws InvalidDataException {
    XmlSerializer.deserializeInto(this.myState, ((Element)e.getChildren().get(0)));
  }

  public DefaultJavaApplication_Configuration.MyState getStateObject() {
    return this.myState;
  }

  private static class MySettingsEditor extends SettingsEditor<DefaultJavaApplication_Configuration> {

    private ConfigEditor myComponent = null;

    public MySettingsEditor() {
    }

    protected void resetEditorFrom(DefaultJavaApplication_Configuration c) {
      SNode node = new SNodePointer(c.getStateObject().myModelId, c.getStateObject().myNodeId).getNode();
      if (node == null) {
        return;
      }
      MySettingsEditor.this.myComponent.setNode(node);
    }

    protected void applyEditorTo(final DefaultJavaApplication_Configuration c) {
      final SNode node = MySettingsEditor.this.myComponent.getNode();
      if (node == null) {
        return;
      }

      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          c.getStateObject().myNodeId = node.getId();
          c.getStateObject().myModelId = node.getModel().getModelDescriptor().getSModelReference().toString();
        }
      });
    }

    @NotNull()
    protected JComponent createEditor() {
      this.myComponent = new ConfigEditor(MPSDataKeys.MPS_PROJECT.getData(DataManager.getInstance().getDataContext()));
      return this.myComponent;
    }

    protected void disposeEditor() {
    }

}
  public static class MyState {

    public String myNodeId;
    public String myModelId;

    public MyState() {
    }
}

}
