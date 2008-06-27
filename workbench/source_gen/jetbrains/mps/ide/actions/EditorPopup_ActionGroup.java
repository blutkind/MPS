package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.CurrentProjectGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.actions.nodes.GoByReferenceGroup;
import jetbrains.mps.ide.actions.nodes.GoByFirstReferenceAction;
import jetbrains.mps.ide.actions.nodes.HighlightUsagesAction;
import jetbrains.mps.ide.actions.nodes.HighlightInstancesAction;
import jetbrains.mps.ide.actions.nodes.ShowRootInProjectAction;
import jetbrains.mps.ide.actions.nodes.ShowInProjectAction;
import jetbrains.mps.ide.actions.nodes.GoToConceptDeclarationAction;
import jetbrains.mps.ide.actions.nodes.GoToEditorDeclarationAction;
import jetbrains.mps.ide.actions.nodes.GoToRulesAction;
import jetbrains.mps.ide.actions.nodes.ShowNodeInExplorerAction;
import jetbrains.mps.ide.actions.nodes.ShowNodeInInspectorAction;
import jetbrains.mps.ide.actions.generate.GenerateFilesFromCurrentModelAction;
import jetbrains.mps.ide.actions.generate.GenerateTextFromCurrentModelAction;
import jetbrains.mps.transformation.TLBase.plugin.debug.actions.ShowGenerationTraceAction;
import jetbrains.mps.transformation.TLBase.plugin.debug.actions.ShowGenerationTracebackAction;
import jetbrains.mps.ide.actions.nodes.FindSpecificNodeUsagesAction;
import jetbrains.mps.ide.actions.nodes.FastFindUsagesNodeAction;
import jetbrains.mps.ide.actions.nodes.ShowClassInHierarchyAction;
import jetbrains.mps.ide.actions.nodes.ShowConceptInHierarchyAction;
import jetbrains.mps.ide.actions.nodes.ShowConceptStructureAction;
import jetbrains.mps.ide.actions.nodes.CloneRootAction;
import jetbrains.mps.ide.actions.cells.ShowCellKeymapsAction;
import jetbrains.mps.ide.actions.baseLanguage.ShowParametersAction;
import jetbrains.mps.ide.actions.model.ModelPropertiesAction;

public class EditorPopup_ActionGroup extends CurrentProjectGroup {
  public static Logger LOG = Logger.getLogger(EditorPopup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorPopup";

  public EditorPopup_ActionGroup(Project project) {
    super("", ID, true, false, null, project);
    this.setPopup(false);
    try {
      this.add(new GoByReferenceGroup());
      this.add(new GoByFirstReferenceAction());
      this.add(new HighlightUsagesAction());
      this.add(new HighlightInstancesAction());
      this.addSeparator();
      this.add(new ShowRootInProjectAction());
      this.add(new ShowInProjectAction());
      this.add(new GoToConceptDeclarationAction());
      this.add(new GoToEditorDeclarationAction());
      this.add(new GoToRulesAction());
      this.add(new ShowNodeInExplorerAction());
      this.add(new ShowNodeInInspectorAction());
      this.addSeparator();
      this.add(new GenerateFilesFromCurrentModelAction());
      this.add(new GenerateTextFromCurrentModelAction());
      this.addSeparator();
      this.add(new ShowGenerationTraceAction());
      this.add(new ShowGenerationTracebackAction());
      this.addSeparator();
      this.add(new FindSpecificNodeUsagesAction());
      this.add(new FastFindUsagesNodeAction());
      this.addSeparator();
      this.add(new ShowClassInHierarchyAction());
      this.add(new ShowConceptInHierarchyAction());
      this.add(new ShowConceptStructureAction());
      this.addSeparator();
      this.add(new CloneRootAction());
      this.addSeparator();
      this.add(new ShowCellKeymapsAction());
      this.addSeparator();
      this.add(new ShowParametersAction());
      this.addSeparator();
      this.add(new ModelPropertiesAction());
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
