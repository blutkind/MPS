package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.baseLanguage.constraints.ConceptFunction_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConceptFunctionParameter_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public check_ConceptFunctionParameter_NonTypesystemRule() {
  }

  public void applyRule(final SNode parameter) {
    final zClosureContext _zClosureContext = new zClosureContext();
    SNode conceptFunction = SNodeOperations.getAncestor(parameter, "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
    if (SNodeOperations.isInstanceOf(conceptFunction, "jetbrains.mps.baseLanguage.structure.Closure")) {
      TypeChecker.getInstance().reportTypeError(parameter, "concept function parameter can not be used in closure", "jetbrains.mps.baseLanguage.helgins", "1197313614703");
    } else
    {
      _zClosureContext.parameterConcept = SNodeOperations.getConceptDeclaration(parameter);
      Iterable<SNode> seq = SequenceOperations.where(ConceptFunction_Behavior.call_getParameters_1197312191473(conceptFunction), new zPredicate(check_ConceptFunctionParameter_NonTypesystemRule.this, _zClosureContext));
      if (SequenceOperations.isEmpty(seq)) {
        TypeChecker.getInstance().reportTypeError(parameter, "not applicable in this context", "jetbrains.mps.baseLanguage.helgins", "1197313958459");
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
