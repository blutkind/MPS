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

public class typeof_ListElementAccessExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ListElementAccessExpression_InferenceRule() {
  }

  public void applyRule(final SNode expression, final TypeCheckingContext typeCheckingContext) {
    final SNode elementType_typevar_1225711334597 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(expression, "list", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225711322689", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225711317313", true), (SNode) new typeof_ListElementAccessExpression_InferenceRule.QuotationClass_6434_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1225711334597), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(expression, "index", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225711362428", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225711355326", true), (SNode) new typeof_ListElementAccessExpression_InferenceRule.QuotationClass_6434_1().createNode(typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = expression;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225711376610", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225711372118", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1225711334597), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ListElementAccessExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_6434_0 {
    public QuotationClass_6434_0() {
    }

    public SNode createNode(Object parameter_6434_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6434_0 = null;
      SNode quotedNode_6434_1 = null;
      {
        quotedNode_6434_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6434_0 = quotedNode_6434_0;
        {
          quotedNode_6434_1 = (SNode) parameter_6434_0;
          SNode quotedNode1_6434_1;
          if (_parameterValues_129834374.contains(quotedNode_6434_1)) {
            quotedNode1_6434_1 = CopyUtil.copy(quotedNode_6434_1);
          } else {
            _parameterValues_129834374.add(quotedNode_6434_1);
            quotedNode1_6434_1 = quotedNode_6434_1;
          }
          if (quotedNode1_6434_1 != null) {
            quotedNode_6434_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_6434_1, typeCheckingContext));
          }
        }
        result = quotedNode1_6434_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_6434_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6434_0 = null;
      SNode quotedNode_6434_1 = null;
      {
        quotedNode_6434_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6434_0 = quotedNode_6434_0;
        {
          quotedNode_6434_1 = (SNode) parameter_6434_0;
          SNode quotedNode1_6434_1;
          if (_parameterValues_129834374.contains(quotedNode_6434_1)) {
            quotedNode1_6434_1 = CopyUtil.copy(quotedNode_6434_1);
          } else {
            _parameterValues_129834374.add(quotedNode_6434_1);
            quotedNode1_6434_1 = quotedNode_6434_1;
          }
          if (quotedNode1_6434_1 != null) {
            quotedNode_6434_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_6434_1));
          }
        }
        result = quotedNode1_6434_0;
      }
      return result;
    }
  }

  public static class QuotationClass_6434_1 {
    public QuotationClass_6434_1() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6434_2 = null;
      {
        quotedNode_6434_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6434_2 = quotedNode_6434_2;
        result = quotedNode1_6434_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6434_2 = null;
      {
        quotedNode_6434_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6434_2 = quotedNode_6434_2;
        result = quotedNode1_6434_2;
      }
      return result;
    }
  }
}
