package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;
import com.intellij.openapi.progress.EmptyProgressIndicator;

public class FieldUsages_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.FieldUsages_Finder");

  public String getDescription() {
    return "Field Usages";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.VariableDeclaration";
  }

  public boolean isApplicable(SNode node) {
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null && SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Interface", false, false) == null) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration"))) {
      return false;
    }
    return true;
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    List<SNode> fieldDeclarations = new ArrayList<SNode>();
    ListSequence.fromList(fieldDeclarations).addElement(node);
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) != null) {
      ListSequence.fromList(fieldDeclarations).addSequence(ListSequence.fromList((List<SNode>)FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingFields_Finder", node, scope, indicator)));
    }
    // 
    for(SNode fieldDeclaration : ListSequence.fromList(fieldDeclarations)) {
      for(SNode fieldUsage : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder", fieldDeclaration, scope, indicator))) {
        ListSequence.fromList(_results).addElement(fieldUsage);
      }
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    ListSequence.fromList(_results).addElement(node);
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) != null) {
      for(SNode fieldNode : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingFields_Finder", node, scope, new EmptyProgressIndicator()))) {
        ListSequence.fromList(_results).addElement(fieldNode);
      }
    }
  }

  public String getNodeCategory(SNode node) {
    return "Field Usages";
  }

}
