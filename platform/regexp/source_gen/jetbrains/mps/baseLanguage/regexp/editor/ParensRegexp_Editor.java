package jetbrains.mps.baseLanguage.regexp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_Group;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class ParensRegexp_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_igyl5p_a(editorContext, node);
  }

  private EditorCell createCollection_igyl5p_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_igyl5p_a");
    editorCell.addKeyMap(new RegexpSequenceByEnter());
    editorCell.addEditorCell(this.createConstant_igyl5p_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_igyl5p_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_igyl5p_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_igyl5p_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_igyl5p_a0");
    RegexpStylesheet_StyleSheet.getLeftRegexpBrace(editorCell).apply(editorCell);
    ParensRegexp_Actions.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new ParensRegexp_Editor.ReplaceWith_ParensRegexp_cellMenu_a0a0(), new ParensRegexp_Editor.ParensRegexp_customReplace_cellMenu_b0a0()}));
    return editorCell;
  }

  private EditorCell createConstant_igyl5p_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_igyl5p_c0");
    RegexpStylesheet_StyleSheet.getRightRegexpBrace(editorCell).apply(editorCell);
    ParensRegexp_Actions.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_igyl5p_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("expr");
    provider.setNoTargetText("<no expr>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class ParensRegexp_customReplace_cellMenu_b0a0 extends AbstractCellMenuPart_ReplaceNode_Group {
    public ParensRegexp_customReplace_cellMenu_b0a0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      List<SNode> res = ListSequence.fromList(new LinkedList<SNode>());
      ListSequence.fromList(res).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.NegativeLookAheadRegexp"));
      ListSequence.fromList(res).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.NegativeLookBehindRegexp"));
      ListSequence.fromList(res).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.PositiveLookAheadRegexp"));
      ListSequence.fromList(res).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.PositiveLookBehindRegexp"));
      ListSequence.fromList(res).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp"));
      return res;
    }

    public SNode createReplacementNode(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      return this.createReplacementNode_impl((SNode) parameterObject, node, model, scope, operationContext);
    }

    public SNode createReplacementNode_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      return SConceptOperations.createNewNode(NameUtil.nodeFQName(parameterObject), node);
    }

    public boolean isReferentPresentation() {
      return false;
    }
  }

  public static class ReplaceWith_ParensRegexp_cellMenu_a0a0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {
    public ReplaceWith_ParensRegexp_cellMenu_a0a0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp";
    }
  }
}
