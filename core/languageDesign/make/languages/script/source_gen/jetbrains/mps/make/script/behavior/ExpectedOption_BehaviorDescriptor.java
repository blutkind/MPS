package jetbrains.mps.make.script.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.IWillBeClassifier_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.baseLanguage.behavior.IWillBeClassifier_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class ExpectedOption_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements IExpected_BehaviorDescriptor, INamedConcept_BehaviorDescriptor, IWillBeClassifier_BehaviorDescriptor {
  public ExpectedOption_BehaviorDescriptor() {
  }

  public String virtual_classifierName_4609636120081351397(SNode thisNode) {
    return ExpectedOption_Behavior.virtual_classifierName_4609636120081351397(thisNode);
  }

  public SNode virtual_resolve_4609636120081469956(SNode thisNode, SModel targetModel) {
    return IWillBeClassifier_Behavior.virtual_resolve_4609636120081469956(thisNode, targetModel);
  }

  public SNode virtual_baseClassifier_4125795553993767872(SNode thisNode) {
    return IWillBeClassifier_Behavior.virtual_baseClassifier_4125795553993767872(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }
}
