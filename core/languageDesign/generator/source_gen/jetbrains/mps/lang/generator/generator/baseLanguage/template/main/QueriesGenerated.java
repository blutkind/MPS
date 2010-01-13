package jetbrains.mps.lang.generator.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.generator.generator.baseLanguage.template.TemplateFunctionMethodName;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.MappingScriptContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_1167762379110(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.createRootRule_Condition(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1167764877550(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.propertyMacro_GetPropertyValue(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1167765482559(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.baseMappingRule_Condition(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1167770891051(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.referenceMacro_GetReferent(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1167946761277(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.ifMacro_Condition(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1167952935373(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.sourceSubstituteMacro_SourceNodesQuery(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1168025033018(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.sourceSubstituteMacro_SourceNodeQuery(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1170727064429(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.mapSrcMacro_MapperFunction(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1184374857703(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.templateFragment_ContextNodeQuery(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1184617630764(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.weaving_MappingRule_ContextNodeQuery(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1195504684817(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.mappingScript_CodeBlock(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1219959436950(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.dropRootRule_Condition(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1225233707647(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return TemplateFunctionMethodName.mapSrcMacro_PostMapperFunction(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_1217272831785(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    // method parameter 
    return "_context";
  }

  public static SNode sourceNodeQuery_1168025330833(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1168025905128(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1168025917226(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1168025925887(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1168025932423(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1168025938897(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1168025947268(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1170727064418(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1184374857693(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1184617630754(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1195504684807(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1219959436940(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1225233707637(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static Iterable sourceNodesQuery_6220262973299791769(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.CreateRootRule_Condition");
  }

  public static Iterable sourceNodesQuery_6220262973300018079(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.DropRootRule_Condition");
  }

  public static Iterable sourceNodesQuery_6220262973300153028(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.BaseMappingRule_Condition");
  }

  public static Iterable sourceNodesQuery_6220262973300285845(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue");
  }

  public static Iterable sourceNodesQuery_6220262973300421489(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.ReferenceMacro_GetReferent");
  }

  public static Iterable sourceNodesQuery_6220262973300680629(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.IfMacro_Condition");
  }

  public static Iterable sourceNodesQuery_6220262973300780494(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodeQuery");
  }

  public static Iterable sourceNodesQuery_6220262973300880378(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery");
  }

  public static Iterable sourceNodesQuery_6220262973300980279(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.MapSrcMacro_MapperFunction");
  }

  public static Iterable sourceNodesQuery_6220262973301080202(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.MapSrcMacro_PostMapperFunction");
  }

  public static Iterable sourceNodesQuery_6220262973301180144(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.TemplateFragment_ContextNodeQuery");
  }

  public static Iterable sourceNodesQuery_6220262973301313062(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.Weaving_MappingRule_ContextNodeQuery");
  }

  public static Iterable sourceNodesQuery_6220262973301411692(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.generator.structure.MappingScript_CodeBlock");
  }

  public static void mappingScript_CodeBlock_1199965771120(final IOperationContext operationContext, final MappingScriptContext _context) {
    List<SNode> nodes = SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode");
    for (SNode node : nodes) {
      SNode replacement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguageInternal.structure.TypeHintExpression", null);
      SLinkOperations.setTarget(replacement, "typeHint", SNodeOperations.cast(SNodeOperations.copyNode(TypeChecker.getInstance().getTypeOf(node)), "jetbrains.mps.baseLanguage.structure.Type"), true);
      SNodeOperations.replaceWithAnother(node, replacement);
      SLinkOperations.setTarget(replacement, "expression", node, true);
    }
  }

  public static void mappingScript_CodeBlock_1217270660171(final IOperationContext operationContext, final MappingScriptContext _context) {
    // references on mapping label will be lost because 
    // TLBase generator executes first and doesn't copy 
    // mapping configs (where labels are declared) to output model 
    // 
    {
      // references in 'get by label' 
      List<SNode> ops = SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetOutputByLabel");
      for (SNode op : ops) {
        SNode label = SLinkOperations.getTarget(op, "label", false);
        if (label == null) {
          _context.showErrorMessage(op, "reference on mapping label is broken");
          continue;
        }
        SPropertyOperations.set(op, "labelName_intern", SPropertyOperations.getString(label, "name"));
        SLinkOperations.setTarget(op, "label", null, false);
      }
    }
    {
      // references in 'get by label and node' 
      List<SNode> ops = SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput");
      for (SNode op : ops) {
        SNode label = SLinkOperations.getTarget(op, "label", false);
        if (label == null) {
          _context.showErrorMessage(op, "reference on mapping label is broken");
          continue;
        }
        SPropertyOperations.set(op, "labelName_intern", SPropertyOperations.getString(label, "name"));
        SLinkOperations.setTarget(op, "label", null, false);
      }
    }
    {
      // references in 'get by label and node and ref.scope' 
      List<SNode> ops = SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInputAndReferenceScope");
      for (SNode op : ops) {
        SNode label = SLinkOperations.getTarget(op, "label", false);
        if (label == null) {
          _context.showErrorMessage(op, "reference on mapping label is broken");
          continue;
        }
        SPropertyOperations.set(op, "labelName_intern", SPropertyOperations.getString(label, "name"));
        SLinkOperations.setTarget(op, "label", null, false);
      }
    }
    {
      // references in 'get all by label and node' 
      List<SNode> ops = SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetOutputListByLabelAndInput");
      for (SNode op : ops) {
        SNode label = SLinkOperations.getTarget(op, "label", false);
        if (label == null) {
          _context.showErrorMessage(op, "reference on mapping label is broken");
          continue;
        }
        SPropertyOperations.set(op, "labelName_intern", SPropertyOperations.getString(label, "name"));
        SLinkOperations.setTarget(op, "label", null, false);
      }
    }
    {
      // references in 'get prev input by label' 
      List<SNode> ops = SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetPrevInputByLabel");
      for (SNode op : ops) {
        SNode label = SLinkOperations.getTarget(op, "label", false);
        if (label == null) {
          _context.showErrorMessage(op, "reference on mapping label is broken");
          continue;
        }
        SPropertyOperations.set(op, "labelName_intern", SPropertyOperations.getString(label, "name"));
        SLinkOperations.setTarget(op, "label", null, false);
      }
    }
  }
}
