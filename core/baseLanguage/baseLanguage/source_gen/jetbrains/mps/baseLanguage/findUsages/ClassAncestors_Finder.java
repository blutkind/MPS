package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ide.findusages.model.result.SearchResults;
import jetbrains.mps.ide.findusages.model.searchquery.SearchQuery;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.ide.findusages.model.result.SearchResult;

public class ClassAncestors_Finder extends BaseFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.ClassAncestors_Finder");

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public String getDescription() {
    return "Ancestors";
  }

  public boolean isApplicable(SNode node) {
    return SLinkOperations.getTarget(node, "superclass", true) != null;
  }

  public boolean isVisible() {
    return true;
  }

  public SearchResults find(SearchQuery searchQuery) {
    SearchResults global_results = new SearchResults();
    {
      global_results.getSearchedNodePointers().add(new SNodePointer(searchQuery.getNode()));
      SNode current = (SNode)searchQuery.getNode();
      while(current != null) {
        current = SLinkOperations.getTarget(SLinkOperations.getTarget(current, "superclass", true), "classifier", false);
        if(current != null) {
          global_results.getSearchResults().add(new SearchResult(new SNodePointer(current), "Ancestor"));
        }
      }
    }
    return global_results;
  }

}
