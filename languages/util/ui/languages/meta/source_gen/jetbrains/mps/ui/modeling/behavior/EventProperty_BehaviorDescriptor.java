package jetbrains.mps.ui.modeling.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class EventProperty_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor, HasTemplate_BehaviorDescriptor {
  public EventProperty_BehaviorDescriptor() {
  }

  public SNode virtual_findTemplate_262873202871795827(SNode thisNode, SModel model, IScope scope) {
    return HasTemplate_Behavior.virtual_findTemplate_262873202871795827(thisNode, model, scope);
  }

  public SNode virtual_findTemplate_3939571372331676060(SNode thisNode, SModel model, IScope scope) {
    return EventProperty_Behavior.virtual_findTemplate_3939571372331676060(thisNode, model, scope);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.ui.modeling.structure.EventProperty";
  }
}
