package jetbrains.mps.dialogs;

import jetbrains.mps.ide.BaseDialog;
import jetbrains.mps.ide.DialogDimensionsSettings;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import jetbrains.mps.ide.ui.smodel.SNodeTreeNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.refactoring.common.move.MoveNodeRefactoring;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.ToStringComparator;

import javax.swing.*;
import javax.swing.tree.TreePath;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.util.*;

public final class ChooseNodeDialog extends BaseDialog {
  
  private final JPanel myPanel = new JPanel(new BorderLayout());
  private MyTree myTree = new MyTree();
  private Set<SModelDescriptor> myModels = new HashSet<SModelDescriptor>();
  private IOperationContext myContext;
  private Object myResult;
  private List<SNode> mySourceNodes;

  public ChooseNodeDialog(String text, IOperationContext context, Frame mainFrame, List<SNode> sourceNodes) {
    this(text, context, mainFrame, getModelsFrom(context), sourceNodes);
  }

  private static Set<SModelDescriptor> getModelsFrom(IOperationContext context) {
    IModule module = context.getModule();
    assert module != null;
    Set<SModelDescriptor> models = new HashSet<SModelDescriptor>(module.getOwnModelDescriptors());
    for (SModelDescriptor model : new ArrayList<SModelDescriptor>(models)) {
      if (model.getStereotype().equals(SModelStereotype.JAVA_STUB)) {
        models.remove(model);
      }
    }
    return models;
  }

  private ChooseNodeDialog(String text, IOperationContext context, Frame mainFrame, Set<SModelDescriptor> models, List<SNode> sourceNodes) {
    super(mainFrame, text);

    myContext = context;

    myModels.addAll(models);
    mySourceNodes = sourceNodes;

    myPanel.add(new JLabel("Choose Node"), BorderLayout.NORTH);
    myPanel.add(new JScrollPane(myTree));

    myTree.setRootVisible(false);
    myTree.rebuildNow();
    myTree.expandPath(new TreePath(myTree.getRootNode()));
    if (mySourceNodes != null && !mySourceNodes.isEmpty()) {
      myTree.selectNode(myTree.findNodeWith(mySourceNodes.get(0)));
    }
  }

  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(200, 200, 800, 600);
  }

  protected JComponent getMainComponent() {
    return myPanel;
  }

  @Button(position = 0, name = "OK", defaultButton = true)
  public void onOk() {
    if (myTree.getSelectionPath() == null) return;

    dispose();

    MPSTreeNode node = (MPSTreeNode)  myTree.getSelectionPath().getLastPathComponent();
    if (node instanceof SNodeTreeNode) {
      SNode sNode = ((SNodeTreeNode) node).getSNode();
      if (mySourceNodes != null && !mySourceNodes.isEmpty()) {
        if (mySourceNodes.contains(sNode)) {
          JOptionPane.showMessageDialog(myContext.getMainFrame(), "Can't refactor node onto itself");
          return;
        }
        String role = MoveNodeRefactoring.getRoleInTarget(mySourceNodes.get(0), sNode, myContext.getProject().getScope());
        if (role == null) {
          JOptionPane.showMessageDialog(myContext.getMainFrame(), "Can't find suitable role");
          return;
        }
      }
      myResult = sNode;
    }

    if (node instanceof SModelTreeNode) {
      myResult = ((SModelTreeNode) node).getSModelDescriptor();
    }
  }

  public Object getResult() {
    return myResult;
  }

  @Button(position = 1, name = "Cancel")
  public void onCancel() {
    dispose();
    myResult = null;
  }

  private final class MyTree extends MPSTree {
    protected MPSTreeNode rebuild() {
      TextTreeNode root = new TextTreeNode("root");

      List<SModelDescriptor> models = new ArrayList<SModelDescriptor>(myModels);
      Collections.sort(models, new ToStringComparator());

      for (SModelDescriptor modelDescriptor : models) {
        root.add(new SModelTreeNode(modelDescriptor, null, myContext));
      }

      return root;
    }
  }
}
