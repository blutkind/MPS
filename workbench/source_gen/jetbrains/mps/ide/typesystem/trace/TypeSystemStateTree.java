package jetbrains.mps.ide.typesystem.trace;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.newTypesystem.state.State;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.newTypesystem.state.blocks.BlockKind;
import java.awt.Color;
import java.util.List;
import java.util.Set;
import jetbrains.mps.newTypesystem.state.blocks.Block;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.newTypesystem.state.blocks.InequalityBlock;
import java.util.ArrayList;
import jetbrains.mps.newTypesystem.state.NodeMaps;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JPopupMenu;
import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.typesystem.util.GoToTypeErrorRuleUtil;
import jetbrains.mps.util.Pair;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;

public class TypeSystemStateTree extends MPSTree {
  private IOperationContext myOperationContext;
  private State myState;
  private EditorComponent myEditorComponent;

  public TypeSystemStateTree(IOperationContext operationContext, State state, EditorComponent editorComponent) {
    myOperationContext = operationContext;
    myState = state;
    myEditorComponent = editorComponent;
    this.rebuildNow();
    expandAll();
  }

  public void resetState(State state) {
    myState = state;
    rebuildNow();
    expandAll();
  }

  @Override
  protected MPSTreeNode rebuild() {
    setRootVisible(false);
    return createNode();
  }

  private TypeSystemStateTreeNode createNode() {
    TypeSystemStateTreeNode result = new TypeSystemStateTreeNode("State", myOperationContext);
    result.add(new TypeSystemStateTreeNode("Solving inequalities in process: " + myState.getInequalities().isSolvingInProcess(), myOperationContext));
    result.add(createInequalitiesNode());
    /*
      result.add(createNode("Check-only inequalities", myState.getCheckingInequalities(), null));
    */
    result.add(createNode("Comparable", myState.getBlocks(BlockKind.COMPARABLE), null));
    result.add(createNode("When concrete", myState.getBlocks(BlockKind.WHEN_CONCRETE), null));
    result.add(createNode("Errors", myState.getNodeMaps().getErrorListPresentation(), Color.RED));
    result.add(createNode("Check-only equations", myState.getBlocks(BlockKind.CHECK_EQUATION), null));
    /*
      result.add(createTypesNode());
    */
    result.add(createEquationsNode());
    return result;
  }

  private TypeSystemStateTreeNode createNode(String category, List<String> entries, Color color) {
    TypeSystemStateTreeNode result = new TypeSystemStateTreeNode(category, myOperationContext);
    if (color != null) {
      result.setColor(color);
    }
    for (String string : entries) {
      result.add(new TypeSystemStateTreeNode(string, myOperationContext));
    }
    return result;
  }

  private TypeSystemStateTreeNode createNode(String category, Set<Block> entries, Color color) {
    TypeSystemStateTreeNode result = new TypeSystemStateTreeNode(category + " (" + entries.size() + ")", myOperationContext);
    if (color != null) {
      result.setColor(color);
    }
    for (Block block : entries) {
      result.add(new BlockTreeNode(block, myOperationContext, myState, myEditorComponent));
    }
    return result;
  }

  private TypeSystemStateTreeNode createInequalitiesNode() {
    TypeSystemStateTreeNode result = new TypeSystemStateTreeNode("Inequalities by groups", myOperationContext);
    for (Map.Entry<Set<SNode>, Set<InequalityBlock>> entry : myState.getInequalities().getInequalityGroups(myState.getBlocks(BlockKind.INEQUALITY)).entrySet()) {
      Set<SNode> key = entry.getKey();
      TypeSystemStateTreeNode current;
      if (key.isEmpty()) {
        current = result;
      } else {
        current = new TypeSystemStateTreeNode(key.toString(), myOperationContext);
      }
      for (InequalityBlock block : entry.getValue()) {
        current.add(new BlockTreeNode(block, myOperationContext, myState, myEditorComponent));
      }
      if (!(key.isEmpty())) {
        result.add(current);
      }
    }
    return result;
  }

  private TypeSystemStateTreeNode createTypesNode() {
    TypeSystemStateTreeNode result = new TypeSystemStateTreeNode("Types", myOperationContext);
    List<TypeTreeNode> list = new ArrayList<TypeTreeNode>();
    NodeMaps nodeMaps = myState.getNodeMaps();
    for (SNode node : nodeMaps.getTypeKeySet()) {
      SNode type = nodeMaps.getInitialType(node);
      list.add(new TypeTreeNode(myOperationContext, node, type, myState.expand(type), myEditorComponent));
    }
    Collections.sort(list, new Comparator<TypeTreeNode>() {
      @Override
      public int compare(TypeTreeNode o1, TypeTreeNode o2) {
        return o1.toString().compareTo(o2.toString());
      }
    });
    for (TypeTreeNode node : list) {
      result.add(node);
    }
    return result;
  }

  private TypeSystemStateTreeNode createEquationsNode() {
    TypeSystemStateTreeNode result = new TypeSystemStateTreeNode("Equations", myOperationContext);
    for (Map.Entry<SNode, Set<SNode>> equationGroup : myState.getEquations().getEquationGroups()) {
      result.add(new EquationTreeNode(myOperationContext, equationGroup.getKey(), equationGroup.getValue(), myState, myEditorComponent));
    }
    return result;
  }

  @Override
  protected JPopupMenu createPopupMenu(final MPSTreeNode treeNode) {
    BaseAction goToRule = null;
    BaseAction goToNode = null;
    final TypeSystemStateTreeNode stateNode = (TypeSystemStateTreeNode) treeNode;
    if (stateNode.getRuleModel() != null && stateNode.getRuleId() != null) {
      goToRule = new BaseAction("Go to rule") {
        public void doExecute(AnActionEvent e, Map<String, Object> _params) {
          GoToTypeErrorRuleUtil.goToRuleById(myOperationContext, new Pair<String, String>(stateNode.getRuleModel(), stateNode.getRuleId()));

        }
      };
    }
    final DefaultActionGroup group = ActionUtils.groupFromActions(goToRule, goToNode);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        NodeMaps maps = myState.getNodeMaps();
        List<SNode> vars = stateNode.getVariables();
        if (null == vars) {
          return;
        }
        for (SNode var : vars) {
          final SNode node = check_x8yvv7_a0a0d0a0a0a0f0i(maps, var);
          if (node != null && node.isRegistered()) {
            group.add(new BaseAction("Go to node with type " + var) {
              public void doExecute(AnActionEvent e, Map<String, Object> _params) {
                myOperationContext.getComponent(MPSEditorOpener.class).editNode(node, myOperationContext);
              }
            });
          }
        }
      }
    });
    return ActionManager.getInstance().createActionPopupMenu(ActionPlaces.UNKNOWN, group).getComponent();
  }

  private static SNode check_x8yvv7_a0a0d0a0a0a0f0i(NodeMaps checkedDotOperand, SNode var) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getNode(var);
    }
    return null;
  }
}
