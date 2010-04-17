package jetbrains.mps.lang.structure.refactorings;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.BaseLoggableRefactoring;
import jetbrains.mps.lang.core.refactorings.MoveNodes;
import jetbrains.mps.refactoring.framework.IRefactoringTarget;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.scripts.RefUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.Language;
import java.util.Map;
import jetbrains.mps.project.IModule;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.project.GlobalScope;

public class MoveLinkUp extends BaseLoggableRefactoring {
  public MoveLinkUp() {
    this.addTransientParameter("targetConcept");
  }

  public String getUserFriendlyName() {
    return "Move Link Up";
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public Class getOverridenRefactoringClass() {
    return MoveNodes.class;
  }

  public IRefactoringTarget getRefactoringTarget() {
    return new MoveLinkUp_Target();
  }

  public boolean init(final RefactoringContext refactoringContext) {
    final Wrappers._T<SNode> concept = new Wrappers._T<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        concept.value = SNodeOperations.getAncestor(refactoringContext.getSelectedNode(), "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", false, false);
      }
    });
    if ((concept.value == null)) {
      return false;
    }

    return MoveLinkUp.this.ask(refactoringContext, new MoveLinkUp_targetConcept_Chooser(refactoringContext));
  }

  public void refactor(final RefactoringContext refactoringContext) {
    SNode node = refactoringContext.getSelectedNode();
    /*
      SNode linkToReplace = RefUtil.findLinkToMerge(((SNode) refactoringContext.getParameter("targetConcept")), node);
      if ((linkToReplace != null)) {
        refactoringContext.replaceRefsToNodeWithNode(node, linkToReplace);
      } else {
        refactoringContext.moveNodeToNode(node, node.getRole_(), ((SNode) refactoringContext.getParameter("targetConcept")));
      }
    */
    refactoringContext.moveNodeToNode(node, node.getRole_(), ((SNode) refactoringContext.getParameter("targetConcept")));
    refactoringContext.changeFeatureName(node, SNodeOperations.getModel(((SNode) refactoringContext.getParameter("targetConcept"))).getSModelFqName() + "." + SPropertyOperations.getString(((SNode) refactoringContext.getParameter("targetConcept")), "name"), SPropertyOperations.getString(node, "role"));
  }

  public List<SModel> getModelsToGenerate(final RefactoringContext refactoringContext) {
    List<SModel> result = ListSequence.fromList(new ArrayList<SModel>());

    Project project = refactoringContext.getSelectedProject();
    Language sourceLanguage = Language.getLanguageFor(SNodeOperations.getModel(refactoringContext.getSelectedNode()).getModelDescriptor());
    if (sourceLanguage != null) {
      Map<IModule, List<SModel>> models = RefactoringUtil.getLanguageAndItsExtendingLanguageModels(project, sourceLanguage);
      for (List<SModel> list : Sequence.fromIterable(models.values())) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList((List<SModel>) list));
      }
    }
    Language targetLanguage = Language.getLanguageFor(SNodeOperations.getModel(((SNode) refactoringContext.getParameter("targetConcept"))).getModelDescriptor());
    if (targetLanguage != null) {
      Map<IModule, List<SModel>> models = RefactoringUtil.getLanguageAndItsExtendingLanguageModels(project, targetLanguage);
      for (List<SModel> list : Sequence.fromIterable(models.values())) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList((List<SModel>) list));
      }
    }

    return result;
  }

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    return FindUtils.getSearchResults(new EmptyProgressIndicator(), refactoringContext.getSelectedNode(), GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void updateModel(final SModel model, final RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public static String getKeyStroke_static() {
    return MoveNodes.getKeyStroke_static();
  }
}
