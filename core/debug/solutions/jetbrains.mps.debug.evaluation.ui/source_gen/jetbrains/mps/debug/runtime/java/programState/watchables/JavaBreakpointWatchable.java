package jetbrains.mps.debug.runtime.java.programState.watchables;

/*Generated by MPS */

import jetbrains.mps.debug.api.programState.IWatchable;
import com.sun.jdi.ThreadReference;

public abstract class JavaBreakpointWatchable implements IWatchable {
  protected String myClassFQName;
  protected ThreadReference myThreadReference;

  public JavaBreakpointWatchable(String classFQName, ThreadReference threadReference) {
    myClassFQName = classFQName;
    myThreadReference = threadReference;
  }
}
