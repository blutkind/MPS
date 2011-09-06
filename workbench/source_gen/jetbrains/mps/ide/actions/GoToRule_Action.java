package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.typesystem.util.GoToTypeErrorRuleUtil;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.util.Pair;

public class GoToRule_Action extends GeneratedAction {
  private static final Icon ICON = new ImageIcon(GoToRule_Action.class.getResource("rule.png"));
  protected static Log log = LogFactory.getLog(GoToRule_Action.class);

  public GoToRule_Action() {
    super("Go to Rule", "go to rule action", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GoToRule", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("ruleModelAndId", event.getData(MPSDataKeys.RULE_MODEL_AND_ID));
    if (MapSequence.fromMap(_params).get("ruleModelAndId") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      GoToTypeErrorRuleUtil.goToRuleById(((IOperationContext) MapSequence.fromMap(_params).get("context")), ((Pair<String, String>) MapSequence.fromMap(_params).get("ruleModelAndId")));
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GoToRule", t);
      }
    }
  }
}
