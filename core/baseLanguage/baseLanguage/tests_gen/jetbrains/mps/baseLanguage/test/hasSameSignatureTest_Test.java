package jetbrains.mps.baseLanguage.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import junit.framework.Assert;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

@MPSLaunch
public class hasSameSignatureTest_Test extends BaseTransformationTest {
  @Test
  public void test_list() throws Throwable {
    this.initTest("${mps_home}/MPS.mpr", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test)");
    this.runTest("jetbrains.mps.baseLanguage.test.hasSameSignatureTest_Test$TestBody", "test_list", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_list() throws Exception {
      this.addNodeById("5157939743593407746");
      Assert.assertTrue(BaseMethodDeclaration_Behavior.call_hasSameSignature_1213877350435(SNodeOperations.cast(this.getNodeById("5157939743593407754"), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), SNodeOperations.cast(this.getNodeById("5157939743593407754"), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration")));
    }
  }
}
