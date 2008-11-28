package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class GeneratorActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GeneratorActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.GeneratorActions";
  public static final String LABEL_ID_generatorNew = ID + "generatorNew";

  public GeneratorActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAnchor(GeneratorActions_ActionGroup.LABEL_ID_generatorNew);
      this.addAction("jetbrains.mps.workbench.actions.language.GenerateTemplateQueriesAction", "jetbrains.mps.ide", true);
      this.addAction("jetbrains.mps.workbench.actions.language.GenerateTemplateQueriesAction", "jetbrains.mps.ide", false);
      this.addSeparator();
      this.addAction("jetbrains.mps.workbench.actions.module.ShowModuleDependenciesAction", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.workbench.actions.language.DeleteGeneratorAction", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.CheckGenerator_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.GeneratorProperties_Action", "jetbrains.mps.ide");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
