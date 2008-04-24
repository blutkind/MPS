package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.ParenthesizedExpression;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class OpenParenthesis_KeyMap extends EditorCellKeyMap {

  public OpenParenthesis_KeyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new OpenParenthesis_KeyMap.OpenParenthesis_KeyMap_Action0();
    this.putAction("ctrl+shift", "VK_LEFT", action);
    action = new OpenParenthesis_KeyMap.OpenParenthesis_KeyMap_Action1();
    this.putAction("ctrl+shift", "VK_RIGHT", action);
  }
  public static class OpenParenthesis_KeyMap_Action0 extends EditorCellKeyMapAction {

    public OpenParenthesis_KeyMap_Action0() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "move opening parenthesis to the left";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(KeyEvent keyEvent, EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")) {
        return true;
      }
      return false;
    }

    public void execute(KeyEvent keyEvent, EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(KeyEvent keyEvent, EditorContext editorContext, SNode node, List<SNode> selectedNodes) {
      ParenthesisUtil.moveParenthesisToTheLeft(((ParenthesizedExpression)SNodeOperations.getAdapter(node)), editorContext);
    }

    public String getKeyStroke() {
      return "ctrl shift LEFT";
    }

}
  public static class OpenParenthesis_KeyMap_Action1 extends EditorCellKeyMapAction {

    public OpenParenthesis_KeyMap_Action1() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "move opening parenthesis to the right";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(KeyEvent keyEvent, EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")) {
        return true;
      }
      return false;
    }

    public void execute(KeyEvent keyEvent, EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(KeyEvent keyEvent, EditorContext editorContext, SNode node, List<SNode> selectedNodes) {
      ParenthesisUtil.moveParenthesisToTheRightInside(((ParenthesizedExpression)SNodeOperations.getAdapter(node)), editorContext);
    }

    public String getKeyStroke() {
      return "ctrl shift RIGHT";
    }

}

}
