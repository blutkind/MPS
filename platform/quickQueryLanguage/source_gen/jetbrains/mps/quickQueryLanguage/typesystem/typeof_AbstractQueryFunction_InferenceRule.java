package jetbrains.mps.quickQueryLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.behavior.IMethodLike_Behavior;
import jetbrains.mps.baseLanguage.typesystem.RulesFunctions_BaseLanguage;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AbstractQueryFunction_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_AbstractQueryFunction_InferenceRule() {
  }

  public void applyRule(final SNode bmd, final TypeCheckingContext typeCheckingContext) {
    SNode expectedRetType = IMethodLike_Behavior.call_getExpectedRetType_1239354342632(bmd);
    Iterable<SNode> returnStatements = RulesFunctions_BaseLanguage.collectReturnStatements(SLinkOperations.getTarget(bmd, "body", true));
    if (expectedRetType == null) {
      for (SNode returnStatement : Sequence.fromIterable(returnStatements)) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) != null)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(returnStatement, "no return value expected", "r:00000000-0000-4000-0000-011c8959050e(jetbrains.mps.quickQueryLanguage.typesystem)", "5046156961652249728", intentionProvider, errorTarget);
          }
        }
      }
    } else {
      for (SNode returnStatement : Sequence.fromIterable(returnStatements)) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) == null)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(returnStatement, "should return value", "r:00000000-0000-4000-0000-011c8959050e(jetbrains.mps.quickQueryLanguage.typesystem)", "5046156961652249747", intentionProvider, errorTarget);
          }
        } else {
          SNode returnType = typeCheckingContext.typeOf(SLinkOperations.getTarget(returnStatement, "expression", true), "r:00000000-0000-4000-0000-011c8959050e(jetbrains.mps.quickQueryLanguage.typesystem)", "5046156961652249760", true);
          {
            SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(returnStatement, "expression", true);
            BaseIntentionProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, "" + expectedRetType + " is expected", "r:00000000-0000-4000-0000-011c8959050e(jetbrains.mps.quickQueryLanguage.typesystem)", "5046156961652249764", 0, intentionProvider);
            _info_12389875345.setInequationGroup("default");
            typeCheckingContext.createLessThanInequation((SNode) returnType, (SNode) expectedRetType, false, _info_12389875345);
          }
        }
      }
    }
    if (expectedRetType != null) {
      SNode lastStatement = IMethodLike_Behavior.call_getLastStatement_1239354409446(bmd);
      if (SNodeOperations.isInstanceOf(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
        SNode returnType = typeCheckingContext.typeOf(SLinkOperations.getTarget(SNodeOperations.cast(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true), "r:00000000-0000-4000-0000-011c8959050e(jetbrains.mps.quickQueryLanguage.typesystem)", "5046156961652249794", true);
        {
          SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SNodeOperations.cast(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true);
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, expectedRetType + " is expected", "r:00000000-0000-4000-0000-011c8959050e(jetbrains.mps.quickQueryLanguage.typesystem)", "5046156961652249799", 0, intentionProvider);
          _info_12389875345.setInequationGroup("default");
          typeCheckingContext.createLessThanInequation((SNode) returnType, (SNode) expectedRetType, false, _info_12389875345);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.quickQueryLanguage.structure.AbstractQueryFunction";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
