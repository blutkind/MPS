package jetbrains.mps.lang.structure.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.BaseGeneratedRefactoring;
import jetbrains.mps.lang.core.scripts.Rename;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.ide.findusages.view.FindUtils;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.project.GlobalScope;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.refactoring.framework.ChooseStringComponent;

public class RenameConcept extends BaseGeneratedRefactoring {
  public static final String newName = "newName";

  public RenameConcept() {
    this.addTransientParameter("newName");
  }

  public String getUserFriendlyName() {
    return "Rename Concept";
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public Class getOverridenRefactoringClass() {
    return Rename.class;
  }

  public RefactoringTarget getRefactoringTarget() {
    return RefactoringTarget.NODE;
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return SModelUtil.isAssignableConcept(SNodeOperations.getConceptDeclaration(node), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"));
  }

  public boolean showsAffectedNodes() {
    return true;
  }

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    return FindUtils.getSearchResults(new EmptyProgressIndicator(), refactoringContext.getSelectedNode(), GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder", "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void doRefactor(final RefactoringContext refactoringContext) {
    refactoringContext.changeFeatureName(refactoringContext.getSelectedNode(), SNodeOperations.getModel(refactoringContext.getSelectedNode()).getSModelFqName() + "." + ((String) refactoringContext.getParameter("newName")), ((String) refactoringContext.getParameter("newName")));
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(final RefactoringContext refactoringContext) {
    Map<IModule, List<SModel>> result = MapSequence.fromMap(new LinkedHashMap<IModule, List<SModel>>(16, (float) 0.75, false));
    Language sourceLanguage = Language.getLanguageFor(SNodeOperations.getModel(refactoringContext.getSelectedNode()).getModelDescriptor());
    if (sourceLanguage != null) {
      MapSequence.fromMap(result).putAll(RefactoringUtil.getLanguageAndItsExtendingLanguageModels(refactoringContext.getSelectedMPSProject(), sourceLanguage));
    }
    return result;
  }

  public void updateModel(SModel model, final RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public boolean isOneTargetOnly() {
    return true;
  }

  public String newName_initialValue(final RefactoringContext refactoringContext) {
    return SPropertyOperations.getString(refactoringContext.getSelectedNode(), "name");
  }

  public List<IChooseComponent> getChooseComponents(final RefactoringContext refactoringContext) {
    List<IChooseComponent> components = ListSequence.fromList(new ArrayList<IChooseComponent>());
    {
      IChooseComponent<String> chooseComponent;
      chooseComponent = new ChooseStringComponent();
      chooseComponent.setPropertyName("newName");
      chooseComponent.setCaption("new concept name");
      chooseComponent.initComponent();
      chooseComponent.setInitialValue(RenameConcept.this.newName_initialValue(refactoringContext));
      ListSequence.fromList(components).addElement(chooseComponent);
    }
    return components;
  }

  public static String getKeyStroke_static() {
    return Rename.getKeyStroke_static();
  }
}
