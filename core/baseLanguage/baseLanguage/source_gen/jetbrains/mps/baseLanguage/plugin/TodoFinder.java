package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import com.intellij.openapi.progress.ProgressIndicator;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.findUsages.FindUsagesManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.ide.findusages.model.SearchResult;

public class TodoFinder implements IFinder {
  public TodoFinder() {
  }

  public SearchResults find(SearchQuery query, ProgressIndicator p) {
    List<SNode> nodes = (List<SNode>) FindUsagesManager.getInstance().findInstances(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.TextCommentPart"), query.getScope());
    SearchResults<SNode> results = new SearchResults<SNode>();
    for (SNode node : nodes) {
      String text = SPropertyOperations.getString(node, "text");
      if (text == null) {
        continue;
      }
      if (text.toLowerCase().startsWith("todo:")) {
        results.getSearchResults().add(new SearchResult<SNode>(node, "TODO items"));
      }
    }
    return results;
  }
}
