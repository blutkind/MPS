package jetbrains.mps.ide.projectPane;

import jetbrains.mps.ide.projectPane.ProjectLanguageTreeNode.AccessoriesModelTreeNode;
import jetbrains.mps.ide.projectPane.ProjectLanguageTreeNode.AllModelsTreeNode;
import jetbrains.mps.ide.projectPane.SModelsSubtree.JavaStubsTreeNode;
import jetbrains.mps.ide.projectPane.SModelsSubtree.TestsTreeNode;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.MPSTreeNodeEx;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import jetbrains.mps.ide.ui.smodel.SNodeTreeNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.Condition;
import org.jetbrains.annotations.NotNull;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public abstract class ProjectTreeFindHelper {
  public ProjectModuleTreeNode findMostSuitableModuleTreeNode(final @NotNull IModule module) {
    ProjectModuleTreeNode result = findModuleTreeNodeInProject(module);
    if (result != null) return result;

    if (!getModulesPoolNode().isInitialized()) {
      getModulesPoolNode().init();
    }

    return findModuleTreeNodeAnywhere(module);
  }

  public ProjectModuleTreeNode findModuleTreeNodeInProject(final @NotNull IModule module) {
    return (ProjectModuleTreeNode) findTreeNode(getTree().getRootNode(),
      new ModuleInProjectCondition(),
      new NodeForModuleCondition(module));
  }

  public ProjectModuleTreeNode findModuleTreeNodeAnywhere(@NotNull IModule module) {
    return (ProjectModuleTreeNode) findTreeNode(getTree().getRootNode(),
      new ModuleEverywhereCondition(),
      new NodeForModuleCondition(module));
  }

  public SModelTreeNode findMostSuitableModelTreeNode(@NotNull SModelDescriptor model) {
    IModule module = FindUtil.getModuleForModel(getMPSProject(), model);
    if (module == null) return findModelTreeNodeAnywhere(model, getTree().getRootNode());

    ProjectModuleTreeNode moduleTreeNode = findMostSuitableModuleTreeNode(module);
    if (moduleTreeNode == null) return findModelTreeNodeAnywhere(model, getTree().getRootNode());

    return findModelTreeNodeInModule(model, moduleTreeNode);
  }

  public SModelTreeNode findModelTreeNodeInModule(final @NotNull SModelDescriptor model, @NotNull ProjectModuleTreeNode moduleNode) {
    return (SModelTreeNode) findTreeNode(moduleNode, new ModelInModuleCondition(), new NodeForModelCondition(model));
  }

  public SModelTreeNode findModelTreeNodeAnywhere(@NotNull SModelDescriptor model, @NotNull MPSTreeNode parentNode) {
    return (SModelTreeNode) findTreeNode(parentNode, new ModelEverywhereCondition(), new NodeForModelCondition(model));
  }

  public MPSTreeNodeEx findMostSuitableSNodeTreeNode(@NotNull SNode node) {
    SModel model = node.getModel();
    if (model == null) return null;
    SModelTreeNode modelNode = findMostSuitableModelTreeNode(model.getModelDescriptor());
    if (modelNode == null) return null;

    return findSNodeTreeNodeInParent(node, modelNode);
  }

  protected MPSTreeNodeEx findSNodeTreeNodeInParent(@NotNull SNode node, @NotNull MPSTreeNode parent) {
    //todo rewrite using findTreeNode
    if (!(parent.isInitialized() || parent.hasInfiniteSubtree())) parent.init();
    if (parent instanceof SNodeTreeNode) {
      SNodeTreeNode parentSNodeTreeNode = (SNodeTreeNode) parent;
      if (node == parentSNodeTreeNode.getSNode()) {
        return parentSNodeTreeNode;
      }
    }
    for (MPSTreeNode childNode : parent) {
      MPSTreeNodeEx foundNode = findSNodeTreeNodeInParent(node, childNode);
      if (foundNode != null) {
        return foundNode;
      }
    }
    return null;
  }

  protected MPSTreeNode findTreeNode(MPSTreeNode root, Condition<MPSTreeNode> descendCondition, Condition<MPSTreeNode> resultCondition) {
    if (resultCondition.met(root)) {
      return root;
    }

    if (descendCondition.met(root)) {
      if (!root.isInitialized()) {
        root.init();
      }
      for (MPSTreeNode node : root) {
        MPSTreeNode result = findTreeNode(node, descendCondition, resultCondition);
        if (result != null) {
          return result;
        }
      }
    }
    return null;
  }

  //----find next queries----

  //todo: will work bad e.g. if operating with project data from modules pool
  public MPSTreeNode findNextTreeNode(SNode node) {
    MPSTreeNode foundNode = findMostSuitableSNodeTreeNode(node);
    if (foundNode == null) return null;
    DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) foundNode.getParent();
    TreeNode result = parentNode.getChildAfter(foundNode);
    if (result == null) result = parentNode.getChildBefore(foundNode);
    if (result == null) result = parentNode;
    return (MPSTreeNode) result;
  }

  //todo: will work bad e.g. if operating with project data from modules pool
  public MPSTreeNode findNextTreeNode(SModelDescriptor modelDescriptor) {
    SModelTreeNode sModelNode = findMostSuitableModelTreeNode(modelDescriptor);
    if (sModelNode == null) return null;
    DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) sModelNode.getParent();
    TreeNode result = parentNode.getChildAfter(sModelNode);
    if (result == null) result = parentNode.getChildBefore(sModelNode);
    if (result == null) result = parentNode;
    return (MPSTreeNode) result;
  }

  //----node find conditions----

  private static class ModuleInProjectCondition extends ModuleEverywhereCondition {
    public boolean met(MPSTreeNode object) {
      if (!super.met(object)) return false;
      return !(object instanceof ProjectModulesPoolTreeNode);
    }
  }

  private static class ModuleEverywhereCondition implements Condition<MPSTreeNode> {
    public boolean met(MPSTreeNode node) {
      if (node instanceof ProjectModuleTreeNode && !(node instanceof ProjectLanguageTreeNode)) return false;
      if (node instanceof SModelTreeNode) return false;
/*
      todo: extract optimal module finding process. Used method only works when there is a single ability of selection
      //need to go into devkits
      if (node instanceof ProjectDevKitTreeNode) return true;
*/
      return true;
    }
  }

  private static class ModelInModuleCondition extends ModelEverywhereCondition {
    public boolean met(MPSTreeNode node) {
      if (!super.met(node)) return false;

      if (node instanceof SModelTreeNode) {
        SModelTreeNode modelNode = (SModelTreeNode) node;
        if (modelNode.hasModelsUnder()) return true;
      }

      boolean descent = false;

      if (node instanceof ProjectModuleTreeNode) descent = true;
      if (node instanceof NamespaceTextNode) descent = true;
      if (node instanceof AccessoriesModelTreeNode) descent = true;
      if (node instanceof JavaStubsTreeNode) descent = true;
      if (node instanceof AllModelsTreeNode) descent = true;
      if (node instanceof TestsTreeNode) descent = true;

      if (!descent) return false;

      if (!node.isInitialized() && !node.hasInfiniteSubtree()) {
        node.init();
        return true;
      }

      return node.isInitialized();
    }
  }

  private static class ModelEverywhereCondition implements Condition<MPSTreeNode> {
    public boolean met(MPSTreeNode node) {
      if (node instanceof SNodeTreeNode) return false;
      if (node instanceof SModelTreeNode) return true;
      if (!node.isInitialized() && !node.hasInfiniteSubtree()) {
        node.init();
        return true;
      }
      return node.isInitialized();
    }
  }

  private static class NodeForModuleCondition implements Condition<MPSTreeNode> {
    private final IModule myModule;

    public NodeForModuleCondition(IModule module) {
      myModule = module;
    }

    public boolean met(MPSTreeNode treeNode) {
      if (!(treeNode instanceof ProjectModuleTreeNode)) return false;
      IOperationContext nodeContext = treeNode.getOperationContext();
      return nodeContext != null && nodeContext.getModule() == myModule;
    }
  }

  private static class NodeForModelCondition implements Condition<MPSTreeNode> {
    private final SModelDescriptor myModel;

    public NodeForModelCondition(SModelDescriptor model) {
      myModel = model;
    }

    public boolean met(MPSTreeNode node) {
      if (!(node instanceof SModelTreeNode)) return false;
      SModelTreeNode modelNode = (SModelTreeNode) node;
      SModelDescriptor modelDescriptor = modelNode.getSModelDescriptor();
      SModelReference modelReference = modelDescriptor.getSModelReference();
      return modelReference.equals(myModel.getSModelReference());
    }
  }

  //-----------getters----------

  protected abstract MPSTree getTree();
  protected abstract MPSProject getMPSProject();
  protected abstract ProjectModulesPoolTreeNode getModulesPoolNode();
}
