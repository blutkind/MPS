package jetbrains.mps.lang.actions.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConceptSubstitutePart_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_ConceptSubstitutePart_NonTypesystemRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode builder = SNodeOperations.getAncestor(nodeToCheck, "jetbrains.mps.lang.actions.structure.NodeSubstituteActionsBuilder", false, false);
    SNode substituteConcept = SLinkOperations.getTarget(builder, "applicableConcept", false);
    SNode conceptToAdd = SLinkOperations.getTarget(nodeToCheck, "concept", false);
    if (!(SConceptOperations.isSubConceptOf(conceptToAdd, NameUtil.nodeFQName(substituteConcept)))) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeToCheck, "Wrong concept to add. Use subtype of " + INamedConcept_Behavior.call_getFqName_1213877404258(substituteConcept), "r:00000000-0000-4000-0000-011c895902a6(jetbrains.mps.lang.actions.typesystem)", "1197896061431", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.actions.structure.ConceptSubstitutePart";
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
