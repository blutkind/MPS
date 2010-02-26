package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.baseLanguage.behavior.IMethodLike_Behavior;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.baseLanguage.behavior.StatementList_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class typeOf_ConceptFunction_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_ConceptFunction_InferenceRule() {
  }

  public void applyRule(final SNode func, final TypeCheckingContext typeCheckingContext) {
    SNode expectedRetType = ConceptFunction_Behavior.call_getExpectedReturnType_1213877374441(func);
    boolean noReturnExpected = ((expectedRetType == null) || TypeChecker.getInstance().getSubtypingManager().isSubtype(expectedRetType, new typeOf_ConceptFunction_InferenceRule.QuotationClass_bbraw4_a1a0a0a1a0().createNode(typeCheckingContext)));
    if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(expectedRetType), "jetbrains.mps.baseLanguage.structure.WildCardType")) {
      // function is expected to return value of any type 
      expectedRetType = null;
    }
    // ============= 
    Iterable<SNode> returnStatements = RulesFunctions_BaseLanguage.collectReturnStatements(SLinkOperations.getTarget(func, "body", true));
    boolean somethingReturned = Sequence.fromIterable(returnStatements).isNotEmpty();
    // ============= 
    final SNode LCS_typevar_1186052624152 = typeCheckingContext.createNewRuntimeTypesVariable();
    if (noReturnExpected) {
      // shouldn't return any values 
      for (SNode returnStatement : Sequence.fromIterable(returnStatements)) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) != null)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(returnStatement, "no return value expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053278842", intentionProvider, errorTarget);
          }
        }
      }
      {
        SNode _nodeToCheck_1029348928467 = func;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223981485205", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223981485210", true), (SNode) null, _info_12389875345);
      }
    } else {
      // should return subtypes of the 'expected type' 
      // if 'expected type' is null - should still return some value (of any type) 
      for (SNode returnStatement : Sequence.fromIterable(returnStatements)) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) == null)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(returnStatement, "should return value", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053304501", intentionProvider, errorTarget);
          }
        } else {
          {
            SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(returnStatement, "expression", true);
            BaseIntentionProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053304511", 0, intentionProvider);
            _info_12389875345.setInequationGroup("default");
            typeCheckingContext.createGreaterThanInequation((SNode) typeCheckingContext.getEquationManager().getRepresentator(LCS_typevar_1186052624152), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053304515", true), false, _info_12389875345);
          }
          if ((expectedRetType != null)) {
            {
              SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(returnStatement, "expression", true);
              BaseIntentionProvider intentionProvider = null;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7630810368327770735", 0, intentionProvider);
              _info_12389875345.setInequationGroup("default");
              typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7630810368327770718", true), (SNode) expectedRetType, true, _info_12389875345);
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
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053063874", 0, intentionProvider);
          _info_12389875345.setInequationGroup("default");
          typeCheckingContext.createGreaterThanInequation((SNode) typeCheckingContext.getEquationManager().getRepresentator(LCS_typevar_1186052624152), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053084979", true), false, _info_12389875345);
        }
        if ((expectedRetType != null)) {
          {
            SNode _nodeToCheck_1029348928467 = expression;
            BaseIntentionProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7630810368327770756", 0, intentionProvider);
            _info_12389875345.setInequationGroup("default");
            typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7630810368327770753", true), (SNode) expectedRetType, true, _info_12389875345);
          }
        }
        somethingReturned = true;
      }
      if (!(somethingReturned)) {
        Set<SNode> throwables = SetSequence.fromSet(new HashSet());
        StatementList_Behavior.call_collectUncaughtThrowables_5412515780383134474(IMethodLike_Behavior.call_getBody_1239354440022(func), throwables, true);
        if (SetSequence.fromSet(throwables).isEmpty()) {
          String whatExpected = ((expectedRetType == null) ?
            "some value" :
            "" + expectedRetType
          );
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(func, "function should return " + whatExpected, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "4313092516462081125", intentionProvider, errorTarget);
          }
        }
      }
      {
        SNode _nodeToCheck_1029348928467 = func;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053174208", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053169643", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(LCS_typevar_1186052624152), _info_12389875345);
      }
      if ((expectedRetType != null)) {
        {
          SNode _nodeToCheck_1029348928467 = func;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053540847", 0, intentionProvider);
          _info_12389875345.setInequationGroup("default");
          typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1186053540851", true), (SNode) expectedRetType, false, _info_12389875345);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ConceptFunction";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
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
      SNode quotedNode_bbraw4_a1a0a0a1a0 = null;
      {
        quotedNode_bbraw4_a1a0a0a1a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_bbraw4_a1a0a0a1a0 = quotedNode_bbraw4_a1a0a0a1a0;
        result = quotedNode1_bbraw4_a1a0a0a1a0;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_bbraw4_a1a0a0a1a0 = null;
      {
        quotedNode_bbraw4_a1a0a0a1a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_bbraw4_a1a0a0a1a0 = quotedNode_bbraw4_a1a0a0a1a0;
        result = quotedNode1_bbraw4_a1a0a0a1a0;
      }
      return result;
    }
  }
}
