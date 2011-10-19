package jetbrains.mps.workbench.make;

/*Generated by MPS */

import com.intellij.openapi.progress.Task;
import java.util.concurrent.Future;
import jetbrains.mps.make.script.IResult;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import jetbrains.mps.make.service.CoreMakeTask;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IScriptController;
import jetbrains.mps.messages.IMessageHandler;
import com.intellij.openapi.progress.PerformInBackgroundOption;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.progress.ProgressMonitorAdapter;
import jetbrains.mps.progress.ProgressMonitor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jetbrains.mps.logging.ILoggingHandler;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.logging.LogEntry;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.messages.Message;

public class MakeTask extends Task.Backgroundable implements Future<IResult> {
  private CountDownLatch myLatch = new CountDownLatch(1);
  private AtomicReference<MakeTask.TaskState> myState = new AtomicReference<MakeTask.TaskState>(MakeTask.TaskState.NOT_STARTED);
  private CoreMakeTask coreTask;
  private boolean isCanceled = false;

  public MakeTask(@Nullable Project project, @NotNull String title, Iterable<IScript> scripts, String scrName, Iterable<? extends Iterable<IResource>> clInput, IScriptController ctl, IMessageHandler mh, PerformInBackgroundOption bgoption) {
    super(project, title, true, bgoption);
    coreTask = new MakeTask.WorkbenchMakeTask(title, scripts, scrName, clInput, ctl, mh);
  }

  public void run(@NotNull final ProgressIndicator pi) {
    if (myState.compareAndSet(MakeTask.TaskState.NOT_STARTED, MakeTask.TaskState.RUNNING)) {
      if (ThreadUtils.isEventDispatchThread()) {
        coreTask.run(new ProgressMonitorAdapter(pi));
      } else {
        this.spawnMakeThreadThenDoRunRelayingLog(new ProgressMonitorAdapter(pi));
      }
    }
  }

  private void spawnMakeThreadThenDoRunRelayingLog(final ProgressMonitor monitor) {
    ThreadGroup tg = new ThreadGroup("MPS Make Thread Group");
    Thread makeThread = new Thread(tg, new Runnable() {
      public void run() {
        CoreMakeTask.RelayingLoggingHandler rlh = new CoreMakeTask.RelayingLoggingHandler(coreTask.getMessageHandler());
        try {
          rlh.startRelaying();
          coreTask.run(monitor);
        } finally {
          rlh.stopRelaying();
        }
      }
    }, "MPS Make Thread");
    makeThread.start();
    do {
      try {
        makeThread.join();
      } catch (InterruptedException ie) {
      }
    } while (makeThread.isAlive());
  }

  @Override
  public void onCancel() {
    isCanceled = true;
  }

  public boolean cancel(boolean b) {
    return false;
  }

  public boolean isCancelled() {
    return myState.get() == MakeTask.TaskState.CANCELLED;
  }

  public boolean isDone() {
    return myState.get() != MakeTask.TaskState.NOT_STARTED && myState.get() != MakeTask.TaskState.RUNNING;
  }

  public IResult get() throws InterruptedException, ExecutionException {
    myLatch.await();
    if (myState.get() == MakeTask.TaskState.CANCELLED) {
      throw new CancellationException();
    }
    return coreTask.getResult();
  }

  public IResult get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
    myLatch.await(timeout, unit);
    if (myState.get() == MakeTask.TaskState.CANCELLED) {
      throw new CancellationException();
    }
    return coreTask.getResult();
  }

  protected void displayInfo(String info) {
  }

  protected void aboutToStart() {
  }

  protected void done() {
  }

  public class WorkbenchMakeTask extends CoreMakeTask {
    public WorkbenchMakeTask(@NotNull String title, Iterable<IScript> scripts, String scrName, Iterable<? extends Iterable<IResource>> clInput, IScriptController ctl, IMessageHandler mh) {
      super(title, scripts, scrName, clInput, ctl, mh);
    }

    @Override
    protected void reconcile() {
      MakeTask.this.myState.set(MakeTask.TaskState.DONE);
      try {
        if (isCanceled || coreTask.getResult() == null) {
          MakeTask.this.myState.set(MakeTask.TaskState.CANCELLED);
        }
        super.reconcile();
      } finally {
        myLatch.countDown();
        done();
      }
    }

    @Override
    protected void doRun(ProgressMonitor monitor) {
      super.doRun(monitor);
      MakeTask.this.myState.set(MakeTask.TaskState.INDETERMINATE);
    }

    @Override
    protected void displayInfo(String info) {
      MakeTask.this.displayInfo(info);
    }

    @Override
    protected void aboutToStart() {
      MakeTask.this.aboutToStart();
    }
  }

  private static   enum TaskState {
    NOT_STARTED(),
    RUNNING(),
    DONE(),
    CANCELLED(),
    INDETERMINATE();

    TaskState() {
    }

    public static class RelayingLoggingHandler implements ILoggingHandler {
      private static Tuples._2<ThreadGroup, IMessageHandler> GROUP_HANDLER;

      private ThreadLocal<IMessageHandler> messageHandler = new ThreadLocal<IMessageHandler>() {
        @Override
        protected IMessageHandler initialValue() {
          return (MakeTask.TaskState.RelayingLoggingHandler.GROUP_HANDLER._0() == Thread.currentThread().getThreadGroup() ?
            MakeTask.TaskState.RelayingLoggingHandler.GROUP_HANDLER._1() :
            null
          );
        }
      };

      public RelayingLoggingHandler(IMessageHandler mh) {
        this.messageHandler.set(mh);
        GROUP_HANDLER = MultiTuple.<ThreadGroup,IMessageHandler>from(Thread.currentThread().getThreadGroup(), mh);
      }

      public void startRelaying() {
        Logger.addLoggingHandler(this);
      }

      public void stopRelaying() {
        Logger.removeLoggingHandler(this);
      }

      public void fatal(LogEntry entry) {
        handle(MessageKind.ERROR, entry);
      }

      public void error(LogEntry entry) {
        handle(MessageKind.ERROR, entry);
      }

      public void debug(LogEntry entry) {
        handle(MessageKind.INFORMATION, entry);
      }

      public void warning(LogEntry entry) {
        handle(MessageKind.WARNING, entry);
      }

      public void info(LogEntry entry) {
        handle(MessageKind.INFORMATION, entry);
      }

      private void handle(MessageKind kind, LogEntry e) {
        IMessageHandler mh = messageHandler.get();
        if (mh != null) {
          Message message = new Message(kind, e.getSourceClass(), e.getMessage());
          message.setHintObject(e.getHintObject());
          mh.handle(message);
        }
      }
    }
  }
}
