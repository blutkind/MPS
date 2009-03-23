package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.idea.LoggerFactory;
import jetbrains.mps.util.Macros;
import jetbrains.mps.vfs.IFile;
import javax.swing.SwingUtilities;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.generator.TransientModelsModule;
import jetbrains.mps.generator.template.CloneUtil;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.lang.reflect.InvocationTargetException;

public class BaseTransformationTest extends TestCase {
  private static ProjectContainer myContainer = new ProjectContainer();

  private SModelDescriptor myModel;
  private SModelDescriptor myTransidentModel;
  private MPSProject myProject;

  public BaseTransformationTest() {
    Logger.setFactory(LoggerFactory.getInstance());
  }

  public void initTest(String projectName, final String model) throws Exception {
    this.myProject = myContainer.getProject(Macros.mpsHomeMacros().expandPath(projectName, ((IFile)null)));
    SwingUtilities.invokeAndWait(new Runnable() {

      public void run() {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {

          public void run() {
            IdeMain.setTestMode(IdeMain.TestMode.CORE_TEST);
            SModelDescriptor modelDescriptor = SModelRepository.getInstance().getModelDescriptor(SModelReference.fromString(model));
            BaseTransformationTest.this.setModelDescriptor(modelDescriptor);
          }

        });
      }

    });
  }

  public void setProject(MPSProject project) {
    this.myProject = project;
  }

  public void setModelDescriptor(SModelDescriptor modelDescriptor) {
    this.myModel = modelDescriptor;
    ModuleContext context = ModuleContext.create(this.myModel, this.myProject, false);
    TransientModelsModule module = context.getComponent(TransientModelsModule.class);
    this.myTransidentModel = module.createTransientModel("testTransidentModel", "testTransidentModel");
    CloneUtil.cloneModel(this.myModel.getSModel(), this.myTransidentModel.getSModel(), false);
    this.myTransidentModel.getSModel().validateLanguagesAndImports();
  }

  public void runTest(final String className, final String methodName, final boolean runInCommand) throws Throwable {
    final Wrappers._T<Class> clazz = new Wrappers._T<Class>();
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        clazz.value = BaseTransformationTest.this.myModel.getModule().getClass(className);
        assert clazz.value.getClassLoader().toString().contains(BaseTransformationTest.this.myModel.getModule().getModuleFqName());
      }

    });
    final Object obj = clazz.value.newInstance();
    clazz.value.getField("myModel").set(obj, this.myTransidentModel);
    clazz.value.getField("myProject").set(obj, this.myProject);
    final Wrappers._T<Throwable> exception = new Wrappers._T<Throwable>(null);
    SwingUtilities.invokeAndWait(new Runnable() {

      public void run() {
        if (runInCommand) {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {

            public void run() {
              exception.value = BaseTransformationTest.this.tryToRunTest(clazz.value, methodName, obj);
            }

          });
        } else
        {
          exception.value = BaseTransformationTest.this.tryToRunTest(clazz.value, methodName, obj);
        }
      }

    });
    ModelAccess.instance().runWriteAction(new Runnable() {

      public void run() {
        SModelRepository.getInstance().removeModelDescriptor(BaseTransformationTest.this.myTransidentModel);
      }

    });
    if (exception.value != null) {
      throw exception.value;
    }
  }

  private Throwable tryToRunTest(Class clazz, String methodName, Object obj) {
    Throwable exception = null;
    try {
      clazz.getDeclaredMethod(methodName).invoke(obj);
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
