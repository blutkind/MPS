package jetbrains.mps.debug.runtime.java.programState.watchables;

/*Generated by MPS */

import com.sun.jdi.ObjectReference;
import com.sun.jdi.ThreadReference;
import jetbrains.mps.debug.api.programState.WatchablesCategory;
import jetbrains.mps.debug.runtime.java.programState.JavaWatchablesCategory;
import jetbrains.mps.debug.api.programState.IValue;
import jetbrains.mps.debug.runtime.java.programState.proxies.ValueUtil;
import javax.swing.Icon;
import jetbrains.mps.debug.integration.ui.icons.Icons;
import jetbrains.mps.smodel.SNode;

public class JavaExceptionWatchable extends JavaBreakpointWatchable {
  private final ObjectReference myException;

  public JavaExceptionWatchable(ObjectReference exception, String classFQName, ThreadReference threadReference) {
    super(classFQName, threadReference);
    myException = exception;
  }

  @Override
  public String getName() {
    return "exception";
  }

  @Override
  public WatchablesCategory getCategory() {
    return JavaWatchablesCategory.THROWN_EXCEPTION;
  }

  @Override
  public IValue getValue() {
    return ValueUtil.getInstance().fromJDIValue(myException, myClassFQName, myThreadReference);
  }

  @Override
  public Icon getPresentationIcon() {
    return Icons.EXCEPTION_BREAKPOINT;
  }

  @Override
  public SNode getNode() {
    return null;
  }
}
