package jetbrains.mps.smodel.action;

import jetbrains.mps.bootstrap.actionsLanguage.structure.*;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.Condition;
import jetbrains.mps.util.QueryMethodGenerated;
import jetbrains.mps.ide.command.CommandProcessor;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: Jan 24, 2006
 * Time: 8:58:32 PM
 * To change this template use File | Settings | File Templates.
 */
/*package*/ class RTransformHintSubstituteActionsHelper {

  private static final Logger LOG = Logger.getLogger(RTransformHintSubstituteActionsHelper.class);

  public static boolean canCreateActions(SNode sourceNode, String transformTag, IOperationContext context) {
    return getActionBuilders(sourceNode, transformTag, context).size() > 0;
  }

  public static List<INodeSubstituteAction> createActions(final SNode sourceNode,
                                                          final String transformTag,
                                                          final IOperationContext context) {
    final List<INodeSubstituteAction>[] result = new List[1];
    // enable R/O access
    CommandProcessor.instance().executeLightweightCommand(new Runnable() {
      public void run() {
        result[0] = createActions_internal(sourceNode, transformTag, context);
      }
    });

    return result[0];
  }

  public static List<INodeSubstituteAction> createActions_internal(SNode sourceNode, String transformTag, IOperationContext context) {
    List<INodeSubstituteAction> resultActions = new LinkedList<INodeSubstituteAction>();
    List<RTransformHintSubstituteActionsBuilder> actionsBuilders = getActionBuilders(sourceNode, transformTag, context);

    List<RemoveRTByConditionPart> removesByCondition = new ArrayList<RemoveRTByConditionPart>();

    Set<SNode> conceptsToRemove = new HashSet<SNode>();
    // for each builder create actions and apply all filters
    for (RTransformHintSubstituteActionsBuilder builder : actionsBuilders) {
      for (RemovePart rp : builder.getSubnodes(RemovePart.class)) {
        conceptsToRemove.add(rp.getConceptToRemove().getNode());
      }

      for (RemoveRTByConditionPart rp : builder.getSubnodes(RemoveRTByConditionPart.class)) {
        removesByCondition.add(rp);
      }

      List<INodeSubstituteAction> addActions = invokeActionFactory(builder, sourceNode, context);
      resultActions.addAll(addActions);
    }

    //remove with conditions
    for (RemoveRTByConditionPart rbc : removesByCondition) {
      invokeRemoveByCondition(rbc, resultActions.iterator(), sourceNode, context);
    }

    //remove with remove concept
    for (Iterator<INodeSubstituteAction> it = resultActions.iterator(); it.hasNext();) {
      INodeSubstituteAction action = it.next();
      Object parameterObject = action.getOutputConcept();
      if (parameterObject instanceof SNode && ((SNode) parameterObject).getAdapter() instanceof AbstractConceptDeclaration) {
        if (conceptsToRemove.contains(((SNode) parameterObject))) {
          it.remove();
        }
      } else if (parameterObject instanceof AbstractConceptDeclaration) {
        if (conceptsToRemove.contains(((AbstractConceptDeclaration) parameterObject).getNode())) {
          it.remove();
        }
      }
    }

    return resultActions;
  }

  private static List<RTransformHintSubstituteActionsBuilder> getActionBuilders(final SNode sourceNode, String transformTag, final IOperationContext context) {
    List<RTransformHintSubstituteActionsBuilder> actionsBuilders = new LinkedList<RTransformHintSubstituteActionsBuilder>();
    IScope scope = context.getScope();
    final AbstractConceptDeclaration sourceConcept = sourceNode.getConceptDeclarationAdapter();
    final RTransformTag tag = RTransformTag.parseValue(transformTag);

    List<Language> languages = sourceNode.getModel().getLanguages(scope);
    for (Language language : languages) {
      SModelDescriptor actionsModel = language.getActionsModelDescriptor();
      if (actionsModel != null && actionsModel.getSModel() != null) {
        List<SNode> list = actionsModel.getSModel().allNodes(new Condition<SNode>() {
          public boolean met(SNode node) {
            if (BaseAdapter.fromNode(node) instanceof RTransformHintSubstituteActionsBuilder) {
              RTransformHintSubstituteActionsBuilder actionsBuilder = (RTransformHintSubstituteActionsBuilder) BaseAdapter.fromNode(node);
              // same tag?
              if (actionsBuilder.getTransformTag() != tag) {
                return false;
              }
              // is applicable ?
              return SModelUtil_new.isAssignableConcept(sourceConcept, actionsBuilder.getApplicableConcept()) &&
                      satisfiesPrecondition(actionsBuilder, sourceNode, context);
            }
            return false;
          }
        });
        actionsBuilders.addAll((List) BaseAdapter.toAdapters(list));
      }
    }
    return actionsBuilders;
  }

  // --------------------------------
  // Query methods invocation...
  // --------------------------------


  private static void invokeRemoveByCondition(RemoveRTByConditionPart removeByCondition, Iterator<INodeSubstituteAction> actions, SNode sourceNode, IOperationContext context) {
    String methodName = "removeRTActionsByCondition_" + removeByCondition.getId();
    try {
      QueryMethodGenerated.invoke(methodName, context, new RemoveRTActionByConditionContext(actions, sourceNode), removeByCondition.getModel());
    } catch (Throwable t) {
      LOG.error(t);
    }
  }

  private static boolean satisfiesPrecondition(RTransformHintSubstituteActionsBuilder actionsBuilder, SNode sourceNode, IOperationContext context) {
    // try generatred query method
    RTransformHintSubstitutePreconditionFunction precondition = actionsBuilder.getPrecondition();
    // precondition is optional
    if (precondition != null) {
      String methodName = ActionQueryMethodName.rTransformHintSubstituteActionsBuilder_Precondition(actionsBuilder);
      SModel model = actionsBuilder.getModel();
      try {
        return (Boolean) QueryMethodGenerated.invoke(methodName, context, new RTransformPreconditionContext(sourceNode), model);
      } catch (Exception e) {
        LOG.error(e);
        return false;
      }
    }

    return true;
  }

  private static List<INodeSubstituteAction> invokeActionFactory(RTransformHintSubstituteActionsBuilder substituteActionsBuilder, SNode sourceNode, IOperationContext context) {
    String methodName = ActionQueryMethodName.nodeFactory_RightTransformActionBuilder(substituteActionsBuilder);
    SModel model = substituteActionsBuilder.getModel();
    try {
      return (List<INodeSubstituteAction>) QueryMethodGenerated.invoke(methodName, context, new RTActionsBuilderContext(sourceNode, sourceNode.getModel(), null), model);
    } catch (Exception e) {
      return new ArrayList<INodeSubstituteAction>();
    }
  }
}
