package jetbrains.mps.smodel.action;

import jetbrains.mps.bootstrap.actionsLanguage.structure.*;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.Condition;
import jetbrains.mps.util.QueryMethod;
import jetbrains.mps.util.QueryMethodGenerated;

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

  public static List<INodeSubstituteAction> createActions(SNode sourceNode, String transformTag, IOperationContext context) {
    SModel model = sourceNode.getModel();

    boolean wasLoading = model.isLoading();
    model.setLoading(true);
    model.setRegistrationsForbidden(true);

    try {
      List<INodeSubstituteAction> resultActions = new LinkedList<INodeSubstituteAction>();
      List<RTransformHintSubstituteActionsBuilder> actionsBuilders = getActionBuilders(sourceNode, transformTag, context);

      // for each builder create actions and apply all filters
      for (RTransformHintSubstituteActionsBuilder builder : actionsBuilders) {
        List<INodeSubstituteAction> addActions = invokeActionFactory(builder, sourceNode, context);
        addActions = applyActionFilters(addActions, actionsBuilders, builder, context);
        resultActions.addAll(addActions);
      }
      return resultActions;
    } finally {
      model.setLoading(wasLoading);
      model.setRegistrationsForbidden(false);
    }
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

  private static List<INodeSubstituteAction> applyActionFilters(List<INodeSubstituteAction> actions, List<RTransformHintSubstituteActionsBuilder> substituteActionsBuilders, RTransformHintSubstituteActionsBuilder excludeBuilder, IOperationContext context) {
    for (RTransformHintSubstituteActionsBuilder substituteActionsBuilder : substituteActionsBuilders) {
      if (substituteActionsBuilder != excludeBuilder) {
        actions = applyActionFilter(substituteActionsBuilder, actions, context);
      }
    }
    return actions;
  }

  // --------------------------------
  // Query methods invocation...
  // --------------------------------

  private static boolean satisfiesPrecondition(RTransformHintSubstituteActionsBuilder actionsBuilder, SNode sourceNode, IOperationContext context) {
    // try generatred query method
    RTransformHintSubstitutePreconditionFunction precondition = actionsBuilder.getPrecondition();
    // precondition is optional
    if (precondition != null) {
      String methodName = ActionQueryMethodName.rTransformHintSubstituteActionsBuilder_Precondition(actionsBuilder);
      Object[] args = new Object[]{sourceNode, context.getScope(), context};
      SModel model = actionsBuilder.getModel();
      try {
        return (Boolean) QueryMethodGenerated.invoke(methodName, args, model);
      } catch (Exception e) {
        LOG.error(e);
        return false;
      }
    }

    // try old query method
    String preconditionQueryMethodId = actionsBuilder.getPreconditionAspectId();
    // precondition is optional
    if (preconditionQueryMethodId == null) {
      return true;
    }

    Object[] args1 = new Object[]{sourceNode, context};
    Object[] args2 = new Object[]{sourceNode, context.getScope()};
    String methodName = "rightTransformHintSubstituteActionsBuilder_Precondition_" + preconditionQueryMethodId;
    SModel model = actionsBuilder.getModel();
    return (Boolean) QueryMethod.invoke_alternativeArguments(methodName, args1, args2, model);
  }

  private static List<INodeSubstituteAction> applyActionFilter(RTransformHintSubstituteActionsBuilder substituteActionsBuilder, List<INodeSubstituteAction> actions, IOperationContext context) {
    if (!substituteActionsBuilder.getUseNewActions()) {
      String filterQueryMethodId = substituteActionsBuilder.getActionsFilterAspectId();
      // filter is optional
      if (filterQueryMethodId == null) {
        return actions;
      }

      Object[] args1 = new Object[]{actions, context};
      Object[] args2 = new Object[]{actions, context.getScope()};
      String methodName = "rightTransformHintSubstituteActionsBuilder_ActionsFilter_" + filterQueryMethodId;
      SModel model = substituteActionsBuilder.getModel();
      return (List<INodeSubstituteAction>) QueryMethod.invoke_alternativeArguments(methodName, args1, args2, model);
    } else {
      Set<SNode> conceptsToRemove = new HashSet<SNode>();
      for (RemovePart rp : substituteActionsBuilder.getSubnodes(RemovePart.class)) {
        conceptsToRemove.add(rp.getConceptToRemove().getNode());
      }

      Iterator<INodeSubstituteAction> it = actions.iterator();
      while (it.hasNext()) {
        INodeSubstituteAction action = it.next();
        if (action.getParameterObject() instanceof SNode && ((SNode) action.getParameterObject()).getAdapter() instanceof ConceptDeclaration) {
          if (conceptsToRemove.contains(action.getParameterObject())) {
            it.remove();
          }
        }
      }

      return actions;
    }
  }

  private static List<INodeSubstituteAction> invokeActionFactory(RTransformHintSubstituteActionsBuilder substituteActionsBuilder, SNode sourceNode, IOperationContext context) {
    if (!substituteActionsBuilder.getUseNewActions()) {
      String factoryQueryMethodId = substituteActionsBuilder.getActionsFactoryAspectId();
      // factory is optional
      if (factoryQueryMethodId == null) {
        return Collections.EMPTY_LIST;
      }

      Object[] args1 = new Object[]{
              sourceNode,
              null,                  // todo: tag from builder description
              context};
      Object[] args2 = new Object[]{
              sourceNode,
              null,                  // todo: tag from builder description
              context.getScope()};
      String methodName = "rightTransformHintSubstituteActionsBuilder_ActionsFactory_" + factoryQueryMethodId;
      SModel model = substituteActionsBuilder.getModel();
      return (List<INodeSubstituteAction>) QueryMethod.invoke_alternativeArguments(methodName, args1, args2, model);
    } else {
      Object[] args = new Object[] {
        sourceNode,
        sourceNode.getModel(),
        null,
        context
      };

      String methodName = ActionQueryMethodName.nodeFactory_RightTransformActionBuilder(substituteActionsBuilder);
      SModel model = substituteActionsBuilder.getModel();
      try {
        return (List<INodeSubstituteAction>) QueryMethodGenerated.invoke(methodName, args, model);
      } catch (Exception e) {
        return new ArrayList<INodeSubstituteAction>();
      }
    }
  }
}
