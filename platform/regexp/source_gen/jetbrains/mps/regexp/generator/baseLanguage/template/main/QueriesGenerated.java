package jetbrains.mps.regexp.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.regexp.generator.baseLanguage.template.util.GeneratorUtil;
import jetbrains.mps.regexp.structure.MatchParensRegexp;
import java.util.ArrayList;
import jetbrains.mps.regexp.RegexpProcessor;
import jetbrains.mps.regexp.structure.Regexp;
import jetbrains.mps.regexp.constraints.Regexp_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.regex.Pattern;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

public class QueriesGenerated {

  public static boolean createRootRule_Condition_1194610104145(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    SModel smodel = _context.getGenerator().getSourceModel();
    return SequenceOperations.getSize(SModelOperations.getNodes(smodel, "jetbrains.mps.regexp.structure.InlineRegexpExpression")) > 0;
  }

  public static boolean baseMappingRule_Condition_1174659423207(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.MatchRegexpStatement");
  }

  public static boolean baseMappingRule_Condition_1174659531465(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.ReplaceWithRegexpExpression");
  }

  public static boolean baseMappingRule_Condition_1175155943336(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.ForEachMatchStatement");
  }

  public static boolean baseMappingRule_Condition_1175170005292(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.FindMatchStatement");
  }

  public static Object propertyMacro_GetPropertyValue_1174655313358(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + SequenceOperations.getSize(nodes);
  }

  public static Object propertyMacro_GetPropertyValue_1174655168104(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + SequenceOperations.getSize(nodes);
  }

  public static Object propertyMacro_GetPropertyValue_1174565617595(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode parens = SLinkOperations.getTarget(_context.getNode(), "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(_context.getNode());
    List<MatchParensRegexp> matchparens = new ArrayList<MatchParensRegexp>();
    RegexpProcessor.toString(((Regexp)SNodeOperations.getAdapter(SLinkOperations.getTarget(SLinkOperations.getTarget(c, "regexp", true), "regexp", true))), matchparens);
    return "" + (1 + matchparens.indexOf(((MatchParensRegexp)SNodeOperations.getAdapter(parens))));
  }

  public static Object propertyMacro_GetPropertyValue_1174658262046(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getGenerator().getGeneratorSessionContext().createUniqueName("_Replacer");
  }

  public static Object propertyMacro_GetPropertyValue_1174659618559(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode parens = SLinkOperations.getTarget(_context.getNode(), "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(_context.getNode());
    List<MatchParensRegexp> matchparens = new ArrayList<MatchParensRegexp>();
    RegexpProcessor.toString(((Regexp)SNodeOperations.getAdapter(SLinkOperations.getTarget(SLinkOperations.getTarget(c, "regexp", true), "regexp", true))), matchparens);
    return "" + (1 + matchparens.indexOf(((MatchParensRegexp)SNodeOperations.getAdapter(parens))));
  }

  public static Object propertyMacro_GetPropertyValue_1175155526348(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + SequenceOperations.getSize(nodes);
  }

  public static Object propertyMacro_GetPropertyValue_1175155558088(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + SequenceOperations.getSize(nodes);
  }

  public static Object propertyMacro_GetPropertyValue_1175155997050(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode parens = SLinkOperations.getTarget(_context.getNode(), "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(_context.getNode());
    List<MatchParensRegexp> matchparens = new ArrayList<MatchParensRegexp>();
    RegexpProcessor.toString(((Regexp)SNodeOperations.getAdapter(SLinkOperations.getTarget(SLinkOperations.getTarget(c, "regexp", true), "regexp", true))), matchparens);
    return "" + (1 + matchparens.indexOf(((MatchParensRegexp)SNodeOperations.getAdapter(parens))));
  }

  public static Object propertyMacro_GetPropertyValue_1175169642723(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + SequenceOperations.getSize(nodes);
  }

  public static Object propertyMacro_GetPropertyValue_1175169648262(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + SequenceOperations.getSize(nodes);
  }

  public static Object propertyMacro_GetPropertyValue_1175170026397(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode parens = SLinkOperations.getTarget(_context.getNode(), "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(_context.getNode());
    List<MatchParensRegexp> matchparens = new ArrayList<MatchParensRegexp>();
    RegexpProcessor.toString(((Regexp)SNodeOperations.getAdapter(SLinkOperations.getTarget(SLinkOperations.getTarget(c, "regexp", true), "regexp", true))), matchparens);
    return "" + (1 + matchparens.indexOf(((MatchParensRegexp)SNodeOperations.getAdapter(parens))));
  }

  public static Object propertyMacro_GetPropertyValue_1194610282338(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Regexp_Behavior.call_toString_1177760132955(SLinkOperations.getTarget(_context.getNode(), "regexp", true));
  }

  public static Object propertyMacro_GetPropertyValue_1194610282348(final IOperationContext operationContext, final PropertyMacroContext _context) {
    int result = 0;
    if(SPropertyOperations.getBoolean(_context.getNode(), "multiLine")) {
      result = result + Pattern.MULTILINE;
    }
    if(SPropertyOperations.getBoolean(_context.getNode(), "dotAll")) {
      result = result + Pattern.DOTALL;
    }
    if(SPropertyOperations.getBoolean(_context.getNode(), "caseInsensitive")) {
      result = result + Pattern.CASE_INSENSITIVE;
    }
    return "" + result;
  }

  public static Object propertyMacro_GetPropertyValue_1194610650675(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getGenerator().getGeneratorSessionContext().createUniqueName("REGEXP");
  }

  public static Object referenceMacro_GetReferent_1194610323562(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode(), "precompiledRegexp");
  }

  public static Object referenceMacro_GetReferent_1174655509856(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return GeneratorUtil.findOutputMatcher(_context.getGenerator(), _context.getNode());
  }

  public static Object referenceMacro_GetReferent_1175155997041(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return GeneratorUtil.findOutputMatcher(_context.getGenerator(), _context.getNode());
  }

  public static Object referenceMacro_GetReferent_1175170026388(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return GeneratorUtil.findOutputMatcher(_context.getGenerator(), _context.getNode());
  }

  public static SNode sourceNodeQuery_1174512824855(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1174512909652(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1174512937325(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1174659183903(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1174659193709(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1174659237673(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "replaceBlock", true);
  }

  public static SNode sourceNodeQuery_1174658308251(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1175155573909(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1175155635929(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1175155725139(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1175164955452(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1175164958475(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1175169696431(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1175169704904(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1175169838691(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1179358309388(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1179358364442(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inputExpression", true);
  }

  public static List sourceNodesQuery_1194610249636(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getSourceModel(), "jetbrains.mps.regexp.structure.InlineRegexpExpression");
  }

}
