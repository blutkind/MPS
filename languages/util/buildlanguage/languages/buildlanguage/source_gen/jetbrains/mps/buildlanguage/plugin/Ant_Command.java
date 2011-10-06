package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.execution.lib.Java_Command;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.execution.api.commands.ListCommandPart;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.execution.api.commands.PropertyCommandPart;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.execution.api.commands.KeyValueCommandPart;
import java.io.File;
import com.intellij.openapi.application.PathManager;
import java.util.List;
import jetbrains.mps.execution.api.commands.CommandPart;
import com.intellij.openapi.application.PathMacros;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.generator.fileGenerator.FileGenerationUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.buildlanguage.behavior.Project_Behavior;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class Ant_Command {
  private SNode myTarget;
  private String myAntLocation = Ant_Command.getDefaultAntHome();
  private String myOptions;
  private String myTargetName;

  public Ant_Command() {
  }

  public Ant_Command setTarget(SNode target) {
    if (target != null) {
      myTarget = target;
    }
    return this;
  }

  public Ant_Command setAntLocation(String antLocation) {
    if (antLocation != null) {
      myAntLocation = antLocation;
    }
    return this;
  }

  public Ant_Command setOptions(String options) {
    if (options != null) {
      myOptions = options;
    }
    return this;
  }

  public Ant_Command setTargetName(String targetName) {
    if (targetName != null) {
      myTargetName = targetName;
    }
    return this;
  }

  public ProcessHandler createProcess(SNode project) throws ExecutionException {
    String targetName = Ant_Command.getTargetName(myTarget);
    return new Ant_Command().setAntLocation(myAntLocation).setOptions(myOptions).setTargetName(targetName).createProcess(Ant_Command.getGeneratedFileName(project));
  }

  public ProcessHandler createProcess(String antFilePath) throws ExecutionException {
    String jdkHome = Java_Command.getJdkHome();
    if (StringUtils.isEmpty(jdkHome)) {
      throw new ExecutionException("Could not find valid java home.");
    }
    return new Java_Command().createProcess(new ListCommandPart(ListSequence.fromListAndArray(new ArrayList(), new PropertyCommandPart("java.home", jdkHome), new PropertyCommandPart("ant.home", myAntLocation), new ListCommandPart(Sequence.fromIterable(Ant_Command.getMacroValues()).toListSequence()), ((StringUtils.isNotEmpty(myOptions) ?
      myOptions + " " :
      ""
    )), new KeyValueCommandPart("-" + "f", new File(antFilePath)), ((StringUtils.isEmpty(myTargetName) ?
      "" :
      " " + myTargetName
    )))), "org.apache.tools.ant.launch.Launcher", Ant_Command.getAntClassPath(myAntLocation));
  }

  private static String getDefaultAntHome() {
    return PathManager.getHomePath() + File.separator + "lib" + File.separator + "ant";
  }

  private static List<File> getAntClassPath(String antHome) throws ExecutionException {
    String antlib = antHome + File.separator + "lib";
    File antLibFile = new File(antlib);
    if (!(antLibFile.exists())) {
      throw new ExecutionException("Ant directory " + antlib + " does not exist.");
    }
    List<File> classPath = ListSequence.fromList(new ArrayList<File>());
    for (File jarFile : antLibFile.listFiles()) {
      String jarFilePath = jarFile.getAbsolutePath();
      if (jarFilePath.endsWith(".jar")) {
        ListSequence.fromList(classPath).addElement(jarFile);
      }
    }
    return classPath;
  }

  private static Iterable<CommandPart> getMacroValues() {
    final PathMacros pathMacros = PathMacros.getInstance();
    List<CommandPart> macroValues = ListSequence.fromListAndArray(new ArrayList<CommandPart>(), new PropertyCommandPart("mps_home", jetbrains.mps.util.PathManager.getHomePath()));
    return ListSequence.fromList(macroValues).union(Sequence.fromIterable(Sequence.fromClosure(new ISequenceClosure<String>() {
      public Iterable<String> iterable() {
        return pathMacros.getUserMacroNames();
      }
    })).select(new ISelector<String, CommandPart>() {
      public CommandPart select(String it) {
        return (CommandPart) new PropertyCommandPart(it, pathMacros.getValue(it));
      }
    }));
  }

  private static String getGeneratedFileName(final SNode project) {
    final Wrappers._T<IFile> file = new Wrappers._T<IFile>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        file.value = FileGenerationUtil.getDefaultOutputDir(SNodeOperations.getModel(project), FileSystem.getInstance().getFileByPath(SNodeOperations.getModel(project).getModelDescriptor().getModule().getGeneratorOutputPath()));
        file.value = file.value.getDescendant(Project_Behavior.call_getFileName_1213877351819(project));
      }
    });
    return file.value.getPath();
  }

  private static String getTargetName(final SNode target) {
    final Wrappers._T<String> name = new Wrappers._T<String>();
    ModelAccess.instance().runReadAction(new _Adapters._return_P0_E0_to_Runnable_adapter(new _FunctionTypes._return_P0_E0<String>() {
      public String invoke() {
        return name.value = check_11bn_a0a0a1a4(target);
      }
    }));
    return name.value;
  }

  private static String check_11bn_a0a0a1a4(SNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return SPropertyOperations.getString(checkedDotOperand, "name");
    }
    return null;
  }
}
