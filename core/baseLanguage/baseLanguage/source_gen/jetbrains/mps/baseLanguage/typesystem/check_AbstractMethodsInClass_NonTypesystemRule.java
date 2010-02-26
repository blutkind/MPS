package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;

public class check_AbstractMethodsInClass_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_AbstractMethodsInClass_NonTypesystemRule() {
  }

  public void applyRule(final SNode method, final TypeCheckingContext typeCheckingContext) {
    if (SPropertyOperations.getBoolean(method, "isAbstract")) {
      SNode classifier = SNodeOperations.getAncestor(method, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      if (!(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.EnumClass"))) {
        do {
          SNode matchedNode_qfxa59_a0b0a0 = classifier;
          {
            boolean matches_qfxa59_a0a1a0a = false;
            {
              SNode matchingNode_qfxa59_a0a1a0a = classifier;
              if (matchingNode_qfxa59_a0a1a0a != null) {
                matches_qfxa59_a0a1a0a = SModelUtil_new.isAssignableConcept(matchingNode_qfxa59_a0a1a0a.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.ClassConcept");
              }
            }
            if (matches_qfxa59_a0a1a0a) {
              if ((matchedNode_qfxa59_a0b0a0 != null) && !(SPropertyOperations.getBoolean(matchedNode_qfxa59_a0b0a0, "abstractClass"))) {
                {
                  BaseIntentionProvider intentionProvider = null;
                  IErrorTarget errorTarget = new NodeErrorTarget();
                  IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(method, "abstract method in a non-abstract class", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "840197573389262456", intentionProvider, errorTarget);
                }
              }
              break;
            }
          }
        } while(false);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
