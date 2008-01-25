package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.model.searchquery.SearchQuery;
import jetbrains.mps.ide.findusages.model.result.SearchResults;
import jetbrains.mps.smodel.SNodePointer;

import java.util.List;

import jetbrains.mps.ide.findusages.model.result.SearchResult;

import java.util.ArrayList;

import jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.constraints.Type_Behavior;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;

public class OverridingMethods_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder");

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public String getDescription() {
    return "Overriding Methods";
  }

  public boolean isApplicable(SNode node) {
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")) && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"))) {
      return false;
    }
    return true;
  }

  public boolean isVisible() {
    return true;
  }

  public void doFind(SearchQuery searchQuery, SearchResults results) {
    SNode searchedNode = (SNode) searchQuery.getNode();
    results.getSearchedNodePointers().add(new SNodePointer(searchedNode));
    // null
    List<SearchResult> derivedClassesResults = new ArrayList<SearchResult>();
    try {
      BaseFinder _finder = (BaseFinder) Class.forName("jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder").newInstance();
      SNode _node = SNodeOperations.getParent(searchedNode, null, false, false);
      IScope _scope;
      _scope = searchQuery.getScope();
      // TODO: check for right concept
      boolean rightConcept = _node.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.ClassConcept");
      if (!(rightConcept)) {
        OverridingMethods_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; concept: " + searchQuery.getNodePointer().getNode().getConceptFqName());
      } else {
        boolean isApplicable = _finder.isApplicable(_node);
        if (!(isApplicable)) {
          OverridingMethods_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; node: " + searchQuery.getNodePointer().getNode().toString());
        } else {
          SearchResults results_ = _finder.find(new SearchQuery(_node, _scope));
          for (SearchResult result : results_.getSearchResults()) {
            derivedClassesResults.add(result);
          }
        }
      }
    } catch (Throwable t) {
      OverridingMethods_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder" + "\"  Message:" + t.getMessage());
    }
    // null
    {
      ICursor<SearchResult> _zCursor = CursorFactory.createCursor(derivedClassesResults);
      try {
        while (_zCursor.moveToNext()) {
          SearchResult result = _zCursor.getCurrent();
          {
            SNode classNode = (SNode) result.getNodePointer().getNode();
            Iterable<SNode> methodsOfSameKind;
            if (SNodeOperations.isInstanceOf(searchedNode, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration")) {
              methodsOfSameKind = SLinkOperations.getTargets(classNode, "method", true);
            } else {
              methodsOfSameKind = SLinkOperations.getTargets(classNode, "staticMethod", true);
            }
            {
              ICursor<SNode> _zCursor1 = CursorFactory.createCursor(methodsOfSameKind);
              try {
                while (_zCursor1.moveToNext()) {
                  SNode sMethod = _zCursor1.getCurrent();
                  if (SPropertyOperations.getString(sMethod, "name").equals(SPropertyOperations.getString(searchedNode, "name")) && SLinkOperations.getCount(sMethod, "parameter") == SLinkOperations.getCount(searchedNode, "parameter")) {
                    boolean same = true;
                    for (int i = 0; i < SLinkOperations.getCount(sMethod, "parameter"); i = i + 1) {
                      String searchedParamType = Type_Behavior.call_getErasureSignature_1199318924019(SLinkOperations.getTarget(ListOperations.getElement(SLinkOperations.getTargets(searchedNode, "parameter", true), i), "type", true));
                      String foundParamType = Type_Behavior.call_getErasureSignature_1199318924019(SLinkOperations.getTarget(ListOperations.getElement(SLinkOperations.getTargets(sMethod, "parameter", true), i), "type", true));
                      if (!(foundParamType.equals(searchedParamType))) {
                        same = false;
                      }
                    }
                    if (same) {
                      results.getSearchResults().add(new SearchResult(new SNodePointer(sMethod), "Overriding Methods"));
                    }
                  }
                }
              } finally {
                _zCursor1.release();
              }
            }
          }
        }
      } finally {
        _zCursor.release();
      }
    }
  }

}
