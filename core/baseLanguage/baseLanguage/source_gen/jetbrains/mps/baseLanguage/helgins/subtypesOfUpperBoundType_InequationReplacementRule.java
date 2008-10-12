package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class subtypesOfUpperBoundType_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {

  public subtypesOfUpperBoundType_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext) {
    if (SNodeOperations.isInstanceOf(subtype, "jetbrains.mps.baseLanguage.structure.UpperBoundType")) {
      {
        SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation(SLinkOperations.getTarget(subtype, "bound", true), SLinkOperations.getTarget(supertype, "bound", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1220443995701", false, 0, intentionProvider);
      }
    } else
    {
      {
        SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation(subtype, SLinkOperations.getTarget(supertype, "bound", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1220444030637", false, 0, intentionProvider);
      }
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    boolean result_14532009 = true;
    if (SNodeOperations.isInstanceOf(subtype, "jetbrains.mps.baseLanguage.structure.UpperBoundType")) {
      result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(subtype, "bound", true), SLinkOperations.getTarget(supertype, "bound", true), true);
    } else
    {
      result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype(subtype, SLinkOperations.getTarget(supertype, "bound", true), true);
    }
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public boolean isApplicableSubtype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
  }

  public boolean isApplicableSupertype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.Type";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.UpperBoundType";
  }

}
