package jetbrains.mps.debugger.java.runtime.execution;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;

public interface IDebuggerManagerThread {
  public static final int COMMAND_TIMEOUT = 3000;

  public void invokeAndWait(@NotNull IDebuggerCommand command);
  public void invoke(@NotNull IDebuggerCommand command);
  public void invokeTerminalCommand(@NotNull IDebuggerCommand command);
  public void scheduleFirst(@NotNull IDebuggerCommand command);
  public void schedule(@NotNull IDebuggerCommand command);
  public void close();
}
