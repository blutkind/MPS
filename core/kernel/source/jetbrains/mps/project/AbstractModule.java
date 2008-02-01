package jetbrains.mps.project;

import jetbrains.mps.javastub.classpath.ClassPathModelRootManager;
import jetbrains.mps.ide.BootstrapLanguages;
import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.projectLanguage.structure.*;
import jetbrains.mps.reloading.*;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.smodel.persistence.ModelRootsUtil;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.JarFileEntryFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: Sep 9, 2005
 * Time: 2:17:14 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractModule implements IModule {
  private static final Logger LOG = Logger.getLogger(AbstractModule.class);

  private boolean myModelsRead = false;
  private boolean myInitialized = false;
  protected IFile myDescriptorFile;

  private ModuleScope myScope = new ModuleScope();

  private IClassPathItem myRuntimeClassPathItem;
  private IClassPathItem myJavaStubsClassPathItem;

  private Map<String, Class> myClassesCache = new HashMap<String, Class>();

  //
  // IScope
  //

  public void convert() {

  }

  @NotNull
  public String getModuleUID() {
    return toString();
  }

  @Nullable
  protected Language getLanguage(@NotNull String languageNamespace, @NotNull Set<IModule> modulesToSkip, boolean suppressWarnings) {
    Language language = MPSModuleRepository.getInstance().getLanguage(languageNamespace, BootstrapLanguages.getInstance());
    if (language != null) return language;
    language = getLanguage_internal(languageNamespace, modulesToSkip, this);
    if (language == null && !suppressWarnings) {
      LOG.errorWithTrace("couldn't find language: \"" + languageNamespace + "\" in scope: " + this);
    }
    return language;
  }

  @Nullable
  private static Language getLanguage_internal(String languageNamespace, Set<IModule> processedModules, IModule dependentModule) {
    processedModules.add(dependentModule);
    if (dependentModule instanceof Language && dependentModule.getModuleUID().equals(languageNamespace)) {
      return (Language) dependentModule;
    }
    Language language = MPSModuleRepository.getInstance().getLanguage(languageNamespace, dependentModule);
    if (language != null) {
      return language;
    }

    List<IModule> dependOnModules = dependentModule.getDependOnModules();
    for (IModule module : dependOnModules) {
      if (!(processedModules.contains(module))) {
        language = getLanguage_internal(languageNamespace, processedModules, module);
        if (language != null) break;
      }
    }
    return language;
  }

  @NotNull
  public List<Language> getOwnLanguages() {
    return new LinkedList<Language>(MPSModuleRepository.getInstance().getLanguages(this));
  }


  @NotNull
  public final List<IModule> getOwnModules() {
    return new LinkedList<IModule>(MPSModuleRepository.getInstance().getModules(this));
  }


  /**
   * @return all depends-on modules recursively + bootstrap languages
   */
  @NotNull
  public <T extends IModule> Set<T> getAllDependOnModules(@NotNull Class<T> cls) {
    Set<T> modules = new HashSet<T>();
    collectAllExplicitlyDependOnModules(this, modules, cls);

    // add bootstrap languages
    if (Language.class.isAssignableFrom(cls)) {
      Set<Language> languages = BootstrapLanguages.getInstance().getLanguages();
      for (Language language : languages) {
        //noinspection SuspiciousMethodCalls
        if (!modules.contains(language)) {
          modules.add((T) language);
          collectAllExplicitlyDependOnModules(language, modules, cls);
        }
      }
    }

    return modules;
  }

  private static <T extends IModule> void collectAllExplicitlyDependOnModules(
          @NotNull IModule dependentModule,
          @NotNull Set<T> modules,
          @NotNull Class<T> cls) {
    List<IModule> dependOnModules = dependentModule.getExplicitlyDependOnModules();
    for (IModule dependOnModule : dependOnModules) {
      //noinspection SuspiciousMethodCalls
      if (cls.isInstance(dependOnModule) && !modules.contains(dependOnModule)) {
        modules.add((T) dependOnModule);
        collectAllExplicitlyDependOnModules(dependOnModule, modules, cls);
      }
    }
  }

  @NotNull
  public List<SModelDescriptor> getOwnModelDescriptors() {
    List<SModelDescriptor> modelDescriptors = SModelRepository.getInstance().getModelDescriptors(this);
    return modelDescriptors;
  }

  public SModelDescriptor getModelDescriptor(SModelUID uid) {
    return SModelRepository.getInstance().getModelDescriptor(uid, this);
  }


  public IFile getClassesGen() {
    if (getDescriptorFile() == null) {
      return null;
    }
    return getDescriptorFile().getParent().child("classes_gen");
  }

  //
  // AbstractModule
  //
  @NotNull
  public final List<ModelRoot> getModelRoots() {
    List<ModelRoot> result = new ArrayList<ModelRoot>();

    result.addAll(getNonDefaultModelRoots());

    return result;
  }

  @NotNull
  public List<ModelRoot> getNonDefaultModelRoots() {
    return CollectionUtil.iteratorAsList(getModuleDescriptor().modelRoots());
  }

  public List<Dependency> getDependencies() {
    List<Dependency> result = new ArrayList<Dependency>();
    if (getModuleDescriptor() != null) {
      for (ModuleReference ref : getModuleDescriptor().getDependencys()) {
        result.add(new Dependency(ref.getName(), ref.getReexport()));
      }
    }
    return result;
  }

  /**
   * g @return all modules which this explicitly and immediately depends on,
   * i.e. without bootstrap languages, if such a dependency is not explicitly set in module roots
   */
  @NotNull
  public List<IModule> getExplicitlyDependOnModules() {
    LinkedList<IModule> result = new LinkedList<IModule>(getOwnModules());

    for (Dependency dep : getDependencies()) {
      IModule m = MPSModuleRepository.getInstance().getModuleByUID(dep.getModuleUID());
      if (m != null) {
        result.add(m);
      } else {
        LOG.error("Can't load module " + dep.getModuleUID() + " from " + this);
      }
    }

    return result;
  }

  @NotNull
  public List<String> getUsedLanguagesNamespaces() {
    List<String> result = new ArrayList<String>();
    if (getModuleDescriptor() != null) {
      for (LanguageReference lr : getModuleDescriptor().getUsedLanguages()) {
        result.add(lr.getName());
      }
    }
    return result;
  }

  @NotNull
  public List<Language> getUsedLanguages() {
    List<Language> result = new ArrayList<Language>();
    for (String namespace : getUsedLanguagesNamespaces()) {
      Language l = MPSModuleRepository.getInstance().getLanguage(namespace);
      if (l != null) {
        result.add(l);
      } else {
        LOG.error("Can't load language " + l + " from " + this);
      }
    }
    return result;
  }

  /**
   * @return all modules which this immediately depends on, bootstrap languages in their number.
   */
  @NotNull
  public final List<IModule> getDependOnModules() {
    return appendBootstrapLanguages(getExplicitlyDependOnModules());
  }

  @NotNull
  protected static List<IModule> appendBootstrapLanguages(@NotNull List<IModule> list) {
    Set<Language> languages = BootstrapLanguages.getInstance().getLanguages();
    for (Language language : languages) {
      if (!list.contains(language)) {
        list.add(language);
      }
    }
    return list;
  }

  public void registerModelDescriptor(@NotNull SModelDescriptor modelDescriptor) {
    SModelRepository.getInstance().registerModelDescriptor(modelDescriptor, this);
  }

  public void unRegisterModelDescriptor(@NotNull SModelDescriptor modelDescriptor) {
    SModelRepository.getInstance().unRegisterModelDescriptor(modelDescriptor, this);
  }

  @NotNull
  public SModelDescriptor createModel(@NotNull SModelUID uid, @NotNull ModelRoot root) {
    IModelRootManager manager = ModelRootsUtil.getManagerFor(root);

    if (!manager.isNewModelsSupported()) {
      LOG.error("Trying to create model root manager in root which doesn't support new models");
    }

    return manager.createNewModel(root, uid, this);
  }

  public IFile getDescriptorFile() {
    return myDescriptorFile;
  }

  public IScope getScope() {
    return myScope;
  }


  public void readModels() {
    if (!myModelsRead) {
      myModelsRead = true;
      for (IModule im : MPSModuleRepository.getInstance().getModules(this)) {
        im.readModels();
      }

      for (ModelRoot modelRoot : getModelRoots()) {
        try {
          IModelRootManager manager = ModelRootsUtil.getManagerFor(modelRoot);
          manager.read(modelRoot, this);
        } catch (Exception e) {
          LOG.error("Error loading models from root: prefix: \"" + modelRoot.getPrefix() + "\" path: \"" + modelRoot.getPath() + "\". Requested by: " + this, e);
        }
      }

      myInitialized = true;
    }
  }

  @NotNull
  public List<String> getClassPath() {
    ArrayList<String> result = new ArrayList<String>();

    if (getModuleDescriptor() != null) {
      for (ClassPathEntry entry : CollectionUtil.iteratorAsIterable(getModuleDescriptor().classPathEntrys())) {
        result.add(entry.getPath());
      }
    }

    return result;
  }

  @NotNull
  public List<String> getRuntimeClassPathItems() {
    ArrayList<String> result = new ArrayList<String>();

    if (getModuleDescriptor() != null) {
      for (ClassPathEntry entry : CollectionUtil.iteratorAsIterable(getModuleDescriptor().runtimeClassPathEntrys())) {
        result.add(entry.getPath());
      }
    }

    if (BootstrapLanguages.getInstance().getLanguagesUIDsUsedInCore().contains(getModuleUID())) {
      result.add(ClassLoaderManager.getInstance().getBaseMPSPath());
    }

    if (getClassesGen() != null) {
      result.add(getClassesGen().getPath());
    }

    return result;
  }

  public List<String> getRuntimePackages() {
    List<String> result = new ArrayList<String>();
    collectPackages(result, "");
    return result;
  }

  public List<String> getSourcePaths() {
    List<String> result = new ArrayList<String>();
    for (SourcePath p : getModuleDescriptor().getSourcePaths()) {
      result.add(p.getPath());
    }
    result.add(getGeneratorOutputPath());
    return result;
  }

  protected void collectPackages(List<String> result, String current) {
    if (!"".equals(current)) {
      result.add(current);
    }
    for (String subpack : getRuntimeClasspath().getSubpackages(current)) {
      collectPackages(result, subpack);
    }
  }

  protected void rereadModels() {
    myModelsRead = false;
    myInitialized = false;
    readModels();
  }

  protected boolean isInitialized() {
    return myInitialized;
  }

  protected void fireModuleInitialized() {
    MPSModuleRepository.getInstance().fireModuleInitialized(this);
  }

  /**
   * Call this method after you have set module descriptor
   */
  public void updateRuntimeClassPath() {
    CompositeClassPathItem result = new CompositeClassPathItem();
    for (String s : getRuntimeClassPathItems()) {
      if (!new File(s).exists()) {
        if (!s.equals(getClassesGen().getPath())) {
          LOG.error("Classpath item doesn't exist " + s);
        }
        continue;
      }

      if (s.equals(ClassLoaderManager.getInstance().getBaseMPSPath())) {
        result.add(ClassLoaderManager.getInstance().getMPSPath());
      } else if (new File(s).isDirectory()) {
        result.add(new FileClassPathItem(s));
      } else {
        result.add(new JarFileClassPathItem(s));
      }
    }

    myRuntimeClassPathItem = result;
  }

  public IClassPathItem getRuntimeClasspath() {
    return myRuntimeClassPathItem;
  }

  public Class getClass(String fqName) {
    if (myClassesCache.containsKey(fqName)) {
      return myClassesCache.get(fqName);
    }

    Class result = ClassLoaderManager.getInstance().getClassFor(this, fqName);
    myClassesCache.put(fqName, result);
    return result;
  }

  public void reloadStubs() {
    updateClassPathItem();
    releaseJavaStubs();
    loadNewStubs();
  }

  private void updateClassPathItem() {
    CompositeClassPathItem result = new CompositeClassPathItem();
    for (String s : getClassPath()) {
      File file = new File(s);
      if (!file.exists()) {
        LOG.error("Can't load class path item " + s + " in " + this);
      } else {
        IClassPathItem currentItem;
        if (file.isDirectory()) {
          currentItem = new FileClassPathItem(s);
        } else {
          currentItem = new JarFileClassPathItem(s);
        }

        result.add(currentItem);
      }
    }

    myJavaStubsClassPathItem = result;
  }

  private void releaseJavaStubs() {
    for (SModelDescriptor sm : SModelRepository.getInstance().getModelDescriptors(this)) {
      if (SModelStereotype.JAVA_STUB.equals(sm.getStereotype())) {
        SModelRepository.getInstance().unRegisterModelDescriptor(sm, this);
      }
    }
  }

  private void loadNewStubs() {
    loadJavaStubModelRoots();

    ClassPathModelRootManager manager = new ClassPathModelRootManager() {
      protected IClassPathItem getClassPathItem() {
        return myJavaStubsClassPathItem;
      }
    };

    SModel sm = new SModel();
    sm.setLoading(true);

    ModelRoot mr = ModelRoot.newInstance(sm);
    mr.setPrefix("");

    manager.read(mr, this);
  }

  private void loadJavaStubModelRoots() {
    for (ModelRoot mr : getModelRoots()) {
      IModelRootManager m = ModelRootsUtil.getManagerFor(mr);
      if (m instanceof ClassPathModelRootManager) {
        m.read(mr, this);
      }
    }
  }

  public IClassPathItem getJavaStubsClassPathItem() {
    return myJavaStubsClassPathItem;
  }

  public IClassPathItem getModuleWithDependenciesClassPathItem() {
    CompositeClassPathItem item = new CompositeClassPathItem();
    for (IModule m : getScope().getVisibleModules()) {
      for (String s : ((AbstractModule) m).getClassPath()) {
        IClassPathItem classPathItem = createClassPathItem(s);
        if (classPathItem != null) {
          item.add(classPathItem);
        }
      }
    }

    for (Language l : getScope().getVisibleLanguages()) {
      for (String s : l.getClassPath()) {
        IClassPathItem classPathItem = createClassPathItem(s);
        if (classPathItem != null) {
          item.add(classPathItem);
        }
      }
    }

    return item;
  }

  private IClassPathItem createClassPathItem(String s) {
    File f = new File(s);
    IClassPathItem classPathItem = null;
    if (f.exists()) {
      if (f.isDirectory()) {
        classPathItem = new FileClassPathItem(s);
      } else {
        classPathItem = new JarFileClassPathItem(s);
      }
    }
    return classPathItem;
  }

  public File getBundleHome() {
    IFile descriptorFile = getDescriptorFile();

    if (descriptorFile != null) {
      if (descriptorFile instanceof JarFileEntryFile) {
        return ((JarFileEntryFile) descriptorFile).getJarFile();
      }

      return FileSystem.toFile(descriptorFile.getParent());
    }


    return null;
  }

  public String generateManifest() {
    StringBuilder result = new StringBuilder();
    result.append("Manifest-Version: 1.0\n");
    result.append("Bundle-ManifestVersion: 2\n");
    result.append("Bundle-SymbolicName: ").append(getModuleUID()).append("\n");
    result.append("Eclipse-LazyStart: true\n");
    result.append("Require-Bundle: \n").append(getRequiredBundlesString());
    if (getClassPathString().length() > 0) {
      result.append("Bundle-Classpath: \n").append(getClassPathString());
    }
    if (getExportedPackagesString().length() > 0) {
      result.append("Export-Package:\n").append(getExportedPackagesString());
    }

    if (getDescriptorFile() != null) {
      result.append("MPS-Module-File:").append(getDescriptorFile().getName()).append("\n");
    }

    return result.toString();
  }

  public boolean isCompileInMPS() {
    return getModuleDescriptor().getCompileInMPS();
  }

  protected String getRequiredBundlesString() {
    StringBuilder result = new StringBuilder();

    Map<String, Boolean> requiredBundles = new LinkedHashMap<String, Boolean>();
    for (Dependency dep : getRequiredBundles()) {
      if (!requiredBundles.containsKey(dep.getModuleUID())) {
        requiredBundles.put(dep.getModuleUID(), dep.isREExport());
      } else {
        boolean oldValue = requiredBundles.get(dep.getModuleUID());
        requiredBundles.put(dep.getModuleUID(), dep.isREExport() || oldValue);
      }
    }

    List<String> bundleUids = new ArrayList<String>(requiredBundles.keySet());
    for (int i = 0; i < bundleUids.size(); i++) {
      String uid = bundleUids.get(i);
      boolean reexport = requiredBundles.get(uid);
      result.append("  ").append(uid);
      if (reexport) {
        result.append(";visibility:=reexport");
      }
      if (i != bundleUids.size() - 1) {
        result.append(",");
      }
      result.append("\n");
    }

    return result.toString();
  }

  private List<Dependency> getRequiredBundles() {
    List<Dependency> result = new ArrayList<Dependency>();
    result.add(new Dependency("jetbrains.mps", false));

    for (String s : BootstrapLanguages.getInstance().getLanguagesUIDsUsedInCore()) {
      result.add(new Dependency(s, false));
    }

    result.addAll(getDependencies());

    OSGiOptions osgiOptions = getModuleDescriptor().getOsgiOptions();
    if (osgiOptions != null) {
      for (BundleReference br : osgiOptions.getRequiredBundles()) {
        result.add(new Dependency(br.getName(), false));
      }
    }

    return result;
  }

  private String getClassPathString() {
    StringBuilder result = new StringBuilder();

    IFile descriptor = getDescriptorFile();
    if (descriptor == null) {
      return "";
    }

    String basePath = descriptor.getParent().getCanonicalPath();
    for (int i = 0; i < getRuntimeClassPathItems().size(); i++) {
      String s = getRuntimeClassPathItems().get(i);

      if (new File(s).isDirectory()) {
        s += "/";
      }

      String relativePath = getPathRelativeTo(s, basePath);
      relativePath = relativePath.replace(File.separatorChar, '/');
      result.append("  ").append(relativePath);
      if (i != getRuntimeClassPathItems().size() - 1) {
        result.append(",");
      }
      result.append("\n");
    }
    return result.toString();
  }

  private String getExportedPackagesString() {
    StringBuilder result = new StringBuilder();
    List<String> packs = getExportedPackages();
    for (int i = 0; i < packs.size(); i++) {
      String s = getExportedPackages().get(i);
      result.append("  ").append(s);
      if (i != packs.size() - 1) {
        result.append(",");
      }
      result.append("\n");
    }
    return result.toString();
  }

  protected List<String> getExportedPackages() {
    List<String> result = new ArrayList<String>();
    OSGiOptions osgiOptions = getModuleDescriptor().getOsgiOptions();
    if (osgiOptions != null) {
      for (PackageReference pr : osgiOptions.getExportedPackages()) {
        result.add(pr.getName());
      }
    }
    return result;
  }

  private String getPathRelativeTo(String path, String base) {
    if (path.startsWith(base)) {
      return path.substring(base.length());
    }

    String relativeToParent = getPathRelativeTo(path, new File(base).getParent());

    if (relativeToParent.startsWith(File.separator)) {
      return ".." + relativeToParent;
    } else {
      return ".." + File.separator + relativeToParent;
    }
  }

  public void addModuleImprot(final String moduleUID) {
    CommandProcessor.instance().executeCommand(new Runnable() {
      public void run() {
        ModuleDescriptor md = getModuleDescriptor();

        for (ModuleReference r : md.getDependencys()) {
          if (moduleUID.equals(r.getName())) {
            return;
          }
        }

        ModuleReference ref = ModuleReference.newInstance(md.getModel());
        ref.setName(moduleUID);
        md.addDependency(ref);

        setModuleDescriptor(md);

        save();
      }
    });
  }

  public void createManifest() {
    String manifestContents = generateManifest();

    File bundleHome = getBundleHome();

    assert bundleHome != null;

    if (bundleHome.isFile()) { //i.e. packaged      
      return;
    }


    File metaInfDir = new File(bundleHome, "META-INF");

    metaInfDir.mkdir();

    File manifest = new File(metaInfDir, "MANIFEST.MF");

    FileUtil.write(manifest, manifestContents);
  }

  public void invalidateCaches() {
    myScope.invalidateCaches();
    myClassesCache.clear();    
  }

  //TODO: make private (was made visible for usages view to save view scope by Mihail Muhin)
  public class ModuleScope extends BaseScope {
    public ModelOwner getModelOwner() {
      return AbstractModule.this;
    }

    protected Set<IModule> getInitialModules() {
      Set<IModule> result = new HashSet<IModule>();
      result.add(AbstractModule.this);
      return result;
    }

    protected Set<Language> getInitialUsedLanguages() {
      return new HashSet<Language>(getUsedLanguages());
    }

    public String toString() {
      return "Scope of module " + AbstractModule.this;
    }
  }
}
