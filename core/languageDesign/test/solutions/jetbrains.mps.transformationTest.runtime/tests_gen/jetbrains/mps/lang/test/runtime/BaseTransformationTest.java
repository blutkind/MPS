package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.kernel.model.TemporaryModelOwner;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.idea.LoggerFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.TestMain;
import jetbrains.mps.util.MacrosFactory;
import jetbrains.mps.vfs.IFile;
import javax.swing.SwingUtilities;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.ProjectModels;
import jetbrains.mps.generator.impl.CloneUtil;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.lang.reflect.InvocationTargetException;

public class BaseTransformationTest extends TestCase {
  private static ProjectContainer myContainer = new ProjectContainer();

  private SModelDescriptor myModel;
  private SModelDescriptor myTransidentModel;
  private MPSProject myProject;
  private TemporaryModelOwner myModelOwner;

  public BaseTransformationTest() {
    Logger.setFactory(LoggerFactory.getInstance());
  }

  public BaseTransformationTest(Project project, SModelDescriptor modelDescriptor) {
    this();
    setProject(project);
    setModelDescriptor(modelDescriptor);
  }

  public void initTest(String projectName, final String model) throws Exception {
    IdeMain.setTestMode(IdeMain.TestMode.CORE_TEST);
    TestMain.configureMPS();
    this.myProject = myContainer.getProject(MacrosFactory.mpsHomeMacros().expandPath(projectName, ((IFile) null)));
    SwingUtilities.invokeAndWait(new Runnable() {
      public void run() {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {
          public void run() {
            SModelDescriptor modelDescriptor = SModelRepository.getInstance().getModelDescriptor(SModelReference.fromString(model));
            BaseTransformationTest.this.setModelDescriptor(modelDescriptor);
          }
        });
      }
    });
  }

  public final void setProject(Project project) {
    this.myProject = project.getComponent(MPSProject.class);
  }

  public final void setModelDescriptor(SModelDescriptor modelDescriptor) {
    myModel = modelDescriptor;
    myTransidentModel = ProjectModels.createDescriptorFor(myModelOwner = new TemporaryModelOwner());
    myTransidentModel.getSModel().runLoadingAction(new Runnable() {
      public void run() {
        CloneUtil.cloneModel(myModel.getSModel(), myTransidentModel.getSModel(), false);
      }
    });
    SModelOperations.validateLanguagesAndImports(myTransidentModel.getSModel(), false, false);
  }

  public void runTest(final String className, final String methodName, final boolean runInCommand) throws Throwable {
    final Wrappers._T<Class> clazz = new Wrappers._T<Class>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        clazz.value = BaseTransformationTest.this.myModel.getModule().getClass(className);
        String classloader = clazz.value.getClassLoader().toString();
        String module = BaseTransformationTest.this.myModel.getModule().getModuleFqName();
        assert classloader.contains(module) : "class: " + clazz.value + "; classloader: " + classloader + "; module: " + module;
      }
    });
    final Object obj = clazz.value.newInstance();
    clazz.value.getField("myModel").set(obj, this.myTransidentModel);
    clazz.value.getField("myProject").set(obj, this.myProject);
    final Throwable[] exception = new Throwable[1];
    if (runInCommand) {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              exception[0] = BaseTransformationTest.this.tryToRunTest(clazz.value, methodName, obj);
            }
          });
        }
      });
    } else {
      exception[0] = BaseTransformationTest.this.tryToRunTest(clazz.value, methodName, obj);
    }
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        SModelRepository.getInstance().removeModelDescriptor(myTransidentModel);
        myModelOwner.unregisterModelOwner();
      }
    });
    if (exception[0] != null) {
      throw exception[0];
    }
  }

  private Throwable tryToRunTest(Class clazz, String methodName, Object obj) {
    Throwable exception = null;
    try {
      clazz.getMethod(methodName).invoke(obj);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      exception = e.getCause();
    }
    return exception;
  }

  public static ProjectContainer getProjectContainer() {
    return myContainer;
  }
}
