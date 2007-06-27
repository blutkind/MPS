package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.NamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractRule extends NamedConcept {
  public static String APPLICABLE_NODE = "applicableNode";

  public  AbstractRule(SNode node) {
    super(node);
  }

  public static AbstractRule newInstance(SModel sm, boolean init) {
    return (AbstractRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.AbstractRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static AbstractRule newInstance(SModel sm) {
    return AbstractRule.newInstance(sm, false);
  }

  public ApplicableNodeCondition getApplicableNode() {
    return (ApplicableNodeCondition)this.getChild(AbstractRule.APPLICABLE_NODE);
  }
  public void setApplicableNode(ApplicableNodeCondition node) {
    super.setChild(AbstractRule.APPLICABLE_NODE, node);
  }
}
