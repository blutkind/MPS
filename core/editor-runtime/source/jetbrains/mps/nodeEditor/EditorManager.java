/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.nodeEditor;

import com.intellij.ui.LightColors;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.attribute.AttributeKind;
import jetbrains.mps.nodeEditor.cellMenu.AbstractNodeSubstituteInfo;
import jetbrains.mps.nodeEditor.cells.*;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.ModelActions;
import jetbrains.mps.smodel.action.NodeSubstituteActionWrapper;
import jetbrains.mps.smodel.event.SModelChildEvent;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.smodel.event.SModelPropertyEvent;
import jetbrains.mps.smodel.event.SModelReferenceEvent;
import jetbrains.mps.util.Pair;
import org.jetbrains.annotations.Nullable;

import java.awt.event.KeyEvent;
import java.util.*;

public class EditorManager {
  private static final Logger LOG = Logger.getLogger(EditorManager.class);

  public static final String BIG_CELL_CONTEXT = "big-cell-context";

  public static final String SIDE_TRANSFORM_HINT_ANCHOR_CELL_ID = "st-hint-anchor-cell-id";
  public static final String SIDE_TRANSFORM_HINT_ANCHOR_TAG = "st-hint-anchor-tag";

  public static final String OLD_NODE_FOR_SUBSTITUTION = "oldNode";

  private HashMap<ReferencedNodeContext, EditorCell> myMap = new HashMap<ReferencedNodeContext, EditorCell>();
  private boolean myCreatingInspectedCell = false;

  private Map<Class, Stack<EditorCell>> myAttributedClassesToAttributedCellStacksMap = new HashMap<Class, Stack<EditorCell>>();
  private EditorCell myLastAttributedCell;
  private Stack<SNode> myAttributesStack = new Stack<SNode>();

  public static EditorManager getInstanceFromContext(IOperationContext operationContext) {
    return operationContext.getComponent(EditorManager.class);
  }

  public EditorCell createRootCell(EditorContext context, SNode node, List<SModelEvent> events) {
    return createRootCell(context, node, events, false);
  }

  private EditorCell createRootCell(EditorContext context, SNode node, List<SModelEvent> events, boolean isInspectorCell) {
    try {
      context.pushTracerTask("Creating " + (isInspectorCell ? "inspector" : "root") + " cell", true);
      EditorComponent nodeEditorComponent = context.getNodeEditorComponent();
      EditorCell rootCell = nodeEditorComponent.getRootCell();
      ReferencedNodeContext nodeRefContext = ReferencedNodeContext.createNodeContext(node);
      myMap.clear();
      if (rootCell != null) {
        myMap.putAll(getContextToCellMap(rootCell));
      }
      myCreatingInspectedCell = isInspectorCell;
      return createEditorCell(context, events, nodeRefContext);
    } finally {
      myMap.clear();
      context.popTracerTask();
    }
  }

  private static Map<ReferencedNodeContext, EditorCell> getContextToCellMap(EditorCell cell) {
    Map<ReferencedNodeContext, EditorCell> result = new HashMap<ReferencedNodeContext, EditorCell>();
    Object bigCellContext = cell.getUserObject(BIG_CELL_CONTEXT);
    if (bigCellContext instanceof ReferencedNodeContext) {
      ReferencedNodeContext refContext = (ReferencedNodeContext) bigCellContext;
      result.put(refContext, cell);
      // Don't go deeper if this cell represents normal node.
      //
      // Go deeper if this cell represents attribute node
      // since we need to load mappings for all child attributes
      // till the "main" node's cell and main node's cell itself.
      if (!refContext.isNodeAttribute()) {
        return result;
      }
    }
    result.putAll(getContextToCellMapForChildren(cell));
    return result;
  }

  private static Map<ReferencedNodeContext, EditorCell> getContextToCellMapForChildren(EditorCell cell) {
    Map<ReferencedNodeContext, EditorCell> result = new HashMap<ReferencedNodeContext, EditorCell>();
    if (cell instanceof EditorCell_Collection) {
      for (EditorCell childCell : ((EditorCell_Collection) cell)) {
        result.putAll(getContextToCellMap(childCell));
      }
    }
    return result;
  }

  public EditorCell getCurrentAttributedPropertyCell() {
    return getCurrentAttributedCellWithRole(AttributeKind.Property.class);
  }

  public EditorCell getCurrentAttributedLinkCell() {
    return getCurrentAttributedCellWithRole(AttributeKind.Reference.class);
  }

  public EditorCell getCurrentAttributedNodeCell() {
    return getCurrentAttributedCellWithRole(AttributeKind.Node.class);
  }

  public EditorCell createRoleAttributeCell(EditorContext context, SNode roleAttribute, Class attributeKind, EditorCell cellWithRole) {
    // TODO: Make processing of style attributes more generic.
    EditorCell attributeCell = context.createRoleAttributeCell(attributeKind, cellWithRole, roleAttribute);
    // see a comment for isAttributedCell() method
    if (attributeCell == cellWithRole) {
      return cellWithRole;
    }
    if (cellWithRole.getStyle().get(StyleAttributes.INDENT_LAYOUT_NEW_LINE)) {
      attributeCell.getStyle().set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }

    EditorComponent editor = context.getNodeEditorComponent();
    Set<SNode> newAttributeCell_DependOn = new HashSet<SNode>();
    Set<SNode> attributeCell_DependOn = editor.getNodesCellDependOn(attributeCell);
    if (attributeCell_DependOn != null) {
      newAttributeCell_DependOn.addAll(attributeCell_DependOn);
    }
    Set<SNodePointer> newAttributeCell_RefTargetsDependsOn = new HashSet<SNodePointer>();
    Set<SNodePointer> attributeCell_RefTargetsDependsOn = editor.getCopyOfRefTargetsCellDependsOn(attributeCell);
    if (attributeCell_RefTargetsDependsOn != null) {
      newAttributeCell_RefTargetsDependsOn.addAll(attributeCell_RefTargetsDependsOn);
    }

    Set<SNode> cellWithRole_DependOn = editor.getNodesCellDependOn(cellWithRole);
    if (cellWithRole_DependOn != null) {
      newAttributeCell_DependOn.addAll(cellWithRole_DependOn);
    }
    Set<SNodePointer> cellWithRole_RefTargetsDependsOn = editor.getCopyOfRefTargetsCellDependsOn(cellWithRole);
    if (cellWithRole_RefTargetsDependsOn != null) {
      newAttributeCell_RefTargetsDependsOn.addAll(cellWithRole_RefTargetsDependsOn);
    }
    editor.putCellAndNodesToDependOn(attributeCell, newAttributeCell_DependOn, newAttributeCell_RefTargetsDependsOn);

    return attributeCell;
  }

  /*package*/ EditorCell doCreateRoleAttributeCell(Class attributeKind, EditorCell cellWithRole, EditorContext context, SNode roleAttribute, List<SModelEvent> sModelEvents) {
    Stack<EditorCell> stack = myAttributedClassesToAttributedCellStacksMap.get(attributeKind);
    if (stack == null) {
      stack = new Stack<EditorCell>();
      myAttributedClassesToAttributedCellStacksMap.put(attributeKind, stack);
    }
    stack.push(cellWithRole);
    myLastAttributedCell = cellWithRole;
    EditorCell result = createEditorCell(context, sModelEvents, ReferencedNodeContext.createNodeAttributeContext(roleAttribute));
    myLastAttributedCell = null;
    EditorCell cellWithRolePopped = stack.pop();
    LOG.assertLog(cellWithRolePopped == cellWithRole);
    return result;
  }

  public EditorCell createNodeAttributeCell(EditorContext context, SNode attribute, EditorCell nodeCell) {
    return createRoleAttributeCell(context, attribute, AttributeKind.Node.class, nodeCell);
  }

  public EditorCell getCurrentAttributedCellWithRole(Class attributeKind) {
    Stack<EditorCell> stack = myAttributedClassesToAttributedCellStacksMap.get(attributeKind);
    if (stack == null) {
      stack = new Stack<EditorCell>();
      myAttributedClassesToAttributedCellStacksMap.put(attributeKind, stack);
    }
    return stack.isEmpty() ? null : stack.peek();
  }

  protected boolean areAttributesShown() {
    return !myCreatingInspectedCell;
  }

  /*package*/ EditorCell createEditorCell(EditorContext context, List<SModelEvent> events, ReferencedNodeContext refContext) {
    context.pushTracerTask("?" + refContext.toString(), true);
    try {
      SNode node = refContext.getNode();

      if (areAttributesShown()) {
        for (SNode attribute : AttributeOperations.getNodeAttributes(node)) {
          assert attribute != null;
          // processing each attribute of current node just one time
          // (creating cell tree for attributes & node recursively)
          if (!myAttributesStack.contains(attribute)) {
            myAttributesStack.push(attribute);

            EditorCell nodeCell = createEditorCell(context, events, refContext);

            SNode poppedAttribute = myAttributesStack.pop();
            LOG.assertLog(poppedAttribute == attribute);
            return createNodeAttributeCell(context, attribute, nodeCell);
          }
        }
      }

      EditorComponent nodeEditorComponent = context.getNodeEditorComponent();
      if (events != null) {
        EditorCell oldCell = myMap.get(refContext);
        boolean nodeChanged = isNodeChanged(events, nodeEditorComponent, oldCell);

        if (!nodeChanged) {
          if (oldCell != null) {
            final Set<SNode> nodesOldCellDependsOn = nodeEditorComponent.getNodesCellDependOn(oldCell);
            final Set<SNodePointer> refTargetsOldCellDependsOn = nodeEditorComponent.getCopyOfRefTargetsCellDependsOn(oldCell);
            if (nodesOldCellDependsOn != null || refTargetsOldCellDependsOn != null) {
              // Node was not changed, we have oldCell so it will not be re-created.
              //
              // Now all the dependencies of this (old) Cell should be added to currently active
              // NodeReadAccessInEditorListener, so will be reported as parent Cell dependencies.
              //
              // Same logic is implemented in NodeReadAccessCasterInEditor.removeCellBuildNodeAccessListener(), so
              // we should duplicate it here to emulate proper update process for parent cell.
              NodeReadAccessInEditorListener parentReadAccessListener = NodeReadAccessCasterInEditor.getReadAccessListener();
              if (parentReadAccessListener != null) {
                if (nodesOldCellDependsOn != null) {
                  parentReadAccessListener.addNodesToDependOn(nodesOldCellDependsOn);
                }
                if (refTargetsOldCellDependsOn != null) {
                  parentReadAccessListener.addRefTargetsToDependOn(refTargetsOldCellDependsOn);
                }
              }
            }
            return oldCell;
          }
        }
        myMap.putAll(getContextToCellMapForChildren(oldCell));
        nodeEditorComponent.clearNodesCellDependsOn(oldCell, this);
      }

      return createEditorCell_internal(context, myCreatingInspectedCell, refContext);
    } finally {
      context.popTracerTask();
    }
  }

  private boolean isNodeChanged(List<SModelEvent> events, EditorComponent nodeEditorComponent, EditorCell oldCell) {
    boolean nodeChanged = false;
    for (SModelEvent event : events) {
      SNode eventNode;
      if (event instanceof SModelChildEvent) {
        eventNode = ((SModelChildEvent) event).getParent();
      } else if (event instanceof SModelReferenceEvent) {
        eventNode = ((SModelReferenceEvent) event).getReference().getSourceNode();
      } else if (event instanceof SModelPropertyEvent) {
        eventNode = ((SModelPropertyEvent) event).getNode();
      } else continue;
      if (nodeEditorComponent.doesCellDependOnNode(oldCell, eventNode)) {
        nodeChanged = true;
        break;
      }
    }
    return nodeChanged;
  }


  public boolean isCreatingInspectedCell() {
    return myCreatingInspectedCell;
  }

  private EditorCell createEditorCell_internal(final EditorContext context, boolean isInspectorCell, ReferencedNodeContext refContext) {
    context.pushTracerTask("+" + refContext.toString(), true);
    try {
      final SNode node = refContext.getNode();

      //reset creating inspected cell : we don't create not-root inspected cells
      myCreatingInspectedCell = false;

      INodeEditor editor = getEditor(context, node);
      EditorComponent editorComponent = context.getNodeEditorComponent();
      EditorCell nodeCell = null;
      NodeReadAccessInEditorListener nodeAccessListener = new NodeReadAccessInEditorListener();
      try {
        //voodoo for editor incremental rebuild support
        NodeReadAccessCasterInEditor.setCellBuildNodeReadAccessListener(nodeAccessListener);
        nodeCell = isInspectorCell ? editor.createInspectedCell(context, node) : editor.createEditorCell(context, node);
        //-voodoo

        if (isAttributedCell(nodeCell)) {
          return nodeCell;
        }

        if (SNodeEditorUtil.hasRightTransformHint(node)) {
          nodeCell = addSideTransformHintCell(node, nodeCell, context, CellSide.RIGHT);
          return nodeCell;
        }

        if (SNodeEditorUtil.hasLeftTransformHint(node)) {
          nodeCell = addSideTransformHintCell(node, nodeCell, context, CellSide.LEFT);
          return nodeCell;
        }
      } catch (Throwable e) {
        LOG.error("Failed to create cell for node " + node.getDebugText(), e);
        nodeCell = new EditorCell_Error(context, node, "!exception!:" + node.getDebugText());
      } finally {
        NodeReadAccessCasterInEditor.removeCellBuildNodeAccessListener();
        if (nodeCell != null && !isAttributedCell(nodeCell)) {
          nodeCell.putUserObject(BIG_CELL_CONTEXT, refContext);
          editorComponent.registerAsBigCell(nodeCell, this);
          addNodeDependenciesToEditor(nodeCell, nodeAccessListener, context);
        }
      }

      assert nodeCell != null;
      return nodeCell;
    } finally {
      context.popTracerTask();
    }
  }

  /**
   * Some attributes node editors return attributed node cell directly. For such an editors we should skip
   * all attribute-specific cell processing. This method is used to determine if the result of generated
   * Editor execution is equals to not wrapped cell of attributed node.
   */
  private boolean isAttributedCell(EditorCell nodeCell) {
    return myLastAttributedCell == nodeCell;
  }

  private void addNodeDependenciesToEditor(EditorCell cell, NodeReadAccessInEditorListener listener, EditorContext editorContext) {
    EditorComponent editor = editorContext.getNodeEditorComponent();
    editor.putCellAndNodesToDependOn(cell, listener.getNodesToDependOn(), listener.getRefTargetsToDependOn());
    for (Pair<SNodePointer, String> pair : listener.getDirtilyReadAccessedProperties()) {
      editor.addCellDependentOnNodePropertyWhichWasAccessedDirtily(cell, pair);
    }
    for (Pair<SNodePointer, String> pair : listener.getExistenceReadAccessProperties()) {
      editor.addCellDependentOnNodePropertyWhichExistenceWasChecked(cell, pair);
    }
  }

  private EditorCell addSideTransformHintCell(final SNode node, EditorCell nodeCell, final EditorContext context, final CellSide side) {
    // create the hint cell
    final EditorCell_STHint sideTransformHintCell = new EditorCell_STHint(context, node, side);
    final CellInfo nodeCellInfo = context.getNodeEditorComponent().getRecentlySelectedCellInfo();

    // delete the hint when pressed ctrl-delete, delete or backspace
    sideTransformHintCell.setAction(CellActionType.DELETE, new EditorCellAction() {
      public void execute(final EditorContext context) {
        removeSTHintAndChangeSelection(context, node, nodeCellInfo);
      }
    });
    // delete the hint when double press 'space'
    sideTransformHintCell.setAction(CellActionType.RIGHT_TRANSFORM, new EditorCellAction() {
      public void execute(EditorContext context) {
        removeSTHintAndChangeSelection(context, node, nodeCellInfo);
      }
    });

    sideTransformHintCell.setAction(CellActionType.LEFT_TRANSFORM, new EditorCellAction() {
      public void execute(EditorContext context) {
        removeSTHintAndChangeSelection(context, node, nodeCellInfo);
      }
    });

    // delete the hint when double press 'esc'
    EditorCellKeyMap keyMap = new EditorCellKeyMap();
    keyMap.putAction(EditorCellKeyMap.KEY_MODIFIERS_NONE, "VK_ESCAPE", new EditorCellKeyMapAction() {
      public void execute(KeyEvent keyEvent, final EditorContext context) {
        removeSTHintAndChangeSelection(context, node, nodeCellInfo);
      }
    });
    sideTransformHintCell.addKeyMap(keyMap);

    // create the hint's auto-completion menu
    final String transformTag = (String) node.getUserObject(SIDE_TRANSFORM_HINT_ANCHOR_TAG);
    sideTransformHintCell.setSubstituteInfo(new AbstractNodeSubstituteInfo(context) {
      protected List<INodeSubstituteAction> createActions() {
        List list = ModelActions.createRightTransformHintSubstituteActions(node, side, transformTag, context.getOperationContext());
        List wrapperList = new LinkedList();
        for (final Object action : list) {
          wrapperList.add(new NodeSubstituteActionWrapper((INodeSubstituteAction) action) {
            public SNode substitute(@Nullable EditorContext context, String pattern) {
              ModelAccess.instance().runWriteActionInCommand(new Runnable() {
                public void run() {
                  SNodeEditorUtil.removeRightTransformHint(node);
                  SNodeEditorUtil.removeLeftTransformHint(node);
                }
              });
              return super.substitute(context, pattern);
            }

            public String toString() {
              return "RTWrapper for " + action + "(" + action.getClass() + ")";
            }
          });
        }
        return wrapperList;
      }
    });

    // decide position of the hint cell
    EditorCell resultCell;
    Object anchorId = node.getUserObject(SIDE_TRANSFORM_HINT_ANCHOR_CELL_ID);
    EditorCell anchorCell = anchorId == null ? null : nodeCell.findChild(CellFinders.byId(node, anchorId.toString()), true);
    if (anchorCell != null && anchorCell != nodeCell) {
      EditorCell_Collection cellCollection = anchorCell.getParent();
      int index;
      if (side == CellSide.RIGHT) {
        index = cellCollection.indexOf(anchorCell) + 1;
      } else {
        index = cellCollection.indexOf(anchorCell);
      }

      cellCollection.addCellAt(index, sideTransformHintCell, false);
      resultCell = nodeCell;
      sideTransformHintCell.setAnchor(anchorCell);
    } else {
      // couldn't insert hint cell - create wrapper collection and put hint to last position
      EditorCell_Collection rowWrapper = EditorCell_Collection.createHorizontal(context, node);
      rowWrapper.setSelectable(false);
      rowWrapper.addEditorCell(nodeCell);
      if (side == CellSide.RIGHT) {
        rowWrapper.addEditorCell(sideTransformHintCell);
      } else {
        rowWrapper.addCellAt(0, sideTransformHintCell, false);
      }
      resultCell = rowWrapper;
      sideTransformHintCell.setAnchor(nodeCell);
    }
    return resultCell;
  }

  private void removeSTHintAndChangeSelection(final EditorContext context, SNode node, final CellInfo cellInfoToSelect) {
    SNodeEditorUtil.removeRightTransformHint(node);
    SNodeEditorUtil.removeLeftTransformHint(node);

    context.flushEvents();

    EditorComponent nodeEditorComponent = context.getNodeEditorComponent();
    if (cellInfoToSelect == null) return;
    EditorCell newlySelectedCell = cellInfoToSelect.findCell(nodeEditorComponent);
    if (newlySelectedCell == null) return;
    context.getNodeEditorComponent().changeSelection(newlySelectedCell);
    if (newlySelectedCell instanceof EditorCell_Label) {
      ((EditorCell_Label) newlySelectedCell).end();
    }
  }


  public static class EditorCell_STHint extends EditorCell_Constant {

    private EditorCell myAnchorCell;
    private CellSide mySide;

    protected EditorCell_STHint(EditorContext editorContext, SNode node, CellSide side) {
      super(editorContext, node, "");
      setCellId("STHint");
      setDefaultText(" ");
      setEditable(true);
      setCellBackgroundColor(LightColors.BLUE);

      getStyle().set(StyleAttributes.PUNCTUATION_LEFT, true);
      getStyle().set(StyleAttributes.PUNCTUATION_RIGHT, true);
      getStyle().set(StyleAttributes.FIRST_POSITION_ALLOWED, true);
      getStyle().set(StyleAttributes.LAST_POSITION_ALLOWED, true);

      mySide = side;
    }

    public CellInfo getCellInfo() {
      return new STHintCellInfo(EditorCell_STHint.this, myAnchorCell);
    }

    public void changeText(String text) {
      super.changeText(text);
      if ("".equals(getText())) {
        SNodeEditorUtil.removeRightTransformHint(getSNode());
        SNodeEditorUtil.removeLeftTransformHint(getSNode());
      }
    }

    public void setCaretPosition(int position, boolean selection) {
      if (position != getText().length() && mySide == CellSide.LEFT) {
        validate(true, false);
      }
      super.setCaretPosition(position, selection);
    }

    public CellSide getSide() {
      return mySide;
    }

    public EditorCell getAnchorCell() {
      return myAnchorCell;
    }

    private void setAnchor(EditorCell anchorCell) {
      myAnchorCell = anchorCell;
    }

    public void synchronizeViewWithModel() {

    }
  }

  EditorCell createInspectedCell(EditorContext context, SNode node, List<SModelEvent> events) {
    return createRootCell(context, node, events, true);
  }

  private INodeEditor getEditor(EditorContext context, SNode node) {
    INodeEditor editor = null;

    editor = jetbrains.mps.editor.runtime.impl.EditorsFinderManager.getInstance().loadEditor(context, node);
    if (editor == null) {
      editor = new DefaultNodeEditor();
    }
    return editor;
  }

  private static class STHintCellInfo extends DefaultCellInfo {
    CellInfo myAnchorCellInfo;

    public STHintCellInfo(EditorCell_Constant rightTransformHintCell, EditorCell anchorCell) {
      super(rightTransformHintCell);
      myAnchorCellInfo = anchorCell.getCellInfo();
    }

    public EditorCell findCell(EditorComponent editorComponent) {
      EditorCell anchorCell = myAnchorCellInfo.findCell(editorComponent);
      if (anchorCell == null) return super.findCell(editorComponent);
      return anchorCell.getSTHintCell();
    }

    public EditorCell findClosestCell(EditorComponent editorComponent) {
      EditorCell anchorCell = myAnchorCellInfo.findCell(editorComponent);
      if (anchorCell == null) return super.findCell(editorComponent);
      EditorCell_Label rtHint = anchorCell.getSTHintCell();
      if (rtHint == null) {
        return anchorCell;
      }
      return rtHint;
    }
  }
}
