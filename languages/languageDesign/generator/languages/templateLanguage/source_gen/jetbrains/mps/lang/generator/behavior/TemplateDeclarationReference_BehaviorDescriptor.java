package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.TypeDerivable_Behavior;

public class TemplateDeclarationReference_BehaviorDescriptor extends RuleConsequence_BehaviorDescriptor implements ITemplateCall_BehaviorDescriptor {
  public TemplateDeclarationReference_BehaviorDescriptor() {
  }

  public SNode virtual_deriveType_4555537781928374706(SNode thisNode, SNode expression, SNode link) {
    return TypeDerivable_Behavior.virtual_deriveType_4555537781928374706(thisNode, expression, link);
  }

  public SNode virtual_deriveType_1213877435747(SNode thisNode, SNode expression) {
    return ITemplateCall_Behavior.virtual_deriveType_1213877435747(thisNode, expression);
  }
}
