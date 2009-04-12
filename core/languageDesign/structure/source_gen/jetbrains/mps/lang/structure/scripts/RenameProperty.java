package jetbrains.mps.lang.structure.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
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
import java.util.HashMap;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.refactoring.framework.ChooseStringComponent;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class RenameProperty extends AbstractLoggableRefactoring {
  public static final String newName = "newName";

  private Set<String> myTransientParameters = SetSequence.<String>fromArray();

  public RenameProperty() {
    SetSequence.fromSet(this.myTransientParameters).addElement("newName");
  }

  public String getUserFriendlyName() {
    return "Rename Property";
  }

  public Set<String> getTransientParameters() {
    return SetSequence.fromSet(SetSequence.<String>fromArray()).addSequence(SetSequence.fromSet(this.myTransientParameters));
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
    return Rename.getClass_static();
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
      Map<IModule, List<SModel>> result = MapSequence.fromMap(new HashMap<IModule, List<SModel>>());
      SModel model = refactoringContext.getSelectedNode().getModel();
      Language language = Language.getLanguageFor(model.getModelDescriptor());
      if (language != null) {
        List<SModel> aspectList = ListSequence.fromList(((List<SModelDescriptor>)ListSequence.fromList(ListSequence.<SModelDescriptor>fromArray()).addSequence(SetSequence.fromSet(language.getAspectModelDescriptors())))).select(new ISelector <SModelDescriptor, SModel>() {

          public SModel select(SModelDescriptor it) {
            return it.getSModel();
          }
        }).toListSequence();
        MapSequence.fromMap(result).put(language, aspectList);
      }
      return result;
    }
  }

  public List<SModel> getModelsToUpdate(final RefactoringContext refactoringContext) {
    return ListSequence.<SModel>fromArray();
  }

  public void updateModel(SModel model, final RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public List<SNode> getNodesToOpen(final RefactoringContext refactoringContext) {
    return ListSequence.<SNode>fromArray();
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
    {
      boolean result = false;
      final List<IChooseComponent> components = ListSequence.<IChooseComponent>fromArray();
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
  }


  public static String getKeyStroke_static() {
    return Rename.getKeyStroke_static();
  }

  public static Class getClass_static() {
    return RenameProperty.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil.isAssignableConcept(SNodeOperations.getConceptDeclaration(node), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.PropertyDeclaration"))) {
      return true;
    } else
    {
      return Rename.isApplicableWRTConcept_static(node);
    }
  }

}
