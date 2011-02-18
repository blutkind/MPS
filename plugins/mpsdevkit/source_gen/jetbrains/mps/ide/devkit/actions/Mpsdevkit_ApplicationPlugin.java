package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.GeneratorActions_ActionGroup;
import jetbrains.mps.ide.actions.LanguageActions_ActionGroup;
import jetbrains.mps.ide.actions.ProjectNewActions_ActionGroup;
import jetbrains.mps.ide.actions.ModulePropertiesGroup_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import jetbrains.mps.ide.actions.EditorTabActions_ActionGroup;
import jetbrains.mps.ide.actions.Goto_ActionGroup;
import jetbrains.mps.ide.actions.NodeActions_ActionGroup;
import java.util.List;
import jetbrains.mps.workbench.action.BaseKeymapChanges;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Mpsdevkit_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.ide.mpsdevkit");

  public Mpsdevkit_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new AddAccessoryModel_Action());
    addAction(new DeleteGenerator_Action());
    addAction(new GeneratorProperties_Action());
    addAction(new GoToConceptDeclaration_Action());
    addAction(new GoToEditorDeclaration_Action());
    addAction(new GoToRules_Action());
    addAction(new LanguageHierarchy_Action());
    addAction(new LanguageProperties_Action());
    addAction(new NewAccessoryModel_Action());
    addAction(new NewDevKit_Action());
    addAction(new NewGenerator_Action());
    addAction(new RenameLanguage_Action());
    // groups 
    addGroup(new AccessoriesGroupActions_ActionGroup());
    addGroup(new EditorPopupEx_ActionGroup());
    addGroup(new EditorTabActionsEx_ActionGroup());
    addGroup(new GenerateGeneratorPopup_ActionGroup());
    addGroup(new GeneratorActions_Delete_ActionGroup());
    addGroup(new GeneratorActions_Properties_ActionGroup());
    addGroup(new GeneratorNewActions_ActionGroup());
    addGroup(new GotoEx_ActionGroup());
    addGroup(new LanguageActionsEx_ActionGroup());
    addGroup(new LanguageNewActions_ActionGroup());
    addGroup(new LanguageNewCustomPartActions_ActionGroup());
    addGroup(new LanguageRefactoring_ActionGroup());
    addGroup(new ModulePropertiesGroupEx_ActionGroup());
    addGroup(new NodeActionsEx_ActionGroup());
    addGroup(new ProjectNewActionsEx_ActionGroup());
  }

  public void adjustRegularGroups() {
    insertGroupIntoAnother(GenerateGeneratorPopup_ActionGroup.ID, GeneratorActions_ActionGroup.ID, GeneratorActions_ActionGroup.LABEL_ID_generate);
    insertGroupIntoAnother(GeneratorNewActions_ActionGroup.ID, GeneratorActions_ActionGroup.ID, GeneratorActions_ActionGroup.LABEL_ID_generatorNew);
    insertGroupIntoAnother(LanguageNewActions_ActionGroup.ID, LanguageActions_ActionGroup.ID, LanguageActions_ActionGroup.LABEL_ID_newGroup);
    insertGroupIntoAnother(ProjectNewActionsEx_ActionGroup.ID, ProjectNewActions_ActionGroup.ID, ProjectNewActions_ActionGroup.LABEL_ID_end);
    insertGroupIntoAnother(LanguageRefactoring_ActionGroup.ID, LanguageActions_ActionGroup.ID, LanguageActions_ActionGroup.LABEL_ID_refactoring);
    insertGroupIntoAnother(GeneratorActions_Delete_ActionGroup.ID, GeneratorActions_ActionGroup.ID, GeneratorActions_ActionGroup.LABEL_ID_delete);
    insertGroupIntoAnother(GeneratorActions_Properties_ActionGroup.ID, GeneratorActions_ActionGroup.ID, GeneratorActions_ActionGroup.LABEL_ID_properties);
    insertGroupIntoAnother(ModulePropertiesGroupEx_ActionGroup.ID, ModulePropertiesGroup_ActionGroup.ID, ModulePropertiesGroup_ActionGroup.LABEL_ID_extensions);
    insertGroupIntoAnother(EditorPopupEx_ActionGroup.ID, EditorPopup_ActionGroup.ID, EditorPopup_ActionGroup.LABEL_ID_gotoConceptAspects);
    insertGroupIntoAnother(EditorTabActionsEx_ActionGroup.ID, EditorTabActions_ActionGroup.ID, EditorTabActions_ActionGroup.LABEL_ID_gotoConceptAspects);
    insertGroupIntoAnother(GotoEx_ActionGroup.ID, Goto_ActionGroup.ID, Goto_ActionGroup.LABEL_ID_gotoConceptAspects);
    insertGroupIntoAnother(NodeActionsEx_ActionGroup.ID, NodeActions_ActionGroup.ID, NodeActions_ActionGroup.LABEL_ID_gotoConceptAspects);
    insertGroupIntoAnother(LanguageActionsEx_ActionGroup.ID, LanguageActions_ActionGroup.ID, LanguageActions_ActionGroup.LABEL_ID_properties);
    insertGroupIntoAnother(LanguageNewCustomPartActions_ActionGroup.ID, LanguageNewActions_ActionGroup.ID, LanguageNewActions_ActionGroup.LABEL_ID_newAspect);
  }

  public List<BaseKeymapChanges> initKeymaps() {
    List<BaseKeymapChanges> res = ListSequence.fromList(new ArrayList<BaseKeymapChanges>());
    ListSequence.fromList(res).addElement(new Default_KeymapChanges());
    return res;
  }
}
