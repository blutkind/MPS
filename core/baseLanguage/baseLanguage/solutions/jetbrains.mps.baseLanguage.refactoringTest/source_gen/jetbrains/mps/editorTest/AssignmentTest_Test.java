package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.ide.IEditor;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;

public class AssignmentTest_Test extends BaseTransformationTest {

  @Test()
  public void test_AssignmentTest() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/findUsages/findUsages.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "testMethod", false);
  }

  public static class TestBody extends BaseEditorTestBody {

    public void testMethod() throws Exception {
      IEditor editor = this.initEditor("1230058635670", "1230058635678");
      BaseEditorTestBody.typeString(editor, "=0");
      this.finishTest();
    }

}

}
