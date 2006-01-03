package jetbrains.mps.findUsages;

import jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration;
import jetbrains.mps.ide.progress.IAdaptiveProgressMonitor;
import jetbrains.mps.ide.progress.util.ModelsProgressUtil;
import jetbrains.mps.project.ApplicationComponents;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.*;

import java.util.*;

public class FindUsagesManager {

  public static FindUsagesManager getInstance() {
    return ApplicationComponents.getInstance().getComponent(FindUsagesManager.class);
  }

  public FindUsagesManager() {
  }

  //---
  //caches
  //---
  private HashMap<ConceptDeclaration, HashMap<SModelDescriptor, HashSet<ConceptDeclaration>>> myConceptsToKnownDescendantsInModelDescriptors = new HashMap<ConceptDeclaration, HashMap<SModelDescriptor, HashSet<ConceptDeclaration>>>();
  //--


  public void addDescendant(ConceptDeclaration ancestor, ConceptDeclaration descendant) {
    HashMap<SModelDescriptor, HashSet<ConceptDeclaration>> knownDescendantsInModelDescriptors = myConceptsToKnownDescendantsInModelDescriptors.get(ancestor);
    if (knownDescendantsInModelDescriptors == null) {
      knownDescendantsInModelDescriptors = new HashMap<SModelDescriptor, HashSet<ConceptDeclaration>>();
      myConceptsToKnownDescendantsInModelDescriptors.put(ancestor, knownDescendantsInModelDescriptors);
    }
    SModelDescriptor model = descendant.getModel().getModelDescriptor();
    HashSet<ConceptDeclaration> descendantsKnownInModel =  knownDescendantsInModelDescriptors.get(model);
    if (descendantsKnownInModel == null) {
      descendantsKnownInModel = new HashSet<ConceptDeclaration>();
      knownDescendantsInModelDescriptors.put(model, descendantsKnownInModel);
    }
    descendantsKnownInModel.add(descendant);
  }

  public Set<ConceptDeclaration> findDescendants(ConceptDeclaration node) {
    HashMap<SModelDescriptor, HashSet<ConceptDeclaration>> knownDescendantsInModelDescriptors = myConceptsToKnownDescendantsInModelDescriptors.get(node);
    if (knownDescendantsInModelDescriptors == null) {
      knownDescendantsInModelDescriptors = new HashMap<SModelDescriptor, HashSet<ConceptDeclaration>>();
      myConceptsToKnownDescendantsInModelDescriptors.put(node, knownDescendantsInModelDescriptors);
    }
    IScope scope = globalScope();
    Set<ConceptDeclaration> result = new HashSet<ConceptDeclaration>();
    List<SModelDescriptor> models = scope.getModelDescriptors();
    for (SModelDescriptor model : models) {
      if (model.getStereotype().equals(SModelStereotype.JAVA_STUB)) continue;
      HashSet<ConceptDeclaration> descendantsKnownInModel = knownDescendantsInModelDescriptors.get(model);
      if (descendantsKnownInModel == null) {
        descendantsKnownInModel = new HashSet<ConceptDeclaration>();
        knownDescendantsInModelDescriptors.put(model, descendantsKnownInModel);
      }
      result.addAll(model.findDescendants(node, descendantsKnownInModel));
    }

    return result;
  }

  public Set<SReference> findUsages(SNode node, IScope scope, IAdaptiveProgressMonitor progress) {
    Set<SReference> result = new HashSet<SReference>();
    try {
      if (progress == null) progress = IAdaptiveProgressMonitor.NULL_PROGRESS_MONITOR;
      List<SModelDescriptor> models = scope.getModelDescriptors();
      long estimatedTime = ModelsProgressUtil.estimateFindUsagesTimeMillis(models);

      progress.start("Find Usages...", estimatedTime);
      progress.addText("Finding usages...");

      progress.startTask(ModelsProgressUtil.TASK_KIND_FIND_USAGES, estimatedTime);

      for (SModelDescriptor model : new ArrayList<SModelDescriptor>(models)) {
        String taskName = ModelsProgressUtil.findUsagesModelTaskName(model);
        progress.startLeafTask(taskName, ModelsProgressUtil.TASK_KIND_FIND_USAGES);
        result.addAll(model.findUsages(node));
        if (progress.isCanceled()) {
          progress.finishTask(taskName);
          return result;
        }
        progress.finishTask(taskName);
      }
      progress.finishTask(ModelsProgressUtil.TASK_KIND_FIND_USAGES);
      return result;
    } finally {
      progress.finish();
    }
  }

  public Set<SNode> findInstances(ConceptDeclaration concept, IScope scope, IAdaptiveProgressMonitor progress) {
    Set<SNode> result = new HashSet<SNode>();
    try {
      if (progress == null) progress = IAdaptiveProgressMonitor.NULL_PROGRESS_MONITOR;
      List<SModelDescriptor> models = scope.getModelDescriptors();
      long estimatedTime = ModelsProgressUtil.estimateFindInstancesTimeMillis(models);

      progress.start("Finding Instances...", estimatedTime);
      progress.startTask(ModelsProgressUtil.TASK_KIND_FIND_INSTANCES, estimatedTime);

      for (SModelDescriptor model : models) {
        String taskName = ModelsProgressUtil.findInstancesModelTaskName(model);
        progress.startLeafTask(taskName, ModelsProgressUtil.TASK_KIND_FIND_INSTANCES);
        result.addAll(model.findInstances(concept, GlobalScope.getInstance()));
        if (progress.isCanceled()) {
          progress.finishTask(taskName);
          return result;
        }
        progress.finishTask(taskName);
      }
      progress.finishTask(ModelsProgressUtil.TASK_KIND_FIND_INSTANCES);
      return result;
    } finally {
      progress.finish();
    }
  }

  public Set<SReference> findUsages(SNode node, IAdaptiveProgressMonitor progress) {
    return findUsages(node, globalScope(), progress);
  }

  public Set<SNode> findInstances(ConceptDeclaration concept, IAdaptiveProgressMonitor progress){
    return findInstances(concept, globalScope(), progress);
  }

  public IScope globalScope() {
    return GlobalScope.getInstance();
  }

  private static Map<ConceptDeclaration, List<ConceptDeclaration>> ourCache = new HashMap<ConceptDeclaration, List<ConceptDeclaration>>();

  public static void invalidateCaches() {
    ourCache.clear();
  }

  public static void registerStructureModel(SModelDescriptor descriptor) {
    descriptor.addSModelListener(new SModelAdapter() {
      public void modelChanged(SModel model) {
        invalidateCaches();
      }

      public void modelChangedDramatically(SModel model) {
        invalidateCaches();
      }
    });
  }

  public List<ConceptDeclaration> allSubtypes(ConceptDeclaration conceptDeclaration) {
    if (ourCache.get(conceptDeclaration) != null) return Collections.unmodifiableList(ourCache.get(conceptDeclaration));

    List<ConceptDeclaration> list = new LinkedList<ConceptDeclaration>();

    FindUsagesManager manager = FindUsagesManager.getInstance();
    Set<SReference> usages = manager.findUsages(conceptDeclaration, new FilterScope(manager.globalScope()) {
      protected boolean accept(SModelDescriptor descriptor) {
        return descriptor.getModelUID().getShortName().equals("structure");
      }
    }, null);

    for (SReference ref : usages) {
      if (ref.getRole().equals(ConceptDeclaration.EXTENDS)) {
        ConceptDeclaration subtype = (ConceptDeclaration) ref.getSourceNode();
        list.add(subtype);
        list.addAll(allSubtypes(subtype));
      }
    }

    ourCache.put(conceptDeclaration, list);

    return Collections.unmodifiableList(list);
  }
}
