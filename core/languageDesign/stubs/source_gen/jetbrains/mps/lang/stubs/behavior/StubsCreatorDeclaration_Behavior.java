package jetbrains.mps.lang.stubs.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class StubsCreatorDeclaration_Behavior {
  private static Class[] PARAMETERS_5516999836374144781 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_createType_1213877527970(SNode thisNode) {
    return new _Quotations.QuotationClass_0().createNode(thisNode);
  }

  public static SNode call_createType_5516999836374144781(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.stubs.structure.StubsCreatorDeclaration"), "virtual_createType_1213877527970", PARAMETERS_5516999836374144781);
  }

  public static SNode callSuper_createType_5516999836374144781(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.stubs.structure.StubsCreatorDeclaration"), callerConceptFqName, "virtual_createType_1213877527970", PARAMETERS_5516999836374144781);
  }
}
