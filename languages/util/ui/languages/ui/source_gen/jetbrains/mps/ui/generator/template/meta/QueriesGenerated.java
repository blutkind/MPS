package jetbrains.mps.ui.generator.template.meta;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.ui.generator.template.helper.SessionObjects;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.MapSrcMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_7930737280446985751(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    if (ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "constraint", true)).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode c) {
        return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.as(c, "jetbrains.mps.ui.modeling.structure.AspectParameterRef"), "parameterDecl", false), "aspectDef", false);
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode def) {
        return (def != null) && !(SPropertyOperations.getBoolean(def, "optional"));
      }
    }).subtract(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.ContextBindingWrapper", false, false), "childAspect", true)).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode ca) {
        return SLinkOperations.getTarget(ca, "definition", false);
      }
    })).isEmpty()) {
      return false;
    }
    _context.showErrorMessage(_context.getNode(), "no constraint value found");
    return true;
  }

  public static boolean baseMappingRule_Condition_8568902829141717126(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    final SNode local = SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a0a0b().createNode(), "classifier", false);
    return SNodeOperations.getModel(SLinkOperations.getTarget(_context.getNode(), "classifier", false)) != SNodeOperations.getModel(_context.getNode()) && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "classifier", false), "annotation", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode a) {
        return SLinkOperations.getTarget(a, "annotation", false) == local;
      }
    });
  }

  public static boolean baseMappingRule_Condition_600037073069865905(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    final SNode local = SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a0a0c().createNode(), "classifier", false);
    return SNodeOperations.getModel(SLinkOperations.getTarget(_context.getNode(), "classifier", false)) != SNodeOperations.getModel(_context.getNode()) && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "classifier", false), "annotation", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode a) {
        return SLinkOperations.getTarget(a, "annotation", false) == local;
      }
    });
  }

  public static boolean baseMappingRule_Condition_2459884175396346605(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    final SNode local = SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a0a0d().createNode(), "classifier", false);
    return SNodeOperations.getModel(SLinkOperations.getTarget(_context.getNode(), "baseMethodDeclaration", false)) != SNodeOperations.getModel(_context.getNode()) && ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(_context.getNode(), "baseMethodDeclaration", false)), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "annotation", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode a) {
        return SLinkOperations.getTarget(a, "annotation", false) == local;
      }
    });
  }

  public static boolean baseMappingRule_Condition_8568902829142100954(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "annotation", false) == SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a0a0e().createNode(), "classifier", false);
  }

  public static Object propertyMacro_GetPropertyValue_8504596698668712449(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode ctx = SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.ContextWrapper", false, false), "context", true);
    String key = SPropertyOperations.getString(SNodeOperations.as(ctx, "jetbrains.mps.baseLanguageInternal.structure.InternalVariableReference"), "name");
    String uniq = _context.createUniqueName(SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "auxObjectTemplate", false), "name"), SNodeOperations.getAncestor(_context.getNode(), null, false, true));
    SessionObjects.VARIABLE_NAME.associate(_context, SLinkOperations.getTarget(_context.getNode(), "auxObjectTemplate", false), key, uniq);
    return uniq;
  }

  public static Object referenceMacro_GetReferent_600037073069775571(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "classifier", false), "name");
  }

  public static Object referenceMacro_GetReferent_600037073069870903(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "classifier", false), "name");
  }

  public static Object referenceMacro_GetReferent_2459884175396356719(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(_context.getNode(), "baseMethodDeclaration", false)), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "name");
  }

  public static boolean ifMacro_Condition_8504596698668712497(final IOperationContext operationContext, final IfMacroContext _context) {
    return (int) ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "auxObjectTemplate", false), "factory", true), "body", true), "statement", true)).count() == 1;
  }

  public static SNode sourceNodeQuery_6927073291915224712(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.ContextViewWrapper", false, false), "view", true);
  }

  public static SNode sourceNodeQuery_6927073291915224730(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.ContextViewWrapper", false, false), "view", true);
  }

  public static SNode sourceNodeQuery_3526861840635687326(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.IContextWrapper", false, false), "context", true);
  }

  public static SNode sourceNodeQuery_2459884175401090429(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.ContextBindingWrapper", false, false), "before", true);
  }

  public static SNode sourceNodeQuery_3526861840635687339(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.IContextWrapper", false, false), "context", true);
  }

  public static SNode sourceNodeQuery_6927073291915302146(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.ContextControllerWrapper", false, false), "controller", true);
  }

  public static SNode sourceNodeQuery_3526861840635687352(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.ContextBindingWrapper", false, false), "uiObject", true);
  }

  public static SNode sourceNodeQuery_5572604531249753671(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    final SNode def = SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "parameterDecl", false), "aspectDef", false);
    return SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.ContextBindingWrapper", false, false), "childAspect", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode ca) {
        return SLinkOperations.getTarget(ca, "definition", false) == def;
      }
    }), "value", true);
  }

  public static SNode sourceNodeQuery_3526861840635687388(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.IContextWrapper", false, false), "context", true);
  }

  public static SNode sourceNodeQuery_8173290311769073791(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "uiObject", true);
  }

  public static SNode sourceNodeQuery_8504596698668712407(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.copyNode(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "geometry", false), "layoutCode", true), "body", true));
  }

  public static SNode sourceNodeQuery_8504596698668712421(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.ContextWrapper", false, false), "context", true);
  }

  public static SNode sourceNodeQuery_8504596698668712440(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "auxObjectTemplate", false), "runtimeType", true);
  }

  public static SNode sourceNodeQuery_8504596698668712522(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.copyNode(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "auxObjectTemplate", false), "factory", true), "body", true));
  }

  public static SNode sourceNodeQuery_8504596698668712539(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.copyNode(SLinkOperations.getTarget(SNodeOperations.as(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "auxObjectTemplate", false), "factory", true), "body", true), "statement", true)).first(), "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true));
  }

  public static SNode sourceNodeQuery_8504596698668712560(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.internal.structure.ContextWrapper", false, false), "context", true);
  }

  public static Iterable sourceNodesQuery_600037073069775581(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_600037073069870931(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "actualArgument", true);
  }

  public static Iterable sourceNodesQuery_600037073069870919(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "method", true);
  }

  public static Iterable sourceNodesQuery_600037073069870945(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "typeParameter", true);
  }

  public static Iterable sourceNodesQuery_2459884175396356752(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "actualArgument", true);
  }

  public static Iterable sourceNodesQuery_2459884175396356742(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "typeParameter", true);
  }

  public static SNode mapSrcMacro_mapper_6991444902044075339(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.ui.modeling.structure.ContextUIObjectParam", null);
  }

  public static SNode mapSrcMacro_mapper_8504596698668712403(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return _context.getNode();
  }

  public static SNode mapSrcMacro_mapper_8504596698668712518(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return _context.getNode();
  }

  public static SNode mapSrcMacro_mapper_8504596698668712535(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return _context.getNode();
  }

  public static class QuotationClass_x583g4_a0a0a0b {
    public QuotationClass_x583g4_a0a0a0b() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:51efe78a-da84-4c87-b8b1-cd2e544fddd2(jetbrains.mps.ui.modeling.ann)"), SNodeId.fromString("8568902829141635451")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0a0c {
    public QuotationClass_x583g4_a0a0a0c() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:51efe78a-da84-4c87-b8b1-cd2e544fddd2(jetbrains.mps.ui.modeling.ann)"), SNodeId.fromString("8568902829141635451")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0a0d {
    public QuotationClass_x583g4_a0a0a0d() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:51efe78a-da84-4c87-b8b1-cd2e544fddd2(jetbrains.mps.ui.modeling.ann)"), SNodeId.fromString("8568902829141635451")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0a0e {
    public QuotationClass_x583g4_a0a0a0e() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:51efe78a-da84-4c87-b8b1-cd2e544fddd2(jetbrains.mps.ui.modeling.ann)"), SNodeId.fromString("8568902829141635451")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
