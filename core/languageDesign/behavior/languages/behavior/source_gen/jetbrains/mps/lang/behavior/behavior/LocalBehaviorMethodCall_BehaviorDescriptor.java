package jetbrains.mps.lang.behavior.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Expression_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.IMethodCall_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.TypeDerivable_Behavior;
import java.util.List;
import jetbrains.mps.baseLanguage.behavior.IMethodCall_Behavior;
import java.util.Map;

public class LocalBehaviorMethodCall_BehaviorDescriptor extends Expression_BehaviorDescriptor implements IMethodCall_BehaviorDescriptor {
  public LocalBehaviorMethodCall_BehaviorDescriptor() {
  }

  public SNode virtual_deriveType_4555537781928374706(SNode thisNode, SNode expression, SNode link) {
    return TypeDerivable_Behavior.virtual_deriveType_4555537781928374706(thisNode, expression, link);
  }

  public List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    return IMethodCall_Behavior.virtual_getAvailableMethodDeclarations_5776618742611315379(thisNode, methodName);
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
}
