package jetbrains.mps.lang.dataFlow;

/*Generated by MPS */

import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.MPSModuleRepository;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.reloading.ReloadAdapter;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.LanguageAspect;
import com.intellij.openapi.application.ApplicationManager;

public class DataFlowManager implements ApplicationComponent {
  private static Logger LOG = Logger.getLogger(DataFlowManager.class);

  private ClassLoaderManager myClassLoaderManager;
  private MPSModuleRepository myModuleRepository;
  private Map<String, DataFlowBuilder> myBuilders = new HashMap<String, DataFlowBuilder>();
  private boolean myLoaded = false;
  private ReloadAdapter myReloadHandler = new ReloadAdapter() {
    public void unload() {
      DataFlowManager.this.clear();
    }
  };

  public DataFlowManager(ClassLoaderManager manager, MPSModuleRepository repo) {
    this.myClassLoaderManager = manager;
    this.myModuleRepository = repo;
  }

  public void initComponent() {
    this.myClassLoaderManager.addReloadHandler(this.myReloadHandler);
  }

  @NotNull
  public String getComponentName() {
    return "Data Flow Manager";
  }

  public void disposeComponent() {
    this.myClassLoaderManager.removeReloadHandler(this.myReloadHandler);
  }

  public void register(String conceptFqName, DataFlowBuilder builder) {
    this.myBuilders.put(conceptFqName, builder);
  }

  public Program buildProgramFor(SNode node) {
    checkLoaded();
    return new MPSProgramBuilder(this).buildProgram(node);
  }

  /*package*/ DataFlowBuilder getBuilderFor(String conceptName) {
    checkLoaded();
    return this.myBuilders.get(conceptName);
  }

  private void clear() {
    this.myBuilders.clear();
    myLoaded = false;
  }

  private void checkLoaded() {
    if (myLoaded) {
      return;
    }
    myLoaded = true;
    this.load();
  }

  private void load() {
    for (Language l : this.myModuleRepository.getAllLanguages()) {
      SModelDescriptor dfaModel = LanguageAspect.DATA_FLOW.get(l);
      if (dfaModel != null && !(dfaModel.getSModel().rootsCount()==0)) {
        String dfaBuildersClassName = dfaModel.getLongName() + ".DFABuilders";
        Class<? extends DataFlowBuilders> buildersClass = l.getClass(dfaBuildersClassName);
        if (buildersClass != null) {
          DataFlowBuilders builders = null;
          try {
            builders = buildersClass.newInstance();
            builders.install(this);
          } catch (Throwable t) {
            LOG.error(t);
          }
        }
      }
    }
  }

  public static DataFlowManager getInstance() {
    return ApplicationManager.getApplication().getComponent(DataFlowManager.class);
  }
}
