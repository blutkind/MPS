package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

@MPSLaunch
public class PressingBackspaseInFirstPosition_Test extends BaseTransformationTest {
  @Test
  public void test_PressingBackspaseInFirstPosition() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest("jetbrains.mps.editorTest.PressingBackspaseInFirstPosition_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    public void testMethod() throws Exception {
      final IEditor editor = TestBody.this.initEditor("1195975797953576231", "1195975797953580249");
      EditorComponent editorComponent = editor.getCurrentEditorComponent();
      BaseEditorTestBody.pressKeys(editorComponent, ListSequence.fromListAndArray(new ArrayList<String>(), " BACK_SPACE"));
      TestBody.this.finishTest();
    }
  }
}
