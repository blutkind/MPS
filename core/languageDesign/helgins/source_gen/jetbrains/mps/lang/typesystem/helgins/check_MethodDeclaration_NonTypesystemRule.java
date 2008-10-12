package jetbrains.mps.lang.typesystem.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_MethodDeclaration_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_MethodDeclaration_NonTypesystemRule() {
  }

  public void applyRule(final SNode baseMethodDeclaration, final TypeCheckingContext typeCheckingContext) {
    for(SNode annotationInstance : SLinkOperations.getTargets(baseMethodDeclaration, "annotation", true)) {
      if (SLinkOperations.getTarget(annotationInstance, "annotation", false) == SLinkOperations.getTarget(new QuotationClass_23().createNode(), "classifier", false)) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(baseMethodDeclaration, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          TypeChecker.getInstance().reportTypeError(SLinkOperations.getTarget(baseMethodDeclaration, "returnType", true), "inference method should not return a value", "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1206297717786");
        }
        return;
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
