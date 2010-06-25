package jetbrains.mps.lang.core.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.structure.behavior.LinkDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.ReferenceErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_Cardinalities_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_Cardinalities_NonTypesystemRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext) {
    SNode concept = SNodeOperations.getConceptDeclaration(node);
    for (SNode link : ListSequence.fromList(AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(concept))) {
      if (LinkDeclaration_Behavior.call_isAtLeastOneCardinality_3386205146660812199(link)) {
        if (SPropertyOperations.hasValue(link, "metaClass", "aggregation", "reference")) {
          if (ListSequence.fromList(SNodeOperations.getChildren(node, link)).isEmpty()) {
            // TODO this is a hack for constructor declarations 
            if ("returnType".equals(SPropertyOperations.getString(link, "role")) && "ConstructorDeclaration".equals(SPropertyOperations.getString(concept, "name"))) {
              continue;
            }

            {
              BaseIntentionProvider intentionProvider = null;
              IErrorTarget errorTarget = new NodeErrorTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(node, "No children in role \"" + SPropertyOperations.getString(link, "role") + "\" (declared cardinality is " + SPropertyOperations.getString_def(link, "sourceCardinality", "0..1") + ")", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "8431998747026837711", intentionProvider, errorTarget);
            }
          }
        } else {
          if ((SLinkOperations.getTargetNode(SNodeOperations.getReference(node, link)) == null)) {
            {
              BaseIntentionProvider intentionProvider = null;
              IErrorTarget errorTarget = new NodeErrorTarget();
              errorTarget = new ReferenceErrorTarget(SPropertyOperations.getString(link, "role"));
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "No reference in role \"" + SPropertyOperations.getString(link, "role") + "\" (declared cardinality is 1)", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "1556973682253889223", intentionProvider, errorTarget);
            }
          }
        }
      } else if (LinkDeclaration_Behavior.call_isSingular_1213877254557(link)) {
        if (ListSequence.fromList(SNodeOperations.getChildren(node, link)).count() > 1) {
          {
            BaseIntentionProvider intentionProvider = null;
            intentionProvider = new BaseIntentionProvider("jetbrains.mps.lang.core.typesystem.RemoveUnnecessaryChildrenInSingleRole_QuickFix", false);
            intentionProvider.putArgument("link", link);
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, ListSequence.fromList(SNodeOperations.getChildren(node, link)).count() + " children in role \"" + SPropertyOperations.getString(link, "role") + "\" (declared cardinality is " + SPropertyOperations.getString_def(link, "sourceCardinality", "0..1") + ")", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "1556973682253889251", intentionProvider, errorTarget);
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
