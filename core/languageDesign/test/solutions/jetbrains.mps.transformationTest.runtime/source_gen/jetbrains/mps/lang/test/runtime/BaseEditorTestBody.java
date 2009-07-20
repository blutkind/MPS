package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import jetbrains.mps.ide.IEditor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ModelAccess;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import java.util.ArrayList;
import java.util.Set;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.intentions.IntentionsManager;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.SModelDescriptor;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import com.intellij.openapi.fileEditor.FileEditorManager;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;

public class BaseEditorTestBody extends BaseTestBody {

  public IEditor myEditor;
  private SNode myBefore;
  private SNode myResult;
  protected CellReference myStart;
  protected CellReference myFinish;

  public IEditor initEditor(final String before, final String after) throws Exception {
    this.addNodeById(before);
    if (!(after.equals(""))) {
      this.addNodeById(after);
    }
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        BaseEditorTestBody.this.myBefore = BaseEditorTestBody.this.getNodeById(before);
        BaseEditorTestBody.this.myStart = BaseEditorTestBody.this.findCellReference(BaseEditorTestBody.this.getRealNodeById(before));
        if (!(after.equals(""))) {
          BaseEditorTestBody.this.myResult = BaseEditorTestBody.this.getNodeById(after);
          BaseEditorTestBody.this.myFinish = BaseEditorTestBody.this.findCellReference(BaseEditorTestBody.this.getRealNodeById(after));
        }
      }
    });
    this.myEditor = BaseEditorTestBody.openEditor(this.myProject, this.myModel, this.myBefore);
    this.myStart.setupSelection(this.myEditor);
    return this.myEditor;
  }

  private CellReference findCellReference(SNode node) {
    List<SNode> annotations = SNodeOperations.getDescendants(node, "jetbrains.mps.lang.test.structure.AnonymousCellAnnotation", false, new String[]{});
    if (ListSequence.fromList(annotations).isEmpty()) {
      return null;
    }
    return new CellReference(this.getNodeById(SNodeOperations.getParent(ListSequence.fromList(annotations).first()).getId()), ListSequence.fromList(annotations).first(), this.myMap);
  }

  public void finishTest() {
    if (this.myResult != null) {
      final SNode editedNode = this.myEditor.getEditedNode();
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {

        public void run() {
          Map<SNode, SNode> map = MapSequence.fromMap(new HashMap<SNode, SNode>());
          Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), editedNode), ListSequence.fromListAndArray(new ArrayList<SNode>(), BaseEditorTestBody.this.myResult), (Map)map));
          if (BaseEditorTestBody.this.myFinish != null) {
            BaseEditorTestBody.this.myFinish.assertEditor(BaseEditorTestBody.this.myEditor, map);
          }
        }
      });
    }
    BaseEditorTestBody.closeEditor(this.myProject, this.myBefore);
  }


  public static void invokeIntention(final String name, final IEditor editor, final SNode node) throws Exception {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {

      public void run() {
        editor.selectNode(node);
        Set<Intention> availableIntentions = IntentionsManager.getInstance().getAvailableIntentionsForExactNode(node, editor.getEditorContext(), false, true);
        for(Intention intention : SetSequence.fromSet(availableIntentions)) {
          if (intention.getClass().getCanonicalName().equals(name)) {
            intention.execute(node, editor.getEditorContext());
          }
        }
      }
    });
  }

  public static IEditor openEditor(MPSProject project, SModelDescriptor model, SNode node) {
    Project p = project.getComponent(Project.class);
    IOperationContext context = new ModuleContext(model.getModule(), project);
    MPSEditorOpener opener = new MPSEditorOpener(p);
    return opener.editNode(node, context);
  }

  public static void closeEditor(MPSProject project, SNode node) {
    Project p = project.getComponent(Project.class);
    FileEditorManager editorManager = FileEditorManager.getInstance(p);
    editorManager.closeFile(MPSNodesVirtualFileSystem.getInstance().getFileFor(node));
  }

  public static void typeString(IEditor editor, String text) {
    typeString(editor.getCurrentEditorComponent(), text);
  }

  public static void typeString(EditorComponent editorComponent, String text) {
    for(char ch : text.toCharArray()) {
      editorComponent.processKeyTyped(new KeyEvent(editorComponent, KeyEvent.KEY_TYPED, 0, 0, 0, ch));
    }
  }

  public static void pressKeys(IEditor editor, List<String> keyStrokes) {
    BaseEditorTestBody.pressKeys(editor.getCurrentEditorComponent(), keyStrokes);
  }

  public static void pressKeys(EditorComponent editorComponent, List<String> keyStrokes) {
    for(String code : ListSequence.fromList(keyStrokes)) {
      KeyStroke stroke = KeyStroke.getKeyStroke(code);
      editorComponent.processKeyPressed(new KeyEvent(editorComponent, KeyEvent.KEY_PRESSED, 0, stroke.getModifiers(), stroke.getKeyCode(), stroke.getKeyChar()));
      editorComponent.processKeyReleased(new KeyEvent(editorComponent, KeyEvent.KEY_RELEASED, 0, stroke.getModifiers(), stroke.getKeyCode(), stroke.getKeyChar()));
    }
  }

}
