package jetbrains.mps.core.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.structureLanguage.constraints.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.navigation.NavigationActionProcessor;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.HashMap;
import jetbrains.mps.refactoring.framework.IChooseComponentPart;
import jetbrains.mps.refactoring.framework.ChooseNodeOrModelComponent;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import java.util.ArrayList;
import jetbrains.mps.refactoring.framework.ChooseComponentWithName;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;

public class MoveNodes extends AbstractLoggableRefactoring {
  public static final String target = "target";
  public static final String role = "role";

  public static String getKeyStroke_static() {
    return " F6";
  }

  public static Class getClass_static() {
    return MoveNodes.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if(SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.core.structure.BaseConcept")) {
      return true;
    } else
    {
      return false;
    }
  }


  public String getUserFriendlyName() {
    return "Move Nodes";
  }

  public String getSourceId() {
    return "jetbrains.mps.core.scripts@1_0_1199554771600#1198076144993";
  }

  public String getKeyStroke() {
    return MoveNodes.getKeyStroke_static();
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return MoveNodes.isApplicableWRTConcept_static(node);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.core.structure.BaseConcept";
  }

  public Class getOverridenRefactoringClass() {
    return null;
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
    if(actionContext.getNodes().isEmpty()) {
      return false;
    }
    if(((Object)refactoringContext.getParameter("target")) instanceof SNode) {
      SNode targetNode = ((SNode)((Object)refactoringContext.getParameter("target")));
      SNode concept = SNodeOperations.getConceptDeclaration(targetNode);
      ConceptAndSuperConceptsScope superConceptsScope = new ConceptAndSuperConceptsScope(((AbstractConceptDeclaration)SNodeOperations.getAdapter(concept)));
      List<LinkDeclaration> linkDeclarations = superConceptsScope.getLinkDeclarationsExcludingOverridden();
      Iterable<SNode> childLinkDeclarations = SequenceOperations.select(SequenceOperations.where(linkDeclarations, new zPredicate(null, null)), new zSelector(null, null));
      Iterable<String> childLinksRoles = SequenceOperations.select(childLinkDeclarations, new zSelector1(null, null));
      for(SNode node : actionContext.getNodes()) {
        String childRole = node.getRole_();
        if(!(SequenceOperations.contains(childLinksRoles, childRole))) {
          return false;
        }
        for(SNode linkDeclaration : childLinkDeclarations) {
          if(SPropertyOperations.getString(linkDeclaration, "role").equals(childRole)) {
            if(!(AbstractConceptDeclaration_Behavior.call_isAssignableFrom_1198080700262(SLinkOperations.getTarget(linkDeclaration, "target", false), SNodeOperations.getConceptDeclaration(node)))) {
              return false;
            }
          }
        }
      }
      return true;
    }
    if(((Object)refactoringContext.getParameter("target")) instanceof SModel) {
      for(SNode node : actionContext.getNodes()) {
        if(!(SPropertyOperations.getBoolean(SNodeOperations.getConceptDeclaration(node), "rootable"))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = (List<SNode>)actionContext.getNodes();
      if(((Object)refactoringContext.getParameter("target")) instanceof SModel) {
        refactoringContext.moveNodesToModel(nodes, (SModel)((Object)refactoringContext.getParameter("target")));
      }
      if(((Object)refactoringContext.getParameter("target")) instanceof SNode) {
        refactoringContext.moveNodesToNode(nodes, ListOperations.getElement(nodes, 0).getRole_(), (SNode)((Object)refactoringContext.getParameter("target")));
      }
      IOperationContext operationContext = actionContext.getOperationContext();
      NavigationActionProcessor.navigateToNode(SequenceOperations.getFirst(nodes), operationContext, true);
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    return new HashMap<IModule, List<SModel>>();
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public IChooseComponentPart<Object> target_componentCreator(ActionContext actionContext) {
    return new ChooseNodeOrModelComponent("choose target", "target", actionContext, null, true, true);
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    boolean result = false;
    List<IChooseComponent> components = new ArrayList<IChooseComponent>();
    {
      IChooseComponent<Object> chooseComponent;
      chooseComponent = new ChooseComponentWithName<Object>("target", this.target_componentCreator(actionContext));
      components.add(chooseComponent);
    }
    ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, actionContext, refactoringContext, components);
    dialog.showDialog();
    result = dialog.getResult();
    return result;
  }

}
