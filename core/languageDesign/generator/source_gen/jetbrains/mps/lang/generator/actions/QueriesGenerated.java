package jetbrains.mps.lang.generator.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.smodel.action.RemoveSubstituteActionByConditionContext;
import java.util.Iterator;
import jetbrains.mps.util.Condition;
import jetbrains.mps.util.NameUtil;

public class QueriesGenerated {
  public static boolean nodeSubstituteActionsBuilder_Precondition_RuleConsequence_1169582381136(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.lang.generator.structure.Weaving_MappingRule");
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_RuleConsequence_1195244660444(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.lang.generator.structure.Reduction_MappingRule");
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_8421689336187916452(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.lang.generator.structure.ITemplateCall");
  }

  public static void nodeFactory_NodeSetup_NodeMacro_1207674454117(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.generator.structure.NodeMacro")) {
      SLinkOperations.setTarget(_context.getNewNode(), "mappingLabel", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.generator.structure.NodeMacro"), "mappingLabel", false), false);
    }
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_RuleConsequence_1169570930693(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.WeaveEach_RuleConsequence");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_RuleConsequence_1195244607537(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.InlineSwitch_RuleConsequence");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_8421689336187916451(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    return result;
  }

  public static void removeActionsByCondition_8421689336187917123(final IOperationContext operationContext, final RemoveSubstituteActionByConditionContext _context) {
    Iterator<INodeSubstituteAction> actions = _context.getActions();
    while (actions.hasNext()) {
      INodeSubstituteAction current = actions.next();
      final SNode concept = current.getOutputConcept();
      SNode applicableConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression");
      Condition cond = new Condition() {
        public boolean met(Object object) {
          return concept != SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.NullLiteral") && concept != SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant") && concept != SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral") && concept != SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant") && !(SConceptOperations.isSubConceptOf(concept, "jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef")) && !(SConceptOperations.isSubConceptOf(concept, "jetbrains.mps.lang.generator.structure.TemplateArgumentQueryExpression")) && concept != SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateArgumentParameterExpression");

        }
      };
      if (SConceptOperations.isSuperConceptOf(applicableConcept, NameUtil.nodeFQName(concept)) && cond.met(concept)) {
        actions.remove();
      }
    }
  }
}
