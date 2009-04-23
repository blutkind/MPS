package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ActionType extends BaseClassifierType {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ActionType";
  public static final String ACTION = "action";

  public ActionType(SNode node) {
    super(node);
  }

  public ActionDeclaration getAction() {
    return (ActionDeclaration)this.getReferent(ActionDeclaration.class, ActionType.ACTION);
  }

  public void setAction(ActionDeclaration node) {
    super.setReferent(ActionType.ACTION, node);
  }


  public static ActionType newInstance(SModel sm, boolean init) {
    return (ActionType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ActionType newInstance(SModel sm) {
    return ActionType.newInstance(sm, false);
  }

}
