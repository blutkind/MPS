package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.actions.project.AddModuleToProjectAction;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.workbench.actions.module.DeleteModuleAction;
import jetbrains.mps.workbench.actions.module.GenerateAllModelsInModuleAction;
import jetbrains.mps.workbench.actions.solution.GenerateTextFromAllModelsInSolutionAction;
import jetbrains.mps.workbench.actions.solution.OptimizeSolutionImportsAction;
import jetbrains.mps.workbench.actions.module.ShowModuleDependenciesAction;

public class SolutionActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(SolutionActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.SolutionActions";
  public static final String LABEL_ID_solutionNew = ID + "solutionNew";
  public static final String LABEL_ID_refactoring = ID + "refactoring";

  public SolutionActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAnchor(SolutionActions_ActionGroup.LABEL_ID_solutionNew);
      this.addSeparator();
      this.add(new AddModuleToProjectAction());
      this.add(ActionFactory.getInstance().getRegisteredAction(new RemoveModuleFromProject_Action()));
      this.add(new DeleteModuleAction());
      this.addSeparator();
      this.add(new GenerateAllModelsInModuleAction(true));
      this.add(new GenerateAllModelsInModuleAction(false));
      this.add(new GenerateTextFromAllModelsInSolutionAction());
      this.add(ActionFactory.getInstance().getRegisteredAction(new CheckSolution_Action()));
      this.add(new OptimizeSolutionImportsAction());
      this.add(ActionFactory.getInstance().getRegisteredAction(new AnalyzeClasspath_Action()));
      this.add(new ShowModuleDependenciesAction());
      this.addSeparator();
      this.add(ActionFactory.getInstance().getRegisteredAction(new MakeModule_Action()));
      this.add(ActionFactory.getInstance().getRegisteredAction(new RebuildModule_Action()));
      this.add(ActionFactory.getInstance().getRegisteredAction(new CleanModule_Action()));
      this.addSeparator();
      this.add(ActionFactory.getInstance().getRegisteredAction(new SetModuleFolder_Action()));
      this.addSeparator();
      this.add(ActionFactory.getInstance().getRegisteredAction(new SolutionProperties_Action()));
      this.addSeparator();
      this.addAnchor(SolutionActions_ActionGroup.LABEL_ID_refactoring);
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
