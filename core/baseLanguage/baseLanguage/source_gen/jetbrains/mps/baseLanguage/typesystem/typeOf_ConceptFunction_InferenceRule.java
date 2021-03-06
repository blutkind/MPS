package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.baseLanguage.behavior.IMethodLike_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class typeOf_ConceptFunction_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_ConceptFunction_InferenceRule() {
  }

  public void applyRule(final SNode func, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode expectedRetType = ConceptFunction_Behavior.call_getExpectedReturnType_1213877374441(func);
    boolean noReturnExpected = ((expectedRetType == null) || TypeChecker.getInstance().getSubtypingManager().isSubtype(expectedRetType, new typeOf_ConceptFunction_InferenceRule.QuotationClass_bbraw4_a1a0a0a1a0().createNode(typeCheckingContext)));
    if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(expectedRetType), "jetbrains.mps.baseLanguage.structure.WildCardType")) {
      // function is expected to return value of any type 
      expectedRetType = null;
    }
    if (!(noReturnExpected)) {
      final SNode LCS_typevar_1186052624152 = typeCheckingContext.createNewRuntimeTypesVariable();
      Iterable<SNode> returnStatements = RulesFunctions_BaseLanguage.collectReturnStatements(SLinkOperations.getTarget(func, "body", true));
      // should return subtypes of the 'expected type' 
      // if 'expected type' is null - should still return some value (of any type) 
      for (SNode returnStatement : Sequence.fromIterable(returnStatements)) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) == null)) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(returnStatement, "should return value", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053304501", null, errorTarget);
          }
        } else {
          {
            SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(returnStatement, "expression", true);
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053304511", 0, null);
            typeCheckingContext.createGreaterThanInequality((SNode) typeCheckingContext.getRepresentative(LCS_typevar_1186052624152), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053304515", true), false, true, _info_12389875345);
          }
          if ((expectedRetType != null)) {
            {
              SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(returnStatement, "expression", true);
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7630810368327770735", 0, null);
              typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7630810368327770718", true), (SNode) expectedRetType, true, true, _info_12389875345);
            }
          }
        }
      }
      // last expression statement can serve as return statement 
      SNode lastStatement = IMethodLike_Behavior.call_getLastStatement_1239354409446(func);
      if (SNodeOperations.isInstanceOf(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
        SNode expression = SLinkOperations.getTarget(SNodeOperations.cast(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true);
        {
          SNode _nodeToCheck_1029348928467 = expression;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053063874", 0, null);
          typeCheckingContext.createGreaterThanInequality((SNode) typeCheckingContext.getRepresentative(LCS_typevar_1186052624152), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053084979", true), false, true, _info_12389875345);
        }
        if ((expectedRetType != null)) {
          {
            SNode _nodeToCheck_1029348928467 = expression;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7630810368327770756", 0, null);
            typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7630810368327770753", true), (SNode) expectedRetType, true, true, _info_12389875345);
          }
        }
      }
      {
        SNode _nodeToCheck_1029348928467 = func;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053174208", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053169643", true), (SNode) typeCheckingContext.getRepresentative(LCS_typevar_1186052624152), _info_12389875345);
      }
      if ((expectedRetType != null)) {
        {
          SNode _nodeToCheck_1029348928467 = func;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053540847", 0, null);
          typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053540851", true), (SNode) expectedRetType, false, true, _info_12389875345);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ConceptFunction";
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

  public static class QuotationClass_bbraw4_a1a0a0a1a0 {
    public QuotationClass_bbraw4_a1a0a0a1a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", null, GlobalScope.getInstance(), false);
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
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
