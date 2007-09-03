package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ComparisonRule extends AbstractSubtypingRule {
  public static String ANOTHER_NODE = "anotherNode";

  public  ComparisonRule(SNode node) {
    super(node);
  }

  public static ComparisonRule newInstance(SModel sm, boolean init) {
    return (ComparisonRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.ComparisonRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ComparisonRule newInstance(SModel sm) {
    return ComparisonRule.newInstance(sm, false);
  }


  public ApplicableNodeCondition getAnotherNode() {
    return (ApplicableNodeCondition)this.getChild(ComparisonRule.ANOTHER_NODE);
  }

  public void setAnotherNode(ApplicableNodeCondition node) {
    super.setChild(ComparisonRule.ANOTHER_NODE, node);
  }

}
