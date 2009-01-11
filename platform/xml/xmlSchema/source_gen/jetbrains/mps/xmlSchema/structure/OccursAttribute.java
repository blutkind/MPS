package jetbrains.mps.xmlSchema.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OccursAttribute extends BaseConcept {
  public static final String concept = "jetbrains.mps.xmlSchema.structure.OccursAttribute";
  public static final String MIN_OCCURS = "minOccurs";
  public static final String MAX_OCCURS = "maxOccurs";

  public OccursAttribute(SNode node) {
    super(node);
  }

  public int getMinOccurs() {
    return this.getIntegerProperty(OccursAttribute.MIN_OCCURS);
  }

  public void setMinOccurs(int value) {
    this.setIntegerProperty(OccursAttribute.MIN_OCCURS, value);
  }

  public MaxOccursExpression getMaxOccurs() {
    return (MaxOccursExpression)this.getChild(MaxOccursExpression.class, OccursAttribute.MAX_OCCURS);
  }

  public void setMaxOccurs(MaxOccursExpression node) {
    super.setChild(OccursAttribute.MAX_OCCURS, node);
  }


  public static OccursAttribute newInstance(SModel sm, boolean init) {
    return (OccursAttribute)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlSchema.structure.OccursAttribute", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OccursAttribute newInstance(SModel sm) {
    return OccursAttribute.newInstance(sm, false);
  }

}
