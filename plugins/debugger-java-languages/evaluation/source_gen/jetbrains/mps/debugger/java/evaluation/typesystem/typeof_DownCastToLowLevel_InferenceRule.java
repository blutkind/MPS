package jetbrains.mps.debugger.java.evaluation.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_DownCastToLowLevel_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_DownCastToLowLevel_InferenceRule() {
  }

  public void applyRule(final SNode downCastToLowLevel, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      final SNode e = typeCheckingContext.typeOf(SLinkOperations.getTarget(downCastToLowLevel, "expression", true), "r:1b2caefb-8c76-452e-a59a-bbd2c73d0b03(jetbrains.mps.debugger.java.evaluation.typesystem)", "7915630211773500867", true);
      typeCheckingContext.whenConcrete(e, new Runnable() {
        public void run() {
          {
            IMatchingPattern pattern_pc09cd_a0a0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.debugger.java.evaluation.structure.DebuggedType");
            SNode coercedNode_pc09cd_a0a0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getExpandedNode(e), pattern_pc09cd_a0a0);
            if (coercedNode_pc09cd_a0a0 != null) {
              {
                SNode _nodeToCheck_1029348928467 = downCastToLowLevel;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:1b2caefb-8c76-452e-a59a-bbd2c73d0b03(jetbrains.mps.debugger.java.evaluation.typesystem)", "7915630211773498604", 0, null);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:1b2caefb-8c76-452e-a59a-bbd2c73d0b03(jetbrains.mps.debugger.java.evaluation.typesystem)", "7915630211773498601", true), (SNode) SLinkOperations.getTarget(coercedNode_pc09cd_a0a0, "lowType", true), _info_12389875345);
              }
            } else {
            }
          }
        }
      }, "r:1b2caefb-8c76-452e-a59a-bbd2c73d0b03(jetbrains.mps.debugger.java.evaluation.typesystem)", "7915630211773500854", false, false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.debugger.java.evaluation.structure.DownCastToLowLevel";
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
