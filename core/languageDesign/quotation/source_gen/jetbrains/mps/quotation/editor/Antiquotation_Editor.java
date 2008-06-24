package jetbrains.mps.quotation.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class Antiquotation_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell17171_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell17171_0");
  }

  private static void setupBasic_ConstantCell17171_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell17171_0");
  }

  private static void setupBasic_expressionRefNodeCell17171_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell17171_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell17171_01");
  }

  private static void setupBasic_CollectionCell17171_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell17171_01");
  }

  private static void setupBasic_ConstantCell17171_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell17171_02");
  }

  private static void setupBasic_ConstantCell17171_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell17171_03");
    {
      Style inlineStyle = new Style() {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_CollectionCell17171_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell17171_02");
  }

  private static void setupBasic_ConstantCell17171_04(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell17171_04");
  }

  private static void setupBasic_ModelAccessCell17171_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ModelAccessCell17171_0");
  }

  private static void setupBasic_CollectionCell17171_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell17171_03");
  }

  private static void setupBasic_ConstantCell17171_05(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell17171_05");
  }

  private static void setupBasic_ModelAccessCell17171_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ModelAccessCell17171_01");
  }

  private static void setupLabel_ConstantCell17171_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setTextColor(_QueryFunction_Color_1196350915491(node, context));
  }

  private static void setupLabel_expressionRefNodeCell17171_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell17171_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setTextColor(_QueryFunction_Color_1196350915497(node, context));
  }

  private static void setupLabel_ConstantCell17171_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell17171_03(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell17171_04(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ModelAccessCell17171_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell17171_05(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ModelAccessCell17171_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static Color _QueryFunction_Color_1196350915491(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }

  public static Color _QueryFunction_Color_1196350915497(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell17171_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.create_CollectionCell17171_01(context, node);
  }

  public EditorCell create_CollectionCell17171_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell17171_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell17171_0(context, node, "%("));
    editorCell.addEditorCell(this.create_expressionRefNodeCell17171_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell17171_01(context, node, ")%"));
    return editorCell;
  }

  public EditorCell create_CollectionCell17171_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell17171_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell17171_02(context, node, "node antiquotation "));
    editorCell.addEditorCell(this.create_ConstantCell17171_03(context, node, ""));
    editorCell.addEditorCell(this.create_CollectionCell17171_02(context, node));
    editorCell.addEditorCell(this.create_CollectionCell17171_03(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell17171_02(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell17171_02(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell17171_04(context, node, "attributed node concept:"));
    editorCell.addEditorCell(this.create_ModelAccessCell17171_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell17171_03(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell17171_03(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell17171_05(context, node, "attributed node role in parent:"));
    editorCell.addEditorCell(this.create_ModelAccessCell17171_01(context, node));
    return editorCell;
  }

  public EditorCell create_ConstantCell17171_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell17171_0(editorCell, node, context);
    setupLabel_ConstantCell17171_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell17171_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell17171_01(editorCell, node, context);
    setupLabel_ConstantCell17171_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell17171_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell17171_02(editorCell, node, context);
    setupLabel_ConstantCell17171_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell17171_03(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell17171_03(editorCell, node, context);
    setupLabel_ConstantCell17171_03(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell17171_04(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell17171_04(editorCell, node, context);
    setupLabel_ConstantCell17171_04(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell17171_05(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell17171_05(editorCell, node, context);
    setupLabel_ConstantCell17171_05(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ModelAccessCell17171_0(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1196350915506(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    setupBasic_ModelAccessCell17171_0(editorCell, node, context);
    setupLabel_ModelAccessCell17171_0(editorCell, node, context);
    editorCell.setDefaultText("<no concept>");
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1196350915506(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        SNode parent = SNodeOperations.getParent(node, null, false, false);
        if ((SNodeOperations.getParent(node, null, false, false) != null)) {
          return SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(SNodeOperations.getParent(node, null, false, false)), "name");
        } else
        {
          return "";
        }
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return true;
      }

    };
  }

  public EditorCell create_ModelAccessCell17171_01(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1196350915543(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    setupBasic_ModelAccessCell17171_01(editorCell, node, context);
    setupLabel_ModelAccessCell17171_01(editorCell, node, context);
    editorCell.setDefaultText("<no role>");
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1196350915543(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        SNode parent = SNodeOperations.getParent(node, null, false, false);
        if ((parent != null)) {
          return parent.getRole_();
        } else
        {
          return "";
        }
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return true;
      }

    };
  }

  public EditorCell create_expressionRefNodeCell17171_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_expressionRefNodeCell17171_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_expressionRefNodeCell17171_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_expressionRefNodeCell17171_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("expression");
    provider.setNoTargetText("<expr>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_expressionRefNodeCell17171_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

}
