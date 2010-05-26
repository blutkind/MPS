package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tool.GeneratedTabbedTool;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.findusages.INavigateableTool;
import com.intellij.openapi.wm.ToolWindow;
import jetbrains.mps.ide.findusages.INavigator;
import javax.swing.JComponent;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.ide.findusages.UsagesViewTracker;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import javax.swing.Icon;
import jetbrains.mps.smodel.IOperationContext;
import javax.swing.JOptionPane;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.generator.GenerationSettings;
import jetbrains.mps.ide.findusages.model.SearchResults;
import com.intellij.openapi.vcs.checkin.CheckinHandler;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.lang.plugin.structure.IComponentDisposer;

public class ModelCheckerTool_Tool extends GeneratedTabbedTool {
  private Project myProject;
  private INavigateableTool myNavigateableTool = new INavigateableTool() {
    public int getPriority() {
      return 3;
    }

    public ToolWindow getToolWindow() {
      ModelCheckerTool_Tool.this.register();
      return ModelCheckerTool_Tool.this.getToolWindow();
    }

    public INavigator getCurrentNavigateableView() {
      JComponent component = ModelCheckerTool_Tool.this.getSelectedTab();
      assert component instanceof ModelCheckerViewer;
      return (ModelCheckerViewer) component;
    }
  };

  public ModelCheckerTool_Tool(Project project) {
    super(project, "Model Checker", -1, IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/modelChecker.png", "jetbrains.mps.ide"), true), ToolWindowAnchor.BOTTOM, true);
  }

  public void init(Project project) {
    super.init(project);
    ModelCheckerTool_Tool.this.myProject = project;
  }

  public void dispose() {
    super.dispose();
  }

  protected void doRegister() {
    UsagesViewTracker.register(ModelCheckerTool_Tool.this.myNavigateableTool);
  }

  protected void doUnregister() {
    UsagesViewTracker.unregister(ModelCheckerTool_Tool.this.myNavigateableTool);
  }

  private ModelCheckerViewer performCheckingTask(final List<SModelDescriptor> modelDescriptors, final String taskTargetTitle, final Icon taskIcon, IOperationContext operationContext, boolean showTab) {
    ModelCheckerViewer newViewer = ModelCheckerTool_Tool.this.createViewer(operationContext);
    newViewer.prepareAndCheck(modelDescriptors, taskTargetTitle, taskIcon);
    if (showTab) {
      if (newViewer.getSearchResults().getSearchResults().isEmpty()) {
        JOptionPane.showMessageDialog(ModelCheckerTool_Tool.this.getComponent(), "No problems found", "Not found", JOptionPane.INFORMATION_MESSAGE);
      } else {
        ModelCheckerTool_Tool.this.showTabWithResults(newViewer);
      }
    }
    return newViewer;
  }

  public ModelCheckerViewer checkModel(SModelDescriptor modelDescriptor, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.performCheckingTask(ModelCheckerUtils.getModelDescriptors(modelDescriptor), modelDescriptor.getName(), IconManager.getIconFor(modelDescriptor), operationContext, showTab);
  }

  public ModelCheckerViewer checkModels(List<SModelDescriptor> modelDescriptors, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.performCheckingTask(modelDescriptors, NameUtil.formatNumericalString(ListSequence.fromList(modelDescriptors).count(), "model"), Icons.MODEL_ICON, operationContext, showTab);
  }

  public ModelCheckerViewer checkModule(IModule module, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.performCheckingTask(ModelCheckerUtils.getModelDescriptors(module), module.getModuleFqName(), IconManager.getIconFor(module), operationContext, showTab);
  }

  public ModelCheckerViewer checkModules(List<IModule> modules, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.performCheckingTask(ModelCheckerUtils.getModelDescriptors(modules), NameUtil.formatNumericalString(ListSequence.fromList(modules).count(), "module"), Icons.MODULE_GROUP_CLOSED, operationContext, showTab);
  }

  public ModelCheckerViewer checkProject(Project project, IOperationContext operationContext, boolean showTab) {
    MPSProject mpsProject = project.getComponent(MPSProject.class);
    return ModelCheckerTool_Tool.this.performCheckingTask(ModelCheckerUtils.getModelDescriptors(mpsProject), mpsProject.getProjectDescriptor().getName(), Icons.PROJECT_ICON, operationContext, showTab);
  }

  public boolean checkModelsBeforeGenerationIfNeeded(IOperationContext operationContext, List<SModelDescriptor> modelDescriptors, Runnable regenerationRunnable) {
    boolean checkModels = ApplicationManager.getApplication().getComponent(GenerationSettings.class).isCheckModelsBeforeGeneration();
    if (!(checkModels)) {
      return true;
    }

    ModelCheckerViewer viewer = ModelCheckerTool_Tool.this.checkModels(modelDescriptors, operationContext, false);
    SearchResults<ModelCheckerIssue> issues = viewer.getSearchResults();

    int warnings = ModelCheckerUtils.getIssueCountForSeverity(issues, ModelChecker.SEVERITY_WARNING);
    int errors = ModelCheckerUtils.getIssueCountForSeverity(issues, ModelChecker.SEVERITY_ERROR);

    if (errors != 0) {
      CheckBeforeGenerationDialog dialog = new CheckBeforeGenerationDialog(ModelCheckerTool_Tool.this.myProject, errors, warnings);
      dialog.show();

      if (dialog.isOK()) {
        // review errors and warnings, don't generate 
        ModelCheckerTool_Tool.this.showTabWithResults(viewer);
        viewer.saveGenerationRunnable(regenerationRunnable);
        return false;
      } else {
        // ignore errors and warnings 
        return true;
      }
    }
    return true;
  }

  public CheckinHandler.ReturnResult checkModelsBeforeCommit(IOperationContext operationContext, List<SModelDescriptor> modelDescriptors) {
    ModelCheckerViewer viewer = ModelCheckerTool_Tool.this.checkModels(modelDescriptors, operationContext, false);
    SearchResults<ModelCheckerIssue> issues = viewer.getSearchResults();

    int warnings = ModelCheckerUtils.getIssueCountForSeverity(issues, ModelChecker.SEVERITY_WARNING);
    int errors = ModelCheckerUtils.getIssueCountForSeverity(issues, ModelChecker.SEVERITY_ERROR);

    if (errors != 0) {
      String dialogMessage = "Model checker found " + errors + " errors and " + warnings + " warnings. Would you like to review them?";
      int dialogAnswer = Messages.showDialog(operationContext.getProject(), dialogMessage, "Model Checking", new String[]{"Review", "Commit", "Cancel"}, 0, null);
      if (dialogAnswer == 0) {
        // review errors and warnings, don't commit 
        ModelCheckerTool_Tool.this.showTabWithResults(viewer);
        return CheckinHandler.ReturnResult.CLOSE_WINDOW;
      } else if (dialogAnswer == 1) {
        // ignore errors and warnings 
        return CheckinHandler.ReturnResult.COMMIT;
      } else if (dialogAnswer == 2 || dialogAnswer == -1) {
        // Cancel 
        return CheckinHandler.ReturnResult.CANCEL;
      }
    }
    return CheckinHandler.ReturnResult.COMMIT;
  }

  private ModelCheckerViewer createViewer(IOperationContext operationContext) {
    return new ModelCheckerViewer(ModelCheckerTool_Tool.this.myProject, operationContext) {
      protected void close() {
        ModelCheckerTool_Tool.this.closeTab(this);
      }
    };
  }

  private void showTabWithResults(ModelCheckerViewer viewer) {
    ModelCheckerTool_Tool.this.addTab(viewer, viewer.getTabTitle(), viewer.getTabIcon(), new IComponentDisposer<ModelCheckerViewer>() {
      public void disposeComponent(ModelCheckerViewer component) {
        component.dispose();
      }
    });
  }
}
