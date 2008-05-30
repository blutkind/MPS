package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyValidator;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class IValidIdentifier_name_PropertyConstraint implements IModelConstraints, INodePropertyValidator {

  public IValidIdentifier_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyValidator("jetbrains.mps.baseLanguage.structure.IValidIdentifier", "name", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyValidator("jetbrains.mps.baseLanguage.structure.IValidIdentifier", "name");
  }

  public boolean checkPropertyValue(SNode node, String propertyName, String propertyValue, IScope scope) {
    return (SPropertyOperations.getString(propertyValue)).matches("[a-zA-Z[_]][a-zA-Z0-9[_]]*");
  }

}
