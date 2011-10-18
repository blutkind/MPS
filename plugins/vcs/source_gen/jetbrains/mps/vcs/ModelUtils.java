package jetbrains.mps.vcs;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import org.jdom.Document;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import java.io.ByteArrayOutputStream;
import jetbrains.mps.util.JDOMUtil;
import java.io.IOException;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.Nullable;
import java.io.File;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.UnzipUtil;
import java.io.FilenameFilter;
import jetbrains.mps.project.MPSExtentions;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.InputSource;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import jetbrains.mps.smodel.persistence.def.DescriptorLoadResult;
import jetbrains.mps.smodel.BaseSModelDescriptor;
import jetbrains.mps.smodel.ModelLoadingState;
import jetbrains.mps.vcs.integration.ModelDiffTool;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class ModelUtils {
  protected static Log log = LogFactory.getLog(ModelUtils.class);

  private ModelUtils() {
  }

  public static byte[] modelToBytes(final SModel result) {
    final Wrappers._T<Document> document = new Wrappers._T<Document>();
    ModelAccess.instance().runReadAction(new Computable<Document>() {
      public Document compute() {
        return document.value = ModelPersistence.saveModel(result);
      }
    });
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try {
      JDOMUtil.writeDocument(document.value, baos);
      return baos.toByteArray();
    } catch (IOException e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    }
    return new byte[0];
  }

  public static void replaceModelWithBytes(final VirtualFile modelFile, final byte[] bytesToReplaceWith) {
    ModelAccess.instance().runWriteInEDT(new Runnable() {
      public void run() {
        try {
          modelFile.setBinaryContent(bytesToReplaceWith);
        } catch (IOException e) {
          if (log.isErrorEnabled()) {
            log.error("", e);
          }
        }
      }
    });
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

  @Nullable
  public static SModel readModel(@NotNull final byte[] bytes) throws IOException {
    return (bytes.length == 0 ?
      null :
      readModel(new ModelUtils.InputSourceFactory() {
        public InputSource create() throws IOException {
          return new InputSource(new ByteArrayInputStream(bytes));
        }
      })
    );
  }

  @Nullable
  public static SModel readModel(@NotNull final String content) throws IOException {
    return (content.isEmpty() ?
      null :
      readModel(new ModelUtils.InputSourceFactory() {
        public InputSource create() throws IOException {
          return new InputSource(new StringReader(content));
        }
      })
    );
  }

  @Nullable
  public static SModel readModel(final File file) throws IOException {
    return readModel(com.intellij.openapi.util.io.FileUtil.loadFileBytes(file));
  }

  @Nullable
  private static SModel readModel(@NotNull final ModelUtils.InputSourceFactory inputSourceFactory) throws IOException {
    try {
      final IOException[] ex = new IOException[1];
      final SModel[] model = new SModel[1];
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          try {
            DescriptorLoadResult loadResult = ModelPersistence.loadDescriptor(inputSourceFactory.create());
            BaseSModelDescriptor.ModelLoadResult result = ModelPersistence.readModel(loadResult.getHeader(), inputSourceFactory.create(), ModelLoadingState.FULLY_LOADED);
            if (result.getState() != ModelLoadingState.FULLY_LOADED) {
              model[0] = null;
            } else {
              model[0] = result.getModel();
            }
          } catch (IOException e) {
            ex[0] = e;
          }
        }
      });
      if (ex[0] != null) {
        throw ex[0];
      } else {
        return model[0];
      }
    } catch (Exception t) {
      throw new ModelDiffTool.ReadException(t);
    }
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

  private static interface InputSourceFactory {
    public InputSource create() throws IOException;
  }
}
