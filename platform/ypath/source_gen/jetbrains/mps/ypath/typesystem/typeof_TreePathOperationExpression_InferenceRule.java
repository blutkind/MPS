package jetbrains.mps.ypath.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.ypath.behavior.FeatureUtil;
import jetbrains.mps.ypath.behavior.ParameterWrapper_Behavior;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.ypath.behavior.ITreePathExpression_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_TreePathOperationExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_TreePathOperationExpression_InferenceRule() {
  }

  public void applyRule(final SNode tpoe, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(tpoe, "operation", true), "jetbrains.mps.ypath.structure.IterateOperation")) {
      final SNode op = SNodeOperations.cast(SLinkOperations.getTarget(tpoe, "operation", true), "jetbrains.mps.ypath.structure.IterateOperation");
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(op, "usedFeature", false), "jetbrains.mps.ypath.structure.IParamFeature")) {
        if (SPropertyOperations.getString(SLinkOperations.getTarget(op, "paramObject", true), "name") != null) {
          final SNode SourceType_typevar_1186145333005 = typeCheckingContext.createNewRuntimeTypesVariable();
          {
            SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(tpoe, "operand", true);
            BaseQuickFixProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1186145347351", 0, intentionProvider);
            typeCheckingContext.createEquation((SNode) typeCheckingContext.getEquationManager().getRepresentator(SourceType_typevar_1186145333005), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1186145352982", true), _info_12389875345);
          }
          {
            final SNode _representatorVar_knbqle_c0a0b0a0a = typeCheckingContext.getEquationManager().getRepresentator(SourceType_typevar_1186145333005);
            typeCheckingContext.whenConcrete(_representatorVar_knbqle_c0a0b0a0a, new Runnable() {
              public void run() {
                SNode targetType = FeatureUtil.getTargetType(SLinkOperations.getTarget(op, "usedFeature", false), SLinkOperations.getTarget(SNodeOperations.cast(typeCheckingContext.getEquationManager().getRepresentator(SourceType_typevar_1186145333005), "jetbrains.mps.ypath.structure.TreePathType"), "nodeType", true), ParameterWrapper_Behavior.call_getParameterValue_1213877312166(SLinkOperations.getTarget(op, "paramObject", true)));
                if (!((targetType != null))) {
                  BaseQuickFixProvider intentionProvider = null;
                  IErrorTarget errorTarget = new NodeErrorTarget();
                  IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(tpoe, "Received null target type", "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1196269826366", intentionProvider, errorTarget);
                }
                if ((targetType != null)) {
                  {
                    SNode _nodeToCheck_1029348928467 = tpoe;
                    BaseQuickFixProvider intentionProvider = null;
                    EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1223982595143", 0, intentionProvider);
                    typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1223982595148", true), (SNode) new typeof_TreePathOperationExpression_InferenceRule.QuotationClass_knbqle_a0a0a2a2a0a1a0a0().createNode(targetType, typeCheckingContext), _info_12389875345);
                  }
                }
              }
            }, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1186145326892", false, false);
          }
        }
      } else {
        SNode treePath = ITreePathExpression_Behavior.call_getTreePath_1213877496973(tpoe);
        if (treePath != null) {
          {
            SNode _nodeToCheck_1029348928467 = tpoe;
            BaseQuickFixProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1223982595324", 0, intentionProvider);
            typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1223982595329", true), (SNode) SLinkOperations.getTarget(treePath, "treePathType", true), _info_12389875345);
          }
        } else
        if (!(false)) {
          BaseQuickFixProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(tpoe, "No treepath found", "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1196942498551", intentionProvider, errorTarget);
        }
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = tpoe;
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1184588384882", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1184588387870", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(tpoe, "operand", true), "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1184588395631", true), _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathOperationExpression";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_knbqle_a0a0a2a2a0a1a0a0 {
    public QuotationClass_knbqle_a0a0a2a2a0a1a0a0() {
    }

    public SNode createNode(Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.TreePathType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("nodeType", HUtil.copyIfNecessary(quotedNode1_4, typeCheckingContext));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.TreePathType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("nodeType", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
