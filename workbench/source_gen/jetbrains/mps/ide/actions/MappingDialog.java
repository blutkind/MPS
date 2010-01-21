package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import javax.swing.JScrollPane;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.TreePath;
import jetbrains.mps.ide.ui.smodel.SNodeTreeNode;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import javax.swing.JComponent;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.util.Condition;
import com.intellij.ui.treeStructure.Tree;
import javax.swing.JOptionPane;
import javax.swing.Icon;

public class MappingDialog extends BaseDialog {
  private JPanel myMainComponent = new JPanel(new BorderLayout());
  private Language myLanguage;
  private IOperationContext myContext;
  private SNode myResult;
  private MPSTree myTree = new MPSTree() {
    protected MPSTreeNode rebuild() {
      return MappingDialog.this.rebuildTree();
    }
  };

  public MappingDialog(Language language, IOperationContext operationContext) {
    super(operationContext.getMainFrame(), "Choose Mapping Configuration");
    this.myLanguage = language;
    this.myContext = operationContext;
    JScrollPane scrollPane = new JScrollPane(this.myTree);
    this.myMainComponent.add(scrollPane, BorderLayout.CENTER);
    this.myTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
    this.myTree.addTreeSelectionListener(new TreeSelectionListener() {
      public void valueChanged(TreeSelectionEvent e) {
        if (e.getNewLeadSelectionPath() == null) {
          return;
        }
        TreePath path = MappingDialog.this.myTree.getSelectionModel().getSelectionPath();
        if (path == null) {
          return;
        }
        Object node = path.getLastPathComponent();
        if (!(node instanceof SNodeTreeNode)) {
          return;
        }
        MPSEditorOpener opener = MappingDialog.this.myContext.getComponent(MPSEditorOpener.class);
        opener.editNode(((SNodeTreeNode) node).getSNode(), MappingDialog.this.myContext);
      }
    });
    this.myTree.rebuildNow();
    this.myTree.expandAll();
  }

  protected JComponent getMainComponent() {
    return this.myMainComponent;
  }

  private MPSTreeNode rebuildTree() {
    if (this.myLanguage == null) {
      return null;
    }
    TextTreeNode root = new TextTreeNode("Generators");
    for (final Generator generator : this.myLanguage.getGenerators()) {
      MPSTreeNode generatorTreeNode = new MappingDialog.MyTreeNode(Icons.GENERATORS_ICON, generator.getModuleUID(), "generator/" + generator.getName());
      root.add(generatorTreeNode);
      for (SModelDescriptor md : generator.getOwnTemplateModels()) {
        MPSTreeNode modelTreeNode = new MappingDialog.MyTreeNode(IconManager.getIconFor(md), md.toString(), md.getLongName() + "@" + md.getStereotype());
        generatorTreeNode.add(modelTreeNode);
        SModel model = md.getSModel();
        for (SNode node : SModelOperations.getRoots(model, "jetbrains.mps.lang.generator.structure.MappingConfiguration")) {
          SNodeTreeNode nodeTreeNode = new SNodeTreeNode(node, null, this.myContext, new Condition<SNode>() {
            public boolean met(SNode p0) {
              return false;
            }
          });
          modelTreeNode.add(nodeTreeNode);
        }
      }
    }
    return root;
  }

  public SNode getResult() {
    return this.myResult;
  }

  @BaseDialog.Button(position = 0, name = "OK", mnemonic = 'O', defaultButton = true)
  public void buttonOk() {
    Object[] selectedNode = this.myTree.getSelectedNodes(SNodeTreeNode.class, new Tree.NodeFilter() {
      public boolean accept(Object p0) {
        return true;
      }
    });
    if (selectedNode.length != 1) {
      JOptionPane.showMessageDialog(this, "Mapping Configuration node is not selected!");
    } else {
      this.myResult = (SNode) ((SNodeTreeNode) selectedNode[0]).getSNode();
      this.myTree.dispose();
      this.dispose();
    }
  }

  @BaseDialog.Button(position = 1, name = "Cancel", mnemonic = 'C', defaultButton = false)
  public void buttonCancel() {
    this.myTree.dispose();
    this.dispose();
  }

  /*package*/ class MyTreeNode extends MPSTreeNode {
    private Icon myIcon;
    private String myNodeIdentifier;
    private String myText;

    public MyTreeNode(Icon icon, String nodeIdentifier, String text) {
      super(MappingDialog.this.myContext);
      this.myIcon = icon;
      this.myNodeIdentifier = nodeIdentifier;
      this.myText = text;
      this.updatePresentation();
    }

    protected void updatePresentation() {
      super.updatePresentation();
      this.setText(this.myText);
      this.setIcon(this.myIcon);
      this.setNodeIdentifier(this.myNodeIdentifier);
    }
  }
}
