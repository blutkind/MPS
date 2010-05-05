package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.generator.generationTypes.IGenerationHandler;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.transformation.TemplateLanguageGenerationUtil;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.generator.ModelGenerationStatusManager;
import jetbrains.mps.generator.NoCachesStrategy;

public class GenerateTemplateQueries_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GenerateTemplateQueries_Action.class);

  private Project project;
  private IModule module;
  private IOperationContext context;
  private boolean regenerate;

  public GenerateTemplateQueries_Action(boolean regenerate_par) {
    super("Generate Template Queries", "", ICON);
    this.regenerate = regenerate_par;
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
        String text = ((GenerateTemplateQueries_Action.this.regenerate ?
          "Regenerate" :
          "Generate"
        )) + " Generator";
        event.getPresentation().setText(text);
        GenerateTemplateQueries_Action.this.setEnabledState(event.getPresentation(), GenerateTemplateQueries_Action.this.module instanceof Generator);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GenerateTemplateQueries", t);
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
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.project = null;
    this.module = null;
    this.context = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      GeneratorManager manager = GenerateTemplateQueries_Action.this.context.getComponent(GeneratorManager.class);
      IGenerationHandler genHandler = manager.getDefaultGenerationHandler();
      final Wrappers._T<List<SModelDescriptor>> models = new Wrappers._T<List<SModelDescriptor>>(ListSequence.fromList(new ArrayList<SModelDescriptor>()));
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          ListSequence.fromList(models.value).addSequence(ListSequence.fromList(TemplateLanguageGenerationUtil.getGeneratorModels((Generator) GenerateTemplateQueries_Action.this.module)));
          if (!(GenerateTemplateQueries_Action.this.regenerate)) {
            models.value = ListSequence.fromList(models.value).where(new IWhereFilter<SModelDescriptor>() {
              public boolean accept(SModelDescriptor it) {
                return ModelGenerationStatusManager.getInstance().generationRequired(it, GenerateTemplateQueries_Action.this.project, NoCachesStrategy.createBuildCachesStrategy());
              }
            }).toListSequence();
          }
        }
      });
      manager.generateModelsWithProgressWindow(models.value, GenerateTemplateQueries_Action.this.context, genHandler, false);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GenerateTemplateQueries", t);
      }
    }
  }

  @NotNull
  public String getActionId() {
    StringBuilder res = new StringBuilder(500);
    res.append(GenerateTemplateQueries_Action.class.getName());
    res.append("#");
    res.append(((Object) this.regenerate).toString());
    res.append("!");
    return res.toString();
  }
}
