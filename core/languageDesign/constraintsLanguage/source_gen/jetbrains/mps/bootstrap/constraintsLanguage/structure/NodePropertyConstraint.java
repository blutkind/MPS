package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodePropertyConstraint extends BaseConcept {
  public static final String concept = "jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint";
  public static String APPLICABLE_PROPERTY = "applicableProperty";
  public static String PROPERTY_GETTER = "propertyGetter";
  public static String PROPERTY_SETTER = "propertySetter";
  public static String PROPERTY_VALIDATOR = "propertyValidator";

  public NodePropertyConstraint(SNode node) {
    super(node);
  }

  public PropertyDeclaration getApplicableProperty() {
    return (PropertyDeclaration)this.getReferent(NodePropertyConstraint.APPLICABLE_PROPERTY);
  }

  public void setApplicableProperty(PropertyDeclaration node) {
    super.setReferent(NodePropertyConstraint.APPLICABLE_PROPERTY, node);
  }

  public ConstraintFunction_PropertyGetter getPropertyGetter() {
    return (ConstraintFunction_PropertyGetter)this.getChild(NodePropertyConstraint.PROPERTY_GETTER);
  }

  public void setPropertyGetter(ConstraintFunction_PropertyGetter node) {
    super.setChild(NodePropertyConstraint.PROPERTY_GETTER, node);
  }

  public ConstraintFunction_PropertySetter getPropertySetter() {
    return (ConstraintFunction_PropertySetter)this.getChild(NodePropertyConstraint.PROPERTY_SETTER);
  }

  public void setPropertySetter(ConstraintFunction_PropertySetter node) {
    super.setChild(NodePropertyConstraint.PROPERTY_SETTER, node);
  }

  public ConstraintFunction_PropertyValidator getPropertyValidator() {
    return (ConstraintFunction_PropertyValidator)this.getChild(NodePropertyConstraint.PROPERTY_VALIDATOR);
  }

  public void setPropertyValidator(ConstraintFunction_PropertyValidator node) {
    super.setChild(NodePropertyConstraint.PROPERTY_VALIDATOR, node);
  }


  public static NodePropertyConstraint newInstance(SModel sm, boolean init) {
    return (NodePropertyConstraint)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodePropertyConstraint newInstance(SModel sm) {
    return NodePropertyConstraint.newInstance(sm, false);
  }

}
