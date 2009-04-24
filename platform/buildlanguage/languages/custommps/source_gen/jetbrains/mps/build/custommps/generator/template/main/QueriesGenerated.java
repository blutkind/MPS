package jetbrains.mps.build.custommps.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.build.custommps.behavior.MPSBuild_Behavior;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.library.BuiltInLibrariesIO;
import java.io.File;
import jetbrains.mps.build.packaging.behavior.IStringExpression_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.custommps.behavior.LibraryFolder_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.build.packaging.behavior.IVariableHolder_Behavior;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.build.custommpsInternal.behavior.MPSModule_Behavior;
import jetbrains.mps.util.PathManager;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import jetbrains.mps.build.packaging.behavior.Configuration_Behavior;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1234878205127(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommpsInternal.structure.UndeclaredVariableReference", false)).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_1234878220298(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommpsInternal.structure.UndeclaredVariableReference", false)).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_1234891502382(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", true, false) != null);
  }

  public static boolean baseMappingRule_Condition_1234891560671(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.distrib.structure.DistribConfiguration", true, false) != null);
  }

  public static boolean baseMappingRule_Condition_1236880935820(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.build.packaging.structure.ICompositeComponent");
  }

  public static boolean baseMappingRule_Condition_1236880986480(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.build.packaging.structure.MPSLayout");
  }

  public static boolean baseMappingRule_Condition_1238505255171(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false)).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_1238511930684(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false)).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_1240396552572(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false)).isNotEmpty() && MPSBuild_Behavior.isInMPSBuild_1239995424995();
  }

  public static Object propertyMacro_GetPropertyValue_1233670619638(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BuiltInLibrariesIO.class.getName();
  }

  public static Object propertyMacro_GetPropertyValue_1233671293016(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("add.libraries", null);
  }

  public static Object propertyMacro_GetPropertyValue_1233683018283(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BuiltInLibrariesIO.getModifiedConfigurationFile().replace(File.separator, "/");
  }

  public static Object propertyMacro_GetPropertyValue_1233738680554(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IStringExpression_Behavior.call_getValue_1213877173054(SLinkOperations.getTarget(_context.getNode(), "libraryName", true));
  }

  public static Object propertyMacro_GetPropertyValue_1233738709211(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return LibraryFolder_Behavior.call_getLibraryPathRelativeToMPSBuild_1240408519032(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1233749656884(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "artifactName");
  }

  public static Object propertyMacro_GetPropertyValue_1233750926575(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String artifactNormalizedPath = SPropertyOperations.getString(_context.getNode(), "artifactName").replace("\\", "/");
    int index = artifactNormalizedPath.lastIndexOf("/");
    return artifactNormalizedPath.substring(index + 1);
  }

  public static Object propertyMacro_GetPropertyValue_1233931574105(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "antName");
  }

  public static Object propertyMacro_GetPropertyValue_1233931591542(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1236885168266(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("unpack.buildtools.zip", null);
  }

  public static Object propertyMacro_GetPropertyValue_1239129898181(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSBuild_Behavior.getMPSBuildToolsZipName_1234294616845();
  }

  public static Object propertyMacro_GetPropertyValue_1239130486816(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSBuild_Behavior.getMPSBuildToolsZipName_1234294616845();
  }

  public static Object propertyMacro_GetPropertyValue_1239372488254(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239714056018(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239714246915(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239714255706(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239714264392(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239714274693(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239714279856(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239714288015(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239714303951(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239714309621(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239974227876(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1239975476522(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1240406745369(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IStringExpression_Behavior.call_getValue_1213877173054(SLinkOperations.getTarget(_context.getNode(), "libraryName", true));
  }

  public static Object propertyMacro_GetPropertyValue_1240406905199(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return LibraryFolder_Behavior.call_getLibraryPathRelativeToMPSBuild_1240408519032(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1240558468369(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object propertyMacro_GetPropertyValue_1240558476327(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder");
  }

  public static Object referenceMacro_GetReferent_1233931081841(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode output = _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "UndeclaredVariableReferenceToVariable");
    if (output == null) {
      output = IVariableHolder_Behavior.call_findVariable_1234876428215(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.IVariableHolder", true, false), SPropertyOperations.getString(_context.getNode(), "name"), SPropertyOperations.getString(_context.getNode(), "antName"));
    }
    return output;
  }

  public static Object referenceMacro_GetReferent_1234780240997(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    if (ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "configuration", true)).isNotEmpty()) {
      return SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "configuration", true)).first(), "configuration", false);
    } else
    {
      return ListSequence.fromList(SLinkOperations.getTargets(_context.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false)), "configuration", true)).first();
    }
  }

  public static Object referenceMacro_GetReferent_1234780362598(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CustomMPsBuildToFolder");
  }

  public static Object referenceMacro_GetReferent_1234891647534(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode output = _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "UndeclaredVariableReferenceToVariable");
    if (output == null) {
      return IVariableHolder_Behavior.call_findVariable_1234876428215(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.IVariableHolder", true, false), SPropertyOperations.getString(_context.getNode(), "name"), SPropertyOperations.getString(_context.getNode(), "antName"));
    }
    return output;
  }

  public static Object referenceMacro_GetReferent_1234971270263(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("date")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234971270387(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CustomMPSBuildToTargetDeclaration");
  }

  public static Object referenceMacro_GetReferent_1234971270563(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("date")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234971270602(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234971270630(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("date")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234971270656(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234971270687(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1239129956195(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CustomMPSBuildToUnpackZipAntcall");
  }

  public static Object referenceMacro_GetReferent_1239130486844(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CustomMPSBuildToUnpackZipAntcall");
  }

  public static Object referenceMacro_GetReferent_1240405287357(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1240409797882(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1240409815337(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static boolean ifMacro_Condition_1233681193440(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_1234971270318(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_1236885202196(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "pathToBuildToolsZip", true) != null);
  }

  public static boolean ifMacro_Condition_1237471365276(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(MPSModule_Behavior.call_isPackaged_1240033962874(_context.getNode()));
  }

  public static boolean ifMacro_Condition_1237898505805(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "licencePath", true) != null);
  }

  public static boolean ifMacro_Condition_1237901321779(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(MPSBuild_Behavior.isInMPSBuild_1239995424995());
  }

  public static boolean ifMacro_Condition_1238071255691(final IOperationContext operationContext, final IfMacroContext _context) {
    return new File(PathManager.getHomePath() + File.separator + "lib/mps.jar").exists();
  }

  public static boolean ifMacro_Condition_1238512293286(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(new File(PathManager.getHomePath() + File.separator + "lib/mps.jar").exists());
  }

  public static boolean ifMacro_Condition_1238589858624(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(new File(PathManager.getHomePath() + File.separator + "lib/mps.jar").exists());
  }

  public static boolean ifMacro_Condition_1239129903106(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(new File(PathManager.getHomePath() + File.separator + "lib" + File.separator + "mps.jar").exists());
  }

  public static boolean ifMacro_Condition_1239130486822(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(new File(PathManager.getHomePath() + File.separator + "lib" + File.separator + "mps.jar").exists());
  }

  public static boolean ifMacro_Condition_1239370889223(final IOperationContext operationContext, final IfMacroContext _context) {
    return StringUtils.isEmpty(SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder"));
  }

  public static boolean ifMacro_Condition_1239974232399(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(StringUtils.isEmpty(SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "scriptsFolder")));
  }

  public static boolean ifMacro_Condition_1240401761235(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(MPSBuild_Behavior.isInMPSBuild_1239995424995());
  }

  public static boolean ifMacro_Condition_1240401922710(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(MPSBuild_Behavior.isInMPSBuild_1239995424995());
  }

  public static boolean ifMacro_Condition_1240405813130(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(MPSBuild_Behavior.isInMPSBuild_1239995424995());
  }

  public static boolean ifMacro_Condition_1240405930553(final IOperationContext operationContext, final IfMacroContext _context) {
    return MPSBuild_Behavior.isInMPSBuild_1239995424995();
  }

  public static boolean ifMacro_Condition_1240406540206(final IOperationContext operationContext, final IfMacroContext _context) {
    return MPSBuild_Behavior.isInMPSBuild_1239995424995();
  }

  public static SNode sourceNodeQuery_1233749686668(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "create", true);
  }

  public static SNode sourceNodeQuery_1234971270743(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1236885059370(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "pathToBuildToolsZip", true);
  }

  public static SNode sourceNodeQuery_1237471483870(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode module = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Module", null);
    SPropertyOperations.set(module, "id", SPropertyOperations.getString(_context.getNode(), "id"));
    for(SNode config : ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "configuration", true))) {
      SLinkOperations.addChild(module, "configuration", config);
    }
    return module;
  }

  public static SNode sourceNodeQuery_1237563071849(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return MPSModule_Behavior.call_createPathFromMPSHome_1240033962895(_context.getNode());
  }

  public static SNode sourceNodeQuery_1237898470384(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "licencePath", true);
  }

  public static SNode sourceNodeQuery_1237901351779(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "licencePath", true);
  }

  public static Iterable sourceNodesQuery_1233670839960(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false);
  }

  public static Iterable sourceNodesQuery_1233670963750(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false);
  }

  public static Iterable sourceNodesQuery_1233749730940(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> components = ListSequence.fromList(new ArrayList<SNode>());
    String[] path = SPropertyOperations.getString(_context.getNode(), "artifactName").replace("\\", "/").split("/");
    for(String p : path) {
      SNode c = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.PathComponent", null);
      SPropertyOperations.set(c, "path", p);
      ListSequence.fromList(components).addElement(c);
    }
    ListSequence.fromList(components).removeLastElement();
    return components;
  }

  public static Iterable sourceNodesQuery_1234877027528(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    Iterable<SNode> undeclaredVariables = ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommpsInternal.structure.UndeclaredVariableReference", false)).distinct();
    return Sequence.fromIterable(undeclaredVariables).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return (IVariableHolder_Behavior.call_findVariable_1234876428215(_context.getCopiedOutputNodeForInputNode(_context.getNode()), SPropertyOperations.getString(it, "name"), SPropertyOperations.getString(it, "antName")) == null);
      }
    });
  }

  public static Iterable sourceNodesQuery_1234877165687(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    Iterable<SNode> undeclaredVariables = ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommpsInternal.structure.UndeclaredVariableReference", false)).distinct();
    return Sequence.fromIterable(undeclaredVariables).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return (IVariableHolder_Behavior.call_findVariable_1234876428215(_context.getCopiedOutputNodeForInputNode(_context.getNode()), SPropertyOperations.getString(it, "name"), SPropertyOperations.getString(it, "antName")) == null);
      }
    });
  }

  public static Iterable sourceNodesQuery_1234971270736(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "entry", true);
  }

  public static Iterable sourceNodesQuery_1234971270750(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "configuration", true);
  }

  public static Iterable sourceNodesQuery_1236885100224(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false);
  }

  public static Iterable sourceNodesQuery_1240406584247(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1234876993397(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(_context.getNode());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1234877152440(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(Configuration_Behavior.call_getLayout_1213877261819(SLinkOperations.getTarget(_context.getNode(), "buildScriptConfiguration", false)));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1236879442709(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(SNodeOperations.getParent(_context.getNode()));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1236880980817(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(SNodeOperations.getParent(_context.getNode()));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1238505225587(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(_context.getNode());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1238511912916(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(_context.getNode());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1240396533793(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(_context.getNode());
  }

}
