package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ParameterUsages_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.ParameterUsages_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Parameter Usages";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ParameterDeclaration";
  }

  public boolean isApplicable(SNode node) {
    return (SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"}, false, false) != null);
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    SNode nodeParentMethod = SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"}, false, false);
    // 
    List<SNode> overridingMethods = FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder", nodeParentMethod, scope, indicator);
    ListSequence.fromList(overridingMethods).addElement(nodeParentMethod);
    // 
    for (SNode methodNode : overridingMethods) {
      SNode parameterNode = ListSequence.fromList(SLinkOperations.getTargets(methodNode, "parameter", true)).getElement(SNodeOperations.getIndexInParent(node));
      for (SNode parameterUsage : FindUtils.executeFinder("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder", parameterNode, scope, indicator)) {
        ListOperations.addElement(_results, parameterUsage);
      }
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    SNode nodeParentMethod = SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"}, false, false);
    // 
    List<SNode> overridingMethods = FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder", nodeParentMethod, scope, new EmptyProgressIndicator());
    ListSequence.fromList(overridingMethods).addElement(nodeParentMethod);
    // 
    for (SNode methodNode : overridingMethods) {
      ListOperations.addElement(_results, ListSequence.fromList(SLinkOperations.getTargets(methodNode, "parameter", true)).getElement(SNodeOperations.getIndexInParent(node)));
    }
  }

  public String getNodeCategory(SNode node) {
    return "Parameter Usages";
  }

  @Nullable()
  public String getNodePresentation(SNode node) {
    return null;
  }

}
