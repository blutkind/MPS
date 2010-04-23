package jetbrains.mps.samples.lambdaCalculus.plugin;

/*Generated by MPS */

import jetbrains.mps.lang.plugin.run.DefaultProcessHandler;
import jetbrains.mps.plugins.pluginparts.runconfigs.BaseRunConfig;
import com.intellij.util.xmlb.annotations.Tag;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.execution.configurations.RuntimeConfigurationError;
import jetbrains.mps.logging.Logger;
import com.intellij.execution.configurations.RunProfileState;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.Executor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.baseLanguage.runConfigurations.runtime.JavaRunProfileState;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.impl.ConsoleViewImpl;
import jetbrains.mps.debug.info.StacktraceUtil;
import jetbrains.mps.workbench.MPSDataKeys;
import javax.swing.JComponent;
import java.util.List;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.execution.process.ProcessHandler;
import jetbrains.mps.baseLanguage.util.plugin.run.ConfigRunParameters;
import com.intellij.execution.executors.DefaultDebugExecutor;
import jetbrains.mps.debug.DebuggerKeys;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import com.intellij.openapi.util.Disposer;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.baseLanguage.util.plugin.run.ClassRunner;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
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
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.baseLanguage.util.plugin.run.RunUtil;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;

public class DefaultLambdaCalculusProgram_Configuration extends BaseRunConfig {
  @Tag(value = "state")
  private DefaultLambdaCalculusProgram_Configuration.MyState myState = new DefaultLambdaCalculusProgram_Configuration.MyState();

  public DefaultLambdaCalculusProgram_Configuration(Project p, ConfigurationFactory f, String name) {
    super(p, f, name);
  }

  public RunConfiguration clone() {
    try {
      DefaultLambdaCalculusProgram_Configuration result = ((DefaultLambdaCalculusProgram_Configuration) super.clone());
      result.myState = ((DefaultLambdaCalculusProgram_Configuration.MyState) this.myState.clone());
      return result;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
    final StringBuilder error_22042010 = new StringBuilder();
    try {
      String paramsReport = DefaultLambdaCalculusProgram_Configuration.this.getStateObject().myJavaRunParameters.getErrorReport();
      if (paramsReport != null) {
        error_22042010.append(paramsReport).append("\n");
      }
      final SNode node;
      String errorReport;
      {
        Tuples._2<SNode, String> _tmp_2jrcro_e0a0b0b = DefaultLambdaCalculusProgram_Configuration.this.checkNode();
        node = _tmp_2jrcro_e0a0b0b._0();
        errorReport = _tmp_2jrcro_e0a0b0b._1();
      }
      if (node == null) {
        throw new RuntimeConfigurationException(errorReport);
      }
    } catch (Throwable t_22042010) {
      if (t_22042010 instanceof RuntimeConfigurationException) {
        throw (RuntimeConfigurationException) t_22042010;
      }
      if (t_22042010 instanceof RuntimeConfigurationError) {
        throw (RuntimeConfigurationError) t_22042010;
      }
      Logger.getLogger(DefaultLambdaCalculusProgram_Configuration.class).error(t_22042010);
    }
    if (error_22042010.length() != 0) {
      throw new RuntimeConfigurationException(error_22042010.toString());
    }
  }

  public RunProfileState getState(@NotNull final Executor executor, @NotNull final ExecutionEnvironment environment) throws ExecutionException {
    return new JavaRunProfileState() {
      @Nullable
      public ExecutionResult execute(Executor executor, @NotNull ProgramRunner runner) throws ExecutionException {
        final ConsoleViewImpl consoleView_22042010 = StacktraceUtil.createConsoleView(MPSDataKeys.PROJECT.getData(environment.getDataContext()));
        JComponent consoleComponent_22042010 = null;
        Runnable consoleDispose_22042010 = null;
        final List<AnAction> actions_22042010 = ListSequence.fromList(new ArrayList<AnAction>());
        ProcessHandler handler_22042010 = null;

        // user's execute code 
        try {
          final ConfigRunParameters javaRunParameters = DefaultLambdaCalculusProgram_Configuration.this.getStateObject().myJavaRunParameters.copy();
          // add debug arguments if runned under debug 
          if (executor.getId().equals(DefaultDebugExecutor.EXECUTOR_ID)) {
            String args = this.getUserData(DebuggerKeys.CONNECTION_SETTINGS);
            String oldVmParams = javaRunParameters.getVMParameters();
            if (StringUtils.isNotEmpty(oldVmParams)) {
              oldVmParams += " ";
            } else {
              oldVmParams = "";
            }
            javaRunParameters.setVMParameters(oldVmParams + args);
          }
          final SNode node = DefaultLambdaCalculusProgram_Configuration.this.getNodeForExecution(environment.getProject(), (javaRunParameters).getMake());
          {
            // calculate parameter 

            ListSequence.fromList(actions_22042010).addSequence(ListSequence.fromList(new _FunctionTypes._return_P0_E0<List<AnAction>>() {
              public List<AnAction> invoke() {
                {
                  final List<AnAction> actionsList = ListSequence.fromListAndArray(new ArrayList<AnAction>(), consoleView_22042010.createConsoleActions());
                  return actionsList;
                }
              }
            }.invoke()));

            // create console component 
            consoleComponent_22042010 = consoleView_22042010.getComponent();
            consoleDispose_22042010 = new Runnable() {
              public void run() {
                Disposer.dispose(consoleView_22042010);
              }
            };

            final Wrappers._T<ExecutionException> ex = new Wrappers._T<ExecutionException>(null);
            // create process handler 
            handler_22042010 = (ProcessHandler) new _FunctionTypes._return_P0_E0<Object>() {
              public Object invoke() {
                try {
                  ClassRunner classRunner = new ClassRunner(javaRunParameters);
                  final Wrappers._T<String> className = new Wrappers._T<String>();
                  ModelAccess.instance().runReadAction(new Runnable() {
                    public void run() {
                      className.value = INamedConcept_Behavior.call_getFqName_1213877404258(node);
                    }
                  });
                  Process process = classRunner.run(node, className.value);
                  return new DefaultProcessHandler(consoleView_22042010, process, classRunner.getCommandString());
                } catch (ExecutionException e) {
                  ex.value = e;
                  return null;
                }
              }
            }.invoke();
            if (ex.value != null) {
              throw ex.value;
            }
          }
        } catch (ExecutionException e) {
          throw e;
        } catch (Throwable t) {
          Logger.getLogger(DefaultLambdaCalculusProgram_Configuration.class).error(t);
          throw new ExecutionException("Execution code threw an exception: " + t.getMessage(), t);
        }

        final JComponent finalConsoleComponent = consoleComponent_22042010;
        final Runnable finalConsoleDispose = consoleDispose_22042010;
        final ProcessHandler finalHandler = handler_22042010;
        if (finalHandler == null) {
          return null;
        }
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
            return ListSequence.fromList(actions_22042010).toGenericArray(AnAction.class);
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
    return new DefaultLambdaCalculusProgram_Configuration.MySettingsEditor();
  }

  @Nullable
  public SettingsEditor<JDOMExternalizable> getRunnerSettingsEditor(ProgramRunner p0) {
    return null;
  }

  public void writeExternal(Element e) throws WriteExternalException {
    e.addContent(XmlSerializer.serialize(this.myState));
  }

  public void readExternal(Element e) throws InvalidDataException {
    XmlSerializer.deserializeInto(this.myState, ((Element) e.getChildren().get(0)));
  }

  public DefaultLambdaCalculusProgram_Configuration.MyState getStateObject() {
    return this.myState;
  }

  public boolean isDebuggable() {
    return true;
  }

  public SNode getNode() {
    if (DefaultLambdaCalculusProgram_Configuration.this.getStateObject().modelId == null || DefaultLambdaCalculusProgram_Configuration.this.getStateObject().nodeId == null) {
      return null;
    }
    final Wrappers._T<SNode> node = new Wrappers._T<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        node.value = new SNodePointer(DefaultLambdaCalculusProgram_Configuration.this.getStateObject().modelId, DefaultLambdaCalculusProgram_Configuration.this.getStateObject().nodeId).getNode();
      }
    });
    return node.value;
  }

  public void setNode(final SNode node) {
    if (node == null) {
      DefaultLambdaCalculusProgram_Configuration.this.getStateObject().modelId = null;
      DefaultLambdaCalculusProgram_Configuration.this.getStateObject().nodeId = null;
      return;
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        DefaultLambdaCalculusProgram_Configuration.this.getStateObject().modelId = node.getModel().getModelDescriptor().getSModelReference().toString();
        DefaultLambdaCalculusProgram_Configuration.this.getStateObject().nodeId = node.getId();
      }
    });
  }

  private SNode getNodeForExecution(Project project, boolean make) {
    SNode node = DefaultLambdaCalculusProgram_Configuration.this.getNode();
    if (make) {
      RunUtil.makeBeforeRun(project, node);
    }
    return node;
  }

  private Tuples._2<SNode, String> checkNode() {
    if (DefaultLambdaCalculusProgram_Configuration.this.getStateObject().modelId != null && DefaultLambdaCalculusProgram_Configuration.this.getStateObject().nodeId != null) {
      final SNode node = ModelAccess.instance().runReadAction(new Computable<SNode>() {
        public SNode compute() {
          return DefaultLambdaCalculusProgram_Configuration.this.getNode();
        }
      });
      if ((node == null)) {
        return MultiTuple.<SNode,String>from((SNode) null, "node is not selected or does not exist");
      }
      return MultiTuple.<SNode,String>from(node, (String) null);
    } else {
      return MultiTuple.<SNode,String>from((SNode) null, "node is not selected");
    }
  }

  private static class MySettingsEditor extends SettingsEditor<DefaultLambdaCalculusProgram_Configuration> {
    private DefaultLambdaCalculusProgram_Editor myComponent = null;

    public MySettingsEditor() {
    }

    protected void resetEditorFrom(DefaultLambdaCalculusProgram_Configuration c) {
      MySettingsEditor.this.myComponent.reset(c);
      final ConfigRunParameters javaRunParameters = c.getStateObject().myJavaRunParameters;
    }

    protected void applyEditorTo(DefaultLambdaCalculusProgram_Configuration c) {
      MySettingsEditor.this.myComponent.apply(c);
      final ConfigRunParameters javaRunParameters = c.getStateObject().myJavaRunParameters;
    }

    @NotNull
    protected JComponent createEditor() {
      this.myComponent = new DefaultLambdaCalculusProgram_Editor();
      return this.myComponent;
    }

    protected void disposeEditor() {
      MySettingsEditor.this.myComponent.dispose();
    }
  }

  public static class MyState implements Cloneable {
    public ConfigRunParameters myJavaRunParameters = new ConfigRunParameters();
    public String nodeId;
    public String modelId;

    public MyState() {
    }

    public Object clone() throws CloneNotSupportedException {
      DefaultLambdaCalculusProgram_Configuration.MyState object = (DefaultLambdaCalculusProgram_Configuration.MyState) super.clone();
      if (this.myJavaRunParameters != null) {
        object.myJavaRunParameters = (ConfigRunParameters) this.myJavaRunParameters.clone();
      }
      return object;
    }
  }
}
