package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Apr 3, 2006 5:52:05 PM */


import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;

public class CastExpression_KeyMap extends EditorCellKeyMap {

  public CastExpression_KeyMap() {
    EditorCellKeyMapAction action;
    this.putAction("ctrl+shift", "VK_SPACE", new CastExpression_KeyMap_Action0());
    this.putAction("ctrl+shift", "VK_SPACE", new CastExpression_KeyMap_Action1());
  }
}
