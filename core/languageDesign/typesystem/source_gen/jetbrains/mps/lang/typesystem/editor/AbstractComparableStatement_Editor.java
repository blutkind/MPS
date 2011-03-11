package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class AbstractComparableStatement_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_2gd5o_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_2gd5o_a_0(editorContext, node);
  }

  private EditorCell createCollection_2gd5o_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_2gd5o_a");
    editorCell.addEditorCell(this.createRefNode_2gd5o_a0(editorContext, node));
    editorCell.addEditorCell(this.createConceptProperty_2gd5o_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_2gd5o_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_2gd5o_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_2gd5o_a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_2gd5o_a_0");
    editorCell.addEditorCell(this.createCollection_2gd5o_a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_2gd5o_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_2gd5o_c0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_2gd5o_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_2gd5o_e0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_2gd5o_f0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_2gd5o_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_2gd5o_a0");
    editorCell.addEditorCell(this.createConstant_2gd5o_a0a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_2gd5o_b0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_2gd5o_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_2gd5o_b0");
    editorCell.addEditorCell(this.createConstant_2gd5o_a1a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_2gd5o_b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_2gd5o_d0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_2gd5o_d0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_2gd5o_a3a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_2gd5o_b3a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_2gd5o_f0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_2gd5o_f0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_2gd5o_a5a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_2gd5o_b5a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_2gd5o_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ";");
    editorCell.setCellId("Constant_2gd5o_d0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_2gd5o_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "node to check =");
    editorCell.setCellId("Constant_2gd5o_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_2gd5o_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "error string =");
    editorCell.setCellId("Constant_2gd5o_a1a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_2gd5o_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_2gd5o_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_2gd5o_a3a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "inference");
    editorCell.setCellId("Constant_2gd5o_a3a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_2gd5o_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_2gd5o_e0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_2gd5o_a5a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "intention to fix error");
    editorCell.setCellId("Constant_2gd5o_a5a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_2gd5o_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("leftExpression");
    provider.setNoTargetText("<no leftExpression>");
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

  private EditorCell createRefNode_2gd5o_c0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("rightExpression");
    provider.setNoTargetText("<no rightExpression>");
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

  private EditorCell createRefNode_2gd5o_b0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("nodeToCheck");
    provider.setNoTargetText("<auto>");
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

  private EditorCell createRefNode_2gd5o_b1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("errorString");
    provider.setNoTargetText("<no errorString>");
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

  private EditorCell createRefNode_2gd5o_b5a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("helginsIntention");
    provider.setNoTargetText("<no helginsIntention>");
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

  private EditorCell createProperty_2gd5o_b3a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("infer");
    provider.setNoTargetText("<no infer>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_infer");
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

  private EditorCell createConceptProperty_2gd5o_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, editorContext);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("conceptProperty_alias");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator<Color>() {
        public Color calculate(EditorCell cell) {
          return AbstractComparableStatement_Editor._StyleParameter_QueryFunction_2gd5o_a0b0((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
    }
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new AbstractComparableStatement_Editor.ReplaceWith_AbstractEquationStatement_cellMenu_a0b0_1()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private static Color _StyleParameter_QueryFunction_2gd5o_a0b0(SNode node, EditorContext editorContext) {
    if (SPropertyOperations.getBoolean(node, "checkOnly")) {
      return Color.GRAY;
    } else {
      return Color.BLACK;
    }
  }

  public static class ReplaceWith_AbstractEquationStatement_cellMenu_a0b0_1 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {
    public ReplaceWith_AbstractEquationStatement_cellMenu_a0b0_1() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.typesystem.structure.AbstractEquationStatement";
    }
  }
}
