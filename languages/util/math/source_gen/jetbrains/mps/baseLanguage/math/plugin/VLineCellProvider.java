package jetbrains.mps.baseLanguage.math.plugin;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;

public class VLineCellProvider extends AbstractCellProvider {
  private SNode myNode;

  public VLineCellProvider(SNode node) {
    this.myNode = node;
  }

  public EditorCell createEditorCell(EditorContext p0) {
    return new EditorCell_VerticalLine(p0, this.myNode);
  }
}
