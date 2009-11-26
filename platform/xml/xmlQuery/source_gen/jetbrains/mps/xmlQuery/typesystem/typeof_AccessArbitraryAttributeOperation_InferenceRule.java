package jetbrains.mps.xmlQuery.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AccessArbitraryAttributeOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_AccessArbitraryAttributeOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:d89ddc4c-de44-408f-97b1-095c4af64bfb(jetbrains.mps.xmlQuery.typesystem)", "634907465121486825", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:d89ddc4c-de44-408f-97b1-095c4af64bfb(jetbrains.mps.xmlQuery.typesystem)", "634907465121486822", true), (SNode)new _Quotations.QuotationClass_0().createNode(typeCheckingContext), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(operation, "attributeNameExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:d89ddc4c-de44-408f-97b1-095c4af64bfb(jetbrains.mps.xmlQuery.typesystem)", "4203809819610648514", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:d89ddc4c-de44-408f-97b1-095c4af64bfb(jetbrains.mps.xmlQuery.typesystem)", "4203809819610627154", true), (SNode)new _Quotations.QuotationClass_1().createNode(typeCheckingContext), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.xmlQuery.structure.AccessArbitraryAttributeOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
