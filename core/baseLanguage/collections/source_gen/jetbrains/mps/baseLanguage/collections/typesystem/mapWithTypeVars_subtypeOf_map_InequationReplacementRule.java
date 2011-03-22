package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;

public class mapWithTypeVars_subtypeOf_map_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public mapWithTypeVars_subtypeOf_map_InequationReplacementRule() {
  }

  public boolean isApplicableCustom(SNode subtype, SNode supertype) {
    return !(ListSequence.fromList(SNodeOperations.getChildren(supertype)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode c) {
        return SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.TypeVariableReference");
      }
    })) && ListSequence.fromList(SNodeOperations.getChildren(subtype)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode c) {
        return SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.TypeVariableReference");
      }
    });
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext, IsApplicable2Status status) {
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(subtype, "keyType", true), "jetbrains.mps.baseLanguage.structure.TypeVariableReference"))) {
      {
        SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1434634659123763982", 0, null);
        _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
        typeCheckingContext.createEquation((SNode) SLinkOperations.getTarget(subtype, "keyType", true), (SNode) SLinkOperations.getTarget(supertype, "keyType", true), _info_12389875345);
      }
    }
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(subtype, "valueType", true), "jetbrains.mps.baseLanguage.structure.TypeVariableReference"))) {
      {
        SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1434634659123764077", 0, null);
        _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
        typeCheckingContext.createEquation((SNode) SLinkOperations.getTarget(subtype, "valueType", true), (SNode) SLinkOperations.getTarget(supertype, "valueType", true), _info_12389875345);
      }
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, IsApplicable2Status status) {
    boolean result_14532009 = true;
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(subtype, "keyType", true), "jetbrains.mps.baseLanguage.structure.TypeVariableReference"))) {
      result_14532009 = result_14532009 && MatchingUtil.matchNodes((SNode) SLinkOperations.getTarget(subtype, "keyType", true), (SNode) SLinkOperations.getTarget(supertype, "keyType", true));
    }
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(subtype, "valueType", true), "jetbrains.mps.baseLanguage.structure.TypeVariableReference"))) {
      result_14532009 = result_14532009 && MatchingUtil.matchNodes((SNode) SLinkOperations.getTarget(subtype, "valueType", true), (SNode) SLinkOperations.getTarget(supertype, "valueType", true));
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
    return "jetbrains.mps.baseLanguage.collections.structure.MapType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.MapType";
  }
}
