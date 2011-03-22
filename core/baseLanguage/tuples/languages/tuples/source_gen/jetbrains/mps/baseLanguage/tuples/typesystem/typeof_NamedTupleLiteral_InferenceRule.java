package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.tuples.behavior.NamedTupleDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import java.util.Map;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.typesystem.RulesFunctions_BaseLanguage;
import jetbrains.mps.typesystem.inference.EquationInfo;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_NamedTupleLiteral_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_NamedTupleLiteral_InferenceRule() {
  }

  public void applyRule(final SNode literal, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (!(ListSequence.fromList(SLinkOperations.getTargets(literal, "componentRef", true)).count() == ListSequence.fromList(NamedTupleDeclaration_Behavior.call_allExtends_3142843783245461132(SLinkOperations.getTarget(literal, "tupleDeclaration", false))).foldLeft(0, new ILeftCombinator<SNode, Integer>() {
      public Integer combine(Integer s, SNode ntd) {
        return s + ListSequence.fromList(SLinkOperations.getTargets(ntd, "component", true)).count();
      }
    }))) {
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(literal, "Invalid components number", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239579091243", null, errorTarget);
    }
    Map<SNode, List<SNode>> mmap = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    for (SNode cmpRef : ListSequence.fromList(SLinkOperations.getTargets(literal, "componentRef", true))) {
      SNode matchedType = RulesFunctions_BaseLanguage.inference_matchTypeWithTypeVariables(typeCheckingContext, SLinkOperations.getTarget(SLinkOperations.getTarget(cmpRef, "componentDeclaration", false), "type", true), mmap);
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(cmpRef, "value", true);
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1901065672425830131", 0, null);
        typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1901065672425830133", true), (SNode) matchedType, false, _info_12389875345);
      }
    }
    List<SNode> PTYPES = new ArrayList<SNode>();
    for (SNode foo : ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(literal, "tupleDeclaration", false), "typeVariableDeclaration", true))) {
      List<SNode> nodes = MapSequence.fromMap(mmap).get(foo);
      final SNode PTYPE_typevar_1239968089672 = typeCheckingContext.createNewRuntimeTypesVariable();
      if (ListSequence.fromList(nodes).isNotEmpty()) {
        {
          SNode _nodeToCheck_1029348928467 = literal;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239968096090", 0, null);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.getRepresentative(PTYPE_typevar_1239968089672), (SNode) ListSequence.fromList(nodes).first(), _info_12389875345);
        }
      }
      ListSequence.fromList(PTYPES).addElement(typeCheckingContext.getRepresentative(PTYPE_typevar_1239968089672));
    }
    {
      SNode _nodeToCheck_1029348928467 = literal;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239901165879", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239968222968", true), (SNode) new typeof_NamedTupleLiteral_InferenceRule.QuotationClass_bcpcms_a0a5a0().createNode(PTYPES, SLinkOperations.getTarget(literal, "tupleDeclaration", false), typeCheckingContext), _info_12389875345);
    }
    RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(typeCheckingContext, mmap);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleLiteral";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_bcpcms_a0a5a0 {
    public QuotationClass_bcpcms_a0a5a0() {
    }

    public SNode createNode(Object parameter_4, Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("classifier", (SNode) parameter_5);
        {
          List<SNode> nodes = (List<SNode>) parameter_4;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(child, typeCheckingContext));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_4, Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("classifier", (SNode) parameter_5);
        {
          List<SNode> nodes = (List<SNode>) parameter_4;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
