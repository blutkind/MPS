package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SLinkAccess_InferenceRule implements InferenceRule_Runtime {

  public typeof_SLinkAccess_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    final SNode linkDecl = SLinkOperations.getTarget(op, "link", false);
    if (linkDecl == null) {
      return;
    }
    // assign type
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206103331026", true), new QuotationClass_77().createNode(SLinkOperations.getTarget(linkDecl, "target", false), SPropertyOperations.hasValue(linkDecl, "metaClass", "aggregation", "reference") + ""), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206103335045", intentionProvider);
    }
    // ---
    RulesUtil.checkAppliedCorrectly_generic(op);
    final SNode Concept_typevar_1186062441601 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConcept(op, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1186062441601));
    {
      final SNode C = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1186062441601);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(C, new Runnable() {

        public void run() {
          SNode inputNodeConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(C);
          List<SNode> declaredLinks = AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(inputNodeConcept);
          if (!(ListSequence.fromList(declaredLinks).contains(linkDecl))) {
            TypeChecker.getInstance().reportTypeError(op, "access to link '" + SPropertyOperations.getString(linkDecl, "role") + "' is not expected here", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062499482");
          }
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062479067");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
