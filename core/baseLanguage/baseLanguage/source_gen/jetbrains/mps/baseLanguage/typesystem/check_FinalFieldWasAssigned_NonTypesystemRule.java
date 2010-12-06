package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_FinalFieldWasAssigned_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_FinalFieldWasAssigned_NonTypesystemRule() {
  }

  public void applyRule(final SNode field, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SLinkOperations.getTarget(field, "initializer", true) != null) {
      return;
    }
    SNode classifier = SNodeOperations.getAncestor(field, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if (classifier == null) {
      return;
    }

    List<SNode> mayInitialize = new ArrayList<SNode>();
    ListSequence.fromList(mayInitialize).addElement(SLinkOperations.getTarget(classifier, "instanceInitializer", true));
    ListSequence.fromList(mayInitialize).addSequence(ListSequence.fromList(SLinkOperations.getTargets(classifier, "constructor", true)));
    for (SNode member : mayInitialize) {
      if (member != null) {
        for (SNode reference : SNodeOperations.getDescendants(member, "jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference", false, new String[]{})) {
          if (SLinkOperations.getTarget(reference, "variableDeclaration", false) == field && CheckingUtil.isAssigned(reference)) {
            return;
          }
        }
        for (SNode reference : SNodeOperations.getDescendants(member, "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", false, new String[]{})) {
          if (SLinkOperations.getTarget(reference, "fieldDeclaration", false) == field && CheckingUtil.isAssigned(reference)) {
            return;
          }
        }
      }

    }
    {
      BaseQuickFixProvider intentionProvider = null;
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(field, "Variable '" + SPropertyOperations.getString(field, "name") + "' might not have been initialized", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "843236768047887576", intentionProvider, errorTarget);
    }

  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.FieldDeclaration";
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
