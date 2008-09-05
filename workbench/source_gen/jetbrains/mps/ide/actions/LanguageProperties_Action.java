package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.dialogs.LanguagePropertiesDialog;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.action.ActionEventData;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class LanguageProperties_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(LanguageProperties_Action.class);
  public static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${mps_home}\\workbench\\source\\jetbrains\\mps\\ide\\projectPane\\nodes\\languageProperties.png", "jetbrains.mps.ide"), true);

  public IOperationContext context;

  public LanguageProperties_Action() {
    super("Language Properties", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "alt ENTER";
  }

  public boolean isApplicable(AnActionEvent event) {
    return new ActionEventData(event).getModule() instanceof Language;
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "LanguageProperties", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ActionEventData data = new ActionEventData(event);
      final Language language = (Language) data.getModule();
      final IOperationContext localContext = LanguageProperties_Action.this.context;
      final LanguagePropertiesDialog[] dialog = new LanguagePropertiesDialog[1];
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          dialog[0] = new LanguagePropertiesDialog(language, localContext);
        }

      });
      dialog[0].showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "LanguageProperties", t);
    }
  }

}
