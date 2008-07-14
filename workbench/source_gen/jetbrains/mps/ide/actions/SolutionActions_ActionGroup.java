package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.LabelledAnchor;
import jetbrains.mps.ide.actions.project.AddModuleToProjectAction;
import jetbrains.mps.ide.actions.project.RemoveModuleFromProjectAction;
import jetbrains.mps.ide.actions.module.GenerateAllModelsInModuleAction;
import jetbrains.mps.ide.actions.solution.GenerateTextFromAllModelsInSolutionAction;
import jetbrains.mps.ide.actions.solution.OptimizeSolutionImportsAction;
import jetbrains.mps.ide.actions.module.ShowModuleDependenciesAction;
import jetbrains.mps.ide.actions.module.SetModuleFolderAction;
import jetbrains.mps.ide.actions.solution.SolutionPropertiesAction;

public class SolutionActions_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(SolutionActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.SolutionActions";
  public static final String LABEL_ID_solutionNew = ID + "solutionNew";

  public SolutionActions_ActionGroup() {
    super("", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new LabelledAnchor(SolutionActions_ActionGroup.LABEL_ID_solutionNew));
      this.addSeparator();
      this.add(new AddModuleToProjectAction());
      this.add(new RemoveModuleFromProjectAction());
      this.addSeparator();
      this.add(new GenerateAllModelsInModuleAction(true));
      this.add(new GenerateAllModelsInModuleAction(false));
      this.add(new GenerateTextFromAllModelsInSolutionAction());
      this.add(new CheckSolution_Action());
      this.add(new OptimizeSolutionImportsAction());
      this.add(new AnalyzeClasspath_Action());
      this.add(new ShowModuleDependenciesAction());
      this.addSeparator();
      this.add(new MakeModule_Action());
      this.add(new RebuildModule_Action());
      this.add(new CleanModule_Action());
      this.addSeparator();
      this.add(new SetModuleFolderAction());
      this.addSeparator();
      this.add(new SolutionPropertiesAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
