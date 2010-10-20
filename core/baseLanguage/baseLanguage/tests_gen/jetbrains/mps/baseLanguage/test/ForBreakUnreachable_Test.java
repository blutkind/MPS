package jetbrains.mps.baseLanguage.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.test.behavior.NodeOperation_Behavior;

@MPSLaunch
public class ForBreakUnreachable_Test extends BaseTransformationTest {
  @Test
  public void test_TypesCheck9092976468699800071() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test)");
    this.runTest("jetbrains.mps.baseLanguage.test.ForBreakUnreachable_Test$TestBody", "test_TypesCheck9092976468699800071", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_TypesCheck9092976468699800071() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("9092976468699800071"), "jetbrains.mps.lang.test.structure.NodeOperation");
      NodeOperation_Behavior.call_perform_1215601182156(operation, this.getRealNodeById("9092976468699800032"));
    }
  }
}
