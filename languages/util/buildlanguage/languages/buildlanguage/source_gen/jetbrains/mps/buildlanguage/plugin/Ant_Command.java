package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import com.intellij.execution.process.ProcessHandler;
import jetbrains.mps.smodel.SNode;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.execution.lib.Java_Command;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.Sequence;
import com.intellij.openapi.application.PathManager;
import java.io.File;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
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

public class Ant_Command {
  private String myAntLocation = Ant_Command.getDefaultAntHome();

  public Ant_Command() {
  }

  public Ant_Command setAntLocation(String antLocation) {
    if (antLocation != null) {
      myAntLocation = antLocation;
    }
    return this;
  }

  public ProcessHandler createProcess(SNode project) throws ExecutionException {
    return new Java_Command().setClassPath(Ant_Command.getAntClassPath(myAntLocation)).setProgramParameter("-Djava.home=" + Java_Command.getJdkHome() + " -Dant.home=" + myAntLocation + " " + IterableUtils.join(Sequence.fromIterable(Ant_Command.getMacroValues()), " ") + " " + "-f " + Ant_Command.getGeneratedFileName(project)).createProcess("org.apache.tools.ant.launch.Launcher");
  }

  private static String getDefaultAntHome() {
    return PathManager.getHomePath() + File.separator + "lib" + File.separator + "ant";
  }

  private static List<String> getAntClassPath(String antHome) throws ExecutionException {
    String antlib = antHome + File.separator + "lib";
    File antLibFile = new File(antlib);
    if (!(antLibFile.exists())) {
      throw new ExecutionException("Ant directory " + antlib + " does not exist.");
    }
    List<String> classPath = ListSequence.fromList(new ArrayList<String>());
    for (File jarFile : antLibFile.listFiles()) {
      String jarFilePath = jarFile.getAbsolutePath();
      if (jarFilePath.endsWith(".jar")) {
        ListSequence.fromList(classPath).addElement(jarFilePath);
      }
    }
    return classPath;
  }

  private static Iterable<String> getMacroValues() {
    final PathMacros pathMacros = PathMacros.getInstance();
    List<String> macroValues = ListSequence.fromListAndArray(new ArrayList<String>(), "-D" + "mps_home" + "=" + jetbrains.mps.util.PathManager.getHomePath());
    return ListSequence.fromList(macroValues).union(Sequence.fromIterable(Sequence.fromClosure(new ISequenceClosure<String>() {
      public Iterable<String> iterable() {
        return pathMacros.getUserMacroNames();
      }
    })).<String>select(new ISelector<String, String>() {
      public String select(String it) {
        return "-D" + it + "=" + pathMacros.getValue(it);
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
}
