package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.nodeEditor.EditorComponent;

@MPSLaunch
public class EqualsTest_Test extends BaseTransformationTest {
  @Test
  public void test_EqualsTest() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest("jetbrains.mps.editorTest.EqualsTest_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    public void testMethod() throws Exception {
      final IEditor editor = TestBody.this.initEditor("1230058635738", "1230058635747");
      EditorComponent editorComponent = editor.getCurrentEditorComponent();
      BaseEditorTestBody.typeString(editorComponent, "ifaa==zz");
      TestBody.this.finishTest();
    }
  }
}
