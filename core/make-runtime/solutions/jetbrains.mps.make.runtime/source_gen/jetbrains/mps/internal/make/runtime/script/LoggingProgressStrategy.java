package jetbrains.mps.internal.make.runtime.script;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.make.script.IProgress;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.IterableUtils;

public class LoggingProgressStrategy {
  private static Logger LOG = Logger.getLogger(LoggingProgressStrategy.class.getPackage().getName());
  private static String TOTAL = "\u221e";

  private LoggingProgressStrategy.LogReportingProgress last;
  private IProgress current;
  private LoggingProgressStrategy.Log logger = new LoggingProgressStrategy.Log() {
    public void error(String text) {
      LoggingProgressStrategy.LOG.error(text);
    }

    public void warning(String text) {
      LoggingProgressStrategy.LOG.warning(text);
    }

    public void info(String text) {
      LoggingProgressStrategy.LOG.info(text);
    }
  };

  public LoggingProgressStrategy() {
    this.last = new LoggingProgressStrategy.LogReportingProgress(null, LoggingProgressStrategy.TOTAL, Integer.MAX_VALUE, Integer.MAX_VALUE);
    this.current = new LoggingProgressStrategy.LastProgress();
  }

  /**
   * For testing only.
   */
  public LoggingProgressStrategy(LoggingProgressStrategy.Log log) {
    this();
    this.logger = log;
  }

  public IProgress currentProgress() {
    return current;
  }

  private IProgress begin(String name, int estimate, int total) {
    this.last = new LoggingProgressStrategy.LogReportingProgress(last, name, estimate, total);
    logger.info(last.fullName() + " -- started");
    return last;
  }

  private void progress(LoggingProgressStrategy.LogReportingProgress wrk) {
    double p = ((double) Math.min(wrk.estimate, wrk.done)) / wrk.estimate;
    logger.info(wrk.fullName() + " -- done " + ((int) Math.ceil(p * 100)) + "%");
  }

  private void finish(LoggingProgressStrategy.LogReportingProgress wrk) {
    logger.info(wrk.fullName() + " -- finished");
    this.last = wrk;
  }

  private static boolean eq_8gc367_a0a0b0g0(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  public class LogReportingProgress implements IProgress {
    private LoggingProgressStrategy.LogReportingProgress prev;
    private String name;
    private int estimate;
    private int total;
    private int done = 0;

    public LogReportingProgress(LoggingProgressStrategy.LogReportingProgress prev, String name, int estimate, int ofTotal) {
      this.prev = prev;
      this.name = name;
      this.estimate = estimate;
      this.total = ofTotal;
    }

    public void beginWork(String name, int estimate, int ofTotal) {
      if (estimate <= 0) {
        throw new IllegalArgumentException("invalid estimate value");
      }
      if (ofTotal < 0) {
        throw new IllegalArgumentException("invalid ofTotal value");
      }
      begin(name, estimate, Math.min(workLeft(), Math.min(workLeft(), ofTotal)));
    }

    public void doneWork(String name, int done) {
      if (done < 0) {
        throw new IllegalArgumentException("invalid done value");
      }
      matchingOrTotal(name).primDone(done);
    }

    private void primDone(int primDone) {
      if (primDone > 0) {
        this.done += primDone;
        if (prev != null) {
          prev.primDone((int) Math.floor(((double) Math.min(primDone, estimate)) * total / estimate));
        }
        progress(this);
      }
    }

    public void finishWork(String name) {
      finish(matchingOrTotal(name));
    }

    public int workLeft() {
      return Math.max(0, estimate - done);
    }

    private String fullName() {
      List<String> names = ListSequence.fromList(new ArrayList<String>());
      LoggingProgressStrategy.LogReportingProgress wrk = this;
      while (wrk != null) {
        ListSequence.fromList(names).addElement(wrk.name);
        wrk = wrk.prev;
      }
      return IterableUtils.join(ListSequence.fromList(names).reversedList(), "/");
    }

    private LoggingProgressStrategy.LogReportingProgress matchingOrTotal(String name) {
      LoggingProgressStrategy.LogReportingProgress wrk = this;
      while (wrk.prev != null) {
        if (eq_8gc367_a0a0b0g0(wrk.name, name)) {
          return wrk;
        }
        wrk = wrk.prev;
      }
      return wrk;
    }
  }

  public class LastProgress implements IProgress {
    public LastProgress() {
    }

    public void beginWork(String name, int estimate, int ofTotal) {
      last.beginWork(name, estimate, ofTotal);
    }

    public void finishWork(String name) {
      last.finishWork(name);
    }

    public void doneWork(String name, int done) {
      last.doneWork(name, done);
    }

    public int workLeft() {
      return last.workLeft();
    }
  }

  public static interface Log {
    public void error(String text);
    public void warning(String text);
    public void info(String text);
  }
}
