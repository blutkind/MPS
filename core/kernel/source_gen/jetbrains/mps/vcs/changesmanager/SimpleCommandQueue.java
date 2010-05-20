package jetbrains.mps.vcs.changesmanager;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Queue;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;

public class SimpleCommandQueue {
  protected static Log log = LogFactory.getLog(SimpleCommandQueue.class);

  private Thread myThread;
  private final Queue<Runnable> myQueue = new LinkedList<Runnable>();

  public SimpleCommandQueue(@NotNull String threadName) {
    myThread = new SimpleCommandQueue.MyExecutorThread(myQueue, threadName);
    myThread.start();
  }

  public void runTask(@NotNull Runnable task) {
    if (Thread.currentThread() == myThread) {
      task.run();
    } else {
      addTask(task);
    }
  }

  public void addTask(@NotNull Runnable task) {
    synchronized (myQueue) {
      myQueue.add(task);
      myQueue.notify();
    }
  }

  public void assertIsCommandThread() {
    assert Thread.currentThread() == myThread;
  }

  public void assertSoftlyIsCommandThread() {
    if (Thread.currentThread() != myThread) {
      if (log.isErrorEnabled()) {
        log.error("", new AssertionError("Current thread is " + Thread.currentThread() + ", but should be " + myThread));
      }
    }
  }

  private static class MyExecutorThread extends Thread {
    protected static Log log = LogFactory.getLog(SimpleCommandQueue.MyExecutorThread.class);

    private final Queue<Runnable> myQueue;

    public MyExecutorThread(@NotNull Queue<Runnable> queue, @NotNull String name) {
      super(name);
      myQueue = queue;
    }

    @Override
    public void run() {
      while (true) {
        Runnable task;
        synchronized (myQueue) {
          while (myQueue.isEmpty()) {
            try {
              myQueue.wait();
            } catch (InterruptedException e) {
              return;
            }
          }
          task = myQueue.poll();
        }
        try {
          task.run();
        } catch (Throwable e) {
          if (log.isErrorEnabled()) {
            log.error(e.getClass().getName() + " exception in " + getName(), e);
          }
        }
      }
    }
  }
}
