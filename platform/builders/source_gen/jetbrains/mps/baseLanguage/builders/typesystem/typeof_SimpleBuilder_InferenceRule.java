package jetbrains.mps.baseLanguage.builders.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SimpleBuilder_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SimpleBuilder_InferenceRule() {
  }

  public void applyRule(final SNode builder, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (ListSequence.fromList(SLinkOperations.getTargets(builder, "argument", true)).count() != ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(builder, "declaration", false), "parameter", true)).count()) {
      {
        BaseQuickFixProvider intentionProvider = null;
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(builder, "Wrong number of parameters", "r:35ef73a5-9726-4c66-9d79-f51c95cc08d6(jetbrains.mps.baseLanguage.builders.typesystem)", "4315270135340741370", intentionProvider, errorTarget);
      }
      return;
    }

    for (int i = 0; i < ListSequence.fromList(SLinkOperations.getTargets(builder, "argument", true)).count(); i++) {
      {
        SNode _nodeToCheck_1029348928467 = ListSequence.fromList(SLinkOperations.getTargets(builder, "argument", true)).getElement(i);
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:35ef73a5-9726-4c66-9d79-f51c95cc08d6(jetbrains.mps.baseLanguage.builders.typesystem)", "4315270135340745084", 0, intentionProvider);
        _info_12389875345.setInequationGroup("default");
        typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:35ef73a5-9726-4c66-9d79-f51c95cc08d6(jetbrains.mps.baseLanguage.builders.typesystem)", "4315270135340745046", true), (SNode) SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(builder, "declaration", false), "parameter", true)).getElement(i), "type", true), false, _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilder";
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
