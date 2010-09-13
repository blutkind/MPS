package jetbrains.mps.lang.core.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ExportScopeNamespace_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_p7dwc8_a(editorContext, node);
  }

  private EditorCell createCollection_p7dwc8_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_p7dwc8_a");
    editorCell.addEditorCell(this.createConstant_p7dwc8_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_p7dwc8_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_p7dwc8_c0(editorContext, node));
    editorCell.addEditorCell(this.createAttributedNodeCell_p7dwc8_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_p7dwc8_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "@export(namespace =");
    editorCell.setCellId("Constant_p7dwc8_a0");
    DeleteExportScope.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_p7dwc8_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_p7dwc8_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, new AttributeCalculator<Boolean>() {
        public Boolean calculate(EditorCell cell) {
          return ExportScopeNamespace_Editor._StyleParameter_QueryFunction_p7dwc8_a1c0((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createAttributedNodeCell_p7dwc8_d0(EditorContext editorContext, SNode node) {
    IOperationContext opContext = editorContext.getOperationContext();
    EditorManager manager = EditorManager.getInstanceFromContext(opContext);
    EditorCell editorCell = manager.getCurrentAttributedNodeCell();
    return editorCell;
  }

  private EditorCell createProperty_p7dwc8_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("namespace");
    provider.setNoTargetText("<no namespace>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_namespace");
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

  private static boolean _StyleParameter_QueryFunction_p7dwc8_a1c0(SNode node, EditorContext editorContext) {
    return (SNodeOperations.getParent(node) != null) && SNodeOperations.getParent(node).isRoot();
  }
}
