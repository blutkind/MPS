package jetbrains.mps.uiLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.tabbedEditor.TabbedEditor;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import jetbrains.mps.nodeEditor.AbstractEditorComponent;
import jetbrains.mps.nodeEditor.NodeEditorComponent;
import jetbrains.mps.plugins.pluginparts.tabbedEditor.BaseSingleTab;
import jetbrains.mps.plugins.pluginparts.tabbedEditor.BaseTabbedEditor;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.uiLanguage.behavior.ComponentDeclaration_Behavior;
import jetbrains.mps.uiLanguage.structure.ComponentController;
import jetbrains.mps.uiLanguage.structure.ComponentDeclaration;

public class ComponentEditor_TabbedEditor extends BaseTabbedEditor {

  public ComponentEditor_TabbedEditor(IOperationContext operationContext, SNode node) {
    super(operationContext, node);
    AbstractEditorComponent editor = new NodeEditorComponent(operationContext);
    editor.editNode(node, operationContext);
    /*
      this.addTab(new SimpleLazyTab("main", editor));
    */
    this.addTab(new ComponentEditor_TabbedEditor.Component_Tab(this, node, node.getAdapter().getClass()));
    this.addTab(new ComponentEditor_TabbedEditor.Controller_Tab(this, node, node.getAdapter().getClass()));
  }

  public static class Component_Tab extends BaseSingleTab {

    public Component_Tab(TabbedEditor tabbedEditor, SNode baseNode, Class<? extends BaseAdapter> adapterClass) {
      super(tabbedEditor, baseNode, adapterClass);
    }

    public String getTitle() {
      return "Component";
    }

    public String getNullText() {
      return "";
    }

    public SNode getNode(SNode node) {
      return node;
    }

    public boolean allowsToCreateNewNode() {
      return false;
    }

    public SNode createNode(SNode node) {
      throw new IllegalArgumentException();
    }

  }

  public static class Controller_Tab extends BaseSingleTab {

    public Controller_Tab(TabbedEditor tabbedEditor, SNode baseNode, Class<? extends BaseAdapter> adapterClass) {
      super(tabbedEditor, baseNode, adapterClass);
    }

    public String getTitle() {
      return "Controller";
    }

    public String getNullText() {
      return "No Controller";
    }

    public SNode getNode(SNode node) {
      return ComponentDeclaration_Behavior.call_getController_1213877495364(node);
    }

    public boolean allowsToCreateNewNode() {
      return true;
    }

    public SNode createNode(SNode node) {
      {
        ComponentController controller = ComponentController.newInstance(SNodeOperations.getModel(node), true);
        controller.setComponent((ComponentDeclaration) ((INodeAdapter) SNodeOperations.getAdapter(node)));
        SModelOperations.addRootNode(SNodeOperations.getModel(node), controller.getNode());
        String virtualPackage = ((SNode) node).getProperty(SModelTreeNode.PACK);
        controller.setProperty(SModelTreeNode.PACK, virtualPackage);
        return controller.getNode();
      }
    }

  }

}
