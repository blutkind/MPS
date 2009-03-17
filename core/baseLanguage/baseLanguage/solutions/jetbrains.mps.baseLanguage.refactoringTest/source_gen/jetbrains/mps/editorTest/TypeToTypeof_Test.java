package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.ide.IEditor;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;

public class TypeToTypeof_Test extends BaseTransformationTest {

  @Test()
  public void test_TypeToTypeof() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/findUsages/findUsages.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "testMethod", false);
  }

  public static class TestBody extends BaseEditorTestBody {

    public void testMethod() throws Exception {
      IEditor editor = this.initEditor("1234447269499", "1234447864256");
      BaseEditorTestBody.typeString(editor, "of");
      this.finishTest();
    }

}

}
