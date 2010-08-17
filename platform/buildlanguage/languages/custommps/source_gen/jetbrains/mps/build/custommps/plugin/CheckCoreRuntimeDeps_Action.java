package jetbrains.mps.build.custommps.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.build.packaging.behavior.Module_Behavior;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.project.ModuleUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class CheckCoreRuntimeDeps_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(CheckCoreRuntimeDeps_Action.class);

  public CheckCoreRuntimeDeps_Action() {
    super("Check Core Runtime Deps", "", ICON);
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
      LOG.error("User's action doUpdate method failed. Action:" + "CheckCoreRuntimeDeps", t);
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
      List<SNode> coreBlocks = new ArrayList<SNode>();
      ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:2d21a960-b27b-446c-b511-65afab987b27(jetbrains.mps.build.custommps.modules)", "4062013737453621622"));
      ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:2d21a960-b27b-446c-b511-65afab987b27(jetbrains.mps.build.custommps.modules)", "767042628922931192"));
      ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:2d21a960-b27b-446c-b511-65afab987b27(jetbrains.mps.build.custommps.modules)", "701559220729385454"));
      ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:2d21a960-b27b-446c-b511-65afab987b27(jetbrains.mps.build.custommps.modules)", "7678729833318422579"));
      ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:2d21a960-b27b-446c-b511-65afab987b27(jetbrains.mps.build.custommps.modules)", "4062013737453621614"));
      ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:2d21a960-b27b-446c-b511-65afab987b27(jetbrains.mps.build.custommps.modules)", "4062013737453609732"));

      Iterable<IModule> coreModules = ListSequence.fromList(coreBlocks).translate(new ITranslator2<SNode, SNode>() {
        public Iterable<SNode> translate(SNode it) {
          return SNodeOperations.getDescendants(it, "jetbrains.mps.build.custommpsInternal.structure.MPSModule", false, new String[]{});
        }
      }).select(new ISelector<SNode, IModule>() {
        public IModule select(SNode it) {
          return Module_Behavior.call_getModule_1213877515148(it);
        }
      });

      for (Solution solution : ListSequence.fromList(MPSModuleRepository.getInstance().getAllSolutions())) {
        if (solution.isStub()) {
          continue;
        }
        if (!(solution.getModuleDescriptor().isDontLoadClasses())) {
          continue;
        }

        // if we are here, this means this solution is a part of MPS core 
        for (Language language : ListSequence.fromList(ModuleUtil.getAllUsedLanguages(solution))) {
          for (IModule module : ListSequence.fromList(language.getRuntimeDependOnModules())) {
            // check that this module is in classpath on build startup 
            if (!(Sequence.fromIterable(coreModules).contains(module))) {
              String msg = "Module " + module.getModuleFqName() + " should be in core because it's a runtime of language " + language.getModuleFqName() + ", which is used by core solution " + solution.getModuleFqName();
              LOG.error(msg);
            }
          }
        }
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CheckCoreRuntimeDeps", t);
    }
  }
}
