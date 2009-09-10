package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseRunConfig;
import com.intellij.util.xmlb.annotations.Tag;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import com.intellij.execution.configurations.RunProfileState;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.Executor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ExecutionException;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.runners.ProgramRunner;
import javax.swing.JComponent;
import java.util.List;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.execution.process.ProcessHandler;
import jetbrains.mps.baseLanguage.plugin.RunParameters;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.plugin.RunComponent;
import jetbrains.mps.baseLanguage.plugin.BLProcessHandler;
import java.nio.charset.Charset;
import com.intellij.execution.ui.ExecutionConsole;
import com.intellij.execution.configurations.RunnerSettings;
import com.intellij.execution.configurations.ConfigurationPerRunnerSettings;
import com.intellij.openapi.util.JDOMExternalizable;
import com.intellij.execution.configurations.ConfigurationInfoProvider;
import com.intellij.openapi.options.SettingsEditor;
import org.jdom.Element;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.util.xmlb.XmlSerializer;
import com.intellij.openapi.util.InvalidDataException;

public class DefaultJUnit_Configuration extends BaseRunConfig {
  @Tag(value = "state")
  private DefaultJUnit_Configuration.MyState myState = new DefaultJUnit_Configuration.MyState();

  public DefaultJUnit_Configuration(Project p, ConfigurationFactory f, String name) {
    super(p, f, name);
  }

  public RunConfiguration clone() {
    try {
      DefaultJUnit_Configuration result = ((DefaultJUnit_Configuration)super.clone());
      result.myState = ((DefaultJUnit_Configuration.MyState)this.myState.clone());
      return result;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
    StringBuilder error = new StringBuilder();
    if (error.length() != 0) {
      throw new RuntimeConfigurationException(error.toString());
    }
  }

  public RunProfileState getState(@NotNull final Executor executor, @NotNull final ExecutionEnvironment environment) throws ExecutionException {
    return new RunProfileState() {
      @Nullable
      public ExecutionResult execute(Executor executor, @NotNull ProgramRunner runner) throws ExecutionException {
        JComponent consoleComponent;
        Runnable consoleDispose = null;
        final List<AnAction> actions = ListSequence.fromList(new ArrayList<AnAction>());
        ProcessHandler handler = null;
        {
          DefaultJUnit_Configuration.this.getStateObject().myParams = new RunParameters();
          final Wrappers._T<SNode> node = new Wrappers._T<SNode>();
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              node.value = new SNodePointer(DefaultJUnit_Configuration.this.getStateObject().model, DefaultJUnit_Configuration.this.getStateObject().node).getNode();
            }
          });
          Project project = MPSDataKeys.PROJECT.getData(environment.getDataContext());
          final RunComponent runComponent = new RunComponent(project);
          final UnitTestClassRunner testRunner = new UnitTestClassRunner(runComponent);
          testRunner.setRunParams(DefaultJUnit_Configuration.this.getStateObject().myParams);

          ListSequence.fromList(actions).addSequence(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<AnAction>(), runComponent.getConsoleView().createConsoleActions())));
          consoleComponent = runComponent;
          consoleDispose = new Runnable() {
            public void run() {
              runComponent.dispose();
            }
          };

          final Wrappers._T<Process> process = new Wrappers._T<Process>();
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              testRunner.runTest(node.value);
              process.value = testRunner.getProcess();
            }
          });

          handler = new BLProcessHandler(runComponent, process.value, "", Charset.defaultCharset());
        }
        final JComponent finalConsoleComponent = consoleComponent;
        final Runnable finalConsoleDispose = consoleDispose;
        final ProcessHandler finalHandler = handler;
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
    return new DefaultJUnit_Configuration.MySettingsEditor();
  }

  @Nullable
  public SettingsEditor<JDOMExternalizable> getRunnerSettingsEditor(ProgramRunner p0) {
    return null;
  }

  public void writeExternal(Element e) throws WriteExternalException {
    e.addContent(XmlSerializer.serialize(this.myState));
  }

  public void readExternal(Element e) throws InvalidDataException {
    XmlSerializer.deserializeInto(this.myState, ((Element)e.getChildren().get(0)));
  }

  public DefaultJUnit_Configuration.MyState getStateObject() {
    return this.myState;
  }

  private static class MySettingsEditor extends SettingsEditor<DefaultJUnit_Configuration> {
    private JUnitConfigEditor myComponent = null;

    public MySettingsEditor() {
    }

    protected void resetEditorFrom(DefaultJUnit_Configuration c) {
    }

    protected void applyEditorTo(DefaultJUnit_Configuration c) {
      MySettingsEditor.this.myComponent.apply(c);
    }

    @NotNull
    protected JComponent createEditor() {
      this.myComponent = new JUnitConfigEditor();
      return this.myComponent;
    }

    protected void disposeEditor() {
    }
  }

  public static class MyState implements Cloneable {
    public String node;
    public String model;
    public String module;
    public String method;
    public RunParameters myParams;

    public MyState() {
    }

    public Object clone() throws CloneNotSupportedException {
      return super.clone();
    }
  }
}
