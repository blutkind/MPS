package jetbrains.mps.debug.tests;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.debug.evaluation.ui.TransformationUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

@MPSLaunch
public class TransformationUtil_Test extends BaseTransformationTest {
  @Test
  public void test_lowLevelVariable() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_lowLevelVariable", true);
  }

  @Test
  public void test_evaluatorsThisExpression() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_evaluatorsThisExpression", true);
  }

  @Test
  public void test_field() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_field", true);
  }

  @Test
  public void test_localField() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_localField", true);
  }

  @Test
  public void test_staticField() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_staticField", true);
  }

  @Test
  public void test_localStaticField() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_localStaticField", true);
  }

  @Test
  public void test_method() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_method", true);
  }

  @Test
  public void test_localMethod() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_localMethod", true);
  }

  @Test
  public void test_staticMethod() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_staticMethod", true);
  }

  @Test
  public void test_staticLocalMethod() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_staticLocalMethod", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_lowLevelVariable() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      this.addNodeById("607759879653675041");
      this.addNodeById("607759879653675023");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550173"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550173"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550179"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_evaluatorsThisExpression() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      this.addNodeById("607759879653675041");
      this.addNodeById("607759879653675023");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550219"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550219"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550226"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_field() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      this.addNodeById("607759879653675041");
      this.addNodeById("607759879653675023");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550235"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550235"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550245"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_localField() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      this.addNodeById("607759879653675041");
      this.addNodeById("607759879653675023");
      SNode fieldDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.cast(this.getNodeById("5543996881668550238"), "jetbrains.mps.baseLanguage.structure.DotExpression"), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation"), "fieldDeclaration", false);
      SNode instanceFieldReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference", null);
      SLinkOperations.setTarget(instanceFieldReference, "variableDeclaration", fieldDeclaration, false);
      SNodeOperations.replaceWithAnother(SNodeOperations.cast(this.getNodeById("5543996881668550238"), "jetbrains.mps.baseLanguage.structure.DotExpression"), instanceFieldReference);
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550235"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550235"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550245"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_staticField() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      this.addNodeById("607759879653675041");
      this.addNodeById("607759879653675023");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550260"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550260"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550269"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_localStaticField() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      this.addNodeById("607759879653675041");
      this.addNodeById("607759879653675023");
      SNode fieldDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(this.getNodeById("5543996881668550263"), "jetbrains.mps.baseLanguage.structure.StaticFieldReference"), "variableDeclaration", false);
      SNode staticFieldReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference", null);
      SLinkOperations.setTarget(staticFieldReference, "variableDeclaration", fieldDeclaration, false);
      SNodeOperations.replaceWithAnother(SNodeOperations.cast(this.getNodeById("5543996881668550263"), "jetbrains.mps.baseLanguage.structure.StaticFieldReference"), staticFieldReference);

      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550260"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550260"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550269"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_method() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      this.addNodeById("607759879653675041");
      this.addNodeById("607759879653675023");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550285"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550285"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550296"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_localMethod() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      this.addNodeById("607759879653675041");
      this.addNodeById("607759879653675023");
      SNode instanceMethodDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(this.getNodeById("5543996881668550288"), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"), "baseMethodDeclaration", false);
      List<SNode> arguments = SLinkOperations.getTargets(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(this.getNodeById("5543996881668550288"), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"), "actualArgument", true);
      SNode localInstanceMethodCall = new TransformationUtil_Test.TestBody.QuotationClass_tbx03_a0a51a7a().createNode(arguments);
      SLinkOperations.setTarget(localInstanceMethodCall, "baseMethodDeclaration", instanceMethodDeclaration, false);
      SNodeOperations.replaceWithAnother(SNodeOperations.cast(this.getNodeById("5543996881668550288"), "jetbrains.mps.baseLanguage.structure.DotExpression"), localInstanceMethodCall);
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550285"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550285"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550296"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_staticMethod() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      this.addNodeById("607759879653675041");
      this.addNodeById("607759879653675023");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("607759879653675043"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("607759879653675043"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("607759879653675024"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_staticLocalMethod() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      this.addNodeById("607759879653675041");
      this.addNodeById("607759879653675023");
      SNode staticMethodDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(this.getNodeById("607759879653675061"), "jetbrains.mps.baseLanguage.structure.StaticMethodCall"), "baseMethodDeclaration", false);
      List<SNode> arguments = SLinkOperations.getTargets(SNodeOperations.cast(this.getNodeById("607759879653675061"), "jetbrains.mps.baseLanguage.structure.StaticMethodCall"), "actualArgument", true);
      SNode localStaticMethodCall = new TransformationUtil_Test.TestBody.QuotationClass_tbx03_a0a51a9a().createNode(arguments);
      SLinkOperations.setTarget(localStaticMethodCall, "baseMethodDeclaration", staticMethodDeclaration, false);
      SNodeOperations.replaceWithAnother(SNodeOperations.cast(this.getNodeById("607759879653675061"), "jetbrains.mps.baseLanguage.structure.StaticMethodCall"), localStaticMethodCall);
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("607759879653675043"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("607759879653675043"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("607759879653675024"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public static class QuotationClass_tbx03_a0a51a7a {
      public QuotationClass_tbx03_a0a51a7a() {
      }

      public SNode createNode(Object parameter_4) {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        SNode quotedNode_2 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_3 = quotedNode_1;
          {
            List<SNode> nodes = (List<SNode>) parameter_4;
            for (SNode child : nodes) {
              quotedNode_1.addChild("actualArgument", HUtil.copyIfNecessary(child));
            }
          }
          result = quotedNode1_3;
        }
        return result;
      }
    }

    public static class QuotationClass_tbx03_a0a51a9a {
      public QuotationClass_tbx03_a0a51a9a() {
      }

      public SNode createNode(Object parameter_4) {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        SNode quotedNode_2 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_3 = quotedNode_1;
          {
            List<SNode> nodes = (List<SNode>) parameter_4;
            for (SNode child : nodes) {
              quotedNode_1.addChild("actualArgument", HUtil.copyIfNecessary(child));
            }
          }
          result = quotedNode1_3;
        }
        return result;
      }
    }
  }
}
