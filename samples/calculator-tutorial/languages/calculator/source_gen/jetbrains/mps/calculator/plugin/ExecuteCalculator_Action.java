package jetbrains.mps.calculator.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.lang.reflect.Method;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ExecuteCalculator_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ExecuteCalculator_Action.class);

  private SNode calcNode;

  public ExecuteCalculator_Action() {
    super("Execute Calculator", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return ExecuteCalculator_Action.this.getMainMethod() != null;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ExecuteCalculator", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.calculator.structure.Calculator"))) {
          node = null;
        }
      }
      this.calcNode = node;
    }
    if (this.calcNode == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      try {
        final Method method = ExecuteCalculator_Action.this.getMainMethod();
        Thread thread = new Thread(new Runnable() {
          public void run() {
            try {
              String[] args = new String[0];
              method.invoke(null, new Object[]{args});
            } catch (Throwable e) {
              e.printStackTrace();
            }
          }
        });
        thread.start();
      } catch (Throwable e) {
        e.printStackTrace();
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ExecuteCalculator", t);
    }
  }

  private Class getCalcClass() {
    String className = SPropertyOperations.getString(ExecuteCalculator_Action.this.calcNode, "name");
    String fqClassName = SNodeOperations.getModel(ExecuteCalculator_Action.this.calcNode).getLongName() + "." + className;
    return SNodeOperations.getModel(ExecuteCalculator_Action.this.calcNode).getModelDescriptor().getModule().getClass(fqClassName);
  }

  private Method getMainMethod() {
    final Class c = ExecuteCalculator_Action.this.getCalcClass();
    if (c == null) {
      return null;
    }
    try {
      return c.getDeclaredMethod("main", new String[0].getClass());
    } catch (NoSuchMethodException e) {
      return null;
    }
  }
}
