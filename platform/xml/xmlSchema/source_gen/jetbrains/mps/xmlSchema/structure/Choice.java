package jetbrains.mps.xmlSchema.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Choice extends GroupExpression {
  public static final String concept = "jetbrains.mps.xmlSchema.structure.Choice";
  public static String TYPE_EXPRESSION_LIST = "typeExpressionList";
  public static String OCCURS_ATTRIBUTE = "occursAttribute";

  public Choice(SNode node) {
    super(node);
  }

  public TypeExpressionList getTypeExpressionList() {
    return (TypeExpressionList)this.getChild(Choice.TYPE_EXPRESSION_LIST);
  }

  public void setTypeExpressionList(TypeExpressionList node) {
    super.setChild(Choice.TYPE_EXPRESSION_LIST, node);
  }

  public OccursAttribute getOccursAttribute() {
    return (OccursAttribute)this.getChild(Choice.OCCURS_ATTRIBUTE);
  }

  public void setOccursAttribute(OccursAttribute node) {
    super.setChild(Choice.OCCURS_ATTRIBUTE, node);
  }


  public static Choice newInstance(SModel sm, boolean init) {
    return (Choice)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlSchema.structure.Choice", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Choice newInstance(SModel sm) {
    return Choice.newInstance(sm, false);
  }

}
