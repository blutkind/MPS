package jetbrains.mps.lang.pattern.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import java.util.List;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.lang.pattern.IMatchingPattern;

@MPSLaunch
public class PatternListPattern_Test extends BaseTransformationTest {
  public PatternListPattern_Test() {
  }

  @Test
  public void testMethod() throws Throwable {
    this.initTest("${mps_home}/MPS.mpr", "r:ef0e231b-e6bd-436f-9003-b53de4081716(jetbrains.mps.lang.pattern.test)");
    this.runTest("jetbrains.mps.lang.pattern.test.PatternListPattern_Test$TestBody", "testListPattern", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public TestBody() {
    }

    public void testListPattern() {
      assertTrue(match());

    }

    public boolean match() {
      SNode nodeToMatch = new PatternListPattern_Test.TestBody.QuotationClass_i79cpz_a0a0a1a().createNode();
      GeneratedMatchingPattern pattern = new PatternListPattern_Test.TestBody.Pattern_i79cpz_a0a1a1a();
      boolean matchNeeded = true;
      boolean matches = pattern.match(nodeToMatch);
      if (matchNeeded != matches) {
        return false;
      }
      if (!(matchNeeded)) {
        return true;
      }
      {
        List<SNode> list = (List<SNode>) pattern.getFieldValue("PatternVar_list");
        int i = 0;
        Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), list.get(i)), ListSequence.fromListAndArray(new ArrayList<SNode>(), new PatternListPattern_Test.TestBody.QuotationClass_i79cpz_a1b0a0c0g0b0().createNode())));
        i++;
        Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), list.get(i)), ListSequence.fromListAndArray(new ArrayList<SNode>(), new PatternListPattern_Test.TestBody.QuotationClass_i79cpz_a1b0a0d0g0b0().createNode())));
        i++;
      }
      return true;
    }

    public static class QuotationClass_i79cpz_a0a0a1a {
      public QuotationClass_i79cpz_a0a0a1a() {
      }

      public SNode createNode() {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        SNode quotedNode_2 = null;
        SNode quotedNode_3 = null;
        SNode quotedNode_4 = null;
        SNode quotedNode_5 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_1;
          {
            quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_7 = quotedNode_2;
            quotedNode1_7.addReference(SReference.create("classifier", quotedNode1_7, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~System")));
            quotedNode1_7.addReference(SReference.create("variableDeclaration", quotedNode1_7, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~System.out")));
            quotedNode_1.addChild("operand", quotedNode1_7);
          }
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_8 = quotedNode_3;
            quotedNode1_8.addReference(SReference.create("baseMethodDeclaration", quotedNode1_8, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object.wait(long,int):void")));
            {
              quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_9 = quotedNode_4;
              quotedNode1_9.setProperty("value", "10");
              quotedNode_3.addChild("actualArgument", quotedNode1_9);
            }
            {
              quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_10 = quotedNode_5;
              quotedNode1_10.setProperty("value", "10");
              quotedNode_3.addChild("actualArgument", quotedNode1_10);
            }
            quotedNode_1.addChild("operation", quotedNode1_8);
          }
          result = quotedNode1_6;
        }
        return result;
      }
    }

    public static class Pattern_i79cpz_a0a1a1a extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ List<SNode> patternVar_list;
      /*package*/ SNode patternVar_ignore;
      /*package*/ SNode patternVar_field;
      /*package*/ SNode patternVar_className;
      /*package*/ SNode patternVar_method;

      public Pattern_i79cpz_a0a1a1a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_9twfax_a0;
          nodeToMatch_9twfax_a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.DotExpression".equals(nodeToMatch_9twfax_a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_9twfax_ = "operation";
            if (nodeToMatch_9twfax_a0.getChildCount(childRole_9twfax_) != 1) {
              return false;
            }
            {
              SNode childVar_9twfax_a0a = nodeToMatch_9twfax_a0.getChildren(childRole_9twfax_).get(0);
              {
                SNode nodeToMatch_9twfax_a0a;
                nodeToMatch_9twfax_a0a = childVar_9twfax_a0a;
                if (!("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation".equals(nodeToMatch_9twfax_a0a.getConceptFqName()))) {
                  return false;
                }
                patternVar_method = nodeToMatch_9twfax_a0a.getReferent("baseMethodDeclaration");
                {
                  String childRole_9twfax__0 = "actualArgument";
                  this.patternVar_list = ListSequence.fromList(new ArrayList<SNode>());
                  patternVar_ignore = null;
                  for (SNode childVar : nodeToMatch_9twfax_a0a.getChildren(childRole_9twfax__0)) {
                    patternVar_ignore = childVar;
                    ListSequence.fromList(this.patternVar_list).addElement(childVar);
                  }
                }
              }
            }
          }
          {
            String childRole_9twfax__1 = "operand";
            if (nodeToMatch_9twfax_a0.getChildCount(childRole_9twfax__1) != 1) {
              return false;
            }
            {
              SNode childVar_9twfax_a0a_0 = nodeToMatch_9twfax_a0.getChildren(childRole_9twfax__1).get(0);
              {
                SNode nodeToMatch_9twfax_a0a_0;
                nodeToMatch_9twfax_a0a_0 = childVar_9twfax_a0a_0;
                if (!("jetbrains.mps.baseLanguage.structure.StaticFieldReference".equals(nodeToMatch_9twfax_a0a_0.getConceptFqName()))) {
                  return false;
                }
                patternVar_field = nodeToMatch_9twfax_a0a_0.getReferent("variableDeclaration");
                patternVar_className = nodeToMatch_9twfax_a0a_0.getReferent("classifier");
              }
            }
          }
        }
        return true;
      }

      public boolean hasAntiquotations() {
        return false;
      }

      public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
        if (pattern != null && pattern.getClass() == this.getClass()) {
          patternVar_list = (List<SNode>) pattern.getFieldValue("patternVar_list");
          patternVar_ignore = (SNode) pattern.getFieldValue("patternVar_ignore");
          patternVar_field = (SNode) pattern.getFieldValue("patternVar_field");
          patternVar_className = (SNode) pattern.getFieldValue("patternVar_className");
          patternVar_method = (SNode) pattern.getFieldValue("patternVar_method");
        }
      }

      public Object getFieldValue(String fieldName) {
        if ("patternVar_list".equals(fieldName)) {
          return patternVar_list;
        }
        if ("patternVar_ignore".equals(fieldName)) {
          return patternVar_ignore;
        }
        if ("patternVar_field".equals(fieldName)) {
          return patternVar_field;
        }
        if ("patternVar_className".equals(fieldName)) {
          return patternVar_className;
        }
        if ("patternVar_method".equals(fieldName)) {
          return patternVar_method;
        }
        return null;
      }

      public void performActions(Object o) {
      }
    }

    public static class QuotationClass_i79cpz_a1b0a0c0g0b0 {
      public QuotationClass_i79cpz_a1b0a0c0g0b0() {
      }

      public SNode createNode() {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_2 = quotedNode_1;
          quotedNode1_2.setProperty("value", "10");
          result = quotedNode1_2;
        }
        return result;
      }
    }

    public static class QuotationClass_i79cpz_a1b0a0d0g0b0 {
      public QuotationClass_i79cpz_a1b0a0d0g0b0() {
      }

      public SNode createNode() {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_2 = quotedNode_1;
          quotedNode1_2.setProperty("value", "10");
          result = quotedNode1_2;
        }
        return result;
      }
    }
  }
}
