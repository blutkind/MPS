package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import jetbrains.mps.ide.progress.IAdaptiveProgressMonitor;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ide.progress.NullAdaptiveProgressMonitor;
import org.jetbrains.annotations.Nullable;

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
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false) == null && SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration", false, false) == null) {
      return false;
    }
    return true;
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, IAdaptiveProgressMonitor monitor) {
    SNode nodeParentMethod;
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false) != null) {
      nodeParentMethod = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false);
    } else
    {
      nodeParentMethod = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration", false, false);
    }
    // 
    List<SNode> overridingMethods = this.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder", nodeParentMethod, scope, monitor);
    ListOperations.addElement(overridingMethods, nodeParentMethod);
    // 
    {
      ICursor<SNode> _zCursor14 = CursorFactory.createCursor(overridingMethods);
      try {
        while(_zCursor14.moveToNext()) {
          SNode methodNode = _zCursor14.getCurrent();
          {
            SNode parameterNode = ListOperations.getElement(SLinkOperations.getTargets(methodNode, "parameter", true), SNodeOperations.getIndexInParent(node));
            {
              ICursor<SNode> _zCursor15 = CursorFactory.createCursor(this.executeFinder("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder", parameterNode, scope, monitor));
              try {
                while(_zCursor15.moveToNext()) {
                  SNode parameterUsage = _zCursor15.getCurrent();
                  ListOperations.addElement(_results, parameterUsage);
                }
              } finally {
                _zCursor15.release();
              }
            }
          }
        }
      } finally {
        _zCursor14.release();
      }
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    SNode nodeParentMethod;
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false) != null) {
      nodeParentMethod = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false);
    } else
    {
      nodeParentMethod = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration", false, false);
    }
    // 
    List<SNode> overridingMethods = this.executeFinder("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder", nodeParentMethod, scope, new NullAdaptiveProgressMonitor());
    ListOperations.addElement(overridingMethods, nodeParentMethod);
    // 
    {
      ICursor<SNode> _zCursor16 = CursorFactory.createCursor(overridingMethods);
      try {
        while(_zCursor16.moveToNext()) {
          SNode methodNode = _zCursor16.getCurrent();
          ListOperations.addElement(_results, ListOperations.getElement(SLinkOperations.getTargets(methodNode, "parameter", true), SNodeOperations.getIndexInParent(node)));
        }
      } finally {
        _zCursor16.release();
      }
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
