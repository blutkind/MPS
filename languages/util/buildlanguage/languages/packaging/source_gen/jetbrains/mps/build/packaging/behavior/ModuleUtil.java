package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import java.io.File;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.reloading.IClassPathItem;
import java.util.ArrayList;
import jetbrains.mps.reloading.CommonPaths;
import jetbrains.mps.reloading.EachClassPathItemVisitor;
import jetbrains.mps.reloading.FileClassPathItem;
import jetbrains.mps.reloading.JarFileClassPathItem;

public class ModuleUtil {
  public ModuleUtil() {
  }

  public static String getRelativePath(String path, File basefile) {
    return getRelativePath(path, basefile.getPath());
  }

  public static String getRelativePath(String path, String basedir) {
    if (path == null) {
      return "";
    }
    path = path.replace(File.separator, Util.SEPARATOR);
    if (basedir == null || basedir.length() == 0) {
      return path;
    }
    basedir = basedir.replace(File.separator, Util.SEPARATOR);
    if (basedir.endsWith(Util.SEPARATOR)) {
      basedir = basedir.substring(0, basedir.length() - 1);
    }
    if (!(path.startsWith(basedir + Util.SEPARATOR))) {
      return path;
    }
    return path.substring(basedir.length() + 1);
  }

  public static void findMacro(SNode pathHolder, List<SNode> macro) {
    for (SNode m : ListSequence.fromList(macro)) {
      if (SPropertyOperations.getString(pathHolder, "fullPath").startsWith(SPropertyOperations.getString(m, "path") + Util.SEPARATOR)) {
        SLinkOperations.setTarget(pathHolder, "macro", m, false);
        SPropertyOperations.set(pathHolder, "fullPath", getRelativePath(SPropertyOperations.getString(pathHolder, "fullPath"), SPropertyOperations.getString(m, "path")));
        break;
      }
    }
  }

  public static List<String> retrieveClassPath(IClassPathItem cpitem) {
    final List<String> result = ListSequence.fromList(new ArrayList<String>());
    final List<String> jdk = CommonPaths.getJDKPath();
    cpitem.accept(new EachClassPathItemVisitor() {
      public void visit(FileClassPathItem item) {
        // filter out JDK 
        if (jdk.contains(item.getPath())) {
          return;
        }
        ListSequence.fromList(result).addElement(item.getPath());
      }

      public void visit(JarFileClassPathItem item) {
        // filter out JDK 
        if (jdk.contains(item.getAbsolutePath())) {
          return;
        }
        ListSequence.fromList(result).addElement(item.getAbsolutePath());
      }
    });
    return result;
  }
}
