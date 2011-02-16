package jetbrains.mps.lang.plugin.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.textGen.structure.TextGen_Language;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class MoveTraceInfoToTextGen_MigrationScript extends BaseMigrationScript {
  public MoveTraceInfoToTextGen_MigrationScript(IOperationContext operationContext) {
    super("Upgrade Trace Info Generation");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Trace Info Generation Is Done Via Behavior And TextGen";
      }

      public String getAdditionalInfo() {
        return "Trace Info Generation Is Done Via Behavior And TextGen";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.plugin.structure.DebugInfoInitializer";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
        if (ListSequence.fromList(SLinkOperations.getTargets(node, "conceptsToDebug", true)).isNotEmpty() && ListSequence.fromList(SModelOperations.getRoots(SNodeOperations.getModel(node), "jetbrains.mps.debug.apiLang.structure.DebugInfoProvider")).isEmpty() && ListSequence.fromList(SLinkOperations.getTargets(node, "conceptsToDebug", true)).findFirst(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, "createBreakpoint", true) != null);
          }
        }) != null) {
          SNode debugInfoProvider = SConceptOperations.createNewNode("jetbrains.mps.debug.apiLang.structure.DebugInfoProvider", null);
          SModelOperations.addRootNode(SNodeOperations.getModel(node), debugInfoProvider);
          for (SNode conceptToDebug : ListSequence.fromList(SLinkOperations.getTargets(node, "conceptsToDebug", true))) {
            ListSequence.fromList(SLinkOperations.getTargets(debugInfoProvider, "breakpointableConcepts", true)).addElement(new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a0a0a0c0a0e0a0a0b0a().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(conceptToDebug, "createBreakpoint", true), "body", true), SLinkOperations.getTarget(conceptToDebug, "declaration", false), SLinkOperations.getTarget(conceptToDebug, "declaration", false)));
            SNodeOperations.deleteNode(SLinkOperations.getTarget(conceptToDebug, "createBreakpoint", true));
          }
          for (SNode projectRef : ListSequence.fromList(SNodeOperations.getDescendants(debugInfoProvider, "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_Debug_Project", false, new String[]{}))) {
            SNodeOperations.replaceWithAnother(projectRef, SConceptOperations.createNewNode("jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_Debug_Project", null));
          }
          for (SNode nodeRef : ListSequence.fromList(SNodeOperations.getDescendants(debugInfoProvider, "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_DebuggableNode", false, new String[]{}))) {
            SNodeOperations.replaceWithAnother(nodeRef, SConceptOperations.createNewNode("jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_DebuggableNode", null));
          }

        }

        _FunctionTypes._return_P1_E0<? extends SNode, ? super SNode> getOrCreateBehavior = new _FunctionTypes._return_P1_E0<SNode, SNode>() {
          public SNode invoke(SNode conceptDeclaration) {
            SNode behaviorNode = (SNode) AbstractConceptDeclaration_Behavior.call_findConceptAspect_8360039740498068384(conceptDeclaration, LanguageAspect.BEHAVIOR);
            if (behaviorNode != null) {
              return behaviorNode;
            }
            SModelDescriptor behaviorModel = LanguageAspect.BEHAVIOR.get((Language) (SNodeOperations.getModel(conceptDeclaration).getModelDescriptor().getModule()));
            if (behaviorModel == null) {
              behaviorModel = LanguageAspect.BEHAVIOR.createNew((Language) (SNodeOperations.getModel(conceptDeclaration).getModelDescriptor().getModule()));

            }
            behaviorNode = SModelOperations.createNewRootNode(((SModel) behaviorModel.getSModel()), "jetbrains.mps.lang.behavior.structure.ConceptBehavior", null);
            SLinkOperations.setTarget(behaviorNode, "concept", conceptDeclaration, false);
            SLinkOperations.setNewChild(behaviorNode, "constructor", "jetbrains.mps.lang.behavior.structure.ConceptConstructorDeclaration");
            SLinkOperations.setNewChild(SLinkOperations.getTarget(behaviorNode, "constructor", true), "body", "jetbrains.mps.baseLanguage.structure.StatementList");
            return behaviorNode;
          }
        };

        SNodeOperations.getModel(node).getModelDescriptor().getModule().addDependency(TextGen_Language.MODULE_REFERENCE, false);

        // traceable concepts 
        for (SNode traceableConcept : ListSequence.fromList(SLinkOperations.getTargets(node, "conceptsToDebug", true)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(it, "declaration", false), "implements", true)).findFirst(new IWhereFilter<SNode>() {
              public boolean accept(SNode interfaceRef) {
                return eq_3y9ork_a0a0a0a0a0a0a0a0a0a7a4a0a0a1a0(SLinkOperations.getTarget(interfaceRef, "intfc", false), SLinkOperations.getTarget(new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a0a0a0a0a0a0a0a7a4a0a0a1a0().createNode(), "intfc", false));
              }
            }) == null;
          }
        })) {
          SNode conceptDeclaration = SLinkOperations.getTarget(traceableConcept, "declaration", false);
          ListSequence.fromList(SLinkOperations.getTargets(conceptDeclaration, "implements", true)).addElement(new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a0a0b0h0e0a0a0b0a().createNode());
          if ((SLinkOperations.getTarget(traceableConcept, "propertyStringGetter", true) != null)) {
            SNode conceptBehavior = getOrCreateBehavior.invoke(conceptDeclaration);
            SNode methodImpl = new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a0a1a2a7a4a0a0a1a0().createNode();
            SLinkOperations.setTarget(methodImpl, "body", SNodeOperations.copyNode(SLinkOperations.getTarget(SLinkOperations.getTarget(traceableConcept, "propertyStringGetter", true), "body", true)), true);
            ListSequence.fromList(SLinkOperations.getTargets(conceptBehavior, "method", true)).addElement(methodImpl);
            for (SNode debuggableNode : ListSequence.fromList(SNodeOperations.getDescendants(methodImpl, "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_DebuggableNode", false, new String[]{}))) {
              SNodeOperations.replaceWithAnother(debuggableNode, new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a1a0a4a2a7a4a0a0a1a0().createNode());
            }
          }
        }

        // scope concepts 
        for (SNode scopeConcept : ListSequence.fromList(SLinkOperations.getTargets(node, "scopeConcepts", true)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(it, "scopeConcept", false), "implements", true)).findFirst(new IWhereFilter<SNode>() {
              public boolean accept(SNode interfaceRef) {
                return eq_3y9ork_a0a0a0a0a0a0a0a0a0a01a4a0a0a1a0(SLinkOperations.getTarget(interfaceRef, "intfc", false), SLinkOperations.getTarget(new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a0a0a0a0a0a0a0a01a4a0a0a1a0().createNode(), "intfc", false));
              }
            }) == null;
          }
        })) {
          SNode conceptDeclaration = SLinkOperations.getTarget(scopeConcept, "scopeConcept", false);
          ListSequence.fromList(SLinkOperations.getTargets(conceptDeclaration, "implements", true)).addElement(new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a0a0b0k0e0a0a0b0a().createNode());
          SNode conceptBehavior = getOrCreateBehavior.invoke(conceptDeclaration);
          SNode methodImpl = new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a0a3a01a4a0a0a1a0().createNode();
          SLinkOperations.setTarget(methodImpl, "body", SNodeOperations.copyNode(SLinkOperations.getTarget(SLinkOperations.getTarget(scopeConcept, "variablesGetter", true), "body", true)), true);
          ListSequence.fromList(SLinkOperations.getTargets(conceptBehavior, "method", true)).addElement(methodImpl);
          for (SNode scopeNode : ListSequence.fromList(SNodeOperations.getDescendants(methodImpl, "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_ScopeNode", false, new String[]{}))) {
            SNodeOperations.replaceWithAnother(scopeNode, new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a1a0a6a01a4a0a0a1a0().createNode());
          }
        }

        // unit concepts 
        for (SNode unitConcept : ListSequence.fromList(SLinkOperations.getTargets(node, "unitConcepts", true)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(it, "unitConcept", false), "implements", true)).findFirst(new IWhereFilter<SNode>() {
              public boolean accept(SNode interfaceRef) {
                return eq_3y9ork_a0a0a0a0a0a0a0a0a0a31a4a0a0a1a0(SLinkOperations.getTarget(interfaceRef, "intfc", false), SLinkOperations.getTarget(new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a0a0a0a0a0a0a0a31a4a0a0a1a0().createNode(), "intfc", false));
              }
            }) == null;
          }
        })) {
          SNode conceptDeclaration = SLinkOperations.getTarget(unitConcept, "unitConcept", false);
          ListSequence.fromList(SLinkOperations.getTargets(conceptDeclaration, "implements", true)).addElement(new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a0a0b0n0e0a0a0b0a().createNode());
          SNode conceptBehavior = getOrCreateBehavior.invoke(conceptDeclaration);
          SNode methodImpl = new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a0a3a31a4a0a0a1a0().createNode();
          SLinkOperations.setTarget(methodImpl, "body", SNodeOperations.copyNode(SLinkOperations.getTarget(SLinkOperations.getTarget(unitConcept, "getUnitName", true), "body", true)), true);
          ListSequence.fromList(SLinkOperations.getTargets(conceptBehavior, "method", true)).addElement(methodImpl);
          for (SNode unitNode : ListSequence.fromList(SNodeOperations.getDescendants(methodImpl, "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_UnitNode", false, new String[]{}))) {
            SNodeOperations.replaceWithAnother(unitNode, new MoveTraceInfoToTextGen_MigrationScript.QuotationClass_3y9ork_a1a0a6a31a4a0a0a1a0().createNode());
          }
        }

        SNodeOperations.deleteNode(node);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }

  private static boolean eq_3y9ork_a0a0a0a0a0a0a0a0a0a7a4a0a0a1a0(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_3y9ork_a0a0a0a0a0a0a0a0a0a01a4a0a0a1a0(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_3y9ork_a0a0a0a0a0a0a0a0a0a31a4a0a0a1a0(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  public static class QuotationClass_3y9ork_a0a0a0c0a0e0a0a0b0a {
    public QuotationClass_3y9ork_a0a0a0c0a0e0a0a0b0a() {
    }

    public SNode createNode(Object parameter_9, Object parameter_10, Object parameter_11) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debug.apiLang.structure.BreakpointableNodeItem", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_5 = quotedNode_1;
        quotedNode1_5.setReferent("declaration", (SNode) parameter_10);
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debug.apiLang.structure.ConceptFunction_CreateBreakpoint", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_2;
          {
            quotedNode_4 = (SNode) parameter_9;
            SNode quotedNode1_7;
            if (_parameterValues_129834374.contains(quotedNode_4)) {
              quotedNode1_7 = HUtil.copyIfNecessary(quotedNode_4);
            } else {
              _parameterValues_129834374.add(quotedNode_4);
              quotedNode1_7 = quotedNode_4;
            }
            if (quotedNode1_7 != null) {
              quotedNode_2.addChild("body", HUtil.copyIfNecessary(quotedNode1_7));
            }
          }
          quotedNode_1.addChild("createBreakpoint", quotedNode1_6);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debug.apiLang.structure.ConceptDeclarationReference", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_3;
          quotedNode1_8.setReferent("conceptDeclaration", (SNode) parameter_11);
          quotedNode_1.addChild("conceptsToCreateBreakpoint", quotedNode1_8);
        }
        result = quotedNode1_5;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a0a0b0h0e0a0a0b0a {
    public QuotationClass_3y9ork_a0a0b0h0e0a0a0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.InterfaceConceptReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("intfc", quotedNode1_2, SModelReference.fromString("r:de0d3c0c-d049-41cf-bbf9-a920ba513cd3(jetbrains.mps.lang.textGen.structure)"), SNodeId.fromString("3822000666564607199")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a0a1a2a7a4a0a0a1a0 {
    public QuotationClass_3y9ork_a0a1a2a7a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      SNode quotedNode_7 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_8 = quotedNode_1;
        quotedNode1_8.setProperty("isVirtual", "true");
        quotedNode1_8.setProperty("name", "getTraceableProperty");
        quotedNode1_8.addReference(SReference.create("overriddenMethod", quotedNode1_8, SModelReference.fromString("r:0fa39ea9-f6a4-454d-9b16-ce07a09428ca(jetbrains.mps.lang.textGen.behavior)"), SNodeId.fromString("3822000666564591088")));
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_9 = quotedNode_2;
          quotedNode_1.addChild("visibility", quotedNode1_9);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnnotationInstance", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_10 = quotedNode_3;
          quotedNode1_10.addReference(SReference.create("annotation", quotedNode1_10, SModelReference.fromString("f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)"), SNodeId.fromString("~Nullable")));
          quotedNode_1.addChild("annotation", quotedNode1_10);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_11 = quotedNode_4;
          quotedNode_1.addChild("returnType", quotedNode1_11);
        }
        {
          quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_12 = quotedNode_5;
          {
            quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_13 = quotedNode_6;
            {
              quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NullLiteral", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_14 = quotedNode_7;
              quotedNode_6.addChild("expression", quotedNode1_14);
            }
            quotedNode_5.addChild("statement", quotedNode1_13);
          }
          quotedNode_1.addChild("body", quotedNode1_12);
        }
        result = quotedNode1_8;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a1a0a4a2a7a4a0a0a1a0 {
    public QuotationClass_3y9ork_a1a0a4a2a7a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.ThisNodeExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a0a0a0a0a0a0a0a7a4a0a0a1a0 {
    public QuotationClass_3y9ork_a0a0a0a0a0a0a0a7a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.InterfaceConceptReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("intfc", quotedNode1_2, SModelReference.fromString("r:de0d3c0c-d049-41cf-bbf9-a920ba513cd3(jetbrains.mps.lang.textGen.structure)"), SNodeId.fromString("3822000666564607199")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a0a0b0k0e0a0a0b0a {
    public QuotationClass_3y9ork_a0a0b0k0e0a0a0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.InterfaceConceptReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("intfc", quotedNode1_2, SModelReference.fromString("r:de0d3c0c-d049-41cf-bbf9-a920ba513cd3(jetbrains.mps.lang.textGen.structure)"), SNodeId.fromString("3822000666564607198")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a0a3a01a4a0a0a1a0 {
    public QuotationClass_3y9ork_a0a3a01a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_7 = quotedNode_1;
        quotedNode1_7.setProperty("isVirtual", "true");
        quotedNode1_7.setProperty("name", "getScopeVariables");
        quotedNode1_7.addReference(SReference.create("overriddenMethod", quotedNode1_7, SModelReference.fromString("r:0fa39ea9-f6a4-454d-9b16-ce07a09428ca(jetbrains.mps.lang.textGen.behavior)"), SNodeId.fromString("3822000666564591100")));
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_2;
          quotedNode_1.addChild("visibility", quotedNode1_8);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_9 = quotedNode_3;
          quotedNode1_9.addReference(SReference.create("elementConcept", quotedNode1_9, SModelReference.fromString("r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)"), SNodeId.fromString("1169194658468")));
          quotedNode_1.addChild("returnType", quotedNode1_9);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_10 = quotedNode_4;
          {
            quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_11 = quotedNode_5;
            {
              quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NullLiteral", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_12 = quotedNode_6;
              quotedNode_5.addChild("expression", quotedNode1_12);
            }
            quotedNode_4.addChild("statement", quotedNode1_11);
          }
          quotedNode_1.addChild("body", quotedNode1_10);
        }
        result = quotedNode1_7;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a1a0a6a01a4a0a0a1a0 {
    public QuotationClass_3y9ork_a1a0a6a01a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.ThisNodeExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a0a0a0a0a0a0a0a01a4a0a0a1a0 {
    public QuotationClass_3y9ork_a0a0a0a0a0a0a0a01a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.InterfaceConceptReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("intfc", quotedNode1_2, SModelReference.fromString("r:de0d3c0c-d049-41cf-bbf9-a920ba513cd3(jetbrains.mps.lang.textGen.structure)"), SNodeId.fromString("3822000666564607198")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a0a0b0n0e0a0a0b0a {
    public QuotationClass_3y9ork_a0a0b0n0e0a0a0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.InterfaceConceptReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("intfc", quotedNode1_2, SModelReference.fromString("r:de0d3c0c-d049-41cf-bbf9-a920ba513cd3(jetbrains.mps.lang.textGen.structure)"), SNodeId.fromString("3822000666564607196")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a0a3a31a4a0a0a1a0 {
    public QuotationClass_3y9ork_a0a3a31a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_7 = quotedNode_1;
        quotedNode1_7.setProperty("isVirtual", "true");
        quotedNode1_7.setProperty("name", "getUnitName");
        quotedNode1_7.addReference(SReference.create("overriddenMethod", quotedNode1_7, SModelReference.fromString("r:0fa39ea9-f6a4-454d-9b16-ce07a09428ca(jetbrains.mps.lang.textGen.behavior)"), SNodeId.fromString("3822000666564591112")));
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_2;
          quotedNode_1.addChild("visibility", quotedNode1_8);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_9 = quotedNode_3;
          quotedNode_1.addChild("returnType", quotedNode1_9);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_10 = quotedNode_4;
          {
            quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_11 = quotedNode_5;
            {
              quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NullLiteral", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_12 = quotedNode_6;
              quotedNode_5.addChild("expression", quotedNode1_12);
            }
            quotedNode_4.addChild("statement", quotedNode1_11);
          }
          quotedNode_1.addChild("body", quotedNode1_10);
        }
        result = quotedNode1_7;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a1a0a6a31a4a0a0a1a0 {
    public QuotationClass_3y9ork_a1a0a6a31a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.ThisNodeExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3y9ork_a0a0a0a0a0a0a0a31a4a0a0a1a0 {
    public QuotationClass_3y9ork_a0a0a0a0a0a0a0a31a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.InterfaceConceptReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("intfc", quotedNode1_2, SModelReference.fromString("r:de0d3c0c-d049-41cf-bbf9-a920ba513cd3(jetbrains.mps.lang.textGen.structure)"), SNodeId.fromString("3822000666564607196")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
