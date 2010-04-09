package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseRunConfig;
import com.intellij.util.xmlb.annotations.Tag;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import com.intellij.execution.configurations.RunProfileState;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.Executor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ExecutionException;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.impl.ConsoleViewImpl;
import jetbrains.mps.debug.info.StacktraceUtil;
import jetbrains.mps.workbench.MPSDataKeys;
import javax.swing.JComponent;
import java.util.List;
import com.intellij.openapi.actionSystem.AnAction;
import java.util.ArrayList;
import com.intellij.execution.process.ProcessHandler;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.baseLanguage.util.plugin.run.ConfigRunParameters;
import com.intellij.openapi.util.Disposer;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.io.File;
import jetbrains.mps.buildlanguage.plugin.AntScriptRunner;
import jetbrains.mps.ide.actions.DefaultProcessHandler;
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
import java.util.Collections;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;

public class DefaultPackagingLanguageApplication_Configuration extends BaseRunConfig {
  @Tag(value = "state")
  private DefaultPackagingLanguageApplication_Configuration.MyState myState = new DefaultPackagingLanguageApplication_Configuration.MyState();

  public DefaultPackagingLanguageApplication_Configuration(Project p, ConfigurationFactory f, String name) {
    super(p, f, name);
  }

  public RunConfiguration clone() {
    try {
      DefaultPackagingLanguageApplication_Configuration result = ((DefaultPackagingLanguageApplication_Configuration) super.clone());
      result.myState = ((DefaultPackagingLanguageApplication_Configuration.MyState) this.myState.clone());
      return result;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
    final StringBuilder error = new StringBuilder();
    {
      String paramsReport = DefaultPackagingLanguageApplication_Configuration.this.getStateObject().myJavaRunParameters.getErrorReport();
      if (paramsReport != null) {
        error.append(paramsReport).append("\n");
      }
      final SNode node = new _FunctionTypes._return_P0_E0<SNode>() {
        public SNode invoke() {
          SNode snode;
          String errorReport;
          {
            Tuples._2<SNode, String> _tmp_xsfjxy_c0a0a2a1a1 = DefaultPackagingLanguageApplication_Configuration.this.checkNode();
            snode = _tmp_xsfjxy_c0a0a2a1a1._0();
            errorReport = _tmp_xsfjxy_c0a0a2a1a1._1();
          }
          if (snode == null) {
            error.append(errorReport).append("\n");
          }
          return snode;
        }
      }.invoke();
      ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.build.packaging.structure.INotBuildableComponent", false, new String[]{})).isEmpty();
    }
    if (error.length() != 0) {
      throw new RuntimeConfigurationException(error.toString());
    }
  }

  public RunProfileState getState(@NotNull final Executor executor, @NotNull final ExecutionEnvironment environment) throws ExecutionException {
    return new RunProfileState() {
      @Nullable
      public ExecutionResult execute(Executor executor, @NotNull ProgramRunner runner) throws ExecutionException {
        final ConsoleViewImpl consoleView = StacktraceUtil.createConsoleView(MPSDataKeys.PROJECT.getData(environment.getDataContext()));
        JComponent consoleComponent = null;
        Runnable consoleDispose = null;
        final List<AnAction> actions = ListSequence.fromList(new ArrayList<AnAction>());
        ProcessHandler handler = null;
        final SModelDescriptor currentModel = MPSDataKeys.CONTEXT_MODEL.getData(environment.getDataContext());
        final IOperationContext context = MPSDataKeys.OPERATION_CONTEXT.getData(environment.getDataContext());
        final Project project = MPSDataKeys.PROJECT.getData(environment.getDataContext());

        // user's execute code 
        final ConfigRunParameters javaRunParameters = DefaultPackagingLanguageApplication_Configuration.this.getStateObject().myJavaRunParameters.copy();
        final SNode node = DefaultPackagingLanguageApplication_Configuration.this.getNodeForExecution(environment.getProject(), (javaRunParameters).getMake());
        {
          // calculate parameter 

          ListSequence.fromList(actions).addSequence(ListSequence.fromList(new _FunctionTypes._return_P0_E0<List<AnAction>>() {
            public List<AnAction> invoke() {
              {
                final List<AnAction> actionsList = ListSequence.fromListAndArray(new ArrayList<AnAction>(), consoleView.createConsoleActions());
                return actionsList;
              }
            }
          }.invoke()));

          // create console component 
          consoleComponent = consoleView.getComponent();
          consoleDispose = new Runnable() {
            public void run() {
              Disposer.dispose(consoleView);
            }
          };

          final Wrappers._T<ExecutionException> ex = new Wrappers._T<ExecutionException>(null);
          // create process handler 
          handler = (ProcessHandler) new _FunctionTypes._return_P0_E2<Object, ExecutionException, ExecutionException>() {
            public Object invoke() throws ExecutionException, ExecutionException {
              try {
                final Wrappers._T<SNode> configuration = new Wrappers._T<SNode>();
                final Wrappers._boolean isSelectedByUser = new Wrappers._boolean();
                ModelAccess.instance().runReadAction(new Runnable() {
                  public void run() {
                    configuration.value = ListSequence.fromList(SLinkOperations.getTargets(node, "configuration", true)).first();
                    isSelectedByUser.value = ListSequence.fromList(SLinkOperations.getTargets(node, "configuration", true)).count() > 1;
                  }
                });
                if (isSelectedByUser.value) {
                  configuration.value = ConfigurationChooser.chooseConfiguration(node, configuration.value);
                }
                if (configuration.value == null) {
                  throw new ExecutionException("Configuration is not selected.");
                }
                File file = GenerateTextFromBuild.generate(configuration.value, currentModel, context, project, true);
                if (file == null) {
                  throw new ExecutionException("No executable file were generated.");
                }
                AntScriptRunner runner = new AntScriptRunner(javaRunParameters);
                Process process = runner.run(file);
                return new DefaultProcessHandler(consoleView, process, runner.getCommandString());
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

        final JComponent finalConsoleComponent = consoleComponent;
        final Runnable finalConsoleDispose = consoleDispose;
        final ProcessHandler finalHandler = handler;
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
    return new DefaultPackagingLanguageApplication_Configuration.MySettingsEditor();
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

  public DefaultPackagingLanguageApplication_Configuration.MyState getStateObject() {
    return this.myState;
  }

  public SNode getNode() {
    if (DefaultPackagingLanguageApplication_Configuration.this.getStateObject().modelId == null || DefaultPackagingLanguageApplication_Configuration.this.getStateObject().nodeId == null) {
      return null;
    }
    final Wrappers._T<SNode> node = new Wrappers._T<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        node.value = new SNodePointer(DefaultPackagingLanguageApplication_Configuration.this.getStateObject().modelId, DefaultPackagingLanguageApplication_Configuration.this.getStateObject().nodeId).getNode();
      }
    });
    return node.value;
  }

  public void setNode(final SNode node) {
    if (node == null) {
      DefaultPackagingLanguageApplication_Configuration.this.getStateObject().modelId = null;
      DefaultPackagingLanguageApplication_Configuration.this.getStateObject().nodeId = null;
      return;
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        DefaultPackagingLanguageApplication_Configuration.this.getStateObject().modelId = node.getModel().getModelDescriptor().getSModelReference().toString();
        DefaultPackagingLanguageApplication_Configuration.this.getStateObject().nodeId = node.getId();
      }
    });
  }

  private SNode getNodeForExecution(Project project, boolean make) {
    SNode node = DefaultPackagingLanguageApplication_Configuration.this.getNode();
    if (make) {
      RunUtil.makeBeforeRun(project, Collections.singletonList(node));
    }
    return node;
  }

  private Tuples._2<SNode, String> checkNode() {
    if (DefaultPackagingLanguageApplication_Configuration.this.getStateObject().modelId != null && DefaultPackagingLanguageApplication_Configuration.this.getStateObject().nodeId != null) {
      final Wrappers._T<SNode> node = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          node.value = DefaultPackagingLanguageApplication_Configuration.this.getNode();
        }
      });
      if ((node.value == null)) {
        return MultiTuple.<SNode,String>from((SNode) null, "node is not selected or does not exist");
      }
      return MultiTuple.<SNode,String>from(node.value, (String) null);
    } else {
      return MultiTuple.<SNode,String>from((SNode) null, "node is not selected");
    }
  }

  private static class MySettingsEditor extends SettingsEditor<DefaultPackagingLanguageApplication_Configuration> {
    private DefaultPackagingLanguageApplication_Editor myComponent = null;

    public MySettingsEditor() {
    }

    protected void resetEditorFrom(DefaultPackagingLanguageApplication_Configuration c) {
      MySettingsEditor.this.myComponent.reset(c);
    }

    protected void applyEditorTo(DefaultPackagingLanguageApplication_Configuration c) {
      MySettingsEditor.this.myComponent.apply(c);
    }

    @NotNull
    protected JComponent createEditor() {
      this.myComponent = new DefaultPackagingLanguageApplication_Editor();
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
      DefaultPackagingLanguageApplication_Configuration.MyState object = (DefaultPackagingLanguageApplication_Configuration.MyState) super.clone();
      if (this.myJavaRunParameters != null) {
        object.myJavaRunParameters = (ConfigRunParameters) this.myJavaRunParameters.clone();
      }
      return object;
    }
  }
}
