package jetbrains.mps.ide.projectPane;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.workbench.action.ActionUtils;

import javax.swing.JPopupMenu;

class GeneratorTreeNode extends MPSTreeNode {

  public GeneratorTreeNode(Generator generator, MPSProject project) {
    super(new ModuleContext(generator, project));
    populate();
    updatePresentation();
  }

  protected void updatePresentation() {
    setIcon(Icons.GENERATOR_ICON);
    setNodeIdentifier(calculateNodeIdenifier());
    setText(calculateText());

    setErrorState(!getGenerator().isValid());
  }

  public Generator getGenerator() {
    return (Generator) getOperationContext().getModule();
  }

  public JPopupMenu getQuickCreatePopupMenu() {
    ActionContext context = new ActionContext(getOperationContext());
    context.put(MPSProject.class, getOperationContext().getMPSProject());
    context.put(Generator.class, getGenerator());
    return ActionUtils.createPopup(context, ProjectPane.GENERATOR_NEW_ACTIONS);
  }

  public JPopupMenu getPopupMenu() {
    JPopupMenu result = new JPopupMenu();
    ActionContext context = new ActionContext(getOperationContext());
    context.put(MPSProject.class, getOperationContext().getMPSProject());
    context.put(Generator.class, getGenerator());
    return ActionUtils.createPopup(context, ProjectPane.PROJECT_PANE_GENERATOR_ACTIONS);
  }


  private void populate() {
//    List<GeneratorModelsTreeNode> modelTreeNodes = GeneratorModelsTreeNode.createModelsTreeNodes(getOperationContext());
//    for (GeneratorModelsTreeNode modelsTreeNode : modelTreeNodes) {
//      this.add(modelsTreeNode);
//    }

//    LanguagesTreeNode languagesNode = new LanguagesTreeNode(getOperationContext().getProject(), getOperationContext());
//    this.add(languagesNode);
    SModelsSubtree.create(this, getOperationContext());
  }

  public String calculateText() {
    Generator generator = getGenerator();
    if (generator == null) return "null";
    String name = generator.getName();
    return "generator/" + (name == null ? "<no name>" : name);
  }

  public String calculateNodeIdenifier() {
    Generator generator = getGenerator();
    if (generator == null) return "null";
    return generator.getModuleUID();
  }

}
