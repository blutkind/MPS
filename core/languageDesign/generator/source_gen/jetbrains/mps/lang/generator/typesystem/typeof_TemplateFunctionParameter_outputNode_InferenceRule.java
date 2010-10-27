package jetbrains.mps.lang.generator.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class typeof_TemplateFunctionParameter_outputNode_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_TemplateFunctionParameter_outputNode_InferenceRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode parentMacro = SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.lang.generator.structure.ReferenceMacro", "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro", "jetbrains.mps.lang.generator.structure.MapSrcListMacro"}, false, false);
    if (SNodeOperations.isInstanceOf(parentMacro, "jetbrains.mps.lang.generator.structure.ReferenceMacro")) {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1227099240563", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1227099233435", true), (SNode) new typeof_TemplateFunctionParameter_outputNode_InferenceRule.QuotationClass_fai2pj_a0a0a1a0().createNode(typeCheckingContext), _info_12389875345);
      }
      return;
    }
    SNode mapperFunc;
    if (SNodeOperations.isInstanceOf(parentMacro, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro")) {
      mapperFunc = SLinkOperations.getTarget(SNodeOperations.cast(parentMacro, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro"), "mapperFunction", true);
    } else {
      mapperFunc = SLinkOperations.getTarget(SNodeOperations.cast(parentMacro, "jetbrains.mps.lang.generator.structure.MapSrcListMacro"), "mapperFunction", true);
    }
    //  ---- 
    if (mapperFunc != null) {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1225234911251", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1225234901779", true), (SNode) typeCheckingContext.typeOf(mapperFunc, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1225234918647", false), _info_12389875345);
      }
    } else {
      //  concept of the wrapped template code 
      SNode concept = SNodeOperations.getConceptDeclaration(SNodeOperations.getParent(parentMacro));
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1225234961708", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1225234961710", true), (SNode) new typeof_TemplateFunctionParameter_outputNode_InferenceRule.QuotationClass_fai2pj_a0a2a0f0a().createNode(concept, typeCheckingContext), _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_outputNode";
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

  public static class QuotationClass_fai2pj_a0a0a1a0 {
    public QuotationClass_fai2pj_a0a0a1a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_fai2pj_a0a2a0f0a {
    public QuotationClass_fai2pj_a0a2a0f0a() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("concept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("concept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
