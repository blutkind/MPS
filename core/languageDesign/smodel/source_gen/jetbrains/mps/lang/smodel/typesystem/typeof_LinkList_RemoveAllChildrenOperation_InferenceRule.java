package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeof_LinkList_RemoveAllChildrenOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_LinkList_RemoveAllChildrenOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    final SNode Concept_typevar_1215104325493 = typeCheckingContext.createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConcept(typeCheckingContext, op, typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1215104325493));
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1215104325500", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1215104325502", true), (SNode) new typeof_LinkList_RemoveAllChildrenOperation_InferenceRule.QuotationClass_8806_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1215104325493), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.LinkList_RemoveAllChildrenOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_8806_0 {
    public QuotationClass_8806_0() {
    }

    public SNode createNode(Object parameter_8806_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_102 = null;
      {
        quotedNode_102 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_102 = quotedNode_102;
        quotedNode1_102.setReferent("elementConcept", (SNode) parameter_8806_0);
        result = quotedNode1_102;
      }
      return result;
    }

    public SNode createNode(Object parameter_8806_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_102 = null;
      {
        quotedNode_102 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_102 = quotedNode_102;
        quotedNode1_102.setReferent("elementConcept", (SNode) parameter_8806_0);
        result = quotedNode1_102;
      }
      return result;
    }
  }
}
