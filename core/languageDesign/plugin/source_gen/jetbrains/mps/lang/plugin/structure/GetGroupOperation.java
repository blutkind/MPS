package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetGroupOperation extends Expression {
public    static final String concept = "jetbrains.mps.lang.plugin.structure.GetGroupOperation";
public    static final String GROUP = "group";

  public GetGroupOperation(SNode node) {
    super(node);
  }

  public ActionGroupDeclaration getGroup() {
    return (ActionGroupDeclaration)this.getReferent(GetGroupOperation.GROUP);
  }

  public void setGroup(ActionGroupDeclaration node) {
    super.setReferent(GetGroupOperation.GROUP, node);
  }


  public static GetGroupOperation newInstance(SModel sm, boolean init) {
    return (GetGroupOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.GetGroupOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetGroupOperation newInstance(SModel sm) {
    return GetGroupOperation.newInstance(sm, false);
  }

}
