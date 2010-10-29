package jetbrains.mps.baseLanguage.math.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;

public class matrix_vector_replacement_rule_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public matrix_vector_replacement_rule_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext, IsApplicable2Status status) {
    {
      SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "6389121991275039360", 0, intentionProvider);
      _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) SLinkOperations.getTarget(subtype, "elementType", true), (SNode) SLinkOperations.getTarget(supertype, "elementType", true), false, _info_12389875345);
    }
    if (SPropertyOperations.getInteger(supertype, "columns") != 0) {
      if (!(1 == SPropertyOperations.getInteger(supertype, "columns"))) {
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), " invalid matrix dimensions", "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "6389121991275039373", intentionProvider, errorTarget);
          HUtil.addAdditionalRuleIdsFromInfo(_reporter_2309309498, equationInfo);
        }
      }
    }
    if (SPropertyOperations.getInteger(subtype, "height") != 0 && SPropertyOperations.getInteger(supertype, "rows") != 0) {
      if (!(SPropertyOperations.getInteger(subtype, "height") == SPropertyOperations.getInteger(supertype, "rows"))) {
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), " invalid matrix dimensions", "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "6389121991275039401", intentionProvider, errorTarget);
          HUtil.addAdditionalRuleIdsFromInfo(_reporter_2309309498, equationInfo);
        }
      }
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, IsApplicable2Status status) {
    boolean result_14532009 = true;
    result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) SLinkOperations.getTarget(subtype, "elementType", true), (SNode) SLinkOperations.getTarget(supertype, "elementType", true), true);
    if (SPropertyOperations.getInteger(supertype, "columns") != 0) {
      if (!(1 == SPropertyOperations.getInteger(supertype, "columns"))) {
        result_14532009 = false;
      }
    }
    if (SPropertyOperations.getInteger(subtype, "height") != 0 && SPropertyOperations.getInteger(supertype, "rows") != 0) {
      if (!(SPropertyOperations.getInteger(subtype, "height") == SPropertyOperations.getInteger(supertype, "rows"))) {
        result_14532009 = false;
      }
    }
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public IsApplicableStatus isApplicableSubtypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public IsApplicableStatus isApplicableSupertypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.VectorType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.MatrixType";
  }
}
