package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FileName extends PropertyValueExpression {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.FileName";
  public static final String VALUE = "value";

  public FileName(SNode node) {
    super(node);
  }

  public PropertyValueExpression getValue() {
    return (PropertyValueExpression)this.getChild(FileName.VALUE);
  }

  public void setValue(PropertyValueExpression node) {
    super.setChild(FileName.VALUE, node);
  }


  public static FileName newInstance(SModel sm, boolean init) {
    return (FileName)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.FileName", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FileName newInstance(SModel sm) {
    return FileName.newInstance(sm, false);
  }

}
