package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.BaseRunner;
import java.io.File;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.apache.commons.lang.StringUtils;
import java.util.Arrays;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.plugin.BaseOutputReader;
import jetbrains.mps.smodel.ModelAccess;
import java.io.IOException;
import com.intellij.openapi.application.PathMacros;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import com.intellij.openapi.application.PathManager;

public class BuildScriptRunner extends BaseRunner {

  private BuildScriptRunnerComponent myComponent;

  public BuildScriptRunner(BuildScriptRunnerComponent component) {
    this.myComponent = component;
  }

  public void run(File file, String commandLine) {
    List<String> parameters = ListSequence.<String>fromArray();
    this.addBasicParameters(parameters, file);
    this.addMacroValues(parameters);
    if (commandLine != null && StringUtils.isNotEmpty(commandLine)) {
      List<String> commandLineList = Arrays.asList(commandLine.split("\\s+"));
      ListSequence.fromList(parameters).addSequence(ListSequence.fromList(commandLineList));
    }
    ProcessBuilder builder = new ProcessBuilder(new ArrayList(parameters));
    builder.directory(file.getParentFile());
    try {
      Process process = builder.start();
      BaseOutputReader input = new BaseOutputReader(process.getInputStream()) {

        protected void addMessage(final String message) {
          ModelAccess.instance().runReadInEDT(new Runnable() {

            public void run() {
              BuildScriptRunner.this.myComponent.addMessage(message);
            }

          });
        }

      };
      input.start();
      BaseOutputReader error = new BaseOutputReader(process.getErrorStream()) {

        protected void addMessage(final String message) {
          ModelAccess.instance().runReadInEDT(new Runnable() {

            public void run() {
              BuildScriptRunner.this.myComponent.addError(message);
            }

          });
        }

      };
      error.start();
    } catch (IOException exception) {
    }
  }

  private void addMacroValues(List<String> parameters) {
    PathMacros pathMacros = PathMacros.getInstance();
    Set<String> macroNames = pathMacros.getAllMacroNames();
    for(String macro : SetSequence.fromSet(macroNames)) {
      ListSequence.fromList(parameters).addElement("-D" + macro + "=" + pathMacros.getValue(macro));
    }
  }

  private void addBasicParameters(List<String> parameters, File file) {
    ListSequence.fromList(parameters).addElement(this.getJava());
    String antHome = PathManager.getHomePath() + File.separator + "lib" + File.separator + "ant-1.7.0";
    ListSequence.fromList(parameters).addElement("-Dant.home=" + antHome);
    ListSequence.fromList(parameters).addElement("-cp");
    String antLib = antHome + File.separator + "lib" + File.separator;
    ListSequence.fromList(parameters).addElement(antLib + "ant-launcher.jar" + System.getProperty("path.separator") + antLib + "ant.jar");
    ListSequence.fromList(parameters).addElement("org.apache.tools.ant.launch.Launcher");
    ListSequence.fromList(parameters).addElement("-f");
    ListSequence.fromList(parameters).addElement(file.getAbsolutePath());
  }

  public String getJava() {
    String javaHome = System.getProperty("java.home") + File.separator + "bin" + File.separator;
    String osName = System.getProperty("os.name");
    if (osName.startsWith("Mac OS")) {
      return javaHome + "java";
    } else
    if (osName.startsWith("Windows")) {
      return javaHome + "java.exe";
    } else
    {
      return javaHome + "java";
    }
  }

}
