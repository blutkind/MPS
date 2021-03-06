package jetbrains.mps.lang.editor.selection.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.openapi.editor.Editor;
import jetbrains.mps.nodeEditor.EditorComponent;

@MPSLaunch
public class RootEndWithLineSelectionFromFirstCell_Test extends BaseTransformationTest {
  public RootEndWithLineSelectionFromFirstCell_Test() {
  }

  @Test
  public void test_RootEndWithLineSelectionFromFirstCell() throws Throwable {
    this.initTest("${mps_home}/MPS.mpr", "r:f429894b-858b-4e34-87ae-2cfe2a061928(jetbrains.mps.lang.editor.selection.test)");
    this.runTest("jetbrains.mps.lang.editor.selection.test.RootEndWithLineSelectionFromFirstCell_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    public TestBody() {
    }

    @Override
    public void testMethodImpl() throws Exception {
      final Editor editor = TestBody.this.initEditor("5097407566121753123", "5097407566121753130");
      EditorComponent editorComponent = (EditorComponent) editor.getCurrentEditorComponent();
      BaseEditorTestBody.invokeAction(editorComponent, "jetbrains.mps.ide.editor.actions.SelectNext_Action");
      BaseEditorTestBody.invokeAction(editorComponent, "jetbrains.mps.ide.editor.actions.RootEnd_Action");
    }
  }
}
