package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.action.Label;
import jetbrains.mps.ide.actions.language.GenerateTemplateQueriesAction_true;
import jetbrains.mps.ide.actions.language.GenerateTemplateQueriesAction_false;
import jetbrains.mps.ide.actions.language.DeleteGeneratorAction;
import jetbrains.mps.ide.modelchecker.CheckGeneratorAction;
import jetbrains.mps.ide.actions.language.GeneratorPropertiesAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;

public class GeneratorActions_ActionGroup extends BaseActionGroup {

  public GeneratorActions_ActionGroup(MPSProject project) {
    super("", "jetbrains.mps.ide.actions.GeneratorActions");
    this.setInternal(false);
    this.add(new Label("jetbrains.mps.ide.actions.generatorNew_ExtentionPoint"));
    this.addSeparator();
    this.add(new GenerateTemplateQueriesAction_true());
    this.add(new GenerateTemplateQueriesAction_false());
    this.addSeparator();
    this.add(new DeleteGeneratorAction());
    this.addSeparator();
    this.add(new CheckGeneratorAction());
    this.addSeparator();
    this.add(new GeneratorPropertiesAction());
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
  }

}
