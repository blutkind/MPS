package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import com.intellij.openapi.application.PathMacros;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class IMacroHolder_Behavior {
  private static Class[] PARAMETERS_1234976932856 = {SNode.class};
  private static Class[] PARAMETERS_1234975567387 = {SNode.class ,Boolean.TYPE};

  public static void init(SNode thisNode) {
  }

  public static SNode call_findMacroForReference_1234972707641(SNode thisNode, SNode macroReference) {
    for(SNode macro : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "macro", true))) {
      if (SPropertyOperations.getString(macroReference, "name").equals(SPropertyOperations.getString(macro, "name"))) {
        return macro;
      }
    }
    return null;
  }

  public static List<String> virtual_getAllMacroNames_1234975567387(SNode thisNode, boolean addBasedir) {
    List<String> names = ListSequence.fromListAndArray(new ArrayList<String>(), MPSLayout_Behavior.getMPSHomeName_1226508944077());
    if (addBasedir) {
      ListSequence.fromList(names).addElement(MPSLayout_Behavior.getBasedirName_1226509010730());
    }
    ListSequence.fromList(names).addSequence(SetSequence.fromSet(PathMacros.getInstance().getUserMacroNames()));
    return names;
  }

  public static String call_evaluateMacro_1234975967990(SNode thisNode, String macroName) {
    if (macroName == null) {
      return "";
    }
    if (macroName.equals(MPSLayout_Behavior.getBasedirName_1226509010730())) {
      return IMacroHolder_Behavior.call_getPath_1234976932856(thisNode);
    }
    if (macroName.equals(MPSLayout_Behavior.getMPSHomeName_1226508944077())) {
      return PathManager.getHomePath();
    }
    return PathMacros.getInstance().getValue(macroName);
  }

  public static String call_getPath_1234976932856(SNode thisNode) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.packaging.structure.IMacroHolder"), "virtual_getPath_1234976932856", PARAMETERS_1234976932856);
  }

  public static List<String> call_getAllMacroNames_1234975567387(SNode thisNode, boolean addBasedir) {
    return (List<String>)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.packaging.structure.IMacroHolder"), "virtual_getAllMacroNames_1234975567387", PARAMETERS_1234975567387, addBasedir);
  }

  public static String callSuper_getPath_1234976932856(SNode thisNode, String callerConceptFqName) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.packaging.structure.IMacroHolder"), callerConceptFqName, "virtual_getPath_1234976932856", PARAMETERS_1234976932856);
  }

  public static List<String> callSuper_getAllMacroNames_1234975567387(SNode thisNode, String callerConceptFqName, boolean addBasedir) {
    return (List<String>)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.packaging.structure.IMacroHolder"), callerConceptFqName, "virtual_getAllMacroNames_1234975567387", PARAMETERS_1234975567387, addBasedir);
  }

}
