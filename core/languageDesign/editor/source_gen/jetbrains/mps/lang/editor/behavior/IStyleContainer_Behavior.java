package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IStyleContainer_Behavior {
  private static Class[] PARAMETERS_1219419981626 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getParent_1219419981626(SNode thisNode) {
    return null;
  }

  public static List<SNode> call_getClassItems_1219419901278(SNode thisNode, SNode itemConcept) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode item : SLinkOperations.getTargets(thisNode, "styleItem", true)) {
      if (SNodeOperations.isInstanceOf(item, NameUtil.nodeFQName(itemConcept))) {
        ListSequence.fromList(result).addElement(item);
      }
    }
    if ((IStyleContainer_Behavior.call_getParent_1219419981626(thisNode) != null) && !(ListSequence.fromList(result).contains(IStyleContainer_Behavior.call_getParent_1219419981626(thisNode)))) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(IStyleContainer_Behavior.call_getClassItems_1219419901278(IStyleContainer_Behavior.call_getParent_1219419981626(thisNode), itemConcept)));
    }
    return result;
  }

  public static SNode call_getParent_1219419981626(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.IStyleContainer"), "virtual_getParent_1219419981626", PARAMETERS_1219419981626);
  }

  public static SNode callSuper_getParent_1219419981626(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.IStyleContainer"), callerConceptFqName, "virtual_getParent_1219419981626", PARAMETERS_1219419981626);
  }
}
