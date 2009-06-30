package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ContainsKeyOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ContainsKeyOperation_InferenceRule() {
  }

  public void applyRule(final SNode containsKeyOperation, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = containsKeyOperation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(containsKeyOperation, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1201873003944", true), (SNode)new _Quotations.QuotationClass_44().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1201873006966", intentionProvider);
    }
    final SNode KEY_typevar_1201873088202 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode VALUE_typevar_1201874216771 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = containsKeyOperation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(containsKeyOperation), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1201874242447", true), (SNode)new _Quotations.QuotationClass_45().createNode(typeCheckingContext.getEquationManager().getRepresentator(VALUE_typevar_1201874216771), typeCheckingContext.getEquationManager().getRepresentator(KEY_typevar_1201873088202), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1201874242445", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = containsKeyOperation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(containsKeyOperation, "key", true), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1201873021716", true), (SNode)typeCheckingContext.getEquationManager().getRepresentator(KEY_typevar_1201873088202), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1201873049497", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ContainsKeyOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
