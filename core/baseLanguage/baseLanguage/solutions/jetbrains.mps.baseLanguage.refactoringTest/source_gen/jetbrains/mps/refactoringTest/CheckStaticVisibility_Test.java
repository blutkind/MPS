package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.InlineMethodRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;

@MPSLaunch
public class CheckStaticVisibility_Test extends BaseTransformationTest {
  @Test
  public void test_CheckStaticVisibility() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest("jetbrains.mps.refactoringTest.CheckStaticVisibility_Test$TestBody", "test_CheckStaticVisibility", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_CheckStaticVisibility() throws Exception {
      this.addNodeById("1230053114802");
      this.addNodeById("1230053114815");
      this.addNodeById("1230053114829");
      InlineMethodRefactoring ref = new InlineMethodRefactoring(SNodeOperations.cast(this.getNodeById("1230053114810"), "jetbrains.mps.baseLanguage.structure.StaticMethodCall"));
      Assert.assertTrue(ref.getProblems().length() > 0);
      ref = new InlineMethodRefactoring(SNodeOperations.cast(this.getNodeById("1230053114813"), "jetbrains.mps.baseLanguage.structure.StaticMethodCall"));
      Assert.assertTrue(ref.getProblems().length() > 0);
    }
  }
}
