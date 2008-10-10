package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.actions.nodes.GoByReferenceGroup;
import jetbrains.mps.workbench.actions.nodes.GoByCurrentReferenceAction;
import jetbrains.mps.workbench.actions.nodes.HighlightUsagesAction;
import jetbrains.mps.workbench.actions.nodes.HighlightInstancesAction;
import jetbrains.mps.workbench.actions.nodes.SelectInActionAdapter;
import jetbrains.mps.workbench.actions.nodes.GoToEditorDeclarationAction;
import jetbrains.mps.workbench.actions.nodes.GoToRulesAction;
import jetbrains.mps.workbench.actions.generate.GenerateFilesFromCurrentModelAction;
import jetbrains.mps.workbench.actions.generate.GenerateTextFromCurrentModelAction;
import jetbrains.mps.lang.generator.plugin.debug.actions.ShowGenerationTraceAction;
import jetbrains.mps.workbench.actions.nodes.FindSpecificNodeUsagesAction;
import jetbrains.mps.workbench.actions.nodes.FastFindUsagesNodeAction;
import jetbrains.mps.workbench.actions.cells.ShowCellKeymapsAction;
import jetbrains.mps.workbench.actions.baseLanguage.ShowParametersAction;
import jetbrains.mps.workbench.actions.model.ModelPropertiesActionWOShortcuts;

public class EditorPopup_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(EditorPopup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorPopup";
  public static final String LABEL_ID_structure = ID + "structure";
  public static final String LABEL_ID_vcs = ID + "vcs";

  public EditorPopup_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new GoByReferenceGroup());
      this.add(new GoByCurrentReferenceAction());
      this.add(new HighlightUsagesAction());
      this.add(new HighlightInstancesAction());
      this.addSeparator();
      this.add(new ShowInProject_Action());
      this.add(new SelectInActionAdapter());
      this.addSeparator();
      this.add(new GoToConceptDeclaration_Action());
      this.add(new GoToEditorDeclarationAction());
      this.add(new GoToRulesAction());
      this.add(new ShowNodeInExplorer_Action());
      this.add(new ShowNodeInInspector_Action());
      this.addSeparator();
      this.add(new GenerateFilesFromCurrentModelAction());
      this.add(new GenerateTextFromCurrentModelAction());
      this.addSeparator();
      this.add(new ShowGenerationTraceAction());
      this.add(new ShowGenerationTraceback_Action());
      this.addSeparator();
      this.add(new FindSpecificNodeUsagesAction());
      this.add(new FastFindUsagesNodeAction());
      this.addSeparator();
      this.add(new ShowClassInHierarchy_Action());
      this.add(new ShowConceptInHierarchy_Action());
      this.addAnchor(EditorPopup_ActionGroup.LABEL_ID_structure);
      this.addSeparator();
      this.add(new CloneRoot_Action());
      this.addSeparator();
      this.add(new ShowCellKeymapsAction());
      this.addSeparator();
      this.add(new ShowParametersAction());
      this.addSeparator();
      this.add(new ModelPropertiesActionWOShortcuts());
      this.addSeparator();
      this.addAnchor(EditorPopup_ActionGroup.LABEL_ID_vcs);
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
