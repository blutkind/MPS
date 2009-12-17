package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.MoveMethodRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;

@MPSLaunch
public class SimpleMoveMethod_Test extends BaseTransformationTest {
  @Test
  public void test_check() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest("jetbrains.mps.refactoringTest.SimpleMoveMethod_Test$TestBody", "test_check", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_check() throws Exception {
      this.addNodeById("1230053302711");
      this.addNodeById("1230053302720");
      this.addNodeById("1230053302724");
      this.addNodeById("1230053302728");
      MoveMethodRefactoring ref = new MoveMethodRefactoring(SNodeOperations.cast(this.getNodeById("1230053302713"), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), SNodeOperations.cast(this.getNodeById("1230053302721"), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
      ref.doRefactoring();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230053302712"), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(this.getNodeById("1230053302721"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230053302725"), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(this.getNodeById("1230053302729"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
