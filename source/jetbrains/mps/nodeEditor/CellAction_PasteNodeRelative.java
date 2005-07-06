/*
 * Created by IntelliJ IDEA.
 * User: alshan
 * Date: Mar 2, 2004
 * Time: 1:14:34 PM
 */
package jetbrains.mps.nodeEditor;

import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.datatransfer.PasteUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.EditorsPane;

import java.util.List;


public class CellAction_PasteNodeRelative extends EditorCellAction {
  private static final Logger LOG = Logger.getLogger(CellAction_PasteNodeRelative.class);

  private boolean myPasteBefore;

  public CellAction_PasteNodeRelative(boolean pasteBefore) {
    myPasteBefore = pasteBefore;
  }

  public boolean canExecute(EditorContext context) {
    EditorCell selectedCell = context.getNodeEditorComponent().getSelectedCell();
    if (selectedCell == null) {
      return false;
    }
    SemanticNode anchorNode = selectedCell.getSemanticNode();
    List<SemanticNode> pasteNodes = PasteUtil.getNodesFromClipboard(anchorNode.getModel());
    if (pasteNodes == null) {
      return false;
    }

    if (!PasteUtil.canPasteRelative(anchorNode, pasteNodes.get(0))) {
      LOG.debug("Couldn't paste node relative");
      return false;
    }
    return true;
  }

  public void execute(EditorContext context) {
    EditorCell selectedCell = context.getNodeEditorComponent().getSelectedCell();
    SemanticNode anchorNode = selectedCell.getSemanticNode();
    List<SemanticNode> pasteNodes = PasteUtil.getNodesFromClipboard(anchorNode.getModel());
    PasteUtil.pasteRelative(anchorNode, pasteNodes.get(0), myPasteBefore);
    anchorNode = pasteNodes.get(0);
    for (int i = 1; i < pasteNodes.size(); i++) {
      SemanticNode node = pasteNodes.get(i);
      PasteUtil.pasteRelative(anchorNode, node, false);
      anchorNode = node;
    }
    EditorsPane editorsPane = context.getProject().getComponent(EditorsPane.class);
    AbstractEditorComponent editor = editorsPane.getCurrentEditor();
    editor.rebuildEditorContent();
  }
}