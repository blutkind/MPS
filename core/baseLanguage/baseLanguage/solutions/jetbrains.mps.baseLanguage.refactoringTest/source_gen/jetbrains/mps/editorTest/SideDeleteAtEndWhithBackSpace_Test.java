package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.ide.IEditor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;

public class SideDeleteAtEndWhithBackSpace_Test extends BaseTransformationTest {

  @Test()
  public void test_SideDeleteAtEndWhithBackSpace() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/findUsages/findUsages.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "testMethod", false);
  }

  public static class TestBody extends BaseEditorTestBody {

    public void testMethod() throws Exception {
      IEditor editor = this.initEditor("1236090550299", "1236090557432");
      BaseEditorTestBody.pressKeys(editor, ListSequence.<String>fromArray(" BACK_SPACE"));
      BaseEditorTestBody.pressKeys(editor, ListSequence.<String>fromArray(" DOWN"));
      BaseEditorTestBody.pressKeys(editor, ListSequence.<String>fromArray(" DOWN"));
      BaseEditorTestBody.pressKeys(editor, ListSequence.<String>fromArray(" DOWN"));
      BaseEditorTestBody.pressKeys(editor, ListSequence.<String>fromArray(" DOWN"));
      BaseEditorTestBody.pressKeys(editor, ListSequence.<String>fromArray(" DOWN"));
      BaseEditorTestBody.pressKeys(editor, ListSequence.<String>fromArray(" BACK_SPACE"));
      this.finishTest();
    }

}

}
