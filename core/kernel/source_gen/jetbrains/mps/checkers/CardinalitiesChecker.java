package jetbrains.mps.checkers;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SNodeUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.errors.messageTargets.ReferenceMessageTarget;

public class CardinalitiesChecker extends AbstractConstraintsChecker {
  public CardinalitiesChecker() {
  }

  public void checkNode(SNode node, LanguageErrorsComponent component, IOperationContext operationContext, IScope scope) {
    if (SNodeUtil.getMetaLevel(node) != 0) {
      return;
    }

    SNode concept = SNodeOperations.getConceptDeclaration(node);
    component.addDependency(concept);
    for (SNode link : ListSequence.fromList((List<SNode>) SModelSearchUtil.getLinkDeclarations(concept))) {
      if (StringUtils.isEmpty(SPropertyOperations.getString(link, "role"))) {
        continue;
      }
      component.addDependency(link);
      SNode genuineLink = SModelUtil.getGenuineLinkDeclaration(link);
      if (SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "1", "0..1") || SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "1..n", "0..1")) {
        if (SPropertyOperations.hasValue(link, "metaClass", "aggregation", "reference")) {
          if (ListSequence.fromList(SNodeOperations.getChildren(node, link)).isEmpty()) {
            // TODO this is a hack for constructor declarations 
            if ("returnType".equals(SPropertyOperations.getString(link, "role")) && "ConstructorDeclaration".equals(SPropertyOperations.getString(concept, "name"))) {
              continue;
            }
            component.addError(node, "No children in role \"" + SPropertyOperations.getString(link, "role") + "\" (declared cardinality is " + SPropertyOperations.getString_def(link, "sourceCardinality", "0..1") + ")", null);
          }
        } else {
          if (SNodeOperations.getReference(node, link) == null) {
            component.addError(node, "No reference in role \"" + SPropertyOperations.getString(link, "role") + "\" (declared cardinality is 1)", null, new ReferenceMessageTarget(SPropertyOperations.getString(link, "role")));
          }
        }
      } else if (SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "1", "0..1")) {
        if (ListSequence.fromList(SNodeOperations.getChildren(node, link)).count() > 1) {
          component.addError(node, ListSequence.fromList(SNodeOperations.getChildren(node, link)).count() + " children in role \"" + SPropertyOperations.getString(link, "role") + "\" (declared cardinality is " + SPropertyOperations.getString_def(link, "sourceCardinality", "0..1") + ")", null);
        }
      }
    }
  }
}
