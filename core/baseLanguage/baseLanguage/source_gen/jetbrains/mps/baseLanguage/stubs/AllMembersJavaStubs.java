package jetbrains.mps.baseLanguage.stubs;

/*Generated by MPS */

import jetbrains.mps.smodel.persistence.AbstractModelRootManager;
import java.util.Collection;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.smodel.LanguageID;
import jetbrains.mps.reloading.ClassPathFactory;
import java.io.IOException;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.stubs.javastub.classpath.StubHelper;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;

public class AllMembersJavaStubs extends AbstractModelRootManager {
  public AllMembersJavaStubs() {
  }

  public Collection<SModelDescriptor> load(@NotNull ModelRoot root, IModule module) {
    List<SModelDescriptor> result = ListSequence.fromList(new ArrayList<SModelDescriptor>());
    IClassPathItem cp = AllMembersJavaStubs.this.create(root.getPath());
    AllMembersJavaStubs.this.getModelDescriptors(result, root.getPath(), cp, (root.getPrefix() == null ?
      "" :
      root.getPrefix()
    ), LanguageID.JAVA, module);
    return result;
  }

  /*package*/ IClassPathItem create(String path) {
    try {
      return ClassPathFactory.getInstance().createFromPath(path, "JavaStubs");
    } catch (IOException e) {
      e.printStackTrace();
      // To change body of catch statement use File | Settings | File Templates. 
    }
    return null;
  }

  /*package*/ void getModelDescriptors(List<SModelDescriptor> result, String startPath, IClassPathItem cp, String prefix, String languageId, IModule module) {
    for (String subpackage : cp.getSubpackages(prefix)) {
      if (cp.getRootClasses(subpackage).iterator().hasNext()) {
        SModelReference modelReference = StubHelper.uidForPackageInStubs(subpackage, languageId, module.getModuleReference());
        BaseStubModelDescriptor smd;
        if (SModelRepository.getInstance().getModelDescriptor(modelReference) != null) {
          SModelDescriptor descriptor = SModelRepository.getInstance().getModelDescriptor(modelReference);
          assert descriptor instanceof BaseStubModelDescriptor;
          smd = (BaseStubModelDescriptor) descriptor;
          ListSequence.fromList(result).addElement(descriptor);
        } else {
          smd = new JavaStubModelDescriptor(modelReference, new JavaStubModelDataSource("debugger_java", false), module);
          ListSequence.fromList(result).addElement(smd);
        }
        smd.getSource().addPath(AllMembersJavaStubs.this.child(startPath, subpackage));
      }
      AllMembersJavaStubs.this.getModelDescriptors(result, startPath, cp, subpackage, languageId, module);
    }
  }

  /*package*/ String child(String startPath, String prefix) {
    IFile file = FileSystem.getInstance().getFileByPath((startPath.endsWith(".jar") ?
      startPath + "!/" :
      startPath
    ));
    for (String child : prefix.split("\\.")) {
      file = file.getDescendant(child);
    }
    return file.getPath();
  }
}
