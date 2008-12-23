package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoringParameters;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoring;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodFabric;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

public class staticContainerClassTest_Test extends BaseTransformationTest {

  @Test()
  public void test_staticContainerClassTest() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_staticContainerClassTest", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_staticContainerClassTest() throws Exception {
      this.addNodeById("1230040828215");
      this.addNodeById("1230040828225");
      this.addNodeById("1230040828233");
      this.addNodeById("1230040828237");
      SNode call = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null);
      SLinkOperations.setTarget(call, "baseMethodDeclaration", this.getNodeById("1230040828239"), false);
      SLinkOperations.setTarget(call, "classConcept", this.getNodeById("1230040828238"), false);
      SNodeOperations.replaceWithAnother(this.getNodeById("1230040828230"), call);
      ExtractMethodRefactoringParameters params = new ExtractMethodRefactoringParameters(ListSequence.<SNode>fromArray(this.getNodeById("1230040828219")));
      params.setName("foo");
      ExtractMethodRefactoring ref = ExtractMethodFabric.createRefactoring(params);
      ref.setStaticContainer(this.getNodeById("1230040828234"));
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(this.getNodeById("1230040828216"), this.getNodeById("1230040828234")), ListSequence.<SNode>fromArray(this.getNodeById("1230040828226"), this.getNodeById("1230040828238"))));
    }

}

}
