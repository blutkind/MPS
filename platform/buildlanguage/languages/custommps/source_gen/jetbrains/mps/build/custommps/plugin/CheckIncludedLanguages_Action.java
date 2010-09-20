package jetbrains.mps.build.custommps.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.List;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.project.IModule;
import jetbrains.mps.build.packaging.behavior.Module_Behavior;

public class CheckIncludedLanguages_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(CheckIncludedLanguages_Action.class);

  public CheckIncludedLanguages_Action() {
    super("Check Included Languages", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CheckIncludedLanguages", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      List<Language> langs = MPSModuleRepository.getInstance().getAllLanguages();
      for (SNode moduleNode : ListSequence.fromList(SModelOperations.getNodes(SNodeOperations.getModel(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "8431776905956472858")), "jetbrains.mps.build.packaging.structure.Module"))) {
        IModule module = Module_Behavior.call_getModule_1213877515148(moduleNode);
        if (!(module instanceof Language)) {
          continue;
        }

        langs.remove(module);
      }

      LOG.info("Check finished");
      for (Language l : ListSequence.fromList(langs)) {
        LOG.warning(l.getModuleFqName());
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CheckIncludedLanguages", t);
    }
  }
}
