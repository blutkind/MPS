package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.checkedName.PropertyReference;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.util.NodeNameUtil;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.plugins.MacrosUtil;

public class ActionDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getGeneratedName_1213877371942(SNode thisNode) {
    return NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_Action";
  }

  public static String call_getGeneratedClassFQName_1213877371952(SNode thisNode) {
    return SNodeOperations.getModel(thisNode).getLongName() + "." + ActionDeclaration_Behavior.call_getGeneratedName_1213877371942(thisNode);
  }

  public static SNode virtual_createType_1213877527970(SNode thisNode) {
    SNode type = SConceptOperations.createNewNode("jetbrains.mps.lang.plugin.structure.ActionType", null);
    SLinkOperations.setTarget(type, "action", thisNode, false);
    return type;
  }

  public static PropertyReference virtual_getPropertyToCheck_5003188907305392322(SNode thisNode) {
    return new PropertyReference(thisNode, "caption");
  }

  public static boolean call_isLoadIconFromResoures_1588596821190606499(SNode thisNode, IModule module) {
    if (ListSequence.fromList(SModelOperations.getRoots(SNodeOperations.getModel(thisNode), "jetbrains.mps.lang.plugin.structure.IdeaInitializerDescriptor")).isEmpty()) {
      return false;
    }
    String fullPath = ActionDeclaration_Behavior.call_getFullPath_6301602537765917913(thisNode, module);
    for (String sourcePath : ListSequence.fromList(module.getSourcePaths())) {
      String prefix = ActionDeclaration_Behavior.call_getPrefix_1588596821190636875(thisNode, sourcePath);
      if (fullPath.toLowerCase().startsWith(prefix.toLowerCase())) {
        return true;
      }
    }
    return false;
  }

  public static String call_getIconResourcePath_1588596821190635995(SNode thisNode, IModule module) {
    String fullPath = ActionDeclaration_Behavior.call_getFullPath_6301602537765917913(thisNode, module);
    for (String sourcePath : ListSequence.fromList(module.getSourcePaths())) {
      String prefix = ActionDeclaration_Behavior.call_getPrefix_1588596821190636875(thisNode, sourcePath);
      if (fullPath.toLowerCase().startsWith(prefix.toLowerCase())) {
        return fullPath.substring(prefix.length() + 1);
      }
    }
    throw new RuntimeException("Icon path " + SPropertyOperations.getString(thisNode, "iconPath") + " is outside of any source folders.");
  }

  public static String call_getPrefix_1588596821190636875(SNode thisNode, String sourcePath) {
    return sourcePath + "/" + NodeNameUtil.getNamespace(INamedConcept_Behavior.call_getFqName_1213877404258(thisNode)).replace(".", "/");
  }

  public static String call_getFullPath_6301602537765917913(SNode thisNode, IModule module) {
    return MacrosUtil.expandPath(SPropertyOperations.getString(thisNode, "iconPath"), module.getModuleFqName());
  }
}
