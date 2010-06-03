package jetbrains.mps.lang.structure.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorContext;
import javax.swing.JOptionPane;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class CommitUtil {
  public CommitUtil() {
  }

  public static boolean commit(EditorContext editorContext, String oldValue, String newValue, String message, String title) {
    if (oldValue != null) {
      if (oldValue.equals(newValue)) {
        return false;
      }
      int result = JOptionPane.showConfirmDialog(editorContext.getNodeEditorComponent(), message, title, JOptionPane.YES_NO_OPTION);
      if (result == JOptionPane.NO_OPTION) {
        return false;
      }
    }
    return true;
  }

  public static void commitName(final EditorContext editorContext, final String oldValue, final String newValue, final SNode node, String renamedObject) {
    if (commit(editorContext, oldValue, newValue, "Renaming " + renamedObject + " can break your model. It's advised to use rename refactoring instead. Are you sure?", "Rename " + renamedObject)) {
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          SPropertyOperations.set(node, "name", newValue);
        }
      });
    }
  }

  public static void commitLinkRole(final EditorContext editorContext, final String oldValue, final String newValue, final SNode node) {
    if (commit(editorContext, oldValue, newValue, "Renaming link can break your model. It's advised to use rename link refactoring instead. Are you sure?", "Rename link")) {
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          SPropertyOperations.set(node, "role", newValue);
        }
      });
    }
  }
}
