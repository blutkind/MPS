package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.io.File;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class Path_Behavior {
  private static Class[] PARAMETERS_1221141245424 = {SNode.class};

  public static void init(SNode thisNode) {
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.MacroReference", null);
    SLinkOperations.setTarget(thisNode, "macro", ref, true);
  }

  public static String call_getFullPathWithoutMacro_1226511495568(SNode thisNode) {
    if ((SLinkOperations.getTarget(thisNode, "compositePathComponent", true) == null) || (int) ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "compositePathComponent", true), "pathComponent", true)).count() == 0) {
      return "";
    }
    StringBuffer sb = new StringBuffer();
    for (SNode component : ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "compositePathComponent", true), "pathComponent", true))) {
      sb.append(SPropertyOperations.getString(component, "path"));
      sb.append(File.separator);
    }
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }

  public static String virtual_getName_1221141245424(SNode thisNode) {
    if ((SLinkOperations.getTarget(thisNode, "compositePathComponent", true) == null) || (int) ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "compositePathComponent", true), "pathComponent", true)).count() == 0) {
      return "";
    }
    return SPropertyOperations.getString(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "compositePathComponent", true), "pathComponent", true)).last(), "path");
  }

  public static File virtual_getFile_1233322718999(SNode thisNode) {
    return new File(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "macro", true), "path") + File.separator + Path_Behavior.call_getFullPathWithoutMacro_1226511495568(thisNode));
  }

  public static String virtual_toString_1213877472569(SNode thisNode) {
    return "${" + SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "macro", true), "name") + "}" + "/" + Path_Behavior.call_getFullPathWithoutMacro_1226511495568(thisNode);
  }

  public static String virtual_getActualValue_1213877472572(SNode thisNode) {
    return IPath_Behavior.call_getFile_1233322718999(thisNode).getAbsolutePath();
  }

  public static String call_getPathUntilCurrent_55204148067303513(SNode thisNode, SNode currentNode) {
    String basePath = SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "macro", true), "path");
    if (basePath == null) {
      basePath = "";
    }
    for (SNode path : ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "compositePathComponent", true), "pathComponent", true))) {
      if (path == currentNode) {
        break;
      }
      basePath += "/" + SPropertyOperations.getString(path, "path");
    }
    return basePath;
  }

  public static boolean call_hasMacro_4323997179924030474(SNode thisNode) {
    return StringUtils.isNotEmpty(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "macro", true), "name"));
  }

  public static String call_getName_1221141245424(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.packaging.structure.Path"), "virtual_getName_1221141245424", PARAMETERS_1221141245424);
  }

  public static String callSuper_getName_1221141245424(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.packaging.structure.Path"), callerConceptFqName, "virtual_getName_1221141245424", PARAMETERS_1221141245424);
  }
}
