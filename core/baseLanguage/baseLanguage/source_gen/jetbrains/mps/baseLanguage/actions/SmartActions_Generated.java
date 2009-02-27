package jetbrains.mps.baseLanguage.actions;

/*Generated by MPS */

import jetbrains.mps.lang.actions.SmartAction_Runtime;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.actions.SmartActionUIPanel;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.MPSTreeNodeEx;
import jetbrains.mps.ide.ui.SimpleSNodeTreeNode;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.tree.TreePath;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class SmartActions_Generated {

  public SmartActions_Generated() {
  }

  public SmartAction_Runtime getGenerateCodeAction_1235058531184(IOperationContext operationContext) {
    return new SmartAction_Runtime(operationContext) {

      public void execute(final EditorCell selectedCell) {
        SNode ancestor = SNodeOperations.getAncestor(((SNode)selectedCell.getSNode()), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
        if (((List<SNode>)(getSmartActionContext()).get("fields")[0]) == null) {
          return;
        }
        for(SNode field : ((List<SNode>)(getSmartActionContext()).get("fields")[0])) {
          SNode getter = SLinkOperations.addNewChild(ancestor, "method", "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration");
          SPropertyOperations.set(getter, "name", "get" + NameUtil.capitalize(SPropertyOperations.getString(field, "name")));
          SLinkOperations.setTarget(getter, "returnType", SNodeOperations.copyNode(SLinkOperations.getTarget(field, "type", true)), true);
          SLinkOperations.setNewChild(getter, "body", "jetbrains.mps.baseLanguage.structure.StatementList");
          SNode returnStatement = SLinkOperations.addNewChild(SLinkOperations.getTarget(getter, "body", true), "statement", "jetbrains.mps.baseLanguage.structure.ReturnStatement");
          SNode dotExpression = SLinkOperations.setNewChild(returnStatement, "expression", "jetbrains.mps.baseLanguage.structure.DotExpression");
          SLinkOperations.setNewChild(dotExpression, "operand", "jetbrains.mps.baseLanguage.structure.ThisExpression");
          SNode fieldRef = SLinkOperations.setNewChild(dotExpression, "operation", "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation");
          SLinkOperations.setTarget(fieldRef, "fieldDeclaration", field, false);
        }
      }

      public SmartActionUIPanel getUI() {
        {
          final SmartActionUIPanel[] result = new SmartActionUIPanel[1];
          result[0] = new SmartActionUIPanel() {
            {
              MPSTree tree = new MPSTree() {

                protected MPSTreeNode rebuild() {
                  MPSTreeNodeEx root = new SimpleSNodeTreeNode(((SNode)(getSmartActionContext()).get("classConcept")[0]), ((IOperationContext)(getSmartActionContext()).get("operationContext")[0]));
                  for(SNode field : SLinkOperations.getTargets(((SNode)(getSmartActionContext()).get("classConcept")[0]), "field", true)) {
                    SimpleSNodeTreeNode treeNode = new SimpleSNodeTreeNode(field, ((IOperationContext)(getSmartActionContext()).get("operationContext")[0]));
                    root.add(treeNode);
                  }
                  return root;
                }

              };
              this.myTree = tree;
              tree.addKeyListener(new KeyAdapter() {

                public void keyPressed(KeyEvent event) {
                  if (event.getKeyCode() == KeyEvent.VK_ENTER) {
                    result[0].ok();
                  }
                }

              });
              tree.rebuildNow();
              JScrollPane scrollPane = new JScrollPane(tree);
              this.setLayout(new BorderLayout());
              this.add(scrollPane, BorderLayout.CENTER);
            }


            private MPSTree myTree;

            public void fillActionContext() {
              TreePath[] paths = this.myTree.getSelectionPaths();
              if (paths != null) {
                (getSmartActionContext()).get("fields")[0] = new ArrayList<SNode>();
                for(TreePath path : paths) {
                  MPSTreeNode node = (MPSTreeNode)path.getLastPathComponent();
                  if (node instanceof MPSTreeNodeEx) {
                    SNode snode = ((MPSTreeNodeEx)node).getSNode();
                    if (SNodeOperations.isInstanceOf(snode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) {
                      ListSequence.fromList(((List<SNode>)(getSmartActionContext()).get("fields")[0])).addElement(snode);
                    }
                  }
                }
              }
            }

          };
          return result[0];
        }
      }

      public boolean isApplicable(final EditorCell selectedCell) {
        {
          SNode sNode = selectedCell.getSNode();
          if (sNode == null) {
            return false;
          }
          SNode ancestor = SNodeOperations.getAncestor(sNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
          (getSmartActionContext()).get("classConcept")[0] = ancestor;
          (getSmartActionContext()).get("operationContext")[0] = getOperationContext();
          return (ancestor != null);
        }
      }

      public String getDescriptionText() {
        return "Getter";
      }

    };
  }

}
