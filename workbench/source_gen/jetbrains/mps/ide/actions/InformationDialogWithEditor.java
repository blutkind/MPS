package jetbrains.mps.ide.actions;

/*Generated by MPS */

import javax.swing.JPanel;
import java.awt.BorderLayout;
import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.ide.embeddableEditor.EmbeddableEditor;
import javax.swing.JLabel;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import javax.swing.JComponent;
import jetbrains.mps.ide.icons.IconManager;
import java.util.List;
import jetbrains.mps.nodeEditor.EditorMessage;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.nodeEditor.messageTargets.EditorMessageWithTarget;
import jetbrains.mps.nodeEditor.MessageStatus;
import jetbrains.mps.nodeEditor.messageTargets.NodeMessageTarget;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorMessageOwner;
import jetbrains.mps.smodel.ModelAccess;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.ModelOwner;
import com.intellij.openapi.ui.Splitter;
import javax.swing.JScrollPane;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import java.awt.GridLayout;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.TextTreeNode;
import com.intellij.util.ui.EmptyIcon;
import jetbrains.mps.ide.ui.smodel.SNodeTreeNode;
import jetbrains.mps.util.Condition;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.TreePath;
import jetbrains.mps.ide.dialogs.BaseDialog;

public class InformationDialogWithEditor extends InformationDialog {
  private JPanel myChangedPanel = new JPanel(new BorderLayout());
  private JPanel mySourcePanel = new JPanel(new BorderLayout());
  private SNode myFirstValidNode;
  private Set<SNode> myFirstValidNodeChilds = SetSequence.fromSet(new HashSet<SNode>());
  private EmbeddableEditor myEditor;
  private JLabel myEditorLabel = new JLabel();
  private JPanel myMainPanel;

  public InformationDialogWithEditor(IOperationContext context, RefactoringContext refactoringContext) {
    super(context, refactoringContext);
  }

  private JComponent getEditorPanel() {
    if (myEditor != null) {
      JPanel editorPanel = new JPanel(new BorderLayout());
      editorPanel.add(myEditorLabel, BorderLayout.PAGE_START);
      editorPanel.add(myEditor.getComponenet(), BorderLayout.CENTER);
      return editorPanel;
    }
    JPanel panel = new JPanel();
    panel.setToolTipText("No editor");
    return panel;
  }

  private void setEditorNode(SNode node) {
    myEditorLabel.setText(node.getName());
    myEditorLabel.setIcon(IconManager.getIconFor(node));
  }

  private void highlightChanges(List<SNode> nodes) {
    List<EditorMessage> messages = ListSequence.fromList(new ArrayList<EditorMessage>());
    for (SNode node : nodes) {
      ListSequence.fromList(messages).addElement(new EditorMessageWithTarget(node, MessageStatus.OK, new NodeMessageTarget(), new Color(0, 0, 255, 40), "", new EditorMessageOwner() {}));
    }
    myEditor.mark(messages);
  }

  protected JComponent getMainComponent() {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        Map<SNode, Set<SNode>> movedNodes = getRefactoringContext().getMovedNodes();
        Map<SNode, Set<SNode>> sourceNodes = getRefactoringContext().getSourceNodes();
        if (movedNodes.isEmpty()) {
          myChangedPanel = null;
        } else {
          collectInformation(movedNodes, "Changed Nodes", myChangedPanel);
        }
        if (sourceNodes.isEmpty()) {
          mySourcePanel = null;
        } else {
          collectInformation(sourceNodes, "Source Nodes", mySourcePanel);
        }
        collectInformation(getRefactoringContext().getConceptFeatures());
        if (!(movedNodes.isEmpty())) {
          myFirstValidNode = (SNode) movedNodes.keySet().toArray()[0];
          myFirstValidNodeChilds = movedNodes.get(myFirstValidNode);
        }
      }
    });
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        if (myFirstValidNode != null) {
          if (myEditor == null) {
            SNode copiedRoot = SNodeOperations.copyNode(myFirstValidNode);
            myEditor = new EmbeddableEditor(getOperationContext(), new ModelOwner() {}, copiedRoot, false);
            setEditorNode(myFirstValidNode);
            highlightChanges(getCopiedNodes(myFirstValidNodeChilds, myFirstValidNode, copiedRoot));
          }
        }
      }
    });
    JPanel mainPanel = new JPanel(new BorderLayout());
    mainPanel.add(getSimplePanel(), BorderLayout.NORTH);
    Splitter splitter = new Splitter(false);
    splitter.setFirstComponent(new JScrollPane(getSimplePanel()));
    splitter.setSecondComponent(getEditorPanel());
    myMainPanel = splitter;
    return myMainPanel;
  }

  @Override
  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(100, 200, 1000, 900);
  }

  @Override
  protected JComponent getSimplePanel() {
    JPanel panel = new JPanel(new BorderLayout());
    int row = (myChangedPanel == null || mySourcePanel == null ?
      1 :
      2
    );
    JPanel centerPanel = new JPanel(new GridLayout(row, 1));
    if (myChangedPanel != null) {
      centerPanel.add(myChangedPanel);
    }
    if (mySourcePanel != null) {
      centerPanel.add(mySourcePanel);
    }
    panel.add(super.getSimplePanel(), BorderLayout.PAGE_START);
    panel.add(centerPanel, BorderLayout.CENTER);
    return panel;
  }

  private SNode getCopiedNode(SNode node, SNode root, SNode copiedRoot) {
    int index = root.getDescendants().indexOf(node);
    if (index == -1) {
      return null;
    }
    return copiedRoot.getDescendants().get(index);
  }

  private List<SNode> getCopiedNodes(Set<SNode> nodes, SNode root, SNode copiedRoot) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode node : nodes) {
      SNode copiedNode = getCopiedNode(node, root, copiedRoot);
      if ((copiedNode == null)) {
        continue;
      }
      ListSequence.fromList(result).addElement(copiedNode);
    }
    return result;
  }

  private void collectInformation(final Map<SNode, Set<SNode>> rootToChilds, String caption, JPanel panel) {
    if (rootToChilds.isEmpty()) {
      return;
    }
    setCaption(panel, caption);
    final MPSTree tree = new MPSTree() {
      protected MPSTreeNode rebuild() {
        TextTreeNode rootTreeNode = new TextTreeNode("");
        rootTreeNode.setIcon(new EmptyIcon(10));
        for (final SNode root : rootToChilds.keySet()) {
          SNodeTreeNode nodeTreeNode = new SNodeTreeNode(root, null, InformationDialogWithEditor.this.getOperationContext(), new Condition<SNode>() {
            public boolean met(SNode candidate) {
              return rootToChilds.get(root).contains(candidate);
            }
          });
          rootTreeNode.add(nodeTreeNode);
        }
        return rootTreeNode;
      }
    };
    tree.addTreeSelectionListener(new TreeSelectionListener() {
      public void valueChanged(TreeSelectionEvent event) {
        if (event.getNewLeadSelectionPath() == null) {
          return;
        }
        TreePath path = tree.getSelectionModel().getSelectionPath();
        if (path == null) {
          return;
        }
        Object nodeTreeNode = path.getLastPathComponent();
        if (!(nodeTreeNode instanceof SNodeTreeNode)) {
          return;
        }
        final SNode node = ((SNodeTreeNode) nodeTreeNode).getSNode();
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {
          public void run() {
            SNode root = node.getContainingRoot();
            SNode copiedRoot = SNodeOperations.copyNode(root);
            myEditor.setNode(copiedRoot);
            setEditorNode(root);
            highlightChanges(getCopiedNodes(rootToChilds.get(root), root, copiedRoot));
            if (node != root) {
              myEditor.selectNode(getCopiedNode(node, root, copiedRoot));
            }
          }
        });
        if (myMainPanel != null) {
          myMainPanel.updateUI();
        }
      }
    });
    tree.rebuildLater();
    panel.add(tree, BorderLayout.CENTER);
  }

  @BaseDialog.Button(position = 0, name = "OK", mnemonic = 'O', defaultButton = true)
  @Override
  public void buttonOk() {
    if (myEditor != null) {
      myEditor.disposeEditor();
    }
    super.buttonOk();
  }
}
