package jetbrains.mps.smodel;

import jetbrains.mps.smodel.event.SModelCommandListener;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration;
import jetbrains.mps.projectLanguage.ModelRoot;

import java.util.Set;
import java.io.File;

/**
 * User: Sergey Dmitriev
 * Date: Apr 3, 2005
 */
public interface SModelDescriptor {
  Set<RootDescriptor> getRoots();
  Set<RootDescriptor> getRoots(String concept);

  /**
   * After model loading call SModelRepostiory.fireModelRepositoryChanged
   */
  SModel getSModel();
  SModelUID getModelUID();
  /**
   * todo: should return "long name"
   */
  String getName();
  String getLongName();
  String getStereotype();
  boolean isInitialized();
  boolean isExternallyResolvable();
  void addSModelListener(SModelListener listener);
  void removeSModelListener(SModelListener listener);

  void addSModelCommandListener(SModelCommandListener listener);
  void removeSModelCommandListener(SModelCommandListener listener);

  void save();

  void reloadFromDisk();
  void refresh();
  void dispose();
  void replaceModel(SModel newModel);

  File getModelFile();

  ModelRoot getModelRoot();

  Set<SReference> findUsages(Set<SNode> node);
  Set<SReference> findUsages(SNode node);
  Set<ConceptDeclaration> findDescendants(ConceptDeclaration node, Set<ConceptDeclaration> descendantsKnownInModel);
  Set<SNode> findInstances(ConceptDeclaration concept, IScope scope);


  FastNodeFinder getFastNodeFinder();

  long timestamp();
  long lastStructuralChange();
  long lastChange();

  //dramatical event counter
  long structuralState();
  long state();

  void delete();

  boolean isNotEditable();

  boolean hasSModelCommandListener(SModelCommandListener listener);

  boolean isRemote();

  boolean isTransient();
}
