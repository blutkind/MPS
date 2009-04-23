package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ComparisonRule extends AbstractSubtypingRule {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.ComparisonRule";
  public static final String ANOTHER_NODE = "anotherNode";

  public ComparisonRule(SNode node) {
    super(node);
  }

  public ApplicableNodeCondition getAnotherNode() {
    return (ApplicableNodeCondition)this.getChild(ApplicableNodeCondition.class, ComparisonRule.ANOTHER_NODE);
  }

  public void setAnotherNode(ApplicableNodeCondition node) {
    super.setChild(ComparisonRule.ANOTHER_NODE, node);
  }


  public static ComparisonRule newInstance(SModel sm, boolean init) {
    return (ComparisonRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.ComparisonRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ComparisonRule newInstance(SModel sm) {
    return ComparisonRule.newInstance(sm, false);
  }

}
