package jetbrains.mps.xmlSchema.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Sequence extends GroupExpression {
  public static final String concept = "jetbrains.mps.xmlSchema.structure.Sequence";
  public static final String TYPE_EXPRESSION_LIST = "typeExpressionList";

  public Sequence(SNode node) {
    super(node);
  }

  public TypeExpressionList getTypeExpressionList() {
    return (TypeExpressionList)this.getChild(Sequence.TYPE_EXPRESSION_LIST);
  }

  public void setTypeExpressionList(TypeExpressionList node) {
    super.setChild(Sequence.TYPE_EXPRESSION_LIST, node);
  }


  public static Sequence newInstance(SModel sm, boolean init) {
    return (Sequence)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlSchema.structure.Sequence", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Sequence newInstance(SModel sm) {
    return Sequence.newInstance(sm, false);
  }

}
