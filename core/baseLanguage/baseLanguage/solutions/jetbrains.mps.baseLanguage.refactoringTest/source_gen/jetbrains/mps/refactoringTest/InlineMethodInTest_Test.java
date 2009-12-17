package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.InlineMethodRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;

@MPSLaunch
public class InlineMethodInTest_Test extends BaseTransformationTest {
  @Test
  public void test_InlineMethodTest() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest("jetbrains.mps.refactoringTest.InlineMethodInTest_Test$TestBody", "test_InlineMethodTest", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_InlineMethodTest() throws Exception {
      this.addNodeById("1230057984817");
      this.addNodeById("1230057984833");
      InlineMethodRefactoring ref = new InlineMethodRefactoring(SNodeOperations.cast(this.getNodeById("1230057984830"), "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation"));
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230057984818"), "jetbrains.mps.lang.test.structure.NodesTestCase")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230057984834"), "jetbrains.mps.lang.test.structure.NodesTestCase"))));
    }
  }
}
