package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.IMethodCall_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.TypeDerivable_Behavior;
import java.util.List;
import jetbrains.mps.baseLanguage.behavior.IMethodCall_Behavior;
import java.util.Map;

public class Node_ConceptMethodCall_BehaviorDescriptor extends SNodeOperation_BehaviorDescriptor implements IMethodCall_BehaviorDescriptor {
  public Node_ConceptMethodCall_BehaviorDescriptor() {
  }

  public SNode virtual_deriveType_4555537781928374706(SNode thisNode, SNode expression, SNode link) {
    return TypeDerivable_Behavior.virtual_deriveType_4555537781928374706(thisNode, expression, link);
  }

  public List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    return IMethodCall_Behavior.virtual_getAvailableMethodDeclarations_5776618742611315379(thisNode, methodName);
  }

  public String virtual_getVariableExpectedName_1213877410087(SNode thisNode) {
    return Node_ConceptMethodCall_Behavior.virtual_getVariableExpectedName_1213877410087(thisNode);
  }

  public SNode virtual_getTypeAnnotation_1233920952262(SNode thisNode) {
    return IMethodCall_Behavior.virtual_getTypeAnnotation_1233920952262(thisNode);
  }

  public SNode virtual_deriveType_1213877435747(SNode thisNode, SNode expression) {
    return IMethodCall_Behavior.virtual_deriveType_1213877435747(thisNode, expression);
  }

  public Map<SNode, SNode> virtual_getTypesByTypeVars_851115533308208851(SNode thisNode) {
    return IMethodCall_Behavior.virtual_getTypesByTypeVars_851115533308208851(thisNode);
  }

  public SNode virtual_getInstanceType_8008512149545154471(SNode thisNode) {
    return IMethodCall_Behavior.virtual_getInstanceType_8008512149545154471(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall";
  }
}
