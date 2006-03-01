package jetbrains.mps.smodel.action;

import jetbrains.mps.smodel.*;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration;
import jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder;
import jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActions;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.util.Condition;
import jetbrains.mps.util.QueryMethod;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: Feb 28, 2006
 * Time: 7:33:58 PM
 * To change this template use File | Settings | File Templates.
 */
/*package*/ class ReferentSubstituteActionsHelper {
  private static final Logger LOG = Logger.getLogger(ReferentSubstituteActionsHelper.class);

  public static final Condition<SNode> TRUE_CONDITION = new Condition<SNode>() {
    public boolean met(SNode object) {
      return true;
    }
  };

  public static List<INodeSubstituteAction> createActions(SNode sourceNode, SNode currentReferent, LinkDeclaration linkDeclaration, IScope scope) {
    List<INodeSubstituteAction> resultActions = new LinkedList<INodeSubstituteAction>();
    final ConceptDeclaration referentConcept = linkDeclaration.getTarget();
    if (referentConcept == null) {
      return resultActions;
    }
    ConceptDeclaration sourceConcept = SModelUtil.getConceptDeclaration(sourceNode, scope);
    if (sourceConcept == null) {
      LOG.error("Couldn't build actions : couldn't get concept for source node" + sourceNode.getDebugText());
      return resultActions;
    }
    Language primaryLanguage = SModelUtil.getDeclaringLanguage(sourceConcept, scope);
    if (primaryLanguage == null) {
      LOG.error("Couldn't build actions : couldn't get declaring language for concept " + referentConcept.getDebugText());
      return resultActions;
    }

    // add actions from 'primary' language
    List<ReferentSubstituteActionsBuilder> primarySubstituteActionsBuilders = getActionBuilders(primaryLanguage, sourceConcept, referentConcept);
    if (primarySubstituteActionsBuilders.isEmpty()) {
      // if 'primary' language hasn't defined actions for that target - create 'default' actions
      resultActions = createPrimaryReferentSubstituteActions(sourceNode, currentReferent, linkDeclaration, TRUE_CONDITION, scope);
    } else {
      for (ReferentSubstituteActionsBuilder builder : primarySubstituteActionsBuilders) {
        resultActions.addAll(invokeActionBulder(builder, sourceNode, currentReferent, linkDeclaration, scope));
      }
    }

    // search 'extending' builders
    List<ReferentSubstituteActionsBuilder> extendedBuilders = new LinkedList<ReferentSubstituteActionsBuilder>();
    List<Language> languages = sourceNode.getModel().getLanguages(scope);
    for (Language language : languages) {
      if (language == primaryLanguage) {
        continue;
      }
      extendedBuilders.addAll(getActionBuilders(language, sourceConcept, referentConcept));
    }

    // for each builder create actions and apply all filters
    for (ReferentSubstituteActionsBuilder builder : extendedBuilders) {
      List<INodeSubstituteAction> addActions = invokeActionBulder(builder, sourceNode, currentReferent, linkDeclaration, scope);
      addActions = applyActionFilters(addActions, extendedBuilders, builder, scope);
      resultActions.addAll(addActions);
    }
    return resultActions;
  }

  private static List<ReferentSubstituteActionsBuilder> getActionBuilders(Language language, ConceptDeclaration sourceConcept, ConceptDeclaration referentConcept) {
    List<ReferentSubstituteActionsBuilder> substituteActionsBuilders = new LinkedList<ReferentSubstituteActionsBuilder>();
    SModelDescriptor actionsModelDescr = language.getActionsModelDescriptor();
    if (actionsModelDescr != null) {
      // find appropriate actions builder
      List<SNode> roots = actionsModelDescr.getSModel().getRoots();
      for (SNode root : roots) {
        if (root instanceof ReferentSubstituteActions) {
          Iterator<ReferentSubstituteActionsBuilder> iterator = ((ReferentSubstituteActions) root).actionsBuilders();
          while (iterator.hasNext()) {
            ReferentSubstituteActionsBuilder substituteActionsBuilder = iterator.next();
            // is applicable ?
            if (isActionBuilderApplicable(substituteActionsBuilder, sourceConcept, referentConcept)) {
              substituteActionsBuilders.add(substituteActionsBuilder);
            }
          }
        }
      }
    }
    return substituteActionsBuilders;
  }

  private static boolean isActionBuilderApplicable(ReferentSubstituteActionsBuilder builder, ConceptDeclaration sourceConcept, ConceptDeclaration referentConcept) {
    ConceptDeclaration applicableSourceConcept = builder.getApplicableSourceConcept();
    ConceptDeclaration applicableReferentConcept = builder.getApplicableReferentConcept();
    if (applicableSourceConcept == null || applicableReferentConcept == null) {
      return false;
    }
    return SModelUtil.isAssignableConcept(sourceConcept, applicableSourceConcept) &&
            SModelUtil.isAssignableConcept(referentConcept, applicableReferentConcept);
  }

  private static List<INodeSubstituteAction> createPrimaryReferentSubstituteActions(SNode sourceNode, SNode currentReferent, LinkDeclaration linkDeclaration, final Condition<SNode> filterCondition, final IScope scope) {
    final ConceptDeclaration referentConcept = linkDeclaration.getTarget();
    if (referentConcept == null) {
      return Collections.emptyList();
    }
    ISearchScope searchScope = SModelSearchUtil.createModelAndImportedModelsScope(sourceNode.getModel(), true, scope);
    return createDefaultReferentSubstituteActions(sourceNode, currentReferent, linkDeclaration, searchScope, filterCondition, scope);
  }

  private static List<INodeSubstituteAction> createDefaultReferentSubstituteActions(SNode sourceNode, SNode currentReferent, LinkDeclaration linkDeclaration, ISearchScope searchScope, final Condition<SNode> filterCondition, final IScope scope) {
    final ConceptDeclaration referentConcept = linkDeclaration.getTarget();
    if (referentConcept == null) {
      return Collections.emptyList();
    }
    List<SNode> nodes = searchScope.getNodes(new Condition<SNode>() {
      public boolean met(SNode node) {
        return SModelUtil.isInstanceOfConcept(node, referentConcept, scope) &&
                filterCondition.met(node);
      }
    });

    List<INodeSubstituteAction> actions = new LinkedList<INodeSubstituteAction>();
    for (SNode node : nodes) {
      actions.add(new DefaultReferentNodeSubstituteAction(node, sourceNode, currentReferent, linkDeclaration, scope));
    }
    return actions;
  }

  // ----------------------------------

  private static List<INodeSubstituteAction> invokeActionBulder(ReferentSubstituteActionsBuilder builder, SNode sourceNode, SNode currentReferent, LinkDeclaration linkDeclaration, IScope scope) {
    ISearchScope searchScope = invokeSearchScopeProvider(builder, sourceNode, scope);
    return invokeActionFactory(builder, sourceNode, currentReferent, linkDeclaration, searchScope, scope);
  }

  private static List<INodeSubstituteAction> applyActionFilters(List<INodeSubstituteAction> actions, List<ReferentSubstituteActionsBuilder> builders, ReferentSubstituteActionsBuilder excludeBuilder, IScope scope) {
    for (ReferentSubstituteActionsBuilder builder : builders) {
      if (builder != excludeBuilder) {
        actions = applyActionFilter(builder, actions, scope);
      }
    }
    return actions;
  }

  // --------------------------------
  // Query methods invocation...
  // --------------------------------


  private static ISearchScope invokeSearchScopeProvider(ReferentSubstituteActionsBuilder builder, SNode sourceNode, IScope scope) {
    String searchScopeQueryMethodId = builder.getSearchScopeProviderAspectId();
    // search scope is optional
    if (searchScopeQueryMethodId == null) {
      return SModelSearchUtil.createModelAndImportedModelsScope(sourceNode.getModel(), true, scope);
    }

    Object[] args = new Object[]{sourceNode, scope};
    String methodName = "referentSubstituteActionsBuilder_SearchScope_" + searchScopeQueryMethodId;
    SModel model = builder.getModel();
    return (ISearchScope) QueryMethod.invoke(methodName, args, model);
  }


  private static List<INodeSubstituteAction> applyActionFilter(ReferentSubstituteActionsBuilder builder, List<INodeSubstituteAction> actions, IScope scope) {
    String filterQueryMethodId = builder.getActionsFilterAspectId();
    // filter is optional
    if (filterQueryMethodId == null) {
      return actions;
    }

    Object[] args = new Object[]{actions, scope};
    String methodName = "referentSubstituteActionsBuilder_ActionsFilter_" + filterQueryMethodId;
    SModel model = builder.getModel();
    return (List<INodeSubstituteAction>) QueryMethod.invoke(methodName, args, model);
  }

  private static List<INodeSubstituteAction> invokeActionFactory(ReferentSubstituteActionsBuilder builder, SNode sourceNode, SNode currentReferent, LinkDeclaration linkDeclaration, ISearchScope searchScope, IScope scope) {
    String factoryQueryMethodId = builder.getActionsFactoryAspectId();
    // factory is optional
    if (factoryQueryMethodId == null) {
      return createDefaultReferentSubstituteActions(sourceNode, currentReferent, linkDeclaration, searchScope, TRUE_CONDITION, scope);
    }

    Object[] args = new Object[]{sourceNode, currentReferent, linkDeclaration, searchScope, scope};
    String methodName = "referentSubstituteActionsBuilder_ActionsFactory_" + factoryQueryMethodId;
    SModel model = builder.getModel();
    return (List<INodeSubstituteAction>) QueryMethod.invoke(methodName, args, model);
  }
}
