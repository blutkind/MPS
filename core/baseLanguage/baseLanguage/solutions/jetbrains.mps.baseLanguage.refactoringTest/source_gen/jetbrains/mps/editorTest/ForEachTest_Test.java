package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.ide.IEditor;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import junit.framework.Assert;
import org.junit.Test;

public class ForEachTest_Test extends BaseTransformationTest {

  @Test()
  public void test_ForEachTest() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/findUsages/findUsages.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "testMethod", false);
  }

  public static class TestBody extends BaseEditorTestBody {

    public void testMethod() throws Exception {
      IEditor editor = this.initEditor("1230058635764", "");
      BaseEditorTestBody.typeString(editor, "foreach");
      Assert.assertTrue(editor.getCurrentEditorComponent().getNodeSubstituteChooser().isVisible());
      this.finishTest();
    }

}

}
