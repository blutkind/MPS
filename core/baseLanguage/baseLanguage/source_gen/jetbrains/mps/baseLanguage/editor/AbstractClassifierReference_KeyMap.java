package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class AbstractClassifierReference_KeyMap extends EditorCellKeyMap {
  public AbstractClassifierReference_KeyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new AbstractClassifierReference_KeyMap.AbstractClassifierReference_KeyMap_Action0();
    this.putAction("none", "VK_SPACE", action);
  }

  public static class AbstractClassifierReference_KeyMap_Action0 extends EditorCellKeyMapAction {
    public AbstractClassifierReference_KeyMap_Action0() {
      super.setCaretPolicy(EditorCellKeyMapAction.CARET_AT_LAST_POSITION);
      this.setShownInPopupMenu(false);
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.AbstractClassifierReference")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.Statement");
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNodeOperations.replaceWithAnother(SNodeOperations.getParent(node), new AbstractClassifierReference_KeyMap.AbstractClassifierReference_KeyMap_Action0.QuotationClass_l22mu2_a1a0a4a().createNode(SLinkOperations.getTarget(node, "classifier", false)));
    }

    public String getKeyStroke() {
      return "none SPACE";
    }

    public static class QuotationClass_l22mu2_a1a0a4a {
      public QuotationClass_l22mu2_a1a0a4a() {
      }

      public SNode createNode(Object parameter_l22mu2_a0a0a0a0a0a0) {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        SNode quotedNode_2 = null;
        SNode quotedNode_3 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_1;
          {
            quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_5 = quotedNode_2;
            {
              quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_6 = quotedNode_3;
              quotedNode1_6.setReferent("classifier", (SNode) parameter_l22mu2_a0a0a0a0a0a0);
              quotedNode_2.addChild("type", quotedNode1_6);
            }
            quotedNode_1.addChild("localVariableDeclaration", quotedNode1_5);
          }
          result = quotedNode1_4;
        }
        return result;
      }
    }
  }
}
