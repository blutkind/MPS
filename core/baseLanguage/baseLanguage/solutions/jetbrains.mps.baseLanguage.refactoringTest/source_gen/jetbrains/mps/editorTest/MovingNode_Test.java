package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import javax.swing.SwingUtilities;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.awt.event.ActionListener;
import javax.swing.KeyStroke;

@MPSLaunch
public class MovingNode_Test extends BaseTransformationTest {
  @Test
  public void test_MovingNode() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest("MovingNode_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    public void testMethod() throws Exception {
      final IEditor[] editorWrap = new IEditor[1];
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          try {
            editorWrap[0] = TestBody.this.initEditor("1452412866770394613", "1452412866770394617");
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });
      final IEditor editor = editorWrap[0];
      EditorComponent editorComponent = editor.getCurrentEditorComponent();
      final IEditor editorVar = editor;
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          ActionListener actionListener = editorVar.getCurrentEditorComponent().getActionForKeyStroke(KeyStroke.getKeyStroke("alt DOWN"));
          actionListener.actionPerformed(null);
        }
      });
      TestBody.this.finishTest();
    }
  }
}
