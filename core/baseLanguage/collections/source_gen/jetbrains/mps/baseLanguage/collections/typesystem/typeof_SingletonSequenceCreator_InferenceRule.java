package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_SingletonSequenceCreator_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SingletonSequenceCreator_InferenceRule() {
  }

  public void applyRule(final SNode creator, final TypeCheckingContext typeCheckingContext) {
    SNode elementType = SLinkOperations.getTarget(creator, "elementType", true);
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(creator, "singletonValue", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235574608531", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235574583102", true), (SNode) elementType, false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = creator;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235573464921", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235573464929", true), (SNode) new typeof_SingletonSequenceCreator_InferenceRule.QuotationClass_0316_0().createNode(elementType, typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SingletonSequenceCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_0316_0 {
    public QuotationClass_0316_0() {
    }

    public SNode createNode(Object parameter_0316_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_186 = null;
      SNode quotedNode_187 = null;
      {
        quotedNode_186 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_186 = quotedNode_186;
        {
          quotedNode_187 = (SNode) parameter_0316_0;
          SNode quotedNode1_187;
          if (_parameterValues_129834374.contains(quotedNode_187)) {
            quotedNode1_187 = CopyUtil.copy(quotedNode_187);
          } else {
            _parameterValues_129834374.add(quotedNode_187);
            quotedNode1_187 = quotedNode_187;
          }
          if (quotedNode1_187 != null) {
            quotedNode_186.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_187, typeCheckingContext));
          }
        }
        result = quotedNode1_186;
      }
      return result;
    }

    public SNode createNode(Object parameter_0316_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_186 = null;
      SNode quotedNode_187 = null;
      {
        quotedNode_186 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_186 = quotedNode_186;
        {
          quotedNode_187 = (SNode) parameter_0316_0;
          SNode quotedNode1_187;
          if (_parameterValues_129834374.contains(quotedNode_187)) {
            quotedNode1_187 = CopyUtil.copy(quotedNode_187);
          } else {
            _parameterValues_129834374.add(quotedNode_187);
            quotedNode1_187 = quotedNode_187;
          }
          if (quotedNode1_187 != null) {
            quotedNode_186.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_187));
          }
        }
        result = quotedNode1_186;
      }
      return result;
    }
  }
}
