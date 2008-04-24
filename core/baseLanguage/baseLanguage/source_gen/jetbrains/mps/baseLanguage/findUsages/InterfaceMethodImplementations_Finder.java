package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import jetbrains.mps.ide.progress.IAdaptiveProgressMonitor;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.constraints.BaseMethodDeclaration_Behavior;
import org.jetbrains.annotations.Nullable;

public class InterfaceMethodImplementations_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.InterfaceMethodImplementations_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Interface Method Implementations";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration";
  }

  public boolean isApplicable(SNode node) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node, null, false, false), "jetbrains.mps.baseLanguage.structure.Interface") && SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.Interface", "method");
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, IAdaptiveProgressMonitor monitor) {
    List<SNode> implementorsAndAncestorsList = new ArrayList<SNode>();
    {
      ICursor<SNode> _zCursor10 = CursorFactory.createCursor(this.executeFinder("jetbrains.mps.baseLanguage.findUsages.ImplementingClasses_Finder", SNodeOperations.getParent(node, null, false, false), scope, monitor));
      try {
        while(_zCursor10.moveToNext()) {
          SNode implementor = _zCursor10.getCurrent();
          ListOperations.addElement(implementorsAndAncestorsList, implementor);
          ListOperations.addAllElements(implementorsAndAncestorsList, this.executeFinder("jetbrains.mps.baseLanguage.findUsages.ClassAncestors_Finder", implementor, scope, monitor));
        }
      } finally {
        _zCursor10.release();
      }
    }
    // 
    Set<SNode> implementorsAndAncestorsNodes = new HashSet<SNode>();
    {
      ICursor<SNode> _zCursor11 = CursorFactory.createCursor(implementorsAndAncestorsList);
      try {
        while(_zCursor11.moveToNext()) {
          SNode implementorOrAncestor = _zCursor11.getCurrent();
          implementorsAndAncestorsNodes.add(implementorOrAncestor);
        }
      } finally {
        _zCursor11.release();
      }
    }
    // 
    {
      ICursor<SNode> _zCursor12 = CursorFactory.createCursor(implementorsAndAncestorsNodes);
      try {
        while(_zCursor12.moveToNext()) {
          SNode classNode = _zCursor12.getCurrent();
          {
            ICursor<SNode> _zCursor13 = CursorFactory.createCursor(SLinkOperations.getTargets(classNode, "method", true));
            try {
              while(_zCursor13.moveToNext()) {
                SNode sMethod = _zCursor13.getCurrent();
                if (BaseMethodDeclaration_Behavior.call_hasSameSignature_1204901126405(sMethod, node)) {
                  ListOperations.addElement(_results, sMethod);
                }
              }
            } finally {
              _zCursor13.release();
            }
          }
        }
      } finally {
        _zCursor12.release();
      }
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    ListOperations.addElement(_results, node);
  }

  public String getNodeCategory(SNode node) {
    return "Method Implementation";
  }

  @Nullable()
  public String getNodePresentation(SNode node) {
    return null;
  }

}
