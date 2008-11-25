package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import jetbrains.mps.util.Pair;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_FieldReferenceOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_FieldReferenceOperation_InferenceRule() {
  }

  public void applyRule(final SNode fieldReference, final TypeCheckingContext typeCheckingContext) {
    final SNode fieldDeclaration = SLinkOperations.getTarget(fieldReference, "fieldDeclaration", false);
    if ((fieldDeclaration == null)) {
      return;
    }
    final SNode InstanceType_typevar_1206554174334 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = fieldReference;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(fieldReference), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174339", true), typeCheckingContext.getEquationManager().getRepresentator(InstanceType_typevar_1206554174334), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174335", intentionProvider);
    }
    final SNode fieldClassifier = SNodeOperations.getAncestor(fieldDeclaration, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    {
      SNode _nodeToCheck_1029348928467 = fieldReference;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.getEquationManager().getRepresentator(InstanceType_typevar_1206554174334), new _Quotations.QuotationClass_75().createNode(fieldClassifier, typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174350", false, 0, intentionProvider);
    }
    {
      final SNode IT = typeCheckingContext.getEquationManager().getRepresentator(InstanceType_typevar_1206554174334);
      typeCheckingContext.whenConcrete(IT, new Runnable() {

        public void run() {
          Map<SNode, List<SNode>> mmap = new HashMap<SNode, List<SNode>>();
          Pair<SNode, Map<SNode, List<SNode>>> pair;
          SNode matchedType = RulesFunctions_BaseLanguage.inference_matchTypeWithTypeVariables(typeCheckingContext, SLinkOperations.getTarget(fieldDeclaration, "type", true), mmap);
          {
            SNode _nodeToCheck_1029348928467 = fieldReference;
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createEquation(typeCheckingContext.typeOf(fieldReference, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174385", true), matchedType, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174383", intentionProvider);
          }
          RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(typeCheckingContext, fieldClassifier, typeCheckingContext.getEquationManager().getRepresentator(InstanceType_typevar_1206554174334), mmap);
          RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(typeCheckingContext, mmap);
        }

      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174358", false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
