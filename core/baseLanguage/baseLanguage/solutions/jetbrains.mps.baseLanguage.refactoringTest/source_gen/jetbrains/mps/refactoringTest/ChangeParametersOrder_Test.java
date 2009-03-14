package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.ChangeMethodSignatureParameters;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.plugin.ChangeMethodSignatureRefactoring;
import java.util.List;
import java.util.ArrayList;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

public class ChangeParametersOrder_Test extends BaseTransformationTest {

  @Test()
  public void test_ChangeParametersOrder() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_ChangeParametersOrder", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_ChangeParametersOrder() throws Exception {
      this.addNodeById("1230052943947");
      this.addNodeById("1230052943971");
      ChangeMethodSignatureParameters params = new ChangeMethodSignatureParameters(this.getNodeById("1230052943949"));
      SNode p1 = ListSequence.fromList(SLinkOperations.getTargets(params.getDeclaration(), "parameter", true)).getElement(0);
      SNode p0 = ListSequence.fromList(SLinkOperations.getTargets(params.getDeclaration(), "parameter", true)).getElement(1);
      SLinkOperations.removeAllChildren(params.getDeclaration(), "parameter");
      SLinkOperations.addChild(params.getDeclaration(), "parameter", p0);
      SLinkOperations.addChild(params.getDeclaration(), "parameter", p1);
      ChangeMethodSignatureRefactoring ref = new ChangeMethodSignatureRefactoring(params, this.getNodeById("1230052943949"));
      List<SNode> ussages = new ArrayList<SNode>();
      ListSequence.fromList(ussages).addElement(this.getNodeById("1230052943965"));
      ref.setUsages(ussages);
      ref.doRefactoring();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(this.getNodeById("1230052943948")), ListSequence.<SNode>fromArray(this.getNodeById("1230052943972"))));
    }

}

}
