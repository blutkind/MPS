package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class typeof_SNodeTypeCastExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SNodeTypeCastExpression_InferenceRule() {
  }

  public void applyRule(final SNode expr, final TypeCheckingContext typeCheckingContext) {
    final SNode LeftType_typevar_1186061665928 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(expr, "leftExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186061673586", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186061665928), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186061683045", true), _info_12389875345);
    }
    //  this when concrete has a sense of overloading 
    {
      final SNode ignore1 = typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186061665928);
      typeCheckingContext.whenConcrete(ignore1, new Runnable() {
        public void run() {
          if (TypeChecker.getInstance().getSubtypingManager().isSubtype(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186061665928), new typeof_SNodeTypeCastExpression_InferenceRule.QuotationClass_4690_1().createNode(typeCheckingContext), false)) {
            {
              SNode _nodeToCheck_1029348928467 = expr;
              BaseIntentionProvider intentionProvider = null;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712082188", 0, intentionProvider);
              typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712082190", true), (SNode) new typeof_SNodeTypeCastExpression_InferenceRule.QuotationClass_4690_0().createNode(SLinkOperations.getTarget(expr, "concept", false), typeCheckingContext), _info_12389875345);
            }
          } else {
            {
              SNode _nodeToCheck_1029348928467 = expr;
              BaseIntentionProvider intentionProvider = null;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712085348", 0, intentionProvider);
              typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712085350", true), (SNode) new typeof_SNodeTypeCastExpression_InferenceRule.QuotationClass_4690_2().createNode(SLinkOperations.getTarget(expr, "concept", false), typeCheckingContext), _info_12389875345);
            }
          }
          {
            final SNode ignore2 = typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186061665928);
            typeCheckingContext.whenConcrete(ignore2, new Runnable() {
              public void run() {
                {
                  SNode _nodeToCheck_1029348928467 = expr;
                  BaseIntentionProvider intentionProvider = null;
                  EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1238686640332", 0, intentionProvider);
                  typeCheckingContext.createComparableEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1238686640336", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186061665928), _info_12389875345);
                }
              }
            }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1239380067971", false, true);
          }
        }
      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186061660362", true, false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_4690_0 {
    public QuotationClass_4690_0() {
    }

    public SNode createNode(Object parameter_4690_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0 = null;
      {
        quotedNode_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SConceptType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0 = quotedNode_0;
        quotedNode1_0.setReferent("conceptDeclaraton", (SNode) parameter_4690_0);
        result = quotedNode1_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_4690_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0 = null;
      {
        quotedNode_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SConceptType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0 = quotedNode_0;
        quotedNode1_0.setReferent("conceptDeclaraton", (SNode) parameter_4690_0);
        result = quotedNode1_0;
      }
      return result;
    }
  }

  public static class QuotationClass_4690_1 {
    public QuotationClass_4690_1() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SConceptType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1 = quotedNode_1;
        result = quotedNode1_1;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SConceptType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1 = quotedNode_1;
        result = quotedNode1_1;
      }
      return result;
    }
  }

  public static class QuotationClass_4690_2 {
    public QuotationClass_4690_2() {
    }

    public SNode createNode(Object parameter_4690_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2 = null;
      {
        quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_2;
        quotedNode1_2.setReferent("concept", (SNode) parameter_4690_1);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_4690_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2 = null;
      {
        quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_2;
        quotedNode1_2.setReferent("concept", (SNode) parameter_4690_1);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
