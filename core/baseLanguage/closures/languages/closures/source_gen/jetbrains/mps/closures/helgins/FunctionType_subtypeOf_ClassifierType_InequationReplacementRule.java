package jetbrains.mps.closures.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.EquationInfo;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.closures.constraints.ClassifierTypeUtil;
import java.util.Iterator;
import jetbrains.mps.core.constraints.BaseConcept_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class FunctionType_subtypeOf_ClassifierType_InequationReplacementRule extends InequationReplacementRule_Runtime {

  public  FunctionType_subtypeOf_ClassifierType_InequationReplacementRule() {
  }

  public void processInequation(SNode subtype, SNode supertype, EquationInfo errorInfo) {
    SNode classifier = SLinkOperations.getTarget(supertype, "classifier", false);
    String errorMsg = "";
    if(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
      List<SNode> methods = SLinkOperations.getTargets(classifier, "method", true);
      if(methods != null && methods.size() == 1) {
        SNode md = methods.get(0);
        if(SLinkOperations.getCount(subtype, "parameterType") == SLinkOperations.getCount(md, "parameter")) {
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(SLinkOperations.getTarget(subtype, "resultType", true), ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(md, "returnType", true), supertype), errorInfo.getNodeWithError(), null, "jetbrains.mps.closures.helgins", "1202742499735");
          {
            SNode fpt;
            SNode mpt;
            Iterator<SNode> fpt_iterator = SLinkOperations.getTargets(subtype, "parameterType", true).iterator();
            Iterator<SNode> mpt_iterator = SLinkOperations.getTargets(md, "parameter", true).iterator();
            while(true) {
              if(!(fpt_iterator.hasNext())) {
                break;
              }
              if(!(mpt_iterator.hasNext())) {
                break;
              }
              fpt = fpt_iterator.next();
              mpt = mpt_iterator.next();
              TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(mpt, "type", true), supertype), fpt, errorInfo.getNodeWithError(), null, "jetbrains.mps.closures.helgins", "1202746383183");
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
    TypeChecker.getInstance().reportTypeError(errorInfo.getNodeWithError(), BaseConcept_Behavior.call_getPresentation_1180102203531(subtype) + " is not a subtype of " + BaseConcept_Behavior.call_getPresentation_1180102203531(supertype) + errorMsg, "jetbrains.mps.closures.helgins", "1202742336483");
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
