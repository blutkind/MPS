package jetbrains.mps.vcs;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.diff.DiffContent;
import com.intellij.openapi.vfs.VirtualFile;
import java.io.File;
import java.io.IOException;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.vcs.integration.ModelMergeTool;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.intellij.util.io.ZipUtil;
import com.intellij.openapi.application.PathManager;
import java.io.FilenameFilter;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.util.UnzipUtil;
import jetbrains.mps.project.MPSExtentions;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class MergeBackupUtil {
  protected static Log log = LogFactory.getLog(MergeBackupUtil.class);

  public MergeBackupUtil() {
    // Used in MergeProviderDecorator 
  }

  public static void writeContentsToFile(DiffContent contents, VirtualFile file, File tmpDir, String suffix) throws IOException {
    writeContentsToFile(contents.getBytes(), file.getName(), tmpDir, suffix);
  }

  public static File zipModel(DiffContent[] contents, VirtualFile file) throws IOException {
    File tmp = FileUtil.createTmpDir();
    writeContentsToFile(contents[ModelMergeTool.ORIGINAL], file, tmp, MergeVersion.BASE.getSuffix());
    writeContentsToFile(contents[ModelMergeTool.CURRENT], file, tmp, MergeVersion.MINE.getSuffix());
    writeContentsToFile(contents[ModelMergeTool.LAST_REVISION], file, tmp, MergeVersion.REPOSITORY.getSuffix());
    File zipfile = chooseZipFileForModelFile(file.getName());
    zipfile.getParentFile().mkdirs();
    FileUtil.zip(tmp, zipfile);
    FileUtil.delete(tmp);
    return zipfile;
  }

  public static void writeContentsToFile(byte[] contents, String name, File tmpDir, String suffix) throws IOException {
    File baseFile = new File(tmpDir.getAbsolutePath() + File.separator + name + "." + suffix);
    baseFile.createNewFile();
    OutputStream stream = new FileOutputStream(baseFile);
    stream.write(contents);
    stream.close();
  }

  public static File chooseZipFileForModelFile(String modelFileName) {
    String prefix = getMergeBackupDirPath() + File.separator + modelFileName;
    prefix = prefix + "." + new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(new Date());
    File zipfile = new File(prefix + ".zip");
    int i = 0;
    while (zipfile.exists()) {
      zipfile = new File(prefix + "." + i + ".zip");
      i++;
    }
    return zipfile;
  }

  public static void packMergeResult(File file, String fileName, byte[] resultContent) {
    try {
      File tmp = FileUtil.createTmpDir();
      ZipUtil.extract(file, tmp, null);
      //  copy merge result 
      FileUtil.write(new File(tmp + File.separator + fileName + ".result"), resultContent);
      //  copy logfiles 
      File logsDir = new File(PathManager.getLogPath());
      File[] logfiles = logsDir.listFiles(new FilenameFilter() {
        public boolean accept(File dir, String name) {
          return name.matches("mpsvcs\\.log(\\.1)*") || name.matches("idea\\.log(\\.1)*");
        }
      });
      File tmpLogDir = new File(tmp + File.separator + "logs");
      tmpLogDir.mkdir();
      for (File logfile : logfiles) {
        FileUtil.copyFile(logfile, new File(tmpLogDir + File.separator + logfile.getName()));
      }
      FileUtil.zip(tmp, file);
      FileUtil.delete(tmp);
    } catch (IOException e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    }
  }

  public static String getMergeBackupDirPath() {
    return PathManager.getSystemPath() + File.separator + "merge-backup";
  }

  @Nullable
  public static SModel[] loadZippedModels(File zipfile, ModelVersion[] versions) throws IOException {
    File tmpdir = FileUtil.createTmpDir();
    UnzipUtil.unzip(zipfile, tmpdir);
    SModel[] models = new SModel[versions.length];
    int index = 0;
    for (final ModelVersion v : versions) {
      File file;
      File[] files = tmpdir.listFiles(new FilenameFilter() {
        public boolean accept(File dir, String name) {
          return name.endsWith(MPSExtentions.DOT_MODEL + "." + v.getSuffix());
        }
      });
      if (files == null || files.length != 1) {
        if (log.isErrorEnabled()) {
          log.error("Wrong zip contents");
        }
      }
      file = files[0];
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      FileInputStream fis = new FileInputStream(file);
      while (true) {
        int i = fis.read();
        if (i == -1) {
          break;
        }
        baos.write(i);
      }
      models[index] = ModelUtils.readModel(baos.toByteArray());
      if (models[index] == null) {
        return null;
      }
      index++;
    }
    FileUtil.delete(tmpdir);
    return models;
  }

  public static Iterable<File> findZipFilesForModelFile(final String modelFileName) {
    File[] files = new File(MergeBackupUtil.getMergeBackupDirPath()).listFiles(new FilenameFilter() {
      public boolean accept(File dir, String name) {
        return name.contains(modelFileName) && modelFileName.endsWith(".zip");
      }
    });
    return Sequence.fromIterable(Sequence.fromArray(files)).sort(new ISelector<File, Comparable<?>>() {
      public Comparable<?> select(File f) {
        return f.getName();
      }
    }, false);
  }
}
