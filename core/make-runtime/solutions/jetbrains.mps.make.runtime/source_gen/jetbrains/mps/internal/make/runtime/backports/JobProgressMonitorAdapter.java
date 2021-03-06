package jetbrains.mps.internal.make.runtime.backports;

/*Generated by MPS */

import jetbrains.mps.progress.ProgressMonitorBase;
import jetbrains.mps.make.script.IJobMonitor;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.progress.SubProgressKind;

public class JobProgressMonitorAdapter extends ProgressMonitorBase {
  private static final int WORK_AMOUNT = 10000;

  private IJobMonitor myJobMonitor;
  private String myName;
  private String myTitle;
  private String myStep;
  private boolean myCalledSetTitleInternal = false;

  public JobProgressMonitorAdapter(IJobMonitor monitor) {
    myJobMonitor = monitor;
  }

  protected void update(double frac) {
    if (myName != null) {
      double currFrac = 1. - (double) myJobMonitor.currentProgress().workLeft() / WORK_AMOUNT;
      myJobMonitor.currentProgress().advanceWork(myName, (int) (WORK_AMOUNT * (Math.max(0., frac - currFrac))), this.comment());
    }
  }

  protected void setTitleInternal(String text) {
    if (StringUtils.isEmpty(text)) {
      return;
    }
    int idx = text.indexOf(" :: ");
    if (idx >= 0) {
      text = text.substring(idx + 4);
    }
    myTitle = text;
  }

  protected void setStepInternal(String step) {
    myStep = step;
    if (myName != null) {
      myJobMonitor.currentProgress().advanceWork(myName, 0, comment());
    }
  }

  protected void startInternal(String text) {
    if (StringUtils.isEmpty(text)) {
      return;
    }
    this.myName = text;
    myJobMonitor.currentProgress().beginWork(text, WORK_AMOUNT, 0);
  }

  protected void doneInternal(String text) {
    if (StringUtils.isEmpty(text)) {
      return;
    }
    myJobMonitor.currentProgress().finishWork(text);
  }

  private String comment() {
    String currsubtitle = (StringUtils.isEmpty(myTitle) || myTitle.startsWith(myName) ?
      "" :
      myTitle
    );
    String currstep = (StringUtils.isNotEmpty(myStep) ?
      myStep :
      ""
    );
    return (StringUtils.isEmpty(currsubtitle) ?
      currstep :
      currsubtitle + ((StringUtils.isEmpty(currstep) ?
        "" :
        " " + currstep
      ))
    );
  }

  @Override
  protected ProgressMonitorBase.SubProgressMonitor subTaskInternal(int work, SubProgressKind kind) {
    return new JobProgressMonitorAdapter.SubProgressMonitor(this, getTaskName(), work, kind);
  }

  @Override
  public void done() {
    super.done();
  }

  public boolean isCanceled() {
    return myJobMonitor.stopRequested();
  }

  public void cancel() {
  }

  protected class SubProgressMonitor extends ProgressMonitorBase.SubProgressMonitor {
    private String myParentTask;

    private SubProgressMonitor(ProgressMonitorBase parent, String parentTask, int work, SubProgressKind kind) {
      super(parent, work, kind);
      this.myParentTask = parentTask;
    }

    @Override
    protected void doneInternal(String text) {
      if (!(StringUtils.isEmpty(text)) && StringUtils.isEmpty(myParentTask)) {
        JobProgressMonitorAdapter.this.doneInternal(text);
      }
    }

    @Override
    protected void startInternal(String text) {
      if (!(StringUtils.isEmpty(text)) && StringUtils.isEmpty(myParentTask)) {
        JobProgressMonitorAdapter.this.startInternal(text);
      }
    }

    @Override
    protected ProgressMonitorBase.SubProgressMonitor subTaskInternal(int work, SubProgressKind kind) {
      return new JobProgressMonitorAdapter.SubProgressMonitor(this, getTaskName(), work, kind);
    }
  }
}
