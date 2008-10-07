package jetbrains.mps.closures.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.EquationInfo;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.Iterator;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class FunctionType_subtypeOf_FunctionType_InequationReplacementRule extends InequationReplacementRule_Runtime {

  public FunctionType_subtypeOf_FunctionType_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    if (SLinkOperations.getCount(subtype, "parameterType") != SLinkOperations.getCount(supertype, "parameterType")) {
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(equationInfo.getNodeWithError(), "different parameter numbers", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1201618945543", intentionProvider);
      }
      return;
    }
    {
      SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(SLinkOperations.getTarget(subtype, "resultType", true), SLinkOperations.getTarget(supertype, "resultType", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1201614892741", false, 0, intentionProvider);
    }
    {
      SNode paramType1;
      SNode paramType2;
      Iterator<SNode> paramType1_iterator = SLinkOperations.getTargets(subtype, "parameterType", true).iterator();
      Iterator<SNode> paramType2_iterator = SLinkOperations.getTargets(supertype, "parameterType", true).iterator();
      while (true) {
        if (!(paramType1_iterator.hasNext())) {
          break;
        }
        if (!(paramType2_iterator.hasNext())) {
          break;
        }
        paramType1 = paramType1_iterator.next();
        paramType2 = paramType2_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(paramType2, paramType1, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1201614990748", false, 0, intentionProvider);
        }
      }
    }
    SNode join = SConceptOperations.createNewNode("jetbrains.mps.bootstrap.helgins.structure.JoinType", null);
    for(SNode superThrows : SLinkOperations.getTargets(supertype, "throwsType", true)) {
      SLinkOperations.addChild(join, "argument", SNodeOperations.copyNode(superThrows));
    }
    for(SNode subThrows : SLinkOperations.getTargets(subtype, "throwsType", true)) {
      {
        SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(subThrows, join, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1214834519072", false, 0, intentionProvider);
      }
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    boolean result_14532009 = true;
    {
      if (SLinkOperations.getCount(subtype, "parameterType") != SLinkOperations.getCount(supertype, "parameterType")) {
        result_14532009 = false;
        return result_14532009;
      }
      result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(subtype, "resultType", true), SLinkOperations.getTarget(supertype, "resultType", true), true);
      {
        SNode paramType1;
        SNode paramType2;
        Iterator<SNode> paramType1_iterator = SLinkOperations.getTargets(subtype, "parameterType", true).iterator();
        Iterator<SNode> paramType2_iterator = SLinkOperations.getTargets(supertype, "parameterType", true).iterator();
        while (true) {
          if (!(paramType1_iterator.hasNext())) {
            break;
          }
          if (!(paramType2_iterator.hasNext())) {
            break;
          }
          paramType1 = paramType1_iterator.next();
          paramType2 = paramType2_iterator.next();
          result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype(paramType2, paramType1, true);
        }
      }
      SNode join = SConceptOperations.createNewNode("jetbrains.mps.bootstrap.helgins.structure.JoinType", null);
      for(SNode superThrows : SLinkOperations.getTargets(supertype, "throwsType", true)) {
        SLinkOperations.addChild(join, "argument", SNodeOperations.copyNode(superThrows));
      }
      for(SNode subThrows : SLinkOperations.getTargets(subtype, "throwsType", true)) {
        result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype(subThrows, join, true);
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
    return "jetbrains.mps.closures.structure.FunctionType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.closures.structure.FunctionType";
  }

}
