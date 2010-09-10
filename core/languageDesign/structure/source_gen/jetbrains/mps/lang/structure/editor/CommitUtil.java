package jetbrains.mps.lang.structure.editor;

/*Generated by MPS */

import jetbrains.mps.ide.refactoring.RefactoringFacade;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.refactoring.framework.IRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.refactorings.RenameConcept;
import jetbrains.mps.lang.structure.refactorings.RenameProperty;
import jetbrains.mps.lang.structure.refactorings.RenameLink;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.nodeEditor.EditorContext;
import javax.swing.JOptionPane;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class CommitUtil {
  public static void refactorRenameNode(final IOperationContext context, final SNode node, String newName) {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SModelRepository.getInstance().saveAll();
      }
    });

    final IRefactoring refactoring = (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration") ?
      new RenameConcept() :
      (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.PropertyDeclaration") ?
        new RenameProperty() :
        (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.LinkDeclaration") ?
          new RenameLink() :
          null
        )
      )
    );
    if (refactoring == null) {
      return;
    }

    final RefactoringContext refactoringContext = new RefactoringContext(refactoring);
    refactoringContext.setCurrentOperationContext(context);
    refactoringContext.setSelectedNode(node);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        refactoringContext.setSelectedModel(SNodeOperations.getModel(node).getModelDescriptor());
      }
    });
    refactoringContext.setSelectedModule(context.getModule());
    refactoringContext.setSelectedProject(context.getProject());

    // set new name parameter for refactoring to skip initial dialog 
    refactoringContext.setParameter("myNewName", newName);

    new Thread() {
      public void run() {
        new RefactoringFacade().execute(refactoring, refactoringContext);
      }
    }.start();
  }

  public static void commitRename(EditorContext editorContext, final SNode node, String oldValue, final String newValue) {
    boolean refactor = false;
    if (oldValue != null) {
      if (oldValue.equals(newValue)) {
        return;
      }
      int res = JOptionPane.showConfirmDialog(editorContext.getNodeEditorComponent(), "Renaming " + "this element" + " can break your model. It is advised to use refactoring for this. Execute refactoring?", "Rename " + "element", JOptionPane.YES_NO_CANCEL_OPTION);
      if (res == JOptionPane.CANCEL_OPTION) {
        return;
      }
      refactor = res == JOptionPane.YES_OPTION;
    }
    if (refactor) {
      refactorRenameNode(editorContext.getOperationContext(), node, newValue);
    } else {
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.LinkDeclaration")) {
            SPropertyOperations.set(SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.LinkDeclaration"), "role", newValue);
          } else {
            SPropertyOperations.set(SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.INamedConcept"), "name", newValue);
          }
        }
      });
    }
  }
}
