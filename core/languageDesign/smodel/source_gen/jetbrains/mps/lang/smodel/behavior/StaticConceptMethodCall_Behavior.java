package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IScope;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.behavior.behavior.ConceptBehavior_Behavior;

public class StaticConceptMethodCall_Behavior {

  public static void init(SNode thisNode) {
  }

  public static List<SNode> getClassifiersWithStaticMethods_1213877485028(SModel model, IScope scope, SNode enclosingNode) {
    List<SNode> result = new ArrayList<SNode>();
    for(SNode behavior : SModelOperations.getNodesIncludingImported(model, scope, "jetbrains.mps.lang.behavior.structure.ConceptBehavior")) {
      SNode concept = SLinkOperations.getTarget(behavior, "concept", false);
      if (concept != null && ListSequence.fromList(ConceptBehavior_Behavior.call_getVisibleStaticMethods_1225194243338(behavior, enclosingNode)).isNotEmpty()) {
        ListSequence.fromList(result).addElement(concept);
      }
    }
    return result;
  }

}
