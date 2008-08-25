package jetbrains.mps.project;

import jetbrains.mps.projectLanguage.structure.ModelRoot;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.smodel.persistence.ModelRootsUtil;
import jetbrains.mps.smodel.persistence.DefaultModelRootManager;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;

public class SModelRoot {
  private static final Logger LOG = Logger.getLogger(SModelRoot.class);

  private ModelRoot myModelRoot;
  private IModelRootManager myManager;

  public SModelRoot(ModelRoot root) {
    myModelRoot = root;
    myManager = createManager();
  }

  private IModelRootManager createManager() {
    if (myModelRoot.getHandlerClass() == null) return new DefaultModelRootManager();
    String fqName = myModelRoot.getHandlerClass();
    try {
      Class cls = Class.forName(fqName);
      return (IModelRootManager) cls.newInstance();
    } catch (Exception e) {
      LOG.error(e);
      return IModelRootManager.NULL_MANAGER;
    }
  }

  public IModelRootManager getManager() {
    return myManager;
  }

  public ModelRoot getModelRoot() {
    return myModelRoot;
  }

  public void dispose() {
    
  }
}
