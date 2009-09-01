package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.lang.generator.structure.NodeMacro_AnnotationLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.InlineCellProvider;

public class NodeMacro_postfix extends AbstractCellProvider {
  public NodeMacro_postfix(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext editorContext) {
    return this.createEditorCell(editorContext, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_9824_0(editorContext, node);
  }

  private EditorCell createCollection_9824_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_9824_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.HORIZONTAL_GAP, new Padding(3, Measure.PIXELS));
    }
    if (renderingCondition9824_0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_9824_1(editorContext, node));
    }
    if (renderingCondition9824_1(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefCell_9824_0(editorContext, node));
    }
    if (renderingCondition9824_2(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createProperty_9824_1(editorContext, node));
    }
    editorCell.addEditorCell(this.createAttributedNodeCell_9824_0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_9824_1(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_9824_1");
    editorCell.addEditorCell(this.createConstant_9824_0(editorContext, node));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_9824_0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_9824_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "bad role:");
    editorCell.setCellId("Constant_9824_0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createReadOnlyModelAccessor_9824_0(final EditorContext editorContext, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, new ModelAccessor() {
      public String getText() {
        return node.getRole_();
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    editorCell.setCellId("ReadOnlyModelAccessor_9824_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.red);
    }
    return editorCell;
  }

  private EditorCell createAttributedNodeCell_9824_0(EditorContext editorContext, SNode node) {
    IOperationContext opContext = editorContext.getOperationContext();
    EditorManager manager = EditorManager.getInstanceFromContext(opContext);
    EditorCell editorCell = manager.getCurrentAttributedNodeCell();
    Styles_StyleSheet.getNodeUnderMacro(editorCell).apply(editorCell);
    return editorCell;
  }

  private EditorCell createRefCell_9824_0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("mappingLabel");
    provider.setNoTargetText("<no mappingLabel>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new NodeMacro_postfix._Inline9824_0());
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

  private EditorCell createProperty_9824_1(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("comment");
    provider.setNoTargetText("<no comment>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_comment");
    Styles_StyleSheet.getMacroDescriptionText(editorCell).apply(editorCell);
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

  private static boolean renderingCondition9824_0(SNode node, EditorContext editorContext, IScope scope) {
    String actualRole = node.getRole_();
    String expectedRole = AttributesRolesUtil.childRoleFromAttributeRole(NodeMacro_AnnotationLink.NODE_MACRO);
    return !(actualRole.equals(expectedRole));
  }

  private static boolean renderingCondition9824_1(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "mappingLabel", false) != null;
  }

  private static boolean renderingCondition9824_2(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "comment") != null;
  }

  public static class _Inline9824_0 extends InlineCellProvider {
    public _Inline9824_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_9824_0(editorContext, node);
    }

    private EditorCell createProperty_9824_0(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name");
      Styles_StyleSheet.getMappingLabelReference(editorCell).apply(editorCell);
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
  }
}
