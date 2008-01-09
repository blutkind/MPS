package jetbrains.mps.bootstrap.actionsLanguage.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePrecondition_ParameterObject;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.action.IChildNodeSetter;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.smodel.action.DefaultSimpleSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.Iterator;
import jetbrains.mps.util.Condition;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_MenuPart_1177495846676(IOperationContext operationContext, NodeSubstitutePrecondition_ParameterObject parameterObject) {
    return SNodeOperations.getAncestor(parameterObject.getParentNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", false, false) != null;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_MenuPart_1177496214780(IOperationContext operationContext, NodeSubstitutePrecondition_ParameterObject parameterObject) {
    return SNodeOperations.getAncestor(parameterObject.getParentNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.RTransformHintSubstituteActionsBuilder", false, false) != null;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_MenuBuilderPart_1180112146090(IOperationContext operationContext, NodeSubstitutePrecondition_ParameterObject parameterObject) {
    return SNodeOperations.getAncestor(parameterObject.getParentNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", true, false) != null;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_MenuBuilderPart_1180112503623(IOperationContext operationContext, NodeSubstitutePrecondition_ParameterObject parameterObject) {
    return SNodeOperations.getAncestor(parameterObject.getParentNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.RTransformHintSubstituteActionsBuilder", true, false) != null;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_MenuPart_1177495821852(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_MenuPart_1177496206972(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_MenuBuilderPart_1180112146087(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.RemoveDefaultsPart", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.RemoveByConditionPart", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_MenuBuilderPart_1180112212391(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.IncludeRightTransformForNodePart", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptRightTransformPart", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.RemoveRTByConditionPart", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ISubstitute_String_1196932700432(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("null", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.actionsLanguage.structure.Substitute_SimpleString", null);
          SPropertyOperations.set(result, "text", pattern);
          return result;
        }

        public String getDescriptionText(String pattern) {
          return "simple text";
        }

        public String getMatchingText(String pattern) {
          return pattern;
        }

      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_IRightTransform_String_1196932866446(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("null", operationContext.getScope());
      result.add(new DefaultSimpleSubstituteAction(concept, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

        public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
          SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.actionsLanguage.structure.RightTransform_SimpleString", null);
          SPropertyOperations.set(result, "text", pattern);
          return result;
        }

        public String getDescriptionText(String pattern) {
          return "simple text";
        }

        public String getMatchingText(String pattern) {
          return pattern;
        }

      });
    }
    return result;
  }

  public static void removeActionsByCondition_1177495897822(Iterator<INodeSubstituteAction> actions, final SNode parentNode, final SNode currentChild, final SNode childConcept, final IOperationContext operationContext) {
    while(actions.hasNext()) {
      INodeSubstituteAction current = actions.next();
      if(!(current.getParameterObject() instanceof SNode)) {
        continue;
      }
      final SNode concept = (SNode)current.getParameterObject();
      Condition cond = new Condition() {

        public boolean met(Object object) {
          return !(SConceptOperations.isSubConceptOf(concept, "jetbrains.mps.bootstrap.actionsLanguage.structure.SubstituteMenuPart"));
        }

      };
      if(cond.met(null)) {
        actions.remove();
      }
    }
  }

  public static void removeActionsByCondition_1177496231840(Iterator<INodeSubstituteAction> actions, final SNode parentNode, final SNode currentChild, final SNode childConcept, final IOperationContext operationContext) {
    while(actions.hasNext()) {
      INodeSubstituteAction current = actions.next();
      if(!(current.getParameterObject() instanceof SNode)) {
        continue;
      }
      final SNode concept = (SNode)current.getParameterObject();
      Condition cond = new Condition() {

        public boolean met(Object object) {
          return !(SConceptOperations.isSubConceptOf(concept, "jetbrains.mps.bootstrap.actionsLanguage.structure.RightTransformMenuPart"));
        }

      };
      if(cond.met(null)) {
        actions.remove();
      }
    }
  }

}
