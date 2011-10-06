package jetbrains.mps.ide.resolve;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.util.List;
import jetbrains.mps.smodel.SReference;
import java.util.Set;
import jetbrains.mps.smodel.IOperationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.typesystem.inference.TypeContextManager;
import jetbrains.mps.util.Computable;
import jetbrains.mps.smodel.constraints.SearchScopeStatus;
import jetbrains.mps.smodel.constraints.ModelConstraintsUtil;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.search.IsInstanceCondition;
import jetbrains.mps.util.Condition;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cellMenu.NodeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.NullSubstituteInfo;
import jetbrains.mps.smodel.action.DefaultReferentNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import java.util.HashSet;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import java.util.Iterator;
import jetbrains.mps.util.IterableUtil;

public class Resolver {
  private static final Logger LOG = Logger.getLogger(Resolver.class);

  public Resolver() {
  }

  public static List<SReference> resolveReferences(Set<SReference> references, IOperationContext operationContext) {
    return Resolver.resolveReferences(references, operationContext, new ArrayList<ResolveResult>(), true);
  }

  public static List<SReference> resolveReferences(Set<SReference> references, IOperationContext operationContext, List<ResolveResult> results, boolean forceResolve) {
    List<SReference> referencesToSort = new ArrayList<SReference>(references);
    Collections.sort(referencesToSort, new Comparator<SReference>() {
      public int compare(SReference o1, SReference o2) {
        SNode node1 = o1.getSourceNode();
        SNode node2 = o2.getSourceNode();
        if (node1.isAncestorOf(node2)) {
          return 1;
        }
        if (node2.isAncestorOf(node1)) {
          return -1;
        }
        return 0;
      }
    });
    while (true) {
      int size = referencesToSort.size();
      for (SReference reference : new ArrayList<SReference>(referencesToSort)) {
        boolean resolved = Resolver.resolve1(reference, operationContext, results, forceResolve);
        if (resolved) {
          referencesToSort.remove(reference);
        }
      }
      if (size <= referencesToSort.size()) {
        break;
      }
    }
    return referencesToSort;
  }

  public static boolean resolve1(SReference reference, IOperationContext operationContext) {
    return Resolver.resolve1(reference, operationContext, new ArrayList<ResolveResult>(), true);
  }

  public static boolean resolve1(final SReference reference, final IOperationContext operationContext, final List<ResolveResult> results, final boolean forceResolve) {
    final SNode referenceNode = reference.getSourceNode();
    if (referenceNode == null) {
      return false;
    }
    final SNode referenceNodeConcept = referenceNode.getConceptDeclarationNode();
    final SNode linkDeclaration = SModelSearchUtil.findLinkDeclaration(referenceNodeConcept, reference.getRole());
    if (linkDeclaration == null) {
      return false;
    }
    final SNode referentConcept = SModelUtil.getLinkDeclarationTarget(linkDeclaration);
    Boolean result = TypeContextManager.getInstance().runResolveAction(new Computable<Boolean>() {
      @Override
      public Boolean compute() {
        SearchScopeStatus status = ModelConstraintsUtil.getSearchScope(referenceNode.getParent(), referenceNode, referenceNodeConcept, linkDeclaration, operationContext);
        if (status.isError()) {
          Resolver.LOG.error("Couldn't create referent search scope : " + status.getMessage());
          return false;
        }
        ISearchScope searchScope = status.getSearchScope();
        List<SNode> nodes = searchScope.getNodes(new IsInstanceCondition(referentConcept));
        Condition<SNode> nameMatchesCondition = new Condition<SNode>() {
          public boolean met(SNode object) {
            String resolveInfo = reference.getResolveInfo();
            return resolveInfo != null && resolveInfo.equals(object.getName());
          }
        };
        List<SNode> filtered = CollectionUtil.filter(nodes, nameMatchesCondition);
        if (filtered.size() == 1) {
          ResolveResult resolveResult = new ResolveResult(referenceNode, filtered.get(0), reference.getRole(), null);
          results.add(resolveResult);
          if (forceResolve) {
            resolveResult.setTarget();
          }
          return true;
        }
        return false;
      }
    });
    return result;
  }

  public static List<INodeSubstituteAction> createResolveActions(SReference reference, IOperationContext operationContext, EditorContext editorContext) {
    String resolveInfo = reference.getResolveInfo();
    String role = reference.getRole();
    final SNode sourceNode = reference.getSourceNode();
    SNode sourceConcept = sourceNode.getConceptDeclarationNode();
    SNode refLinkDeclaration = SModelSearchUtil.findLinkDeclaration(sourceConcept, role);
    SNode sourceParent = sourceNode.getParent();
    if (sourceParent == null) {
      sourceParent = sourceNode;
    }
    SNode childLinkDeclaration = SModelSearchUtil.findLinkDeclaration(sourceParent.getConceptDeclarationNode(), sourceNode.getRole_());
    EditorCell editorCell = editorContext.createNodeCell(sourceParent);
    EditorCell inspectedCell = editorContext.createInspectedCell(sourceNode, null);
    EditorCell refCell = Resolver.searchForRefCell(editorCell, sourceNode, refLinkDeclaration, childLinkDeclaration);
    if (refCell == null) {
      refCell = Resolver.searchForRefCell(inspectedCell, sourceNode, refLinkDeclaration, childLinkDeclaration);
    }
    if (refCell == null) {
      refCell = editorCell;
    }
    NodeSubstituteInfo substituteInfo = refCell.getSubstituteInfo();
    if (substituteInfo == null) {
      substituteInfo = new NullSubstituteInfo();
    }
    List<INodeSubstituteAction> actions = substituteInfo.getMatchingActions(resolveInfo, false);
    List<INodeSubstituteAction> matchingActions = new ArrayList<INodeSubstituteAction>();
    for (INodeSubstituteAction action : actions) {
      if (action.canSubstituteStrictly(resolveInfo)) {
        matchingActions.add(action);
      }
    }
    if (matchingActions.isEmpty()) {
      for (INodeSubstituteAction action : actions) {
        if (action.canSubstitute(resolveInfo)) {
          matchingActions.add(action);
        }
      }
    }
    Collections.sort(matchingActions, new Comparator<INodeSubstituteAction>() {
      public int compare(INodeSubstituteAction o1, INodeSubstituteAction o2) {
        if (!((o2 instanceof DefaultReferentNodeSubstituteAction))) {
          return 1;
        }
        if (!((o1 instanceof DefaultReferentNodeSubstituteAction))) {
          return -1;
        }
        DefaultReferentNodeSubstituteAction action1 = (DefaultReferentNodeSubstituteAction) o1;
        DefaultReferentNodeSubstituteAction action2 = (DefaultReferentNodeSubstituteAction) o2;
        SModel model1 = null;
        SModel model2 = null;
        if (action1.getOutputConcept() != null) {
          model1 = ((SNode) action1.getOutputConcept()).getModel();
        }
        if (action2.getOutputConcept() != null) {
          model2 = ((SNode) action2.getOutputConcept()).getModel();
        }
        if (model1 == sourceNode.getModel()) {
          return 1;
        }
        if (model2 == sourceNode.getModel()) {
          return -1;
        }
        return 0;
      }
    });
    return matchingActions;
  }

  private static EditorCell searchForRefCell(EditorCell editorCell, SNode sourceNode, SNode refLinkDeclaration, SNode childLinkDeclaration) {
    Set<EditorCell> frontier = new HashSet<EditorCell>();
    Set<EditorCell> newFrontier = new HashSet<EditorCell>();
    EditorCell foundCell = null;
    frontier.add(editorCell);
    while (!(frontier.isEmpty())) {
      for (EditorCell cell : frontier) {
        if (cell.getSNode() == sourceNode) {
          SNode userObject = cell.getLinkDeclaration();
          if (userObject == refLinkDeclaration) {
            return cell;
          }
          if (childLinkDeclaration != null && userObject == childLinkDeclaration) {
            if (foundCell == null) {
              foundCell = cell;
            }
          }
        }
        if (cell instanceof EditorCell_Collection) {
          Iterator<EditorCell> cells = ((EditorCell_Collection) cell).cells();
          newFrontier.addAll(IterableUtil.asCollection(IterableUtil.asIterable(cells)));
        }
      }
      frontier = newFrontier;
      newFrontier = new HashSet<EditorCell>();
    }
    return foundCell;
  }
}
