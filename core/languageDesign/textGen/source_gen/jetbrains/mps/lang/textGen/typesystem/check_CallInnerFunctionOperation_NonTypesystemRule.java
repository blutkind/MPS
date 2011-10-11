package jetbrains.mps.lang.textGen.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_CallInnerFunctionOperation_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_CallInnerFunctionOperation_NonTypesystemRule() {
  }

  public void applyRule(final SNode innerMethodCall, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode baseMethodDeclaration = SLinkOperations.getTarget(innerMethodCall, "function", false);
    boolean b = true;
    List<SNode> parameterDeclarations = SLinkOperations.getTargets(baseMethodDeclaration, "parameter", true);
    List<SNode> actualArguments = SLinkOperations.getTargets(innerMethodCall, "parameter", true);
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ListSequence.fromList(parameterDeclarations).last(), "type", true), "jetbrains.mps.baseLanguage.structure.VariableArityType")) {
      b = ListSequence.fromList(parameterDeclarations).count() - 1 <= ListSequence.fromList(actualArguments).count();
    } else {
      b = (int) ListSequence.fromList(parameterDeclarations).count() == (int) ListSequence.fromList(actualArguments).count();
    }
    if (!(b)) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(innerMethodCall, "wrong number of parameters", "r:f568ac81-f20d-491c-8e81-330fbdff24e6(jetbrains.mps.lang.textGen.typesystem)", "1234279065022", null, errorTarget);
      }
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(baseMethodDeclaration, "typeVariableDeclaration", true)).count() > 0) {
      for (SNode actual : actualArguments) {
        typeCheckingContext.addDependencyForCurrent(actual);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.textGen.structure.OperationCall";
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
