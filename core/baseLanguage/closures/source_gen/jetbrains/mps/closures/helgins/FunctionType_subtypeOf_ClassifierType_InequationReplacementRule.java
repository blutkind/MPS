package jetbrains.mps.closures.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.EquationInfo;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.closures.constraints.ClassifierTypeUtil;
import java.util.Iterator;
import jetbrains.mps.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class FunctionType_subtypeOf_ClassifierType_InequationReplacementRule extends InequationReplacementRule_Runtime {

  public FunctionType_subtypeOf_ClassifierType_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    SNode classifier = SLinkOperations.getTarget(supertype, "classifier", false);
    String errorMsg = "";
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
      List<SNode> methods = SLinkOperations.getTargets(classifier, "method", true);
      if (methods != null && methods.size() == 1) {
        SNode md = methods.get(0);
        if (SLinkOperations.getCount(subtype, "parameterType") == SLinkOperations.getCount(md, "parameter")) {
          {
            SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(SLinkOperations.getTarget(subtype, "resultType", true), ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(md, "returnType", true), supertype), _nodeToCheck_1029348928467, null, "jetbrains.mps.closures.helgins", "1202742499735", false, 0, intentionProvider);
          }
          {
            SNode fpt;
            SNode mpt;
            Iterator<SNode> fpt_iterator = SLinkOperations.getTargets(subtype, "parameterType", true).iterator();
            Iterator<SNode> mpt_iterator = SLinkOperations.getTargets(md, "parameter", true).iterator();
            while (true) {
              if (!(fpt_iterator.hasNext())) {
                break;
              }
              if (!(mpt_iterator.hasNext())) {
                break;
              }
              fpt = fpt_iterator.next();
              mpt = mpt_iterator.next();
              {
                SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
                BaseIntentionProvider intentionProvider = null;
                TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(mpt, "type", true), supertype), fpt, _nodeToCheck_1029348928467, null, "jetbrains.mps.closures.helgins", "1202746383183", false, 0, intentionProvider);
              }
            }
          }
          return;
        } else
        {
          errorMsg = ": wrong parameter number";
        }
      } else
      {
        errorMsg = ": interface must have only one method";
      }
    } else
    {
      errorMsg = ": not an interface";
    }
    {
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().reportTypeError(equationInfo.getNodeWithError(), BaseConcept_Behavior.call_getPresentation_1213877396640(subtype) + " is not a subtype of " + BaseConcept_Behavior.call_getPresentation_1213877396640(supertype) + errorMsg, "jetbrains.mps.closures.helgins@3_0", "1221068769363", intentionProvider);
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    boolean result_14532009 = true;
    {
      SNode classifier = SLinkOperations.getTarget(supertype, "classifier", false);
      String errorMsg = "";
      if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
        List<SNode> methods = SLinkOperations.getTargets(classifier, "method", true);
        if (methods != null && methods.size() == 1) {
          SNode md = methods.get(0);
          if (SLinkOperations.getCount(subtype, "parameterType") == SLinkOperations.getCount(md, "parameter")) {
            result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(subtype, "resultType", true), ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(md, "returnType", true), supertype), true);
            {
              SNode fpt;
              SNode mpt;
              Iterator<SNode> fpt_iterator = SLinkOperations.getTargets(subtype, "parameterType", true).iterator();
              Iterator<SNode> mpt_iterator = SLinkOperations.getTargets(md, "parameter", true).iterator();
              while (true) {
                if (!(fpt_iterator.hasNext())) {
                  break;
                }
                if (!(mpt_iterator.hasNext())) {
                  break;
                }
                fpt = fpt_iterator.next();
                mpt = mpt_iterator.next();
                result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype(ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(mpt, "type", true), supertype), fpt, true);
              }
            }
            return result_14532009;
          } else
          {
            errorMsg = ": wrong parameter number";
          }
        } else
        {
          errorMsg = ": interface must have only one method";
        }
      } else
      {
        errorMsg = ": not an interface";
      }
      result_14532009 = false;
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
    return "jetbrains.mps.closures.structure.FunctionType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

}
