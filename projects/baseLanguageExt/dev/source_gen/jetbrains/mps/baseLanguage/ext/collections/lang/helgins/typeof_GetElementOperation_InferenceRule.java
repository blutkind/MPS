package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.RulesFunctions_Collections;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.QuotationClass_24;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_GetElementOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_GetElementOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode elementType = RulesFunctions_Collections.get_inputListType_elementType(argument);
    SNode arg = SLinkOperations.getTarget(argument, "argument", true);
    if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getRuntimeSupport().checkedTypeOf(arg), new QuotationClass_24().createNode()))) {
      TypeChecker.getInstance().reportTypeError(arg, "integer is expected");
    }
    TypeChecker.getInstance().getRuntimeSupport().givetype(elementType, argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.baseLanguage.ext.collections.lang.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1178725704734"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
