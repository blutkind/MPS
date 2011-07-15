package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.MacrosFactory;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.io.File;
import jetbrains.mps.build.packaging.generator.buildlanguage.template.util.Util;
import jetbrains.mps.project.StubPath;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.LanguageID;
import jetbrains.mps.project.SModelRoot;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.DevKit;

public class Module_Behavior {
  public static void init(SNode thisNode) {

  }

  public static String call_getTemporalDir_1213877514765(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "name") + ".tmp";
  }

  public static boolean call_isCompiledInMPS_1213877514774(SNode thisNode) {
    return Module_Behavior.call_getModule_1213877515148(thisNode).isCompileInMPS();
  }

  public static SNode call_getModuleBaseDirectory_6863060912307757632(SNode thisNode) {
    return PathHolder_Behavior.createPathHolder_7235580512916878209(MacrosFactory.moduleDescriptor(Module_Behavior.call_getModule_1213877515148(thisNode)).expandPath(MacrosFactory.getMacroString(Module_Behavior.call_getModule_1213877515148(thisNode)), Module_Behavior.call_getModule_1213877515148(thisNode).getDescriptorFile()), thisNode);
  }

  public static SNode call_getModuleDescriptorFile_6863060912307764362(SNode thisNode) {
    return PathHolder_Behavior.createPathHolder_7235580512916878209(Module_Behavior.call_getModule_1213877515148(thisNode).getDescriptorFile().getPath(), thisNode);
  }

  public static SNode call_getClassesGen_3315989002810564857(SNode thisNode) {
    return PathHolder_Behavior.createPathHolder_7235580512916878209(Module_Behavior.call_getModule_1213877515148(thisNode).getClassesGen().getPath(), thisNode);
  }

  public static List<SNode> call_getSourcesDirectories_1775602641704992067(SNode thisNode) {
    return Module_Behavior.call_getPathHolders_1213877515000(thisNode, ListSequence.fromList(ListSequence.fromListWithValues(new ArrayList<String>(), Module_Behavior.call_getModule_1213877515148(thisNode).getSourcePaths())).<String>select(new ISelector<String, String>() {
      public String select(String it) {
        return it.replace(File.separator, Util.SEPARATOR);
      }
    }).toListSequence(), false);
  }

  public static List<SNode> call_getClassPathDirectories_1213877515083(SNode thisNode) {
    List<StubPath> paths = ((AbstractModule) Module_Behavior.call_getModule_1213877515148(thisNode)).getAllStubPaths();
    return Module_Behavior.call_getPathHolders_1213877515000(thisNode, Sequence.fromIterable(Module_Behavior.call_convertSeparators_4777659345279794559(thisNode, ListSequence.fromList(paths).where(new IWhereFilter<StubPath>() {
      public boolean accept(StubPath it) {
        return LanguageID.JAVA_MANAGER.equals(it.getManager()) || it.getPath().endsWith(".jar");
      }
    }).toListSequence())).distinct().toListSequence(), true);
  }

  public static List<SNode> call_getModelRootPaths_2739262311775052381(SNode thisNode) {
    List<SModelRoot> paths = ((AbstractModule) Module_Behavior.call_getModule_1213877515148(thisNode)).getSModelRoots();
    if (Module_Behavior.call_getModule_1213877515148(thisNode) instanceof Language) {
      paths = ListSequence.fromListWithValues(new ArrayList<SModelRoot>(), paths);
      ListSequence.fromList(paths).addSequence(Sequence.fromIterable(((Iterable<Generator>) ((Language) Module_Behavior.call_getModule_1213877515148(thisNode)).getGenerators())).<SModelRoot>translate(new ITranslator2<Generator, SModelRoot>() {
        public Iterable<SModelRoot> translate(Generator it) {
          return it.getSModelRoots();
        }
      }));
    }
    return Module_Behavior.call_getPathHolders_1213877515000(thisNode, ListSequence.fromList(paths).<String>select(new ISelector<SModelRoot, String>() {
      public String select(SModelRoot it) {
        return it.getPath().replace(File.separator, Util.SEPARATOR);
      }
    }).distinct().toListSequence(), true);
  }

  public static List<SNode> call_getSourcePaths_3673831299872169203(SNode thisNode) {
    return Module_Behavior.call_getPathHolders_1213877515000(thisNode, ListSequence.fromList(((List<String>) Module_Behavior.call_getModule_1213877515148(thisNode).getSourcePaths())).<String>select(new ISelector<String, String>() {
      public String select(String it) {
        return it.replace(File.separator, Util.SEPARATOR);
      }
    }).distinct().toListSequence(), true);
  }

  public static List<SNode> call_getRuntimeClassPath_1213877515098(SNode thisNode, boolean includeRuntimeSolutions) {
    IModule module = Module_Behavior.call_getModule_1213877515148(thisNode);
    if (module instanceof Language) {
      List<SNode> result = ListSequence.fromList(Module_Behavior.call_getPathHolders_1213877515000(thisNode, Sequence.fromIterable(Module_Behavior.call_convertSeparators_4777659345279794559(thisNode, ((Language) module).getRuntimeStubPaths())).distinct().toListSequence(), true)).subtract(ListSequence.fromList(Module_Behavior.call_getClassPathDirectories_1213877515083(thisNode))).toListSequence();
      if (includeRuntimeSolutions) {
        for (Dependency runtimeDependency : ListSequence.fromList(((Language) module).getRuntimeDependencies())) {
          IModule runtimeDependencyModule = MPSModuleRepository.getInstance().getModule(runtimeDependency.getModuleRef());
          if (runtimeDependencyModule instanceof Solution) {
            // TODO proper module in holder? 
            ListSequence.fromList(result).addSequence(ListSequence.fromList(Module_Behavior.call_getPathHolders_1213877515000(thisNode, Sequence.fromIterable(Module_Behavior.call_convertSeparators_4777659345279794559(thisNode, ((Solution) runtimeDependencyModule).getAllStubPaths())).toListSequence(), true)));
          }
        }
      }
      return result;
    }
    return new ArrayList<SNode>();
  }

  public static String call_getModuleFolderPath_2850282874221203279(SNode thisNode) {
    return ModuleUtil.getRelativePath(AbstractProjectComponent_Behavior.call_getPath_1213877333777(thisNode).getPath(), AbstractProjectComponent_Behavior.call_getHomeFile_1213877333764(thisNode));
  }

  public static String call_getModuleSourcesJarPath_1986682148700597281(SNode thisNode) {
    return Module_Behavior.call_getModuleFolderPath_2850282874221203279(thisNode) + "-src.jar";
  }

  public static String call_getRuntimeJarPath_1213877515126(SNode thisNode) {
    return Module_Behavior.call_getModuleFolderPath_2850282874221203279(thisNode) + "-runtime.jar";
  }

  public static String call_getModuleJarPath_1213877515137(SNode thisNode) {
    return Module_Behavior.call_getModuleFolderPath_2850282874221203279(thisNode) + ".jar";
  }

  public static IModule call_getModule_1213877515148(SNode thisNode) {
    return MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString(SPropertyOperations.getString(thisNode, "id")));
  }

  public static String call_getChildrenTargetDir_1213877514970(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent")) {
      return IAbstractCompositeComponent_Behavior.call_getChildrenTargetDir_1237389224202(SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent")) + File.separator + Module_Behavior.call_getTemporalDir_1213877514765(thisNode);
    }
    return Module_Behavior.call_getTemporalDir_1213877514765(thisNode);
  }

  public static String call_getModuleDescriptorPath_4777659345280330855(SNode thisNode) {
    return check_835h7m_a0a61(Module_Behavior.call_getModule_1213877515148(thisNode).getDescriptorFile().getParent().getPath(), File.separator, Util.SEPARATOR);
  }

  public static List<SNode> call_getPathHolders_1213877515000(SNode thisNode, List<String> stubpath, boolean onlyUnderProjectBasedir) {
    List<SNode> result = new ArrayList<SNode>();
    String projectBasedir = "";
    // search for project if needed 
    if (onlyUnderProjectBasedir) {
      projectBasedir = Module_Behavior.call_getProjectBasedir_1213877514893(thisNode);
      if (projectBasedir == null) {
        projectBasedir = Module_Behavior.call_getModuleDescriptorPath_4777659345280330855(thisNode);
      }
    }
    // process classpath 
    for (String cp : ListSequence.fromList(stubpath)) {
      if (!(onlyUnderProjectBasedir) || cp.startsWith(projectBasedir)) {
        ListSequence.fromList(result).addElement(PathHolder_Behavior.createPathHolder_7235580512916878209(cp, thisNode));
      }
    }
    return result;
  }

  public static String call_getProjectBasedir_1213877514893(SNode thisNode) {
    IFile file = Module_Behavior.call_findMPSProjectFile_1213877514840(thisNode, Module_Behavior.call_getModule_1213877515148(thisNode).getDescriptorFile().getParent());
    if (file == null) {
      return null;
    }
    return file.getPath().replace(File.separator, Util.SEPARATOR);
  }

  public static IFile call_findMPSProjectFile_1213877514840(SNode thisNode, IFile file) {
    if (AbstractProjectComponent_Behavior.call_getHomeFile_1213877333764(thisNode).getAbsolutePath().startsWith(file.getPath()) && !(AbstractProjectComponent_Behavior.call_getHomeFile_1213877333764(thisNode).getAbsolutePath().equals(file.getPath()))) {
      return null;
    }
    List<IFile> children = file.getChildren();
    for (IFile child : children) {
      if (!(child.isDirectory()) && (child.getName().endsWith(MPSExtentions.DOT_MPS_PROJECT))) {
        return child.getParent();
      }
    }
    return Module_Behavior.call_findMPSProjectFile_1213877514840(thisNode, file.getParent());
  }

  public static Iterable<String> call_convertSeparators_4777659345279794559(SNode thisNode, List<StubPath> paths) {
    return ListSequence.fromList(paths).<String>select(new ISelector<StubPath, String>() {
      public String select(StubPath it) {
        return it.getPath().replace(File.separator, Util.SEPARATOR);
      }
    });
  }

  public static List<IModule> getAllAvailableModules_1222444746697() {
    List<IModule> list = ListSequence.fromList(new ArrayList<IModule>());
    for (Language language : ListSequence.fromList(GlobalScope.getInstance().getVisibleLanguages())) {
      ListSequence.fromList(list).addElement(language);
    }
    for (DevKit devKit : ListSequence.fromList(GlobalScope.getInstance().getVisibleDevkits())) {
      ListSequence.fromList(list).addElement(devKit);
    }
    for (Solution solution : ListSequence.fromList(GlobalScope.getInstance().getVisibleSolutions())) {
      ListSequence.fromList(list).addElement(solution);
    }
    return list;
  }

  public static String extractModuleProperName_1235487584035(IModule module) {
    return Module_Behavior.replaceBadCharacters_1235487831795(module.getModuleFqName());
  }

  public static String replaceBadCharacters_1235487831795(String name) {
    return name.replace("/", "_").replace("\\", "_");
  }

  private static String check_835h7m_a0a61(String checkedDotOperand, String separator, String SEPARATOR) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.replace(File.separator, Util.SEPARATOR);
    }
    return null;
  }
}
