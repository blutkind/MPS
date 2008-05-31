package jetbrains.mps.bootstrap.structureLanguage.scripts;

/*Generated by MPS */

import jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior;
import jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.core.scripts.MoveNodes;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.refactoring.framework.*;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.Condition;

import java.util.*;

public class MoveConcepts extends AbstractLoggableRefactoring {
  public static final String targetModel = "targetModel";
  public static final String sourceModel = "sourceModel";

  private Set<String> myTransientParameters = new HashSet<String>();

  public MoveConcepts() {
    this.myTransientParameters.add("targetModel");
    this.myTransientParameters.add("sourceModel");
  }

  public static String getKeyStroke_static() {
    return MoveNodes.getKeyStroke_static();
  }

  public static Class getClass_static() {
    return MoveConcepts.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration) SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration")) {
      return true;
    } else {
      return MoveNodes.isApplicableWRTConcept_static(node);
    }
  }


  public String getUserFriendlyName() {
    return "Move Concepts";
  }

  public Set<String> getTransientParameters() {
    return new HashSet<String>(this.myTransientParameters);
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return isApplicableWRTConcept_static(node);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration";
  }

  public Class getOverridenRefactoringClass() {
    return MoveNodes.getClass_static();
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = actionContext.getNodes();
      if (ListSequence.fromList(nodes).isEmpty()) {
        return false;
      }
      for (SNode node : nodes) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration"))) {
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

  public SearchResults getAffectedNodes(ActionContext actionContext, RefactoringContext refactoringContext) {
    return FindUtils.getSearchResults(actionContext.createProgressIndicator(), actionContext.getNode(), GlobalScope.getInstance(), "jetbrains.mps.bootstrap.structureLanguage.findUsages.ConceptInstances_Finder", "jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = (List<SNode>) actionContext.getNodes();
      SModel model = actionContext.getNode().getModel();
      refactoringContext.setParameter("sourceModel", model.getModelDescriptor());
      Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor) refactoringContext.getParameter("sourceModel")));
      Language targetLanguage = Language.getLanguageFor(((SModelDescriptor) refactoringContext.getParameter("targetModel")));
      List<SNode> editors = new ArrayList<SNode>();
      List<SNode> behaviors = new ArrayList<SNode>();
      // collecting editors:
      SModelDescriptor editorModelDescriptor = sourceLanguage.getEditorModelDescriptor();
      if (editorModelDescriptor != null) {
        for (SNode node : nodes) {
          if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration")) {
            ConceptEditorDeclaration conceptEditorDeclaration = SModelUtil_new.findEditorDeclaration(editorModelDescriptor.getSModel(), ((AbstractConceptDeclaration) SNodeOperations.getAdapter(node)));
            if (conceptEditorDeclaration != null) {
              SNode editor = (SNode) conceptEditorDeclaration.getNode();
              ListSequence.fromList(editors).addElement(editor);
            }
          }
        }
      }
      // collecting behaviors:
      SModelDescriptor constraintsModelDescriptor = sourceLanguage.getConstraintsModelDescriptor();
      if (constraintsModelDescriptor != null) {
        for (SNode node : nodes) {
          ConceptBehavior conceptBehavior = SModelUtil_new.findBehaviorDeclaration(constraintsModelDescriptor.getSModel(), ((AbstractConceptDeclaration) SNodeOperations.getAdapter(node)));
          if (conceptBehavior != null) {
            SNode behavior = (SNode) conceptBehavior.getNode();
            ListSequence.fromList(behaviors).addElement(behavior);
          }
        }
      }
      // refactoring itself
      refactoringContext.moveNodesToModel(nodes, ((SModelDescriptor) refactoringContext.getParameter("targetModel")).getSModel());
      for (SNode node : nodes) {
        refactoringContext.changeFeatureName(node, ((SModelDescriptor) refactoringContext.getParameter("targetModel")) + "." + SPropertyOperations.getString(node, "name"), SPropertyOperations.getString(node, "name"));
      }
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
        SModelDescriptor targetConstraintsModelDescriptor = targetLanguage.getConstraintsModelDescriptor();
        if (targetConstraintsModelDescriptor == null) {
          targetConstraintsModelDescriptor = LanguageAspect.CONSTRAINTS.createNew(targetLanguage);
        }
        SModel constraintsModel = targetConstraintsModelDescriptor.getSModel();
        refactoringContext.moveNodesToModel(behaviors, constraintsModel);
        refactoringContext.computeCaches();
        refactoringContext.updateModelWithMaps(constraintsModel);
      }
      // todo: move other concept-related aspect stuff
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = new HashMap<IModule, List<SModel>>();
      Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor) refactoringContext.getParameter("sourceModel")));
      if (sourceLanguage != null) {
        List<SModel> aspectList = ListSequence.fromList(((List<SModelDescriptor>) new ArrayList<SModelDescriptor>(sourceLanguage.getAspectModelDescriptors()))).select(new ISelector<SModelDescriptor, SModel>() {

          public SModel select(SModelDescriptor it) {
            return it.getSModel();
          }

        }).toListSequence();
        result.put(sourceLanguage, aspectList);
      }
      Language targetLanguage = Language.getLanguageFor(((SModelDescriptor) refactoringContext.getParameter("targetModel")));
      if (targetLanguage != null) {
        List<SModel> aspectList = ListSequence.fromList(((List<SModelDescriptor>) new ArrayList<SModelDescriptor>(targetLanguage.getAspectModelDescriptors()))).select(new ISelector<SModelDescriptor, SModel>() {

          public SModel select(SModelDescriptor it) {
            return it.getSModel();
          }

        }).toListSequence();
        result.put(targetLanguage, aspectList);
      }
      return result;
    }
  }

  public List<SModel> getModelsToUpdate(ActionContext actionContext, RefactoringContext refactoringContext) {
    return new ArrayList<SModel>();
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      boolean result = false;
      List<IChooseComponent> components = new ArrayList<IChooseComponent>();
      {
        IChooseComponent<SModelDescriptor> chooseComponent;
        chooseComponent = new ChooseModelDescriptorComponent("choose target model", "targetModel", actionContext);
        chooseComponent.setCondition(new MoveConcepts.My_targetModel_Condition(actionContext));
        chooseComponent.setPropertyName("targetModel");
        components.add(chooseComponent);
      }
      ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, actionContext, refactoringContext, components);
      dialog.showDialog();
      result = dialog.getResult();
      return result;
    }
  }

  public static class My_targetModel_Condition implements Condition<SModelDescriptor> {

    private ActionContext myActionContext;

    public My_targetModel_Condition(ActionContext actionContext) {
      this.myActionContext = actionContext;
    }

    public boolean met(SModelDescriptor argument) {
      return this.met_internal(argument, this.myActionContext);
    }

    public boolean met_internal(SModelDescriptor argument, ActionContext actionContext) {
      return Language.getModelAspect(argument) == LanguageAspect.STRUCTURE;
    }

  }

}
