package jetbrains.mps.workbench.editors;

import com.intellij.codeHighlighting.BackgroundEditorHighlighter;
import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.openapi.command.undo.DocumentReference;
import com.intellij.openapi.command.undo.DocumentReferenceByVirtualFile;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.util.UserDataHolderBase;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.ide.NodeEditor;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.ReloadAdapter;
import jetbrains.mps.reloading.ReloadListener;
import jetbrains.mps.smodel.*;
import jetbrains.mps.workbench.nodesFs.MPSNodeVirtualFile;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class MPSFileNodeEditor extends UserDataHolderBase implements DocumentReferenceEditor, DocumentsEditor {
  private static Logger LOG = Logger.getLogger(MPSFileNodeEditor.class);

  private IEditor myNodeEditor;
  private ReloadListener myReloadListener = new ReloadAdapter() {
    public void onReload() {
      ModelAccess.instance().runReadInEDT(new Runnable() {
        public void run() {
          recreateEditor();
        }
      });
    }
  };
  private JPanel myComponent = new JPanel(new BorderLayout());
  private Project myProject;
  private MPSNodeVirtualFile myFile;
  private IOperationContext myContext;

  public MPSFileNodeEditor(IOperationContext context, final MPSNodeVirtualFile file) {
    this(context.getProject(), file, context);
  }

  public MPSFileNodeEditor(final Project project, final MPSNodeVirtualFile file) {
    this(project, file, null);
  }

  private MPSFileNodeEditor(final Project project, final MPSNodeVirtualFile file, IOperationContext context) {
    myProject = project;
    myFile = file;
    myContext = context;

    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        recreateEditor();
      }
    });

    ClassLoaderManager.getInstance().addReloadHandler(myReloadListener);
  }

  public DocumentReference[] getDocumentReferences() {
    List<DocumentReference> docRefs = new ArrayList<DocumentReference>();
    for (SNode node : myNodeEditor.getEditedNodes()) {
      docRefs.add(new DocumentReferenceByVirtualFile(MPSNodesVirtualFileSystem.getInstance().getFileFor(node)));
    }
    return docRefs.toArray(new DocumentReference[docRefs.size()]);
  }

  public Document[] getDocuments() {
    //todo this is a workaround for MPS-2447: [build:913] update failed for AnAction with ID=$Undo 
    return new Document[0];
  }

  public MPSNodeVirtualFile getFile() {
    return myFile;
  }

  public IEditor getNodeEditor() {
    return myNodeEditor;
  }

  @NotNull
  public JComponent getComponent() {
    return myComponent;
  }

  @Nullable
  public JComponent getPreferredFocusedComponent() {
    return myNodeEditor.getCurrentEditorComponent();
  }

  @NonNls
  @NotNull
  public String getName() {
    return ModelAccess.instance().runReadAction(new Computable<String>() {
      public String compute() {
        return myFile.getNode().getName();
      }
    });
  }

  @NotNull
  public FileEditorState getState(@NotNull FileEditorStateLevel level) {
    MPSEditorStateWrapper state = new MPSEditorStateWrapper();
    state.setEditorState(myNodeEditor.saveState(level));
    state.setLevel(level);
    return state;
  }

  public void setState(final @NotNull FileEditorState state) {
    if (!(state instanceof MPSEditorStateWrapper)) return;
    final MPSEditorStateWrapper wrapper = (MPSEditorStateWrapper) state;

    if (wrapper.getLevel() == FileEditorStateLevel.UNDO) {
      //we need it here since undo might need to flush events which requires write action
      ModelAccess.instance().runWriteAction(new Runnable() {
        public void run() {
          myNodeEditor.loadState(wrapper.getEditorState());
        }
      });
    } else {
      myNodeEditor.loadState(wrapper.getEditorState());
    }
  }

  public boolean isModified() {
    return ModelAccess.instance().runReadAction(new Computable<Boolean>() {
      public Boolean compute() {
        return SModelRepository.getInstance().isChanged(myFile.getNode().getModel());
      }
    });
  }

  public boolean isValid() {
    return true;
  }

  public void selectNotify() {
  }

  public void deselectNotify() {
  }

  public void addPropertyChangeListener(@NotNull PropertyChangeListener listener) {
  }

  public void removePropertyChangeListener(@NotNull PropertyChangeListener listener) {
  }

  @Nullable
  public BackgroundEditorHighlighter getBackgroundHighlighter() {
    return null;
  }

  @Nullable
  public FileEditorLocation getCurrentLocation() {
    return null;
  }

  @Nullable
  public StructureViewBuilder getStructureViewBuilder() {
    return null;
  }

  public void dispose() {
    myNodeEditor.dispose();
    ClassLoaderManager.getInstance().removeReloadHandler(myReloadListener);
  }

  private void recreateEditor() {
    if (myNodeEditor instanceof NodeEditor) return;

    myComponent.removeAll();

    FileEditorState state = myNodeEditor != null ? getState(FileEditorStateLevel.FULL) : null;

    if (myNodeEditor != null) {
      myNodeEditor.dispose();
    }

    myNodeEditor = myProject.getComponent(MPSEditorOpener.class)
      .createEditorFor(createOperationContext(), myFile.getNode());

    if (state != null) {
      setState(state);
    }

    myComponent.add(myNodeEditor.getComponent(), BorderLayout.CENTER);
    myComponent.validate();
  }

  protected IOperationContext createOperationContext() {
    if (myContext != null) {
      return myContext;
    }

    MPSProject mpsProject = myProject.getComponent(MPSProjectHolder.class).getMPSProject();
    SModelDescriptor sm = myFile.getNode().getModel().getModelDescriptor();

    if (sm == null) {
      throw new IllegalStateException("Can't find a model descriptor for model " + myFile.getNode().getModel().getLongName());
    }


    return new ModuleContext(sm.getModule(), mpsProject);
  }

}
