package jetbrains.mps.lang.editor.table.runtime;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class Utils {
  public Utils() {
  }

  public static void insertElementAt(List<SNode> list, SNode newElement, int index) {
    assert index >= 0 && index <= ListSequence.fromList(list).count();
    if (ListSequence.fromList(list).count() == 0 || index == ListSequence.fromList(list).count()) {
      ListSequence.fromList(list).addElement(newElement);
    } else {
      SNodeOperations.insertPrevSiblingChild(ListSequence.fromList(list).getElement(index), newElement);
    }
  }
}
