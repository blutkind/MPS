package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import javax.swing.SwingUtilities;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import junit.framework.Assert;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

@MPSLaunch
public class SmartReferenseUpdateOnChange_Test extends BaseTransformationTest {
  @Test
  public void test_SmartReferenseUpdateOnChange() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest("SmartReferenseUpdateOnChange_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    public void testMethod() throws Exception {
      final IEditor[] editorWrap = new IEditor[1];
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          try {
            editorWrap[0] = TestBody.this.initEditor("2345623147105495371", "2345623147105495377");
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });
      final IEditor editor = editorWrap[0];
      final EditorComponent editorComponent = editor.getCurrentEditorComponent();
      BaseEditorTestBody.pressKeys(editorComponent, ListSequence.fromListAndArray(new ArrayList<String>(), " BACK_SPACE"));
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          SNode testNode = SNodeOperations.cast(TestBody.this.getNodeById("2345623147105496859"), "jetbrains.mps.baseLanguage.structure.ClassifierType");
          EditorCell editorCell = editorComponent.findCellWithId(testNode, "ReferencePresentation_9185_0");
          Assert.assertEquals("SmartReferenseUpdat", ((EditorCell_Label)editorCell).getText());
        }
      });
      TestBody.this.finishTest();
    }
  }
}
