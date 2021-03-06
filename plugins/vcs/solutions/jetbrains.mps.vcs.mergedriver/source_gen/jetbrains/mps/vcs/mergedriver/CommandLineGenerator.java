package jetbrains.mps.vcs.mergedriver;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.InternalFlag;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Arrays;
import java.io.File;
import com.intellij.openapi.util.SystemInfo;
import org.apache.commons.lang.StringUtils;
import com.intellij.openapi.application.PathManager;
import com.intellij.ide.plugins.IdeaPluginDescriptor;
import com.intellij.ide.plugins.PluginManager;
import com.intellij.openapi.extensions.PluginId;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.LinkedHashSet;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.vcs.diff.merge.MergeContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.internal.collections.runtime.ISelector;
import com.intellij.util.PathUtil;

public class CommandLineGenerator {
  protected static Log log = LogFactory.getLog(CommandLineGenerator.class);

  private CommandLineGenerator() {
  }

  public static String getCommandLine(int vcs) {
    Iterable<String> classpath = getClasspath(vcs == ScriptGenerator.SVN);
    if (InternalFlag.isInternalMode()) {
      classpath = Sequence.fromIterable(classpath).where(new IWhereFilter<String>() {
        public boolean accept(String cpi) {
          return cpi.endsWith(".jar");
        }
      }).concat(ListSequence.fromList(Arrays.asList(InternalRuntimePacker.getPath())));
    }
    String javaExecutable = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
    if (SystemInfo.isWindows) {
      javaExecutable = adaptPathForMsysGit(javaExecutable + ".exe");
    }
    String classpathString = StringUtils.join(Sequence.fromIterable(classpath).toListSequence(), File.pathSeparator);
    String escapedLogPath = (PathManager.getLogPath() + File.separator + "mergedriver.log").replace("\\", "\\\\");
    return String.format("\"%s\" -D%s=\"%s\" -cp \"%s\" %s", javaExecutable, MergeDriverMain.LOG_PROPERTY, escapedLogPath, classpathString, MergeDriverMain.class.getName());
  }

  private static String getSvnkitJar() {
    IdeaPluginDescriptor svnPlugin = PluginManager.getPlugin(PluginId.getId("Subversion"));
    assert svnPlugin != null;
    return svnPlugin.getPath() + File.separator + "lib" + File.separator + "svnkit.jar";
  }

  public static Set<String> getClasspath(boolean withSvnkit) {
    Set<String> classpathItems = SetSequence.fromSet(new LinkedHashSet<String>());
    final Iterable<String> OTHER_CLASSES = Arrays.asList("com.intellij.ide.projectView.impl.ProjectViewImpl", "jetbrains.mps.internal.collections.runtime.ListSequence", "jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes", "org.apache.commons.logging.Log", "org.apache.log4j.Logger", "com.intellij.util.containers.ConcurrentHashSet", "gnu.trove.THash", "org.jdom.JDOMException", "com.intellij.openapi.components.ApplicationComponent", "com.intellij.idea.IdeaTestApplication", "org.picocontainer.Disposable", "com.intellij.openapi.extensions.Extensions", "com.intellij.ide.ClassloaderUtil", "jetbrains.mps.ide.generator.TransientModelsComponent", "org.apache.xmlrpc.XmlRpcServer", "jetbrains.mps.typesystem.inference.TypeChecker", "jetbrains.mps.debug.customViewers.CustomViewersManager", "jetbrains.mps.debug.api.breakpoints.BreakpointProvidersManager", "jetbrains.mps.editor.runtime.impl.LanguagesKeymapManager", "jetbrains.mps.intentions.IntentionsManager", "jetbrains.mps.ide.findusages.FindersManager", "jetbrains.mps.baseLanguage.index.ClassifierSuccessorsIndexer", "jetbrains.mps.execution.impl.configurations.runners.MPSProgramRunner", "com.google.common.collect.ImmutableList", "jetbrains.mps.analyzers.runtime.framework.CustomAnalyzerRunner", "jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin", "jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple");
    Iterable<Class> classes = Arrays.<Class>asList(MergeDriverMain.class, FileUtil.class, MergeContext.class, SModel.class, StringUtils.class, IdeMain.class);
    classes = Sequence.fromIterable(OTHER_CLASSES).select(new ISelector<String, Class>() {
      public Class select(String cn) {
        try {
          return (Class) Class.forName(cn);
        } catch (ClassNotFoundException e) {
          if (log.isErrorEnabled()) {
            log.error("", e);
          }
          return null;
        }
      }
    }).concat(Sequence.fromIterable(classes));
    SetSequence.fromSet(classpathItems).addSequence(Sequence.fromIterable(classes).select(new ISelector<Class, String>() {
      public String select(Class c) {
        return PathUtil.getJarPathForClass(c);
      }
    }));
    SetSequence.fromSet(classpathItems).addElement(jetbrains.mps.util.PathManager.getHomePath() + File.separator + "lib" + File.separator + "resources.jar");
    SetSequence.fromSet(classpathItems).addElement(jetbrains.mps.util.PathManager.getHomePath() + File.separator + "lib" + File.separator + "resources_en.jar");
    SetSequence.fromSet(classpathItems).addElement(jetbrains.mps.util.PathManager.getHomePath() + File.separator + "lib" + File.separator + "icons.jar");
    if (withSvnkit) {
      SetSequence.fromSet(classpathItems).addElement(getSvnkitJar());
    }
    return classpathItems;
  }

  /*package*/ static String adaptPathForMsysGit(String path) {
    return path.replaceFirst("^(\\w):\\\\", "/$1/").replace('\\', '/');
  }
}
