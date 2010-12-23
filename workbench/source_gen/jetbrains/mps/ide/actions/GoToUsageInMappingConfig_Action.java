package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.generator.plugin.actions.MappingConfigFinder;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.findusages.model.SearchQuery;

public class GoToUsageInMappingConfig_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GoToUsageInMappingConfig_Action.class);

  private Project project;
  private IModule module;
  private SNode node;

  public GoToUsageInMappingConfig_Action() {
    super("Go to Mapping Config", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    if (!(SModelStereotype.isGeneratorModel(SNodeOperations.getModel(GoToUsageInMappingConfig_Action.this.node)))) {
      return false;
    }
    if ((SNodeOperations.getContainingRoot(GoToUsageInMappingConfig_Action.this.node) == null)) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(SNodeOperations.getContainingRoot(GoToUsageInMappingConfig_Action.this.node), "jetbrains.mps.lang.generator.structure.MappingConfiguration")) {
      return false;
    }
    if (!(GoToUsageInMappingConfig_Action.this.module instanceof Generator)) {
      return false;
    }
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GoToUsageInMappingConfig", t);
      }
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
      }
      this.node = node;
    }
    if (this.node == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      MappingConfigFinder finder = new MappingConfigFinder(((Generator) GoToUsageInMappingConfig_Action.this.module), SNodeOperations.getContainingRoot(GoToUsageInMappingConfig_Action.this.node));
      GoToUsageInMappingConfig_Action.this.project.getComponent(UsagesViewTool.class).findUsages(FindUtils.makeProvider(finder), new SearchQuery(null), false, false, false, "No usages found");
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GoToUsageInMappingConfig", t);
      }
    }
  }
}
