package jetbrains.mps.execution.configurations.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.debug.apiLang.structure.DebuggerConfiguration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ComplexRunConfigurationExecutor extends RunConfigurationExecutor {
  public static final String concept = "jetbrains.mps.execution.configurations.structure.ComplexRunConfigurationExecutor";
  public static final String CAN_DEBUG = "canDebug";
  public static final String DEBUGGER_CONFIGURATION = "debuggerConfiguration";

  public ComplexRunConfigurationExecutor(SNode node) {
    super(node);
  }

  public boolean getCanDebug() {
    return this.getBooleanProperty(ComplexRunConfigurationExecutor.CAN_DEBUG);
  }

  public void setCanDebug(boolean value) {
    this.setBooleanProperty(ComplexRunConfigurationExecutor.CAN_DEBUG, value);
  }

  public DebuggerConfiguration getDebuggerConfiguration() {
    return (DebuggerConfiguration) this.getChild(DebuggerConfiguration.class, ComplexRunConfigurationExecutor.DEBUGGER_CONFIGURATION);
  }

  public void setDebuggerConfiguration(DebuggerConfiguration node) {
    super.setChild(ComplexRunConfigurationExecutor.DEBUGGER_CONFIGURATION, node);
  }

  public static ComplexRunConfigurationExecutor newInstance(SModel sm, boolean init) {
    return (ComplexRunConfigurationExecutor) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.configurations.structure.ComplexRunConfigurationExecutor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ComplexRunConfigurationExecutor newInstance(SModel sm) {
    return ComplexRunConfigurationExecutor.newInstance(sm, false);
  }
}
