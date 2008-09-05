package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class FindInstancesByConditionAndNode_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(FindInstancesByConditionAndNode_Action.class);
  public static final Icon ICON = null;

  public IOperationContext context;
  public SNode snode;
  public IModule langModule;

  public FindInstancesByConditionAndNode_Action() {
    super("Find Instances by condition", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return SNodeOperations.isInstanceOf(FindInstancesByConditionAndNode_Action.this.snode, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration");
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "FindInstancesByConditionAndNode", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.snode = event.getData(MPSDataKeys.SNODE);
    if (this.snode == null) {
      return false;
    }
    this.langModule = event.getData(MPSDataKeys.CONTEXT_MODULE);
    if (this.langModule == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      FindInstancesDialog testDialog = new FindInstancesDialog(new FindInstancesContext(FindInstancesByConditionAndNode_Action.this.context), (Language) FindInstancesByConditionAndNode_Action.this.langModule);
      testDialog.setConceptDeclaration(FindInstancesByConditionAndNode_Action.this.snode);
      testDialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "FindInstancesByConditionAndNode", t);
    }
  }

}
