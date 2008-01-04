package jetbrains.mps.core.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import java.util.HashMap;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import java.util.ArrayList;
import jetbrains.mps.refactoring.framework.ChooseStringComponent;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;

public class Rename extends AbstractLoggableRefactoring {
  public static final String newName = "newName";

  public static String getKeyStroke_static() {
    return "shift F6";
  }


  public String getUserFriendlyName() {
    return "Rename";
  }

  public String getSourceId() {
    return "jetbrains.mps.core.scripts@1_0_1199462490982#1199457919461";
  }

  public String getKeyStroke() {
    return Rename.getKeyStroke_static();
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
    return actionContext.getNode() != null;
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode node = actionContext.getNode();
      node.setName(((String)refactoringContext.getParameter("newName")));
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    return new HashMap<IModule, List<SModel>>();
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
  }

  public String newName_initialValue(ActionContext actionContext) {
    return actionContext.getNode().getName();
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    boolean result = false;
    List<IChooseComponent> components = new ArrayList<IChooseComponent>();
    {
      IChooseComponent<String> chooseComponent;
      chooseComponent = new ChooseStringComponent("new name:", "newName");
      chooseComponent.setInitialValue(this.newName_initialValue(actionContext));
      components.add(chooseComponent);
    }
    ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, actionContext, refactoringContext, components);
    dialog.showDialog();
    result = dialog.getResult();
    return result;
  }

}
