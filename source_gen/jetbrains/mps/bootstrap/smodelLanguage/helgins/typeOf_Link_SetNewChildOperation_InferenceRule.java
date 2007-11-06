package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Link_SetNewChildOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Link_SetNewChildOperation_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    SNode resultConcept = null;
    if(RulesUtil.checkAppliedTo_LinkAccess_aggregation(argument)) {
      SNode expectedConcept = RulesUtil.get_inputNodeConcept(argument);
      SNode parameterConcept = SLinkOperations.getTarget(argument, "concept", false);
      if(parameterConcept == null) {
        resultConcept = expectedConcept;
      } else
      {
        resultConcept = parameterConcept;
        if(!(SConceptOperations.isSubConceptOf(parameterConcept, NameUtil.nodeFQName(expectedConcept)))) {
          TypeChecker.getInstance().reportTypeError(argument, SPropertyOperations.getString(parameterConcept, "name") + " is not sub-concept of " + SPropertyOperations.getString(expectedConcept, "name"), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1194373880738");
        }
      }
    }
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_48().createNode(resultConcept), argument, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1178287492106");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
