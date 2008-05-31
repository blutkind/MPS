package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DerivedInterfaces_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Derived Interfaces";
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

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    List<SNode> derived = new ArrayList<SNode>();
    ListSequence.fromList(derived).addElement(node);
    // 
    int passed = 0;
    while (ListSequence.fromList(derived).count() != passed) {
      SNode passingNode = ListSequence.fromList(derived).getElement(passed);
      for (SNode nodeUsage : FindUtils.executeFinder("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder", passingNode, scope, indicator)) {
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(nodeUsage, null, false, false), "jetbrains.mps.baseLanguage.structure.Interface")) {
          if (SNodeOperations.hasRole(nodeUsage, "jetbrains.mps.baseLanguage.structure.Interface", "extendedInterface")) {
            ListSequence.fromList(derived).addElement(SNodeOperations.getParent(nodeUsage, null, false, false));
          }
        }
      }
      if (passingNode != node) {
        ListOperations.addElement(_results, passingNode);
      }
      passed = passed + 1;
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    ListOperations.addElement(_results, node);
  }

  public String getNodeCategory(SNode node) {
    return "Derived Interfaces";
  }

  @Nullable()
  public String getNodePresentation(SNode node) {
    return null;
  }

}
