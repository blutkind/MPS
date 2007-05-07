package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS  */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SemanticDowncastExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_SemanticDowncastExpression_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().check(SLinkOperations.getTarget(argument, "leftExpression", true));
    if((SLinkOperations.getTarget(argument, "leftExpression", true) != null)) {
      SNode leftType = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "leftExpression", true));
      if(SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.bootstrap.smodelLanguage.structure.SModelType")) {
        TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_35().createNode(), argument);
      } else 
      if(SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType")) {
        TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_36().createNode(), argument);
      } else 
      if(SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType")) {
        TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_37().createNode(), argument);
      }
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.bootstrap.smodelLanguage.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1178287490246"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
