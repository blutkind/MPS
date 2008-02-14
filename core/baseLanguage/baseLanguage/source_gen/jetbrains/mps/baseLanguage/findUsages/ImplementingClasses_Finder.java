package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.findusages.model.searchquery.SearchQuery;
import jetbrains.mps.ide.findusages.model.result.SearchResults;
import java.util.List;
import jetbrains.mps.ide.findusages.model.result.SearchResult;
import java.util.ArrayList;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class ImplementingClasses_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.ImplementingClasses_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Implementing Classes";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Interface";
  }

  public boolean isApplicable(SNode node) {
    return true;
  }

  public void doFind(SearchQuery searchQuery, SearchResults results) {
    SNode searchedNode = searchQuery.getNode();
    // null
    List<SearchResult> derivedInterfaces = new ArrayList<SearchResult>();
    derivedInterfaces.add(new SearchResult(searchQuery.getNodePointer(), ""));
    try {
      GeneratedFinder _finder = (GeneratedFinder)Class.forName("jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder").newInstance();
      SNode _node = searchedNode;
      IScope _scope;
      _scope = searchQuery.getScope();
      boolean rightConcept = _node.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.Interface");
      if(!(rightConcept)) {
        ImplementingClasses_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; concept: " + searchQuery.getNodePointer().getNode().getConceptFqName());
      } else
      {
        boolean isApplicable = _finder.isApplicable(_node);
        if(!(isApplicable)) {
          ImplementingClasses_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; node: " + searchQuery.getNodePointer().getNode().toString());
        } else
        {
          SearchResults results_1 = _finder.find(new SearchQuery(_node, _scope));
          for(SearchResult result : results_1.getSearchResults()) {
            derivedInterfaces.add(result);
          }
        }
      }
    } catch (Throwable t) {
      ImplementingClasses_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder" + "\"  Message:" + t.getMessage());
    }
    // null
    List<SearchResult> derivedInterfacesUsages = new ArrayList<SearchResult>();
    for(SearchResult derivedInterface : derivedInterfaces) {
      results.getSearchedNodePointers().add(new SNodePointer(derivedInterface.getNode()));
      try {
        GeneratedFinder _finder = (GeneratedFinder)Class.forName("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder").newInstance();
        SNode _node = derivedInterface.getNode();
        IScope _scope;
        _scope = searchQuery.getScope();
        boolean rightConcept = _node.isInstanceOfConcept("jetbrains.mps.core.structure.BaseConcept");
        if(!(rightConcept)) {
          ImplementingClasses_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; concept: " + searchQuery.getNodePointer().getNode().getConceptFqName());
        } else
        {
          boolean isApplicable = _finder.isApplicable(_node);
          if(!(isApplicable)) {
            ImplementingClasses_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; node: " + searchQuery.getNodePointer().getNode().toString());
          } else
          {
            SearchResults results_2 = _finder.find(new SearchQuery(_node, _scope));
            for(SearchResult result : results_2.getSearchResults()) {
              derivedInterfacesUsages.add(result);
            }
          }
        }
      } catch (Throwable t) {
        ImplementingClasses_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder" + "\"  Message:" + t.getMessage());
      }
    }
    // null
    for(SearchResult interfaceResult : derivedInterfacesUsages) {
      SNode node = interfaceResult.getNode();
      if(SNodeOperations.isInstanceOf(SNodeOperations.getParent(node, null, false, false), "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
        if(SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", "implementedInterface")) {
          results.getSearchResults().add(new SearchResult(new SNodePointer(SNodeOperations.getParent(node, null, false, false)), "Implementing Classes"));
          // null
          List<SearchResult> classesResult = new ArrayList<SearchResult>();
          try {
            GeneratedFinder _finder = (GeneratedFinder)Class.forName("jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder").newInstance();
            SNode _node = SNodeOperations.getParent(node, null, false, false);
            IScope _scope;
            _scope = searchQuery.getScope();
            boolean rightConcept = _node.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.ClassConcept");
            if(!(rightConcept)) {
              ImplementingClasses_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; concept: " + searchQuery.getNodePointer().getNode().getConceptFqName());
            } else
            {
              boolean isApplicable = _finder.isApplicable(_node);
              if(!(isApplicable)) {
                ImplementingClasses_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; node: " + searchQuery.getNodePointer().getNode().toString());
              } else
              {
                SearchResults results_3 = _finder.find(new SearchQuery(_node, _scope));
                for(SearchResult result : results_3.getSearchResults()) {
                  classesResult.add(result);
                }
              }
            }
          } catch (Throwable t) {
            ImplementingClasses_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder" + "\"  Message:" + t.getMessage());
          }
          // null
          for(SearchResult classResult : classesResult) {
            results.getSearchResults().add(new SearchResult(new SNodePointer(classResult.getNode()), "Implementing Classes"));
          }
        }
      }
    }
  }

}
