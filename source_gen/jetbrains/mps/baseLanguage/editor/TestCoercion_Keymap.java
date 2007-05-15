package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import jetbrains.mps.baseLanguage.editor.TestCoercion_Keymap_Action0;
import jetbrains.mps.baseLanguage.editor.TestCoercion_Keymap_Action1;
import jetbrains.mps.baseLanguage.editor.TestCoercion_Keymap_Action2;
import jetbrains.mps.baseLanguage.editor.TestCoercion_Keymap_Action3;

public class TestCoercion_Keymap extends EditorCellKeyMap {

  public  TestCoercion_Keymap() {
    this.setApplicableToEveryModel(true);
    EditorCellKeyMapAction action;
    this.putAction("ctrl+alt+shift", "VK_T", new TestCoercion_Keymap_Action0());
    this.putAction("ctrl+alt+shift", "VK_T", new TestCoercion_Keymap_Action1());
    this.putAction("ctrl+alt+shift", "VK_T", new TestCoercion_Keymap_Action2());
    this.putAction("ctrl+alt+shift", "VK_T", new TestCoercion_Keymap_Action3());
  }
}
