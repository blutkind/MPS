package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.generator.generationTypes.JavaGenerationHandler;
import jetbrains.mps.generator.generationTypes.OutputViewGenerationHandler;

public class ModelActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ModelActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ModelActions";
  public static final String LABEL_ID_newActions = ID + "newActions";
  public static final String LABEL_ID_showHelp = ID + "showHelp";
  public static final String LABEL_ID_refactoring = ID + "refactoring";
  public static final String LABEL_ID_favorites = ID + "favorites";
  public static final String LABEL_ID_vcs = ID + "vcs";
  public static final String LABEL_ID_scripts = ID + "scripts";

  public ModelActions_ActionGroup() {
    super("ModelActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ModelActions_ActionGroup.this.addAnchor(ModelActions_ActionGroup.LABEL_ID_newActions);
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.PasteNode_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.PasteAsJavaClass_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.DeleteModels_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CloneModel_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CopyModelName_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GetModelContentsFromSource_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.OptimizeModelImports_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.AddMissingImports_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowReferencesToMissingStuff_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAnchor(ModelActions_ActionGroup.LABEL_ID_showHelp);
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CheckModel_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateModel_Action", "jetbrains.mps.ide", new JavaGenerationHandler(), false);
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateModel_Action", "jetbrains.mps.ide", new JavaGenerationHandler(), true);
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateModel_Action", "jetbrains.mps.ide", new OutputViewGenerationHandler(), false);
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowMappingsPartitioning_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowDifferencesWithModelOnDisk_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ReRunMergeFromBackup_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.RevertMemoryChanges_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.SaveModel_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAnchor(ModelActions_ActionGroup.LABEL_ID_refactoring);
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.UpgradeModelPersistenceInModel_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAnchor(ModelActions_ActionGroup.LABEL_ID_favorites);
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAnchor(ModelActions_ActionGroup.LABEL_ID_vcs);
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAnchor(ModelActions_ActionGroup.LABEL_ID_scripts);
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ModelProperties_Action", "jetbrains.mps.ide");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
