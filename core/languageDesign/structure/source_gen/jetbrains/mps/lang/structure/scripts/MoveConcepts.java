package jetbrains.mps.lang.structure.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.scripts.MoveNodes;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.project.GlobalScope;
import java.util.List;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.LanguageAspect;
import java.util.Map;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import java.util.ArrayList;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.refactoring.framework.ChooseModelDescriptorComponent;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.Condition;

public class MoveConcepts extends AbstractLoggableRefactoring {
  public static final String targetModel = "targetModel";
  public static final String sourceModel = "sourceModel";

  private Set<String> myTransientParameters = SetSequence.fromSet(new HashSet<String>());

  public MoveConcepts() {
    SetSequence.fromSet(this.myTransientParameters).addElement("targetModel");
    SetSequence.fromSet(this.myTransientParameters).addElement("sourceModel");
  }

  public String getUserFriendlyName() {
    return "Move Concepts";
  }

  public Set<String> getTransientParameters() {
    return SetSequence.fromSetWithValues(new HashSet<String>(), this.myTransientParameters);
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return isApplicableWRTConcept_static(node);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration";
  }

  public Class getOverridenRefactoringClass() {
    return MoveNodes.getClass_static();
  }

  public boolean isApplicable(RefactoringContext refactoringContext) {
    {
      if (ListSequence.fromList(refactoringContext.getSelectedNodes()).isEmpty()) {
        return false;
      }
      SModel model = SNodeOperations.getModel(ListSequence.fromList(refactoringContext.getSelectedNodes()).first());
      for(SNode node : refactoringContext.getSelectedNodes()) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))) {
          return false;
        }
        if (SNodeOperations.getModel(node) != model) {
          return false;
        }
      }
      return true;
    }
  }

  public boolean isApplicableToModel(SModelDescriptor modelDescriptor) {
    return true;
  }

  public boolean refactorImmediatelyIfNoUsages() {
    return false;
  }

  public RefactoringTarget getRefactoringTarget() {
    return RefactoringTarget.NODE;
  }

  public boolean showsAffectedNodes() {
    return true;
  }

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    {
      SearchResults searchResults = new SearchResults();
      for(SNode selNode : ListSequence.fromList(refactoringContext.getSelectedNodes())) {
        searchResults.addAll(FindUtils.getSearchResults(ActionEventData.createProgressIndicator(), selNode, GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder", "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder"));
      }
      return searchResults;
    }
  }

  public void doRefactor(final RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = (List<SNode>)refactoringContext.getSelectedNodes();
      refactoringContext.setParameter("sourceModel", SNodeOperations.getModel(ListSequence.fromList(refactoringContext.getSelectedNodes()).first()).getModelDescriptor());
      Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("sourceModel")));
      Language targetLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("targetModel")));
      List<SNode> editors = ListOperations.<SNode>createList();
      List<SNode> behaviors = ListOperations.<SNode>createList();
      List<SNode> constraints = ListOperations.<SNode>createList();
      List<SNode> dataFlows = ListOperations.<SNode>createList();
      // collecting editors:
      SModelDescriptor editorModelDescriptor = sourceLanguage.getEditorModelDescriptor();
      if (editorModelDescriptor != null) {
        for(SNode node : nodes) {
          if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")) {
            SNode editor = SModelUtil.findEditorDeclaration(editorModelDescriptor.getSModel(), node);
            if (editor != null) {
              ListSequence.fromList(editors).addElement(editor);
            }
          }
        }
      }
      // collecting behaviors:
      SModelDescriptor behaviorModelDescriptor = sourceLanguage.getBehaviorModelDescriptor();
      if (behaviorModelDescriptor != null) {
        for(SNode node : nodes) {
          SNode behavior = SModelUtil.findBehaviorDeclaration(behaviorModelDescriptor.getSModel(), node);
          if (behavior != null) {
            ListSequence.fromList(behaviors).addElement(behavior);
          }
        }
      }
      // collecting constraints:
      SModelDescriptor constraintsModelDescriptor = sourceLanguage.getConstraintsModelDescriptor();
      if (constraintsModelDescriptor != null) {
        for(SNode node : nodes) {
          SNode constraint = SModelUtil.findConstraintsDeclaration(constraintsModelDescriptor.getSModel(), node);
          if (constraint != null) {
            ListSequence.fromList(constraints).addElement(constraint);
          }
        }
      }
      // collecting data flow:
      SModelDescriptor dataflowModelDescriptor = sourceLanguage.getDataFlowModelDescriptor();
      if (dataflowModelDescriptor != null) {
        for(SNode node : nodes) {
          SNode dataFlow = SModelUtil.findDataFlowDeclaration(dataflowModelDescriptor.getSModel(), node);
          if (dataFlow != null) {
            ListSequence.fromList(dataFlows).addElement(dataFlow);
          }
        }
      }
      // refactoring itself
      for(SNode node : nodes) {
        refactoringContext.changeFeatureName(node, ((SModelDescriptor)refactoringContext.getParameter("targetModel")).getSModelFqName().toString() + "." + SPropertyOperations.getString(node, "name"), SPropertyOperations.getString(node, "name"));
      }
      refactoringContext.moveNodesToModel(nodes, ((SModelDescriptor)refactoringContext.getParameter("targetModel")).getSModel());
      if (ListSequence.fromList(editors).isNotEmpty()) {
        SModelDescriptor targetEditorModelDescriptor = targetLanguage.getEditorModelDescriptor();
        if (targetEditorModelDescriptor == null) {
          targetEditorModelDescriptor = LanguageAspect.EDITOR.createNew(targetLanguage);
        }
        SModel editorModel = targetEditorModelDescriptor.getSModel();
        refactoringContext.moveNodesToModel(editors, editorModel);
        refactoringContext.computeCaches();
        refactoringContext.updateModelWithMaps(editorModel);
      }
      if (ListSequence.fromList(behaviors).isNotEmpty()) {
        SModelDescriptor targetBehaviorModelDescriptor = targetLanguage.getBehaviorModelDescriptor();
        if (targetBehaviorModelDescriptor == null) {
          targetBehaviorModelDescriptor = LanguageAspect.BEHAVIOR.createNew(targetLanguage);
        }
        SModel behaviorModel = targetBehaviorModelDescriptor.getSModel();
        refactoringContext.moveNodesToModel(behaviors, behaviorModel);
        refactoringContext.computeCaches();
        refactoringContext.updateModelWithMaps(behaviorModel);
      }
      if (ListSequence.fromList(constraints).isNotEmpty()) {
        SModelDescriptor targetConstraintsModelDescriptor = targetLanguage.getConstraintsModelDescriptor();
        if (targetConstraintsModelDescriptor == null) {
          targetConstraintsModelDescriptor = LanguageAspect.CONSTRAINTS.createNew(targetLanguage);
        }
        SModel constraintsModel = targetConstraintsModelDescriptor.getSModel();
        refactoringContext.moveNodesToModel(constraints, constraintsModel);
        refactoringContext.computeCaches();
        refactoringContext.updateModelWithMaps(constraintsModel);
      }
      if (ListSequence.fromList(dataFlows).isNotEmpty()) {
        SModelDescriptor targetDataFlowModelDescriptor = targetLanguage.getDataFlowModelDescriptor();
        if (targetDataFlowModelDescriptor == null) {
          targetDataFlowModelDescriptor = LanguageAspect.DATA_FLOW.createNew(targetLanguage);
        }
        SModel dataFlowModel = targetDataFlowModelDescriptor.getSModel();
        refactoringContext.moveNodesToModel(dataFlows, dataFlowModel);
        refactoringContext.computeCaches();
        refactoringContext.updateModelWithMaps(dataFlowModel);
      }
      // todo: move other concept-related aspect stuff
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(final RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = MapSequence.fromMap(new HashMap<IModule, List<SModel>>());
      Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("sourceModel")));
      result.putAll(RefactoringUtil.getLanguageAndItsExtendingLanguageModels(refactoringContext.getSelectedMPSProject(), sourceLanguage));
      Language targetLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("targetModel")));
      result.putAll(RefactoringUtil.getLanguageAndItsExtendingLanguageModels(refactoringContext.getSelectedMPSProject(), targetLanguage));
      return result;
    }
  }

  public List<SModel> getModelsToUpdate(final RefactoringContext refactoringContext) {
    return ListSequence.fromList(new ArrayList<SModel>());
  }

  public void updateModel(SModel model, final RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public List<SNode> getNodesToOpen(final RefactoringContext refactoringContext) {
    return ListOperations.<SNode>createList();
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public boolean askForInfo(final RefactoringContext refactoringContext) {
    {
      boolean result = false;
      final List<IChooseComponent> components = ListSequence.fromList(new ArrayList<IChooseComponent>());
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          {
            IChooseComponent<SModelDescriptor> chooseComponent;
            chooseComponent = new ChooseModelDescriptorComponent(refactoringContext.getCurrentOperationContext());
            chooseComponent.setCondition(new MoveConcepts.My_targetModel_Condition(refactoringContext));
            chooseComponent.setPropertyName("targetModel");
            chooseComponent.setCaption("choose target model");
            chooseComponent.initComponent();
            ListSequence.fromList(components).addElement(chooseComponent);
          }
        }
      });
      ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, refactoringContext, components);
      dialog.showDialog();
      result = dialog.getResult();
      return result;
    }
  }


  public static String getKeyStroke_static() {
    return MoveNodes.getKeyStroke_static();
  }

  public static Class getClass_static() {
    return MoveConcepts.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil.isAssignableConcept(SNodeOperations.getConceptDeclaration(node), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))) {
      return true;
    } else
    {
      return false;
    }
  }

  public static class My_targetModel_Condition implements Condition<SModelDescriptor> {

    private RefactoringContext myRefactoringContext;

    public My_targetModel_Condition(RefactoringContext refactoringContext) {
      this.myRefactoringContext = refactoringContext;
    }

    public boolean met(SModelDescriptor argument) {
      return this.met_internal(argument, this.myRefactoringContext);
    }

    public boolean met_internal(SModelDescriptor argument, RefactoringContext refactoringContext) {
      return Language.getModelAspect(argument) == LanguageAspect.STRUCTURE;
    }

}

}
