package jetbrains.mps.project;

import jetbrains.mps.generator.GeneratorConfigurationManager;
import jetbrains.mps.generator.JavaNameUtil;
import jetbrains.mps.ide.*;
import jetbrains.mps.ide.command.undo.UndoManager;
import jetbrains.mps.ide.components.EditorsPaneComponent;
import jetbrains.mps.ide.components.ProjectPaneComponent;
import jetbrains.mps.ide.components.UsagesViewComponent;
import jetbrains.mps.modelExecute.ExecutionManager;
import jetbrains.mps.modelExecute.ExecutionPoint;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.semanticModel.Language;
import jetbrains.mps.semanticModel.ModelLocator;
import jetbrains.mps.semanticModel.SModel;
import jetbrains.mps.util.JDOMUtil;
import jetbrains.mps.util.PathManager;
import org.jdom.Document;
import org.jdom.Element;

import java.io.File;
import java.util.*;

/**
 * Author: Sergey Dmitriev
 * Created Apr 29, 2004
 */
public class MPSProject implements ModelLocator {
  private File myProjectFile;
  private File myWorkspaceFile;

  public static final String COMPONENTS = "components";
  public static final String COMPONENT = "component";
  public static final String CLASS = "class";

  private ExecutionPoint myEntryPoint;
  private HashMap<String, Language> myNamespaceToLanguageMap = new HashMap<String, Language>();
  private Map<Class, Object> myComponents = new HashMap<Class, Object>();
  private RootManager myRootManager = new RootManager(this);

  public MPSProject(File file) {
    initComponent();
    myProjectFile = file;
    if (myProjectFile != null) {
      read(myProjectFile);
    }
  }

  private void initComponent() {
    IdeMain ide = IdeMain.instance();

    addComponent(MPSProject.class, this);
    addComponent(IdeMain.class, ide);
    addComponent(ProjectPane.class, ide.getProjectPane());
    addComponent(EditorsPane.class, ide.getEditorsPane());
    addComponent(InspectorPane.class, ide.getInspectorPane());
    addComponent(EditorManager.class, new EditorManager());
    addComponent(UndoManager.class, UndoManager.instance());
    addComponent(EditorsPaneComponent.class, new EditorsPaneComponent(this));
    addComponent(ProjectPaneComponent.class, new ProjectPaneComponent(this));
    addComponent(UsagesViewComponent.class, new UsagesViewComponent(this));
    addComponent(IdeMain.IdeMainComponent.class, new IdeMain.IdeMainComponent(this));
    addComponent(SModelRepository.class, new SModelRepository(this));
    addComponent(ExecutionManager.class, new ExecutionManager());
    addComponent(RootManager.class, myRootManager);
    addComponent(GeneratorConfigurationManager.class, new GeneratorConfigurationManager());
  }

  public List<Object> getComponents() {
    return new ArrayList<Object>(myComponents.values());
  }

  public <T> T getComponent(Class<T> interfaceClass) {
    T result = (T) myComponents.get(interfaceClass);
    if (result == null) throw new RuntimeException("I can't find component " + interfaceClass.getName());
    return result;
  }

  public void addComponent(Class interfaceClass, Object instance) {
    myComponents.put(interfaceClass, instance);
  }

  public void read(File file) {
    myRootManager.read(file);

    if (file.getName().equals("RubyWeb.mpr")) {
      rubyWeb.bibliography.PersistenceUtil.loadRubyWebBibliography(this);
      rubyWeb.patternList.PersistenceUtil.loadRubyWebPatternList(this);
      rubyWeb.paper.PersistenceUtil.loadRubyWebPaper(this);
    }
  }

  public void readComponents() {
    myWorkspaceFile = new File(myProjectFile.getParent(), myProjectFile.getName().replaceAll(".mpr", ".mws"));
    try {
      if (myWorkspaceFile.exists()) {
        Document document = JDOMUtil.loadDocument(myWorkspaceFile);
        Element rootElement = document.getRootElement();
        List<Element> components = rootElement.getChildren(COMPONENT);
        for (Element component : components) {
          try {
            String className = component.getAttributeValue(CLASS);
            Class cls = Class.forName(className);
            if (getComponent(cls) != null && getComponent(cls) instanceof ExternalizableComponent) {
              ((ExternalizableComponent) getComponent(cls)).read(component);
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void saveModels() {
    getModels().saveAll();
  }

  public void save() {
    myRootManager.save(myProjectFile);

    try {
      if (!myWorkspaceFile.exists()) {
        myWorkspaceFile.createNewFile();
      }
      Element root = new Element(COMPONENTS);
      for (Class cls : myComponents.keySet()) {
        Object component = myComponents.get(cls);
        if (component instanceof ExternalizableComponent) {
          Element componentElement = new Element(COMPONENT);
          componentElement.setAttribute(CLASS, cls.getName());
          ((ExternalizableComponent) component).write(componentElement);
          root.addContent(componentElement);
        }
      }
      Document document = new Document(root);
      JDOMUtil.writeDocument(document, myWorkspaceFile);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  public String findPath(String modelFQName) {
    String modelPath = PathManager.findModelPath(myRootManager.getProjectModelRoots(), modelFQName);
    if (modelPath != null && (new File(modelPath)).exists()) {
      return modelPath;
    }
    modelPath = PathManager.findModelPath(myRootManager.getLibraryModelRoots(), modelFQName);
    if (modelPath != null && (new File(modelPath)).exists()) {
      return modelPath;
    }
    modelPath = PathManager.findModelPath(myRootManager.getLanguagesModelRoots(), modelFQName);
    if (modelPath != null && (new File(modelPath)).exists()) {
      return modelPath;
    }
    return null;
  }

  public void setProjectFile(File projectFile) {
    myProjectFile = projectFile;
  }

  public File getProjectFile() {
    return myProjectFile;
  }

  public Iterator<Language> languages() {
    return myNamespaceToLanguageMap.values().iterator();
  }

  public Language getLanguage(String nameSpace) {
    return myNamespaceToLanguageMap.get(nameSpace);
  }

  protected void addLanguage(Language language) {
    myNamespaceToLanguageMap.put(language.getNamespace(), language);
  }

  public SModelRepository getModels() {
    return getComponent(SModelRepository.class);
  }

  public SModel loadModel(String fileName) {
    return getModels().loadModel(fileName, this);
  }

  public boolean isProjectChanged() {
    return getModels().wereChanges();
  }

  public ExecutionPoint getEntryPoint() {
    return myEntryPoint;
  }

  public void setEntryPoint(ExecutionPoint entryPoint) {
    myEntryPoint = entryPoint;
  }

  public ExecutionManager getExecutionManager() {
    return getComponent(ExecutionManager.class);
  }

  public ILanguagePlugin getLanguagePlugin(Language language) {
    SModel languageStructure = language.getStructureModel();
    String packageName = JavaNameUtil.packageNameForLanguageStructure(languageStructure);
    String className = packageName + ".LanguagePlugin";
    try {
      Class pluginClass = Class.forName(className);
      return (ILanguagePlugin) pluginClass.newInstance();
    } catch (ClassNotFoundException e) {
      System.err.println("Language plugin for structure model " + languageStructure.getFQName() + " was not found.");
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    } catch (InstantiationException e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    }
    return null;
  }

  public Language getLanguageByStructureModel(SModel semanticModel) {
    Collection<Language> languages = myNamespaceToLanguageMap.values();
    for (Iterator iterator = languages.iterator(); iterator.hasNext();) {
      Language language = (Language) iterator.next();
      SModel structureModel = language.getStructureModel();
      if (structureModel == semanticModel) {
        return language;
      }
    }
    return null;
  }
}
