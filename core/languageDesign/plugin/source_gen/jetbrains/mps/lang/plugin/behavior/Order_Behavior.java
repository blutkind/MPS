package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class Order_Behavior {
  private static Class[] PARAMETERS_1499919975383913755 = {SNode.class, SNode.class};
  private static Class[] PARAMETERS_3038738109029048958 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String call_getGeneratedClassName_3038738109029038654(SNode thisNode) {
    String n;
    if (StringUtils.isEmpty(SPropertyOperations.getString(thisNode, "name"))) {
      n = SPropertyOperations.getString(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.plugin.structure.EditorTab", false, false), "name");
    } else {
      n = SPropertyOperations.getString(thisNode, "name");
    }
    return NameUtil.toValidCamelIdentifier(n) + "_Order";
  }

  public static boolean virtual_presents_1499919975383879508(SNode thisNode, final SNode tab) {
    return ListSequence.fromList(SLinkOperations.getTargets(thisNode, "tab", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SLinkOperations.getTarget(it, "editorTab", false) == tab;
      }
    }).isNotEmpty();
  }

  public static SNode virtual_getOrder_3038738109029048953(SNode thisNode) {
    return thisNode;
  }

  public static boolean call_presents_1499919975383913755(SNode thisNode, SNode tab) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.Order"), "virtual_presents_1499919975383879508", PARAMETERS_1499919975383913755, tab);
  }

  public static SNode call_getOrder_3038738109029048958(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.Order"), "virtual_getOrder_3038738109029048953", PARAMETERS_3038738109029048958);
  }

  public static boolean callSuper_presents_1499919975383913755(SNode thisNode, String callerConceptFqName, SNode tab) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.Order"), callerConceptFqName, "virtual_presents_1499919975383879508", PARAMETERS_1499919975383913755, tab);
  }

  public static SNode callSuper_getOrder_3038738109029048958(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.Order"), callerConceptFqName, "virtual_getOrder_3038738109029048953", PARAMETERS_3038738109029048958);
  }
}
