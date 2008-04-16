package jetbrains.mps.core.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;

import java.util.Set;
import java.util.HashSet;

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
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.ide.IDEProjectFrame;
import jetbrains.mps.ide.progress.IAdaptiveProgressMonitor;
import jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeAndDescendantsUsages_Finder;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.findalgorithm.resultproviders.TreeBuilder;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.ide.navigation.NavigationActionProcessor;

import java.util.Map;
import java.util.HashMap;

import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.refactoring.framework.ChooseNodeOrModelComponent;

import java.util.ArrayList;

import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;

public class MoveNodes extends AbstractLoggableRefactoring {
  public static final String target = "target";
  public static final String role = "role";

  private Set<String> myTransientParameters = new HashSet<String>();

  public MoveNodes() {
    this.myTransientParameters.add("target");
    this.myTransientParameters.add("role");
  }

  public static String getKeyStroke_static() {
    return " F6";
  }

  public static Class getClass_static() {
    return MoveNodes.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration) SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.core.structure.BaseConcept")) {
      return true;
    } else {
      return false;
    }
  }


  public String getUserFriendlyName() {
    return "Move Nodes";
  }

  public Set<String> getTransientParameters() {
    return new HashSet<String>(this.myTransientParameters);
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
    if (actionContext.getNodes().isEmpty()) {
      return false;
    }
    if (((Object) refactoringContext.getParameter("target")) instanceof SNode) {
      SNode targetNode = ((SNode) ((Object) refactoringContext.getParameter("target")));
      SNode concept = SNodeOperations.getConceptDeclaration(targetNode);
      ConceptAndSuperConceptsScope superConceptsScope = new ConceptAndSuperConceptsScope(((AbstractConceptDeclaration) SNodeOperations.getAdapter(concept)));
      List<LinkDeclaration> linkDeclarations = superConceptsScope.getLinkDeclarationsExcludingOverridden();
      Iterable<SNode> childLinkDeclarations = SequenceOperations.select(SequenceOperations.where(linkDeclarations, new zPredicate(null, null)), new zSelector1(null, null));
      Iterable<String> childLinksRoles = SequenceOperations.select(childLinkDeclarations, new zSelector(null, null));
      for (SNode node : actionContext.getNodes()) {
        String childRole = node.getRole_();
        if (!(SequenceOperations.contains(childLinksRoles, childRole))) {
          return false;
        }
        for (SNode linkDeclaration : childLinkDeclarations) {
          if (SPropertyOperations.getString(linkDeclaration, "role").equals(childRole)) {
            if (!(SConceptOperations.isSuperConceptOf(SLinkOperations.getTarget(linkDeclaration, "target", false), NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(node))))) {
              return false;
            }
          }
        }
      }
      return true;
    }
    if (((Object) refactoringContext.getParameter("target")) instanceof SModelDescriptor) {
      for (SNode node : actionContext.getNodes()) {
        if (!(SPropertyOperations.getBoolean(SNodeOperations.getConceptDeclaration(node), "rootable"))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  public boolean showsAffectedNodes() {
    return true;
  }

  public SearchResults getAffectedNodes(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SearchQuery searchQuery = new SearchQuery(new SNodePointer(actionContext.getNode()), GlobalScope.getInstance());
      IDEProjectFrame projectFrame = (IDEProjectFrame) actionContext.get(IDEProjectFrame.class);
      IAdaptiveProgressMonitor monitor = projectFrame.createAdaptiveProgressMonitor();
      NodeAndDescendantsUsages_Finder finder = new NodeAndDescendantsUsages_Finder();
      IResultProvider resultProvider = TreeBuilder.forFinder(finder);
      SearchResults searchResults = resultProvider.getResults(searchQuery, monitor);
      return searchResults;
    }
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = (List<SNode>) actionContext.getNodes();
      SModel targetModel = null;
      List<SNode> movedNodes = null;
      if (((Object) refactoringContext.getParameter("target")) instanceof SModelDescriptor) {
        targetModel = ((SModelDescriptor) ((Object) refactoringContext.getParameter("target"))).getSModel();
        movedNodes = refactoringContext.moveNodesToModel(nodes, targetModel);
      }
      if (((Object) refactoringContext.getParameter("target")) instanceof SNode) {
        movedNodes = refactoringContext.moveNodesToNode(nodes, ListOperations.getElement(nodes, 0).getRole_(), (SNode) ((Object) refactoringContext.getParameter("target")));
        targetModel = ((SNode) ((Object) refactoringContext.getParameter("target"))).getModel();
      }
      if (targetModel != null) {
        IModule module = targetModel.getModelDescriptor().getModule();
        IOperationContext operationContext = new ModuleContext(module, actionContext.getOperationContext().getProject());
        if (operationContext != null) {
          NavigationActionProcessor.navigateToNode(SequenceOperations.getFirst(movedNodes), operationContext, true);
        }
      }
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    return new HashMap<IModule, List<SModel>>();
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public IChooseComponent<Object> target_componentCreator(ActionContext actionContext) {
    return new ChooseNodeOrModelComponent("choose target", actionContext, null, true, true);
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      boolean result = false;
      List<IChooseComponent> components = new ArrayList<IChooseComponent>();
      {
        IChooseComponent<Object> chooseComponent;
        chooseComponent = this.target_componentCreator(actionContext);
        chooseComponent.setPropertyName("target");
        components.add(chooseComponent);
      }
      ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, actionContext, refactoringContext, components);
      dialog.showDialog();
      result = dialog.getResult();
      return result;
    }
  }

}
