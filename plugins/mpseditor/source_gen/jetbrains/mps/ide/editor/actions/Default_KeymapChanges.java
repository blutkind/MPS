package jetbrains.mps.ide.editor.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseKeymapChanges;
import com.intellij.openapi.actionSystem.Shortcut;
import com.intellij.openapi.actionSystem.KeyboardShortcut;
import javax.swing.KeyStroke;

public class Default_KeymapChanges extends BaseKeymapChanges {
  public Default_KeymapChanges() {
    // simple 
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.CopyThisDown_Action", getShortcut("ctrl D"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.DeleteLine_Action", getShortcut("ctrl Y"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.End_Action", getShortcut(" END"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.Escape_Action", getShortcut(" ESCAPE"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.ExtractComponent_Action", getShortcut("ctrl alt C"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.Home_Action", getShortcut(" HOME"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.InsertBefore_Action", getShortcut(" INSERT"), getShortcut("shift ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.Insert_Action", getShortcut(" ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.LocalEnd_Action", getShortcut("ctrl RIGHT"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.LocalHome_Action", getShortcut("ctrl LEFT"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.MoveDown_Action", getShortcut(" DOWN"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.MoveElementsDown_Action", getShortcut("alt DOWN"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.MoveElementsUp_Action", getShortcut("alt UP"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.MoveLeft_Action", getShortcut(" LEFT"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.MoveRight_Action", getShortcut(" RIGHT"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.MoveUp_Action", getShortcut(" UP"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.RootEnd_Action", getShortcut("ctrl END"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.RootHome_Action", getShortcut("ctrl HOME"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.SelectDown_Action", getShortcut("ctrl DOWN"), getShortcut("ctrl shift W"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.SelectLocalEnd_Action", getShortcut("ctrl shift RIGHT"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.SelectLocalHome_Action", getShortcut("ctrl shift LEFT"));
    addSimpleShortcut("jetbrains.mps.ide.editor.actions.SelectUp_Action", getShortcut("ctrl UP"), getShortcut("ctrl W"));
    // simple parameterized 
    // complex 
  }

  public String getScheme() {
    return "$default";
  }

  public static Shortcut getShortcut(String stroke) {
    return new KeyboardShortcut(KeyStroke.getKeyStroke(stroke), null);
  }
}
