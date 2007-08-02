package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.StatementList;

public class InferenceRule extends AbstractRule {
  public static String OVERRIDES = "overrides";
  public static String BODY = "body";

  public  InferenceRule(SNode node) {
    super(node);
  }

  public static InferenceRule newInstance(SModel sm, boolean init) {
    return (InferenceRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.InferenceRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InferenceRule newInstance(SModel sm) {
    return InferenceRule.newInstance(sm, false);
  }


  public boolean getOverrides() {
    return this.getBooleanProperty(InferenceRule.OVERRIDES);
  }

  public void setOverrides(boolean value) {
    this.setBooleanProperty(InferenceRule.OVERRIDES, value);
  }

  public StatementList getBody() {
    return (StatementList)this.getChild(InferenceRule.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(InferenceRule.BODY, node);
  }

}
