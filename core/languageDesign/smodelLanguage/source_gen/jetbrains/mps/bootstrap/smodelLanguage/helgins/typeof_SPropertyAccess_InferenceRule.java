package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.constraints.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.structureLanguage.constraints.DataTypeDeclaration_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SPropertyAccess_InferenceRule implements InferenceRule_Runtime {

  public typeof_SPropertyAccess_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    if ((SLinkOperations.getTarget(op, "property", false) != null)) {
      final SNode Concept_typevar_1186062582563 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
      RulesUtil.equate_inputNodeConcept(op, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1186062582563));
      {
        final SNode C = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1186062582563);
        TypeChecker.getInstance().getRuntimeSupport().whenConcrete(C, new Runnable() {

          public void run() {
            SNode inputNodeConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(C);
            List<SNode> declaredProperties = AbstractConceptDeclaration_Behavior.call_getPropertyDeclarations_1203539034160(inputNodeConcept);
            SNode property = SLinkOperations.getTarget(op, "property", false);
            if (!(ListSequence.fromList(declaredProperties).contains(property))) {
              TypeChecker.getInstance().reportTypeError(op, "access to property '" + SPropertyOperations.getString(property, "name") + "' is not expected here", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062616321");
            }
          }

        }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062603529");
      }
    }
    SNode dataType = SLinkOperations.getTarget(SLinkOperations.getTarget(op, "property", false), "dataType", false);
    if (dataType != null) {
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712090792", true), DataTypeDeclaration_Behavior.call_toBaseLanguageType_1182472765133(dataType), op, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712090790");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
