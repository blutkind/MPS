package jetbrains.mps.baseLanguage.logging.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.logging.generator.baseLanguage.template.util.LoggingGenerationUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1169464530672(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.baseLanguage.logging.structure.LogStatement", false)).isNotEmpty() && !(LoggingGenerationUtil.isDesignTimeModel(_context.getOriginalInputModel()));
  }

  public static boolean baseMappingRule_Condition_1210168710480(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "severity", "fatal", "debug");
  }

  public static boolean baseMappingRule_Condition_1210168774349(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "severity", "error", "debug");
  }

  public static boolean baseMappingRule_Condition_1210168776377(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "severity", "warn", "debug");
  }

  public static boolean baseMappingRule_Condition_1210168778612(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "severity", "debug", "debug");
  }

  public static boolean baseMappingRule_Condition_1210168779832(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "severity", "info", "debug");
  }

  public static boolean baseMappingRule_Condition_1210168780744(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "severity", "trace", "debug");
  }

  public static boolean baseMappingRule_Condition_1232620727244(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.baseLanguage.logging.structure.LogStatement", false)).isNotEmpty() && LoggingGenerationUtil.isDesignTimeModel(_context.getOriginalInputModel());
  }

  public static boolean baseMappingRule_Condition_1232620749768(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    if ((SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null)) {
      return false;
    }
    return !(LoggingGenerationUtil.isDesignTimeModel(_context.getOriginalInputModel()));
  }

  public static boolean baseMappingRule_Condition_1232620763765(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    if ((SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null)) {
      return false;
    }
    return LoggingGenerationUtil.isDesignTimeModel(_context.getOriginalInputModel());
  }

  public static Object referenceMacro_GetReferent_1169471975875(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode method = null;
    if (SPropertyOperations.hasValue(_context.getNode(), "severity", "fatal", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "baseMethodDeclaration", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "severity", "error", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "baseMethodDeclaration", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "severity", "warn", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_2().createNode(), "baseMethodDeclaration", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "severity", "debug", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_3().createNode(), "baseMethodDeclaration", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "severity", "info", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_4().createNode(), "baseMethodDeclaration", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "severity", "trace", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_5().createNode(), "baseMethodDeclaration", false);
    }
    return method;
  }

  public static Object referenceMacro_GetReferent_1210169044888(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(ListSequence.fromList(SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false)).last(), "logFieldDeclaration");
  }

  public static Object referenceMacro_GetReferent_1210169054074(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(ListSequence.fromList(SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false)).last(), "logFieldDeclaration");
  }

  public static Object referenceMacro_GetReferent_1232620814929(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode method = null;
    if (SPropertyOperations.hasValue(_context.getNode(), "severity", "fatal", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_6().createNode(), "baseMethodDeclaration", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "severity", "error", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_7().createNode(), "baseMethodDeclaration", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "severity", "warn", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_8().createNode(), "baseMethodDeclaration", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "severity", "debug", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_9().createNode(), "baseMethodDeclaration", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "severity", "info", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_10().createNode(), "baseMethodDeclaration", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "severity", "trace", "debug")) {
      method = SLinkOperations.getTarget(new _Quotations.QuotationClass_11().createNode(), "baseMethodDeclaration", false);
    }
    return method;
  }

  public static SNode sourceNodeQuery_1168402886104(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return LoggingGenerationUtil.toPlus(SLinkOperations.getTargets(_context.getNode(), "textExpression", true));
  }

  public static SNode sourceNodeQuery_1169467171807(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "logExpression", true);
  }

  public static SNode sourceNodeQuery_1217888364925(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "exception", true);
  }

  public static SNode sourceNodeQuery_1232620844723(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "logExpression", true);
  }

  public static SNode sourceNodeQuery_1239355688294(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "exception", true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1187224198430(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    SNode outputNode = _context.getCopiedOutputNodeForInputNode(_context.getNode());
    if (outputNode == null) {
      _context.showErrorMessage(_context.getNode(), "Can't find copy of the class concept in the target model");
    }
    return outputNode;
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1232620727261(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    SNode outputNode = _context.getCopiedOutputNodeForInputNode(_context.getNode());
    if (outputNode == null) {
      _context.showErrorMessage(_context.getNode(), "Can't find copy of the class concept in the target model");
    }
    return outputNode;
  }

}
