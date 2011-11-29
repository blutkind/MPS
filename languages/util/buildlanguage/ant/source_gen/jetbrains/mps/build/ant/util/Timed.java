package jetbrains.mps.build.ant.util;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * * @author mike
 */
@SuppressWarnings(value = {"NonPrivateFieldAccessedInSynchronizedContext"})
/*package*/ abstract class Timed<T> {
  private static final Logger LOG = Logger.getLogger("#com.intellij.util.Timed");
  private static final Map<Timed, Boolean> ourReferences = Collections.synchronizedMap(new WeakHashMap<Timed, Boolean>());

  /*package*/ int myLastCheckedAccessCount;
  /*package*/ int myAccessCount;
  protected T myT;
  /*package*/ boolean myPolled;

  public void dispose() {
    final Object t = myT;
    myT = null;
    remove();
  }

  protected final void poll() {
    if (!(myPolled)) {
      ourReferences.put(this, Boolean.TRUE);
      myPolled = true;
    }
  }

  protected final void remove() {
    ourReferences.remove(this);
    myPolled = false;
  }

  protected boolean isLocked() {
    return false;
  }

  /*package*/ static void disposeTimed() {
    final Timed[] references = ourReferences.keySet().toArray(new Timed[ourReferences.size()]);
    for (Timed timed : references) {
      if (timed == null) {
        continue;
      }
      synchronized (timed) {
        if (timed.myLastCheckedAccessCount == timed.myAccessCount && !(timed.isLocked())) {
          timed.dispose();
        } else {
          timed.myLastCheckedAccessCount = timed.myAccessCount;
        }
      }
    }
  }

  static {
    ScheduledExecutorService service = ConcurrencyUtil.newSingleScheduledThreadExecutor("timed reference disposer", Thread.MIN_PRIORITY + 1);
    service.scheduleWithFixedDelay(new Runnable() {
      public void run() {
        try {
          Timed.disposeTimed();
        } catch (Throwable e) {
          Timed.LOG.error(e);
        }
      }
    }, 60, 60, TimeUnit.SECONDS);
  }
}
