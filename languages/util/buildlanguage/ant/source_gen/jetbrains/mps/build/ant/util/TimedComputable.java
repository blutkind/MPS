package jetbrains.mps.build.ant.util;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;

@SuppressWarnings(value = {"NonPrivateFieldAccessedInSynchronizedContext"})
public abstract class TimedComputable<T> extends Timed<T> {
  private int myAcquireCount = 0;

  public T acquire() {
    myAccessCount++;
    myAcquireCount++;
    if (myT == null) {
      myT = calc();
    }
    poll();
    return myT;
  }

  protected T getIfCached() {
    return myT;
  }

  public void release() {
    myAcquireCount--;
    assert myAcquireCount >= 0;
  }

  public void dispose() {
    assert myAcquireCount == 0;
    super.dispose();
  }

  protected boolean isLocked() {
    return myAcquireCount != 0;
  }

  @NotNull
  protected abstract T calc();
}
