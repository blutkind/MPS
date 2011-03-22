package jetbrains.mps.baseLanguage.constructors.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class checkNumberOfArgs_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public checkNumberOfArgs_NonTypesystemRule() {
  }

  public void applyRule(final SNode customConstructorUsage, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode args = SLinkOperations.getTarget(SLinkOperations.getTarget(customConstructorUsage, "customConstructor", false), "arguments", true);
    if (SNodeOperations.isInstanceOf(args, "jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause")) {
      if (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(args, "jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause"), "parameter", true)).count() != ListSequence.fromList(SLinkOperations.getTargets(customConstructorUsage, "element", true)).count()) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(customConstructorUsage, "Wrong number of arguments", "r:c19fbfce-5c58-4528-8b93-60edfa062cac(jetbrains.mps.baseLanguage.constructors.typesystem)", "960932673514559399", null, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorUsage";
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
