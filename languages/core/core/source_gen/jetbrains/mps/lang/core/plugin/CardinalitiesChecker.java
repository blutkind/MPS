package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.structure.behavior.LinkDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.errors.messageTargets.ReferenceMessageTarget;

public class CardinalitiesChecker extends AbstractConstraintsChecker {
  public CardinalitiesChecker() {
  }

  public void checkNode(SNode node, LanguageErrorsComponent component, IOperationContext operationContext, IScope scope) {
    if (BaseConcept_Behavior.call_getMetaLevel_3981318653438234726(SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.BaseConcept")) != 0) {
      return;
    }

    SNode concept = SNodeOperations.getConceptDeclaration(node);
    component.addDependency(concept);
    for (SNode link : ListSequence.fromList(AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(concept))) {
      if (StringUtils.isEmpty(SPropertyOperations.getString(link, "role"))) {
        continue;
      }
      component.addDependency(link);
      if (LinkDeclaration_Behavior.call_isAtLeastOneCardinality_3386205146660812199(link)) {
        if (SPropertyOperations.hasValue(link, "metaClass", "aggregation", "reference")) {
          if (ListSequence.fromList(SNodeOperations.getChildren(node, link)).isEmpty()) {
            // TODO this is a hack for constructor declarations 
            if ("returnType".equals(SPropertyOperations.getString(link, "role")) && "ConstructorDeclaration".equals(SPropertyOperations.getString(concept, "name"))) {
              continue;
            }
            component.addError(node, "No children in role \"" + SPropertyOperations.getString(link, "role") + "\" (declared cardinality is " + SPropertyOperations.getString_def(link, "sourceCardinality", "0..1") + ")", null);
          }
        } else {
          if ((SLinkOperations.getTargetNode(SNodeOperations.getReference(node, link)) == null)) {
            SetSequence.fromSet(new HashSet<SNode>());
            component.addError(node, "No reference in role \"" + SPropertyOperations.getString(link, "role") + "\" (declared cardinality is 1)", null, new ReferenceMessageTarget(SPropertyOperations.getString(link, "role")));
          }
        }
      } else if (LinkDeclaration_Behavior.call_isSingular_1213877254557(link)) {
        if (ListSequence.fromList(SNodeOperations.getChildren(node, link)).count() > 1) {
          component.addError(node, ListSequence.fromList(SNodeOperations.getChildren(node, link)).count() + " children in role \"" + SPropertyOperations.getString(link, "role") + "\" (declared cardinality is " + SPropertyOperations.getString_def(link, "sourceCardinality", "0..1") + ")", null);
        }
      }
    }
  }
}
