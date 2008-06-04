package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.constraints.ConceptFunction_Behavior;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ConceptFunction_InferenceRule implements InferenceRule_Runtime {

  public typeOf_ConceptFunction_InferenceRule() {
  }

  public void applyRule(final SNode func) {
    SNode expectedRetType = ConceptFunction_Behavior.call_getExpectedReturnType_1178571276073(func);
    boolean noReturnExpected = ((expectedRetType == null) || TypeChecker.getInstance().getSubtypingManager().isSubtype(expectedRetType, new QuotationClass_69().createNode()));
    if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(expectedRetType), "jetbrains.mps.baseLanguage.structure.WildCardType")) {
      // function is expected to return value of any type
      expectedRetType = null;
    }
    // =============
    Iterable<SNode> returnStatements = RulesFunctions_BaseLanguage.collectReturnStatements(SLinkOperations.getTarget(func, "body", true));
    boolean somethingReturned = Sequence.fromIterable(returnStatements).isNotEmpty();
    // =============
    final SNode LCS_typevar_1186052624152 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    if (noReturnExpected) {
      // shouldn't return any values
      for(SNode returnStatement : returnStatements) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) != null)) {
          {
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().reportTypeError(returnStatement, "no return value expected", "jetbrains.mps.baseLanguage.helgins", "1186053278842", intentionProvider);
          }
        }
      }
      TypeChecker.getInstance().getRuntimeSupport().givetype(null, func, "jetbrains.mps.baseLanguage.helgins", "1179436909754");
    } else
    {
      // should return subtypes of the 'expected type'
      // if 'expected type' is null - should still return some value (of any type)
      for(SNode returnStatement : returnStatements) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) == null)) {
          {
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().reportTypeError(returnStatement, "should return value", "jetbrains.mps.baseLanguage.helgins", "1186053304501", intentionProvider);
          }
        } else
        {
          TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(LCS_typevar_1186052624152), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(returnStatement, "expression", true), "jetbrains.mps.baseLanguage.helgins", "1186053304515", true), SLinkOperations.getTarget(returnStatement, "expression", true), null, "jetbrains.mps.baseLanguage.helgins", "1186053304511", false, 0);
        }
      }
      // last expression statement can serve as return statement
      SNode lastStatement = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(func, "body", true), "statement", true)).last();
      if (SNodeOperations.isInstanceOf(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
        SNode expression = SLinkOperations.getTarget(lastStatement, "expression", true);
        TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(LCS_typevar_1186052624152), TypeChecker.getInstance().getRuntimeSupport().typeOf(expression, "jetbrains.mps.baseLanguage.helgins", "1186053084979", true), expression, null, "jetbrains.mps.baseLanguage.helgins", "1186053063874", false, 0);
        somethingReturned = true;
      }
      if (!(somethingReturned)) {
        String whatExpected = ((expectedRetType == null) ?
          "some value" :
          "" + expectedRetType
        );
        {
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().reportTypeError(func, "function should return " + whatExpected, "jetbrains.mps.baseLanguage.helgins", "1179436928064", intentionProvider);
        }
      }
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(func, "jetbrains.mps.baseLanguage.helgins", "1186053169643", true), TypeChecker.getInstance().getEquationManager().getRepresentator(LCS_typevar_1186052624152), func, null, "jetbrains.mps.baseLanguage.helgins", "1186053174208");
      if ((expectedRetType != null)) {
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(func, "jetbrains.mps.baseLanguage.helgins", "1186053540851", true), expectedRetType, func, null, "jetbrains.mps.baseLanguage.helgins", "1186053540847", false, 0);
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

}
