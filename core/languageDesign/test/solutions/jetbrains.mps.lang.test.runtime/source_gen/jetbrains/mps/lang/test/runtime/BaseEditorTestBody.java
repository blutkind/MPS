package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import com.intellij.ide.DataManager;
import com.intellij.ide.impl.DataManagerImpl;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.smodel.SNode;
import javax.swing.SwingUtilities;
import jetbrains.mps.smodel.ModelAccess;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import java.util.ArrayList;
import jetbrains.mps.intentions.IntentionsManager;
import java.util.Collection;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import com.intellij.openapi.fileEditor.FileEditorManager;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;
import java.lang.reflect.InvocationTargetException;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.ActionPlaces;

public class BaseEditorTestBody extends BaseTestBody {
  private static DataManager DATA_MANAGER = new DataManagerImpl();

  public IEditor myEditor;
  private SNode myBefore;
  private SNode myResult;
  protected CellReference myStart;
  protected CellReference myFinish;

  public BaseEditorTestBody() {
  }

  public IEditor initEditor(final String before, final String after) throws Exception {
    SwingUtilities.invokeAndWait(new Runnable() {
      public void run() {
        try {
          BaseEditorTestBody.this.initEditor_internal(before, after);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
    return this.myEditor;
  }

  private void initEditor_internal(final String before, final String after) throws Exception {
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
        BaseEditorTestBody.this.myEditor = BaseEditorTestBody.openEditor(BaseEditorTestBody.this.myProject, BaseEditorTestBody.this.myModel, BaseEditorTestBody.this.myBefore);
        BaseEditorTestBody.this.myStart.setupSelection(BaseEditorTestBody.this.myEditor);
      }
    });
  }

  private CellReference findCellReference(SNode node) {
    List<SNode> annotations = SNodeOperations.getDescendants(node, "jetbrains.mps.lang.test.structure.AnonymousCellAnnotation", false, new String[]{});
    if (ListSequence.fromList(annotations).isEmpty()) {
      return null;
    }
    return new CellReference(this.getNodeById(SNodeOperations.getParent(ListSequence.fromList(annotations).first()).getId()), ListSequence.fromList(annotations).first(), this.myMap);
  }

  public void checkAssertion() throws Throwable {
    final Wrappers._T<Throwable> throwable = new Wrappers._T<Throwable>(null);
    SwingUtilities.invokeAndWait(new Runnable() {
      public void run() {
        if (BaseEditorTestBody.this.myResult != null) {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              try {
                SNode editedNode = BaseEditorTestBody.this.myEditor.getCurrentlyEditedNode().getNode();
                Map<SNode, SNode> map = MapSequence.fromMap(new HashMap<SNode, SNode>());
                Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), editedNode), ListSequence.fromListAndArray(new ArrayList<SNode>(), BaseEditorTestBody.this.myResult), (Map) map));
                if (BaseEditorTestBody.this.myFinish != null) {
                  BaseEditorTestBody.this.myFinish.assertEditor(BaseEditorTestBody.this.myEditor, map);
                }
              } catch (Throwable t) {
                throwable.value = t;
              }
            }
          });
        }
      }
    });
    if (throwable.value != null) {
      throw throwable.value;
    }
  }

  public void testMethod() throws Throwable {
    try {
      this.testMethodImpl();
      this.checkAssertion();
    } finally {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          BaseEditorTestBody.closeEditor(BaseEditorTestBody.this.myProject, BaseEditorTestBody.this.myBefore);
        }
      });
    }
  }

  public void testMethodImpl() throws Exception {
  }

  public static void invokeIntention(final String name, final IEditor editor, final SNode node) throws Exception {
    SwingUtilities.invokeAndWait(new Runnable() {
      public void run() {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {
          public void run() {
            editor.getEditorContext().select(node);
            IntentionsManager.QueryDescriptor query = new IntentionsManager.QueryDescriptor();
            query.setInstantiate(true);
            query.setCurrentNodeOnly(true);
            Collection<Pair<Intention, SNode>> intentions = IntentionsManager.getInstance().getAvailableIntentions(query, node, editor.getEditorContext());
            for (Pair<Intention, SNode> intention : Sequence.fromIterable(intentions)) {
              if (intention.first.getClass().getCanonicalName().equals(name)) {
                intention.first.execute(intention.second, editor.getEditorContext());
              }
            }
          }
        });
      }
    });
  }

  public static IEditor openEditor(MPSProject project, SModelDescriptor model, SNode node) {
    IOperationContext context = new ModuleContext(model.getModule(), project.getProject());
    MPSEditorOpener opener = new MPSEditorOpener(project.getProject());
    return opener.editNode(node, context);
  }

  public static void closeEditor(MPSProject project, SNode node) {
    FileEditorManager editorManager = FileEditorManager.getInstance(project.getProject());
    editorManager.closeFile(MPSNodesVirtualFileSystem.getInstance().getFileFor(node));
  }

  public static void typeString(IEditor editor, String text) throws InterruptedException, InvocationTargetException {
    typeString(editor.getCurrentEditorComponent(), text);
  }

  public static void typeString(final EditorComponent editorComponent, final String text) throws InterruptedException, InvocationTargetException {
    SwingUtilities.invokeAndWait(new Runnable() {
      public void run() {
        for (char ch : text.toCharArray()) {
          editorComponent.processKeyTyped(new KeyEvent(editorComponent, KeyEvent.KEY_TYPED, 0, 0, 0, ch));
        }
      }
    });
  }

  public static void pressKeys(IEditor editor, List<String> keyStrokes) throws InterruptedException, InvocationTargetException {
    BaseEditorTestBody.pressKeys(editor.getCurrentEditorComponent(), keyStrokes);
  }

  public static void pressKeys(final EditorComponent editorComponent, final List<String> keyStrokes) throws InterruptedException, InvocationTargetException {
    SwingUtilities.invokeAndWait(new Runnable() {
      public void run() {
        for (String code : ListSequence.fromList(keyStrokes)) {
          KeyStroke stroke = KeyStroke.getKeyStroke(code);
          editorComponent.processKeyPressed(new KeyEvent(editorComponent, KeyEvent.KEY_PRESSED, 0, stroke.getModifiers(), stroke.getKeyCode(), stroke.getKeyChar()));
          editorComponent.processKeyReleased(new KeyEvent(editorComponent, KeyEvent.KEY_RELEASED, 0, stroke.getModifiers(), stroke.getKeyCode(), stroke.getKeyChar()));
        }
      }
    });
  }

  public static void invokeAction(IEditor editor, String actionId) throws InvocationTargetException, InterruptedException {
    invokeAction(editor.getCurrentEditorComponent(), actionId);
  }

  public static void invokeAction(final EditorComponent editorComponent, final String actionId) throws InvocationTargetException, InterruptedException {
    SwingUtilities.invokeAndWait(new Runnable() {
      public void run() {
        AnAction action = ActionManager.getInstance().getAction(actionId);
        AnActionEvent event = ActionUtils.createEvent(ActionPlaces.MAIN_MENU, BaseEditorTestBody.DATA_MANAGER.getDataContext(editorComponent));
        action.actionPerformed(event);
      }
    });
  }
}
