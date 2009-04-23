package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.io.File;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class AbstractProjectComponent_Behavior {
  private static Class[] PARAMETERS_1213877333777 = {SNode.class};
  private static Class[] PARAMETERS_1213877333861 = {SNode.class};
  private static Class[] PARAMETERS_1213877333900 = {SNode.class ,SNode.class};

  public static void init(SNode thisNode) {
  }

  public static File call_getHomePath_1213877333764(SNode thisNode) {
    return new File(ILayoutComponent_Behavior.call_getPath_1213877230696(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.build.packaging.structure.MPSLayout", true, true)));
  }

  public static File call_getPath_1233752667763(SNode thisNode, SNode parentNode) {
    if (SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent")) {
      String parentTargetDir = IAbstractCompositeComponent_Behavior.call_getChildrenTargetDir_1237389224202(SNodeOperations.cast(parentNode, "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent"));
      if (StringUtils.isEmpty(parentTargetDir)) {
        return new File(SPropertyOperations.getString(thisNode, "name"));
      }
      return new File(parentTargetDir + File.separator + SPropertyOperations.getString(thisNode, "name"));
    } else if (SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.build.packaging.structure.IfProjectComponent")) {
      return AbstractProjectComponent_Behavior.call_getPath_1233752667763(thisNode, SNodeOperations.getParent(parentNode));
    }
    return new File(SPropertyOperations.getString(thisNode, "name"));
  }

  public static File virtual_getPath_1213877333777(SNode thisNode) {
    return AbstractProjectComponent_Behavior.call_getPath_1233752667763(thisNode, SNodeOperations.getParent(thisNode));
  }

  public static boolean call_included_1213877333807(SNode thisNode, SNode config) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.AbstractProjectComponent") && !(AbstractProjectComponent_Behavior.call_included_1213877333807(SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.AbstractProjectComponent"), config))) {
      return false;
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(thisNode, "configuration", true)).isEmpty()) {
      return true;
    }
    for(SNode ref : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "configuration", true))) {
      if (SLinkOperations.getTarget(ref, "configuration", false) == config) {
        return true;
      }
    }
    return false;
  }

  public static List<SNode> virtual_getPostProcessingTasks_1213877333861(SNode thisNode) {
    return ListSequence.fromList(new ArrayList<SNode>());
  }

  public static String call_getShortName_1213877333869(SNode thisNode, String name) {
    name = name.substring(name.lastIndexOf("/") + 1);
    name = name.substring(name.lastIndexOf("\\") + 1);
    return name;
  }

  public static boolean virtual_equals_1213877333900(SNode thisNode, SNode snode) {
    if (!(SNodeOperations.isInstanceOf(snode, NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(thisNode))))) {
      return false;
    }
    return EqualUtil.equalsIgnoreCase(SPropertyOperations.getString(thisNode, "name"), SPropertyOperations.getString(snode, "name"));
  }

  public static File call_getPath_1213877333777(SNode thisNode) {
    return (File)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getPath_1213877333777", PARAMETERS_1213877333777);
  }

  public static List<SNode> call_getPostProcessingTasks_1213877333861(SNode thisNode) {
    return (List<SNode>)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getPostProcessingTasks_1213877333861", PARAMETERS_1213877333861);
  }

  public static boolean call_equals_1213877333900(SNode thisNode, SNode snode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, thisNode, "virtual_equals_1213877333900", PARAMETERS_1213877333900, snode);
  }

  public static File callSuper_getPath_1213877333777(SNode thisNode, String callerConceptFqName) {
    return (File)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getPath_1213877333777", PARAMETERS_1213877333777);
  }

  public static List<SNode> callSuper_getPostProcessingTasks_1213877333861(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getPostProcessingTasks_1213877333861", PARAMETERS_1213877333861);
  }

  public static boolean callSuper_equals_1213877333900(SNode thisNode, String callerConceptFqName, SNode snode) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, thisNode, callerConceptFqName, "virtual_equals_1213877333900", PARAMETERS_1213877333900, snode);
  }

}
