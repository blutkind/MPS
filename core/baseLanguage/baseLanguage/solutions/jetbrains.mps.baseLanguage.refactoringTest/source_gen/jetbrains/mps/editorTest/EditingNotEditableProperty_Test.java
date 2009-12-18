package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.nodeEditor.EditorComponent;

@MPSLaunch
public class EditingNotEditableProperty_Test extends BaseTransformationTest {
  @Test
  public void test_EditingNotEditableProperty() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest("jetbrains.mps.editorTest.EditingNotEditableProperty_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    public void testMethod() throws Exception {
      final IEditor editor = TestBody.this.initEditor("4965160547087514302", "4965160547087627107");
      EditorComponent editorComponent = editor.getCurrentEditorComponent();
      BaseEditorTestBody.typeString(editorComponent, "e");
      TestBody.this.finishTest();
    }
  }
}
