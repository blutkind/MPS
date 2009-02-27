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
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.ide.ui.smodel.SNodeTreeNode;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

public class SmartActions_Generated {

  public SmartActions_Generated() {
  }

  public SmartAction_Runtime getGenerateCodeAction_1235058531184(IOperationContext operationContext) {
    return new SmartAction_Runtime(operationContext) {

      public void execute(final EditorCell selectedCell) {
        SNode ancestor = SNodeOperations.getAncestor(((SNode)selectedCell.getSNode()), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
        if (((List<SNode>[])(getSmartActionContext()).get("fields"))[0] == null) {
          return;
        }
        for(SNode field : ((List<SNode>[])(getSmartActionContext()).get("fields"))[0]) {
          SNode getter = SLinkOperations.addNewChild(ancestor, "method", "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration");
          SPropertyOperations.set(getter, "name", "get" + NameUtil.capitalize(SPropertyOperations.getString(field, "name")));
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
          SmartActionUIPanel result = new SmartActionUIPanel() {
            {
              MPSTree tree = new MPSTree() {

                protected MPSTreeNode rebuild() {
                  MPSTreeNodeEx root = new MPSTreeNodeEx(((IOperationContext[])(getSmartActionContext()).get("operationContext"))[0]) {
                    {
                      this.setIcon(IconManager.getIconFor(((SNode[])(getSmartActionContext()).get("classConcept"))[0]));
                    }


                    public SNode getSNode() {
                      return ((SNode[])(getSmartActionContext()).get("classConcept"))[0];
                    }

                  };
                  for(SNode field : SLinkOperations.getTargets(((SNode[])(getSmartActionContext()).get("classConcept"))[0], "field", true)) {
                    root.add(new SNodeTreeNode(field, ((IOperationContext[])(getSmartActionContext()).get("operationContext"))[0]));
                  }
                  return root;
                }

              };
              JScrollPane scrollPane = new JScrollPane(tree);
              this.setLayout(new BorderLayout());
              this.add(scrollPane, BorderLayout.CENTER);
            }


            public void fillActionContext() {
            }

          };
          return result;
        }
      }

      public boolean isApplicable(final EditorCell selectedCell) {
        {
          SNode sNode = selectedCell.getSNode();
          if (sNode == null) {
            return false;
          }
          SNode ancestor = SNodeOperations.getAncestor(sNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
          ((SNode[])(getSmartActionContext()).get("classConcept"))[0] = ancestor;
          ((IOperationContext[])(getSmartActionContext()).get("operationContext"))[0] = getOperationContext();
          return (ancestor != null);
        }
      }

      public String getDescriptionText() {
        return "Getter";
      }

    };
  }

}
