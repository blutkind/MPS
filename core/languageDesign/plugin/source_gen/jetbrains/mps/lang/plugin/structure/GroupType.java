package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GroupType extends BaseClassifierType {
public    static final String concept = "jetbrains.mps.lang.plugin.structure.GroupType";
public    static final String ACTION_GROUP = "actionGroup";

  public GroupType(SNode node) {
    super(node);
  }

  public ActionGroupDeclaration getActionGroup() {
    return (ActionGroupDeclaration)this.getReferent(GroupType.ACTION_GROUP);
  }

  public void setActionGroup(ActionGroupDeclaration node) {
    super.setReferent(GroupType.ACTION_GROUP, node);
  }


  public static GroupType newInstance(SModel sm, boolean init) {
    return (GroupType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.GroupType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GroupType newInstance(SModel sm) {
    return GroupType.newInstance(sm, false);
  }

}
