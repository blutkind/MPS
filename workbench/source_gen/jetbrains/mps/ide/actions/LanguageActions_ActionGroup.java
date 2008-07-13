package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.ide.actions.language.OptimizeLanguageImportsAction;
import jetbrains.mps.ide.actions.module.GenerateAllModelsInModuleAction;
import jetbrains.mps.ide.actions.module.SetModuleFolderAction;
import jetbrains.mps.ide.actions.module.ShowModuleDependenciesAction;
import jetbrains.mps.ide.actions.project.AddModuleToProjectAction;
import jetbrains.mps.ide.actions.project.RemoveModuleFromProjectAction;
import jetbrains.mps.ide.hierarchy.LanguageHierarchyAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.workbench.action.LabelledAnchor;

public class LanguageActions_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(LanguageActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.LanguageActions";
  public static final String LABEL_ID_newGroup = ID + "newGroup";

  public LanguageActions_ActionGroup() {
    super("", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new LabelledAnchor(LanguageActions_ActionGroup.LABEL_ID_newGroup));
      this.addSeparator();
      this.add(new GenerateAllModelsInModuleAction(true));
      this.add(new GenerateAllModelsInModuleAction(false));
      this.add(new CheckLanguage_Action());
      this.add(new OptimizeLanguageImportsAction());
      this.add(new AnalyzeClasspath_Action());
      this.addSeparator();
      this.add(new LanguageProperties_Action());
      this.add(new LanguageHierarchyAction());
      this.add(new ShowModuleDependenciesAction());
      this.addSeparator();
      this.add(new AddModuleToProjectAction());
      this.add(new RemoveModuleFromProjectAction());
      this.addSeparator();
      this.add(new MakeModule_Action());
      this.add(new RebuildModule_Action());
      this.add(new CleanModule_Action());
      this.addSeparator();
      this.add(new SetModuleFolderAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
