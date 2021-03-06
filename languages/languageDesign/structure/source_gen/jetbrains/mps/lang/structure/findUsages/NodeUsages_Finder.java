package jetbrains.mps.lang.structure.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import jetbrains.mps.progress.ProgressMonitor;
import java.util.Set;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.findUsages.FindUsagesManager;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class NodeUsages_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder");

  public NodeUsages_Finder() {
  }

  public String getDescription() {
    return "Node Usages";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressMonitor monitor) {
    monitor.start(getDescription(), 0);
    try {
      Set<SReference> resRefs = FindUsagesManager.getInstance().findUsages(CollectionUtil.set(node), scope, monitor, false);
      for (SReference reference : resRefs) {
        ListSequence.fromList(_results).addElement(reference.getSourceNode());
      }
    } finally {
      monitor.done();
    }
  }

  public String getNodeCategory(SNode node) {
    return "Node Usages";
  }
}
