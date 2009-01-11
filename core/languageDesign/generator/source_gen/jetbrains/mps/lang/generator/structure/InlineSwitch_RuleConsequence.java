package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InlineSwitch_RuleConsequence extends RuleConsequence {
  public static final String concept = "jetbrains.mps.lang.generator.structure.InlineSwitch_RuleConsequence";
  public static final String DEFAULT_CONSEQUENCE = "defaultConsequence";
  public static final String CASE = "case";

  public InlineSwitch_RuleConsequence(SNode node) {
    super(node);
  }

  public RuleConsequence getDefaultConsequence() {
    return (RuleConsequence)this.getChild(RuleConsequence.class, InlineSwitch_RuleConsequence.DEFAULT_CONSEQUENCE);
  }

  public void setDefaultConsequence(RuleConsequence node) {
    super.setChild(InlineSwitch_RuleConsequence.DEFAULT_CONSEQUENCE, node);
  }

  public int getCasesCount() {
    return this.getChildCount(InlineSwitch_RuleConsequence.CASE);
  }

  public Iterator<InlineSwitch_Case> cases() {
    return this.children(InlineSwitch_Case.class, InlineSwitch_RuleConsequence.CASE);
  }

  public List<InlineSwitch_Case> getCases() {
    return this.getChildren(InlineSwitch_Case.class, InlineSwitch_RuleConsequence.CASE);
  }

  public void addCase(InlineSwitch_Case node) {
    this.addChild(InlineSwitch_RuleConsequence.CASE, node);
  }

  public void insertCase(InlineSwitch_Case prev, InlineSwitch_Case node) {
    this.insertChild(prev, InlineSwitch_RuleConsequence.CASE, node);
  }


  public static InlineSwitch_RuleConsequence newInstance(SModel sm, boolean init) {
    return (InlineSwitch_RuleConsequence)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.InlineSwitch_RuleConsequence", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InlineSwitch_RuleConsequence newInstance(SModel sm) {
    return InlineSwitch_RuleConsequence.newInstance(sm, false);
  }

}
