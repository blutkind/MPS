package jetbrains.mps.lang.typesystem.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class superTypesOfMeet_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public superTypesOfMeet_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode meet, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return SLinkOperations.getTargets(meet, "argument", true);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.typesystem.structure.MeetType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean isWeak() {
    return false;
  }
}
