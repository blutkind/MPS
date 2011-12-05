package jetbrains.mps.make.service;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IScriptController;
import jetbrains.mps.messages.IMessageHandler;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.progress.ProgressMonitor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Iterator;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.messages.IMessage;
import jetbrains.mps.InternalFlag;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.logging.ILoggingHandler;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.logging.LogEntry;

public class CoreMakeTask {
  private static Logger LOG = Logger.getLogger(CoreMakeTask.class);

  private IResult myResult = null;
  protected final Iterable<IScript> myScripts;
  protected final String myScrName;
  private final Iterable<? extends Iterable<IResource>> myClInput;
  private final IScriptController myController;
  private final IMessageHandler myMessageHandler;

  public CoreMakeTask(@NotNull String title, Iterable<IScript> scripts, String scrName, Iterable<? extends Iterable<IResource>> clInput, IScriptController ctl, IMessageHandler mh) {
    this.myScripts = scripts;
    this.myScrName = scrName;
    this.myClInput = clInput;
    this.myController = ctl;
    this.myMessageHandler = mh;
  }

  public void run(@NotNull ProgressMonitor monitor) {
    try {
      doRun(monitor);
    } finally {
      try {
        reconcile();
      } catch (RuntimeException ex) {
        LOG.debug("Unexpected exception", ex);
      }
    }
  }

  protected void doRun(ProgressMonitor monitor) {
    aboutToStart();
    final int clsize = Sequence.fromIterable(this.myClInput).count();
    if (clsize == 0) {
      return;
    }
    monitor.start("", clsize);
    try {
      int idx = 0;
      Iterator<IScript> scit = Sequence.fromIterable(myScripts).iterator();
      Iterator<? extends Iterable<IResource>> clit = Sequence.fromIterable(myClInput).iterator();
      while (scit.hasNext() && clit.hasNext()) {
        Iterable<IResource> cl = clit.next();
        IScript scr = scit.next();

        if (!(scr.isValid())) {
          String msg = myScrName + " not started: invalid make script";
          myMessageHandler.handle(new Message(MessageKind.ERROR, msg));
          displayInfo(msg);
          for (IMessage err : scr.validationErrors()) {
            myMessageHandler.handle(err);
          }
          this.myResult = new IResult.FAILURE(null);
          break;
        }

        if (InternalFlag.isInternalMode()) {
          myMessageHandler.handle(new Message(MessageKind.INFORMATION, "Modules cluster " + (idx + 1) + "/" + clsize + " [" + IterableUtils.join(Sequence.fromIterable(cl).select(new ISelector<IResource, String>() {
            public String select(IResource r) {
              return ((IResource) r).describe();
            }
          }), ", ") + "]"));
        }

        monitor.step((idx + 1) + "/" + clsize + " " + IterableUtils.join(Sequence.fromIterable(cl).select(new ISelector<IResource, String>() {
          public String select(IResource r) {
            return ((IResource) r).describe();
          }
        }), ","));
        this.myResult = scr.execute(this.myController, cl, monitor.subTask(1));
        if (!(this.myResult.isSucessful()) || monitor.isCanceled()) {
          break;
        }
        idx++;
      }
    } finally {
      monitor.done();
    }
  }

  protected void displayInfo(String info) {
  }

  protected void aboutToStart() {
  }

  protected void reconcile() {
    if (this.myResult == null) {
      String msg = this.myScrName + " aborted";
      displayInfo(msg);
    } else if (!(this.myResult.isSucessful())) {
      String msg = this.myScrName + " failed";
      myMessageHandler.handle(new Message(MessageKind.ERROR, msg + ". See previous messages for details."));
      displayInfo(msg);
    } else {
      String msg = this.myScrName + " successful";
      displayInfo(msg);
    }
  }

  public IMessageHandler getMessageHandler() {
    return myMessageHandler;
  }

  public IResult getResult() {
    return myResult;
  }

  public static class RelayingLoggingHandler implements ILoggingHandler {
    private static Tuples._2<ThreadGroup, IMessageHandler> GROUP_HANDLER;

    private ThreadLocal<IMessageHandler> messageHandler = new ThreadLocal<IMessageHandler>() {
      @Override
      protected IMessageHandler initialValue() {
        return (CoreMakeTask.RelayingLoggingHandler.GROUP_HANDLER._0() == Thread.currentThread().getThreadGroup() ?
          CoreMakeTask.RelayingLoggingHandler.GROUP_HANDLER._1() :
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
