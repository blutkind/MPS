package jetbrains.mps.make.facet.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ResourceSpecificPropertiesExpression extends Expression {
  public static final String concept = "jetbrains.mps.make.facet.structure.ResourceSpecificPropertiesExpression";
  public static final String PROPERTIES = "properties";
  public static final String RESOURCE = "resource";

  public ResourceSpecificPropertiesExpression(SNode node) {
    super(node);
  }

  public IPropertyExpression getProperties() {
    return (IPropertyExpression) this.getChild(IPropertyExpression.class, ResourceSpecificPropertiesExpression.PROPERTIES);
  }

  public void setProperties(IPropertyExpression node) {
    super.setChild(ResourceSpecificPropertiesExpression.PROPERTIES, node);
  }

  public Expression getResource() {
    return (Expression) this.getChild(Expression.class, ResourceSpecificPropertiesExpression.RESOURCE);
  }

  public void setResource(Expression node) {
    super.setChild(ResourceSpecificPropertiesExpression.RESOURCE, node);
  }

  public static ResourceSpecificPropertiesExpression newInstance(SModel sm, boolean init) {
    return (ResourceSpecificPropertiesExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.facet.structure.ResourceSpecificPropertiesExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ResourceSpecificPropertiesExpression newInstance(SModel sm) {
    return ResourceSpecificPropertiesExpression.newInstance(sm, false);
  }
}
