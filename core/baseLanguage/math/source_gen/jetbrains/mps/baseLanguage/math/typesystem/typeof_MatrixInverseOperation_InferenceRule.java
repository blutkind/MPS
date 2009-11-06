package jetbrains.mps.baseLanguage.math.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MatrixInverseOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_MatrixInverseOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    {
      final SNode t = typeCheckingContext.typeOf(SLinkOperations.getTarget(op, "expr", true), "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "7388416617632229396", true);
      typeCheckingContext.whenConcrete(t, new Runnable() {
        public void run() {
          if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(t), "jetbrains.mps.baseLanguage.math.structure.MatrixType")) {
            {
              SNode _nodeToCheck_1029348928467 = op;
              BaseIntentionProvider intentionProvider = null;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "9195559275659749153", 0, intentionProvider);
              _info_12389875345.setInequationGroup("default");
              typeCheckingContext.createLessThanInequation((SNode)MathTypeUtil.qFloat, (SNode)MathTypeUtil.getElementType(typeCheckingContext.getEquationManager().getRepresentator(t)), false, _info_12389875345);
            }
            {
              SNode _nodeToCheck_1029348928467 = op;
              BaseIntentionProvider intentionProvider = null;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "9195559275659749160", 0, intentionProvider);
              typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "9195559275659749167", true), (SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(op, "expr", true), "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "9195559275659749162", true), _info_12389875345);
            }
            SNode mt = SNodeOperations.cast(typeCheckingContext.getEquationManager().getRepresentator(t), "jetbrains.mps.baseLanguage.math.structure.MatrixType");
            if (SPropertyOperations.getInteger(mt, "rows") != 0 && SPropertyOperations.getInteger(mt, "columns") != 0 && SPropertyOperations.getInteger(mt, "rows") != SPropertyOperations.getInteger(mt, "columns")) {
              {
                BaseIntentionProvider intentionProvider = null;
                IErrorTarget errorTarget = new NodeErrorTarget();
                IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(op, "Inverse operation is undefined for non-square matrices", "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "7388416617632229476", intentionProvider, errorTarget);
              }
            }
          } else {
            {
              BaseIntentionProvider intentionProvider = null;
              IErrorTarget errorTarget = new NodeErrorTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(op, "Inverse operation is defined for matrices only", "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "9195559275659749171", intentionProvider, errorTarget);
            }
          }
        }
      }, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "7388416617632229393", false, false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.MatrixInverseOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
