package jetbrains.mps.ide.editor.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.Edit_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import java.util.List;
import jetbrains.mps.workbench.action.BaseKeymapChanges;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Editor_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.ide.editor");

  public Editor_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new CopyThisDown_Action());
    addAction(new DeleteLine_Action());
    addAction(new End_Action());
    addAction(new ExtractComponent_Action());
    addAction(new Home_Action());
    addAction(new InsertBefore_Action());
    addAction(new Insert_Action());
    addAction(new LocalEnd_Action());
    addAction(new LocalHome_Action());
    addAction(new MoveDown_Action());
    addAction(new MoveLeft_Action());
    addAction(new MoveRight_Action());
    addAction(new MoveUp_Action());
    addAction(new RootEnd_Action());
    addAction(new RootHome_Action());
    addAction(new SelectDown_Action());
    addAction(new SelectLocalEnd_Action());
    addAction(new SelectLocalHome_Action());
    addAction(new SelectUp_Action());
    // groups 
    addGroup(new EditMenuActions_ActionGroup());
    addGroup(new EditorActions_ActionGroup());
  }

  public void adjustRegularGroups() {
    insertGroupIntoAnother(EditMenuActions_ActionGroup.ID, Edit_ActionGroup.ID, Edit_ActionGroup.LABEL_ID_custom);
    insertGroupIntoAnother(EditMenuActions_ActionGroup.ID, EditorPopup_ActionGroup.ID, null);
    insertGroupIntoAnother(EditorActions_ActionGroup.ID, "EditorActions", null);
  }

  public List<BaseKeymapChanges> initKeymaps() {
    List<BaseKeymapChanges> res = ListSequence.fromList(new ArrayList<BaseKeymapChanges>());
    ListSequence.fromList(res).addElement(new Default_KeymapChanges());
    ListSequence.fromList(res).addElement(new Mac_KeymapChanges());
    return res;
  }
}
