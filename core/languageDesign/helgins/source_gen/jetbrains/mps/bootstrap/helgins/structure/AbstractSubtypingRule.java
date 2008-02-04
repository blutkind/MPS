package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.StatementList;

public class AbstractSubtypingRule extends AbstractRule {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.AbstractSubtypingRule";
  public static String BODY = "body";
  public static String IS_WEAK = "isWeak";

  public  AbstractSubtypingRule(SNode node) {
    super(node);
  }

  public static AbstractSubtypingRule newInstance(SModel sm, boolean init) {
    return (AbstractSubtypingRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.AbstractSubtypingRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractSubtypingRule newInstance(SModel sm) {
    return AbstractSubtypingRule.newInstance(sm, false);
  }


  public StatementList getBody() {
    return (StatementList)this.getChild(AbstractSubtypingRule.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(AbstractSubtypingRule.BODY, node);
  }

  public boolean getIsWeak() {
    return this.getBooleanProperty(AbstractSubtypingRule.IS_WEAK);
  }

  public void setIsWeak(boolean value) {
    this.setBooleanProperty(AbstractSubtypingRule.IS_WEAK, value);
  }

}
