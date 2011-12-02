package jetbrains.mps.build.ant.make;

/*Generated by MPS */

import jetbrains.mps.build.ant.Environment;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import jetbrains.mps.ide.IdeMain;
import javax.swing.SwingUtilities;
import jetbrains.mps.project.StandaloneMPSProject;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import java.io.File;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.project.structure.project.ProjectDescriptor;
import java.lang.reflect.Method;
import com.intellij.idea.IdeaTestApplication;

public class MakeEnvironment extends Environment {
  public MakeEnvironment() {
  }

  @Override
  public void setup() {
    BasicConfigurator.configure(new ConsoleAppender());
    IdeMain.setTestMode(IdeMain.TestMode.CORE_TEST);
    try {
      configureMPS();
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
    setMacro();
    loadLibraries();
  }

  public void dispose() {
    for (int i = 0; i < 3; i++) {
      try {
        SwingUtilities.invokeAndWait(new Runnable() {
          public void run() {
          }
        });
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public StandaloneMPSProject createDummyProject() {
    Project ideaProject = ProjectManager.getInstance().getDefaultProject();
    File projectFile = FileUtil.createTmpFile();
    final StandaloneMPSProject project = new StandaloneMPSProject(ideaProject);
    project.init(new ProjectDescriptor());
    projectFile.deleteOnExit();
    return project;
  }

  public jetbrains.mps.project.Project loadProject(File projectFile) {
    jetbrains.mps.project.Project project;
    try {
      Class<?> cls = Class.forName("jetbrains.mps.TestMain");
      Method meth = cls.getMethod("loadProject", File.class);
      project = (jetbrains.mps.project.Project) meth.invoke(null, projectFile);
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
    return project;
  }

  protected void configureMPS() {
    super.configureMPS(true);
    //   Value of this property is comma-separated list of plugin IDs intended to load by platform  
    System.setProperty("idea.load.plugins.id", "jetbrains.mps.vcs,jetbrains.mps.ide.editor,jetbrains.mps.ide.make");
    try {
      IdeaTestApplication.getInstance(null);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
