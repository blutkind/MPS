package jetbrains.mps.baseLanguage.tuples.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.baseLanguage.search.VisibleClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.util.Condition;
import jetbrains.mps.baseLanguage.tuples.constraints.TupleIntefaceUtils;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_IOperation_1239580454767(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return (TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.as(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true)), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType"), false) != null);
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_ClassifierType_1240500098737(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration") && "extends".equals(SPropertyOperations.getString(_context.getLink(), "role"));
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1238884718191(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(_context.getSourceNode()), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleType"), false) != null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Type_1240401116348(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return !(SPropertyOperations.getBoolean(SNodeOperations.as(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentDeclaration"), "final"));
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_NamedTupleDeclaration_1240501255930(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SLinkOperations.getCount(_context.getSourceNode(), "extends") == 0;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_NamedTupleDeclaration_1240501315568(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SLinkOperations.getCount(_context.getSourceNode(), "extends") == 0;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_InterfaceTupleType_1240704192041(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SLinkOperations.getCount(_context.getSourceNode(), "parameterType") == 0;
  }

  public static void nodeFactory_NodeSetup_NamedTupleLiteral_1239567483801(final IOperationContext operationContext, final NodeSetupContext _context) {
    for(SNode cd : SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNewNode(), "tupleDeclaration", false), "component", true)) {
      SLinkOperations.setTarget(SLinkOperations.addChild(_context.getNewNode(), "componentRef", SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentReference", null)), "componentDeclaration", cd, false);
    }
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_IOperation_1239580440685(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ClassifierType_1240500090073(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return (List<SNode>)new VisibleClassifiersScope(_context.getModel(), IClassifiersSearchScope.INTERFACE, operationContext.getScope()).getNodes(new Condition <SNode>() {

              public boolean met(SNode node) {
                return TupleIntefaceUtils.isTupleInterface((SNode)node);
              }
            });
          }
        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                return new _Quotations.QuotationClass_0().createNode((item));
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1238884711273(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleMemberAccessExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SNode mae = SNodeOperations.replaceWithAnother(_context.getSourceNode(), SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleMemberAccessExpression", null));
          SLinkOperations.setTarget(mae, "tuple", _context.getSourceNode(), true);
          return mae;
        }

        public String getMatchingText(String pattern) {
          return "[";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "access tuple member by index";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Type_1240401099703(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentDeclaration");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SPropertyOperations.set(SNodeOperations.as(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentDeclaration"), "final", "" + true);
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "final";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_NamedTupleDeclaration_1240501250120(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SLinkOperations.addNewChild(_context.getSourceNode(), "extends", "jetbrains.mps.baseLanguage.structure.ClassifierType");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "extends";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_NamedTupleDeclaration_1240501306093(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SLinkOperations.addNewChild(_context.getSourceNode(), "extends", "jetbrains.mps.baseLanguage.structure.ClassifierType");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "extends";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_InterfaceTupleType_1240704174183(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.InterfaceTupleType");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SLinkOperations.addNewChild(_context.getSourceNode(), "parameterType", "jetbrains.mps.baseLanguage.structure.Type");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "<";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

}
