package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseRunConfig;
import com.intellij.util.xmlb.annotations.Tag;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.baseLanguage.plugin.ConfigRunParameters;
import com.intellij.execution.configurations.RunProfileState;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.Executor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ExecutionException;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.runners.ProgramRunner;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.execution.impl.ConsoleViewImpl;
import javax.swing.JComponent;
import java.util.List;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.execution.process.ProcessHandler;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.IModule;
import jetbrains.mps.baseLanguage.plugin.RunUtil;
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
    final StringBuilder error = new StringBuilder();
    {
      if (DefaultJUnit_Configuration.this.getStateObject().type != null) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.METHOD) {
              if (DefaultJUnit_Configuration.this.getStateObject().method == null) {
                error.append("method is not selected or does not exist").append("\n");
              }
            } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.NODE) {
              if (DefaultJUnit_Configuration.this.getStateObject().node == null) {
                error.append("node is not selected or does not exist").append("\n");
              }
            } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.MODEL) {
              if (DefaultJUnit_Configuration.this.getStateObject().model == null) {
                error.append("model is not selected or does not exist").append("\n");
              }
            } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.MODULE) {
              if (DefaultJUnit_Configuration.this.getStateObject().module == null) {
                error.append("module is not selected or does not exist").append("\n");
              }
            }
          }
        });
        if (DefaultJUnit_Configuration.this.getStateObject().type != JUnitRunTypes.PROJECT) {
          if (!(DefaultJUnit_Configuration.this.getStateObject().compileInMPS) && DefaultJUnit_Configuration.this.getStateObject().myParams != null && DefaultJUnit_Configuration.this.getStateObject().myParams.getMake()) {
            error.append("can't make").append("\n");
          }
        }
      }

      if (DefaultJUnit_Configuration.this.getStateObject().myParams == null) {
        DefaultJUnit_Configuration.this.getStateObject().myParams = new ConfigRunParameters(DefaultJUnit_Configuration.this.getStateObject().compileInMPS);
      }
      String paramsReport = DefaultJUnit_Configuration.this.getStateObject().myParams.getErrorReport();
      if (paramsReport != null) {
        error.append(paramsReport).append("\n");
      }
    }
    if (error.length() != 0) {
      throw new RuntimeConfigurationException(error.toString());
    }
  }

  public RunProfileState getState(@NotNull final Executor executor, @NotNull final ExecutionEnvironment environment) throws ExecutionException {
    return new RunProfileState() {
      @Nullable
      public ExecutionResult execute(Executor executor, @NotNull ProgramRunner runner) throws ExecutionException {
        Project project = MPSDataKeys.PROJECT.getData(environment.getDataContext());
        final ConsoleViewImpl consoleView = new ConsoleViewImpl(project, false);
        JComponent consoleComponent = null;
        Runnable consoleDispose = null;
        final List<AnAction> actions = ListSequence.fromList(new ArrayList<AnAction>());
        ProcessHandler handler = null;
        {
          final MPSProject mpsproject = MPSDataKeys.MPS_PROJECT.getData(environment.getDataContext());
          final JUnitTestViewComponent runComponent = new JUnitTestViewComponent(mpsproject, consoleView);
          final Wrappers._T<UnitTestRunner> testRunner = new Wrappers._T<UnitTestRunner>(null);
          try {
            testRunner.value = new UnitTestRunner(runComponent);
          } catch (NullPointerException npe) {
            npe.printStackTrace();
          }

          ListSequence.fromList(actions).addSequence(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<AnAction>(), consoleView.createConsoleActions())));
          consoleComponent = runComponent;
          consoleDispose = new Runnable() {
            public void run() {
              runComponent.dispose();
            }
          };

          final List<SNode> all = new ArrayList<SNode>();
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              if (DefaultJUnit_Configuration.this.getStateObject().type != null) {
                IOperationContext context = MPSDataKeys.OPERATION_CONTEXT.getData(environment.getDataContext());
                List<SNode> tests = new ArrayList<SNode>();
                List<SNode> methods = new ArrayList<SNode>();
                if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.METHOD) {
                  ListSequence.fromList(methods).addElement(TestRunUtil.getTestMethod(DefaultJUnit_Configuration.this.getStateObject().node, DefaultJUnit_Configuration.this.getStateObject().method));
                } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.NODE) {
                  ListSequence.fromList(tests).addElement(TestRunUtil.getTestNode(DefaultJUnit_Configuration.this.getStateObject().node));
                } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.MODEL) {
                  ListSequence.fromList(tests).addSequence(ListSequence.fromList(TestRunUtil.getModelTests(TestRunUtil.getModel(DefaultJUnit_Configuration.this.getStateObject().model))));
                } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.MODULE) {
                  ListSequence.fromList(tests).addSequence(ListSequence.fromList(TestRunUtil.getModuleTests(DefaultJUnit_Configuration.this.getStateObject().module)));
                } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.PROJECT) {
                  for (IModule projectModule : mpsproject.getModules()) {
                    ListSequence.fromList(tests).addSequence(ListSequence.fromList(TestRunUtil.getModuleTests(projectModule)));
                  }
                }
                runComponent.setTestCaseAndMethod(context, tests, methods);
                ListSequence.fromList(all).addSequence(ListSequence.fromList(tests));
                ListSequence.fromList(all).addSequence(ListSequence.fromList(methods));
              }
            }
          });
          if (DefaultJUnit_Configuration.this.getStateObject().myParams == null) {
            DefaultJUnit_Configuration.this.getStateObject().myParams = new ConfigRunParameters(DefaultJUnit_Configuration.this.getStateObject().compileInMPS);
          }
          if (DefaultJUnit_Configuration.this.getStateObject().myParams.getMake()) {
            RunUtil.makeBeforeRun(mpsproject, all);
          }
          testRunner.value.setConfigParameters(DefaultJUnit_Configuration.this.getStateObject().myParams);
          if (DefaultJUnit_Configuration.this.getStateObject().myParams != null && DefaultJUnit_Configuration.this.getStateObject().myParams.getUseAlternativeJRE()) {
            testRunner.value.setJavaHomePath(DefaultJUnit_Configuration.this.getStateObject().myParams.getAlternativeJRE());
          }

          final Wrappers._T<Process> process = new Wrappers._T<Process>();
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              process.value = testRunner.value.run(all);
            }
          });

          if (process.value != null) {
            JUnitProcessHandler processHandler = new JUnitProcessHandler(runComponent, runComponent.getConsole(), process.value);
            runComponent.onStart(processHandler);
            handler = processHandler;
          }
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
      MySettingsEditor.this.myComponent.reset(c);
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
      MySettingsEditor.this.myComponent.dispose();
    }
  }

  public static class MyState implements Cloneable {
    public String node;
    public String model;
    public String module;
    public String method;
    public boolean compileInMPS;
    public JUnitRunTypes type;
    public ConfigRunParameters myParams;

    public MyState() {
    }

    public Object clone() throws CloneNotSupportedException {
      DefaultJUnit_Configuration.MyState object = (DefaultJUnit_Configuration.MyState)super.clone();
      if (this.myParams != null) {
        object.myParams = (ConfigRunParameters)this.myParams.clone();
      }
      return object;
    }
  }
}
