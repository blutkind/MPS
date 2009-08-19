package jetbrains.mps.lang.behavior.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ConceptBehavior_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {
  public ConceptBehavior_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.lang.behavior.structure.ConceptBehavior", "name", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.lang.behavior.structure.ConceptBehavior", "name");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    String conceptName;
    if (SLinkOperations.getTarget(node, "concept", false) != null) {
      conceptName = SPropertyOperations.getString(SLinkOperations.getTarget(node, "concept", false), "name");
    } else {
      conceptName = "???";
    }
    return conceptName + "_Behavior";
  }
}
