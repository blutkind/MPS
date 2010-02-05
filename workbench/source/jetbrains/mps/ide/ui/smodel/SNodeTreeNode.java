/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.ide.ui.smodel;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.ide.projectPane.ProjectPaneActionGroups;
import jetbrains.mps.ide.projectPane.LogicalViewTree;
import jetbrains.mps.ide.ui.ErrorState;
import jetbrains.mps.ide.ui.MPSTreeNodeEx;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.action.ActionUtils;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import java.awt.Color;
import java.util.List;
import java.util.Set;

public class SNodeTreeNode extends MPSTreeNodeEx {
  protected boolean myInitialized = false;
  private SNode myNode;
  private String myRole;
  private Condition<SNode> myCondition = Condition.TRUE_CONDITION;
  private SNodeTreeUpdater myTreeUpdater;
  private MyEventsCollector myEventsCollector;
  private  MySNodeModelListener mySNodeModelListener;

  public SNodeTreeNode(SNode node, IOperationContext operationContext) {
    this(node, null, operationContext);
  }

  public SNodeTreeNode(SNode node, String role, IOperationContext operationContext) {
    this(node, role, operationContext, Condition.TRUE_CONDITION);
  }

  public SNodeTreeNode(SNode node, String role, IOperationContext operationContext, Condition<SNode> condition) {
    super(operationContext);
    myNode = node;
    myRole = role;
    myCondition = condition;
    updatePresentation();
  }

  protected final void updatePresentation() {
    if (getSModelModelTreeNode() != null) {
      getSModelModelTreeNode().getDependencyRecorder().rebuild(this, new Runnable() {
        public void run() {
          doUpdatePresentation();
        }
      });
    } else {
      doUpdatePresentation();
    }
  }

  private boolean isWithModelListener() {
    return getSModelModelTreeNode() == null && getModelDescriptor() != null;
  }

  protected void onAdd() {
    super.onAdd();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        updatePresentation();
      }
    });
    if (isWithModelListener()) {
      myEventsCollector = new MyEventsCollector();
      mySNodeModelListener = new MySNodeModelListener();
      myTreeUpdater = new SNodeTreeUpdater(getOperationContext(), new DependencyRecorder<SNodeTreeNode>(), getTree());
      myTreeUpdater.addListener(new SNodeTreeListener(this) {
        public void addAndRemoveRoots(Set<SNode> removedRoots, Set<SNode> addedRoots) {
          DefaultTreeModel treeModel = (DefaultTreeModel) getTree().getModel();
          for (SNode removedRoot : removedRoots) {
            if (removedRoot.equals(getSNode())) {
              treeModel.removeNodeFromParent(SNodeTreeNode.this);
            }
          }
        }

        public void addAndRemoveVisibleChildren(Set<SNode> removedNodes, Set<SNode> addedNodes) {
        }

        public void updateChangedPresentations(Set<SNode> nodesWithChangedPresentations) {
        }

        public void updateChangedRefs(Set<SNode> nodesWithChangedRefs) {
        }

        public void updateNodesWithChangedPackages(Set<SNode> nodesWithChangedPackages) {
        }
      });
      addListeners();
    }
  }

  protected void onRemove() {
    if (getSModelModelTreeNode() != null) {
      getSModelModelTreeNode().getDependencyRecorder().remove(this);
    }
    if (isWithModelListener()) {
      removeListeners();
    }
    super.onRemove();
  }

  protected void doUpdatePresentation() {
    if (hasErrors()) {
      setColor(Color.RED);
    } else {
      setColor(Color.BLACK);
    }
// [Dirty implementation of VCS highlighting in editor
//    ChangesManager changesManager = ChangesManager.getInstance(getOperationContext().getProject());
//    ModelChangesManager modelChangesManager = null;
//    if (changesManager != null) {
//      modelChangesManager = changesManager.getModelChangesManager(myNode.getModel().getSModelReference());
//    }
//
//    if (modelChangesManager != null && modelChangesManager.isAddedNode(myNode)) {
//      setColor(FileStatus.COLOR_ADDED);
//    } else if (hasErrors()) {
//      setColor(Color.RED);
//    } else {
//      setColor(Color.BLACK);
//    }

    if (myNode != null) {
      setIcon(IconManager.getIconFor(myNode));
    }

    if (getSNode() == null) {
      setNodeIdentifier("null");
    } else {
      setNodeIdentifier(getSNode().getId());
    }

    if (getSNode().isUnknown()) {
      setErrorState(ErrorState.ERROR);
    }

    setText(caclulateNodeTextPresentation());
    setAutoExpandable(myNode != null && !myNode.isRoot());
  }

  public SModelTreeNode getSModelModelTreeNode() {
    if (getParent() instanceof SModelTreeNode) {
      return (SModelTreeNode) getParent();
    }

    if (getParent() instanceof SNodeTreeNode) {
      return ((SNodeTreeNode) getParent()).getSModelModelTreeNode();
    }

    if (getParent() instanceof SNodeGroupTreeNode) {
      TreeNode node = getParent();
      while (!(node instanceof SModelTreeNode)) {
        node = node.getParent();
      }
      return (SModelTreeNode) node;
    }

    return null;
  }

  public ActionGroup getActionGroup() {
    return ActionUtils.getGroup(ProjectPaneActionGroups.PROJECT_PANE_NODE_ACTIONS);
  }

  public Object getUserObject() {
    return myNode;
  }

  public int getToggleClickCount() {
    return -1;
  }

  public SNode getSNode() {
    return myNode;
  }

  protected void doUpdate() {
    this.removeAllChildren();
    myInitialized = false;
  }

  public boolean isInitialized() {
    return myInitialized;
  }

  protected void doInit() {
    this.removeAllChildren();
    SNode n = getSNode();
    if (n == null) return;

    if (showPropertiesAndReferences()) {
      add(new PropertiesTreeNode(getOperationContext(), n));
      add(new ReferencesTreeNode(getOperationContext(), n));
    }

    List<SNode> children = n.getChildren();
    List<SNode> filteredChildren = CollectionUtil.filter(children, myCondition);
    for (SNode childNode : filteredChildren) {
      SNodeTreeNode child = createChildTreeNode(childNode, childNode.getRole_(), getOperationContext());
      child.myCondition = myCondition;
      add(child);
    }

    DefaultTreeModel treeModel = (DefaultTreeModel) getTree().getModel();
    treeModel.nodeStructureChanged(this);
    myInitialized = true;
  }

  protected SNodeTreeNode createChildTreeNode(SNode childNode, String role, IOperationContext operationContext) {
    SModelTreeNode sModelTreeNode = getSModelModelTreeNode();
    SNodeTreeNode child = sModelTreeNode == null ? new SNodeTreeNode(childNode, role, operationContext)
      : sModelTreeNode.createSNodeTreeNode(childNode, role, operationContext);
    return child;
  }

  private boolean showPropertiesAndReferences() {
    Project project = getOperationContext().getProject();
    return getTree() instanceof LogicalViewTree &&
      ProjectPane.getInstance(project).isShowPropertiesAndReferences();
  }

  public void doubleClick() {
    if (getTree() instanceof LogicalViewTree) {
      ((LogicalViewTree) getTree()).editNode(myNode, getOperationContext(), true);
    }
  }

  @Override
  public void autoscroll() {
    super.autoscroll();
    if (getTree() instanceof LogicalViewTree) {
      ((LogicalViewTree) getTree()).editNode(myNode, getOperationContext(), false);
    }
  }

  private SModelDescriptor getModelDescriptor() {
    SNode node = getSNode();
    if (node == null) return null;
    SModelDescriptor md = node.getModel().getModelDescriptor();
    return md;
  }

  private void addListeners() {
    if (myEventsCollector == null) return;
    SModelDescriptor md = getModelDescriptor();
    if (md == null) return;
    myEventsCollector.add(md);
    md.addModelListener(mySNodeModelListener);
  }

  private void removeListeners() {
    SModelDescriptor md = getModelDescriptor();
    if (md == null) return;
    getModelDescriptor().removeModelListener(mySNodeModelListener);
    if (myEventsCollector == null) return;
    myEventsCollector.remove(md);
    myEventsCollector.dispose();
    myEventsCollector = null;
  }

  private String caclulateNodeTextPresentation() {
    StringBuffer output = new StringBuffer();

    if (myRole != null) {
      output.append(myRole).append(" : ");
    }

    SNode node = getSNode();
    if (node != null) {
      String nodeString = node.getPresentation();
      output.append(nodeString);
      if (myRole != null) {
        String presentation = node.getPresentation();
        if (presentation != null && !presentation.equals(nodeString)) {
          output.append(" [").append(presentation).append("]");
        }
      }
    }

    return output.toString();
  }

  public boolean hasErrors() {
    return false;
  }

  class MyEventsCollector extends EventsCollector {
    protected void eventsHappened(List<SModelEvent> events) {
      if (SNodeTreeNode.this.isWithModelListener()) {
        myTreeUpdater.eventsHappenedInCommand(events);
      }
    }
  }

  class MySNodeModelListener extends SModelAdapter {

  }
}
