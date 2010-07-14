package jetbrains.mps.lang.test.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class typeof_AssertMatch_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_AssertMatch_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    for (SNode node : ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "before", true))) {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1211982433132", 0, intentionProvider);
        _info_12389875345.setInequationGroup("default");
        typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1211982433134", true), (SNode) new typeof_AssertMatch_InferenceRule.QuotationClass_qwyt5f_a0a0a0a0().createNode(typeCheckingContext), false, _info_12389875345);
      }
    }
    for (SNode node : ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "after", true))) {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1211982429078", 0, intentionProvider);
        _info_12389875345.setInequationGroup("default");
        typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1211982429080", true), (SNode) new typeof_AssertMatch_InferenceRule.QuotationClass_qwyt5f_a0a0a1a0().createNode(typeCheckingContext), false, _info_12389875345);
      }
    }
    {
      SNode nodeBefore;
      SNode nodeAfter;
      Iterator<SNode> nodeBefore_iterator = ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "before", true)).iterator();
      Iterator<SNode> nodeAfter_iterator = ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "after", true)).iterator();
      while (true) {
        if (!(nodeBefore_iterator.hasNext())) {
          break;
        }
        if (!(nodeAfter_iterator.hasNext())) {
          break;
        }
        nodeBefore = nodeBefore_iterator.next();
        nodeAfter = nodeAfter_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = nodeBefore;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1214922658994", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1214922647143", true), (SNode) typeCheckingContext.typeOf(nodeAfter, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1214922660624", true), _info_12389875345);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.test.structure.AssertMatch";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_qwyt5f_a0a0a0a0 {
    public QuotationClass_qwyt5f_a0a0a0a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qwyt5f_a0a0a1a0 {
    public QuotationClass_qwyt5f_a0a0a1a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
