package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class typeOf_Node_GetAdapterOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_Node_GetAdapterOperation_InferenceRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext) {
    final SNode Concept_typevar_1205967245422 = typeCheckingContext.createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConcept(typeCheckingContext, node, typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1205967245422));
    {
      final SNode C = typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1205967245422);
      typeCheckingContext.whenConcrete(C, new Runnable() {
        public void run() {
          SNode inputNodeConcept = SNodeOperations.cast(typeCheckingContext.getEquationManager().getRepresentator(C), "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
          {
            SNode _nodeToCheck_1029348928467 = node;
            BaseIntentionProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203710468986", 0, intentionProvider);
            typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203710468988", true), (SNode) AbstractConceptDeclaration_Behavior.call_getAdapterType_1213877394418(inputNodeConcept), _info_12389875345);
          }
        }
      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186057669142", false, false);
    }
    {
      SNode _nodeToCheck_1029348928467 = node;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186057690603", 0, intentionProvider);
      _info_12389875345.setInequationGroup("priority_4_1759628044690732301");
      _info_12389875345.addInequationGroupBefore("priority_3_1759628044690732300");
      _info_12389875345.addInequationGroupBefore("priority_2_1759628044690732299");
      _info_12389875345.addInequationGroupBefore("priority_1_1759628044690732298");
      _info_12389875345.addInequationGroupBefore("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186057680866", true), (SNode) new typeOf_Node_GetAdapterOperation_InferenceRule.QuotationClass_9739_0().createNode(typeCheckingContext), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Node_GetAdapterOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_9739_0 {
    public QuotationClass_9739_0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_58 = null;
      {
        quotedNode_58 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_58 = quotedNode_58;
        quotedNode1_58.addReference(SReference.create("classifier", quotedNode1_58, SModelReference.fromString("f:java_stub#jetbrains.mps.lang.core.structure(jetbrains.mps.lang.core.structure@java_stub)"), SNodeId.fromString("~BaseConcept")));
        result = quotedNode1_58;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_58 = null;
      {
        quotedNode_58 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_58 = quotedNode_58;
        quotedNode1_58.addReference(SReference.create("classifier", quotedNode1_58, SModelReference.fromString("f:java_stub#jetbrains.mps.lang.core.structure(jetbrains.mps.lang.core.structure@java_stub)"), SNodeId.fromString("~BaseConcept")));
        result = quotedNode1_58;
      }
      return result;
    }
  }
}
