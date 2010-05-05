package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.typesystem.uiActions.AffectingRulesFinder;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;

public class ShowRulesWhichAffectNodeType_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowRulesWhichAffectNodeType_Action.class);

  private IOperationContext operationContext;
  private SNode node;

  public ShowRulesWhichAffectNodeType_Action() {
    super("Show Rules Which Affect Node's Type", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl alt shift T";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowRulesWhichAffectNodeType", t);
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
    this.operationContext = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.operationContext == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.node = null;
    this.operationContext = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final Wrappers._T<SearchQuery> query = new Wrappers._T<SearchQuery>();
      final Wrappers._T<IResultProvider> provider = new Wrappers._T<IResultProvider>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          query.value = new SearchQuery(ShowRulesWhichAffectNodeType_Action.this.node, ShowRulesWhichAffectNodeType_Action.this.operationContext.getScope());
          provider.value = FindUtils.makeProvider(new AffectingRulesFinder());
        }
      });
      ShowRulesWhichAffectNodeType_Action.this.operationContext.getComponent(UsagesViewTool.class).findUsages(provider.value, query.value, false, true, false, "no rules found");
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowRulesWhichAffectNodeType", t);
    }
  }
}
