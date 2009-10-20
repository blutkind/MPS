package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class namedTuple_assignableTo_namedTuple_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public namedTuple_assignableTo_namedTuple_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext) {
    if (!(SLinkOperations.getTarget(subtype, "classifier", false) == SLinkOperations.getTarget(supertype, "classifier", false))) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), "Different named tuples", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239579585554", intentionProvider, errorTarget);
    }
    if (!(SLinkOperations.getCount(subtype, "parameter") == SLinkOperations.getCount(supertype, "parameter"))) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), "Parameter types counts don't match", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239968591797", intentionProvider, errorTarget);
    }
    {
      SNode lp;
      SNode rp;
      Iterator<SNode> lp_iterator = ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameter", true)).iterator();
      Iterator<SNode> rp_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameter", true)).iterator();
      while (true) {
        if (!(lp_iterator.hasNext())) {
          break;
        }
        if (!(rp_iterator.hasNext())) {
          break;
        }
        lp = lp_iterator.next();
        rp = rp_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
          BaseIntentionProvider intentionProvider = null;
          EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239968769054", 0, intentionProvider);
          typeCheckingContext.createLessThanInequation((SNode)lp, (SNode)rp, false, info);
        }
      }
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    boolean result_14532009 = true;
    if (!(SLinkOperations.getTarget(subtype, "classifier", false) == SLinkOperations.getTarget(supertype, "classifier", false))) {
      result_14532009 = false;
    }
    if (!(SLinkOperations.getCount(subtype, "parameter") == SLinkOperations.getCount(supertype, "parameter"))) {
      result_14532009 = false;
    }
    {
      SNode lp;
      SNode rp;
      Iterator<SNode> lp_iterator = ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameter", true)).iterator();
      Iterator<SNode> rp_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameter", true)).iterator();
      while (true) {
        if (!(lp_iterator.hasNext())) {
          break;
        }
        if (!(rp_iterator.hasNext())) {
          break;
        }
        lp = lp_iterator.next();
        rp = rp_iterator.next();
        result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode)lp, (SNode)rp, true);
      }
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
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType";
  }
}
