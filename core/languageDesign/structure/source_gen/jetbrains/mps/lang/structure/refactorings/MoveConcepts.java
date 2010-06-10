package jetbrains.mps.lang.structure.refactorings;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.BaseLoggableRefactoring;
import jetbrains.mps.lang.core.refactorings.MoveNodes;
import jetbrains.mps.refactoring.framework.IRefactoringTarget;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.refactoring.framework.paramchooser.mps.MPSChooserFactory;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.LanguageAspect;
import com.intellij.openapi.project.Project;
import java.util.Map;
import jetbrains.mps.project.IModule;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.project.GlobalScope;

public class MoveConcepts extends BaseLoggableRefactoring {
  public MoveConcepts() {
    this.addTransientParameter("targetModel");
    this.addTransientParameter("sourceModel");
  }

  public String getUserFriendlyName() {
    return "Move Concepts";
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public Class getOverridenRefactoringClass() {
    return MoveNodes.class;
  }

  public IRefactoringTarget getRefactoringTarget() {
    return new MoveConcepts_Target();
  }

  public boolean init(final RefactoringContext refactoringContext) {
    if (!(MoveConcepts.this.ask(refactoringContext, MPSChooserFactory.createModelChooser(refactoringContext, "targetModel", new MoveConcepts_targetModel_Settings(refactoringContext))))) {
      return false;
    }

    final Wrappers._boolean result = new Wrappers._boolean(false);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SModel model = SNodeOperations.getModel(ListSequence.fromList(refactoringContext.getSelectedNodes()).first());
        for (SNode node : refactoringContext.getSelectedNodes()) {
          if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))) {
            return;
          }
          if (SNodeOperations.getModel(node) != model) {
            return;
          }
        }
        result.value = true;
      }
    });
    return result.value;
  }

  public void refactor(final RefactoringContext refactoringContext) {
    refactoringContext.setParameter("sourceModel", SNodeOperations.getModel(ListSequence.fromList(refactoringContext.getSelectedNodes()).first()).getModelDescriptor());
    Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor) refactoringContext.getParameter("sourceModel")));
    Language targetLanguage = Language.getLanguageFor(((SModelDescriptor) refactoringContext.getParameter("targetModel")));
    List<SNode> editors = new ArrayList<SNode>();
    List<SNode> behaviors = new ArrayList<SNode>();
    List<SNode> constraints = new ArrayList<SNode>();
    List<SNode> dataFlows = new ArrayList<SNode>();
    // collecting editors: 
    SModelDescriptor editorModelDescriptor = sourceLanguage.getEditorModelDescriptor();
    if (editorModelDescriptor != null) {
      for (SNode node : refactoringContext.getSelectedNodes()) {
        SNode editor = ((SNode) AbstractConceptDeclaration_Behavior.call_findConceptAspect_8360039740498069412(node, editorModelDescriptor.getSModel()));
        if (editor != null) {
          ListSequence.fromList(editors).addElement(editor);
        }
      }
    }
    // collecting behaviors: 
    SModelDescriptor behaviorModelDescriptor = sourceLanguage.getBehaviorModelDescriptor();
    if (behaviorModelDescriptor != null) {
      for (SNode node : refactoringContext.getSelectedNodes()) {
        SNode behavior = ((SNode) AbstractConceptDeclaration_Behavior.call_findConceptAspect_8360039740498069412(node, behaviorModelDescriptor.getSModel()));
        if (behavior != null) {
          ListSequence.fromList(behaviors).addElement(behavior);
        }
      }
    }
    // collecting constraints: 
    SModelDescriptor constraintsModelDescriptor = sourceLanguage.getConstraintsModelDescriptor();
    if (constraintsModelDescriptor != null) {
      for (SNode node : refactoringContext.getSelectedNodes()) {
        SNode constraint = SNodeOperations.cast(AbstractConceptDeclaration_Behavior.call_findConceptAspect_8360039740498069412(node, constraintsModelDescriptor.getSModel()), "jetbrains.mps.lang.constraints.structure.ConceptConstraints");
        if (constraint != null) {
          ListSequence.fromList(constraints).addElement(constraint);
        }
      }
    }
    // collecting data flow: 
    SModelDescriptor dataflowModelDescriptor = sourceLanguage.getDataFlowModelDescriptor();
    if (dataflowModelDescriptor != null) {
      for (SNode node : refactoringContext.getSelectedNodes()) {
        SNode dataFlow = ((SNode) AbstractConceptDeclaration_Behavior.call_findConceptAspect_8360039740498069412(node, dataflowModelDescriptor.getSModel()));
        if (dataFlow != null) {
          ListSequence.fromList(dataFlows).addElement(dataFlow);
        }
      }
    }
    // refactoring itself 
    for (SNode node : refactoringContext.getSelectedNodes()) {
      refactoringContext.changeFeatureName(node, ((SModelDescriptor) refactoringContext.getParameter("targetModel")).getSModelFqName().toString() + "." + SPropertyOperations.getString(node, "name"), SPropertyOperations.getString(node, "name"));
    }
    refactoringContext.moveNodesToModel(refactoringContext.getSelectedNodes(), ((SModelDescriptor) refactoringContext.getParameter("targetModel")).getSModel());
    if (ListSequence.fromList(editors).isNotEmpty()) {
      refactoringContext.computeCaches();
      refactoringContext.updateModelWithMaps(editorModelDescriptor.getSModel());
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
      refactoringContext.computeCaches();
      refactoringContext.updateModelWithMaps(behaviorModelDescriptor.getSModel());
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
      refactoringContext.computeCaches();
      refactoringContext.updateModelWithMaps(constraintsModelDescriptor.getSModel());
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
      refactoringContext.computeCaches();
      refactoringContext.updateModelWithMaps(dataflowModelDescriptor.getSModel());
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

  public List<SModel> getModelsToGenerate(final RefactoringContext refactoringContext) {
    List<SModel> result = ListSequence.fromList(new ArrayList<SModel>());

    Project project = refactoringContext.getSelectedProject();
    Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor) refactoringContext.getParameter("sourceModel")));
    if (sourceLanguage != null) {
      Map<IModule, List<SModel>> models = RefactoringUtil.getLanguageAndItsExtendingLanguageModels(project, sourceLanguage);
      for (List<SModel> list : Sequence.fromIterable(models.values())) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList((List<SModel>) list));
      }
    }
    Language targetLanguage = Language.getLanguageFor(((SModelDescriptor) refactoringContext.getParameter("targetModel")));
    if (targetLanguage != null) {
      Map<IModule, List<SModel>> models = RefactoringUtil.getLanguageAndItsExtendingLanguageModels(project, targetLanguage);
      for (List<SModel> list : Sequence.fromIterable(models.values())) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList((List<SModel>) list));
      }
    }

    return result;
  }

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    SearchResults searchResults = new SearchResults();
    for (SNode selNode : ListSequence.fromList(refactoringContext.getSelectedNodes())) {
      searchResults.addAll(FindUtils.getSearchResults(new EmptyProgressIndicator(), selNode, GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder", "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder"));
    }
    return searchResults;
  }

  public void updateModel(final SModel model, final RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public static String getKeyStroke_static() {
    return MoveNodes.getKeyStroke_static();
  }
}
