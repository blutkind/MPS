package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder;
import jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;

public class FastFindNodeUsages_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/find.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(FastFindNodeUsages_Action.class);

  private IOperationContext context;
  private EditorCell cell;
  private SNode node;

  public FastFindNodeUsages_Action() {
    super("Find Usages (Without Options Dialog)", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl F7";
  }

  public boolean isApplicable(AnActionEvent event) {
    return FastFindNodeUsages_Action.this.getTool() != null;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "FastFindNodeUsages", t);
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
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.cell = event.getData(MPSDataKeys.EDITOR_CELL);
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.node = null;
    this.context = null;
    this.cell = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      SNode operationNode = (FastFindNodeUsages_Action.this.cell != null ?
        FastFindNodeUsages_Action.this.cell.getSNodeWRTReference() :
        FastFindNodeUsages_Action.this.node
      );
      IResultProvider provider = (SNodeOperations.isInstanceOf(FastFindNodeUsages_Action.this.node, "jetbrains.mps.lang.structure.structure.ConceptDeclaration") ?
        FindUtils.makeProvider(new NodeUsages_Finder(), new ConceptInstances_Finder()) :
        FindUtils.makeProvider(new NodeUsages_Finder())
      );
      SearchQuery query = new SearchQuery(operationNode, GlobalScope.getInstance());
      FastFindNodeUsages_Action.this.getTool().findUsages(provider, query, true, false, false, "No usages for that node");
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "FastFindNodeUsages", t);
      }
    }
  }

  private UsagesViewTool getTool() {
    return FastFindNodeUsages_Action.this.context.getComponent(UsagesViewTool.class);
  }
}
