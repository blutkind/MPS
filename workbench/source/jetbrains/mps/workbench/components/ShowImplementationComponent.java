package jetbrains.mps.workbench.components;


import jetbrains.mps.ide.embeddableEditor.EmbeddableEditor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.ModelOwner;
import jetbrains.mps.smodel.SNode;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ShowImplementationComponent extends JPanel {
  private JComboBox myNodeChooser;
  private JLabel myLocationLabel = new JLabel("<location>");
  private JLabel myCountLanel = new JLabel("<count>");
  private EmbeddableEditor myEditor;
  private List<SNode> myNodes;
  private Map<String, SNode> myItemToNode = new LinkedHashMap<String, SNode>();

  public ShowImplementationComponent(List<SNode> nodes, IOperationContext context) {
    this.myNodes = nodes;
    this.myEditor = new EmbeddableEditor(context, new ModelOwner() {}, SNodeOperations.copyNode(nodes.get(0)), false);
    for (SNode node : this.myNodes) {
      String item = node.getPresentation();
      this.myItemToNode.put(item, node);
    }
    this.init();
    updateControls();
  }

  public JComponent getPrefferedFocusableComponent() {
    return this.myNodeChooser;
  }

  private JPanel getActionsPanel() {
    JPanel panel = new JPanel();
    return panel;
  }

  private void updateControls() {
    String selectedItem = (String) myNodeChooser.getSelectedItem();
    SNode selectedNode = myItemToNode.get(selectedItem);
    IModule module = selectedNode.getModel().getModelDescriptor().getModule();
    myLocationLabel.setText(module.getModuleFqName());
    int index = myNodes.indexOf(selectedNode) + 1;
    myCountLanel.setText(index + " of " + myNodes.size());
    updateUI();
  }

  private void init() {
    this.setLayout(new BorderLayout());
    this.add(this.myEditor.getComponenet(), BorderLayout.CENTER);
    JPanel northPanel = new JPanel(new BorderLayout());
    this.add(northPanel, BorderLayout.PAGE_START);
    JPanel toolbarPanel = new JPanel(new FlowLayout());
    toolbarPanel.add(this.getActionsPanel());
    this.myNodeChooser = new JComboBox(this.myItemToNode.keySet().toArray());
    this.myNodeChooser.setRenderer(new DefaultListCellRenderer() {
      @Override
      public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            updateControls();
          }
        });
        return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
      }
    });
    toolbarPanel.add(this.myNodeChooser);
    toolbarPanel.add(this.myCountLanel);
    northPanel.add(toolbarPanel, BorderLayout.LINE_START);
    northPanel.add(this.myLocationLabel, BorderLayout.LINE_END);

    this.setPreferredSize(new Dimension(600, 400));
  }
}
