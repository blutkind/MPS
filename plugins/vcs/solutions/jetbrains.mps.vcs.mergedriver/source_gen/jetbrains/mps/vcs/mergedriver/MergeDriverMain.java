package jetbrains.mps.vcs.mergedriver;

/*Generated by MPS */

import java.io.File;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.apache.commons.lang.StringUtils;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;

public class MergeDriverMain {
  private static final String CONFLICT_START = "<<<<<<<";
  private static final String CONFLICT_END = ">>>>>>>";
  private static final String CONFLICT_SEPARATOR = "=======";
  /*package*/ static final String LOG_PROPERTY = "mps.mergedriver.log";
  private static final String SVN_OPTION = "--svn";
  private static final String GIT_OPTION = "--git";

  private MergeDriverMain() {
  }

  public static void main(String[] args) {
    byte[] conflictStart = CONFLICT_START.getBytes();
    byte[] conflictEnd = CONFLICT_END.getBytes();
    byte[] conflictSeparator = CONFLICT_SEPARATOR.getBytes();
    if (args.length < 4) {
      System.err.println("Usage <merger> --<vcs> <base> <current> <other> " + "[<base name> <current name> <other name>]");
      System.exit(2);
    }

    File baseFile = new File(args[1]);
    File currentFile = new File(args[2]);
    File otherFile = new File(args[3]);
    boolean overwrite = false;
    if (SVN_OPTION.equals(args[0])) {
      if (args.length >= 7) {
        conflictStart = (CONFLICT_START + " " + args[5]).getBytes();
        conflictEnd = (CONFLICT_END + " " + args[6]).getBytes();
      }
    } else if (GIT_OPTION.equals(args[0])) {
      overwrite = true;
    } else {
      System.exit(2);
      return;
    }
    configureLog4j();
    AbstractFileMerger merger = selectMerger(baseFile, currentFile, otherFile);
    if (merger == null) {
      merger = (SVN_OPTION.equals(args[0]) ?
        new TextMerger() :
        new SimpleMerger()
      );
    }
    System.exit(merger.mergeFiles(baseFile, currentFile, otherFile, overwrite, conflictStart, conflictEnd, conflictSeparator));
  }

  @Nullable
  private static AbstractFileMerger selectMerger(File... files) {
    FileType fileType = Sequence.fromIterable(Sequence.fromArray(files)).select(new ISelector<File, FileType>() {
      public FileType select(File f) {
        return FileType.get(f);
      }
    }).findFirst(new IWhereFilter<FileType>() {
      public boolean accept(FileType f) {
        return f != null;
      }
    });
    if (fileType == null) {
      return null;
    }
    switch (fileType) {
      case MODEL:
        return new ModelMerger();
      case TRACE_CACHE:
      case GENERATOR_DEPENDENCIES:
        return new EmptyMerger();
      case JAVA_DEPENDENCIES:
        return new JavaDependenciesMerger();
      default:
        return new TextMerger();
    }
  }

  private static void configureLog4j() {
    String logPath = System.getProperty(LOG_PROPERTY);
    if (StringUtils.isEmpty(logPath)) {
      return;
    }
    Properties p = new Properties();
    p.setProperty("log4j.rootLogger", "info, file");
    p.setProperty("log4j.appender.file", "org.apache.log4j.RollingFileAppender");
    p.setProperty("log4j.appender.file.File", logPath);
    p.setProperty("log4j.appender.file.Append", "true");
    p.setProperty("log4j.appender.file.MaxFileSize", "2MB");
    p.setProperty("log4j.appender.file.MaxBackupIndex", "2");
    p.setProperty("log4j.appender.file.layout", "org.apache.log4j.PatternLayout");
    p.setProperty("log4j.appender.file.layout.conversionPattern", "%d{ABSOLUTE} %5p %t %c{1}:%M:%L - %m%n");
    PropertyConfigurator.configure(p);
  }
}
