package jetbrains.mps.bootstrap.structureLanguage.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import jetbrains.mps.core.scripts.MoveNodes;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.structureLanguage.constraints.AbstractConceptDeclaration_Behavior;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.Map;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModel;
import java.util.HashMap;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.IChooseComponentPart;
import jetbrains.mps.refactoring.framework.HierarchicalChooseNodeComponent;
import jetbrains.mps.refactoring.framework.ConceptAncestorsProvider;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.refactoring.framework.ChooseComponentWithName;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;

public class MoveLinkUp extends AbstractLoggableRefactoring {
  public static final String targetConcept = "targetConcept";

  public static String getKeyStroke_static() {
    return MoveNodes.getKeyStroke_static();
  }


  public String getUserFriendlyName() {
    return "Move Link Up";
  }

  public String getSourceId() {
    return "jetbrains.mps.bootstrap.structureLanguage.scripts#1198592945615";
  }

  public String getKeyStroke() {
    return MoveLinkUp.getKeyStroke_static();
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode node = actionContext.getNode();
      if(!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration"))) {
        return false;
      }
      SNode concept = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration", false, false);
      if(concept == null) {
        return false;
      }
      return ((SNode)refactoringContext.getParameter("targetConcept")) != concept && AbstractConceptDeclaration_Behavior.call_isAssignableFrom_1198080700262(((SNode)refactoringContext.getParameter("targetConcept")), concept);
    }
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode linkDeclaration = (SNode)actionContext.getNode();
      {
        List<SNode> _sourceNodes_ = new ArrayList<SNode>();
        _sourceNodes_.add(linkDeclaration);
        refactoringContext.moveNodesToNode(_sourceNodes_, linkDeclaration.getRole_(), ((SNode)refactoringContext.getParameter("targetConcept")));
      }
      refactoringContext.changeFeatureName(linkDeclaration, SNodeOperations.getModel(((SNode)refactoringContext.getParameter("targetConcept"))) + "." + SPropertyOperations.getString(((SNode)refactoringContext.getParameter("targetConcept")), "name"), SPropertyOperations.getString(linkDeclaration, "role"));
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = new HashMap<IModule, List<SModel>>();
      SModel model = actionContext.getNode().getModel();
      SModel targetModel = SNodeOperations.getModel(((SNode)refactoringContext.getParameter("targetConcept")));
      Language language = Language.getLanguageFor(model.getModelDescriptor());
      Language targetLanguage = Language.getLanguageFor(targetModel.getModelDescriptor());
      if(language != null) {
        List<SModel> aspectList = SequenceOperations.toList(SequenceOperations.select(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(language.getAspectModelDescriptors())), new zSelector4(null, null)));
        result.put(language, aspectList);
      }
      if(targetLanguage != null && targetLanguage != language) {
        List<SModel> aspectList = SequenceOperations.toList(SequenceOperations.select(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(targetLanguage.getAspectModelDescriptors())), new zSelector5(null, null)));
        result.put(targetLanguage, aspectList);
      }
      return result;
    }
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public IChooseComponentPart<SNode> targetConcept_componentCreator(ActionContext actionContext) {
    SNode node = actionContext.getNode();
    SNode abstractConceptDeclaration = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration", false, false);
    return new HierarchicalChooseNodeComponent("choose target concept", "targetConcept", actionContext, new ConceptAncestorsProvider(), abstractConceptDeclaration);
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    boolean result = false;
    List<IChooseComponent> components = new ArrayList<IChooseComponent>();
    {
      IChooseComponent<SNode> chooseComponent;
      chooseComponent = new ChooseComponentWithName<SNode>("targetConcept", this.targetConcept_componentCreator(actionContext));
      components.add(chooseComponent);
    }
    ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, actionContext, refactoringContext, components);
    dialog.showDialog();
    result = dialog.getResult();
    return result;
  }

}
