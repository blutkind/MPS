package jetbrains.mps.lang.structure.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.scripts.Rename;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.refactoring.framework.ChooseStringComponent;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class RenameProperty extends AbstractLoggableRefactoring {
  public static final String newName = "newName";

  private Set<String> myTransientParameters = SetSequence.fromSet(new HashSet<String>());

  public RenameProperty() {
    SetSequence.fromSet(this.myTransientParameters).addElement("newName");
  }

  public String getUserFriendlyName() {
    return "Rename Property";
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
    return "jetbrains.mps.lang.structure.structure.PropertyDeclaration";
  }

  public Class getOverridenRefactoringClass() {
    return Rename.class;
  }

  public boolean isApplicable(RefactoringContext refactoringContext) {
    {
      SNode node = refactoringContext.getSelectedNode();
      return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.PropertyDeclaration");
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
    return false;
  }

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    return null;
  }

  public void doRefactor(final RefactoringContext refactoringContext) {
    {
      SNode propertyDeclaration = SNodeOperations.cast(refactoringContext.getSelectedNode(), "jetbrains.mps.lang.structure.structure.PropertyDeclaration");
      SNode concept = SNodeOperations.getAncestor(propertyDeclaration, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", false, false);
      refactoringContext.changeFeatureName(propertyDeclaration, SNodeOperations.getModel(concept).getSModelFqName() + "." + SPropertyOperations.getString(concept, "name"), ((String)refactoringContext.getParameter("newName")));
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(final RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = MapSequence.fromMap(new LinkedHashMap<IModule, List<SModel>>(16, (float)0.75, false));
      Language sourceLanguage = Language.getLanguageFor(SNodeOperations.getModel(refactoringContext.getSelectedNode()).getModelDescriptor());
      if (sourceLanguage != null) {
        MapSequence.fromMap(result).putAll(RefactoringUtil.getLanguageAndItsExtendingLanguageModels(refactoringContext.getSelectedMPSProject(), sourceLanguage));
      }
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
    return new ArrayList<SNode>();
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public String newName_initialValue(final RefactoringContext refactoringContext) {
    SNode node = refactoringContext.getSelectedNode();
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.PropertyDeclaration"))) {
      return "";
    }
    return SPropertyOperations.getString(SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.PropertyDeclaration"), "name");
  }

  public boolean askForInfo(final RefactoringContext refactoringContext) {
    boolean result = false;
    final List<IChooseComponent> components = ListSequence.fromList(new ArrayList<IChooseComponent>());
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        {
          IChooseComponent<String> chooseComponent;
          chooseComponent = new ChooseStringComponent();
          chooseComponent.setPropertyName("newName");
          chooseComponent.setCaption("enter new name");
          chooseComponent.initComponent();
          chooseComponent.setInitialValue(RenameProperty.this.newName_initialValue(refactoringContext));
          ListSequence.fromList(components).addElement(chooseComponent);
        }
      }
    });
    ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, refactoringContext, components);
    dialog.showDialog();
    result = dialog.getResult();
    return result;
  }


  public static String getKeyStroke_static() {
    return Rename.getKeyStroke_static();
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    return SModelUtil.isAssignableConcept(SNodeOperations.getConceptDeclaration(node), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.PropertyDeclaration"));
  }

}
