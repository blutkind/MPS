package jetbrains.mps.smodel;

import jetbrains.mps.component.Dependency;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.ApplicationComponents;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.event.SModelCommandListener;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.WeakSet;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.ide.command.CommandKind;

import javax.swing.*;
import java.util.*;

public class SModelRepository extends SModelAdapter {
  private static final Logger LOG = Logger.getLogger(SModelRepository.class);

  private Set<SModelDescriptor> myModelDescriptors = new HashSet<SModelDescriptor>();
  private Map<SModelDescriptor, Long> myChangedModels = new HashMap<SModelDescriptor, Long>();
  private Map<SModelUID, SModelDescriptor> myUIDToModelDescriptorMap = new HashMap<SModelUID, SModelDescriptor>();
  private Set<SModelDescriptor> myModelsWithNoOwners = new HashSet<SModelDescriptor>();
  private List<SModelRepositoryListener> mySModelRepositoryListeners = new ArrayList<SModelRepositoryListener>();
  private WeakSet<SModelRepositoryListener> myWeakSModelRepositoryListeners = new WeakSet<SModelRepositoryListener>();

  private Map<SModelDescriptor, Set<ModelOwner>> myModelToOwnerMap = new HashMap<SModelDescriptor, Set<ModelOwner>>();
  private Map<ModelOwner, Set<SModelDescriptor>> myOwnerToModelMap = new HashMap<ModelOwner, Set<SModelDescriptor>>();

  private MPSModuleRepository myModuleRepository;

  private Map<String, List<SModelCommandListener>> myCommandListeners = new HashMap<String, List<SModelCommandListener>>();
  private Map<ILanguageModelListenerOwner, List<SModelCommandListener>> myOwnersToListeners = new HashMap<ILanguageModelListenerOwner, List<SModelCommandListener>>();

  private BackgroundModelLoader myBackgroundLoader = new BackgroundModelLoader(this);

  private boolean myInChangedModelsReloading = false;

  private SModelCommandListener myListener = new SModelCommandListener() {
    public void eventsHappenedInCommand(List<SModelEvent> events) {
      someModelChangedInCommand(events);
    }
  };

  public SModelRepository() {
  }

  @Dependency
  public void setModuleRepository(MPSModuleRepository moduleRepository) {
    myModuleRepository = moduleRepository;
  }

  public static SModelRepository getInstance() {
    return ApplicationComponents.getInstance().getComponent(SModelRepository.class);
  }

  public void registerLanguageModelListener(String language, SModelCommandListener listener, ILanguageModelListenerOwner owner) {
    if (myCommandListeners.get(language) == null) {
      myCommandListeners.put(language, new ArrayList<SModelCommandListener>());
    }

    myCommandListeners.get(language).add(listener);


    if (myOwnersToListeners.get(owner) == null) {
      myOwnersToListeners.put(owner, new ArrayList<SModelCommandListener>());
    }

    myOwnersToListeners.get(owner).add(listener);
  }

  public void unregisterLanguageModelListeners(ILanguageModelListenerOwner owner) {
    if (myOwnersToListeners.get(owner) == null) {
      return;
    }

    List<SModelCommandListener> listeners = myOwnersToListeners.get(owner);

    for (List<SModelCommandListener> list : myCommandListeners.values()) {
      list.removeAll(listeners);
    }

    myOwnersToListeners.remove(owner);
  }

  private void someModelChangedInCommand(List<SModelEvent> events) {
    if (events.size() == 0) return;
    SModelDescriptor model = events.get(0).getModel().getModelDescriptor();
    for (String language : model.getSModel().getLanguageNamespaces(GlobalScope.getInstance())) {
      List<SModelCommandListener> listeners = myCommandListeners.get(language);
      if (listeners != null) {
        for (SModelCommandListener l : listeners) {
          try {
            l.eventsHappenedInCommand(Collections.unmodifiableList(events));
          } catch (Throwable t) {
            LOG.error(t);
          }
        }
      }
    }
  }

  public void refreshModels() {
    LOG.debug("Model refresh");
    for (SModelDescriptor m : new ArrayList<SModelDescriptor>(myUIDToModelDescriptorMap.values())) {
      m.refresh();
    }
    LOG.debug("Model refresh done");
  }

  public boolean containsModelWithFile(IFile modelFile) {
    return findModel(modelFile) != null;
  }

  public SModelDescriptor findModel(IFile modelFile) {
    String canonicalPath = modelFile.getCanonicalPath();

    for (SModelDescriptor model : getAllModelDescriptors()) {
      if (model.getModelFile() == null) continue;

      String modelCanonicalPath = model.getModelFile().getCanonicalPath();
      if (canonicalPath.equals(modelCanonicalPath)) return model;
    }

    return null;
  }

  public void addModelRepositoryListener(SModelRepositoryListener l) {
    mySModelRepositoryListeners.add(l);
  }

  public void addWeakModelRepositoryListener(SModelRepositoryListener l) {
    myWeakSModelRepositoryListeners.add(l);
  }

  public void removeModelRepositoryListener(SModelRepositoryListener l) {
    mySModelRepositoryListeners.remove(l);
    myWeakSModelRepositoryListeners.remove(l);
  }

  private List<SModelRepositoryListener> listeners() {
    List<SModelRepositoryListener> result = new ArrayList<SModelRepositoryListener>();
    result.addAll(mySModelRepositoryListeners);
    result.addAll(myWeakSModelRepositoryListeners);
    return result;
  }

  public List<SModelDescriptor> getAllModelDescriptors() {
    return new ArrayList<SModelDescriptor>(myModelDescriptors);
  }

  public List<SModelDescriptor> getModelDescriptorsByModelName(String modelName) {
    List<SModelDescriptor> result = new ArrayList<SModelDescriptor>();
    for (SModelDescriptor d : getAllModelDescriptors()) {
      if (modelName.equals(d.getLongName())) {
        result.add(d);
      }
    }
    return result;
  }

  public void addOwnerForDescriptor(SModelDescriptor modelDescriptor, ModelOwner owner) {
    Set<ModelOwner> owners = myModelToOwnerMap.get(modelDescriptor);
    if (owners == null) {
      owners = new HashSet<ModelOwner>();
      myModelToOwnerMap.put(modelDescriptor, owners);
    }
    owners.add(owner);

    Set<SModelDescriptor> descriptors = myOwnerToModelMap.get(owner);
    if (descriptors == null) {
      descriptors = new LinkedHashSet<SModelDescriptor>();
      myOwnerToModelMap.put(owner, descriptors);
    }
    descriptors.add(modelDescriptor);

    myUIDToModelDescriptorMap.put(modelDescriptor.getModelUID(), modelDescriptor);
    myModelsWithNoOwners.remove(modelDescriptor);

    fireModelOwnerAdded(modelDescriptor, owner);
  }

  public boolean isRegisteredModelDescriptor(SModelDescriptor modelDescriptor, ModelOwner owner) {
    Set<ModelOwner> owners = myModelToOwnerMap.get(modelDescriptor);
    return owners != null && owners.contains(owner);
  }

  public void registerModelDescriptor(SModelDescriptor modelDescriptor, ModelOwner owner) {
    SModelUID modelUID = modelDescriptor.getModelUID();
    SModelDescriptor registeredModel = myUIDToModelDescriptorMap.get(modelUID);
    LOG.assertLog(registeredModel == null || registeredModel == modelDescriptor,
            "Another model \"" + modelUID + "\" is already registered!");

    Set<ModelOwner> owners = myModelToOwnerMap.get(modelDescriptor);
    LOG.assertLog(owners == null ||
            !owners.contains(owner),
            "Another model \"" + modelUID + "\" is already registered!");
    myUIDToModelDescriptorMap.put(modelUID, modelDescriptor);
    myModelDescriptors.add(modelDescriptor);
    if (owners == null) {
      owners = new HashSet<ModelOwner>();
      myModelToOwnerMap.put(modelDescriptor, owners);
    }

    Set<SModelDescriptor> descriptors = myOwnerToModelMap.get(owner);
    if (descriptors == null) {
      descriptors = new LinkedHashSet<SModelDescriptor>();
      myOwnerToModelMap.put(owner, descriptors);
    }
    descriptors.add(modelDescriptor);

    myModelsWithNoOwners.remove(modelDescriptor);
    owners.add(owner);
    modelDescriptor.addWeakModelListener(this);
    modelDescriptor.addModelCommandListener(myListener);
    fireModelAdded(modelDescriptor);
  }

  public void unRegisterModelDescriptor(SModelDescriptor modelDescriptor, ModelOwner owner) {
    Set<ModelOwner> modelOwners = myModelToOwnerMap.get(modelDescriptor);
    if (modelOwners != null && modelOwners.contains(owner)) {
      modelOwners.remove(owner);
      if (modelOwners.isEmpty()) {
        myModelsWithNoOwners.add(modelDescriptor);
      }
    }

    Set<SModelDescriptor> ownModels = myOwnerToModelMap.get(owner);
    if (ownModels != null) {
      ownModels.remove(modelDescriptor);
      if (ownModels.isEmpty()) {
        myOwnerToModelMap.remove(owner);
      }
    }

    fireModelOwnerRemoved(modelDescriptor, owner);
  }

  public void unRegisterModelDescriptors(ModelOwner owner) {
    for (SModelUID uid : new HashMap<SModelUID, SModelDescriptor>(myUIDToModelDescriptorMap).keySet()) {
      SModelDescriptor modelDescriptor = myUIDToModelDescriptorMap.get(uid);
      unRegisterModelDescriptor(modelDescriptor, owner);
    }
  }

  public void removeModelDescriptor(SModelDescriptor modelDescriptor) {
    Set<ModelOwner> owners = myModelToOwnerMap.get(modelDescriptor);
    if (owners != null) {
      for (ModelOwner owner : owners) {
        Set<SModelDescriptor> models = myOwnerToModelMap.get(owner);
        models.remove(modelDescriptor);
        if (models.isEmpty()) {
          myOwnerToModelMap.remove(owner);
        }
      }
    }
    myModelToOwnerMap.remove(modelDescriptor);

    myModelDescriptors.remove(modelDescriptor);
    myUIDToModelDescriptorMap.remove(modelDescriptor.getModelUID());
    myChangedModels.remove(modelDescriptor);
    myModelToOwnerMap.remove(modelDescriptor);
    myModelsWithNoOwners.remove(modelDescriptor);
    fireModelRemoved(modelDescriptor);
//    modelDescriptor.removeModelListener(this);
    modelDescriptor.dispose();

  }

  public void removeUnusedDescriptors() {
    List<SModelDescriptor> descriptorsToRemove = new ArrayList<SModelDescriptor>();
    for (SModelDescriptor descriptor : new ArrayList<SModelDescriptor>(myModelsWithNoOwners)) {
      Set<ModelOwner> modelOwners = myModelToOwnerMap.get(descriptor);
      if (modelOwners == null || modelOwners.isEmpty()) {
        descriptorsToRemove.add(descriptor);
      } else {
        myModelsWithNoOwners.remove(descriptor);
      }
    }

    if (descriptorsToRemove.size() > 0) {
      for (SModelDescriptor descriptor : descriptorsToRemove) {
        removeModelDescriptor(descriptor);
      }
    }
  }

  public SModelDescriptor getModelDescriptor(SModel model) {
    return myUIDToModelDescriptorMap.get(model.getUID());
  }

  public SModelDescriptor getModelDescriptor(SModelUID modelUID) {
    return myUIDToModelDescriptorMap.get(modelUID);
  }

  public SModelDescriptor getModelDescriptor(SModelUID modelUID, ModelOwner owner) {
    SModelDescriptor descriptor = myUIDToModelDescriptorMap.get(modelUID);
    if (descriptor == null) {
      return null;
    }
    Set<ModelOwner> modelOwners = myModelToOwnerMap.get(descriptor);
    if (modelOwners.contains(owner)) {
      return descriptor;
    }
    return null;
  }

  public List<SModelDescriptor> getModelDescriptors(String modelName, ModelOwner owner) {
    List<SModelDescriptor> result = new ArrayList<SModelDescriptor>();
    for (SModelDescriptor descriptor : getModelDescriptors(owner)) {
      if (modelName.equals(descriptor.getLongName())) {
        result.add(descriptor);
      }
    }
    return result;
  }

  public List<SModelDescriptor> getModelDescriptors(ModelOwner modelOwner) {
    Set<SModelDescriptor> result = myOwnerToModelMap.get(modelOwner);
    if (result == null) {
      return new ArrayList<SModelDescriptor>();
    }
    return new ArrayList<SModelDescriptor>(result);
  }

  public void modelChanged(SModel model) {
    markChanged(model);
  }

  public void modelChangedDramatically(SModel model) {
    markChanged(model);
  }

  private void markChanged(SModel model, boolean changed) {
    SModelDescriptor modelDescriptor = myUIDToModelDescriptorMap.get(model.getUID());
    if (modelDescriptor != null) { //i.e project model
      markChanged(modelDescriptor, changed);
    }
  }

  public void markChanged(SModel model) {
    markChanged(model, true);
  }

  public void markUnchanged(SModel model) {
    markChanged(model, false);
  }

  public void renameUID(SModelDescriptor modelDescriptor, SModelUID newModelUID) {
    boolean contains0 = myUIDToModelDescriptorMap.containsKey(modelDescriptor.getModelUID());
    myUIDToModelDescriptorMap.remove(modelDescriptor.getModelUID());
    boolean contains1 = myModelDescriptors.contains(modelDescriptor);
    myModelDescriptors.remove(modelDescriptor);
    Long aLong = myChangedModels.get(modelDescriptor);
    myChangedModels.remove(modelDescriptor);
    Set<ModelOwner> owners = myModelToOwnerMap.get(modelDescriptor);
    myModelToOwnerMap.remove(modelDescriptor);
    boolean contains2 = myModelsWithNoOwners.contains(modelDescriptor);
    myModelsWithNoOwners.remove(modelDescriptor);

    if (modelDescriptor instanceof DefaultSModelDescriptor) {
      ((DefaultSModelDescriptor) modelDescriptor).changeSModelUID(newModelUID);
    }

    if (contains0) {
      myUIDToModelDescriptorMap.put(newModelUID, modelDescriptor);
    }
    if (contains1) {
      myModelDescriptors.add(modelDescriptor);
    }
    if (aLong != null) {
      myChangedModels.put(modelDescriptor, aLong);
    }
    myModelToOwnerMap.put(modelDescriptor, owners);
    if (contains2) {
      myModelsWithNoOwners.add(modelDescriptor);
    }

    markChanged(modelDescriptor, true);
    fireModelRenamed(modelDescriptor);
  }

  public void markChanged(SModelDescriptor descriptor, boolean b) {
    if (!myModelDescriptors.contains(descriptor)) {
      return;
    }

    if (b) {
      myChangedModels.put(descriptor, System.currentTimeMillis());
    } else {
      myChangedModels.remove(descriptor);
    }
  }

  public boolean isChanged(SModel model) {
    for (SModelDescriptor m : myChangedModels.keySet()) {
      if (m.getSModel() == model) return true;
    }
    return false;
  }

  public boolean isChanged(SModelDescriptor descriptor) {
    return myChangedModels.keySet().contains(descriptor);
  }

  public long getLastChangeTime(SModelDescriptor descriptor) {
    if (myChangedModels.containsKey(descriptor)) {
      return myChangedModels.get(descriptor);
    } else if (descriptor != null) {
      return descriptor.timestamp();
    } else {
      return 0;
    }
  }


  public <T extends MPSModuleOwner & ModelOwner> List<SModelDescriptor> getChangedModelsReleasedWhenReleasingOwner(T owner) {
    Set<SModelDescriptor> changedModels = getChangedModels();

    //copying modelToOwnerMap
    Map<SModelDescriptor, HashSet<ModelOwner>> modelToOwnerMap = new HashMap<SModelDescriptor, HashSet<ModelOwner>>();
    for (SModelDescriptor md : myModelToOwnerMap.keySet()) {
      modelToOwnerMap.put(md, new HashSet<ModelOwner>(myModelToOwnerMap.get(md)));
    }//--copying

    //releasing own models
    Set<SModelDescriptor> releasedModels = collectReleasedModels(changedModels, modelToOwnerMap, owner);

    //releasing models from released modules
    Set<IModule> releasedModules = myModuleRepository.getModelsToBeRemoved(CollectionUtil.asSet((MPSModuleOwner) owner));
    for (IModule module : releasedModules) {
      releasedModels.addAll(collectReleasedModels(changedModels, modelToOwnerMap, module));
    }
    return new ArrayList<SModelDescriptor>(releasedModels);
  }

  private <ModelOwner> Set<SModelDescriptor> collectReleasedModels(
          Set<SModelDescriptor> changedModels,
          Map<SModelDescriptor, HashSet<ModelOwner>> modelToOwnerMap,
          ModelOwner owner) {
    Set<SModelDescriptor> releasedModels = new HashSet<SModelDescriptor>();
    for (SModelDescriptor modelDescriptor : changedModels) {
      HashSet<ModelOwner> modelOwners = modelToOwnerMap.get(modelDescriptor);
      if (modelOwners != null) {
        modelOwners.remove(owner);
        if (modelOwners.isEmpty()) releasedModels.add(modelDescriptor);
      }
    }

    return releasedModels;
  }

  public Set<SModelDescriptor> getChangedModels() {
    Set<SModelDescriptor> result = new HashSet<SModelDescriptor>();
    for (SModelDescriptor md : myChangedModels.keySet()) {
      if (md.getModelFile() != null) result.add(md);
    }
    return result;
  }

  public Set<SModelDescriptor> getMaybeTransientChangedModels() {
    return new HashSet<SModelDescriptor>(myChangedModels.keySet());
  }

  public void saveAll() {
    List<SModelDescriptor> descriptors = new ArrayList(myChangedModels.keySet());
    for (SModelDescriptor modelDescriptor : descriptors) {
      try {
        modelDescriptor.save();
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
    myChangedModels.clear();
  }

  public void reloadAll() {
    for (SModelDescriptor modelDescriptor : new HashSet<SModelDescriptor>(myModelToOwnerMap.keySet())) {
      modelDescriptor.reloadFromDisk();
    }
  }

  public boolean hasOwners(SModelDescriptor modelDescriptor) {
    Set<ModelOwner> set = myModelToOwnerMap.get(modelDescriptor);
    return !(set == null || set.isEmpty());
  }

  public Set<ModelOwner> getOwners(SModelDescriptor modelDescriptor) {
    Set<ModelOwner> set = myModelToOwnerMap.get(modelDescriptor);
    if (set == null) return new HashSet<ModelOwner>();
    return new HashSet<ModelOwner>(set);
  }

  public <M extends ModelOwner> Set<M> getOwners(SModelDescriptor modelDescriptor, Class<M> cls) {
    Set<M> result = new HashSet<M>();
    for (ModelOwner o : getOwners(modelDescriptor)) {
      if (cls.isInstance(o)) {
        result.add((M) o);
      }
    }
    return result;
  }

  public void tryToReloadModelsFromDisk(final JFrame frame) {
    if (myInChangedModelsReloading) {
      return;
    }

    Runnable command = new Runnable() {
      public void run() {
        myInChangedModelsReloading = true;
        try {
          final Set<SModelDescriptor> toReload = new HashSet<SModelDescriptor>();
          for (SModelDescriptor sm : getAllModelDescriptors()) {
            if (sm.needsReloading()) {
              toReload.add(sm);
            }
          }

          boolean needReloadAll = false;
          for (SModelDescriptor sm : toReload) {
            if (isChanged(sm)) {
              int result = JOptionPane.showConfirmDialog(frame,
                      "Model " + sm.getModelUID() + " changed on a disk. Do you want to discard memory changes?",
                      "Model Changed " + sm.getModelUID(), JOptionPane.YES_NO_OPTION);

              if (result == JOptionPane.YES_OPTION) {
                sm.reloadFromDisk();
                needReloadAll = true;
              } else {
                sm.save();
              }
            } else {
              sm.reloadFromDisk();
              needReloadAll = true;
            }
          }
        } finally {
          myInChangedModelsReloading = false;
        }
      }
    };

    if (CommandProcessor.instance().getCurrentCommandKind() == CommandKind.GENERATION) {
      //ignore it during generation
      return;
    } else {
      //todo it's not very good
      CommandProcessor.instance().tryToExecuteLightweightCommand(command);
    }
  }

  private void fireModelRemoved(SModelDescriptor modelDescriptor) {
    for (SModelRepositoryListener l : listeners()) {
      l.modelRemoved(modelDescriptor);
    }
  }

  private void fireModelAdded(SModelDescriptor modelDescriptor) {
    for (SModelRepositoryListener l : listeners()) {
      l.modelAdded(modelDescriptor);
    }
  }

  private void fireModelRenamed(SModelDescriptor modelDescriptor) {
    for (SModelRepositoryListener l : listeners()) {
      l.modelRenamed(modelDescriptor);
    }
  }

  private void fireModelOwnerAdded(SModelDescriptor modelDescriptor, ModelOwner owner) {
    for (SModelRepositoryListener l : listeners()) {
      l.modelOwnerAdded(modelDescriptor, owner);
    }
  }

  private void fireModelOwnerRemoved(SModelDescriptor modelDescriptor, ModelOwner owner) {
    for (SModelRepositoryListener l : listeners()) {
      l.modelOwnerRemoved(modelDescriptor, owner);
    }
  }
}