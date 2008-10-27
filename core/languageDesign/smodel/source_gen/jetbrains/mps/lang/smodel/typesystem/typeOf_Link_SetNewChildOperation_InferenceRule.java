package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Link_SetNewChildOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_Link_SetNewChildOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    RulesUtil.checkAppliedTo_LinkAccess_aggregation(typeCheckingContext, op);
    final SNode Concept_typevar_1206099875685 = typeCheckingContext.createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConcept(typeCheckingContext, op, typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1206099875685));
    {
      final SNode concreteConcept = typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1206099875685);
      typeCheckingContext.whenConcrete(concreteConcept, new Runnable() {

        public void run() {
          SNode resultConcept;
          SNode parameterConcept = SLinkOperations.getTarget(op, "concept", false);
          if (parameterConcept == null) {
            resultConcept = typeCheckingContext.getEquationManager().getRepresentator(concreteConcept);
          } else
          {
            resultConcept = parameterConcept;
            if (!(SConceptOperations.isSubConceptOf(parameterConcept, NameUtil.nodeFQName(typeCheckingContext.getEquationManager().getRepresentator(concreteConcept))))) {
              BaseIntentionProvider intentionProvider = null;
              typeCheckingContext.reportTypeError(op, SPropertyOperations.getString(parameterConcept, "name") + " is not sub-concept of " + SPropertyOperations.getString(typeCheckingContext.getEquationManager().getRepresentator(concreteConcept), "name"), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205442304609", intentionProvider);
            }
          }
          {
            SNode _nodeToCheck_1029348928467 = op;
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createEquation(typeCheckingContext.typeOf(op, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205442304627", true), new _Quotations.QuotationClass_53().createNode(resultConcept, typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205442304625", intentionProvider);
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205442246000");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Link_SetNewChildOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
