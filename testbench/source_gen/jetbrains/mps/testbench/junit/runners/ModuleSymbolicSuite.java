package jetbrains.mps.testbench.junit.runners;

/*Generated by MPS */

import org.junit.runners.ParentRunner;
import org.junit.runner.Runner;
import java.util.List;
import java.util.ArrayList;
import org.junit.runners.model.RunnerBuilder;
import org.junit.runners.model.InitializationError;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import org.junit.runner.notification.Failure;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

public class ModuleSymbolicSuite extends ParentRunner<Runner> {
  private static final String NO_TESTS = "EMPTY TEST CASE";

  private List<Runner> myRunners = new ArrayList<Runner>();
  private String myModuleRef;
  private RunnerBuilder myBuilder;
  private boolean initialized = false;

  public ModuleSymbolicSuite(Class<?> klass, RunnerBuilder builder) throws InitializationError {
    this(builder, klass);
    String[] tests = getAnnotatedTests(klass);
    String[] classes = getAnnotatedClassNames(klass);
    for (int i = 0; i < tests.length && i < classes.length; i++) {
      myRunners.add(new ModuleSymbolicSuite.DelegatingRunner(classes[i], (tests[i].length() > 0 ?
        tests[i].split(",") :
        null
      )));
    }
    this.myModuleRef = getAnnotatedModule(klass);
  }

  protected ModuleSymbolicSuite(RunnerBuilder builder, Class<?> klass) throws InitializationError {
    this(klass);
    this.myBuilder = builder;
  }

  protected ModuleSymbolicSuite(Class<?> klass) throws InitializationError {
    super(klass);
  }

  @Override
  protected List<Runner> getChildren() {
    return myRunners;
  }

  @Override
  protected Description describeChild(Runner child) {
    return child.getDescription();
  }

  @Override
  protected void runChild(Runner child, RunNotifier notifier) {
    if (!(initialized)) {
      initialize();
    }
    child.run(notifier);
  }

  private void initialize() {
    IModule mod = MPSModuleRepository.getInstance().getModule(jetbrains.mps.project.structure.modules.ModuleReference.fromString(myModuleRef));
    for (Runner child : myRunners) {
      ((ModuleSymbolicSuite.DelegatingRunner) child).init(mod, myBuilder);
    }
    this.initialized = true;
  }

  private static String getAnnotatedModule(Class<?> klass) throws InitializationError {
    ModuleSymbolicSuite.ModuleReference mrefAnn = klass.getAnnotation(ModuleSymbolicSuite.ModuleReference.class);
    if (mrefAnn == null) {
      throw new InitializationError(String.format("class '%s' must have a ModuleReference annotation", klass.getName()));
    }
    return mrefAnn.value();
  }

  private static String[] getAnnotatedClassNames(Class<?> klass) throws InitializationError {
    ModuleSymbolicSuite.ModuleClassSymbols symAnn = klass.getAnnotation(ModuleSymbolicSuite.ModuleClassSymbols.class);
    if (symAnn == null) {
      throw new InitializationError(String.format("class '%s' must have a ModuleClassSymbols annotation", klass.getName()));
    }
    return symAnn.classes();
  }

  private static String[] getAnnotatedTests(Class<?> klass) throws InitializationError {
    ModuleSymbolicSuite.ModuleClassSymbols symAnn = klass.getAnnotation(ModuleSymbolicSuite.ModuleClassSymbols.class);
    if (symAnn == null) {
      throw new InitializationError(String.format("class '%s' must have a ModuleClassSymbols annotation", klass.getName()));
    }
    return symAnn.tests();
  }

  public static class DelegatingRunner extends Runner {
    private Runner myDelegate;
    private String myClassName;
    private String[] myTests;

    public DelegatingRunner(String klassName, String[] tests) {
      this.myClassName = klassName;
      this.myTests = tests;
    }

    public void run(RunNotifier notifier) {
      if (myTests == null) {
        runFailure(createTestDescription(ModuleSymbolicSuite.NO_TESTS), new IllegalStateException("no tests found in " + myClassName), notifier);
      } else if (myDelegate == null) {
        for (String test : myTests) {
          runFailure(createTestDescription(test), new ClassNotFoundException(myClassName), notifier);
        }
      } else {
        myDelegate.run(notifier);
      }
    }

    public Description getDescription() {
      Description desc = Description.createSuiteDescription(myClassName);
      if (myTests == null) {
        desc.addChild(createTestDescription(ModuleSymbolicSuite.NO_TESTS));
      } else {
        for (String test : myTests) {
          desc.addChild(createTestDescription(test));
        }
      }
      return desc;
    }

    private void init(IModule mod, RunnerBuilder builder) {
      Class klass = mod.getClass(myClassName);
      if (klass != null) {
        this.myDelegate = builder.safeRunnerForClass(klass);
      }
    }

    private void runFailure(Description failDesc, Throwable cause, RunNotifier notifier) {
      notifier.fireTestStarted(failDesc);
      notifier.fireTestFailure(new Failure(failDesc, cause));
      notifier.fireTestFinished(failDesc);
    }

    private Description createTestDescription(String text) {
      // this is the only way to construct Description from string 
      return Description.createSuiteDescription(String.format("%s(%s)", text, myClassName));
    }
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(value = {ElementType.TYPE})
public static   @interface ModuleClassSymbols {
    String[] classes();
    String[] tests();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public static @interface ModuleReference {
  String value();
}
}
