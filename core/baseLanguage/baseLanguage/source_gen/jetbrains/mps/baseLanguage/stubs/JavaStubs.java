package jetbrains.mps.baseLanguage.stubs;

/*Generated by MPS */

import jetbrains.mps.project.IModule;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.reloading.ClassPathFactory;
import jetbrains.mps.reloading.FileClassPathItem;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.reloading.JarFileClassPathItem;
import jetbrains.mps.smodel.LanguageID;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.persistence.AbstractModelRootManager;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.stubs.javastub.classpath.StubHelper;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class JavaStubs extends jetbrains.mps.smodel.persistence.AbstractModelRootManager{
  public JavaStubs() {
  }

  @Override
  public Collection<SModelDescriptor> load(@NotNull ModelRoot root, IModule module) {
    Set<SModelDescriptor> result = new HashSet<SModelDescriptor>();
    IClassPathItem cp = createClassPathItem(root.getPath());
    getModelDescriptors(result, root.getPath(), cp, root.getPrefix() == null ? "" : root.getPrefix(), LanguageID.JAVA, module);
    return result;
  }

  private static void getModelDescriptors(Set<SModelDescriptor> result, String startPath, IClassPathItem cp, String prefix, String languageId, IModule module) {
    for (String subpackage : cp.getSubpackages(prefix)) {
      if (cp.getRootClasses(subpackage).iterator().hasNext()) {
        SModelReference modelReference = StubHelper.uidForPackageInStubs(subpackage, languageId, module.getModuleReference());
        BaseStubModelDescriptor smd = null;
        if (SModelRepository.getInstance().getModelDescriptor(modelReference) != null) {
          SModelDescriptor descriptor = SModelRepository.getInstance().getModelDescriptor(modelReference);
          assert descriptor instanceof BaseStubModelDescriptor;
          smd = (BaseStubModelDescriptor) descriptor;
          result.add(descriptor);
        } else {
          smd = new BaseStubModelDescriptor(modelReference, new JavaStubModelDataSource(), module);
          result.add(smd);
        }
        smd.getSource().addPath(child(startPath, subpackage));
      }
      getModelDescriptors(result, startPath, cp, subpackage, languageId, module);
    }
  }

  private static String child(String startPath, String prefix) {
    IFile file = FileSystem.getInstance().getFileByPath(startPath.endsWith(".jar") ? startPath + "!/" : startPath);
    for (String child : prefix.split("\\.")) {
      file = file.getDescendant(child);
    }
    return file.getPath();
  }

  @Nullable
  static IClassPathItem createClassPathItem(String path) {
    try {
      return ClassPathFactory.getInstance().createFromPath(path, "JavaStubs");
    } catch (IOException e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    }
    return null;
  }
}
