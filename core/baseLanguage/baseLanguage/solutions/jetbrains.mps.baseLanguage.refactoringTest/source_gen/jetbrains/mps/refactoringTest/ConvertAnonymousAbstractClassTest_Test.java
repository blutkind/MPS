package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ConvertAnonymousRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;

@MPSLaunch
public class ConvertAnonymousAbstractClassTest_Test extends BaseTransformationTest {
  @Test
  public void test_AbstractClassTest() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest("jetbrains.mps.refactoringTest.ConvertAnonymousAbstractClassTest_Test$TestBody", "test_AbstractClassTest", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_AbstractClassTest() throws Exception {
      this.addNodeById("6791439617122628437");
      this.addNodeById("6791439617122628452");
      this.addNodeById("6791439617122640070");
      new ConvertAnonymousRefactoring(SNodeOperations.cast(this.getNodeById("6791439617122628484"), "jetbrains.mps.baseLanguage.structure.AnonymousClass"), "MyAbstract").doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("6791439617122628459"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("6791439617122640105"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
