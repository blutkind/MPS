package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.baseLanguage.behavior.Expression_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.dataFlow.runtime.NullableVariableState;
import jetbrains.mps.dataFlow.runtime.NullableUtil;

public class BaseMethodCall_Behavior {

  public static void init(SNode thisNode) {
  }

  public static Object[] call_getActualArguments_1213877339153(SNode thisNode, final IModule module) {
    return ListSequence.fromIterable(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "actualArgument", true)).select(new ISelector <SNode, Object>() {

      public Object select(SNode it) {
        return Expression_Behavior.call_eval_1213877519769(it, module);
      }
    })).toGenericArray(Object.class);
  }

  public static String virtual_getVariableExpectedName_1213877519781(SNode thisNode) {
    String variableExpectedName = null;
    if ((SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false) != null)) {
      String name = SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false), "name");
      if (name.startsWith("get")) {
        variableExpectedName = name.substring(3);
      } else
      if (name.startsWith("is")) {
        variableExpectedName = name.substring(2);
      } else
      {
        variableExpectedName = name;
      }
    }
    return NameUtil.decapitalize(variableExpectedName);
  }

  public static NullableVariableState virtual_getNullableState_1230540989695(SNode thisNode) {
    return NullableUtil.getVariableStateByAnnotation(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false), "annotation", true));
  }

  public static boolean virtual_isLegalAsStatement_1239211900844(SNode thisNode) {
    return true;
  }

}
