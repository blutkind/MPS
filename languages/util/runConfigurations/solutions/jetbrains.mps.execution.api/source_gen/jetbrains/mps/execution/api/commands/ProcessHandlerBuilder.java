package jetbrains.mps.execution.api.commands;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import java.io.IOException;
import com.intellij.execution.process.ProcessNotCreatedException;
import com.intellij.execution.configurations.GeneralCommandLine;
import java.util.concurrent.CountDownLatch;
import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessEvent;

public class ProcessHandlerBuilder {
  private final List<String> myCommandLine = ListSequence.fromList(new ArrayList<String>());

  public ProcessHandlerBuilder() {
  }

  public ProcessHandlerBuilder append(@Nullable String command) {
    if (!(StringUtils.isEmpty(command))) {
      ListSequence.fromList(myCommandLine).addSequence(Sequence.fromIterable(splitCommandInParts(command)));
    }
    return this;
  }

  public ProcessHandlerBuilder append(@Nullable File file) {
    if (file != null) {
      ListSequence.fromList(myCommandLine).addElement(file.getAbsolutePath());
    }
    return this;
  }

  public ProcessHandlerBuilder append(String... command) {
    for (String commandPart : Sequence.fromIterable(Sequence.fromArray(command))) {
      append(commandPart);
    }
    return this;
  }

  public ProcessHandlerBuilder append(@NotNull List<String> command) {
    for (String commandPart : ListSequence.fromList(command)) {
      append(commandPart);
    }
    return this;
  }

  @Deprecated
  public ProcessHandlerBuilder appendKey(@Nullable String key, @Nullable String parameter) {
    return append(new KeyValueCommandPart(key, parameter));
  }

  @Deprecated
  public ProcessHandlerBuilder appendKey(@Nullable String key, String... parameter) {
    if (StringUtils.isNotEmpty(key) && parameter.length > 0) {
      return append("-" + key).append(parameter);
    }
    return this;
  }

  @Deprecated
  public ProcessHandlerBuilder appendKey(@Nullable String key, @NotNull List<String> parameters) {
    if (StringUtils.isNotEmpty(key) && ListSequence.fromList(parameters).isNotEmpty()) {
      return append("-" + key).append(parameters);
    }
    return this;
  }

  public ProcessHandlerBuilder append(@Nullable CommandPart commandPart) {
    if (commandPart != null) {
      ListSequence.fromList(myCommandLine).addSequence(ListSequence.fromList(commandPart.getCommandList()));
    }
    return this;
  }

  public ProcessHandler build() throws ExecutionException {
    return build(new File(System.getProperty("user.dir")));
  }

  public ProcessHandler build(@NotNull File workingDirectory) throws ExecutionException {
    if (!(workingDirectory.exists())) {
      throw new ExecutionException("Working directory " + workingDirectory + " does not exist.");
    }
    ProcessBuilder builder = new ProcessBuilder(ListSequence.fromList(myCommandLine).toGenericArray(String.class));
    builder.directory(workingDirectory);
    try {
      Process process = builder.start();
      DefaultProcessHandler processHandler = new DefaultProcessHandler(process, ListSequence.fromList(myCommandLine).foldLeft("", new ILeftCombinator<String, String>() {
        public String combine(String s, String it) {
          return (StringUtils.isEmpty(s) ?
            it :
            s + " " + it
          );
        }
      }));
      return processHandler;
    } catch (IOException e) {
      throw new ProcessNotCreatedException("Start process failed", e, getCommandLine(workingDirectory.getAbsolutePath()));
    } catch (NullPointerException e) {
      throw new ProcessNotCreatedException("Start process failed: one of the command line arguments is null", e, getCommandLine(workingDirectory.getAbsolutePath()));
    } catch (Throwable t) {
      throw new ProcessNotCreatedException("Start process failed", t, getCommandLine(workingDirectory.getAbsolutePath()));
    }
  }

  private GeneralCommandLine getCommandLine(String workingDirectory) {
    GeneralCommandLine commandLine = new GeneralCommandLine();
    commandLine.setExePath(ListSequence.fromList(myCommandLine).getElement(0));
    commandLine.setWorkDirectory(workingDirectory);
    commandLine.addParameters(ListSequence.fromList(myCommandLine).tailListSequence(1));
    return commandLine;
  }

  public static Iterable<String> splitCommandInParts(@NotNull String command) {
    List<String> result = ListSequence.fromList(new ArrayList<String>());
    boolean insideQuotes = false;
    boolean escaped = false;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < command.length(); i++) {
      char currentChar = command.charAt(i);
      if (currentChar == '"' && !(escaped)) {
        insideQuotes = !(insideQuotes);
        continue;
      }
      if (currentChar == ' ' && !(insideQuotes)) {
        // word ended 
        if (sb.length() > 0) {
          ListSequence.fromList(result).addElement(sb.toString());
          sb = new StringBuilder();
        }
      } else if (currentChar == '\\' && (i < command.length() - 1 && command.charAt(i + 1) == '"')) {
        escaped = true;
        continue;
      } else {
        // inside word 
        sb.append(currentChar);
      }
      escaped = false;
    }
    if (sb.length() > 0) {
      ListSequence.fromList(result).addElement(sb.toString());
    }
    return result;
  }

  public static int startAndWait(ProcessHandler process) {
    final CountDownLatch countDown = new CountDownLatch(1);
    final int[] exitCode = new int[]{1};
    OutputRedirector.redirect(process, new ProcessAdapter() {
      @Override
      public void processTerminated(ProcessEvent event) {
        exitCode[0] = event.getExitCode();
        countDown.countDown();
      }
    });
    process.startNotify();
    try {
      countDown.await();
    } catch (InterruptedException e) {
    }
    return exitCode[0];
  }
}
