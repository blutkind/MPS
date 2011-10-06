package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tool.GeneratedTabbedTool;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.findusages.INavigateableTool;
import com.intellij.openapi.wm.ToolWindow;
import jetbrains.mps.ide.findusages.INavigator;
import javax.swing.JComponent;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.ide.findusages.UsagesViewTracker;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.IOperationContext;
import javax.swing.JOptionPane;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.IModule;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.projectPane.Icons;
import java.util.ArrayList;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.generator.GenerationSettings;
import jetbrains.mps.ide.findusages.model.SearchResults;
import com.intellij.openapi.vcs.checkin.CheckinHandler;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.plugins.pluginparts.tool.IComponentDisposer;

public class ModelCheckerTool_Tool extends GeneratedTabbedTool {
  private static final Icon ICON = new ImageIcon(ModelCheckerTool_Tool.class.getResource("modelChecker.png"));

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
    super(project, "Model Checker", -1, ICON, ToolWindowAnchor.BOTTOM, true);
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

  private ModelCheckerViewer performCheckingTask(_FunctionTypes._void_P1_E0<? super ModelCheckerViewer> task, IOperationContext operationContext, boolean showTab) {
    ModelCheckerViewer newViewer = ModelCheckerTool_Tool.this.createViewer(operationContext);
    task.invoke(newViewer);
    if (showTab) {
      if (newViewer.getSearchResults().getSearchResults().isEmpty() && !(ModelCheckerSettings.getInstance().getMigrationMode())) {
        JOptionPane.showMessageDialog(ModelCheckerTool_Tool.this.getComponent(), "There were no problems detected during Model Checker execution", "Model Checker results", JOptionPane.INFORMATION_MESSAGE);
      } else {
        ModelCheckerTool_Tool.this.showTabWithResults(newViewer);
      }
    }
    return newViewer;
  }

  private ModelCheckerViewer performCheckingTaskForModels(final List<SModelDescriptor> modelDescriptors, final String taskTargetTitle, final Icon taskIcon, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.performCheckingTask(new _FunctionTypes._void_P1_E0<ModelCheckerViewer>() {
      public void invoke(ModelCheckerViewer newViewer) {
        newViewer.prepareAndCheckModels(modelDescriptors, taskTargetTitle, taskIcon);
      }
    }, operationContext, showTab);
  }

  private ModelCheckerViewer performCheckingTaskForModules(final List<IModule> modules, final String taskTargetTitle, final Icon taskIcon, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.performCheckingTask(new _FunctionTypes._void_P1_E0<ModelCheckerViewer>() {
      public void invoke(ModelCheckerViewer newViewer) {
        newViewer.prepareAndCheckModules(modules, taskTargetTitle, taskIcon);
      }
    }, operationContext, showTab);
  }

  public ModelCheckerViewer checkModel(SModelDescriptor modelDescriptor, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.performCheckingTaskForModels(ModelCheckerUtils.getModelDescriptors(modelDescriptor), modelDescriptor.getLongName(), IconManager.getIconFor(modelDescriptor), operationContext, showTab);
  }

  public ModelCheckerViewer checkModels(List<SModelDescriptor> modelDescriptors, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.performCheckingTaskForModels(modelDescriptors, NameUtil.formatNumericalString(ListSequence.fromList(modelDescriptors).count(), "model"), Icons.MODEL_ICON, operationContext, showTab);
  }

  public ModelCheckerViewer checkModels(final List<SModelDescriptor> modelDescriptors, IOperationContext operationContext, boolean showTab, final ModelCheckerIssueFinder finder) {
    return ModelCheckerTool_Tool.this.performCheckingTask(new _FunctionTypes._void_P1_E0<ModelCheckerViewer>() {
      public void invoke(ModelCheckerViewer newViewer) {
        newViewer.prepareAndCheckModels(modelDescriptors, ListSequence.fromList(modelDescriptors).count() + " models", Icons.MODEL_ICON, finder);
      }
    }, operationContext, showTab);
  }

  public ModelCheckerViewer checkModule(IModule module, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.performCheckingTaskForModules(ListSequence.fromListAndArray(new ArrayList<IModule>(), module), module.getModuleFqName(), IconManager.getIconFor(module), operationContext, showTab);
  }

  public ModelCheckerViewer checkModules(List<IModule> modules, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.performCheckingTaskForModules(modules, NameUtil.formatNumericalString(ListSequence.fromList(modules).count(), "module"), Icons.MODULE_GROUP_CLOSED, operationContext, showTab);
  }

  public ModelCheckerViewer checkProject(Project project, IOperationContext operationContext, boolean showTab) {
    MPSProject mpsProject = project.getComponent(MPSProject.class);
    return ModelCheckerTool_Tool.this.performCheckingTaskForModules(mpsProject.getModules(), mpsProject.getProjectDescriptor().getName(), Icons.PROJECT_ICON, operationContext, showTab);
  }

  public boolean checkModelsBeforeGenerationIfNeeded(IOperationContext operationContext, List<SModelDescriptor> modelDescriptors, Runnable regenerationRunnable) {
    boolean checkModels = GenerationSettings.getInstance().isCheckModelsBeforeGeneration();
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
        // avoid passing generation runnable here, there's rebuild button for that 
        viewer.saveGenerationRunnable(null);
        return false;
      } else {
        // ignore errors and warnings 
        return true;
      }
    }
    return true;
  }

  public void checkModelsAndRun(IOperationContext operationContext, List<SModelDescriptor> modelDescriptors, Runnable runnable) {
    if (ModelCheckerTool_Tool.this.checkModelsBeforeGenerationIfNeeded(operationContext, modelDescriptors, runnable)) {
      runnable.run();
    }
  }

  public CheckinHandler.ReturnResult checkModelsBeforeCommit(IOperationContext operationContext, List<SModelDescriptor> modelDescriptors) {
    ModelCheckerViewer viewer = ModelCheckerTool_Tool.this.checkModels(modelDescriptors, operationContext, false);
    SearchResults<ModelCheckerIssue> issues = viewer.getSearchResults();

    int warnings = ModelCheckerUtils.getIssueCountForSeverity(issues, ModelChecker.SEVERITY_WARNING);
    int errors = ModelCheckerUtils.getIssueCountForSeverity(issues, ModelChecker.SEVERITY_ERROR);

    if (errors != 0) {
      String dialogMessage = "Model checker found " + errors + " errors and " + warnings + " warnings. Would you like to review them?";
      int dialogAnswer = Messages.showDialog(operationContext.getIdeaProject(), dialogMessage, "Model Checking", new String[]{"Review", "Commit", "Cancel"}, 0, null);
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
