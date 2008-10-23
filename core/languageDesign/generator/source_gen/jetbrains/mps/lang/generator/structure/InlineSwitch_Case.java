package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InlineSwitch_Case extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.generator.structure.InlineSwitch_Case";
  public static final String CONDITION_FUNCTION = "conditionFunction";
  public static final String CASE_CONSEQUENCE = "caseConsequence";

  public InlineSwitch_Case(SNode node) {
    super(node);
  }

  public BaseMappingRule_Condition getConditionFunction() {
    return (BaseMappingRule_Condition)this.getChild(InlineSwitch_Case.CONDITION_FUNCTION);
  }

  public void setConditionFunction(BaseMappingRule_Condition node) {
    super.setChild(InlineSwitch_Case.CONDITION_FUNCTION, node);
  }

  public RuleConsequence getCaseConsequence() {
    return (RuleConsequence)this.getChild(InlineSwitch_Case.CASE_CONSEQUENCE);
  }

  public void setCaseConsequence(RuleConsequence node) {
    super.setChild(InlineSwitch_Case.CASE_CONSEQUENCE, node);
  }


  public static InlineSwitch_Case newInstance(SModel sm, boolean init) {
    return (InlineSwitch_Case)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.InlineSwitch_Case", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InlineSwitch_Case newInstance(SModel sm) {
    return InlineSwitch_Case.newInstance(sm, false);
  }

}
