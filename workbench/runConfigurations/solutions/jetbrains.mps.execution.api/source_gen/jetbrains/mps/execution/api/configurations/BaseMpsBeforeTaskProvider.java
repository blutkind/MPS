package jetbrains.mps.execution.api.configurations;

/*Generated by MPS */

import com.intellij.execution.BeforeRunTaskProvider;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import java.lang.reflect.Method;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.lang.reflect.InvocationTargetException;
import com.intellij.execution.BeforeRunTask;
import com.intellij.openapi.project.Project;

public abstract class BaseMpsBeforeTaskProvider<T extends BaseMpsBeforeTaskProvider.BaseMpsBeforeRunTask> extends BeforeRunTaskProvider<T> {
  protected static Log log = LogFactory.getLog(BaseMpsBeforeTaskProvider.class);

  private final String myName;

  public BaseMpsBeforeTaskProvider(String name) {
    myName = name;
  }

  protected abstract T createTaskImpl();

  @Override
  public String getDescription(RunConfiguration runConfiguration, T task) {
    return myName;
  }

  @Override
  public T createTask(RunConfiguration runConfiguration) {
    if (hasExecuteMethod(runConfiguration)) {
      return createTaskImpl();
    }
    return null;
  }

  private boolean hasExecuteMethod(RunConfiguration runConfiguration) {
    try {
      if (getMethod(runConfiguration) != null) {
        return true;
      }
    } catch (NoSuchMethodException e) {
    }
    return false;
  }

  @Override
  public boolean executeTask(DataContext context, RunConfiguration configuration, T task) {
    if (!(configure(configuration, task))) {
      return false;
    }
    return task.execute(PlatformDataKeys.PROJECT.getData(context));
  }

  private boolean configure(RunConfiguration runConfiguration, T task) {
    try {
      Method method = getMethod(runConfiguration);
      if (method == null) {
        return false;
      }
      Object[] parameters = (Object[]) method.invoke(runConfiguration);
      Method configureMethod = Sequence.fromIterable(Sequence.fromArray(task.getClass().getMethods())).findFirst(new IWhereFilter<Method>() {
        public boolean accept(Method it) {
          return eq_xh6sei_a0a0a0a0a0a3a0a5(it.getName(), getConfigureMethodName());
        }
      });
      return (Boolean) configureMethod.invoke(task, parameters);
    } catch (NoSuchMethodException e) {
    } catch (InvocationTargetException e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    } catch (IllegalAccessException e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    } catch (ClassCastException e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    }
    return false;
  }

  private Method getMethod(RunConfiguration configuration) throws NoSuchMethodException {
    return configuration.getClass().getMethod(getCreateMethodName(myName));
  }

  @Override
  public boolean hasConfigurationButton() {
    return false;
  }

  @Override
  public boolean configureTask(RunConfiguration runConfiguration, T task) {
    return hasExecuteMethod(runConfiguration);
  }

  public static String getCreateMethodName(String name) {
    return "create" + name + "Task";
  }

  public static String getConfigureMethodName() {
    return "configure";
  }

  private static boolean eq_xh6sei_a0a0a0a0a0a3a0a5(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  public static abstract class BaseMpsBeforeRunTask extends BeforeRunTask {
    public BaseMpsBeforeRunTask() {
      setEnabled(true);
    }

    public abstract boolean execute(Project project);
  }
}
