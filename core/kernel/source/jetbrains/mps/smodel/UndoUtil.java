package jetbrains.mps.smodel;

import com.intellij.openapi.command.undo.UndoableAction;
import com.intellij.openapi.command.undo.UndoManager;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.project.Project;

class UndoUtil {
  static void addUndoableAction(UndoableAction action) {
//    for (Project p : ProjectManager.getInstance().getOpenProjects()) {
//      UndoManager.getInstance(p).undoableActionPerformed(action);
//    }
  }

}
