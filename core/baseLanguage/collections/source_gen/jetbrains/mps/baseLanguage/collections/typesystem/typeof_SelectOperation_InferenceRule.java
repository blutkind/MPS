package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SelectOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_SelectOperation_InferenceRule() {
  }

  public void applyRule(final SNode so, final TypeCheckingContext typeCheckingContext) {
    final SNode sequenceParamType_typevar_1225884177658 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(so);
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225885277159", true), (SNode)new _Quotations.QuotationClass_79().createNode(typeCheckingContext.getEquationManager().getRepresentator(sequenceParamType_typevar_1225884177658), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225885277157", false, 0, intentionProvider);
    }
    final SNode resType_typevar_1203177754378 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode selectorParamType_typevar_1240677567421 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(so, "closure", true);
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240677325771", true), (SNode)new _Quotations.QuotationClass_159().createNode(typeCheckingContext.getEquationManager().getRepresentator(selectorParamType_typevar_1240677567421), typeCheckingContext.getEquationManager().getRepresentator(resType_typevar_1203177754378), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240677325769", intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = so;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.getEquationManager().getRepresentator(sequenceParamType_typevar_1225884177658), (SNode)typeCheckingContext.getEquationManager().getRepresentator(selectorParamType_typevar_1240677567421), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240677605019", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = so;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1203177771381", true), (SNode)new _Quotations.QuotationClass_47().createNode(typeCheckingContext.getEquationManager().getRepresentator(resType_typevar_1203177754378), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1203177774935", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SelectOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
