package jetbrains.mps.project;

import java.util.List;
import java.io.PrintStream;

public class TestResult {
  public List<String> myGenerationErrors;
  public List<String> myGenerationWarnings;
  public List<String> myCompilationProblems;

  public TestResult(List<String> generationErrors, List<String> generationWarnings, List<String> compilationProblems) {
    this.myGenerationErrors = generationErrors;
    this.myGenerationWarnings = generationWarnings;
    this.myCompilationProblems = compilationProblems;
  }

  public boolean isOk() {
    return !hasGenerationErrors() && !hasCompilationProblems();
  }

  public int warningsStartsWith(String warn) {
    int i = 0;
    for (String w : myGenerationWarnings) {
      if (w.startsWith(warn)) {
        i++;
      }
    }

    return i;
  }

  public boolean hasGenerationErrors() {
    return myGenerationErrors.size() != 0;
  }

  public boolean hasGenerationWarnings() {
    return myGenerationWarnings.size() != 0;
  }

  public boolean hasCompilationProblems() {
    return myCompilationProblems.size() != 0;
  }

  public void dump(PrintStream out) {
    out.println("[Test Resuls]============================================================");

    if (hasGenerationErrors()) {
      out.println("Generation errors:");
      for (String e : myGenerationErrors) {
        out.println("  " + e);
      }
    } else {
      out.println("No generation errors.");
    }
    out.println("");

    if (hasGenerationWarnings()) {
      out.println("Generation warnings:");
      for (String w : myGenerationWarnings) {
        out.println("  " + w);
      }
    } else {
      out.println("No generation warnings.");
    }
    out.println("");

    if (hasCompilationProblems()) {
      out.println("Compilation problems:");
      for (String c : myCompilationProblems) {
        out.println("  " + c);
      }
    } else {
      out.println("No compilation problems.");
    }
    out.println("=========================================================================");
  }

}
