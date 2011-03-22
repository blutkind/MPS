package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_PropertyAttributeAccessQualifier_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_PropertyAttributeAccessQualifier_NonTypesystemRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    final SNode propQ = SLinkOperations.getTarget(nodeToCheck, "propertyQualifier", true);
    if (SNodeOperations.isInstanceOf(propQ, "jetbrains.mps.lang.smodel.structure.PropertyRefQualifier")) {
      final SNode property = SLinkOperations.getTarget(SNodeOperations.cast(propQ, "jetbrains.mps.lang.smodel.structure.PropertyRefQualifier"), "property", false);
      SNode conceptDeclaration = RulesUtil.get_inputNodeConcept(SNodeOperations.getAncestor(nodeToCheck, "jetbrains.mps.lang.smodel.structure.SNodeOperation", false, false), false);
      SNode inputNodeConcept = conceptDeclaration;
      List<SNode> declaredProperties = AbstractConceptDeclaration_Behavior.call_getPropertyDeclarations_1213877394546(inputNodeConcept);
      if (!(ListSequence.fromList(declaredProperties).contains(property))) {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(propQ, "access to property '" + SPropertyOperations.getString(property, "name") + "' is not expected here", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1226067188701", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.PropertyAttributeAccessQualifier";
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
