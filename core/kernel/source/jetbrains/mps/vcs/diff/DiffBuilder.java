package jetbrains.mps.vcs.diff;

import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.SModel.ImportElement;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.lang.structure.structure.Cardinality;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.ModuleReference;
import jetbrains.mps.vcs.diff.changes.*;

import java.util.*;

public class DiffBuilder {
  private SModel myOldModel;
  private SModel myNewModel;

  private List<Change> myChanges = new ArrayList<Change>();


  public DiffBuilder(SModel oldModel, SModel newModel) {
    myOldModel = oldModel;
    myNewModel = newModel;

    collectChanges();
  }

  private void collectChanges() {
    collectAddedLanguageImports();
    collectAddedModelImport();
    collectLanguageAspects();
    collectDeletedNodes();
    collectAddedNodes();
    collectMovedNodes();
    collectPropertyChanges();
    collectReferenceChanges();
    collectConceptChanges();
  }

  private void collectAddedModelImport() {
    List<SModelReference> oldImportElements = myOldModel.getImportedModelUIDs();
    List<SModelReference> newImportElements = myNewModel.getImportedModelUIDs();

    Set<SModelReference> addedImports = getDiff(oldImportElements, newImportElements);
    Set<SModelReference> deletedImports = getDiff(newImportElements, oldImportElements);

    for (SModelReference ref : addedImports) {
      myChanges.add(new ModelImportChange(ref, false));
    }

    for (SModelReference ref : deletedImports) {
      myChanges.add(new ModelImportChange(ref, true));
    }
  }

  private void collectLanguageAspects() {
    List<ImportElement> oldImportElements = myOldModel.getLanguageAspectModelElements();
    List<ImportElement> newImportElements = myNewModel.getLanguageAspectModelElements();

    newImportElements.removeAll(oldImportElements);

    for (ImportElement el : newImportElements) {
      myChanges.add(new AddLanguageAspectChange(el));
    }
  }

  private void collectConceptChanges() {
    Set<SNodeId> oldNodes = myOldModel.getNodeIds();
    Set<SNodeId> newNodeIds = myNewModel.getNodeIds();

    oldNodes.retainAll(newNodeIds);

    for (SNodeId id : oldNodes) {
      SNode newNode = myNewModel.getNodeById(id);
      SNode oldNode = myOldModel.getNodeById(id);

      assert newNode != null;
      assert oldNode != null;
      if (!oldNode.getConceptFqName().equals(newNode.getConceptFqName())) {
        myChanges.add(new ChangeConceptChange(id, newNode.getConceptFqName()));
      }
    }
  }

  private void collectAddedLanguageImports() {
    List<ModuleReference> oldLanguages = myOldModel.getExplicitlyImportedLanguages();
    List<ModuleReference> newLanguages = myNewModel.getExplicitlyImportedLanguages();

    Set<ModuleReference> addedImports = getDiff(oldLanguages, newLanguages);
    Set<ModuleReference> deletedImports = getDiff(newLanguages, oldLanguages);

    for (ModuleReference ref : addedImports) {
      myChanges.add(new ImportLanguageChange(ref, false));
    }

    for (ModuleReference ref : deletedImports) {
      myChanges.add(new ImportLanguageChange(ref, true));
    }
  }

  private <C> Set<C> getDiff(List<C> oldList, List<C> newList) {
    Set<C> addedImports = new LinkedHashSet<C>(newList);
    addedImports.removeAll(oldList);
    return addedImports;
  }

  private void collectDeletedNodes() {
    Set<SNodeId> oldNodes = myOldModel.getNodeIds();
    Set<SNodeId> newNodeIds = myNewModel.getNodeIds();
    oldNodes.removeAll(newNodeIds);

    for (SNodeId id : oldNodes) {
      myChanges.add(new DeleteNodeChange(id));
    }
  }

  private void collectAddedNodes() {
    Set<SNodeId> oldNodes = myOldModel.getNodeIds();
    Set<SNodeId> newNodeIds = myNewModel.getNodeIds();

    newNodeIds.removeAll(oldNodes);

    for (SNodeId id : newNodeIds) {
      SNode sNode = myNewModel.getNodeById(id);
      assert sNode != null;
      String role = sNode.getRole_();

      if (role != null) {
        if (!isToManyCardinality(sNode.getParent().getConceptFqName(), role)) {
          myChanges.add(new SetNodeChange(sNode.getConceptFqName(), id, role, sNode.getParent().getSNodeId()));
        } else {
          SNode prevChild = sNode.getParent().getPrevChild(sNode);
          SNodeId prevId = null;
          if (prevChild != null) {
            prevId = prevChild.getSNodeId();
          }

          myChanges.add(new AddNodeChange(sNode.getConceptFqName(), id, role, sNode.getParent().getSNodeId(), prevId));
        }
      } else {
        myChanges.add(new AddRootChange(sNode.getConceptFqName(), id));
      }
    }
  }

  private void collectMovedNodes() {
    Set<SNodeId> newNodes = myNewModel.getNodeIds();
    Set<SNodeId> oldNodes = myOldModel.getNodeIds();

    oldNodes.retainAll(newNodes);

    for (SNodeId id : oldNodes) {
      SNode n = myNewModel.getNodeById(id);
      SNode o = myOldModel.getNodeById(id);

      assert n != null && o != null;

      SNodeId nid = getParentId(n);
      SNodeId oid = getParentId(o);

      if (!(nid + "").equals(oid + "")) {
        SNode prevSibling = n.prevSibling();
        if (prevSibling != null) {
          myChanges.add(new MoveNodeChange(id, nid, prevSibling.getSNodeId(), n.getRole_()));
        } else {
          myChanges.add(new MoveNodeChange(id, nid, null, n.getRole_()));
        }
      }
    }
  }

  private SNodeId getParentId(SNode n) {
    if (n.getParent() == null) {
      return null;
    }
    return n.getParent().getSNodeId();
  }

  private void collectPropertyChanges() {
    Set<SNodeId> newNodeIds = myNewModel.getNodeIds();

    for (SNodeId id : newNodeIds) {
      SNode newNode = myNewModel.getNodeById(id);
      SNode oldNode = myOldModel.getNodeById(id);

      assert newNode != null;

      if (oldNode == null) {
        for (String prop : newNode.getProperties().keySet()) {
          myChanges.add(new SetPropertyChange(id, prop, newNode.getProperties().get(prop)));
        }
      } else {
        Set<String> newNodeProps = newNode.getPropertyNames();
        Set<String> oldNodeProps = oldNode.getPropertyNames();

        Set<String> deletedProps = new HashSet<String>(oldNodeProps);
        deletedProps.removeAll(newNodeProps);

        for (String deletedProp : deletedProps) {
          myChanges.add(new SetPropertyChange(id, deletedProp, null));
        }

        for (String nnp : newNodeProps) {
          if (!eq(newNode.getProperties().get(nnp), oldNode.getProperties().get(nnp))) {
            myChanges.add(new SetPropertyChange(id, nnp, newNode.getProperties().get(nnp)));
          }
        }
      }
    }
  }

  private boolean eq(Object o1, Object o2) {
    if (o1 == null) {
      return o1 == o2;
    }
    return o1.equals(o2);
  }

  private void collectReferenceChanges() {
    Set<SNodeId> newNodeIds = myNewModel.getNodeIds();

    for (SNodeId id : newNodeIds) {
      SNode newNode = myNewModel.getNodeById(id);
      SNode oldNode = myOldModel.getNodeById(id);

      assert newNode != null;

      if (oldNode == null) {
        for (SReference ref : newNode.getReferences()) {
          myChanges.add(new SetReferenceChange(id, myNewModel, ref, ref.getTargetNode()));
        }
      } else {
        Set<String> roles = new HashSet<String>(newNode.getReferenceRoles());
        roles.addAll(oldNode.getReferenceRoles());
        for (String role : roles) {
          if (!isToManyCardinality(newNode.getConceptFqName(), role)) {
            if (oldNode.getReference(role) != null && newNode.getReference(role) == null) {
              myChanges.add(new DeleteReferenceChange(id, myNewModel, oldNode.getReference(role)));
            } else {
              if (!("" + getTargetId(newNode.getReference(role))).equals("" + getTargetId(oldNode.getReference(role)))) {
                myChanges.add(new SetReferenceChange(id, myNewModel, newNode.getReference(role), newNode.getReferent(role)));
              }
            }
          } else {
            System.out.println("we have to many references : " + newNode + " " + newNode.getId());
            System.out.println("role : " + role);
            System.out.println("not supported!");
            isToManyCardinality(newNode.getConceptFqName(), role);
          }
        }
      }
    }
  }

  private String getTargetId(SReference ref) {
    if (ref == null) return null;
    SNode tn = ref.getTargetNode();
    if (tn == null) return null;
    return tn.getId();
  }

  private boolean isToManyCardinality(String fqName, String role) {
    LinkDeclaration ld = SModelSearchUtil.findLinkDeclaration(SModelUtil_new.findConceptDeclaration(fqName, GlobalScope.getInstance()), role);
    if (ld == null) {
      return false;
    }
    return ld.getSourceCardinality() != Cardinality._0__1 && ld.getSourceCardinality() != Cardinality._1;
  }

  public List<Change> getChanges() {
    return new ArrayList<Change>(myChanges);
  }

}
