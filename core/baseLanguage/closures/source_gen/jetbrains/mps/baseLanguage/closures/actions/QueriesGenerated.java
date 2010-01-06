package jetbrains.mps.baseLanguage.closures.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.search.VisibleClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import java.util.List;
import jetbrains.mps.util.Condition;
import jetbrains.mps.baseLanguage.closures.behavior.ControlMethodUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class QueriesGenerated {
  public static boolean nodeSubstituteActionsBuilder_Precondition_ThisExpression_1199651311977(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return false && (SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", true, false) != null);
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_1199711420040(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return (SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false) != null);
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_1200829970134(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    // return statements must be allowed until we find a way to implement early returns 
    // http://www.javac.info 
    return false && (SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", true, false) != null);
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_1201777188086(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    SNode anc = SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"}, true, false);
    return !(SNodeOperations.isInstanceOf(anc, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"));
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_1229704835784(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    VisibleClassifiersScope scope = new VisibleClassifiersScope(_context.getModel(), IClassifiersSearchScope.STATIC_METHOD, operationContext.getScope());
    List<SNode> nodes = scope.getNodes(new Condition<SNode>() {
      public boolean met(SNode smd) {
        return ControlMethodUtil.isControlMethod(smd);
      }
    });
    return !(ListSequence.fromList(nodes).isEmpty());
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_ClosureControlStatement_1232456372775(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getSourceNode(), "actualParameter", true)).count() == 0 && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getSourceNode(), "controlClosure", true), "parameter", true)).count() == 0;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1235747455803(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SConceptOperations.isSubConceptOf(SNodeOperations.getConceptDeclaration(TypeChecker.getInstance().getTypeOf(_context.getSourceNode())), "jetbrains.mps.baseLanguage.closures.structure.FunctionType");
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1236794030042(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SNodeOperations.getIndexInParent(_context.getSourceNode()) == 0 && SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement") && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement"), "controlClosure", true), "parameter", true)).count() == 0;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_ClosureControlStatement_1236960289987(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getSourceNode(), "actualParameter", true)).count() == 0 && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getSourceNode(), "controlClosure", true), "parameter", true)).count() > 0;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Type_2324090868901293319(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    SNode parent = SNodeOperations.getParent(_context.getSourceNode());
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType"), "terminateType", true) == _context.getSourceNode() && (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType"), "throwsType", true)).isEmpty());
    }
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.closures.structure.FunctionType")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "resultType", true) == _context.getSourceNode() && (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "throwsType", true)).isEmpty());
    }
    return false;
  }

  public static void nodeFactory_NodeSetup_UnrestrictedFunctionType_1232132222405(final IOperationContext operationContext, final NodeSetupContext _context) {
    SLinkOperations.setNewChild(_context.getNewNode(), "resultType", "jetbrains.mps.baseLanguage.structure.VoidType");
  }

  public static void nodeFactory_NodeSetup_ClosureLiteral_876385242039333160(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
      int idx = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.IMethodCall"), "actualArgument", true)).indexOf(_context.getNewNode());
      if (idx >= 0) {
        List<SNode> params = SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.IMethodCall"), "baseMethodDeclaration", false), "parameter", true);
        if (idx < ListSequence.fromList(params).count()) {
          SNode pdtype = SLinkOperations.getTarget(ListSequence.fromList(params).getElement(idx), "type", true);
          if (SNodeOperations.isInstanceOf(pdtype, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
            List<SNode> methods = SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(pdtype, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "method", true);
            if (ListSequence.fromList(methods).count() == 1) {
              SNode adaptTo = ListSequence.fromList(methods).getElement(0);
              // TODO: generic parameters 
              for (SNode adaptToPD : SLinkOperations.getTargets(adaptTo, "parameter", true)) {
                SNode pd = ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null));
                SPropertyOperations.set(pd, "name", SPropertyOperations.getString(adaptToPD, "name"));
                SLinkOperations.setTarget(pd, "type", SLinkOperations.getTarget(adaptToPD, "type", true), true);
              }
            }
          }
        }
      }
    }
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ThisExpression_1199651306154(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1199711415359(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.InvokeExpression");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1200829964795(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1201777172707(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1229704829046(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            VisibleClassifiersScope scope = new VisibleClassifiersScope(_context.getModel(), IClassifiersSearchScope.STATIC_METHOD, operationContext.getScope());
            List<SNode> nodes = scope.getNodes(new Condition<SNode>() {
              public boolean met(SNode smd) {
                return ControlMethodUtil.isControlMethod(smd);
              }
            });
            return nodes;
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode ccs = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement", null);
                SLinkOperations.setTarget(ccs, "controlMethod", (item), false);
                SLinkOperations.setNewChild(ccs, "controlClosure", "jetbrains.mps.baseLanguage.closures.structure.ControlClosureLiteral");
                return ccs;
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return "custom control statement using " + INamedConcept_Behavior.call_getFqName_1213877404258((item));
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_ClosureControlStatement_1232456365573(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SLinkOperations.addNewChild(_context.getSourceNode(), "actualParameter", "jetbrains.mps.baseLanguage.structure.Expression");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "(";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "add parameter";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1235747446457(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          return SNodeOperations.replaceWithAnother(_context.getSourceNode(), new QueriesGenerated.QuotationClass_8087_0().createNode(_context.getSourceNode()));
        }

        public String getMatchingText(String pattern) {
          return "(";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "invoke function";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1236794002431(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SLinkOperations.addNewChild(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement"), "controlClosure", true), "parameter", "jetbrains.mps.baseLanguage.structure.ParameterDeclaration");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return ":";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "add formal parameter";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_ClosureControlStatement_1236960289986(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SLinkOperations.addNewChild(_context.getSourceNode(), "actualParameter", "jetbrains.mps.baseLanguage.structure.Expression");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return ":";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "add parameter";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Type_2324090868901292790(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SLinkOperations.addNewChild(SNodeOperations.cast(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "throwsType", "jetbrains.mps.baseLanguage.structure.ClassifierType");
          return ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "throwsType", true)).first();
        }

        public String getMatchingText(String pattern) {
          return "throws";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static class QuotationClass_8087_0 {
    public QuotationClass_8087_0() {
    }

    public SNode createNode(Object parameter_4028_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0 = null;
      SNode quotedNode_1 = null;
      {
        quotedNode_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0 = quotedNode_0;
        {
          quotedNode_1 = (SNode) parameter_4028_0;
          SNode quotedNode1_1;
          if (_parameterValues_129834374.contains(quotedNode_1)) {
            quotedNode1_1 = CopyUtil.copy(quotedNode_1);
          } else {
            _parameterValues_129834374.add(quotedNode_1);
            quotedNode1_1 = quotedNode_1;
          }
          if (quotedNode1_1 != null) {
            quotedNode_0.addChild("function", HUtil.copyIfNecessary(quotedNode1_1));
          }
        }
        result = quotedNode1_0;
      }
      return result;
    }
  }
}
