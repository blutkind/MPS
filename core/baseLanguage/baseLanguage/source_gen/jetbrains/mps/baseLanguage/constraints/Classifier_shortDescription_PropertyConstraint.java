package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.presentation.NodePresentationUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class Classifier_shortDescription_PropertyConstraint implements IModelConstraints, INodePropertyGetter {

  public Classifier_shortDescription_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.baseLanguage.structure.Classifier", "shortDescription", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.baseLanguage.structure.Classifier", "shortDescription");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return NodePresentationUtil.getAliasOrConceptName(node) + " (" + SNodeOperations.getModel(node).getUID().getCompactPresentation() + ")";
  }

}
