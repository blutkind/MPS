package jetbrains.mps.build.ant;

/*Generated by MPS */

import jetbrains.mps.project.Project;
import jetbrains.mps.logging.Logger;
import java.io.File;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.cleanup.CleanupManager;
import jetbrains.mps.project.ProjectManager;
import java.util.Set;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.structure.project.Path;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import jetbrains.mps.library.ModulesMiner;
import jetbrains.mps.project.IModule;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.project.structure.project.testconfigurations.BaseTestConfiguration;
import org.jdom.Document;
import jetbrains.mps.util.JDOMUtil;
import org.jdom.JDOMException;
import java.io.IOException;
import org.jdom.Element;
import jetbrains.mps.util.Macros;
import jetbrains.mps.util.MacrosFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.xmlQuery.runtime.AttributeUtils;
import jetbrains.mps.project.structure.project.testconfigurations.ModelsTestConfiguration;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.project.structure.project.testconfigurations.ModuleTestConfiguration;
import java.util.Collections;

public class FileMPSProject extends Project {
  private static Logger LOG = Logger.getLogger(FileMPSProject.class);

  private String myErrors;
  private FileMPSProject.ProjectDescriptor myDescriptor;

  public FileMPSProject(File file) {
    super();
    setProjectFile(file);
  }

  public String getName() {
    return getProjectFile().getName();
  }

  @Override
  public void projectOpened() {
    super.projectOpened();
  }

  @Override
  public void projectClosed() {
    super.projectClosed();
  }

  @Deprecated
  public <T> T getComponent(Class<T> cls) {
    return null;
  }

  @Override
  public void dispose() {
    super.dispose();
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        ClassLoaderManager.getInstance().unloadAll(new EmptyProgressMonitor());
        MPSModuleRepository.getInstance().unRegisterModules(FileMPSProject.this);
        CleanupManager.getInstance().cleanup();
        if (ProjectManager.getInstance().getOpenProjects().length > 0) {
          ClassLoaderManager.getInstance().reloadAll(new EmptyProgressMonitor());
        }
        ClassLoaderManager.getInstance().updateClassPath();
      }
    });
  }

  protected void readModules(FileMPSProject.ProjectDescriptor projDesc) {
    myErrors = null;
    //  load solutions 
    Set<ModuleReference> existingModules = getModuleReferences();
    for (Path modulePath : projDesc.getModules()) {
      String path = modulePath.getPath();
      IFile descriptorFile = FileSystem.getInstance().getFileByPath(path);
      if (descriptorFile.exists()) {
        ModuleDescriptor descriptor = ModulesMiner.getInstance().loadModuleDescriptor(descriptorFile);
        if (descriptor != null) {
          IModule module = MPSModuleRepository.getInstance().registerModule(new ModulesMiner.ModuleHandle(descriptorFile, descriptor), this);
          ModuleReference moduleReference = module.getModuleReference();
          if (!(existingModules.remove(moduleReference))) {
            super.addModule(moduleReference);
          }
        } else {
          error("Can't load module from " + descriptorFile.getPath() + " Unknown file type.");
        }
      } else {
        error("Can't load module from " + descriptorFile.getPath() + " File doesn't exist.");
      }
    }
    for (ModuleReference ref : existingModules) {
      super.removeModule(ref);
    }
  }

  private void error(String text) {
    if (myErrors == null) {
      this.myErrors = text;
    } else {
      myErrors += "\n" + text;
    }
    LOG.error(text);
  }

  public void init(FileMPSProject.ProjectDescriptor desc) {
    this.myDescriptor = desc;
    if (getProjectFile() == null) {
      return;
    }
    assert !(isDisposed());
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        readModules(myDescriptor);
        //  TODO FIXME get rid of onModuleLoad 
        for (IModule m : getModules()) {
          m.onModuleLoad();
        }
      }
    });
  }

  public FileMPSProject.ProjectDescriptor getDescriptor() {
    return myDescriptor;
  }

  public static class ProjectDescriptor {
    private String name;
    private List<Path> myModulePaths = new ArrayList<Path>();
    private List<BaseTestConfiguration> myTestConfigs = new ArrayList<BaseTestConfiguration>();

    public ProjectDescriptor(File file) {
      load(file);
    }

    private void load(File projFile) {
      if (projFile == null) {
        return;
      }
      Document document = null;
      try {
        document = JDOMUtil.loadDocument(projFile);
      } catch (JDOMException ex) {
      } catch (IOException ex) {
      }
      Element projectElement = null;
      if (document != null) {
        Element root = document.getRootElement();
        if ("project".equals(root.getName())) {
          for (Object ch : root.getChildren("component")) {
            if (ch instanceof Element && "MPSProject".equals(((Element) ch).getAttributeValue("name"))) {
              projectElement = (Element) ch;
              break;
            }
          }
        }
      }
      if (projectElement != null) {
        load(projFile, projectElement);
      }
    }

    private void load(File file, Element root) {
      Macros macros = MacrosFactory.projectDescriptor();
      FileMPSProject.ProjectDescriptor result_dkknya_a1a1a = this;
      final String result_dkknya_a0a1a1a = file.getName();
      result_dkknya_a1a1a.setName(result_dkknya_a0a1a1a);

      if (root == null) {
        return;
      }

      List<Element> moduleList = ListSequence.fromList(new ArrayList<Element>());
      ListSequence.fromList(moduleList).addSequence(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "projectSolutions")).first(), "solutionPath")));
      ListSequence.fromList(moduleList).addSequence(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "projectLanguages")).first(), "languagePath")));
      ListSequence.fromList(moduleList).addSequence(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "projectDevkits")).first(), "devkitPath")));
      ListSequence.fromList(moduleList).addSequence(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "projectModules")).first(), "modulePath")));
      for (Element moduleElement : ListSequence.fromList(moduleList)) {
        Path modulePath = new Path();
        Path result_dkknya_a1a9a1a1a = modulePath;
        final String result_dkknya_a0a1a9a1a1a = macros.expandPath(moduleElement.getAttributeValue("path"), file);
        result_dkknya_a1a9a1a1a.setPath(result_dkknya_a0a1a9a1a1a);
        final String result_dkknya_a1a1a9a1a1a = moduleElement.getAttributeValue("folder");
        result_dkknya_a1a9a1a1a.setMPSFolder(result_dkknya_a1a1a9a1a1a);
        result_dkknya_a1a1a.addModule(modulePath);
      }

      for (Element e : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "genConfs")).first(), "genConfModels"))) {
        ModelsTestConfiguration tc = new ModelsTestConfiguration();
        tc.setName(e.getAttributeValue("name"));
        for (Element me : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(e, "models")).first(), "model"))) {
          tc.addModel(SModelReference.fromString(me.getAttributeValue("modelRef")));
        }
        result_dkknya_a1a1a.getTestConfiturations().add(tc);
      }
      for (Element e : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "genConfs")).first(), "genConfModule"))) {
        ModuleTestConfiguration tc = new ModuleTestConfiguration();
        tc.setName(e.getAttributeValue("name"));
        if (e.getAttributeValue("moduleRef") != null) {
          tc.setModuleRef(ModuleReference.fromString(e.getAttributeValue("moduleRef")));
          result_dkknya_a1a1a.getTestConfiturations().add(tc);
        }
      }
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public List<Path> getModules() {
      return Collections.unmodifiableList(myModulePaths);
    }

    public void addModule(Path p) {
      myModulePaths.add(p);
    }

    public List<BaseTestConfiguration> getTestConfiturations() {
      return myTestConfigs;
    }
  }
}
