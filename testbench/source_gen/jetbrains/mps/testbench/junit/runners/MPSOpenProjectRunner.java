package jetbrains.mps.testbench.junit.runners;

/*Generated by MPS */

import org.junit.runner.Runner;
import org.junit.runner.Description;
import org.junit.runners.model.InitializationError;
import org.junit.runner.notification.RunNotifier;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import jetbrains.mps.testbench.Testbench;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.TestMain;
import java.io.File;
import jetbrains.mps.smodel.ModelAccess;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import org.apache.commons.lang.StringUtils;
import com.intellij.util.PathUtil;
import com.intellij.openapi.application.PathMacros;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

public class MPSOpenProjectRunner extends Runner {
  private static String PROPERTY_PROJECT_NAME = "mps.junit.project";
  private static String PROPERTY_PREFIX_PATH_MACRO = "mps.junit.pathmacro.";
  private static jetbrains.mps.project.MPSProject ourMPSProject;

  private Description myDescription;

  public MPSOpenProjectRunner(Class<?> testClass) throws InitializationError {
    doOpenProject(testClass);
  }

  public void run(RunNotifier notifier) {
    notifier.fireTestStarted(getDescription());
    notifier.fireTestFinished(getDescription());
  }

  public Description getDescription() {
    if (myDescription == null) {
      myDescription = Description.createSuiteDescription("\"" + ourMPSProject.getProject().getName() + "\" project opened");
    }
    return myDescription;
  }

  private String doOpenProject(Class<?> testClass) throws InitializationError {
    String projectPath = getProjectPath(testClass);
    BasicConfigurator.configure();
    Logger.getRootLogger().setLevel(Level.INFO);
    Testbench.initLogging();
    IdeMain.setTestMode(IdeMain.TestMode.CORE_TEST);
    TestMain.configureMPS();
    initPathMacros();
    Testbench.initLibs();
    if (ourMPSProject != null) {
      throw new InitializationError("One MPS project was already openned in this java process: " + ourMPSProject.getProject().getName() + " (on trying to open: " + projectPath + ")");
    }
    ourMPSProject = TestMain.loadProject(new File(projectPath));

    // <node> 
    // <node> 
    // TODO: 
    // 
    // 2. Libraries? 
    // 3. Cache location ? 
    // 4. creste separate suite generating (making) all modules in this project by using ProjectTestHelper? 
    ModelAccess.instance().flushEventQueue();
    return projectPath;
  }

  private void initPathMacros() {
    for (Map.Entry<Object, Object> property : SetSequence.fromSet(System.getProperties().entrySet())) {
      if (!(property.getKey() instanceof String) || !(property.getValue() instanceof String)) {
        continue;
      }
      String propertyKey = (String) property.getKey();
      String propertyValue = (String) property.getValue();
      if (StringUtils.isEmpty(propertyKey) || !(propertyKey.startsWith(PROPERTY_PREFIX_PATH_MACRO))) {
        continue;
      }
      String canonicalPath = PathUtil.getCanonicalPath(propertyValue);
      File file = new File(canonicalPath);
      if (file.exists() && file.isDirectory()) {
        PathMacros.getInstance().setMacro(propertyKey.substring(PROPERTY_PREFIX_PATH_MACRO.length()), canonicalPath);
      }
    }
  }

  private String getProjectPath(Class<?> testClass) throws InitializationError {
    MPSOpenProjectRunner.MPSProject mpsProject = testClass.getAnnotation(MPSOpenProjectRunner.MPSProject.class);
    if (mpsProject != null) {
      return mpsProject.value();
    }
    String mpsProjectSystemProperty = System.getProperty(PROPERTY_PROJECT_NAME);
    if (mpsProjectSystemProperty == null) {
      throw new InitializationError("Neither @MPSProject annotation nor System property \"" + PROPERTY_PROJECT_NAME + "\" was not specified.");
    }
    return mpsProjectSystemProperty;
  }

  public static jetbrains.mps.project.MPSProject getCurrentMPSProject() {
    return ourMPSProject;
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(value = {ElementType.TYPE})
public static   @interface MPSProject {
    /**
     * 
     * 
     * @return path to MPS project
     */
    String value();
}
}
