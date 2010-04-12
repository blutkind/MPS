package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.BaseRunner;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.baseLanguage.util.plugin.run.ConfigRunParameters;
import java.io.File;
import com.intellij.execution.process.ProcessNotCreatedException;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.apache.commons.lang.StringUtils;
import java.io.IOException;
import com.intellij.openapi.application.PathManager;
import jetbrains.mps.internal.collections.runtime.Sequence;
import com.intellij.openapi.application.PathMacros;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;

public class AntScriptRunner extends BaseRunner {
  private static Logger LOG = Logger.getLogger(AntScriptRunner.class);

  private ProcessBuilder myBuilder;

  public AntScriptRunner(ConfigRunParameters parameters) {
    super(parameters);
  }

  public Process run(File file) throws ProcessNotCreatedException {
    List<String> parameters = ListSequence.fromList(new ArrayList<String>());

    this.addBasicParameters(parameters, file);
    AntScriptRunner.addMacroValues(parameters);
    this.addProgramParameters(parameters);

    // create builder 
    this.myBuilder = new ProcessBuilder(ListSequence.fromListWithValues(new ArrayList<String>(), parameters));

    // set woring dir 
    File workingDirFile;
    if (this.myRunParameters.getWorkingDirectory() != null && StringUtils.isNotEmpty(this.myRunParameters.getWorkingDirectory())) {
      workingDirFile = new File(this.myRunParameters.getWorkingDirectory());
    } else {
      workingDirFile = file.getParentFile();
    }
    this.myBuilder.directory(workingDirFile);

    try {
      return this.myBuilder.start();
    } catch (IOException e) {
      LOG.error("Can't run script " + file + ": " + e.getMessage(), e);
      throw new ProcessNotCreatedException(e.getMessage(), e, this.getCommandLine(workingDirFile.getAbsolutePath()));
    }
  }

  private void addBasicParameters(List<String> parameters, File file) {
    String javaHome = this.getJavaHome();
    ListSequence.fromList(parameters).addElement(AntScriptRunner.getJavaCommand(javaHome));
    ListSequence.fromList(parameters).addElement("-Djava.home=" + javaHome);
    String antHome = PathManager.getHomePath() + File.separator + "lib" + File.separator + "ant-1.7.0";
    ListSequence.fromList(parameters).addElement("-Dant.home=" + antHome);
    ListSequence.fromList(parameters).addElement("-cp");
    String antLib = antHome + File.separator + "lib" + File.separator;
    String pathSeparator = System.getProperty("path.separator");
    String classpath = antLib + "ant-launcher.jar" + pathSeparator + antLib + "ant.jar" + pathSeparator + antLib + "ant-nodeps.jar";
    classpath += pathSeparator + javaHome + File.separator + "lib" + File.separator + "tools.jar";
    ListSequence.fromList(parameters).addElement(classpath);
    ListSequence.fromList(parameters).addElement("org.apache.tools.ant.launch.Launcher");
    ListSequence.fromList(parameters).addElement("-f");
    ListSequence.fromList(parameters).addElement(file.getAbsolutePath());
  }

  private void addProgramParameters(List<String> parameters) {
    if (this.myRunParameters.getProgramParameters() != null && StringUtils.isNotEmpty(this.myRunParameters.getProgramParameters())) {
      List<String> commandLineList = Sequence.fromIterable(Sequence.fromArray(this.myRunParameters.getProgramParameters().split("\\s+"))).toListSequence();
      ListSequence.fromList(parameters).addSequence(ListSequence.fromList(commandLineList));
    }
  }

  public String getCommandString() {
    return this.getCommandString(this.myBuilder);
  }

  public static void addMacroValues(List<String> parameters) {
    PathMacros pathMacros = PathMacros.getInstance();
    ListSequence.fromList(parameters).addElement("-D" + "mps_home" + "=" + jetbrains.mps.util.PathManager.getHomePath());
    Set<String> macroNames = pathMacros.getUserMacroNames();
    for (String macro : SetSequence.fromSet(macroNames)) {
      ListSequence.fromList(parameters).addElement("-D" + macro + "=" + pathMacros.getValue(macro));
    }
  }
}
