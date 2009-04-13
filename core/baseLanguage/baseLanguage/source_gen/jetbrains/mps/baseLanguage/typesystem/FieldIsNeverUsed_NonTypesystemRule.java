package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class FieldIsNeverUsed_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public FieldIsNeverUsed_NonTypesystemRule() {
  }

  public void applyRule(final SNode fieldDeclaration, final TypeCheckingContext typeCheckingContext) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(fieldDeclaration, "visibility", true), "jetbrains.mps.baseLanguage.structure.PrivateVisibility")) {
      List<SNode> fieldReferenceOperations = SNodeOperations.getDescendants(SNodeOperations.getParent(fieldDeclaration), "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", false);
      if (ListSequence.fromList(fieldReferenceOperations).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return SLinkOperations.getTarget(it, "fieldDeclaration", false) == fieldDeclaration;
        }
      }).isEmpty()) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          typeCheckingContext.reportWarning(fieldDeclaration, "Field is never used", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1239632386980", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.FieldDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
