package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PluginModule_Behavior {
  public static void init(SNode thisNode) {
  }

  public static IModule call_getPluginModule_989489456094442313(SNode thisNode) {
    return IdeaInitializerReference_Behavior.call_getContainigModule_989489456094443590(SLinkOperations.getTarget(thisNode, "pluginXmlReference", true));
  }

  public static SNode call_getPathMacro_989489456094444381(SNode thisNode) {
    SNode macro = SLinkOperations.getTarget(PluginModule_Behavior.call_createPluginXmlPathHolder_989489456094459829(thisNode), "macro", false);
    if (macro == null) {
      return null;
    }
    return new PluginModule_Behavior.QuotationClass_yq0j9l_a0c0c().createNode(SPropertyOperations.getString(macro, "name"));
  }

  public static List<String> call_getPathToPluginXml_989489456094444386(SNode thisNode) {
    SNode pathHolder = PluginModule_Behavior.call_createPluginXmlPathHolder_989489456094459829(thisNode);
    if ((SLinkOperations.getTarget(pathHolder, "macro", false) != null)) {
      return Sequence.fromIterable(Sequence.fromArray(PathHolder_Behavior.call_getPathWithoutMacro_1219770843283(pathHolder).split(Util.SEPARATOR))).toListSequence();
    } else {
      return Sequence.fromIterable(Sequence.fromArray(PathHolder_Behavior.call_getPathWithoutMacro_1219770843283(pathHolder).split(Util.SEPARATOR))).toListSequence();
    }
  }

  public static String call_getFullPathToPluginXml_989489456094444401(SNode thisNode) {
    return PluginModule_Behavior.call_getPluginModule_989489456094442313(thisNode).getGeneratorOutputPath() + Util.SEPARATOR + IdeaInitializerReference_Behavior.call_getContainigModel_4015626213813769728(SLinkOperations.getTarget(thisNode, "pluginXmlReference", true)).getLongName().replace(".", Util.SEPARATOR) + Util.SEPARATOR + IdeaInitializerReference_Behavior.call_getGeneratedFileName_4015626213814034867(SLinkOperations.getTarget(thisNode, "pluginXmlReference", true));
  }

  public static SNode call_createPluginXmlPathHolder_989489456094459829(SNode thisNode) {
    SNode layout = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.build.packaging.structure.Layout", true, true);
    return PathHolder_Behavior.createPathHolder_55204148067446946(PluginModule_Behavior.call_getFullPathToPluginXml_989489456094444401(thisNode), SLinkOperations.getTargets(layout, "macro", true), AbstractProjectComponent_Behavior.call_getHomeFile_1213877333764(thisNode).getPath(), thisNode);
  }

  public static class QuotationClass_yq0j9l_a0c0c {
    public QuotationClass_yq0j9l_a0c0c() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.MacroReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setProperty("name", (String) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
