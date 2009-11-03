package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.MPSProject;
import java.awt.Frame;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.findusages.view.optionseditor.FindUsagesOptions;
import jetbrains.mps.ide.findusages.view.optionseditor.FindUsagesDialog;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.view.optionseditor.options.ViewOptions;
import jetbrains.mps.ide.findusages.view.optionseditor.options.FindersOptions;
import jetbrains.mps.ide.findusages.view.optionseditor.options.ScopeOptions;
import jetbrains.mps.ide.findusages.view.optionseditor.DefaultSearchOptionsComponent;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;

public class FindSpecificNodeUsages_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/usages.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(FindSpecificNodeUsages_Action.class);

  private MPSProject project;
  private Frame frame;
  private IOperationContext context;
  private SModelDescriptor model;
  private EditorCell cell;
  private SNode node;

  public FindSpecificNodeUsages_Action() {
    super("Find Usages", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "alt F7";
  }

  public boolean isApplicable(AnActionEvent event) {
    return FindSpecificNodeUsages_Action.this.getTool() != null && FindSpecificNodeUsages_Action.this.getOptionsComponent() != null;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "FindSpecificNodeUsages", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
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
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.CONTEXT_MODEL);
    if (this.model == null) {
      return false;
    }
    this.cell = event.getData(MPSDataKeys.EDITOR_CELL);
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      // get node 
      final Wrappers._T<SNode> operationNode = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          operationNode.value = (FindSpecificNodeUsages_Action.this.cell == null ?
            FindSpecificNodeUsages_Action.this.node :
            FindSpecificNodeUsages_Action.this.cell.getSNodeWRTReference()
          );
        }
      });
      // show dialog 
      final Wrappers._T<FindUsagesOptions> options = new Wrappers._T<FindUsagesOptions>(FindSpecificNodeUsages_Action.this.getOptionsComponent().getDefaultSearchOptions());
      FindUsagesDialog dialog = new FindUsagesDialog(options.value, operationNode.value, FindSpecificNodeUsages_Action.this.project, FindSpecificNodeUsages_Action.this.frame);
      dialog.showDialog();
      if (dialog.isCancelled()) {
        return;
      }
      options.value = dialog.getResult();
      FindSpecificNodeUsages_Action.this.getOptionsComponent().setDefaultSearchOptions(options.value);
      // start 
      final Wrappers._T<IResultProvider> provider = new Wrappers._T<IResultProvider>();
      final Wrappers._T<SearchQuery> query = new Wrappers._T<SearchQuery>();
      final Wrappers._T<ViewOptions> viewOptions = new Wrappers._T<ViewOptions>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          provider.value = options.value.getOption(FindersOptions.class).getResult();
          query.value = options.value.getOption(ScopeOptions.class).getResult(operationNode.value, FindSpecificNodeUsages_Action.this.context, FindSpecificNodeUsages_Action.this.model);
          viewOptions.value = options.value.getOption(ViewOptions.class);
        }
      });
      FindSpecificNodeUsages_Action.this.getTool().findUsages(provider.value, query.value, true, viewOptions.value.myShowOneResult, viewOptions.value.myNewTab, "No usages for that node");
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "FindSpecificNodeUsages", t);
      }
    }
  }

  private DefaultSearchOptionsComponent getOptionsComponent() {
    return FindSpecificNodeUsages_Action.this.project.getComponent(DefaultSearchOptionsComponent.class);
  }

  private UsagesViewTool getTool() {
    return FindSpecificNodeUsages_Action.this.project.getComponent(UsagesViewTool.class);
  }
}
