package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;

import jetbrains.mps.smodel.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;

import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.refactoring.renameModel.ModelRenamer;

public class RenameAspects_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(RenameAspects_Action.class);

  public RenameAspects_Action() {
    super("RenameAspects", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "RenameAspects", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      for (Language l : ListSequence.fromList(MPSModuleRepository.getInstance().getAllLanguages())) {
        RenameAspects_Action.this.renameAspect(l, "helgins", "typesystem", _params);
        RenameAspects_Action.this.renameAspect(l, "languageTest", "test", _params);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "RenameAspects", t);
      }
    }
  }

  private void renameAspect(Language l, String oldName, String newName, final Map<String, Object> _params) {
    SModelFqName oldFqName = SModelFqName.fromString(l.getModuleFqName() + "." + oldName);
    SModelFqName newFqName = SModelFqName.fromString(l.getModuleFqName() + "." + newName);
    SModelDescriptor model = l.getScope().getModelDescriptor(oldFqName);
    if (model == null) {
      return;
    }
    new ModelRenamer(((DefaultSModelDescriptor) model), newFqName, false).rename();
  }
}
