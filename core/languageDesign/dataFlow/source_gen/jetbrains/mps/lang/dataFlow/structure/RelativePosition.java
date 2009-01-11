package jetbrains.mps.lang.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RelativePosition extends Position {
  public static final String concept = "jetbrains.mps.lang.dataFlow.structure.RelativePosition";
  public static final String RELATIVE_TO = "relativeTo";

  public RelativePosition(SNode node) {
    super(node);
  }

  public Expression getRelativeTo() {
    return (Expression)this.getChild(Expression.class, RelativePosition.RELATIVE_TO);
  }

  public void setRelativeTo(Expression node) {
    super.setChild(RelativePosition.RELATIVE_TO, node);
  }


  public static RelativePosition newInstance(SModel sm, boolean init) {
    return (RelativePosition)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.dataFlow.structure.RelativePosition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RelativePosition newInstance(SModel sm) {
    return RelativePosition.newInstance(sm, false);
  }

}
