package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class UnavailableConceptsChecker extends SpecificChecker {
  public UnavailableConceptsChecker(ModelChecker modelChecker) {
    super(modelChecker);
  }

  public void checkModel(SModel model) {
    for (SNode node : ListSequence.fromList(SModelOperations.getNodes(model, null))) {
      if (!(this.getModelChecker().checkAndUpdateIndicator("Checking " + SModelOperations.getModelName(model) + " for instances of unavailable concepts..."))) {
        return;
      }
      SNode concept = SNodeOperations.getConceptDeclaration(node);
      if (concept == null) {
        this.addIssue(node, "Cannot find concept \"" + INamedConcept_Behavior.call_getFqName_1213877404258(concept) + "\"");
      }
    }
  }
}
