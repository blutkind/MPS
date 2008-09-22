package jetbrains.mps.generator;

import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.util.FileUtil;

import java.io.File;
import java.util.*;

public class ModelGenerationStatusManager {
  private static final Logger LOG = Logger.getLogger(ModelGenerationStatusManager.class);

  public static ModelGenerationStatusManager getInstance() {
    return ApplicationManager.getApplication().getComponent(ModelGenerationStatusManager.class);
  }

  private Map<SModelDescriptor, Long> myLastGenerationTime = new HashMap<SModelDescriptor, Long>();
  private Map<SModelDescriptor, Boolean> myEmptyStatus = new HashMap<SModelDescriptor, Boolean>();
  private Map<SModelDescriptor, Long> myEmptyStatusRetrievalTime = new HashMap<SModelDescriptor, Long>();

  private List<ModelGenerationStatusListener> myListeners = new ArrayList<ModelGenerationStatusListener>();

  public boolean generationRequired(SModelDescriptor sm) {
    if (sm.isPackaged()) {
      return false;
    }

    if (SModelStereotype.JAVA_STUB.equals(sm.getStereotype())) {
      return false;
    }

    if (sm.getModelFile() == null) {
      return false;
    }

    if (Language.isAccessoryModel(sm)) {
      return false;
    }

    if (isEmpty(sm)) {
      return false;
    }

    return sm.lastChangeTime() >= getLastGenerationTime(sm);
  }

  private boolean isEmpty(SModelDescriptor sm) {
    if (myEmptyStatus.containsKey(sm) && myEmptyStatusRetrievalTime.get(sm) >= sm.lastChangeTime()) {
      return myEmptyStatus.get(sm);
    }

    boolean result = sm.isEmpty();
    myEmptyStatus.put(sm, result);
    myEmptyStatusRetrievalTime.put(sm, System.currentTimeMillis());
    return result;
  }

  private long getLastGenerationTime(SModelDescriptor sm) {
    if (!myLastGenerationTime.containsKey(sm)) {
      long lastGenerationTime = calculateLastGenerationTime(sm);
      myLastGenerationTime.put(sm, lastGenerationTime);
    }
    return myLastGenerationTime.get(sm);
  }

  public void invalidateData(SModelDescriptor sm) {
    myLastGenerationTime.remove(sm);
    fireStatusChange(sm);
  }

  public void addGenerationStatusListener(ModelGenerationStatusListener l) {
    myListeners.add(l);
  }

  public void removeGenerationStatusListener(ModelGenerationStatusListener l) {
    myListeners.remove(l);
  }

  private void fireStatusChange(SModelDescriptor sm) {
    for (ModelGenerationStatusListener l : myListeners) {
      l.generationStatusChanged(sm);
    }
  }

  private long calculateLastGenerationTime(SModelDescriptor sm) {
    Set<IModule> modules = sm.getModules();
    if (modules.size() != 1) {
      LOG.warning("model " + sm.getSModelReference() + " has too many owners : " + modules);
    }
    IModule module = modules.iterator().next();
    String outputPath = module.getGeneratorOutputPath();
    String sourcesDir = outputPath + File.separator + sm.getLongName().replace('.', File.separatorChar);
    return FileUtil.getNewestFileTime(new File(sourcesDir));
  }
}