package jetbrains.mps.patterns.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class PropertyPatternVariableDeclaration_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {

  public  PropertyPatternVariableDeclaration_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.patterns.structure.PropertyPatternVariableDeclaration", "name", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.patterns.structure.PropertyPatternVariableDeclaration", "name");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return "$" + SPropertyOperations.getString(node, "varName");
  }

}
