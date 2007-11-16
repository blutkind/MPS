package jetbrains.mps.transformation.TLBase.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.action.IChildNodeSetter;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_RuleConsequence_1169582381136(SNode parentNode, SNode childConcept, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.transformation.TLBase.structure.Weaving_MappingRule");
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_RuleConsequence_1195244660444(SNode parentNode, SNode childConcept, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.transformation.TLBase.structure.Reduction_MappingRule");
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_RuleConsequence_1169570930693(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.transformation.TLBase.structure.WeaveEach_RuleConsequence", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_RuleConsequence_1195244607537(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.transformation.TLBase.structure.InlineSwitch_RuleConsequence", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    return result;
  }

}
