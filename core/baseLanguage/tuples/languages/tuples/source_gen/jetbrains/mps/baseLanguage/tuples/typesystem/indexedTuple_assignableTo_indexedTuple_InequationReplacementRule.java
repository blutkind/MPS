package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import java.util.Iterator;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;

public class indexedTuple_assignableTo_indexedTuple_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public indexedTuple_assignableTo_indexedTuple_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext, IsApplicable2Status status) {
    if (!(ListSequence.fromList(SLinkOperations.getTargets(subtype, "componentType", true)).count() == ListSequence.fromList(SLinkOperations.getTargets(supertype, "componentType", true)).count())) {
      BaseQuickFixProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), "Member types count don't match", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238854492399", intentionProvider, errorTarget);
      HUtil.addAdditionalRuleIdsFromInfo(_reporter_2309309498, equationInfo);
    }
    {
      SNode lmt;
      SNode rmt;
      Iterator<SNode> lmt_iterator = ListSequence.fromList(SLinkOperations.getTargets(subtype, "componentType", true)).iterator();
      Iterator<SNode> rmt_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "componentType", true)).iterator();
      while (true) {
        if (!(lmt_iterator.hasNext())) {
          break;
        }
        if (!(rmt_iterator.hasNext())) {
          break;
        }
        lmt = lmt_iterator.next();
        rmt = rmt_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
          BaseQuickFixProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238854598691", 0, intentionProvider);
          _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
          _info_12389875345.setInequationGroup("default");
          typeCheckingContext.createLessThanInequation((SNode) lmt, (SNode) rmt, false, _info_12389875345);
        }
      }
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, IsApplicable2Status status) {
    boolean result_14532009 = true;
    if (!(ListSequence.fromList(SLinkOperations.getTargets(subtype, "componentType", true)).count() == ListSequence.fromList(SLinkOperations.getTargets(supertype, "componentType", true)).count())) {
      result_14532009 = false;
    }
    {
      SNode lmt;
      SNode rmt;
      Iterator<SNode> lmt_iterator = ListSequence.fromList(SLinkOperations.getTargets(subtype, "componentType", true)).iterator();
      Iterator<SNode> rmt_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "componentType", true)).iterator();
      while (true) {
        if (!(lmt_iterator.hasNext())) {
          break;
        }
        if (!(rmt_iterator.hasNext())) {
          break;
        }
        lmt = lmt_iterator.next();
        rmt = rmt_iterator.next();
        result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) lmt, (SNode) rmt, true);
      }
    }
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public IsApplicableStatus isApplicableSubtypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public IsApplicableStatus isApplicableSupertypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleType";
  }
}
