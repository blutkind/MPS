package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class IMethodCall_Behavior {

  public static void init(SNode thisNode) {
  }

  public static Object[] call_getActualArguments_1219275428261(SNode thisNode, final IModule module) {
    return ListSequence.fromIterable(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "actualArgument", true)).select(new ISelector <SNode, Object>() {

      public Object select(SNode it) {
        return Expression_Behavior.call_eval_1213877519769(it, module);
      }
    })).toGenericArray(Object.class);
  }

  public static SNode virtual_deriveType_1213877435747(SNode thisNode, SNode expression) {
    // is 'experssion' an actual argument in this method call?
    if (SNodeOperations.getParent(expression) == thisNode && SNodeOperations.hasRole(expression, "jetbrains.mps.baseLanguage.structure.IMethodCall", "actualArgument")) {
      SNode method = SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false);
      int i = SNodeOperations.getIndexInParent(expression);
      if (i < SLinkOperations.getCount(method, "parameter")) {
        SNode parameterDeclaration = ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).getElement(i);
        return SNodeOperations.copyNode(SLinkOperations.getTarget(parameterDeclaration, "type", true));
      }
    }
    return null;
  }

  public static SNode virtual_getTypeAnnotation_1233920952262(SNode thisNode) {
    return TypeAnnotable_Behavior.call_getTypeAnnotation_1233920952262(SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false));
  }

}
