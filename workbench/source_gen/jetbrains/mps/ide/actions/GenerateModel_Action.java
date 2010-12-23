package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.generator.generationTypes.IGenerationHandler;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.ArrayList;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;
import jetbrains.mps.ide.generator.GeneratorFacade;

public class GenerateModel_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GenerateModel_Action.class);

  private Project project;
  private IOperationContext context;
  private List<SModelDescriptor> models;
  private SModelDescriptor model;
  private IGenerationHandler generationHandler;
  private boolean rebuildAll;

  public GenerateModel_Action(IGenerationHandler generationHandler_par, boolean rebuildAll_par) {
    super("Generate Model", "", ICON);
    this.generationHandler = generationHandler_par;
    this.rebuildAll = rebuildAll_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        event.getPresentation().setText((GenerateModel_Action.this.rebuildAll ?
          "Regenerate Files" :
          GenerateModel_Action.this.generationHandler.toString()
        ));
        boolean applicable = ListSequence.fromList(GenerateModel_Action.this.getModels()).isNotEmpty();
        for (SModelDescriptor model : ListSequence.fromList(GenerateModel_Action.this.getModels())) {
          if (!(GenerateModel_Action.this.generationHandler.canHandle(model))) {
            applicable = false;
            break;
          }
        }
        GenerateModel_Action.this.setEnabledState(event.getPresentation(), applicable);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GenerateModel", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.models = event.getData(MPSDataKeys.MODELS);
    this.model = event.getData(MPSDataKeys.CONTEXT_MODEL);
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final List<SModelDescriptor> modelsToGenerate = new ArrayList<SModelDescriptor>();
      for (SModelDescriptor m : ListSequence.fromList(GenerateModel_Action.this.models)) {
        modelsToGenerate.add(m);
      }
      boolean checkSuccessful = GenerateModel_Action.this.project.getComponent(ProjectPluginManager.class).getTool(ModelCheckerTool_Tool.class).checkModelsBeforeGenerationIfNeeded(GenerateModel_Action.this.context, (List) modelsToGenerate, new Runnable() {
        public void run() {
          GeneratorFacade.getInstance().generateModels(GenerateModel_Action.this.context, modelsToGenerate, GenerateModel_Action.this.generationHandler, GenerateModel_Action.this.rebuildAll, false);
        }
      });
      if (!(checkSuccessful)) {
        return;
      }
      GeneratorFacade.getInstance().generateModels(GenerateModel_Action.this.context, modelsToGenerate, GenerateModel_Action.this.generationHandler, GenerateModel_Action.this.rebuildAll, false);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GenerateModel", t);
      }
    }
  }

  @NotNull
  public String getActionId() {
    StringBuilder res = new StringBuilder();
    res.append(super.getActionId());
    res.append("#");
    res.append(generationHandler_State((IGenerationHandler) this.generationHandler));
    res.append("!");
    res.append(((Object) this.rebuildAll).toString());
    res.append("!");
    return res.toString();
  }

  /*package*/ List<SModelDescriptor> getModels() {
    List<SModelDescriptor> result = ListSequence.fromList(new ArrayList<SModelDescriptor>());
    if (GenerateModel_Action.this.models != null) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(GenerateModel_Action.this.models));
    }
    if (ListSequence.fromList(result).isEmpty() && GenerateModel_Action.this.model != null) {
      ListSequence.fromList(result).addElement(GenerateModel_Action.this.model);
    }
    return result;
  }

  public static String generationHandler_State(IGenerationHandler object) {
    return object.toString();
  }
}
