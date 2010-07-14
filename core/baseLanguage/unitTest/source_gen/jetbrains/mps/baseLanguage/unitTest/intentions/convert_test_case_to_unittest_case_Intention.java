package jetbrains.mps.baseLanguage.unitTest.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class convert_test_case_to_unittest_case_Intention extends BaseIntention implements Intention {
  public convert_test_case_to_unittest_case_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Convert to UnitTest Case";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.getConceptDeclaration(node) == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassConcept") && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(node, "superclass", true), new convert_test_case_to_unittest_case_Intention.QuotationClass_p2nyw8_a1a0a0a6().createNode());
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode testCase = SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.unitTest.structure.BTestCase");
    SPropertyOperations.set(testCase, "name", SPropertyOperations.getString(node, "name"));
    SPropertyOperations.set(testCase, "testCaseName", SPropertyOperations.getString(node, "name"));
    if ((SLinkOperations.getTarget(node, "superclass", true) != null) && SLinkOperations.getTarget(SLinkOperations.getTarget(node, "superclass", true), "classifier", false) != SLinkOperations.getTarget(new convert_test_case_to_unittest_case_Intention.QuotationClass_p2nyw8_a0a0a3a7().createNode(), "classifier", false)) {
      SLinkOperations.setTarget(SLinkOperations.getTarget(testCase, "superclass", true), "classifier", SLinkOperations.getTarget(SLinkOperations.getTarget(node, "superclass", true), "classifier", false), false);
    }
    for (SNode m : ListSequence.fromList(SLinkOperations.getTargets(node, "method", true))) {
      if (SPropertyOperations.getString(m, "name").startsWith("test")) {
        ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(testCase, "testMethodList", true), "testMethod", true)).addElement(new convert_test_case_to_unittest_case_Intention.QuotationClass_p2nyw8_a0a0a0a0e0h().createNode(SNodeOperations.detachNode(SLinkOperations.getTarget(m, "body", true)), SPropertyOperations.getString(m, "name").substring("test".length())));
      } else {
        ListSequence.fromList(SLinkOperations.getTargets(testCase, "method", true)).addElement(SNodeOperations.detachNode(m));
      }
    }
    for (SNode f : ListSequence.fromList(SLinkOperations.getTargets(node, "staticField", true))) {
      ListSequence.fromList(SLinkOperations.getTargets(testCase, "staticField", true)).addElement(SNodeOperations.detachNode(f));
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.unitTest.intentions";
  }

  public static class QuotationClass_p2nyw8_a1a0a0a6 {
    public QuotationClass_p2nyw8_a1a0a0a6() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#junit.framework(junit.framework@java_stub)"), SNodeId.fromString("~TestCase")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_p2nyw8_a0a0a3a7 {
    public QuotationClass_p2nyw8_a0a0a3a7() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#junit.framework(junit.framework@java_stub)"), SNodeId.fromString("~TestCase")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_p2nyw8_a0a0a0a0e0h {
    public QuotationClass_p2nyw8_a0a0a0a0e0h() {
    }

    public SNode createNode(Object parameter_7, Object parameter_8) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.TestMethod", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        quotedNode1_4.setProperty("methodName", (String) parameter_8);
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          quotedNode_1.addChild("returnType", quotedNode1_5);
        }
        {
          quotedNode_3 = (SNode) parameter_7;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_6 = CopyUtil.copy(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_6 = quotedNode_3;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("body", HUtil.copyIfNecessary(quotedNode1_6));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }
}
