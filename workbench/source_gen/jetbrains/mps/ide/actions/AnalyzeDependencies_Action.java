package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.openapi.project.Project;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;
import jetbrains.mps.ide.dependencyViewer.Scope;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.nodeEditor.cells.EditorCell;

public class AnalyzeDependencies_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(AnalyzeDependencies_Action.class);

  public AnalyzeDependencies_Action() {
    super("Analyze Dependencies", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "AnalyzeDependencies", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("myModels", event.getData(MPSDataKeys.MODELS));
    MapSequence.fromMap(_params).put("myModules", event.getData(MPSDataKeys.MODULES));
    MapSequence.fromMap(_params).put("myMPSProject", event.getData(MPSDataKeys.MPS_PROJECT));
    MapSequence.fromMap(_params).put("myEditorComponent", event.getData(MPSDataKeys.EDITOR_COMPONENT));
    MapSequence.fromMap(_params).put("myModel", event.getData(MPSDataKeys.CONTEXT_MODEL));
    MapSequence.fromMap(_params).put("myProject", event.getData(MPSDataKeys.PROJECT));
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      AnalyzeDependencies_Tool tool = ((Project) MapSequence.fromMap(_params).get("myProject")).getComponent(ProjectPluginManager.class).getTool(AnalyzeDependencies_Tool.class);
      Scope scope = new Scope();
      if (((List<SModelDescriptor>) MapSequence.fromMap(_params).get("myModels")) != null) {
        for (SModelDescriptor model : ((List<SModelDescriptor>) MapSequence.fromMap(_params).get("myModels"))) {
          scope.add(model);
        }
      }
      if (((List<IModule>) MapSequence.fromMap(_params).get("myModules")) != null) {
        for (IModule module : ((List<IModule>) MapSequence.fromMap(_params).get("myModules"))) {
          scope.add(module);
        }
      }
      if (scope.isEmpty()) {
        SNode node = check_rkpdtm_a0a0e0a(check_rkpdtm_a0a0a4a0(((EditorComponent) MapSequence.fromMap(_params).get("myEditorComponent"))));
        if (node != null) {
          scope.add(node);
        }
      }
      if (scope.isEmpty()) {
        return;
      }
      tool.setContent(scope, ((MPSProject) MapSequence.fromMap(_params).get("myMPSProject")));
      tool.openToolLater(true);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "AnalyzeDependencies", t);
      }
    }
  }

  private static SNode check_rkpdtm_a0a0e0a(EditorCell checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getSNode();
    }
    return null;
  }

  private static EditorCell check_rkpdtm_a0a0a4a0(EditorComponent checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getRootCell();
    }
    return null;
  }
}
