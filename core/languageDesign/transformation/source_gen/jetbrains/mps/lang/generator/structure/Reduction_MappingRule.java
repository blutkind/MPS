package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Reduction_MappingRule extends BaseMappingRule {
  public static final String concept = "jetbrains.mps.lang.generator.structure.Reduction_MappingRule";
  public static String RULE_CONSEQUENCE = "ruleConsequence";

  public Reduction_MappingRule(SNode node) {
    super(node);
  }

  public RuleConsequence getRuleConsequence() {
    return (RuleConsequence)this.getChild(Reduction_MappingRule.RULE_CONSEQUENCE);
  }

  public void setRuleConsequence(RuleConsequence node) {
    super.setChild(Reduction_MappingRule.RULE_CONSEQUENCE, node);
  }


  public static Reduction_MappingRule newInstance(SModel sm, boolean init) {
    return (Reduction_MappingRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.Reduction_MappingRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Reduction_MappingRule newInstance(SModel sm) {
    return Reduction_MappingRule.newInstance(sm, false);
  }

}
