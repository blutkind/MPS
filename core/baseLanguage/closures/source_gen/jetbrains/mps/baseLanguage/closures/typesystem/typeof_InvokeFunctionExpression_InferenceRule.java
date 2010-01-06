package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.CopyUtil;

public class typeof_InvokeFunctionExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_InvokeFunctionExpression_InferenceRule() {
  }

  public void applyRule(final SNode invoke, final TypeCheckingContext typeCheckingContext) {
    List<SNode> ptypes = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode p : SLinkOperations.getTargets(invoke, "parameter", true)) {
      ListSequence.fromList(ptypes).addElement(typeCheckingContext.typeOf(p, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237042865071", true));
    }
    final SNode ret_typevar_1225470166995 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = invoke;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1225470166996", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1225470167000", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_1225470166995), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(invoke, "function", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1225470167002", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1225470167013", true), (SNode) new typeof_InvokeFunctionExpression_InferenceRule.QuotationClass_9028_0().createNode(ptypes, typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_1225470166995), typeCheckingContext), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_9028_0 {
    public QuotationClass_9028_0() {
    }

    public SNode createNode(Object parameter_9028_0, Object parameter_9028_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0 = null;
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0 = quotedNode_0;
        {
          List<SNode> nodes = (List<SNode>) parameter_9028_0;
          for (SNode child : nodes) {
            quotedNode_0.addChild("parameterType", HUtil.copyIfNecessary(child, typeCheckingContext));
          }
        }
        {
          quotedNode_2 = (SNode) parameter_9028_1;
          SNode quotedNode1_1;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_1 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_1 = quotedNode_2;
          }
          if (quotedNode1_1 != null) {
            quotedNode_0.addChild("resultType", HUtil.copyIfNecessary(quotedNode1_1, typeCheckingContext));
          }
        }
        result = quotedNode1_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_9028_0, Object parameter_9028_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0 = null;
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0 = quotedNode_0;
        {
          List<SNode> nodes = (List<SNode>) parameter_9028_0;
          for (SNode child : nodes) {
            quotedNode_0.addChild("parameterType", HUtil.copyIfNecessary(child));
          }
        }
        {
          quotedNode_2 = (SNode) parameter_9028_1;
          SNode quotedNode1_1;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_1 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_1 = quotedNode_2;
          }
          if (quotedNode1_1 != null) {
            quotedNode_0.addChild("resultType", HUtil.copyIfNecessary(quotedNode1_1));
          }
        }
        result = quotedNode1_0;
      }
      return result;
    }
  }
}
