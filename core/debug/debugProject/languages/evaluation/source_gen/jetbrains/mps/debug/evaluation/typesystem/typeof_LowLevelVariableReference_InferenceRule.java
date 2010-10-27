package jetbrains.mps.debug.evaluation.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_LowLevelVariableReference_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_LowLevelVariableReference_InferenceRule() {
  }

  public void applyRule(final SNode lowLevelVariableReference, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = lowLevelVariableReference;
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:1b2caefb-8c76-452e-a59a-bbd2c73d0b03(jetbrains.mps.debug.evaluation.typesystem)", "8054553590745291575", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:1b2caefb-8c76-452e-a59a-bbd2c73d0b03(jetbrains.mps.debug.evaluation.typesystem)", "8054553590745291572", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(lowLevelVariableReference, "baseVariableDeclaration", false), "r:1b2caefb-8c76-452e-a59a-bbd2c73d0b03(jetbrains.mps.debug.evaluation.typesystem)", "8054553590745291580", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.debug.evaluation.structure.LowLevelVariableReference";
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
}
